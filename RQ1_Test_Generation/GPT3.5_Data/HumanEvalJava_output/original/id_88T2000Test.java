// SortArray1.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortArray1 {

    /**
     * Given an array of non-negative integers, return a copy of the given array after sorting,
     * you will sort the given array in ascending order if the sum( first index value, last index value) is odd,
     * or sort it in descending order if the sum( first index value, last index value) is even.
     *
     * Note:
     * don't change the given array.
     *
     * Examples:
     * sort_array([]) => []
     * sort_array([5]) => [5]
     * sort_array([2, 4, 3, 0, 1, 5]) => [0, 1, 2, 3, 4, 5]
     * sort_array([2, 4, 3, 0, 1, 5, 6]) => [6, 5, 4, 3, 2, 1, 0]
     *
     * @param array the array to be sorted
     * @return a sorted copy of the given array
     */
    public static List<Integer> sortArray(List<Integer> array) {
        if (array.size() <= 1) {
            return array;
        }
        int sum = array.get(0) + array.get(array.size() - 1);
        List<Integer> sortedArray = new ArrayList<>(array);
        Collections.sort(sortedArray);
        if (sum % 2 == 0) {
            Collections.reverse(sortedArray);
        }
        return sortedArray;
    }
}

// SortArray1Test.java
package original;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class of {@link SortArray1}.
 * It contains ten unit test cases for the {@link SortArray1#sortArray(List)} method.
 */
class SortArray1Test {

    @Test
    void testSortArrayEmptyList() {
        List<Integer> array = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArraySingleElementList() {
        List<Integer> array = Arrays.asList(5);
        List<Integer> expected = Arrays.asList(5);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayOddSum() {
        List<Integer> array = Arrays.asList(2, 4, 3, 0, 1, 5);
        List<Integer> expected = Arrays.asList(0, 1, 2, 3, 4, 5);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayEvenSum() {
        List<Integer> array = Arrays.asList(2, 4, 3, 0, 1, 5, 6);
        List<Integer> expected = Arrays.asList(6, 5, 4, 3, 2, 1, 0);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayTwoElements() {
        List<Integer> array = Arrays.asList(2, 1);
        List<Integer> expected = Arrays.asList(1, 2);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayDescendingOrder() {
        List<Integer> array = Arrays.asList(15, 42, 87, 32, 11, 0);
        List<Integer> expected = Arrays.asList(0, 11, 15, 32, 42, 87);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayAscendingOrder() {
        List<Integer> array = Arrays.asList(21, 14, 23, 11);
        List<Integer> expected = Arrays.asList(23, 21, 14, 11);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayRepeatedElements() {
        List<Integer> array = Arrays.asList(2, 4, 3, 0, 1, 5, 6, 4, 5, 2);
        List<Integer> expected = Arrays.asList(6, 5, 5, 4, 4, 3, 2, 2, 1, 0);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayAllEqualElements() {
        List<Integer> array = Arrays.asList(5, 5, 5, 5, 5);
        List<Integer> expected = Arrays.asList(5, 5, 5, 5, 5);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayLargeList() {
        List<Integer> array = Arrays.asList(5, 2, 8, 3, 9, 1, 0, 4, 7, 6);
        List<Integer> expected = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(expected, SortArray1.sortArray(array));
    }
}