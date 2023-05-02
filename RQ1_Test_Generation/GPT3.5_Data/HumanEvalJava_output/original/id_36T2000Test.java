// FizzBuzzTest.java
package updated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link FizzBuzz}.
 * It contains ten unit test cases for the {@link FizzBuzz#fizzBuzz(int)} method.
 */
class FizzBuzzTest {

    @Test
    void testFizzBuzzWith50() {
        int result = FizzBuzz.fizzBuzz(50);
        assertEquals(0, result);
    }

    @Test
    void testFizzBuzzWith78() {
        int result = FizzBuzz.fizzBuzz(78);
        assertEquals(2, result);
    }

    @Test
    void testFizzBuzzWith79() {
        int result = FizzBuzz.fizzBuzz(79);
        assertEquals(3, result);
    }

    @Test
    void testFizzBuzzWith100() {
        int result = FizzBuzz.fizzBuzz(100);
        assertEquals(3, result);
    }

    @Test
    void testFizzBuzzWith200() {
        int result = FizzBuzz.fizzBuzz(200);
        assertEquals(6, result);
    }

    @Test
    void testFizzBuzzWith4000() {
        int result = FizzBuzz.fizzBuzz(4000);
        assertEquals(192, result);
    }

    @Test
    void testFizzBuzzWith10000() {
        int result = FizzBuzz.fizzBuzz(10000);
        assertEquals(639, result);
    }

    @Test
    void testFizzBuzzWith100000() {
        int result = FizzBuzz.fizzBuzz(100000);
        assertEquals(8026, result);
    }

    @Test
    void testFizzBuzzWithNegativeNumber() {
        int result = FizzBuzz.fizzBuzz(-10);
        assertEquals(0, result);
    }

    @Test
    void testFizzBuzzWithZero() {
        int result = FizzBuzz.fizzBuzz(0);
        assertEquals(0, result);
    }
} 

// FizzBuzz.java
package updated;

class FizzBuzz {

    /**
     * Return the number of times the digit 7 appears in integers less than n which are divisible by 11 or 13.
     *
     * @param n the upper limit of the range of integers to check
     * @return the number of times the digit 7 appears in integers less than n which are divisible by 11 or 13
     */
    public static int fizzBuzz(int n) {
        if (n <= 0) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (i % 11 == 0 || i % 13 == 0) {
                String s = Integer.toString(i);
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == '7') {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}