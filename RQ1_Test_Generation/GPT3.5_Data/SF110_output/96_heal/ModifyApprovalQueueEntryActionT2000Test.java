// ModifyApprovalQueueEntryAction.java
package org.heal.servlet.approver;

import org.heal.module.catalog.QueueDAO;
import org.heal.module.catalog.QueuedRecordBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Modifies an approval queue entry.
 *
 * @author Brad Schaefer (<A HREF="mailto:schaefer@lib.med.utah.edu">schaefer@lib.med.utah.edu</A>)
 */
public class ModifyApprovalQueueEntryAction implements Action {

    public void perform(HttpServlet servlet, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        final String approvalQueueEntryId = request.getParameter("approvalQueueEntryId");
        final String status = request.getParameter("status");
        if (!AuthenticationTools.isApprover(request) || approvalQueueEntryId == null || status == null) {
            // The user does not have the access to view this page
            // or an Approval Queue entry id or status is missing
            // so we go no further, and redirect them to an access denied page
            // TODO instead of hardcoding page locations, this should be in config files somewhere
            response.sendRedirect("/error/accessDenied.jsp");
            return;
        }
        // Creates an QueuedRecordBean based on the form data
        final QueuedRecordBean approvalEntry = new QueuedRecordBean();
        approvalEntry.setQueuedRecordId(approvalQueueEntryId);
        approvalEntry.setComments(request.getParameter("comment"));
        approvalEntry.getShortMetadata().setMetadataId(request.getParameter("metadataId"));
        approvalEntry.setStatus(status);
        final QueueDAO queueManager = (QueueDAO) servlet.getServletContext().getAttribute("QueueDAO");
        final String statusTest = status.toLowerCase();
        if ("waiting".equals(statusTest)) {
            // If the status is 'waiting', then we just save the approval queue entry
            approvalEntry.setType(QueueDAO.TYPE_APPROVAL);
            queueManager.saveQueuedRecord(approvalEntry);
        } else if ("approved".equals(statusTest)) {
            approvalEntry.setType(QueueDAO.TYPE_CATALOG);
            approvalEntry.setStatus("Waiting");
            queueManager.markRecordApproved(approvalEntry.getShortMetadata().getMetadataId());
            queueManager.saveQueuedRecord(approvalEntry);
        } else if ("rejected".equals(statusTest)) {
            // If the status is 'rejected', we mark it as such in the database
            queueManager.rejectRecord(approvalEntry.getShortMetadata().getMetadataId());
            queueManager.dequeue(approvalEntry.getQueuedRecordId());
        }
        // TODO instead of hardcoding page locations, this should be in config files somewhere
        response.sendRedirect("showApprovalQueue");
    }

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }
}

// ModifyApprovalQueueEntryActionTest.java
package org.heal.servlet.approver;

import org.heal.module.catalog.QueueDAO;
import org.heal.module.catalog.QueuedRecordBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifyApprovalQueueEntryAction}.
* It contains ten unit test cases for the {@link ModifyApprovalQueueEntryAction#actionRequiresLogin()} method.
*/
class ModifyApprovalQueueEntryActionTest {
    
    @Test
    void testActionRequiresLogin() {
        ModifyApprovalQueueEntryAction action = new ModifyApprovalQueueEntryAction();
        assertTrue(action.actionRequiresLogin());
    }
    
    @Test
    void testActionDoesNotRequireLogin() {
        ModifyApprovalQueueEntryAction action = new ModifyApprovalQueueEntryAction();
        assertFalse(action.actionRequiresLogin());
    }
    
    @Test
    void testActionRequiresLoginWithNullRequest() {
        ModifyApprovalQueueEntryAction action = new ModifyApprovalQueueEntryAction();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        assertThrows(NullPointerException.class, () -> {
            action.perform(new HttpServlet(), request, response);
        });
    }
    
    @Test
    void testActionRequiresLoginWithNullApprovalQueueEntryId() {
        ModifyApprovalQueueEntryAction action = new ModifyApprovalQueueEntryAction();
        HttpServletRequest request = new MockHttpServletRequest("status", "approved");
        HttpServletResponse response = new MockHttpServletResponse();
        assertThrows(NullPointerException.class, () -> {
            action.perform(new HttpServlet(), request, response);
        });
    }
    
    @Test
    void testActionRequiresLoginWithNullStatus() {
        ModifyApprovalQueueEntryAction action = new ModifyApprovalQueueEntryAction();
        HttpServletRequest request = new MockHttpServletRequest("approvalQueueEntryId", "123");
        HttpServletResponse response = new MockHttpServletResponse();
        assertThrows(NullPointerException.class, () -> {
            action.perform(new HttpServlet(), request, response);
        });
    }
    
    @Test
    void testActionRequiresLoginWithInvalidUser() throws ServletException, IOException {
        ModifyApprovalQueueEntryAction action = new ModifyApprovalQueueEntryAction();
        HttpServletRequest request = new MockHttpServletRequest("approvalQueueEntryId", "123", "status", "approved");
        HttpServletResponse response = new MockHttpServletResponse();
        AuthenticationTools.setApprover(false, request);
        action.perform(new HttpServlet(), request, response);
        assertEquals("/error/accessDenied.jsp", response.getRedirectedUrl());
    }
    
    @Test
    void testActionRequiresLoginWithValidUser() throws ServletException, IOException {
        ModifyApprovalQueueEntryAction action = new ModifyApprovalQueueEntryAction();
        HttpServletRequest request = new MockHttpServletRequest("approvalQueueEntryId", "123", "status", "approved");
        HttpServletResponse response = new MockHttpServletResponse();
        AuthenticationTools.setApprover(true, request);
        action.perform(new HttpServlet(), request, response);
        assertEquals("showApprovalQueue", response.getRedirectedUrl());
    }
    
    @Test
    void testActionRequiresLoginWithWaitingStatus() throws ServletException, IOException {
        ModifyApprovalQueueEntryAction action = new ModifyApprovalQueueEntryAction();
        HttpServletRequest request = new MockHttpServletRequest("approvalQueueEntryId", "123", "status", "waiting");
        HttpServletResponse response = new MockHttpServletResponse();
        AuthenticationTools.setApprover(true, request);
        QueueDAO queueManager = new MockQueueDAO();
        HttpServlet servlet = new HttpServlet() {
            public Object getServletContext() {
                return new Object() {
                    public Object getAttribute(String name) {
                        return queueManager;
                    }
                };
            }
        };
        action.perform(servlet, request, response);
        assertEquals(QueueDAO.TYPE_APPROVAL, queueManager.getQueuedRecord().getType());
    }
    
    @Test
    void testActionRequiresLoginWithApprovedStatus() throws ServletException, IOException {
        ModifyApprovalQueueEntryAction action = new ModifyApprovalQueueEntryAction();
        HttpServletRequest request = new MockHttpServletRequest("approvalQueueEntryId", "123", "status", "approved", "metadataId", "456", "comment", "test comment");
        HttpServletResponse response = new MockHttpServletResponse();
        AuthenticationTools.setApprover(true, request);
        QueueDAO queueManager = new MockQueueDAO();
        HttpServlet servlet = new HttpServlet() {
            public Object getServletContext() {
                return new Object() {
                    public Object getAttribute(String name) {
                        return queueManager;
                    }
                };
            }
        };
        action.perform(servlet, request, response);
        assertEquals(QueueDAO.TYPE_CATALOG, queueManager.getQueuedRecord().getType());
        assertEquals("Waiting", queueManager.getQueuedRecord().getStatus());
        assertEquals("456", queueManager.getQueuedRecord().getShortMetadata().getMetadataId());
        assertEquals("test comment", queueManager.getQueuedRecord().getComments());
    }
    
    @Test
    void testActionRequiresLoginWithRejectedStatus() throws ServletException, IOException {
        ModifyApprovalQueueEntryAction action = new ModifyApprovalQueueEntryAction();
        HttpServletRequest request = new MockHttpServletRequest("approvalQueueEntryId", "123", "status", "rejected", "metadataId", "456");
        HttpServletResponse response = new MockHttpServletResponse();
        AuthenticationTools.setApprover(true, request);
        QueueDAO queueManager = new MockQueueDAO();
        HttpServlet servlet = new HttpServlet() {
            public Object getServletContext() {
                return new Object() {
                    public Object getAttribute(String name) {
                        return queueManager;
                    }
                };
            }
        };
        action.perform(servlet, request, response);
        assertNull(queueManager.getQueuedRecord());
    }
}

// MockHttpServletRequest.java
package org.heal.servlet.approver;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * A mock implementation of {@link HttpServletRequest} for testing purposes.
 */
public class MockHttpServletRequest implements HttpServletRequest {
    
    private final Map<String, String> parameters = new HashMap<>();
    
    public MockHttpServletRequest(String... params) {
        for (int i = 0; i < params.length; i += 2) {
            parameters.put(params[i], params[i + 1]);
        }
    }
    
    @Override
    public String getParameter(String name) {
        return parameters.get(name);
    }
    
    // Other methods of HttpServletRequest interface are not implemented for testing purposes
}

// MockHttpServletResponse.java
package org.heal.servlet.approver;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * A mock