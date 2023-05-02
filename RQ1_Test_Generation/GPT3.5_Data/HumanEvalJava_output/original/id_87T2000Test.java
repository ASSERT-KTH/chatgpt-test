// GetRow.java
package updated;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GetRow {

    /**
     * You are given a 2 dimensional data, as a nested lists,
     * which is similar to matrix, however, unlike matrices,
     * each row may contain a different number of columns.
     * Given lst, and integer x, find integers x in the list,
     * and return list of tuples, [(x1, y1), (x2, y2) ...] such that
     * each tuple is a coordinate - (row, columns), starting with 0.
     * Sort coordinates initially by rows in ascending order.
     * Also, sort coordinates of the row by columns in descending order.
     *
     * Examples:
     * getRow([
     * [1,2,3,4,5,6],
     * [1,2,3,4,1,6],
     * [1,2,3,4,5,1]
     * ], 1) == [(0, 0), (1, 4), (1, 0), (2, 5), (2, 0)]
     * getRow([], 1) == []
     * getRow([[], [1], [1, 2, 3]], 3) == [(2, 2)]
     *
     * > getRow([], 1)
     * []
     * > getRow([[1]], 2)
     * []
     * > getRow([[], [1], [1, 2, 3]], 3)
     * [[2, 2]]
     */
    public static List<List<Integer>> getRow(List<List<Integer>> lst, int x) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < lst.size(); i++) {
            List<Integer> row = lst.get(i);
            for (int j = 0; j < row.size(); j++) {
                if (row.get(j).equals(x)) {
                    List<Integer> coordinate = new ArrayList<>();
                    coordinate.add(i);
                    coordinate.add(j);
                    result.add(coordinate);
                }
            }
        }
        Collections.sort(result, new Comparator<List<Integer>>() {

            public int compare(List<Integer> c1, List<Integer> c2) {
                int row1 = c1.get(0);
                int row2 = c2.get(0);
                if (row1 != row2) {
                    return row1 - row2;
                }
                int col1 = c1.get(1);
                int col2 = c2.get(1);
                return col2 - col1;
            }
        });
        return result;
    }
}

// GetRowTest.java
package updated;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class of {@link GetRow}.
 * It contains ten unit test cases for the {@link GetRow#getRow(List, int)} method.
 */
class GetRowTest {

    @Test
    void testEmptyList() {
        List<List<Integer>> lst = new ArrayList<>();
        List<List<Integer>> result = GetRow.getRow(lst, 1);
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    void testSingleElementList() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(1));
        List<List<Integer>> result = GetRow.getRow(lst, 2);
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    void testListWithEmptyRow() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(new ArrayList<>());
        lst.add(Arrays.asList(1));
        lst.add(Arrays.asList(1, 2, 3));
        List<List<Integer>> result = GetRow.getRow(lst, 3);
        assertEquals(Arrays.asList(Arrays.asList(2, 2)), result);
    }

    @Test
    void testListWithMultipleRows() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(1, 2, 3, 4, 5, 6));
        lst.add(Arrays.asList(1, 2, 3, 4, 1, 6));
        lst.add(Arrays.asList(1, 2, 3, 4, 5, 1));
        List<List<Integer>> result = GetRow.getRow(lst, 1);
        assertEquals(Arrays.asList(Arrays.asList(0, 0), Arrays.asList(1, 4), Arrays.asList(1, 0), Arrays.asList(2, 5), Arrays.asList(2, 0)), result);
    }

    @Test
    void testListWithMultipleOccurrences() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(1, 2, 3, 4, 5, 6));
        lst.add(Arrays.asList(1, 2, 3, 4, 1, 6));
        lst.add(Arrays.asList(1, 2, 3, 4, 5, 1));
        List<List<Integer>> result = GetRow.getRow(lst, 4);
        assertEquals(Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 3), Arrays.asList(2, 3)), result);
    }

    @Test
    void testListWithNegativeNumbers() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(-1, -2, -3, -4, -5, -6));
        lst.add(Arrays.asList(-1, -2, -3, -4, -1, -6));
        lst.add(Arrays.asList(-1, -2, -3, -4, -5, -1));
        List<List<Integer>> result = GetRow.getRow(lst, -3);
        assertEquals(Arrays.asList(Arrays.asList(0, 2), Arrays.asList(1, 2), Arrays.asList(2, 2)), result);
    }

    @Test
    void testListWithDuplicates() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(1, 2, 3, 4, 5, 6));
        lst.add(Arrays.asList(1, 2, 3, 4, 1, 6));
        lst.add(Arrays.asList(1, 2, 3, 4, 5, 1));
        lst.add(Arrays.asList(1, 2, 3, 4, 1, 6));
        List<List<Integer>> result = GetRow.getRow(lst, 1);
        assertEquals(Arrays.asList(Arrays.asList(0, 0), Arrays.asList(1, 4), Arrays.asList(1, 0), Arrays.asList(2, 5), Arrays.asList(2, 0), Arrays.asList(3, 4), Arrays.asList(3, 0)), result);
    }

    @Test
    void testListWithNullValues() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(1, 2, 3, null, 5, 6));
        lst.add(Arrays.asList(1, 2, 3, 4, 1, 6));
        lst.add(Arrays.asList(1, 2, 3, 4, 5, null));
        List<List<Integer>> result = GetRow.getRow(lst, null);
        assertEquals(Arrays.asList(Arrays.asList(0, 3), Arrays.asList(2, 5), Arrays.asList(2, 0)), result);
    }

    @Test
    void testListWithAllNullValues() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(null, null, null, null, null, null));
        lst.add(Arrays.asList(null, null, null, null, null, null));
        lst.add(Arrays.asList(null, null, null, null, null, null));
        List<List<Integer>> result = GetRow.getRow(lst, null);
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    void testListWithAllSameValues() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(1, 1, 1, 1, 1, 1));
        lst.add(Arrays.asList(1, 1, 1, 1, 1, 1));
        lst.add(Arrays.asList(1, 1, 1, 1, 1, 1));
        List<List<Integer>> result = GetRow.getRow(lst, 1);
        assertEquals(Arrays.asList(Arrays.asList(0, 5), Arrays.asList(1, 5), Arrays.asList(2, 5), Arrays.asList(0, 4), Arrays.asList(1, 4), Arrays.asList(2, 4), Arrays.asList(0, 3), Arrays.asList(1, 3), Arrays.asList(2, 3), Arrays.asList(0, 2), Arrays.asList(1, 2), Arrays.asList(2, 2), Arrays.asList(0, 1), Arrays.asList(1, 1), Arrays.asList(2, 1), Arrays.asList(0, 0), Arrays.asList(1, 0), Arrays.asList(2, 0)), result);
    }

    @Test
    void testListWithDifferentDataTypes() {
        List<List<Object>> lst = new ArrayList<>();
        lst.add(Arrays.asList(1, 2, 3,