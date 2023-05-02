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
* It contains one unit test case for the {@link ModifyApprovalQueueEntryAction#actionRequiresLogin()} method.
*/
class ModifyApprovalQueueEntryActionTest {
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
        if (false == AuthenticationTools.isApprover(request) || null == approvalQueueEntryId || null == status) {
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
            // If the status is'rejected', we mark it as such in the database
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
* It contains one unit test case for the {@link ModifyApprovalQueueEntryAction#actionRequiresLogin()} method.
*/
class ModifyApprovalQueueEntryActionTest {
		
	/** The action that does the modification on the catalog and queue records. */
	private ModifyApprovalQueueEntryAction action;
	
    static {  
        AuthenticationTools.setDefaultRealm("defaultCATALOG");
    }
			
	
	/**
	 * @param action the action that does the modification on the catalog and queue records.
	 */
	public ModifyApprovalQueueEntryActionTest(ModifyApprovalQueueEntryAction action) {
		this.action = action;
	}
	
	/**
	 * {@link #isAccessDenied(HttpServletRequest) isAccessDenied()} should return <code>true</code>.
	 * @throws ServletException
	 * @throws IOException
	 * @see ModifyApprovalQueueEntryAction#actionRequiresLogin()
	 */
	@Test
	public void testIsAccessDeniedCATALOG() throws ServletException, IOException {
		// This just checks a couple of things that are expected to happen

        action.actionRequiresLogin();
		assertFalse("There should not be a catalog access denied in the application", AuthenticationTools.isAccessDenied(null));
		assertFalse("The access is denied if there isn't a catalog access denied in the application", AuthenticationTools.isAccessDenied(new HttpServletRequest()));
	}
	
	/**
	 * {@link #isApprovalPicked(HttpServletRequest, QueuedRecordBean) isApprovalPicked()} should return <code>true</code>.
	 * @throws ServletException
	 * @throws IOException
	 * @see ModifyApprovalQueueEntryAction#actionRequiresLogin()
	 */
	@Test
	public void testIsApprovalPickedCATALOG() throws ServletException, IOException {
		// this just checks a couple of things that are expected to happen

		QueueDAO queueManager = QueueDAO.getInstance(LoginTests.authenticationTools).getQueueDAO();
		QueuedRecordBean approvedByUser = queueManager.markRecordApproved("approvedByUsr");
		QueueDAO queueManager1 = QueueDAO.getInstance(LoginTests.authenticationTools).getQueueDAO();
		assertTrue("Queue should be visible and has approved items", queueManager.isQueueVisible("approvedByUsr"));
		assertFalse("Queue should not be visible after approval", queueManager1.isQueueVisible("approvedByUsr"));
		QueueDAO approvedQueue = queueManager.markRecordApproved(approvedByUser.getShortMetadata().getMetadataId());
		assertTrue("Queue should be visible and has approved items", queueManager.isQueueVisible("approvedByUsr"));
		assertTrue("Queue should be approved", queueManager1.isQueueApproved("approvedByUsr"));
		assertFalse("Queue should not be visible after approval", queueManager1.isQueueVisible("approvedByUsr"));
	}

	/**
	 * {@link #isApprovalRecovered(HttpServletRequest, QueuedRecordBean) isApprovalRecovered()} should return <code>true</code>.
	 * @throws ServletException
	 * @throws IOException
	 * @see ModifyApprovalQueueEntryAction#actionRequiresLogin()
	 */
	@Test
	public void testIsApprovalRecoveredCATALOG() throws ServletException, IOException {
		// this just checks a couple of things that are expected to happen

		QueueDAO queueManager = QueueDAO.getInstance(LoginTests.authenticationTools).getQueueDAO();
		QueuedRecordBean approvedByUser = queueManager.markRecordApproved("approvedByUsr");
		QueuedRecordBean approvedByServer = queueManager.markRecordApproved("approvedByServer");
		assertTrue("Queue should be visible and has approved items", queueManager.isQueueVisible("approvedByUsr"));
