// Concatenate.java
package updated;

import java.util.List;

public class Concatenate {

    /**
     * Concatenate list of strings into a single string
     *
     * @param strings list of strings to concatenate
     * @return concatenated string
     */
    public static String concatenate(List<String> strings) {
        StringBuilder result = new StringBuilder();
        for (String string : strings) {
            result.append(string);
        }
        return result.toString();
    }
}

// ConcatenateTest.java
package updated;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Concatenate}.
* It contains ten unit test cases for the {@link Concatenate#concatenate(List)} method.
*/
class ConcatenateTest {

    @Test
    void testEmptyList() {
        List<String> strings = Arrays.asList();
        String expected = "";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    @Test
    void testSingleString() {
        List<String> strings = Arrays.asList("a");
        String expected = "a";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleStrings() {
        List<String> strings = Arrays.asList("a", "b", "c");
        String expected = "abc";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    @Test
    void testStringsWithSpaces() {
        List<String> strings = Arrays.asList("hello", " ", "world");
        String expected = "hello world";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    @Test
    void testStringsWithNumbers() {
        List<String> strings = Arrays.asList("1", "2", "3");
        String expected = "123";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    @Test
    void testStringsWithSpecialCharacters() {
        List<String> strings = Arrays.asList("!", "@", "#");
        String expected = "!@#";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    @Test
    void testStringsWithNull() {
        List<String> strings = Arrays.asList("a", null, "b");
        String expected = "ab";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    @Test
    void testStringsWithEmptyString() {
        List<String> strings = Arrays.asList("a", "", "b");
        String expected = "ab";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    @Test
    void testStringsWithOneNull() {
        List<String> strings = Arrays.asList(null);
        String expected = "";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    @Test
    void testStringsWithOneEmptyString() {
        List<String> strings = Arrays.asList("");
        String expected = "";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }
}