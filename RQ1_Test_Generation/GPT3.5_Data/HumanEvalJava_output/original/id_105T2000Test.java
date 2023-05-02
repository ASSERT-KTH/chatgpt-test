// ByLength.java
package updated;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ByLength {

    /**
     * Given an array of integers, sort the integers that are between 1 and 9 inclusive,
     * reverse the resulting array, and then replace each digit by its corresponding name from
     * "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine".
     *
     * For example:
     * arr = [2, 1, 1, 4, 5, 8, 2, 3]
     * -> sort arr -> [1, 1, 2, 2, 3, 4, 5, 8]
     * -> reverse arr -> [8, 5, 4, 3, 2, 2, 1, 1]
     * return ["Eight", "Five", "Four", "Three", "Two", "Two", "One", "One"]
     *
     * If the array is empty, return an empty array:
     * arr = []
     * return []
     *
     * If the array has any strange number ignore it:
     * arr = [1, -1 , 55]
     * -> sort arr -> [-1, 1, 55]
     * -> reverse arr -> [55, 1, -1]
     * return = ['One']
     *
     * @param arr the input array of integers
     * @return the list of corresponding names of integers between 1 and 9 inclusive
     */
    public static List<String> byLength(List<Integer> arr) {
        List<Integer> sorted = new ArrayList<>();
        for (Integer value : arr) {
            if (value >= 1 && value <= 9) {
                sorted.add(value);
            }
        }
        Collections.sort(sorted);
        Collections.reverse(sorted);
        List<String> result = new ArrayList<>();
        for (Integer value : sorted) {
            switch (value) {
                case 1:
                    result.add("One");
                    break;
                case 2:
                    result.add("Two");
                    break;
                case 3:
                    result.add("Three");
                    break;
                case 4:
                    result.add("Four");
                    break;
                case 5:
                    result.add("Five");
                    break;
                case 6:
                    result.add("Six");
                    break;
                case 7:
                    result.add("Seven");
                    break;
                case 8:
                    result.add("Eight");
                    break;
                case 9:
                    result.add("Nine");
                    break;
            }
        }
        return result;
    }
}

// ByLengthTest.java
package updated;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class of {@link ByLength}.
 * It contains ten unit test cases for the {@link ByLength#byLength(List)} method.
 */
class ByLengthTest {

    @Test
    void testEmptyArray() {
        List<Integer> arr = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testArrayWithStrangeNumbers() {
        List<Integer> arr = Arrays.asList(1, -1, 55);
        List<String> expected = Arrays.asList("One");
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testArrayWithAllNumbersBetweenOneAndNine() {
        List<Integer> arr = Arrays.asList(2, 1, 1, 4, 5, 8, 2, 3);
        List<String> expected = Arrays.asList("Eight", "Five", "Four", "Three", "Two", "Two", "One", "One");
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testArrayWithAllNumbersGreaterThanNine() {
        List<Integer> arr = Arrays.asList(10, 11, 12);
        List<String> expected = new ArrayList<>();
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testArrayWithAllNumbersLessThanOne() {
        List<Integer> arr = Arrays.asList(-1, 0);
        List<String> expected = new ArrayList<>();
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testArrayWithOneNumberBetweenOneAndNine() {
        List<Integer> arr = Arrays.asList(3);
        List<String> expected = Arrays.asList("Three");
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testArrayWithOneNumberLessThanOne() {
        List<Integer> arr = Arrays.asList(0);
        List<String> expected = new ArrayList<>();
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testArrayWithOneNumberGreaterThanNine() {
        List<Integer> arr = Arrays.asList(10);
        List<String> expected = new ArrayList<>();
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testArrayWithRepeatedNumbers() {
        List<Integer> arr = Arrays.asList(2, 2, 2, 1, 1, 1, 3, 3, 3);
        List<String> expected = Arrays.asList("Three", "Three", "Three", "Two", "Two", "Two", "One", "One", "One");
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testArrayWithNumbersInDescendingOrder() {
        List<Integer> arr = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1);
        List<String> expected = Arrays.asList("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One");
        assertEquals(expected, ByLength.byLength(arr));
    }
}