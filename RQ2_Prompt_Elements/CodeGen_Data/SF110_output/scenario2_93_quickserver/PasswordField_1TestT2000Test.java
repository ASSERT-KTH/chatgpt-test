// PasswordField_1Test.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PasswordField}.
* It contains one unit test case for the {@link PasswordField#getPassword(InputStream, String)} method.
*/
class PasswordField_1Test {
// PasswordField.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;

/**
 * This class prompts the user for a password and attempts to mask
 * input.
 *
 * @since 1.4
 */
public class PasswordField {

    /**
     * @param in input stream to be used (e.g. System.in)
     * @param prompt The prompt to display to the user.
     * @return The password as entered by the user.
     */
    public static final char[] getPassword(InputStream in, String prompt) throws IOException {
        MaskingThread maskingthread = new MaskingThread(prompt);
        Thread thread = new Thread(maskingthread);
        thread.start();
        char[] lineBuffer;
        char[] buf;
        int i;
        buf = lineBuffer = new char[128];
        int room = buf.length;
        int offset = 0;
        int c;
        loop: while (true) {
            c = in.read();
            switch(c) {
                case -1:
                case '\n':
                    break loop;
                case '\r':
                    int c2 = in.read();
                    if ((c2!= '\n') && (c2!= -1)) {
                        if (!(in instanceof PushbackInputStream)) {
                            in = new PushbackInputStream(in);
                        }
                        ((PushbackInputStream) in).unread(c2);
                    } else {
                        break loop;
                    }
                default:
                    if (--room < 0) {
                        buf = new char[offset + 128];
                        room = buf.length - offset - 1;
                        System.arraycopy(lineBuffer, 0, buf, 0, offset);
                        Arrays.fill(lineBuffer,'');
                        lineBuffer = buf;
                    }
                    buf[offset++] = (char) c;
                    break;
            }
        }
        maskingthread.stopMasking();
        System.out.print("\010");
        //Code to clear doskey on win nt/2000 - Alt+F7
        String os = System.getProperty("os.name");
        if (os!= null && os.toLowerCase().startsWith("windows")) {
            try {
                java.awt.Robot robot = new java.awt.Robot();
                robot.keyPress(java.awt.event.KeyEvent.VK_ALT);
                robot.keyPress(java.awt.event.KeyEvent.VK_F7);
                robot.keyRelease(java.awt.event.KeyEvent.VK_F7);
                robot.keyRelease(java.awt.event.KeyEvent.VK_ALT);
            } catch (Exception ignore) {
                logger.warning("Could not clears command history: " + ignore);
            }
        }
        if (offset == 0) {
            return null;
        }
        char[] ret = new char[offset];
        System.arraycopy(buf, 0, ret, 0, offset);
        Arrays.fill(buf,'');
        return ret;
    }
}

// PasswordField_1Test.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PasswordField}.
* It contains one unit test case for the {@link PasswordField#getPassword(InputStream, String)} method.
*/
class PasswordField_1Test {
		private static final String DEFAULT_PASSWD = "";
		private static final Logger logger = Logger.getLogger(PasswordField_1Test.class.getName());
		private static String defaultPassword;
		
		@Test
		public void test() {
			password = DEFAULT_PASSWD;
			password2 = new PasswordField(password).getPassword(System.in, "Password must be more or less \n1.2\n<2\n<3");
//			password = DEFAULT_PASSWD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password = DEFAULT_PASSWD; 
//			password = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;
			password2 = PASSESSION_CONSTANT_USER_PASSWORD;

			DefaultInputStreamReader in = new DefaultInputStreamReader