// HexKeyTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link HexKey}.
 * It contains ten unit test cases for the {@link HexKey#hexKey(Object)} method.
 */
class HexKeyTest {

    @Test
    void testHexKeyWithEmptyString() {
        int result = HexKey.hexKey("");
        assertEquals(0, result);
    }

    @Test
    void testHexKeyWithOneDigit() {
        int result = HexKey.hexKey("2");
        assertEquals(1, result);
    }

    @Test
    void testHexKeyWithTwoDigits() {
        int result = HexKey.hexKey("AB");
        assertEquals(1, result);
    }

    @Test
    void testHexKeyWithThreeDigits() {
        int result = HexKey.hexKey("107");
        assertEquals(1, result);
    }

    @Test
    void testHexKeyWithFourDigits() {
        int result = HexKey.hexKey("2020");
        assertEquals(2, result);
    }

    @Test
    void testHexKeyWithFiveDigits() {
        int result = HexKey.hexKey("1077E");
        assertEquals(2, result);
    }

    @Test
    void testHexKeyWithSixDigits() {
        int result = HexKey.hexKey("ABED1A");
        assertEquals(3, result);
    }

    @Test
    void testHexKeyWithSevenDigits() {
        int result = HexKey.hexKey("ABED1A3");
        assertEquals(4, result);
    }

    @Test
    void testHexKeyWithEightDigits() {
        int result = HexKey.hexKey("12345678");
        assertEquals(0, result);
    }

    @Test
    void testHexKeyWithSixteenDigits() {
        int result = HexKey.hexKey("123456789ABCDEF0");
        assertEquals(6, result);
    }
}