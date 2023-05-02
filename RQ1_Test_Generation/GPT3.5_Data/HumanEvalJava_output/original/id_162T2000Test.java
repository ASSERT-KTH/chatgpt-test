// StringToMd5.java
package updated;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class StringToMd5 {

    /**
     * Given a string 'text', return its md5 hash equivalent string.
     * If 'text' is an empty string, return null.
     *
     * >>> stringToMd5('Hello world') == '3e25960a79dbc69b674cd4ec67a72c62'
     *
     * > stringToMd5("Hello world")
     * "3e25960a79dbc69b674cd4ec67a72c62"
     * > stringToMd5("")
     * null
     * > stringToMd5("A B C")
     * "0ef78513b0cb8cef12743f5aeb35f888"
     * > stringToMd5("password")
     * "5f4dcc3b5aa765d61d8327deb882cf99"
     */
    public static String stringToMd5(String text) {
        if (text == null || text.equals("")) {
            return null;
        }
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(text.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashText = number.toString(16);
            while (hashText.length() < 32) {
                hashText = "0" + hashText;
            }
            return hashText;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}

// StringToMd5Test.java
package updated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringToMd5}.
* It contains ten unit test cases for the {@link StringToMd5#stringToMd5(String)} method.
*/
class StringToMd5Test {
    
    @Test
    void testStringToMd5() {
        assertEquals("3e25960a79dbc69b674cd4ec67a72c62", StringToMd5.stringToMd5("Hello world"));
        assertNull(StringToMd5.stringToMd5(""));
        assertEquals("0ef78513b0cb8cef12743f5aeb35f888", StringToMd5.stringToMd5("A B C"));
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
        assertEquals("d41d8cd98f00b204e9800998ecf8427e", StringToMd5.stringToMd5(null));
    }
}