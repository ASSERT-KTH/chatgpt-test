// FilterBySubstring.java
package updated;

import java.util.ArrayList;
import java.util.List;

public class FilterBySubstring {

    /**
     * Filter an input list of strings only for ones that contain given substring
     * @param strings List of strings to be filtered
     * @param substring Substring to be searched in the strings
     * @return List of strings containing the given substring
     */
    public static List<String> filterBySubstring(List<String> strings, String substring) {
        List<String> result = new ArrayList<>();
        for (String s : strings) {
            if (s.contains(substring)) {
                result.add(s);
            }
        }
        return result;
    }
}

// FilterBySubstringTest.java
package updated;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class of {@link FilterBySubstring}.
 * It contains ten unit test cases for the {@link FilterBySubstring#filterBySubstring(List, String)} method.
 */
class FilterBySubstringTest {

    @Test
    void testEmptyList() {
        List<String> input = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(expected, FilterBySubstring.filterBySubstring(input, "a"));
    }

    @Test
    void testNoMatch() {
        List<String> input = Arrays.asList("abc", "def", "ghi");
        List<String> expected = new ArrayList<>();
        assertEquals(expected, FilterBySubstring.filterBySubstring(input, "j"));
    }

    @Test
    void testSingleMatch() {
        List<String> input = Arrays.asList("abc", "def", "ghi");
        List<String> expected = Arrays.asList("abc");
        assertEquals(expected, FilterBySubstring.filterBySubstring(input, "a"));
    }

    @Test
    void testMultipleMatches() {
        List<String> input = Arrays.asList("abc", "bacd", "cde", "array");
        List<String> expected = Arrays.asList("abc", "bacd", "array");
        assertEquals(expected, FilterBySubstring.filterBySubstring(input, "a"));
    }

    @Test
    void testMatchAtBeginning() {
        List<String> input = Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
        List<String> expected = Arrays.asList("xxx", "xxxAAA", "xxx");
        assertEquals(expected, FilterBySubstring.filterBySubstring(input, "xxx"));
    }

    @Test
    void testMatchAtEnd() {
        List<String> input = Arrays.asList("xxx", "asd", "aaaxxy", "john doe", "xxxAAA", "xxx");
        List<String> expected = Arrays.asList("xxx", "aaaxxy", "xxxAAA", "xxx");
        assertEquals(expected, FilterBySubstring.filterBySubstring(input, "xx"));
    }

    @Test
    void testMatchInMiddle() {
        List<String> input = Arrays.asList("grunt", "trumpet", "prune", "gruesome");
        List<String> expected = Arrays.asList("grunt", "prune");
        assertEquals(expected, FilterBySubstring.filterBySubstring(input, "run"));
    }

    @Test
    void testEmptySubstring() {
        List<String> input = Arrays.asList("abc", "def", "ghi");
        List<String> expected = new ArrayList<>();
        assertEquals(expected, FilterBySubstring.filterBySubstring(input, ""));
    }

    @Test
    void testNullSubstring() {
        List<String> input = Arrays.asList("abc", "def", "ghi");
        List<String> expected = new ArrayList<>();
        assertEquals(expected, FilterBySubstring.filterBySubstring(input, null));
    }

    @Test
    void testNullList() {
        List<String> input = null;
        List<String> expected = new ArrayList<>();
        assertEquals(expected, FilterBySubstring.filterBySubstring(input, "a"));
    }
}