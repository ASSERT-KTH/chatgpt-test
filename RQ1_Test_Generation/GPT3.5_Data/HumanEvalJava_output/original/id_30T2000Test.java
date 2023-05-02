// GetPositive.java
package updated;

import java.util.ArrayList;
import java.util.List;

class GetPositive {

    /**
     * Return only positive numbers in the list.
     *
     * @param l the list of integers
     * @return the list of positive integers
     */
    public static List<Integer> getPositive(List<Integer> l) {
        List<Integer> result = new ArrayList<Integer>();
        for (Integer value : l) {
            if (value > 0) {
                result.add(value);
            }
        }
        return result;
    }
}

// GetPositiveTest.java
package updated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains ten unit test cases for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {

    @Test
    void testGetPositiveWithNegativeNumbers() {
        List<Integer> input = Arrays.asList(-1, -2, -3, -4, -5);
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = GetPositive.getPositive(input);
        assertEquals(expected, actual);
    }

    @Test
    void testGetPositiveWithPositiveNumbers() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> actual = GetPositive.getPositive(input);
        assertEquals(expected, actual);
    }

    @Test
    void testGetPositiveWithMixedNumbers() {
        List<Integer> input = Arrays.asList(-1, 2, -4, 5, 6);
        List<Integer> expected = Arrays.asList(2, 5, 6);
        List<Integer> actual = GetPositive.getPositive(input);
        assertEquals(expected, actual);
    }

    @Test
    void testGetPositiveWithZero() {
        List<Integer> input = Arrays.asList(0, 1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> actual = GetPositive.getPositive(input);
        assertEquals(expected, actual);
    }

    @Test
    void testGetPositiveWithEmptyList() {
        List<Integer> input = new ArrayList<Integer>();
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = GetPositive.getPositive(input);
        assertEquals(expected, actual);
    }

    @Test
    void testGetPositiveWithNullList() {
        List<Integer> input = null;
        assertThrows(NullPointerException.class, () -> {
            GetPositive.getPositive(input);
        });
    }

    @Test
    void testGetPositiveWithLargeList() {
        List<Integer> input = new ArrayList<Integer>();
        for (int i = -100000; i <= 100000; i++) {
            input.add(i);
        }
        List<Integer> expected = new ArrayList<Integer>();
        for (int i = 1; i <= 100000; i++) {
            expected.add(i);
        }
        List<Integer> actual = GetPositive.getPositive(input);
        assertEquals(expected, actual);
    }

    @Test
    void testGetPositiveWithDuplicateNumbers() {
        List<Integer> input = Arrays.asList(1, 2, 3, 2, 1);
        List<Integer> expected = Arrays.asList(1, 2, 3, 2, 1);
        List<Integer> actual = GetPositive.getPositive(input);
        assertEquals(expected, actual);
    }

    @Test
    void testGetPositiveWithLargePositiveNumbers() {
        List<Integer> input = Arrays.asList(Integer.MAX_VALUE, Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 2);
        List<Integer> expected = Arrays.asList(Integer.MAX_VALUE, Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 2);
        List<Integer> actual = GetPositive.getPositive(input);
        assertEquals(expected, actual);
    }

    @Test
    void testGetPositiveWithLargeNegativeNumbers() {
        List<Integer> input = Arrays.asList(Integer.MIN_VALUE, Integer.MIN_VALUE + 1, Integer.MIN_VALUE + 2);
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = GetPositive.getPositive(input);
        assertEquals(expected, actual);
    }
}