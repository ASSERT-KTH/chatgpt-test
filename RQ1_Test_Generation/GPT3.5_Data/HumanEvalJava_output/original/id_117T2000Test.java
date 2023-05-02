// SelectWords.java
package original;

import java.util.ArrayList;
import java.util.List;

class SelectWords {

    /**
     * Given a string s and a natural number n, you have been tasked to implement
     * a function that returns a list of all words from string s that contain exactly
     * n consonants, in order these words appear in the string s.
     * If the string s is empty then the function should return an empty list.
     * Note: you may assume the input string contains only letters and spaces.
     * Examples:
     * selectWords("Mary had a little lamb", 4) ==> ["little"]
     * selectWords("Mary had a little lamb", 3) ==> ["Mary", "lamb"]
     * selectWords("simple white space", 2) ==> []
     * selectWords("Hello world", 4) ==> ["world"]
     * selectWords("Uncle sam", 3) ==> ["Uncle"]
     *
     * > selectWords("Mary had a little lamb", 4)
     * ["little"]
     * > selectWords("Mary had a little lamb", 3)
     * ["Mary", "lamb"]
     * > selectWords("simple white space", 2)
     * []
     * > selectWords("Hello world", 4)
     * ["world"]
     * > selectWords("Uncle sam", 3)
     * ["Uncle"]
     * > selectWords("", 4)
     * []
     * > selectWords("a b c d e f", 1)
     * ["b", "c", "d", "f"]
     */
    public static List<String> selectWords(String s, int n) {
        List<String> result = new ArrayList<>();
        String[] words = s.split(" ");
        for (String word : words) {
            int consonants = 0;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                    consonants++;
                }
            }
            if (consonants == n) {
                result.add(word);
            }
        }
        return result;
    }
}

// SelectWordsTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SelectWords}.
* It contains ten unit test cases for the {@link SelectWords#selectWords(String, int)} method.
*/
class SelectWordsTest {
    
    @Test
    void testSelectWordsWithOneMatch() {
        List<String> expected = new ArrayList<>();
        expected.add("little");
        assertEquals(expected, SelectWords.selectWords("Mary had a little lamb", 4));
    }
    
    @Test
    void testSelectWordsWithMultipleMatches() {
        List<String> expected = new ArrayList<>();
        expected.add("Mary");
        expected.add("lamb");
        assertEquals(expected, SelectWords.selectWords("Mary had a little lamb", 3));
    }
    
    @Test
    void testSelectWordsWithNoMatches() {
        List<String> expected = new ArrayList<>();
        assertEquals(expected, SelectWords.selectWords("simple white space", 2));
    }
    
    @Test
    void testSelectWordsWithOneMatchAtEnd() {
        List<String> expected = new ArrayList<>();
        expected.add("world");
        assertEquals(expected, SelectWords.selectWords("Hello world", 4));
    }
    
    @Test
    void testSelectWordsWithOneMatchAtBeginning() {
        List<String> expected = new ArrayList<>();
        expected.add("Uncle");
        assertEquals(expected, SelectWords.selectWords("Uncle sam", 3));
    }
    
    @Test
    void testSelectWordsWithEmptyString() {
        List<String> expected = new ArrayList<>();
        assertEquals(expected, SelectWords.selectWords("", 4));
    }
    
    @Test
    void testSelectWordsWithSingleLetterWords() {
        List<String> expected = new ArrayList<>();
        expected.add("b");
        expected.add("c");
        expected.add("d");
        expected.add("f");
        assertEquals(expected, SelectWords.selectWords("a b c d e f", 1));
    }
    
    @Test
    void testSelectWordsWithAllWordsMatching() {
        List<String> expected = new ArrayList<>();
        expected.add("Mary");
        expected.add("had");
        expected.add("a");
        expected.add("little");
        expected.add("lamb");
        assertEquals(expected, SelectWords.selectWords("Mary had a little lamb", 2));
    }
    
    @Test
    void testSelectWordsWithAllWordsMatchingAndEmptyString() {
        List<String> expected = new ArrayList<>();
        assertEquals(expected, SelectWords.selectWords("", 2));
    }
    
    @Test
    void testSelectWordsWithAllWordsMatchingAndSingleLetterWords() {
        List<String> expected = new ArrayList<>();
        expected.add("a");
        expected.add("b");
        expected.add("c");
        expected.add("d");
        expected.add("e");
        expected.add("f");
        assertEquals(expected, SelectWords.selectWords("a b c d e f", 0));
    }
}