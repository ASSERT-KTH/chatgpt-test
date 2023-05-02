// GreatestCommonDivisorTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link GreatestCommonDivisor}.
 * It contains ten unit test cases for the {@link GreatestCommonDivisor#greatestCommonDivisor(int, int)} method.
 */
class GreatestCommonDivisorTest {

    @Test
    void testGreatestCommonDivisor1() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(3, 5);
        assertEquals(1, result);
    }

    @Test
    void testGreatestCommonDivisor2() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(25, 15);
        assertEquals(5, result);
    }

    @Test
    void testGreatestCommonDivisor3() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(3, 7);
        assertEquals(1, result);
    }

    @Test
    void testGreatestCommonDivisor4() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(10, 15);
        assertEquals(5, result);
    }

    @Test
    void testGreatestCommonDivisor5() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(49, 14);
        assertEquals(7, result);
    }

    @Test
    void testGreatestCommonDivisor6() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(144, 60);
        assertEquals(12, result);
    }

    @Test
    void testGreatestCommonDivisor7() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(0, 5);
        assertEquals(5, result);
    }

    @Test
    void testGreatestCommonDivisor8() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(5, 0);
        assertEquals(5, result);
    }

    @Test
    void testGreatestCommonDivisor9() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(0, 0);
        assertEquals(0, result);
    }

    @Test
    void testGreatestCommonDivisor10() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(-10, 15);
        assertEquals(5, result);
    }
}