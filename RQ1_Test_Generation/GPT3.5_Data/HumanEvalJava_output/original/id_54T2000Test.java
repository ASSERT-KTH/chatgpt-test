// SameCharsTest.java
package updated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link SameChars}.
 * It contains ten unit test cases for the {@link SameChars#sameChars(String, String)} method.
 */
class SameCharsTest {

    @Test
    void testSameChars1() {
        assertFalse(SameChars.sameChars("abcd", "dddddddabce"));
    }

    @Test
    void testSameChars2() {
        assertTrue(SameChars.sameChars("eabcdzzzz", "dddzzzzzzzddeddabc"));
    }

    @Test
    void testSameChars3() {
        assertTrue(SameChars.sameChars("abcd", "dddddddabc"));
    }

    @Test
    void testSameChars4() {
        assertTrue(SameChars.sameChars("dddddddabc", "abcd"));
    }

    @Test
    void testSameChars5() {
        assertFalse(SameChars.sameChars("eabcd", "dddddddabc"));
    }

    @Test
    void testSameChars6() {
        assertFalse(SameChars.sameChars("abcd", "dddddddabcf"));
    }

    @Test
    void testSameChars7() {
        assertFalse(SameChars.sameChars("eabcdzzzz", "dddzzzzzzzddddabc"));
    }

    @Test
    void testSameChars8() {
        assertFalse(SameChars.sameChars("aabb", "aaccc"));
    }

    @Test
    void testSameChars9() {
        assertTrue(SameChars.sameChars("", ""));
    }

    @Test
    void testSameChars10() {
        assertTrue(SameChars.sameChars("a", "a"));
    }
} 

// SameChars.java
package updated;

class SameChars {

    /**
     * Check if two words have the same characters.
     *
     * @param s0 first string to compare
     * @param s1 second string to compare
     * @return true if both strings have the same characters, false otherwise
     */
    public static boolean sameChars(String s0, String s1) {
        if (s0.length() != s1.length()) {
            return false;
        }
        int[] count0 = new int[26];
        int[] count1 = new int[26];
        for (int i = 0; i < s0.length(); i++) {
            count0[s0.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count0[i] != count1[i]) {
                return false;
            }
        }
        return true;
    }
}