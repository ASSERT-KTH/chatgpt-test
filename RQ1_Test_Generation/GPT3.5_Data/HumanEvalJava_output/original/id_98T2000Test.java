// CountUpper.java
package updated;

public class CountUpper {

    /**
     * Given a string s, count the number of uppercase vowels in even indices.
     *
     * For example:
     * countUpper('aBCdEf') returns 1
     * countUpper('abcdefg') returns 0
     * countUpper('dBBE') returns 0
     *
     * @param s the input string
     * @return the number of uppercase vowels in even indices
     */
    public static int countUpper(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i += 2) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c) && "AEIOU".indexOf(c) >= 0) {
                result++;
            }
        }
        return result;
    }
}

// CountUpperTest.java
package updated;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class of {@link CountUpper}.
 * It contains ten unit test cases for the {@link CountUpper#countUpper(String)} method.
 */
class CountUpperTest {

    @Test
    void testEmptyString() {
        assertEquals(0, CountUpper.countUpper(""));
    }

    @Test
    void testNoUppercaseVowels() {
        assertEquals(0, CountUpper.countUpper("abcdefg"));
    }

    @Test
    void testNoEvenIndices() {
        assertEquals(0, CountUpper.countUpper("dBBE"));
    }

    @Test
    void testOneUppercaseVowel() {
        assertEquals(1, CountUpper.countUpper("aBCdEf"));
    }

    @Test
    void testTwoUppercaseVowels() {
        assertEquals(2, CountUpper.countUpper("aBCDEfGI"));
    }

    @Test
    void testAllUppercaseVowels() {
        assertEquals(3, CountUpper.countUpper("AEIOUaeiouAEIOU"));
    }

    @Test
    void testAllUppercaseConsonants() {
        assertEquals(0, CountUpper.countUpper("BCDFGHJKLMNPQRSTVWXYZ"));
    }

    @Test
    void testMixedCaseVowels() {
        assertEquals(2, CountUpper.countUpper("aBCdEFGi"));
    }

    @Test
    void testMixedCaseConsonants() {
        assertEquals(0, CountUpper.countUpper("bCDFgHjKLmNPqRstVwXyz"));
    }

    @Test
    void testSpecialCharacters() {
        assertEquals(0, CountUpper.countUpper("!@#$%^&*()_+-=[]{}|;':\",./<>?\\"));
    }
}