// Unique.java
package updated;

import java.util.*;

class Unique {

    /**
     * Return sorted unique elements in a list
     *
     * > unique([5, 3, 5, 2, 3, 3, 9, 0, 123])
     * [0, 2, 3, 5, 9, 123]
     * > unique([5, 3, 5, 2, 3, 3, 9, 0, 123])
     * [0, 2, 3, 5, 9, 123]
     */
    public static List<Integer> unique(List<Integer> l) {
        if(l == null || l.isEmpty()) {
            return new ArrayList<Integer>();
        }
        Set<Integer> set = new HashSet<Integer>();
        for (Integer i : l) {
            set.add(i);
        }
        List<Integer> result = new ArrayList<Integer>(set);
        Collections.sort(result);
        return result;
    }
}

// UniqueTest.java
package updated;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Unique}.
* It contains ten unit test cases for the {@link Unique#unique(List)} method.
*/
class UniqueTest {
    @Test
    void testEmptyList() {
        List<Integer> l = new ArrayList<Integer>();
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }

    @Test
    void testNullList() {
        List<Integer> l = null;
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }

    @Test
    void testSingleElementList() {
        List<Integer> l = Arrays.asList(5);
        List<Integer> expected = Arrays.asList(5);
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }

    @Test
    void testDuplicateElementsList() {
        List<Integer> l = Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123);
        List<Integer> expected = Arrays.asList(0, 2, 3, 5, 9, 123);
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }

    @Test
    void testSortedElementsList() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }

    @Test
    void testReverseSortedElementsList() {
        List<Integer> l = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }

    @Test
    void testRandomElementsList() {
        List<Integer> l = Arrays.asList(5, 3, 2, 9, 0, 123, 7, 1, 8, 4, 6);
        List<Integer> expected = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 123);
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }

    @Test
    void testLargeElementsList() {
        List<Integer> l = new ArrayList<Integer>();
        for(int i=0; i<100000; i++) {
            l.add(i%1000);
        }
        List<Integer> expected = new ArrayList<Integer>();
        for(int i=0; i<1000; i++) {
            expected.add(i);
        }
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }

    @Test
    void testNegativeElementsList() {
        List<Integer> l = Arrays.asList(-5, -3, -5, -2, -3, -3, -9, 0, -123);
        List<Integer> expected = Arrays.asList(-123, -9, -5, -3, -2, 0);
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }

    @Test
    void testMixedElementsList() {
        List<Integer> l = Arrays.asList(-5, 3, -5, 2, 3, -3, 9, 0, -123);
        List<Integer> expected = Arrays.asList(-123, -5, -3, 0, 2, 3, 9);
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }
}