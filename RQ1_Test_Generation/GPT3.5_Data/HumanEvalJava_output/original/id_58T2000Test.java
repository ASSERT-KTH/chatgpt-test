// Common.java
package updated;

import java.util.*;

class Common {

    /**
     * Return sorted unique common elements for two lists.
     *
     * @param l1 the first list
     * @param l2 the second list
     * @return a list of sorted unique common elements
     */
    public static List<Integer> common(List<Integer> l1, List<Integer> l2) {
        Set<Integer> set = new HashSet<>(l1);
        List<Integer> result = new ArrayList<>();
        for (Integer value : l2) {
            if (set.contains(value) && !result.contains(value)) {
                result.add(value);
            }
        }
        Collections.sort(result);
        return result;
    }
}

// CommonTest.java
package updated;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Common}.
* It contains ten unit test cases for the {@link Common#common(List, List)} method.
*/
class CommonTest {
    
    @Test
    void testCommonWithTwoNonEmptyLists() {
        List<Integer> l1 = Arrays.asList(1, 4, 3, 34, 653, 2, 5);
        List<Integer> l2 = Arrays.asList(5, 7, 1, 5, 9, 653, 121);
        List<Integer> expected = Arrays.asList(1, 5, 653);
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCommonWithTwoListsContainingDuplicates() {
        List<Integer> l1 = Arrays.asList(5, 3, 2, 8);
        List<Integer> l2 = Arrays.asList(3, 2);
        List<Integer> expected = Arrays.asList(2, 3);
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCommonWithTwoListsContainingAllElementsInCommon() {
        List<Integer> l1 = Arrays.asList(4, 3, 2, 8);
        List<Integer> l2 = Arrays.asList(3, 2, 4);
        List<Integer> expected = Arrays.asList(2, 3, 4);
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCommonWithOneEmptyList() {
        List<Integer> l1 = Arrays.asList(4, 3, 2, 8);
        List<Integer> l2 = Collections.emptyList();
        List<Integer> expected = Collections.emptyList();
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCommonWithTwoEmptyLists() {
        List<Integer> l1 = Collections.emptyList();
        List<Integer> l2 = Collections.emptyList();
        List<Integer> expected = Collections.emptyList();
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCommonWithOneListContainingNull() {
        List<Integer> l1 = Arrays.asList(1, 2, null, 4);
        List<Integer> l2 = Arrays.asList(2, 3, 4, null);
        List<Integer> expected = Arrays.asList(2, 4, null);
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCommonWithTwoListsContainingNull() {
        List<Integer> l1 = Arrays.asList(1, 2, null, 4);
        List<Integer> l2 = Arrays.asList(2, null, 3, 4, null);
        List<Integer> expected = Arrays.asList(null, 2, 4);
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCommonWithOneListContainingOnlyNull() {
        List<Integer> l1 = Arrays.asList(null, null, null);
        List<Integer> l2 = Arrays.asList(1, 2, 3);
        List<Integer> expected = Collections.emptyList();
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCommonWithTwoListsContainingOnlyNull() {
        List<Integer> l1 = Arrays.asList(null, null, null);
        List<Integer> l2 = Arrays.asList(null, null, null);
        List<Integer> expected = Collections.singletonList(null);
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCommonWithTwoListsContainingLargeNumbers() {
        List<Integer> l1 = Arrays.asList(1000000, 2000000, 3000000, 4000000);
        List<Integer> l2 = Arrays.asList(3000000, 4000000, 5000000, 6000000);
        List<Integer> expected = Arrays.asList(3000000, 4000000);
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }
}