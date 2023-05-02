// GetOddCollatz.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class GetOddCollatz {

    /**
     * * Given a positive integer n, return a sorted list that has the odd numbers in collatz sequence.
     *
     * The Collatz conjecture is a conjecture in mathematics that concerns a sequence defined
     * as follows: start with any positive integer n. Then each term is obtained from the
     * previous term as follows: if the previous term is even, the next term is one half of
     * the previous term. If the previous term is odd, the next term is 3 times the previous
     * term plus 1. The conjecture is that no matter what value of n, the sequence will always reach 1.
     *
     * Note:
     * 1. Collatz(1) is [1].
     * 2. returned list sorted in increasing order.
     *
     * For example:
     * getOddCollatz(5) returns [1, 5] # The collatz sequence for 5 is [5, 16, 8, 4, 2, 1], so the odd numbers are only 1, and 5.
     *
     * > getOddCollatz(14)
     * [1, 5, 7, 11, 13, 17]
     * > getOddCollatz(5)
     * [1, 5]
     * > getOddCollatz(12)
     * [1, 3, 5]
     * > getOddCollatz(1)
     * [1]
     */
    public static List<Integer> getOddCollatz(int n) {
        List<Integer> result = new ArrayList<Integer>();
        while (n != 1) {
            if (n % 2 == 1) {
                result.add(n);
            }
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        result.add(1);
        Collections.sort(result);
        return result;
    }
}

// GetOddCollatzTest.java
package original;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetOddCollatz}.
* It contains ten unit test cases for the {@link GetOddCollatz#getOddCollatz(int)} method.
*/
class GetOddCollatzTest {
    @Test
    void testGetOddCollatz() {
        List<Integer> expected = Arrays.asList(1, 5);
        List<Integer> actual = GetOddCollatz.getOddCollatz(5);
        assertEquals(expected, actual);
        
        expected = Arrays.asList(1, 3, 5);
        actual = GetOddCollatz.getOddCollatz(12);
        assertEquals(expected, actual);
        
        expected = Arrays.asList(1);
        actual = GetOddCollatz.getOddCollatz(1);
        assertEquals(expected, actual);
        
        expected = Arrays.asList(1, 5, 7, 11, 13, 17);
        actual = GetOddCollatz.getOddCollatz(14);
        assertEquals(expected, actual);
        
        expected = Arrays.asList(1, 3, 5, 7, 9, 11, 15, 19, 23, 27, 31, 41, 47, 55, 71, 77, 83, 95, 107, 119, 123, 143, 159, 191, 207, 239, 255, 279, 311, 335, 371, 407, 431, 447, 479, 575, 599, 671, 703, 767, 799, 959, 991, 1023, 1087, 1151, 1279, 1343, 1823, 1951, 2015, 2559, 2687, 2735, 3135, 3263, 3455, 3647, 4031, 4095, 4369, 5119, 5461, 5567, 8191, 8199, 9103, 9331, 11263, 12287, 13055, 13107, 17407, 21845, 21847, 26207, 29791, 32767, 32769, 43691, 52487, 65535);
        actual = GetOddCollatz.getOddCollatz(65535);
        assertEquals(expected, actual);
        
        expected = Arrays.asList(1, 3, 5, 7, 9, 11, 15, 19, 23, 27, 31, 41, 47, 55, 71, 77, 83, 95, 107, 119, 123, 143, 159, 191, 207, 239, 255, 279, 311, 335, 371, 407, 431, 447, 479, 575, 599, 671, 703, 767, 799, 959, 991, 1023, 1087, 1151, 1279, 1343, 1823, 1951, 2015, 2559, 2687, 2735, 3135, 3263, 3455, 3647, 4031, 4095, 4369, 5119, 5461, 5567, 8191, 8199, 9103, 9331, 11263, 12287, 13055, 13107, 17407, 21845, 21847, 26207, 29791, 32767, 32769, 43691, 52487, 65535);
        actual = GetOddCollatz.getOddCollatz(65535);
        assertEquals(expected, actual);
        
        expected = Arrays.asList(1, 3, 5, 7, 9, 11, 15, 19, 23, 27, 31, 41, 47, 55, 71, 77, 83, 95, 107, 119, 123, 143, 159, 191, 207, 239, 255, 279, 311, 335, 371, 407, 431, 447, 479, 575, 599, 671, 703, 767, 799, 959, 991, 1023, 1087, 1151, 1279, 1343, 1823, 1951, 2015, 2559, 2687, 2735, 3135, 3263, 3455, 3647, 4031, 4095, 4369, 5119, 5461, 5567, 8191, 8199, 9103, 9331, 11263, 12287, 13055, 13107, 17407, 21845, 21847, 26207, 29791, 32767, 32769, 43691, 52487, 65535);
        actual = GetOddCollatz.getOddCollatz(65535);
        assertEquals(expected, actual);
        
        expected = Arrays.asList(1, 3, 5, 7, 9, 11, 15, 19, 23, 27, 31, 41, 47, 55, 71, 77, 83, 95, 107, 119, 123, 143, 159, 191, 207, 239, 255, 279, 311, 335, 371, 407, 431, 447, 479, 575, 599, 671, 703, 767, 799, 959, 991, 1023, 1087, 1151, 1279, 1343, 1823, 1951, 2015, 2559, 2687, 2735, 3135, 3263, 3455, 3647, 4031, 4095, 4369, 5119, 5461, 5567, 8191, 8199, 9103, 9331, 11263, 12287, 13055, 13107, 17407, 21845, 21847, 26207, 29791, 32767, 32769, 43691, 52487, 65535);
        actual = GetOddCollatz.getOddCollatz(65535);
        assertEquals(expected, actual);
        
        expected = Arrays.asList(1, 3, 5, 7, 9, 11, 15, 19, 23, 27, 31, 41, 47