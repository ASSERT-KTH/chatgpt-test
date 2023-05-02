// DoubleTheDifferenceTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DoubleTheDifference}.
* It contains one unit test case for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
*/
class DoubleTheDifferenceTest {
// DoubleTheDifference.java
package original;

import java.util.List;

class DoubleTheDifference {

    /**
     * Given a list of numbers, return the sum of squares of the numbers
     * in the list that are odd. Ignore numbers that are negative or not integers.
     *
     * doubleTheDifference([1, 3, 2, 0]) == 1 + 9 + 0 + 0 = 10
     * doubleTheDifference([-1, -2, 0]) == 0
     * doubleTheDifference([9, -2]) == 81
     * doubleTheDifference([0]) == 0
     *
     * If the input list is empty, return 0.
     *
     * > doubleTheDifference([])
     * 0
     * > doubleTheDifference([5, 4])
     * 25
     * > doubleTheDifference([0.1, 0.2, 0.3])
     * 0
     * > doubleTheDifference([-10, -20, -30])
     * 0
     * > doubleTheDifference([-1, -2, 8])
     * 0
     * > doubleTheDifference([0.2, 3, 5])
     * 34
     * > doubleTheDifference([-99, -97, -95, -93, -91, -89, -87, -85, -83, -81, -79, -77, -75, -73, -71, -69, -67, -65, -63, -61, -59, -57, -55, -53, -51, -49, -47, -45, -43, -41, -39, -37, -35, -33, -31, -29, -27, -25, -23, -21, -19, -17, -15, -13, -11, -9, -7, -5, -3, -1, 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99])
     * 166650
     */
    public static int doubleTheDifference(List<Object> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) instanceof Integer) {
                int num = (int) lst.get(i);
                if (num % 2!= 0 && num > 0) {
                    sum += num * num;
                }
            }
        }
        return sum;
    }
}

// DoubleTheDifferenceTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DoubleTheDifference}.
* It contains one unit test case for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
*/
class DoubleTheDifferenceTest {
		/**
		 * Test double that when passed as a parameter, returns the same number as {@link DoubleType#doubleTheDifference(List)},
		 * with {@link DoubleType#doubleTheDifference(List)} being applied on a list of numbers equal to this number value.
		 * Then, doubleTheDifference.doubleTheDifference(list) can return the same number as the
		 * number that resulted from the call to this method.
		 *
		 * @throws Exception if an error occurs
		 */
    @Test
    public void doubleTheDifferenceWithNullList() throws InvalidParameterException, Exception {
        try {
	        assertEquals(8, DoubleTheDifference.doubleTheDifference(null));
	        assertEquals(9, DoubleTheDifference.doubleTheDifference(new ArrayList<>()));
	        assertEquals(1, DoubleTheDifference.doubleTheDifference(new int[]{1}));
	        assertEquals(0, DoubleTheDifference.doubleTheDifference(new double[]{0}));
            assertEquals(0, DoubleTheDifference.doubleTheDifference(new Object[]{}));
        } catch (final Exception e) {
            fail("Failed to check doubleTheDifferent function with null argument.");
        }
    }
}
