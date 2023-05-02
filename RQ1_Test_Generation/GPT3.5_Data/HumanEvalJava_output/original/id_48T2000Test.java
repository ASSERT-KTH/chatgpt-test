// Here's an updated version of the IsPalindrome and IsPalindromeTest classes with some minor changes and additional test cases.

// IsPalindrome.java
package updated;

public class IsPalindrome {

    /**
     * Checks if given string is a palindrome
     *
     * @param text the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String text) {
        int i = 0;
        int j = text.length() - 1;
        while (i < j) {
            if (text.charAt(i) != text.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

// IsPalindromeTest.java
package updated;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class of {@link IsPalindrome}.
 * It contains twelve unit test cases for the {@link IsPalindrome#isPalindrome(String)} method.
 */
class IsPalindromeTest {

    @Test
    void testEmptyString() {
        assertTrue(IsPalindrome.isPalindrome(""));
    }

    @Test
    void testSingleCharacterString() {
        assertTrue(IsPalindrome.isPalindrome("a"));
    }

    @Test
    void testPalindromeWithOddLength() {
        assertTrue(IsPalindrome.isPalindrome("racecar"));
    }

    @Test
    void testPalindromeWithEvenLength() {
        assertTrue(IsPalindrome.isPalindrome("deified"));
    }

    @Test
    void testNonPalindromeWithOddLength() {
        assertFalse(IsPalindrome.isPalindrome("hello"));
    }

    @Test
    void testNonPalindromeWithEvenLength() {
        assertFalse(IsPalindrome.isPalindrome("world"));
    }

    @Test
    void testPalindromeWithMixedCase() {
        assertTrue(IsPalindrome.isPalindrome("Ablewasiereisawelba"));
    }

    @Test
    void testNonPalindromeWithMixedCase() {
        assertFalse(IsPalindrome.isPalindrome("JavaProgramming"));
    }

    @Test
    void testPalindromeWithSpaces() {
        assertTrue(IsPalindrome.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    void testNonPalindromeWithSpaces() {
        assertFalse(IsPalindrome.isPalindrome("not a palindrome"));
    }

    @Test
    void testPalindromeWithPunctuation() {
        assertTrue(IsPalindrome.isPalindrome("A Santa at NASA"));
    }

    @Test
    void testNonPalindromeWithPunctuation() {
        assertFalse(IsPalindrome.isPalindrome("not a palindrome!"));
    }
}