// IsMultiplyPrimeTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link IsMultiplyPrime}.
 * It contains ten unit test cases for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
 */
class IsMultiplyPrimeTest {

    @Test
    void testIsMultiplyPrimeWith5() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(5));
    }

    @Test
    void testIsMultiplyPrimeWith30() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(30));
    }

    @Test
    void testIsMultiplyPrimeWith8() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(8));
    }

    @Test
    void testIsMultiplyPrimeWith10() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(10));
    }

    @Test
    void testIsMultiplyPrimeWith125() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(125));
    }

    @Test
    void testIsMultiplyPrimeWith105() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(105));
    }

    @Test
    void testIsMultiplyPrimeWith126() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(126));
    }

    @Test
    void testIsMultiplyPrimeWith729() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(729));
    }

    @Test
    void testIsMultiplyPrimeWith891() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(891));
    }

    @Test
    void testIsMultiplyPrimeWith1001() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(1001));
    }
}