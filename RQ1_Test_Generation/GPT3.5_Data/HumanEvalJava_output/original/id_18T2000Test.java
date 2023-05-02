// Here's the complete source code for the HowManyTimesTest class:

package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link HowManyTimes}.
 * It contains ten unit test cases for the {@link HowManyTimes#howManyTimes(String, String)} method.
 */
class HowManyTimesTest {

    @Test
    void testEmptyString() {
        assertEquals(0, HowManyTimes.howManyTimes("", "a"));
        assertEquals(0, HowManyTimes.howManyTimes("", "x"));
    }

    @Test
    void testSingleCharacter() {
        assertEquals(3, HowManyTimes.howManyTimes("aaa", "a"));
        assertEquals(1, HowManyTimes.howManyTimes("john doe", "j"));
    }

    @Test
    void testMultipleCharacters() {
        assertEquals(3, HowManyTimes.howManyTimes("aaaa", "aa"));
        assertEquals(4, HowManyTimes.howManyTimes("xyxyxyx", "x"));
        assertEquals(4, HowManyTimes.howManyTimes("cacacacac", "cac"));
    }

    @Test
    void testNonexistentSubstring() {
        assertEquals(0, HowManyTimes.howManyTimes("aaa", "b"));
        assertEquals(0, HowManyTimes.howManyTimes("john doe", "jane"));
    }

    @Test
    void testOverlappingSubstring() {
        assertEquals(2, HowManyTimes.howManyTimes("aaa", "aa"));
        assertEquals(3, HowManyTimes.howManyTimes("xyxyxyx", "xy"));
        assertEquals(3, HowManyTimes.howManyTimes("cacacacac", "ca"));
    }
}