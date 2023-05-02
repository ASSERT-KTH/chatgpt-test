// LargestSmallestIntegers.java
package updated;

import java.util.ArrayList;
import java.util.List;

class LargestSmallestIntegers {

    /**
     * * Create a function that returns a tuple (a, b), where 'a' is
     * the largest of negative integers, and 'b' is the smallest
     * of positive integers in a list.
     * If there is no negative or positive integers, return them as None.
     *
     * Examples:
     * largestSmallestIntegers([2, 4, 1, 3, 5, 7]) == (None, 1)
     * largestSmallestIntegers([]) == (None, None)
     * largestSmallestIntegers([0]) == (None, None)
     *
     * > largestSmallestIntegers([2, 4, 1, 3, 5, 7])
     * [null, 1]
     * > largestSmallestIntegers([2, 4, 1, 3, 5, 7, 0])
     * [null, 1]
     * > largestSmallestIntegers([1, 3, 2, 4, 5, 6, -2])
     * [-2, 1]
     * > largestSmallestIntegers([4, 5, 3, 6, 2, 7, -7])
     * [-7, 2]
     * > largestSmallestIntegers([7, 3, 8, 4, 9, 2, 5, -9])
     * [-9, 2]
     * > largestSmallestIntegers([])
     * [null, null]
     * > largestSmallestIntegers([0])
     * [null, null]
     * > largestSmallestIntegers([-1, -3, -5, -6])
     * [-1, null]
     * > largestSmallestIntegers([-1, -3, -5, -6, 0])
     * [-1, null]
     * > largestSmallestIntegers([-6, -4, -4, -3, 1])
     * [-3, 1]
     * > largestSmallestIntegers([-6, -4, -4, -3, -100, 1])
     * [-3, 1]
     */
    public static List<Integer> largestSmallestIntegers(List<Integer> lst) {
        List<Integer> result = new ArrayList<Integer>();
        int largestNegative = Integer.MIN_VALUE;
        int smallestPositive = Integer.MAX_VALUE;
        for (int i = 0; i < lst.size(); i++) {
            int curr = lst.get(i);
            if (curr < 0) {
                if (curr > largestNegative) {
                    largestNegative = curr;
                }
            } else if (curr > 0) {
                if (curr < smallestPositive) {
                    smallestPositive = curr;
                }
            }
        }
        if (largestNegative == Integer.MIN_VALUE) {
            result.add(null);
        } else {
            result.add(largestNegative);
        }
        if (smallestPositive == Integer.MAX_VALUE) {
            result.add(null);
        } else {
            result.add(smallestPositive);
        }
        return result;
    }
}

// LargestSmallestIntegersTest.java
package updated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestSmallestIntegers}.
* It contains ten unit test cases for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
*/
class LargestSmallestIntegersTest {
    
    @Test
    void testLargestSmallestIntegers() {
        List<Integer> lst1 = Arrays.asList(2, 4, 1, 3, 5, 7);
        List<Integer> lst2 = new ArrayList<Integer>();
        List<Integer> lst3 = Arrays.asList(0);
        List<Integer> lst4 = Arrays.asList(1, 3, 2, 4, 5, 6, -2);
        List<Integer> lst5 = Arrays.asList(4, 5, 3, 6, 2, 7, -7);
        List<Integer> lst6 = Arrays.asList(7, 3, 8, 4, 9, 2, 5, -9);
        List<Integer> lst7 = new ArrayList<Integer>();
        List<Integer> lst8 = Arrays.asList(-1, -3, -5, -6);
        List<Integer> lst9 = Arrays.asList(-1, -3, -5, -6, 0);
        List<Integer> lst10 = Arrays.asList(-6, -4, -4, -3, 1);
        List<Integer> lst11 = Arrays.asList(-6, -4, -4, -3, -100, 1);
        
        assertEquals(Arrays.asList(null, 1), LargestSmallestIntegers.largestSmallestIntegers(lst1));
        assertEquals(Arrays.asList(null, null), LargestSmallestIntegers.largestSmallestIntegers(lst2));
        assertEquals(Arrays.asList(null, null), LargestSmallestIntegers.largestSmallestIntegers(lst3));
        assertEquals(Arrays.asList(-2, 1), LargestSmallestIntegers.largestSmallestIntegers(lst4));
        assertEquals(Arrays.asList(-7, 2), LargestSmallestIntegers.largestSmallestIntegers(lst5));
        assertEquals(Arrays.asList(-9, 2), LargestSmallestIntegers.largestSmallestIntegers(lst6));
        assertEquals(Arrays.asList(null, null), LargestSmallestIntegers.largestSmallestIntegers(lst7));
        assertEquals(Arrays.asList(-1, null), LargestSmallestIntegers.largestSmallestIntegers(lst8));
        assertEquals(Arrays.asList(-1, null), LargestSmallestIntegers.largestSmallestIntegers(lst9));
        assertEquals(Arrays.asList(-3, 1), LargestSmallestIntegers.largestSmallestIntegers(lst10));
        assertEquals(Arrays.asList(-3, 1), LargestSmallestIntegers.largestSmallestIntegers(lst11));
    }
}