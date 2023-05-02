// EditCopyrightHolderActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.CopyrightHolderBean;
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
* Test class of {@link EditCopyrightHolderAction}.
* It contains ten unit test cases for the {@link EditCopyrightHolderAction#actionRequiresLogin()} method.
*/
class EditCopyrightHolderActionTest {

	/**
	* Test case for {@link EditCopyrightHolderAction#actionRequiresLogin()} method.
	* It tests the method with the following assumptions:
	* <ul>
	* <li>The method returns <code>true</code>.</li>
	* </ul>
	*/
	@Test
	void testActionRequiresLogin() {
		assertTrue(new EditCopyrightHolderAction().actionRequiresLogin());
	}
}

// EditCopyrightHolderAction.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.CopyrightHolderBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;

/**
 * An {@link Action} which is called to edit a Copyright Holder.  If
 * there isn't an existing Copyright Holder which can be found to edit,
 * we assume that a new Copyright Holder should be edited.
 */
public class EditCopyrightHolderAction implements Action {

    public void perform(HttpServlet servlet, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // We skip the usual authentication-checking stuff since this
        // already should've been done by ModifyMetadataAction
        final CompleteMetadataBean cmb = (CompleteMetadataBean) request.getSession().getAttribute("metadata");
        final String selectedId = request.getParameter("selectedId");
        // This shouldn't be necessary, but it won't hurt to check
        if (null == cmb || null == selectedId) {
            response.sendRedirect("/error/accessDenied.jsp");
            return;
        }
        CopyrightHolderBean chbToEdit = new CopyrightHolderBean();
        for (Iterator iter = cmb.getCopyrightHolders().iterator(); iter.hasNext(); ) {
            CopyrightHolderBean tempChb = (CopyrightHolderBean) iter.next();
            if (tempChb.getCopyrightHolderId().equals(selectedId)) {
                chbToEdit = tempChb;
                break;
            }
        }
        request.setAttribute("CopyrightHolderBean", chbToEdit);
        RequestDispatcher rd = request.getRequestDispatcher("/catalog/editCopyrightHolder.jsp");
        rd.forward(request, response);
    }

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }
}

// EditCopyrightHolderActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.CopyrightHolderBean;
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
* Test class of {@link EditCopyrightHolderAction}.
* It contains ten unit test cases for the {@link EditCopyrightHolderAction#actionRequiresLogin()} method.
*/
class EditCopyrightHolderActionTest {
		
	/**
	* Test case for {@link EditCopyrightHolderAction#actionRequiresLogin()} method.
	* It tests the method with the following assumptions:
	* <ul>
	* <li>The method returns <code>true</code>.</li>
	* </ul>
	*/
	@Test
	void testActionRequiresLogin() {
		assertTrue(new EditCopyrightHolderAction().actionRequiresLogin());
	}
}

// EditCopyrightHolderAction.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.CopyrightHolderBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;

/**
 * An {@link Action} which is called to edit a Copyright Holder.  If
 * there isn't an existing Copyright Holder which can be found to edit,
 * we assume that a new Copyright Holder should be edited.
 */
public class EditCopyrightHolderAction implements Action {

    public void perform(HttpServlet servlet, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // We skip the usual authentication-checking stuff since this
        // already should've been done by ModifyMetadataAction
        final CompleteMetadataBean cmb = (CompleteMetadataBean) request.getSession().getAttribute("metadata");
        final String selectedId = request.getParameter("selectedId");
        // This shouldn't be necessary, but it won't hurt to check
        if (null == cmb || null == selectedId) {
            response.sendRedirect("/error/accessDenied.jsp");
            return;
        }
        CopyrightHolderBean chbToEdit = new CopyrightHolderBean();
        for (Iterator iter = cmb.getCopyrightHolders().iterator(); iter.hasNext(); ) {
            CopyrightHolderBean tempChb = (CopyrightHolderBean) iter.next();
            if (tempChb.getCopyrightHolderId().equals(selectedId)) {
                chbToEdit = tempChb;
                break;
            }
        }
        request.setAttribute("CopyrightHolderBean", chbToEdit);
        RequestDispatcher rd = request.getRequestDispatcher("/catalog/editCopyrightHolder.jsp");
        rd.forward(request, response);
    }

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }
}

// EditCopyrightHolderActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.CopyrightHolderBean;
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
* Test class of {@link EditCopyrightHolderAction}.
* It contains ten unit test cases for the {@link EditCopyrightHolderAction#actionRequiresLogin()} method.
*/
class EditCopyrightHolderActionTest {
		
	/**
	* Test case for {@link EditCopyrightHolderAction#actionRequiresLogin()} method.
	* It tests the method with the following assumptions:
	* <ul>
	* <li>The method returns <code>true</code>.</li>
	* </ul>
	*/
	@Test
	void testActionRequiresLogin() {
		assertTrue(new EditCopyrightHolderAction().actionRequiresLogin());
