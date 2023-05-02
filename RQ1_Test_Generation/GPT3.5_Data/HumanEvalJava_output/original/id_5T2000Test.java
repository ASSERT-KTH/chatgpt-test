// IntersperseTest.java
package updated;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Intersperse}.
 * It contains ten unit test cases for the {@link Intersperse#intersperse(List, int)} method.
 */
class IntersperseTest {

    @Test
    void testIntersperseWithEmptyList() {
        List<Object> numbers = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        int delimiter = 4;
        assertEquals(expected, Intersperse.intersperse(numbers, delimiter));
    }

    @Test
    void testIntersperseWithSingleElementList() {
        List<Object> numbers = Arrays.asList(1);
        List<Object> expected = Arrays.asList(1);
        int delimiter = 4;
        assertEquals(expected, Intersperse.intersperse(numbers, delimiter));
    }

    @Test
    void testIntersperseWithTwoElementList() {
        List<Object> numbers = Arrays.asList(1, 2);
        List<Object> expected = Arrays.asList(1, 4, 2);
        int delimiter = 4;
        assertEquals(expected, Intersperse.intersperse(numbers, delimiter));
    }

    @Test
    void testIntersperseWithMultipleElementList() {
        List<Object> numbers = Arrays.asList(5, 6, 3, 2);
        List<Object> expected = Arrays.asList(5, 8, 6, 8, 3, 8, 2);
        int delimiter = 8;
        assertEquals(expected, Intersperse.intersperse(numbers, delimiter));
    }

    @Test
    void testIntersperseWithAllSameElements() {
        List<Object> numbers = Arrays.asList(2, 2, 2);
        List<Object> expected = Arrays.asList(2, 2, 2, 2, 2);
        int delimiter = 2;
        assertEquals(expected, Intersperse.intersperse(numbers, delimiter));
    }

    @Test
    void testIntersperseWithNegativeDelimiter() {
        List<Object> numbers = Arrays.asList(1, 2, 3);
        List<Object> expected = Arrays.asList(1, -4, 2, -4, 3);
        int delimiter = -4;
        assertEquals(expected, Intersperse.intersperse(numbers, delimiter));
    }

    @Test
    void testIntersperseWithZeroDelimiter() {
        List<Object> numbers = Arrays.asList(1, 2, 3);
        List<Object> expected = Arrays.asList(1, 0, 2, 0, 3);
        int delimiter = 0;
        assertEquals(expected, Intersperse.intersperse(numbers, delimiter));
    }

    @Test
    void testIntersperseWithMaxValueDelimiter() {
        List<Object> numbers = Arrays.asList(1, 2, 3);
        List<Object> expected = Arrays.asList(1, Integer.MAX_VALUE, 2, Integer.MAX_VALUE, 3);
        int delimiter = Integer.MAX_VALUE;
        assertEquals(expected, Intersperse.intersperse(numbers, delimiter));
    }

    @Test
    void testIntersperseWithMinValueDelimiter() {
        List<Object> numbers = Arrays.asList(1, 2, 3);
        List<Object> expected = Arrays.asList(1, Integer.MIN_VALUE, 2, Integer.MIN_VALUE, 3);
        int delimiter = Integer.MIN_VALUE;
        assertEquals(expected, Intersperse.intersperse(numbers, delimiter));
    }

    @Test
    void testIntersperseWithNullList() {
        List<Object> numbers = null;
        int delimiter = 4;
        assertThrows(NullPointerException.class, () -> Intersperse.intersperse(numbers, delimiter));
    }

    @Test
    void testIntersperseWithLargeList() {
        List<Object> numbers = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(i);
        }
        List<Object> expected = new ArrayList<>();
        for (int i = 0; i < 999999; i++) {
            expected.add(i);
            expected.add(4);
        }
        expected.add(999999);
        int delimiter = 4;
        assertEquals(expected, Intersperse.intersperse(numbers, delimiter));
    }
}