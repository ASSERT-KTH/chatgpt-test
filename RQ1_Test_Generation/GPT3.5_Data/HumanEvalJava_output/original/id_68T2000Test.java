// Pluck.java
package updated;

import java.util.ArrayList;
import java.util.List;

public class Pluck {

    /**
     * Given an array representing a branch of a tree that has non-negative integer nodes
     * your task is to pluck one of the nodes and return it.
     * The plucked node should be the node with the smallest even value.
     * If multiple nodes with the same smallest even value are found return the node that has smallest index.
     * The plucked node should be returned in a list, [ smallest_value, its index ],
     * If there are no even values or the given array is empty, return [].
     *
     * Example 1:
     * - Input: [4,2,3]
     * - Output: [2, 1]
     * - Explanation: 2 has the smallest even value, and 2 has the smallest index.
     * Example 2:
     * - Input: [1,2,3]
     * - Output: [2, 1]
     * - Explanation: 2 has the smallest even value, and 2 has the smallest index.
     * Example 3:
     * - Input: []
     * - Output: []
     * Example 4:
     * - Input: [5, 0, 3, 0, 4, 2]
     * - Output: [0, 1]
     * - Explanation: 0 is the smallest value, but  there are two zeros,
     * so we will choose the first zero, which has the smallest index.
     *
     * Constraints:
     * 1 <= nodes.length <= 10000
     * 0 <= node.value
     *
     * > pluck([4, 2, 3])
     * [2, 1]
     * > pluck([1, 2, 3])
     * [2, 1]
     * > pluck([])
     * []
     * > pluck([5, 0, 3, 0, 4, 2])
     * [0, 1]
     * > pluck([1, 2, 3, 0, 5, 3])
     * [0, 3]
     * > pluck([5, 4, 8, 4, 8])
     * [4, 1]
     * > pluck([7, 6, 7, 1])
     * [6, 1]
     * > pluck([7, 9, 7, 1])
     * []
     */
    public static List<Integer> pluck(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < arr.size(); i++) {
            int value = arr.get(i);
            if (value % 2 == 0 && value < min) {
                min = value;
                index = i;
            }
        }
        if (index != -1) {
            result.add(min);
            result.add(index);
        }
        return result;
    }
}

// PluckTest.java
package updated;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class of {@link Pluck}.
 * It contains ten unit test cases for the {@link Pluck#pluck(List)} method.
 */
class PluckTest {

    @Test
    void testPluckWithEvenValues() {
        List<Integer> arr = Arrays.asList(4, 2, 3);
        List<Integer> expected = Arrays.asList(2, 1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluckWithEvenValuesUnordered() {
        List<Integer> arr = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(2, 1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluckWithEmptyList() {
        List<Integer> arr = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluckWithMultipleEvenValues() {
        List<Integer> arr = Arrays.asList(5, 0, 3, 0, 4, 2);
        List<Integer> expected = Arrays.asList(0, 1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluckWithMultipleEvenValuesUnordered() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 0, 5, 3);
        List<Integer> expected = Arrays.asList(0, 3);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluckWithRepeatedEvenValues() {
        List<Integer> arr = Arrays.asList(5, 4, 8, 4, 8);
        List<Integer> expected = Arrays.asList(4, 1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluckWithNoEvenValues() {
        List<Integer> arr = Arrays.asList(7, 6, 7, 1);
        List<Integer> expected = Arrays.asList(6, 1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluckWithAllOddValues() {
        List<Integer> arr = Arrays.asList(7, 9, 7, 1);
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluckWithMaxValues() {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            arr.add(i);
        }
        List<Integer> expected = Arrays.asList(0, 0);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluckWithMaxValuesAndNoEvenValues() {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            arr.add(i * 2 + 1);
        }
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, Pluck.pluck(arr));
    }
}