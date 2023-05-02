// CircularShiftTest.java
package updated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link CircularShift}.
 * It contains ten unit test cases for the {@link CircularShift#circularShift(int, int)} method.
 */
class CircularShiftTest {

    @Test
    void testCircularShiftWithPositiveShift() {
        assertEquals("001", CircularShift.circularShift(100, 2));
        assertEquals("12", CircularShift.circularShift(12, 2));
        assertEquals("79", CircularShift.circularShift(97, 8));
        assertEquals("21", CircularShift.circularShift(12, 1));
    }

    @Test
    void testCircularShiftWithShiftGreaterThanNumberOfDigits() {
        assertEquals("11", CircularShift.circularShift(11, 101));
        assertEquals("321", CircularShift.circularShift(123, 4));
    }

    @Test
    void testCircularShiftWithNegativeShift() {
        assertEquals("001", CircularShift.circularShift(100, -2));
        assertEquals("12", CircularShift.circularShift(12, -2));
        assertEquals("79", CircularShift.circularShift(97, -8));
        assertEquals("21", CircularShift.circularShift(12, -1));
    }

    @Test
    void testCircularShiftWithShiftEqualToZero() {
        assertEquals("100", CircularShift.circularShift(100, 0));
        assertEquals("12", CircularShift.circularShift(12, 0));
        assertEquals("97", CircularShift.circularShift(97, 0));
    }

    @Test
    void testCircularShiftWithMaxIntegerValue() {
        assertEquals("2147483647", CircularShift.circularShift(Integer.MAX_VALUE, 1));
        assertEquals("2147483647", CircularShift.circularShift(Integer.MAX_VALUE, 10));
        assertEquals("2147483647", CircularShift.circularShift(Integer.MAX_VALUE, -1));
        assertEquals("2147483647", CircularShift.circularShift(Integer.MAX_VALUE, -10));
    }

    @Test
    void testCircularShiftWithMinIntegerValue() {
        assertEquals("-2147483648", CircularShift.circularShift(Integer.MIN_VALUE, 1));
        assertEquals("-2147483648", CircularShift.circularShift(Integer.MIN_VALUE, 10));
        assertEquals("-2147483648", CircularShift.circularShift(Integer.MIN_VALUE, -1));
        assertEquals("-2147483648", CircularShift.circularShift(Integer.MIN_VALUE, -10));
    }
} 

// CircularShift.java
package updated;

class CircularShift {

    /**
     * Circular shift the digits of the integer x, shift the digits right by shift
     * and return the result as a string.
     * If shift > number of digits, return digits reversed.
     *
     * @param x     the integer to be shifted
     * @param shift the number of digits to shift
     * @return the shifted integer as a string
     */
    public static String circularShift(int x, int shift) {
        String result = "";
        String xString = Integer.toString(x);
        int xLength = xString.length();
        if (shift == 0) {
            return xString;
        } else if (shift > xLength || shift < -xLength) {
            for (int i = xLength - 1; i >= 0; i--) {
                result += xString.charAt(i);
            }
        } else if (shift > 0) {
            for (int i = xLength - shift; i < xLength; i++) {
                result += xString.charAt(i);
            }
            for (int i = 0; i < xLength - shift; i++) {
                result += xString.charAt(i);
            }
        } else {
            shift = -shift;
            for (int i = shift; i < xLength; i++) {
                result += xString.charAt(i);
            }
            for (int i = 0; i < shift; i++) {
                result += xString.charAt(i);
            }
        }
        return result;
    }
}