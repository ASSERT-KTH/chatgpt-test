// PasswordField_0Test.java
package org.quickserver.util.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link PasswordField}.
 * It contains ten unit test cases for the {@link PasswordField#getPassword(String)} method.
 */
class PasswordField_0Test {

    @Test
    void testGetPassword() throws IOException {
        String input = "password\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        char[] password = PasswordField.getPassword(in, "Enter password: ");
        assertTrue(Arrays.equals(password, "password".toCharArray()));
    }

    @Test
    void testGetPasswordEmpty() throws IOException {
        String input = "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        char[] password = PasswordField.getPassword(in, "Enter password: ");
        assertNull(password);
    }

    @Test
    void testGetPasswordSingleChar() throws IOException {
        String input = "p\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        char[] password = PasswordField.getPassword(in, "Enter password: ");
        assertTrue(Arrays.equals(password, "p".toCharArray()));
    }

    @Test
    void testGetPasswordMultipleChars() throws IOException {
        String input = "password123\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        char[] password = PasswordField.getPassword(in, "Enter password: ");
        assertTrue(Arrays.equals(password, "password123".toCharArray()));
    }

    @Test
    void testGetPasswordSpecialChars() throws IOException {
        String input = "!@#$%^&*()\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        char[] password = PasswordField.getPassword(in, "Enter password: ");
        assertTrue(Arrays.equals(password, "!@#$%^&*()".toCharArray()));
    }

    @Test
    void testGetPasswordWithSpaces() throws IOException {
        String input = "password with spaces\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        char[] password = PasswordField.getPassword(in, "Enter password: ");
        assertTrue(Arrays.equals(password, "password with spaces".toCharArray()));
    }

    @Test
    void testGetPasswordWithTabs() throws IOException {
        String input = "password\twith\ttabs\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        char[] password = PasswordField.getPassword(in, "Enter password: ");
        assertTrue(Arrays.equals(password, "password\twith\ttabs".toCharArray()));
    }

    @Test
    void testGetPasswordWithNewLines() throws IOException {
        String input = "password\nwith\nnew\nlines\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        char[] password = PasswordField.getPassword(in, "Enter password: ");
        assertTrue(Arrays.equals(password, "password\nwith\nnew\nlines".toCharArray()));
    }

    @Test
    void testGetPasswordWithCarriageReturn() throws IOException {
        String input = "password\rwith\rcarriage\rreturn\r";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        char[] password = PasswordField.getPassword(in, "Enter password: ");
        assertTrue(Arrays.equals(password, "password\rwith\rcarriage\rreturn".toCharArray()));
    }

    @Test
    void testGetPasswordWithMixedChars() throws IOException {
        String input = "p@ssw0rd\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        char[] password = PasswordField.getPassword(in, "Enter password: ");
        assertTrue(Arrays.equals(password, "p@ssw0rd".toCharArray()));
    }
}