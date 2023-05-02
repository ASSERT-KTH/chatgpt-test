// MakePalindromeTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link MakePalindrome}.
 * It contains ten unit test cases for the {@link MakePalindrome#makePalindrome(String)} method.
 */
class MakePalindromeTest {

    @Test
    void testEmptyString() {
        assertEquals("", MakePalindrome.makePalindrome(""));
    }

    @Test
    void testSingleCharacterString() {
        assertEquals("x", MakePalindrome.makePalindrome("x"));
    }

    @Test
    void testTwoCharacterString() {
        assertEquals("xyx", MakePalindrome.makePalindrome("xy"));
    }

    @Test
    void testThreeCharacterString() {
        assertEquals("xyzyx", MakePalindrome.makePalindrome("xyz"));
    }

    @Test
    void testFourCharacterString() {
        assertEquals("catac", MakePalindrome.makePalindrome("cata"));
    }

    @Test
    void testFiveCharacterString() {
        assertEquals("catac", MakePalindrome.makePalindrome("cat"));
    }

    @Test
    void testSixCharacterString() {
        assertEquals("jerryrrej", MakePalindrome.makePalindrome("jerry"));
    }

    @Test
    void testSevenCharacterString() {
        assertEquals("racecar", MakePalindrome.makePalindrome("race"));
    }

    @Test
    void testEightCharacterString() {
        assertEquals("deified", MakePalindrome.makePalindrome("dei"));
    }

    @Test
    void testNineCharacterString() {
        assertEquals("level", MakePalindrome.makePalindrome("lev"));
    }
}