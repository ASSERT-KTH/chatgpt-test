// CountNums.java
package updated;

import java.util.List;

class CountNums {

    /**
     * * Write a function count_nums which takes an array of integers and returns
     * the number of elements which has a sum of digits > 0.
     * If a number is negative, then its first signed digit will be negative:
     * e.g. -123 has signed digits -1, 2, and 3.
     * >>> countNums([]) == 0
     * >>> countNums([-1, 11, -11]) == 1
     * >>> countNums([1, 1, 2]) == 3
     *
     * > countNums([])
     * 0
     * > countNums([-1, -2, 0])
     * 0
     * > countNums([1, 1, 2, -2, 3, 4, 5])
     * 6
     * > countNums([1, 6, 9, -6, 0, 1, 5])
     * 5
     * > countNums([1, 100, 98, -7, 1, -1])
     * 4
     * > countNums([12, 23, 34, -45, -56, 0])
     * 5
     * > countNums([0, 1])
     * 1
     * > countNums([1])
     * 1
     */
    public static int countNums(List<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum = 0;
            int num = arr.get(i);
            boolean isNegative = num < 0;
            if (isNegative) {
                num = -num;
            }
            while (num != 0) {
                if (isNegative && num / 10 == 0) {
                    sum -= num % 10;
                } else {
                    sum += num % 10;
                }
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }
}

// CountNumsTest.java
package updated;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountNums}.
* It contains ten unit test cases for the {@link CountNums#countNums(List)} method.
*/
class CountNumsTest {
    
    @Test
    void testEmptyList() {
        List<Integer> arr = Arrays.asList();
        assertEquals(0, CountNums.countNums(arr));
    }
    
    @Test
    void testAllNegativeNumbers() {
        List<Integer> arr = Arrays.asList(-1, -2, 0);
        assertEquals(0, CountNums.countNums(arr));
    }
    
    @Test
    void testAllPositiveNumbers() {
        List<Integer> arr = Arrays.asList(1, 1, 2, -2, 3, 4, 5);
        assertEquals(6, CountNums.countNums(arr));
    }
    
    @Test
    void testMixedNumbers() {
        List<Integer> arr = Arrays.asList(1, 6, 9, -6, 0, 1, 5);
        assertEquals(5, CountNums.countNums(arr));
    }
    
    @Test
    void testMixedNumbersWithNegativeSignedDigits() {
        List<Integer> arr = Arrays.asList(1, 100, 98, -7, 1, -1);
        assertEquals(4, CountNums.countNums(arr));
    }
    
    @Test
    void testMixedNumbersWithZero() {
        List<Integer> arr = Arrays.asList(12, 23, 34, -45, -56, 0);
        assertEquals(5, CountNums.countNums(arr));
    }
    
    @Test
    void testListWithOneZero() {
        List<Integer> arr = Arrays.asList(0, 1);
        assertEquals(1, CountNums.countNums(arr));
    }
    
    @Test
    void testListWithOnePositiveNumber() {
        List<Integer> arr = Arrays.asList(1);
        assertEquals(1, CountNums.countNums(arr));
    }
    
    @Test
    void testListWithOneNegativeNumber() {
        List<Integer> arr = Arrays.asList(-1);
        assertEquals(1, CountNums.countNums(arr));
    }
    
    @Test
    void testListWithOneNegativeNumberWithNegativeSignedDigit() {
        List<Integer> arr = Arrays.asList(-123);
        assertEquals(1, CountNums.countNums(arr));
    }
}