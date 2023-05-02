// Minsubarraysum.java
package original;

import java.util.List;

class Minsubarraysum {

    /**
     * Given an array of integers nums, find the minimum sum of any non-empty sub-array
     * of nums.
     * Example
     * minSubArraySum([2, 3, 4, 1, 2, 4]) == 1
     * minSubArraySum([-1, -2, -3]) == -6
     *
     * @param nums List of integers
     * @return Minimum sum of any non-empty sub-array of nums
     */
    public static long minsubarraysum(List<Object> nums) {
        long s = 0;
        long max_sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            long num = ((Number) nums.get(i)).longValue();
            s -= num;
            if (s < 0) {
                s = 0;
            }
            max_sum = Math.max(s, max_sum);
        }
        if (max_sum == 0) {
            max_sum = -((Number) nums.get(0)).longValue();
            for (int i = 0; i < nums.size(); i++) {
                max_sum = Math.max(-((Number) nums.get(i)).longValue(), max_sum);
            }
        }
        long min_sum = -max_sum;
        return min_sum;
    }
}

// MinsubarraysumTest.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minsubarraysum}.
* It contains ten unit test cases for the {@link Minsubarraysum#minsubarraysum(List)} method.
*/
class MinsubarraysumTest {
    
    @Test
    void testMinSubArraySum1() {
        List<Object> nums = Arrays.asList(2, 3, 4, 1, 2, 4);
        long expected = 1;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMinSubArraySum2() {
        List<Object> nums = Arrays.asList(-1, -2, -3);
        long expected = -6;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMinSubArraySum3() {
        List<Object> nums = Arrays.asList(-1, -2, -3, 2, -10);
        long expected = -14;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMinSubArraySum4() {
        List<Object> nums = Arrays.asList(-9999999999999999L);
        long expected = -9999999999999999L;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMinSubArraySum5() {
        List<Object> nums = Arrays.asList(0, 10, 20, 1000000);
        long expected = 0;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMinSubArraySum6() {
        List<Object> nums = Arrays.asList(-1, -2, -3, 10, -5);
        long expected = -6;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMinSubArraySum7() {
        List<Object> nums = Arrays.asList(100, -1, -2, -3, 10, -5);
        long expected = -6;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMinSubArraySum8() {
        List<Object> nums = Arrays.asList(10, 11, 13, 8, 3, 4);
        long expected = 3;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMinSubArraySum9() {
        List<Object> nums = Arrays.asList(100, -33, 32, -1, 0, -2);
        long expected = -33;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMinSubArraySum10() {
        List<Object> nums = Arrays.asList(-10);
        long expected = -10;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMinSubArraySum11() {
        List<Object> nums = Arrays.asList(7);
        long expected = 7;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMinSubArraySum12() {
        List<Object> nums = Arrays.asList(1, -1);
        long expected = -1;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }
}