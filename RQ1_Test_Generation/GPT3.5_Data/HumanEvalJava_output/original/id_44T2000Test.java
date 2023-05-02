// ChangeBase.java
package updated;

public class ChangeBase {

    /**
     * Change numerical base of input number x to base.
     * return string representation after the conversion.
     * base numbers are less than 10.
     *
     * @param x    the number to be converted
     * @param base the base to which the number is to be converted
     * @return the string representation of the converted number
     */
    public static String changeBase(int x, int base) {
        if (base < 2 || base > 9) {
            throw new IllegalArgumentException("Base should be between 2 and 9");
        }
        String result = "";
        while (x > 0) {
            result = (x % base) + result;
            x = x / base;
        }
        return result;
    }
}

// ChangeBaseTest.java
package updated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ChangeBase}.
 * It contains ten unit test cases for the {@link ChangeBase#changeBase(int, int)} method.
 */
class ChangeBaseTest {

    @Test
    void testChangeBaseWithValidInputs() {
        assertEquals("22", ChangeBase.changeBase(8, 3));
        assertEquals("1000", ChangeBase.changeBase(8, 2));
        assertEquals("111", ChangeBase.changeBase(7, 2));
        assertEquals("22", ChangeBase.changeBase(8, 3));
        assertEquals("100", ChangeBase.changeBase(9, 3));
        assertEquals("11101010", ChangeBase.changeBase(234, 2));
        assertEquals("10000", ChangeBase.changeBase(16, 2));
        assertEquals("1000", ChangeBase.changeBase(8, 2));
        assertEquals("111", ChangeBase.changeBase(7, 2));
        assertEquals("2", ChangeBase.changeBase(2, 3));
    }

    @Test
    void testChangeBaseWithInvalidBase() {
        assertThrows(IllegalArgumentException.class, () -> ChangeBase.changeBase(8, 10));
        assertThrows(IllegalArgumentException.class, () -> ChangeBase.changeBase(8, 1));
    }
}