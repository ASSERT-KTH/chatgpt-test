// Here's an example implementation of the StrlenTest class with ten unit test cases for the Strlen class.

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StrlenTest {

    @Test
    void testEmptyString() {
        assertEquals(0, Strlen.strlen(""));
    }

    @Test
    void testSingleCharacterString() {
        assertEquals(1, Strlen.strlen("x"));
    }

    @Test
    void testMultipleCharacterString() {
        assertEquals(3, Strlen.strlen("abc"));
    }

    @Test
    void testLongString() {
        assertEquals(9, Strlen.strlen("asdasnakj"));
    }

    @Test
    void testNullString() {
        assertThrows(NullPointerException.class, () -> {
            Strlen.strlen(null);
        });
    }

    @Test
    void testWhitespaceString() {
        assertEquals(5, Strlen.strlen("  \t\n\r\f"));
    }

    @Test
    void testUnicodeString() {
        assertEquals(4, Strlen.strlen("😀😁😂😃"));
    }

    @Test
    void testUpperCaseString() {
        assertEquals(6, Strlen.strlen("HELLO "));
    }

    @Test
    void testLowerCaseString() {
        assertEquals(6, Strlen.strlen(" world"));
    }

    @Test
    void testMixedCaseString() {
        assertEquals(11, Strlen.strlen("Hello World"));
    }
}