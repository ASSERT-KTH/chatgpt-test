// NextSmallest.java
package updated;

import java.util.List;

class NextSmallest {

    /**
     * * You are given a list of integers.
     * Write a function next_smallest() that returns the 2nd smallest element of the list.
     * Return null if there is no such element.
     * Examples:
     * nextSmallest([1, 2, 3, 4, 5]) == 2
     * nextSmallest([5, 1, 4, 3, 2]) == 2
     * nextSmallest([]) == null
     * nextSmallest([1, 1]) == null
     *
     * > nextSmallest([1, 2, 3, 4, 5])
     * 2
     * > nextSmallest([5, 1, 4, 3, 2])
     * 2
     * > nextSmallest([])
     * null
     * > nextSmallest([1, 1])
     * null
     * > nextSmallest([1, 1, 1, 1, 0])
     * 1
     * > nextSmallest([1, 1])
     * null
     * > nextSmallest([-35, 34, 12, -45])
     * -35
     */
    public static Integer nextSmallest(List<Integer> lst) {
        if (lst.size() <= 1) {
            return null;
        }
        Integer smallest = lst.get(0);
        Integer nextSmallest = null;
        for (int i = 1; i < lst.size(); i++) {
            Integer current = lst.get(i);
            if (current < smallest) {
                nextSmallest = smallest;
                smallest = current;
            } else if (nextSmallest == null || current < nextSmallest) {
                if (!current.equals(smallest))
                    nextSmallest = current;
            }
        }
        return nextSmallest;
    }
}

// NextSmallestTest.java
package updated;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NextSmallest}.
* It contains ten unit test cases for the {@link NextSmallest#nextSmallest(List)} method.
*/
class NextSmallestTest {
    
    @Test
    void testNextSmallest() {
        List<Integer> lst1 = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(2, NextSmallest.nextSmallest(lst1));
        
        List<Integer> lst2 = Arrays.asList(5, 1, 4, 3, 2);
        assertEquals(2, NextSmallest.nextSmallest(lst2));
        
        List<Integer> lst3 = Arrays.asList();
        assertNull(NextSmallest.nextSmallest(lst3));
        
        List<Integer> lst4 = Arrays.asList(1, 1);
        assertNull(NextSmallest.nextSmallest(lst4));
        
        List<Integer> lst5 = Arrays.asList(1, 1, 1, 1, 0);
        assertEquals(1, NextSmallest.nextSmallest(lst5));
        
        List<Integer> lst6 = Arrays.asList(1, 1);
        assertNull(NextSmallest.nextSmallest(lst6));
        
        List<Integer> lst7 = Arrays.asList(-35, 34, 12, -45);
        assertEquals(-35, NextSmallest.nextSmallest(lst7));
        
        List<Integer> lst8 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(2, NextSmallest.nextSmallest(lst8));
        
        List<Integer> lst9 = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        assertEquals(2, NextSmallest.nextSmallest(lst9));
        
        List<Integer> lst10 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1);
        assertEquals(2, NextSmallest.nextSmallest(lst10));
    }
}