// Here's the source code for the OrderByPointsTest class:

package original;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderByPointsTest {

    @Test
    void testOrderByPoints() {
        List<Object> nums = new ArrayList<>(Arrays.asList(1, 11, -1, -11, -12));
        List<Object> expected = new ArrayList<>(Arrays.asList(-1, -11, 1, -12, 11));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));

        nums = new ArrayList<>(Arrays.asList(1234, 423, 463, 145, 2, 423, 423, 53, 6, 37, 3457, 3, 56, 0, 46));
        expected = new ArrayList<>(Arrays.asList(0, 2, 3, 6, 53, 423, 423, 423, 1234, 145, 37, 46, 56, 463, 3457));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));

        nums = new ArrayList<>(Arrays.asList());
        expected = new ArrayList<>(Arrays.asList());
        assertEquals(expected, OrderByPoints.orderByPoints(nums));

        nums = new ArrayList<>(Arrays.asList(1, -11, -32, 43, 54, -98, 2, -3));
        expected = new ArrayList<>(Arrays.asList(-3, -32, -98, -11, 1, 2, 43, 54));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));

        nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        expected = new ArrayList<>(Arrays.asList(1, 10, 2, 11, 3, 4, 5, 6, 7, 8, 9));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));

        nums = new ArrayList<>(Arrays.asList(0, 6, 6, -76, -21, 23, 4));
        expected = new ArrayList<>(Arrays.asList(-76, -21, 0, 4, 23, 6, 6));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));

        nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11));
        expected = new ArrayList<>(Arrays.asList(-11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));

        nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, 0));
        expected = new ArrayList<>(Arrays.asList(-11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));

        nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, 0, 0));
        expected = new ArrayList<>(Arrays.asList(-11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));

        nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, 0, 0, 0));
        expected = new ArrayList<>(Arrays.asList(-11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));

        nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, 0, 0, 0, 0));
        expected = new ArrayList<>(Arrays.asList(-11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }
}