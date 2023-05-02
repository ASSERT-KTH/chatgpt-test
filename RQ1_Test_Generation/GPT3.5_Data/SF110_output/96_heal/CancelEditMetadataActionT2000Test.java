// Test cases for CancelEditMetadataAction#actionRequiresLogin()
class CancelEditMetadataActionTest {

    @Test
    void testActionRequiresLogin() {
        Action action = new CancelEditMetadataAction();
        assertFalse(action.actionRequiresLogin());
    }

    @Test
    void testActionRequiresLoginWithAuthentication() {
        HttpServletRequest request = mock(HttpServletRequest.class);
        when(AuthenticationTools.isCataloger(request)).thenReturn(true);

        Action action = new CancelEditMetadataAction();
        assertTrue(action.actionRequiresLogin());
    }

    @Test
    void testActionRequiresLoginWithNullSession() {
        HttpServletRequest request = mock(HttpServletRequest.class);
        when(AuthenticationTools.isCataloger(request)).thenReturn(false);
        when(request.getSession(false)).thenReturn(null);

        Action action = new CancelEditMetadataAction();
        assertFalse(action.actionRequiresLogin());
    }

    @Test
    void testActionRequiresLoginWithNonNullSession() {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpSession session = mock(HttpSession.class);
        when(AuthenticationTools.isCataloger(request)).thenReturn(false);
        when(request.getSession(false)).thenReturn(session);

        Action action = new CancelEditMetadataAction();
        assertTrue(action.actionRequiresLogin());
    }

    @Test
    void testActionRequiresLoginWithNullMetadata() {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpSession session = mock(HttpSession.class);
        when(AuthenticationTools.isCataloger(request)).thenReturn(false);
        when(request.getSession(false)).thenReturn(session);
        when(session.getAttribute("metadata")).thenReturn(null);

        Action action = new CancelEditMetadataAction();
        assertFalse(action.actionRequiresLogin());
    }

    @Test
    void testActionRequiresLoginWithNonNullMetadata() {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpSession session = mock(HttpSession.class);
        when(AuthenticationTools.isCataloger(request)).thenReturn(false);
        when(request.getSession(false)).thenReturn(session);
        when(session.getAttribute("metadata")).thenReturn(new Object());

        Action action = new CancelEditMetadataAction();
        assertTrue(action.actionRequiresLogin());
    }

    @Test
    void testActionRequiresLoginWithAccessDenied() throws IOException, ServletException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        RequestDispatcher rd = mock(RequestDispatcher.class);
        when(AuthenticationTools.isCataloger(request)).thenReturn(false);
        when(request.getSession(false)).thenReturn(session);
        when(session.getAttribute("metadata")).thenReturn(new Object());
        when(request.getRequestDispatcher("/error/accessDenied.jsp")).thenReturn(rd);

        Action action = new CancelEditMetadataAction();
        assertFalse(action.actionRequiresLogin());
        action.perform(mock(HttpServlet.class), request, response);
        verify(response).sendRedirect("/error/accessDenied.jsp");
        verify(rd, never()).forward(request, response);
    }

    @Test
    void testActionRequiresLoginWithEditCancelled() throws IOException, ServletException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        RequestDispatcher rd = mock(RequestDispatcher.class);
        when(AuthenticationTools.isCataloger(request)).thenReturn(false);
        when(request.getSession(false)).thenReturn(session);
        when(session.getAttribute("metadata")).thenReturn(null);
        when(request.getRequestDispatcher("/catalog/editCancelled.jsp")).thenReturn(rd);

        Action action = new CancelEditMetadataAction();
        assertFalse(action.actionRequiresLogin());
        action.perform(mock(HttpServlet.class), request, response);
        verify(rd).forward(request, response);
        verify(response, never()).sendRedirect(anyString());
    }
}