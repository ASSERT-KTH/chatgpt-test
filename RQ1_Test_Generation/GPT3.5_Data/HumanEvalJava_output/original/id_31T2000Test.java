// IsPrime.java
package updated;

public class IsPrime {

    /**
     * Return true if a given number is prime, and false otherwise.
     *
     * > isPrime(6)
     * false
     * > isPrime(101)
     * true
     * > isPrime(11)
     * true
     * > isPrime(13441)
     * true
     * > isPrime(61)
     * true
     * > isPrime(4)
     * false
     * > isPrime(1)
     * false
     * > isPrime(5)
     * true
     * > isPrime(11)
     * true
     * > isPrime(17)
     * true
     * > isPrime(85)
     * false
     * > isPrime(77)
     * false
     * > isPrime(255379)
     * false
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// IsPrimeTest.java
package updated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPrime}.
* It contains ten unit test cases for the {@link IsPrime#isPrime(int)} method.
*/
class IsPrimeTest {
    
    @Test
    void testIsPrimeWithNegativeNumber() {
        assertFalse(IsPrime.isPrime(-5));
    }
    
    @Test
    void testIsPrimeWithZero() {
        assertFalse(IsPrime.isPrime(0));
    }
    
    @Test
    void testIsPrimeWithOne() {
        assertFalse(IsPrime.isPrime(1));
    }
    
    @Test
    void testIsPrimeWithTwo() {
        assertTrue(IsPrime.isPrime(2));
    }
    
    @Test
    void testIsPrimeWithEvenNumber() {
        assertFalse(IsPrime.isPrime(4));
    }
    
    @Test
    void testIsPrimeWithOddNumber() {
        assertTrue(IsPrime.isPrime(7));
    }
    
    @Test
    void testIsPrimeWithLargePrimeNumber() {
        assertTrue(IsPrime.isPrime(999983));
    }
    
    @Test
    void testIsPrimeWithLargeNonPrimeNumber() {
        assertFalse(IsPrime.isPrime(999981));
    }
    
    @Test
    void testIsPrimeWithMaxValue() {
        assertFalse(IsPrime.isPrime(Integer.MAX_VALUE));
    }
    
    @Test
    void testIsPrimeWithMinValue() {
        assertFalse(IsPrime.isPrime(Integer.MIN_VALUE));
    }
}