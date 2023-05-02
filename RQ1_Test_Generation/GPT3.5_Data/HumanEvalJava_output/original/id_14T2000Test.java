// AllPrefixes.java
package updated;

import java.util.ArrayList;
import java.util.List;

public class AllPrefixes {

    /**
     * Return list of all prefixes from shortest to longest of the input string.
     *
     * @param string the input string
     * @return list of all prefixes
     */
    public static List<String> allPrefixes(String string) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            result.add(string.substring(0, i + 1));
        }
        return result;
    }
}

// AllPrefixesTest.java
package updated;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class of {@link AllPrefixes}.
 * It contains ten unit test cases for the {@link AllPrefixes#allPrefixes(String)} method.
 */
class AllPrefixesTest {

    @Test
    void testAllPrefixesWithEmptyString() {
        List<String> expected = new ArrayList<>();
        List<String> actual = AllPrefixes.allPrefixes("");
        assertEquals(expected, actual);
    }

    @Test
    void testAllPrefixesWithSingleCharacterString() {
        List<String> expected = Arrays.asList("a");
        List<String> actual = AllPrefixes.allPrefixes("a");
        assertEquals(expected, actual);
    }

    @Test
    void testAllPrefixesWithMultipleCharacterString() {
        List<String> expected = Arrays.asList("a", "ab", "abc", "abcd", "abcde");
        List<String> actual = AllPrefixes.allPrefixes("abcde");
        assertEquals(expected, actual);
    }

    @Test
    void testAllPrefixesWithUpperCaseString() {
        List<String> expected = Arrays.asList("W", "WW", "WWW");
        List<String> actual = AllPrefixes.allPrefixes("WWW");
        assertEquals(expected, actual);
    }

    @Test
    void testAllPrefixesWithNumericString() {
        List<String> expected = Arrays.asList("1", "12", "123", "1234", "12345");
        List<String> actual = AllPrefixes.allPrefixes("12345");
        assertEquals(expected, actual);
    }

    @Test
    void testAllPrefixesWithSpecialCharacterString() {
        List<String> expected = Arrays.asList("#", "#$", "#$%", "#$%^", "#$%^&");
        List<String> actual = AllPrefixes.allPrefixes("#$%^&");
        assertEquals(expected, actual);
    }

    @Test
    void testAllPrefixesWithWhitespaceString() {
        List<String> expected = Arrays.asList(" ", "  ", "   ", "    ", "     ");
        List<String> actual = AllPrefixes.allPrefixes("     ");
        assertEquals(expected, actual);
    }

    @Test
    void testAllPrefixesWithMixedString() {
        List<String> expected = Arrays.asList("a", "ab", "abc", "a1", "a1#", "a1#2", "a1#2$", "a1#2$3");
        List<String> actual = AllPrefixes.allPrefixes("a1#2$3");
        assertEquals(expected, actual);
    }

    @Test
    void testAllPrefixesWithUnicodeString() {
        List<String> expected = Arrays.asList("न", "नम", "नमस", "नमस्", "नमस्त", "नमस्ते");
        List<String> actual = AllPrefixes.allPrefixes("नमस्ते");
        assertEquals(expected, actual);
    }

    @Test
    void testAllPrefixesWithNullString() {
        List<String> expected = new ArrayList<>();
        List<String> actual = AllPrefixes.allPrefixes(null);
        assertEquals(expected, actual);
    }
}