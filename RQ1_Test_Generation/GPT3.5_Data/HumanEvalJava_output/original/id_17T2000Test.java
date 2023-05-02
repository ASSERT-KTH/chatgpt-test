// Here's the source code for the ParseMusicTest class:

package original;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ParseMusic}.
 * It contains ten unit test cases for the {@link ParseMusic#parseMusic(String)} method.
 */
class ParseMusicTest {

    @Test
    void testEmptyString() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = ParseMusic.parseMusic("");
        assertEquals(expected, actual);
    }

    @Test
    void testWholeNotes() {
        List<Object> expected = Arrays.asList(4, 4, 4, 4);
        List<Object> actual = ParseMusic.parseMusic("o o o o");
        assertEquals(expected, actual);
    }

    @Test
    void testQuarterNotes() {
        List<Object> expected = Arrays.asList(1, 1, 1, 1);
        List<Object> actual = ParseMusic.parseMusic(".| .| .| .|");
        assertEquals(expected, actual);
    }

    @Test
    void testHalfNotes() {
        List<Object> expected = Arrays.asList(2, 2);
        List<Object> actual = ParseMusic.parseMusic("o| o|");
        assertEquals(expected, actual);
    }

    @Test
    void testMixedNotes() {
        List<Object> expected = Arrays.asList(4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4);
        List<Object> actual = ParseMusic.parseMusic("o o| .| o| o| .| .| .| .| o o");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleQuarterNotes() {
        List<Object> expected = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1);
        List<Object> actual = ParseMusic.parseMusic(".| .| .| .| .| .| .| .|");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleHalfNotes() {
        List<Object> expected = Arrays.asList(2, 2, 2, 2);
        List<Object> actual = ParseMusic.parseMusic("o| o| o| o|");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWholeNotes() {
        List<Object> expected = Arrays.asList(4, 4, 4, 4, 4, 4);
        List<Object> actual = ParseMusic.parseMusic("o o o o o o");
        assertEquals(expected, actual);
    }

    @Test
    void testMixedNotesWithSpaces() {
        List<Object> expected = Arrays.asList(4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4);
        List<Object> actual = ParseMusic.parseMusic("o o| .| o| o| .| .| .| .| o o ");
        assertEquals(expected, actual);
    }

    @Test
    void testNotesWithExtraSpaces() {
        List<Object> expected = Arrays.asList(4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4);
        List<Object> actual = ParseMusic.parseMusic(" o o| .| o| o| .| .| .| .| o o ");
        assertEquals(expected, actual);
    }

    @Test
    void testNotesWithTrailingSpaces() {
        List<Object> expected = Arrays.asList(4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4);
        List<Object> actual = ParseMusic.parseMusic("o o| .| o| o| .| .| .| .| o o ");
        assertEquals(expected, actual);
    }
}