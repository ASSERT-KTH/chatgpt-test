// AddTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Add}.
 * It contains ten unit test cases for the {@link Add#add(int, int)} method.
 */
class AddTest {

    @Test
    void testAddZero() {
        int result = Add.add(0, 0);
        assertEquals(0, result);
    }

    @Test
    void testAddPositiveNumbers() {
        int result = Add.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void testAddNegativeNumbers() {
        int result = Add.add(-2, -3);
        assertEquals(-5, result);
    }

    @Test
    void testAddPositiveAndNegativeNumbers() {
        int result = Add.add(2, -3);
        assertEquals(-1, result);
    }

    @Test
    void testAddMaxValue() {
        int result = Add.add(Integer.MAX_VALUE, 1);
        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test
    void testAddMinValue() {
        int result = Add.add(Integer.MIN_VALUE, -1);
        assertEquals(Integer.MAX_VALUE, result);
    }

    @Test
    void testAddLargeNumbers() {
        int result = Add.add(572, 725);
        assertEquals(1297, result);
    }

    @Test
    void testAddZeroAndPositiveNumber() {
        int result = Add.add(0, 1);
        assertEquals(1, result);
    }

    @Test
    void testAddPositiveNumberAndZero() {
        int result = Add.add(1, 0);
        assertEquals(1, result);
    }

    @Test
    void testAddNegativeNumberAndZero() {
        int result = Add.add(-1, 0);
        assertEquals(-1, result);
    }
}