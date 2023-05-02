// SumToN.java
package updated;

public class SumToN {

    /**
     * sumToN is a function that sums numbers from 1 to n.
     *
     * @param n the integer up to which the numbers are to be summed
     * @return the sum of numbers from 1 to n
     */
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

// SumToNTest.java
package updated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains ten unit test cases for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {
    
    @Test
    void testSumToNWithPositiveInteger() {
        assertEquals(15, SumToN.sumToN(5));
        assertEquals(55, SumToN.sumToN(10));
        assertEquals(1, SumToN.sumToN(1));
        assertEquals(21, SumToN.sumToN(6));
        assertEquals(66, SumToN.sumToN(11));
        assertEquals(465, SumToN.sumToN(30));
        assertEquals(5050, SumToN.sumToN(100));
    }
    
    @Test
    void testSumToNWithNegativeInteger() {
        assertEquals(0, SumToN.sumToN(-5));
        assertEquals(0, SumToN.sumToN(-10));
        assertEquals(0, SumToN.sumToN(-1));
    }
    
    @Test
    void testSumToNWithZero() {
        assertEquals(0, SumToN.sumToN(0));
    }
}