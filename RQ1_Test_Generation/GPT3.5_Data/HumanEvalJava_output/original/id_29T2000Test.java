// FilterByPrefix.java
package updated;

import java.util.ArrayList;
import java.util.List;

public class FilterByPrefix {

    /**
     * Filter an input list of strings only for ones that start with a given prefix.
     *
     * @param strings the list of strings to filter
     * @param prefix the prefix to filter by
     * @return a list of strings that start with the given prefix
     */
    public static List<String> filterByPrefix(List<String> strings, String prefix) {
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            if (string.startsWith(prefix)) {
                result.add(string);
            }
        }
        return result;
    }
}

// FilterByPrefixTest.java
package updated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterByPrefix}.
* It contains ten unit test cases for the {@link FilterByPrefix#filterByPrefix(List, String)} method.
*/
class FilterByPrefixTest {

    @Test
    void testEmptyList() {
        List<String> input = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(expected, FilterByPrefix.filterByPrefix(input, "a"));
    }

    @Test
    void testNoMatch() {
        List<String> input = Arrays.asList("bcd", "cde", "array");
        List<String> expected = new ArrayList<>();
        assertEquals(expected, FilterByPrefix.filterByPrefix(input, "a"));
    }

    @Test
    void testSingleMatch() {
        List<String> input = Arrays.asList("abc", "bcd", "cde", "array");
        List<String> expected = Arrays.asList("abc");
        assertEquals(expected, FilterByPrefix.filterByPrefix(input, "a"));
    }

    @Test
    void testMultipleMatches() {
        List<String> input = Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
        List<String> expected = Arrays.asList("xxx", "xxxAAA", "xxx");
        assertEquals(expected, FilterByPrefix.filterByPrefix(input, "xxx"));
    }

    @Test
    void testPrefixIsEntireString() {
        List<String> input = Arrays.asList("abc", "bcd", "cde", "array");
        List<String> expected = Arrays.asList("abc", "bcd", "cde", "array");
        assertEquals(expected, FilterByPrefix.filterByPrefix(input, "a"));
    }

    @Test
    void testPrefixIsSingleCharacter() {
        List<String> input = Arrays.asList("abc", "bcd", "cde", "array");
        List<String> expected = Arrays.asList("abc", "array");
        assertEquals(expected, FilterByPrefix.filterByPrefix(input, "a"));
    }

    @Test
    void testPrefixIsLastCharacter() {
        List<String> input = Arrays.asList("abc", "bcd", "cde", "array");
        List<String> expected = Arrays.asList("cde");
        assertEquals(expected, FilterByPrefix.filterByPrefix(input, "c"));
    }

    @Test
    void testPrefixIsFirstCharacter() {
        List<String> input = Arrays.asList("abc", "bcd", "cde", "array");
        List<String> expected = Arrays.asList("abc");
        assertEquals(expected, FilterByPrefix.filterByPrefix(input, "a"));
    }

    @Test
    void testPrefixIsMiddleCharacters() {
        List<String> input = Arrays.asList("abc", "bcd", "cde", "array");
        List<String> expected = Arrays.asList("abc", "bcd");
        assertEquals(expected, FilterByPrefix.filterByPrefix(input, "b"));
    }

    @Test
    void testNullInput() {
        List<String> input = null;
        assertThrows(NullPointerException.class, () -> FilterByPrefix.filterByPrefix(input, "a"));
    }
}