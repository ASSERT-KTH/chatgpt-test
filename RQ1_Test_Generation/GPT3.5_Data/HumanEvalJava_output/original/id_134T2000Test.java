// CheckIfLastCharIsALetterTest.java
package updated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link CheckIfLastCharIsALetter}.
 * It contains ten unit test cases for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
 */
class CheckIfLastCharIsALetterTest {

    @Test
    void testEmptyString() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(""));
    }

    @Test
    void testSingleLetter() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A"));
    }

    @Test
    void testSingleNonLetter() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("1"));
    }

    @Test
    void testSingleLetterInWord() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple"));
    }

    @Test
    void testSingleNonLetterInWord() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple1"));
    }

    @Test
    void testLetterWithSpace() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A "));
    }

    @Test
    void testNonLetterWithSpace() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("1 "));
    }

    @Test
    void testLetterWithMultipleSpaces() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A  "));
    }

    @Test
    void testNonLetterWithMultipleSpaces() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("1  "));
    }

    @Test
    void testLetterNotPartOfWord() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e "));
    }

    @Test
    void testLetterPartOfWord() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pie"));
    }

    @Test
    void testNonLetterNotPartOfWord() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi 1 "));
    }

    @Test
    void testNonLetterPartOfWord() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pie1"));
    }
}

// CheckIfLastCharIsALetter.java
package updated;

class CheckIfLastCharIsALetter {

    /**
     * * Create a function that returns True if the last character
     * of a given string is an alphabetical character and is not
     * a part of a word, and False otherwise.
     * Note: "word" is a group of characters separated by space.
     *
     * Examples:
     * checkIfLastCharIsALetter("apple pie") ➞ False
     * checkIfLastCharIsALetter("apple pi e") ➞ True
     * checkIfLastCharIsALetter("apple pi e ") ➞ False
     * checkIfLastCharIsALetter("") ➞ False
     *
     * > checkIfLastCharIsALetter("apple")
     * false
     * > checkIfLastCharIsALetter("apple pi e")
     * true
     * > checkIfLastCharIsALetter("eeeee")
     * false
     * > checkIfLastCharIsALetter("A")
     * true
     * > checkIfLastCharIsALetter("Pumpkin pie ")
     * false
     * > checkIfLastCharIsALetter("Pumpkin pie 1")
     * false
     * > checkIfLastCharIsALetter("")
     * false
     * > checkIfLastCharIsALetter("eeeee e ")
     * false
     * > checkIfLastCharIsALetter("apple pie")
     * false
     * > checkIfLastCharIsALetter("apple pi e ")
     * false
     */
    public static boolean checkIfLastCharIsALetter(String txt) {
        if (txt.length() == 0) {
            return false;
        }
        char lastChar = txt.charAt(txt.length() - 1);
        if (Character.isLetter(lastChar)) {
            if (txt.length() == 1) {
                return true;
            }
            char secondLastChar = txt.charAt(txt.length() - 2);
            if (Character.isLetter(secondLastChar)) {
                return false;
            }
            if (secondLastChar == ' ') {
                return true;
            }
        }
        return false;
    }
}