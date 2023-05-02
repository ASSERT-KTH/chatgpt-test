// CountDistinctCharacters.java
package updated;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctCharacters {

    /**
     * Given a string, find out how many distinct characters (regardless of case)  it consists  of.
     *
     * @param string the input string
     * @return the number of distinct characters in the string
     */
    public static int countDistinctCharacters(String string) {
        Set<Character> distinctCharacters = new HashSet<Character>();
        for (int i = 0; i < string.length(); i++) {
            distinctCharacters.add(Character.toLowerCase(string.charAt(i)));
        }
        return distinctCharacters.size();
    }
}

// CountDistinctCharactersTest.java
package updated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains ten unit test cases for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {

    @Test
    void testEmptyString() {
        assertEquals(0, CountDistinctCharacters.countDistinctCharacters(""));
    }

    @Test
    void testSingleCharacter() {
        assertEquals(1, CountDistinctCharacters.countDistinctCharacters("a"));
    }

    @Test
    void testAllSameCharacters() {
        assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aaaaa"));
    }

    @Test
    void testAllDifferentCharacters() {
        assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcde"));
    }

    @Test
    void testMixedCase() {
        assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcdecadeCADE"));
    }

    @Test
    void testWithSpaces() {
        assertEquals(5, CountDistinctCharacters.countDistinctCharacters("Jerry jERRY JeRRRY"));
    }

    @Test
    void testWithNumbers() {
        assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abc123ABC"));
    }

    @Test
    void testWithSpecialCharacters() {
        assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abc!@#ABC"));
    }

    @Test
    void testWithUnicodeCharacters() {
        assertEquals(2, CountDistinctCharacters.countDistinctCharacters("日本語English"));
    }

    @Test
    void testWithNullString() {
        assertThrows(NullPointerException.class, () -> CountDistinctCharacters.countDistinctCharacters(null));
    }
}