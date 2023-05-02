// StrangeSortListTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrangeSortList}.
* It contains one unit test case for the {@link StrangeSortList#strangeSortList(List)} method.
*/
class StrangeSortListTest {
// StrangeSortList.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StrangeSortList {

    /**
     * * Given list of integers, return list in strange order.
     * Strange sorting, is when you start with the minimum value,
     * then maximum of the remaining integers, then minimum and so on.
     *
     * Examples:
     * strange_sort_list([1, 2, 3, 4]) == [1, 4, 2, 3]
     * strange_sort_list([5, 5, 5, 5]) == [5, 5, 5, 5]
     * strange_sort_list([]) == []
     *
     * > strangeSortList([1, 2, 3, 4])
     * [1, 4, 2, 3]
     * > strangeSortList([5, 6, 7, 8, 9])
     * [5, 9, 6, 8, 7]
     * > strangeSortList([1, 2, 3, 4, 5])
     * [1, 5, 2, 4, 3]
     * > strangeSortList([5, 6, 7, 8, 9, 1])
     * [1, 9, 5, 8, 6, 7]
     * > strangeSortList([5, 5, 5, 5])
     * [5, 5, 5, 5]
     * > strangeSortList([])
     * []
     * > strangeSortList([1, 2, 3, 4, 5, 6, 7, 8])
     * [1, 8, 2, 7, 3, 6, 4, 5]
     * > strangeSortList([0, 2, 2, 2, 5, 5, -5, -5])
     * [-5, 5, -5, 5, 0, 2, 2, 2]
     * > strangeSortList([111111])
     * [111111]
     */
    public static List<Object> strangeSortList(List<Object> lst) {
        List<Object> result = new ArrayList<Object>();
        List<Integer> sorted = new ArrayList<Integer>();
        for (Object value : lst) {
            if (value instanceof Integer) {
                sorted.add((Integer) value);
            }
        }
        Collections.sort(sorted);
        int i = 0;
        int j = sorted.size() - 1;
        while (i <= j) {
            result.add(sorted.get(i));
            if (i!= j) {
                result.add(sorted.get(j));
            }
            i++;
            j--;
        }
        return result;
    }
}

// StrangeSortListTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrangeSortList}.
* It contains one unit test case for the {@link StrangeSortList#strangeSortList(List)} method.
*/
class StrangeSortListTest {
		// Test cases
		private List<Object> testCases = new ArrayList<Object>();
		// Tests
		@Test
		public void testInitTest() {
				// 1. test construct empty list with all empty values
				List<Integer> res = new ArrayList<Integer>();
				assertTrue(StrangeSortList.strangeSortList(res).isEmpty());
				assertTrue(StrangeSortList.strangeSortList(null).isEmpty());
				Integer[] array = new Integer[] { 1, 0, null };
				res = StrangeSortList.strangeSortList(array);
				assertTrue(StrangeSortList.strangeSortList(res).isEmpty());
				assertEquals(0, res.size());
				assertEquals(0, StrangeSortList.strangeSortList(new ArrayList<Integer>()).size());
				Integer[] array2 = new Integer[] { 1, 0, 10 };
				res = StrangeSortList.strangeSortList(array2);
				assertEquals("[1,10,[10,[],]]", StrangeSortList.strangeSortList(res).toString());
				assertTrue(StrangeSortList.strangeSortList(res).isEmpty());
				assertEquals(res.size(), StrangeSortList.strangeSortList(new ArrayList<Integer>()).size());
				Integer[] array3 = new Integer[] { 1, 0, 10, 12, 14 };
				res = StrangeSortList.strangeSortList(array3);
				assertEquals("[1,0,[[10,[12,14]],],1,10,[],]]", StrangeSortList.strangeSortList(res).toString());
				assertTrue(StrangeSortList.strangeSortList(res).isEmpty());
			}
		@Test
		public void testInitAllTest() {
				//1. test construct all empty list
				Integer[] array = new Integer[] { 1, 0, 10, 11, 12 };
				List<Integer> res = StrangeSortList.strangeSortList(array);
				assertTrue(StrangeSortList.strangeSortList(res).isEmpty());
				assertEquals(0, res.size());
				if (StrangeSortList.strangeSortList(new ArrayList<Integer>()).isEmpty()) assertTrue("test 1 - ArrayList is empty", false);
				assertEquals(StrangeSortList.strangeSortList(array).size(), 1);
				assertTrue(StrangeSortList.strangeSortList(array).isEmpty());
				assertTrue(StrangeSortList.strangeSortList(null).contains(0));
		}
		@Test
		public void testStrangeSortedList() {
				List<Integer> res = StrangeSortList.strangeSortList(testCases);
				assertTrue(StrangeSortList.strangeSortList(res).size() == res.size());
		}
		@Test
		public void testStrangeOrderedList() {
				List<Integer> res = StrangeSortList.strangeSortList(testCases);
				assertEquals("[1,", res.toString());
		}
}
