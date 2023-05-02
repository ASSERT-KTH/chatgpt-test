// SplitWordsTest.java
package original;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SplitWords}.
* It contains ten unit test cases for the {@link SplitWords#splitWords(String)} method.
*/
class SplitWordsTest {
    
    @Test
    void testSplitWordsWithSpaces() {
        String txt = "Hello world!";
        Object expected = Arrays.asList("Hello", "world!");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithCommas() {
        String txt = "Hello,world!";
        Object expected = Arrays.asList("Hello", "world!");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithSpacesAndCommas() {
        String txt = "Hello world,!";
        Object expected = Arrays.asList("Hello", "world,!");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithMultipleCommas() {
        String txt = "Hello,Hello,world !";
        Object expected = Arrays.asList("Hello,Hello,world", "!");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithOnlyLowerCaseLetters() {
        String txt = "abcdef";
        Object expected = 3;
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithOnlyLowerCaseLettersAndDuplicates() {
        String txt = "aaabb";
        Object expected = 2;
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithLowerCaseAndUpperCaseLetters() {
        String txt = "aaaBb";
        Object expected = 1;
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithEmptyString() {
        String txt = "";
        Object expected = 0;
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithNullString() {
        String txt = null;
        assertThrows(NullPointerException.class, () -> {
            SplitWords.splitWords(txt);
        });
    }
    
    @Test
    void testSplitWordsWithWhiteSpaceString() {
        String txt = "   ";
        Object expected = Arrays.asList("");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
}