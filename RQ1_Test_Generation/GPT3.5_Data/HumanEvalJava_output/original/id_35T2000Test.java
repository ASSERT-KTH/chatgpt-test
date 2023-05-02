// MaxElement.java
package updated;

import java.util.List;

public class MaxElement {

    /**
     * Return the maximum element in the list.
     *
     * > maxElement([1, 2, 3])
     * 3
     * > maxElement([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10])
     * 123
     * > maxElement([1, 2, 3])
     * 3
     * > maxElement([5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10])
     * 124
     */
    public static int maxElement(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        int max = Integer.MIN_VALUE;
        for (Integer i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}

// MaxElementTest.java
package updated;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxElement}.
* It contains ten unit test cases for the {@link MaxElement#maxElement(List)} method.
*/
class MaxElementTest {

    @Test
    void testMaxElementWithValidList() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        assertEquals(3, MaxElement.maxElement(list));
    }

    @Test
    void testMaxElementWithNegativeNumbers() {
        List<Integer> list = Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
        assertEquals(123, MaxElement.maxElement(list));
    }

    @Test
    void testMaxElementWithDuplicateMaxValue() {
        List<Integer> list = Arrays.asList(1, 2, 3, 3);
        assertEquals(3, MaxElement.maxElement(list));
    }

    @Test
    void testMaxElementWithSingleElementList() {
        List<Integer> list = Arrays.asList(5);
        assertEquals(5, MaxElement.maxElement(list));
    }

    @Test
    void testMaxElementWithMaxValueAtStart() {
        List<Integer> list = Arrays.asList(10, 2, 3, 4, 5);
        assertEquals(10, MaxElement.maxElement(list));
    }

    @Test
    void testMaxElementWithMaxValueAtEnd() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 10);
        assertEquals(10, MaxElement.maxElement(list));
    }

    @Test
    void testMaxElementWithMaxValueInMiddle() {
        List<Integer> list = Arrays.asList(1, 2, 10, 4, 5);
        assertEquals(10, MaxElement.maxElement(list));
    }

    @Test
    void testMaxElementWithNullList() {
        assertThrows(IllegalArgumentException.class, () -> MaxElement.maxElement(null));
    }

    @Test
    void testMaxElementWithEmptyList() {
        List<Integer> list = Arrays.asList();
        assertThrows(IllegalArgumentException.class, () -> MaxElement.maxElement(list));
    }

    @Test
    void testMaxElementWithAllNegativeNumbers() {
        List<Integer> list = Arrays.asList(-5, -3, -10, -2, -7);
        assertEquals(-2, MaxElement.maxElement(list));
    }
}