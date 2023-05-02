// Here's an example of how you can test the logon() method of QSAdminAPI using JUnit 5:

package org.quickserver.net.qsadmin;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class QSAdminAPI_0Test {

    @Test
    void testLogonWithCorrectCredentials() throws IOException {
        QSAdminAPI qsAdminAPI = new QSAdminAPI("localhost", 9877);
        assertTrue(qsAdminAPI.logon("Admin", "QsAdm1n"));
        qsAdminAPI.logoff();
    }

    @Test
    void testLogonWithIncorrectUsername() throws IOException {
        QSAdminAPI qsAdminAPI = new QSAdminAPI("localhost", 9877);
        assertFalse(qsAdminAPI.logon("WrongUsername", "QsAdm1n"));
        qsAdminAPI.close();
    }

    @Test
    void testLogonWithIncorrectPassword() throws IOException {
        QSAdminAPI qsAdminAPI = new QSAdminAPI("localhost", 9877);
        assertFalse(qsAdminAPI.logon("Admin", "WrongPassword"));
        qsAdminAPI.close();
    }

    @Test
    void testLogonWithEmptyUsername() throws IOException {
        QSAdminAPI qsAdminAPI = new QSAdminAPI("localhost", 9877);
        assertFalse(qsAdminAPI.logon("", "QsAdm1n"));
        qsAdminAPI.close();
    }

    @Test
    void testLogonWithEmptyPassword() throws IOException {
        QSAdminAPI qsAdminAPI = new QSAdminAPI("localhost", 9877);
        assertFalse(qsAdminAPI.logon("Admin", ""));
        qsAdminAPI.close();
    }

    @Test
    void testLogonWithNullUsername() throws IOException {
        QSAdminAPI qsAdminAPI = new QSAdminAPI("localhost", 9877);
        assertFalse(qsAdminAPI.logon(null, "QsAdm1n"));
        qsAdminAPI.close();
    }

    @Test
    void testLogonWithNullPassword() throws IOException {
        QSAdminAPI qsAdminAPI = new QSAdminAPI("localhost", 9877);
        assertFalse(qsAdminAPI.logon("Admin", null));
        qsAdminAPI.close();
    }

    @Test
    void testLogonWithInvalidPort() throws IOException {
        QSAdminAPI qsAdminAPI = new QSAdminAPI("localhost", 1234);
        assertFalse(qsAdminAPI.logon("Admin", "QsAdm1n"));
        qsAdminAPI.close();
    }

    @Test
    void testLogonWithInvalidHost() throws IOException {
        QSAdminAPI qsAdminAPI = new QSAdminAPI("invalidhost", 9877);
        assertFalse(qsAdminAPI.logon("Admin", "QsAdm1n"));
        qsAdminAPI.close();
    }

    @Test
    void testLogonTwice() throws IOException {
        QSAdminAPI qsAdminAPI = new QSAdminAPI("localhost", 9877);
        assertTrue(qsAdminAPI.logon("Admin", "QsAdm1n"));
        assertFalse(qsAdminAPI.logon("Admin", "QsAdm1n"));
        qsAdminAPI.logoff();
    }
}