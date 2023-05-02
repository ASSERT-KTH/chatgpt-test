// MultiplyTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Multiply}.
 * It contains ten unit test cases for the {@link Multiply#multiply(int, int)} method.
 */
class MultiplyTest {

    @Test
    void testMultiplyPositiveNumbers() {
        assertEquals(16, Multiply.multiply(148, 412));
        assertEquals(72, Multiply.multiply(19, 28));
        assertEquals(0, Multiply.multiply(2020, 1851));
        assertEquals(20, Multiply.multiply(14, -15));
    }

    @Test
    void testMultiplyNegativeNumbers() {
        assertEquals(42, Multiply.multiply(76, 67));
        assertEquals(49, Multiply.multiply(17, 27));
    }

    @Test
    void testMultiplyWithZero() {
        assertEquals(0, Multiply.multiply(0, 1));
        assertEquals(0, Multiply.multiply(0, 0));
    }
}