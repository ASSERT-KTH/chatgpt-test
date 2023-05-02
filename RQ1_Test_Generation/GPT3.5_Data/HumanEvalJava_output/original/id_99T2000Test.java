// ClosestIntegerTest.java
package updated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ClosestInteger}.
 * It contains ten unit test cases for the {@link ClosestInteger#closestInteger(String)} method.
 */
class ClosestIntegerTest {

    @Test
    void testClosestIntegerPositive() {
        assertEquals(10, ClosestInteger.closestInteger("10"));
        assertEquals(15, ClosestInteger.closestInteger("15.3"));
        assertEquals(16, ClosestInteger.closestInteger("15.5"));
        assertEquals(20, ClosestInteger.closestInteger("19.6"));
        assertEquals(21, ClosestInteger.closestInteger("20.5"));
    }

    @Test
    void testClosestIntegerNegative() {
        assertEquals(-10, ClosestInteger.closestInteger("-10"));
        assertEquals(-15, ClosestInteger.closestInteger("-15.3"));
        assertEquals(-16, ClosestInteger.closestInteger("-15.5"));
        assertEquals(-20, ClosestInteger.closestInteger("-19.6"));
        assertEquals(-21, ClosestInteger.closestInteger("-20.5"));
    }

    @Test
    void testClosestIntegerZero() {
        assertEquals(0, ClosestInteger.closestInteger("0"));
    }

    @Test
    void testClosestIntegerLargeNumber() {
        assertEquals(2147483647, ClosestInteger.closestInteger("2147483647.5"));
        assertEquals(-2147483648, ClosestInteger.closestInteger("-2147483647.5"));
    }

    @Test
    void testClosestIntegerInvalidInput() {
        assertThrows(NumberFormatException.class, () -> ClosestInteger.closestInteger("abc"));
        assertThrows(NumberFormatException.class, () -> ClosestInteger.closestInteger(""));
    }
} 

// ClosestInteger.java
package updated;

class ClosestInteger {

    /**
     * Create a function that takes a value (string) representing a number
     * and returns the closest integer to it. If the number is equidistant
     * from two integers, round it away from zero.
     *
     * Examples
     * >>> closestInteger("10")
     * 10
     * >>> closestInteger("15.3")
     * 15
     *
     * Note:
     * Rounding away from zero means that if the given number is equidistant
     * from two integers, the one you should return is the one that is the
     * farthest from zero. For example closest_integer("14.5") should
     * return 15 and closest_integer("-14.5") should return -15.
     *
     * > closestInteger("10")
     * 10
     * > closestInteger("14.5")
     * 15
     * > closestInteger("-15.5")
     * -16
     * > closestInteger("15.3")
     * 15
     * > closestInteger("0")
     * 0
     */
    public static int closestInteger(String value) {
        double d;
        try {
            d = Double.parseDouble(value);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid input: " + value);
        }
        if (d > 0) {
            return (int) Math.floor(d + 0.5);
        } else {
            return (int) Math.ceil(d - 0.5);
        }
    }
}