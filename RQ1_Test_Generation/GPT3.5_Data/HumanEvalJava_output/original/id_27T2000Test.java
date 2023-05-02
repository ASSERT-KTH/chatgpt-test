// FlipCase.java
package updated;

public class FlipCase {

    /**
     * For a given string, flip lowercase characters to uppercase and uppercase to lowercase.
     *
     * > flipCase("Hello")
     * "hELLO"
     * > flipCase("")
     * ""
     * > flipCase("Hello!")
     * "hELLO!"
     * > flipCase("These violent delights have violent ends")
     * "tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS"
     */
    public static String flipCase(String string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}

// FlipCaseTest.java
package updated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FlipCase}.
* It contains ten unit test cases for the {@link FlipCase#flipCase(String)} method.
*/
class FlipCaseTest {
    
    @Test
    void testEmptyString() {
        assertEquals("", FlipCase.flipCase(""));
    }
    
    @Test
    void testAllUppercase() {
        assertEquals("hELLO", FlipCase.flipCase("Hello"));
    }
    
    @Test
    void testAllLowercase() {
        assertEquals("HELLO", FlipCase.flipCase("hello"));
    }
    
    @Test
    void testMixedCase() {
        assertEquals("hELLO!", FlipCase.flipCase("Hello!"));
    }
    
    @Test
    void testNonAlphabeticCharacters() {
        assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS", FlipCase.flipCase("These violent delights have violent ends"));
    }
    
    @Test
    void testNumbers() {
        assertEquals("12345", FlipCase.flipCase("12345"));
    }
    
    @Test
    void testSpecialCharacters() {
        assertEquals("!@#$%", FlipCase.flipCase("!@#$%"));
    }
    
    @Test
    void testWhitespace() {
        assertEquals("hELLO wORLD", FlipCase.flipCase("Hello World"));
    }
    
    @Test
    void testNullString() {
        assertThrows(NullPointerException.class, () -> FlipCase.flipCase(null));
    }
    
    @Test
    void testPerformance() {
        String longString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        longString = longString.repeat(100000);
        long startTime = System.currentTimeMillis();
        FlipCase.flipCase(longString);
        long endTime = System.currentTimeMillis();
        assertTrue(endTime - startTime < 1000);
    }
}