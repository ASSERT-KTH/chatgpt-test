// IsSorted.java
package updated;

import java.util.HashMap;
import java.util.List;

class IsSorted {

    /**
     * Given a list of numbers, return whether or not they are sorted
     * in ascending order. If list has more than 1 duplicate of the same
     * number, return False. Assume no negative numbers and only integers.
     *
     * Examples
     * isSorted([5]) ➞ True
     * isSorted([1, 2, 3, 4, 5]) ➞ True
     * isSorted([1, 3, 2, 4, 5]) ➞ False
     * isSorted([1, 2, 3, 4, 5, 6]) ➞ True
     * isSorted([1, 2, 3, 4, 5, 6, 7]) ➞ True
     * isSorted([1, 3, 2, 4, 5, 6, 7]) ➞ False
     * isSorted([1, 2, 2, 3, 3, 4]) ➞ True
     * isSorted([1, 2, 2, 2, 3, 4]) ➞ False
     *
     * @param lst list of integers to check if sorted
     * @return true if the list is sorted in ascending order and has at most one duplicate of each number, false otherwise
     */
    public static Boolean isSorted(List<Integer> lst) {
        if (lst.size() <= 1) {
            return true;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < lst.size(); i++) {
            int curr = lst.get(i);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
            if (map.get(curr) > 2) {
                return false;
            }
        }
        int prev = lst.get(0);
        for (int i = 1; i < lst.size(); i++) {
            int curr = lst.get(i);
            if (curr < prev) {
                return false;
            }
            prev = curr;
        }
        return true;
    }
}

// IsSortedTest.java
package updated;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSorted}.
* It contains ten unit test cases for the {@link IsSorted#isSorted(List)} method.
*/
class IsSortedTest {

    @Test
    void testEmptyList() {
        List<Integer> lst = Arrays.asList();
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testSingleElementList() {
        List<Integer> lst = Arrays.asList(5);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testSortedAscendingList() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testUnsortedList() {
        List<Integer> lst = Arrays.asList(1, 3, 2, 4, 5);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testSortedListWithDuplicate() {
        List<Integer> lst = Arrays.asList(1, 2, 2, 3, 3, 4);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testSortedListWithMultipleDuplicates() {
        List<Integer> lst = Arrays.asList(1, 2, 2, 2, 3, 4);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testSortedListWithMultipleDuplicates2() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 3, 3, 4);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testSortedDescendingList() {
        List<Integer> lst = Arrays.asList(5, 4, 3, 2, 1);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testSortedListWithOneDuplicate() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 4);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testSortedListWithOneDuplicate2() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 3, 4);
        assertTrue(IsSorted.isSorted(lst));
    }
}