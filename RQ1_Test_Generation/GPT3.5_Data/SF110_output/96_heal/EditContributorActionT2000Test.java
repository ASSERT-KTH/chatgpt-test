// EditContributorActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.ContributorBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EditContributorAction}.
* It contains ten unit test cases for the {@link EditContributorAction#actionRequiresLogin()} method.
*/
class EditContributorActionTest {
    
    /**
     * Test case to check if actionRequiresLogin() returns true.
     */
    @Test
    void testActionRequiresLogin() {
        EditContributorAction editContributorAction = new EditContributorAction();
        assertTrue(editContributorAction.actionRequiresLogin());
    }
    
    /**
     * Test case to check if actionRequiresLogin() returns true when called multiple times.
     */
    @Test
    void testActionRequiresLoginMultipleCalls() {
        EditContributorAction editContributorAction = new EditContributorAction();
        assertTrue(editContributorAction.actionRequiresLogin());
        assertTrue(editContributorAction.actionRequiresLogin());
        assertTrue(editContributorAction.actionRequiresLogin());
    }
    
    /**
     * Test case to check if actionRequiresLogin() returns false when overridden.
     */
    @Test
    void testActionRequiresLoginOverride() {
        EditContributorAction editContributorAction = new EditContributorAction() {
            @Override
            public boolean actionRequiresLogin() {
                return false;
            }
        };
        assertFalse(editContributorAction.actionRequiresLogin());
    }
    
    /**
     * Test case to check if actionRequiresLogin() returns true when overridden and called multiple times.
     */
    @Test
    void testActionRequiresLoginOverrideMultipleCalls() {
        EditContributorAction editContributorAction = new EditContributorAction() {
            @Override
            public boolean actionRequiresLogin() {
                return false;
            }
        };
        assertFalse(editContributorAction.actionRequiresLogin());
        assertFalse(editContributorAction.actionRequiresLogin());
        assertFalse(editContributorAction.actionRequiresLogin());
    }
    
    /**
     * Test case to check if actionRequiresLogin() returns true when metadata and selectedId are null.
     */
    @Test
    void testActionRequiresLoginNullMetadataAndSelectedId() {
        EditContributorAction editContributorAction = new EditContributorAction();
        HttpServlet servlet = new HttpServlet();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        IOException ioException = assertThrows(IOException.class, () -> {
            editContributorAction.perform(servlet, request, response);
        });
        assertEquals("null", ioException.getMessage());
    }
    
    /**
     * Test case to check if actionRequiresLogin() returns true when metadata is null.
     */
    @Test
    void testActionRequiresLoginNullMetadata() {
        EditContributorAction editContributorAction = new EditContributorAction();
        HttpServlet servlet = new HttpServlet();
        HttpServletRequest request = new HttpServletRequest() {
            @Override
            public String getParameter(String name) {
                return "selectedId";
            }
        };
        HttpServletResponse response = null;
        IOException ioException = assertThrows(IOException.class, () -> {
            editContributorAction.perform(servlet, request, response);
        });
        assertEquals("null", ioException.getMessage());
    }
    
    /**
     * Test case to check if actionRequiresLogin() returns true when selectedId is null.
     */
    @Test
    void testActionRequiresLoginNullSelectedId() {
        EditContributorAction editContributorAction = new EditContributorAction();
        HttpServlet servlet = new HttpServlet();
        HttpServletRequest request = new HttpServletRequest() {
            @Override
            public Object getSession(boolean create) {
                return new Object();
            }
        };
        HttpServletResponse response = null;
        IOException ioException = assertThrows(IOException.class, () -> {
            editContributorAction.perform(servlet, request, response);
        });
        assertEquals("null", ioException.getMessage());
    }
    
    /**
     * Test case to check if actionRequiresLogin() returns true when metadata and selectedId are not null.
     */
    @Test
    void testActionRequiresLoginNonNullMetadataAndSelectedId() throws IOException, ServletException {
        EditContributorAction editContributorAction = new EditContributorAction();
        HttpServlet servlet = new HttpServlet();
        HttpServletRequest request = new HttpServletRequest() {
            @Override
            public Object getSession(boolean create) {
                return new Object();
            }
            @Override
            public Object getAttribute(String name) {
                if(name.equals("metadata")) {
                    return new CompleteMetadataBean();
                } else {
                    return null;
                }
            }
            @Override
            public String getParameter(String name) {
                return "selectedId";
            }
        };
        HttpServletResponse response = null;
        editContributorAction.perform(servlet, request, response);
        assertNotNull(request.getAttribute("ContributorBean"));
    }
    
    /**
     * Test case to check if actionRequiresLogin() returns true when metadata and selectedId are not null but selectedId is not found.
     */
    @Test
    void testActionRequiresLoginNonNullMetadataAndSelectedIdNotFound() throws IOException, ServletException {
        EditContributorAction editContributorAction = new EditContributorAction();
        HttpServlet servlet = new HttpServlet();
        HttpServletRequest request = new HttpServletRequest() {
            @Override
            public Object getSession(boolean create) {
                return new Object();
            }
            @Override
            public Object getAttribute(String name) {
                if(name.equals("metadata")) {
                    CompleteMetadataBean completeMetadataBean = new CompleteMetadataBean();
                    ContributorBean contributorBean = new ContributorBean();
                    contributorBean.setContributorId("contributorId");
                    completeMetadataBean.getContributorList().add(contributorBean);
                    return completeMetadataBean;
                } else {
                    return null;
                }
            }
            @Override
            public String getParameter(String name) {
                return "selectedIdNotFound";
            }
        };
        HttpServletResponse response = null;
        editContributorAction.perform(servlet, request, response);
        assertNotNull(request.getAttribute("ContributorBean"));
    }
}