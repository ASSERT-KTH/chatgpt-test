// GetRowTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetRow}.
* It contains one unit test case for the {@link GetRow#getRow(List, int)} method.
*/
class GetRowTest {
// GetRow.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class GetRow {

    /**
     * * You are given a 2 dimensional data, as a nested lists,
     * which is similar to matrix, however, unlike matrices,
     * each row may contain a different number of columns.
     * Given lst, and integer x, find integers x in the list,
     * and return list of tuples, [(x1, y1), (x2, y2)...] such that
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
    public static List<Object> getRow(List<Object> lst, int x) {
        List<Object> result = new ArrayList<Object>();
        for (int i = 0; i < lst.size(); i++) {
            List<Object> row = (List<Object>) lst.get(i);
            for (int j = 0; j < row.size(); j++) {
                if (row.get(j).equals(x)) {
                    List<Object> coordinate = new ArrayList<Object>();
                    coordinate.add(i);
                    coordinate.add(j);
                    result.add(coordinate);
                }
            }
        }
        Collections.sort(result, new Comparator<Object>() {

            public int compare(Object o1, Object o2) {
                List<Object> c1 = (List<Object>) o1;
                List<Object> c2 = (List<Object>) o2;
                int row1 = (Integer) c1.get(0);
                int row2 = (Integer) c2.get(0);
                if (row1!= row2) {
                    return row1 - row2;
                }
                int col1 = (Integer) c1.get(1);
                int col2 = (Integer) c2.get(1);
                return col2 - col1;
            }
        });
        return result;
    }
}

// GetRowTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetRow}.
* It contains one unit test case for the {@link GetRow#getRow(List, int)} method.
*/
class GetRowTest {
		
		/*
	 * It is not necessary to implement the public constructor of this class, because
	 * this test class is only used by the unit tests under test.
	 */
	@Test
	public void testInit() {
		GetRow instance = new GetRow();
		List<Object> lst = new ArrayList<Object>(Collections.<Object>reverseOrder());
		List<Object> result = instance.getRow(lst, 1);
		
		assertNotNull("instance.getRow() returned a null list", result);
		assertTrue("result.size() == 2", result.size() == 2);
		assertTrue("The first element of returned list is the list's row", result.get(0) instanceof Integer);
		assertEquals("result.get(0).toString()", "1", result.get(0).toString());
		assertTrue("The second element of returned list is a list of column names", ((List<Object>) result.get(1)).size() == lst.size());
		Collections.sort(result, new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				if (o1 instanceof Integer)
					return ((Integer) o2).intValue() - ((Integer) o1).intValue();
				else
					return ((List<Object>) o2).get(0).toString() - ((List<Object>) o1).get(0).toString();
			}
		});
	}
}