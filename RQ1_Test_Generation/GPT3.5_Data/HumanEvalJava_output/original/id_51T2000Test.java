// RemoveVowels.java
package updated;

public class RemoveVowels {

    /**
     * removeVowels is a function that takes string and returns string without vowels.
     *
     * > removeVowels("abcdef")
     * "bcdf"
     * > removeVowels("aaaaa")
     * ""
     * > removeVowels("aaBAA")
     * "B"
     * > removeVowels("zbcd")
     * "zbcd"
     * > removeVowels("")
     * ""
     * > removeVowels("abcdef\nghijklm")
     * "bcdf\nghjklm"
     * > removeVowels("fedcba")
     * "fdcb"
     * > removeVowels("eeeee")
     * ""
     * > removeVowels("acBAA")
     * "cB"
     * > removeVowels("EcBOO")
     * "cB"
     * > removeVowels("ybcd")
     * "ybcd"
     */
    public static String removeVowels(String text) {
        if (text == null) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!isVowel(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    /**
     * isVowel is a function that takes a character and returns true if it is a vowel, false otherwise.
     */
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}

// RemoveVowelsTest.java
package updated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveVowels}.
* It contains ten unit test cases for the {@link RemoveVowels#removeVowels(String)} method.
*/
class RemoveVowelsTest {

    @Test
    void testRemoveVowels() {
        assertEquals("bcdf", RemoveVowels.removeVowels("abcdef"));
        assertEquals("", RemoveVowels.removeVowels("aaaaa"));
        assertEquals("B", RemoveVowels.removeVowels("aaBAA"));
        assertEquals("zbcd", RemoveVowels.removeVowels("zbcd"));
        assertEquals("", RemoveVowels.removeVowels(""));
        assertEquals("bcdf\nghjklm", RemoveVowels.removeVowels("abcdef\nghijklm"));
        assertEquals("fdcb", RemoveVowels.removeVowels("fedcba"));
        assertEquals("", RemoveVowels.removeVowels("eeeee"));
        assertEquals("cB", RemoveVowels.removeVowels("acBAA"));
        assertEquals("cB", RemoveVowels.removeVowels("EcBOO"));
        assertEquals("ybcd", RemoveVowels.removeVowels("ybcd"));
    }

    @Test
    void testRemoveVowelsWithNull() {
        assertEquals("", RemoveVowels.removeVowels(null));
    }
}