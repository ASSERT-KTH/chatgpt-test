// SortEven.java
package updated;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEven {

    /**
     * This function takes a list l and returns a list l' such that
     * l' is identical to l in the odd indices, while its values at the even indices are equal
     * to the values of the even indices of l, but sorted.
     *
     * > sortEven([1, 2, 3])
     * [1, 2, 3]
     * > sortEven([5, 6, 3, 4])
     * [3, 6, 5, 4]
     * > sortEven([1, 2, 3])
     * [1, 2, 3]
     * > sortEven([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10])
     * [-10, 3, -5, 2, -3, 3, 5, 0, 9, 1, 123]
     * > sortEven([5, 8, -12, 4, 23, 2, 3, 11, 12, -10])
     * [-12, 8, 3, 4, 5, 2, 12, 11, 23, -10]
     */
    public static List<Integer> sortEven(List<Integer> l) {
        List<Integer> l2 = new ArrayList<Integer>(l);
        for (int i = 0; i < l.size(); i++) {
            if (i % 2 == 0) {
                List<Integer> subl = new ArrayList<Integer>();
                for (int j = 0; j < l.size(); j++) {
                    if (j % 2 == 0) {
                        subl.add(l.get(j));
                    }
                }
                Collections.sort(subl);
                l2.set(i, subl.get(i / 2));
            }
        }
        return l2;
    }
}

// SortEvenTest.java
package updated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortEven}.
* It contains ten unit test cases for the {@link SortEven#sortEven(List)} method.
*/
class SortEvenTest {
    
    @Test
    void testSortEven() {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(5, 6, 3, 4));
        List<Integer> l3 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> l4 = new ArrayList<>(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10));
        List<Integer> l5 = new ArrayList<>(Arrays.asList(5, 8, -12, 4, 23, 2, 3, 11, 12, -10));
        List<Integer> l6 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        List<Integer> l7 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        List<Integer> l8 = new ArrayList<>(Arrays.asList(10, 8, 6, 4, 2));
        List<Integer> l9 = new ArrayList<>(Arrays.asList(9, 7, 5, 3, 1));
        List<Integer> l10 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        
        assertEquals(l1, SortEven.sortEven(l1));
        assertEquals(Arrays.asList(3, 6, 5, 4), SortEven.sortEven(l2));
        assertEquals(l3, SortEven.sortEven(l3));
        assertEquals(Arrays.asList(-10, 3, -5, 2, -3, 3, 5, 0, 9, 1, 123), SortEven.sortEven(l4));
        assertEquals(Arrays.asList(-12, 8, 3, 4, 5, 2, 12, 11, 23, -10), SortEven.sortEven(l5));
        assertEquals(l6, SortEven.sortEven(l6));
        assertEquals(l7, SortEven.sortEven(l7));
        assertEquals(l8, SortEven.sortEven(l8));
        assertEquals(l9, SortEven.sortEven(l9));
        assertEquals(l10, SortEven.sortEven(l10));
    }
}