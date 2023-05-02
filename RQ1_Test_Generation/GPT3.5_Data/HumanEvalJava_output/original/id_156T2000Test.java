// IntToMiniRomanTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link IntToMiniRoman}.
 * It contains ten unit test cases for the {@link IntToMiniRoman#intToMiniRoman(int)} method.
 */
class IntToMiniRomanTest {

    @Test
    void testIntToMiniRoman_19() {
        assertEquals("xix", IntToMiniRoman.intToMiniRoman(19));
    }

    @Test
    void testIntToMiniRoman_152() {
        assertEquals("clii", IntToMiniRoman.intToMiniRoman(152));
    }

    @Test
    void testIntToMiniRoman_251() {
        assertEquals("ccli", IntToMiniRoman.intToMiniRoman(251));
    }

    @Test
    void testIntToMiniRoman_426() {
        assertEquals("cdxxvi", IntToMiniRoman.intToMiniRoman(426));
    }

    @Test
    void testIntToMiniRoman_500() {
        assertEquals("d", IntToMiniRoman.intToMiniRoman(500));
    }

    @Test
    void testIntToMiniRoman_1() {
        assertEquals("i", IntToMiniRoman.intToMiniRoman(1));
    }

    @Test
    void testIntToMiniRoman_4() {
        assertEquals("iv", IntToMiniRoman.intToMiniRoman(4));
    }

    @Test
    void testIntToMiniRoman_43() {
        assertEquals("xliii", IntToMiniRoman.intToMiniRoman(43));
    }

    @Test
    void testIntToMiniRoman_90() {
        assertEquals("xc", IntToMiniRoman.intToMiniRoman(90));
    }

    @Test
    void testIntToMiniRoman_994() {
        assertEquals("cmxciv", IntToMiniRoman.intToMiniRoman(994));
    }
}