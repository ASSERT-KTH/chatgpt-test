// SumSquares.java
package updated;

import java.util.List;

class SumSquares {

    /**
     * You are given a list of numbers.
     * You need to return the sum of squared numbers in the given list,
     * round each element in the list to the upper int(Ceiling) first.
     * Examples:
     * For lst = [1,2,3] the output should be 14
     * For lst = [1,4,9] the output should be 98
     * For lst = [1,3,5,7] the output should be 84
     * For lst = [1.4,4.2,0] the output should be 29
     * For lst = [-2.4,1,1] the output should be 6
     *
     * > sumSquares([1, 2, 3])
     * 14
     * > sumSquares([1.0, 2, 3])
     * 14
     * > sumSquares([1, 3, 5, 7])
     * 84
     * > sumSquares([1.4, 4.2, 0])
     * 29
     * > sumSquares([-2.4, 1, 1])
     * 6
     * > sumSquares([100, 1, 15, 2])
     * 10230
     * > sumSquares([10000, 10000])
     * 200000000
     * > sumSquares([-1.4, 4.6, 6.3])
     * 75
     * > sumSquares([-1.4, 17.9, 18.9, 19.9])
     * 1086
     * > sumSquares([0])
     * 0
     * > sumSquares([-1])
     * 1
     * > sumSquares([-1, 1, 0])
     * 2
     */
    public static int sumSquares(List<Number> lst) {
        int sum = 0;
        for (Number n : lst) {
            sum += Math.pow(Math.ceil(n.doubleValue()), 2);
        }
        return sum;
    }
}

// SumSquaresTest.java
package updated;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares}.
* It contains twelve unit test cases for the {@link SumSquares#sumSquares(List)} method.
*/
class SumSquaresTest {
    
    @Test
    void testSumSquaresWithPositiveIntegers() {
        List<Number> lst = Arrays.asList(1, 2, 3);
        assertEquals(14, SumSquares.sumSquares(lst));
    }
    
    @Test
    void testSumSquaresWithPositiveIntegersAndDouble() {
        List<Number> lst = Arrays.asList(1.0, 2, 3);
        assertEquals(14, SumSquares.sumSquares(lst));
    }
    
    @Test
    void testSumSquaresWithOddIntegers() {
        List<Number> lst = Arrays.asList(1, 3, 5, 7);
        assertEquals(84, SumSquares.sumSquares(lst));
    }
    
    @Test
    void testSumSquaresWithPositiveDoubles() {
        List<Number> lst = Arrays.asList(1.4, 4.2, 0);
        assertEquals(29, SumSquares.sumSquares(lst));
    }
    
    @Test
    void testSumSquaresWithNegativeDoublesAndIntegers() {
        List<Number> lst = Arrays.asList(-2.4, 1, 1);
        assertEquals(6, SumSquares.sumSquares(lst));
    }
    
    @Test
    void testSumSquaresWithLargeIntegers() {
        List<Number> lst = Arrays.asList(100, 1, 15, 2);
        assertEquals(10230, SumSquares.sumSquares(lst));
    }
    
    @Test
    void testSumSquaresWithSameLargeIntegers() {
        List<Number> lst = Arrays.asList(10000, 10000);
        assertEquals(200000000, SumSquares.sumSquares(lst));
    }
    
    @Test
    void testSumSquaresWithNegativeAndPositiveDoubles() {
        List<Number> lst = Arrays.asList(-1.4, 4.6, 6.3);
        assertEquals(75, SumSquares.sumSquares(lst));
    }
    
    @Test
    void testSumSquaresWithNegativeAndPositiveDoublesGreaterThan10() {
        List<Number> lst = Arrays.asList(-1.4, 17.9, 18.9, 19.9);
        assertEquals(1086, SumSquares.sumSquares(lst));
    }
    
    @Test
    void testSumSquaresWithZero() {
        List<Number> lst = Arrays.asList(0);
        assertEquals(0, SumSquares.sumSquares(lst));
    }
    
    @Test
    void testSumSquaresWithNegativeInteger() {
        List<Number> lst = Arrays.asList(-1);
        assertEquals(1, SumSquares.sumSquares(lst));
    }
    
    @Test
    void testSumSquaresWithNegativeAndPositiveIntegers() {
        List<Number> lst = Arrays.asList(-1, 1, 0);
        assertEquals(2, SumSquares.sumSquares(lst));
    }
}