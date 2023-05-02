// FindMax.java
package updated;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMax {

    /**
     * Write a function that accepts a list of strings.
     * The list contains different words. Return the word with maximum number
     * of unique characters. If multiple strings have maximum number of unique
     * characters, return the one which comes first in lexicographical order.
     *
     * findMax(["name", "of", "string"]) == "string"
     * findMax(["name", "enam", "game"]) == "enam"
     * findMax(["aaaaaaa", "bb" ,"cc"]) == ""aaaaaaa"
     *
     * > findMax(["name", "of", "string"])
     * "string"
     * > findMax(["name", "enam", "game"])
     * "enam"
     * > findMax(["aaaaaaa", "bb", "cc"])
     * "aaaaaaa"
     * > findMax(["abc", "cba"])
     * "abc"
     * > findMax(["play", "this", "game", "of", "footbott"])
     * "footbott"
     * > findMax(["we", "are", "gonna", "rock"])
     * "gonna"
     * > findMax(["we", "are", "a", "mad", "nation"])
     * "nation"
     * > findMax(["this", "is", "a", "prrk"])
     * "this"
     * > findMax(["b"])
     * "b"
     * > findMax(["play", "play", "play"])
     * "play"
     */
    public static String findMax(List<String> words) {
        if (words == null || words.isEmpty()) {
            return null;
        }
        String maxWord = words.get(0);
        int maxUnique = 0;
        for (String word : words) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < word.length(); i++) {
                seen.add(word.charAt(i));
            }
            if (seen.size() > maxUnique) {
                maxWord = word;
                maxUnique = seen.size();
            } else if (seen.size() == maxUnique && word.compareTo(maxWord) < 0) {
                maxWord = word;
            }
        }
        return maxWord;
    }
}

// FindMaxTest.java
package updated;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindMax}.
* It contains ten unit test cases for the {@link FindMax#findMax(List)} method.
*/
class FindMaxTest {

    @Test
    void testFindMaxWithNullList() {
        assertNull(FindMax.findMax(null));
    }

    @Test
    void testFindMaxWithEmptyList() {
        assertNull(FindMax.findMax(Arrays.asList()));
    }

    @Test
    void testFindMaxWithOneElement() {
        assertEquals("b", FindMax.findMax(Arrays.asList("b")));
    }

    @Test
    void testFindMaxWithMultipleElements() {
        assertEquals("string", FindMax.findMax(Arrays.asList("name", "of", "string")));
        assertEquals("enam", FindMax.findMax(Arrays.asList("name", "enam", "game")));
        assertEquals("aaaaaaa", FindMax.findMax(Arrays.asList("aaaaaaa", "bb", "cc")));
        assertEquals("abc", FindMax.findMax(Arrays.asList("abc", "cba")));
        assertEquals("footbott", FindMax.findMax(Arrays.asList("play", "this", "game", "of", "footbott")));
        assertEquals("gonna", FindMax.findMax(Arrays.asList("we", "are", "gonna", "rock")));
        assertEquals("nation", FindMax.findMax(Arrays.asList("we", "are", "a", "mad", "nation")));
        assertEquals("this", FindMax.findMax(Arrays.asList("this", "is", "a", "prrk")));
        assertEquals("play", FindMax.findMax(Arrays.asList("play", "play", "play")));
    }

    @Test
    void testFindMaxWithDuplicateMaxUniqueElements() {
        assertEquals("abc", FindMax.findMax(Arrays.asList("abc", "cba", "bac")));
        assertEquals("enam", FindMax.findMax(Arrays.asList("name", "enam", "amen")));
        assertEquals("footbott", FindMax.findMax(Arrays.asList("play", "this", "game", "of", "footbott", "bottfoot")));
    }
}