// IsEqualToSumEvenTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link IsEqualToSumEven}.
 * It contains ten unit test cases for the {@link IsEqualToSumEven#isEqualToSumEven(int)} method.
 */
class IsEqualToSumEvenTest {

    @Test
    void testIsEqualToSumEvenWith4() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(4));
    }

    @Test
    void testIsEqualToSumEvenWith6() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(6));
    }

    @Test
    void testIsEqualToSumEvenWith8() {
        assertTrue(IsEqualToSumEven.isEqualToSumEven(8));
    }

    @Test
    void testIsEqualToSumEvenWith10() {
        assertTrue(IsEqualToSumEven.isEqualToSumEven(10));
    }

    @Test
    void testIsEqualToSumEvenWith11() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(11));
    }

    @Test
    void testIsEqualToSumEvenWith12() {
        assertTrue(IsEqualToSumEven.isEqualToSumEven(12));
    }

    @Test
    void testIsEqualToSumEvenWith13() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(13));
    }

    @Test
    void testIsEqualToSumEvenWith16() {
        assertTrue(IsEqualToSumEven.isEqualToSumEven(16));
    }

    @Test
    void testIsEqualToSumEvenWithNegativeNumber() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(-10));
    }

    @Test
    void testIsEqualToSumEvenWithZero() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(0));
    }
}