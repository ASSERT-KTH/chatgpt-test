// Here's the source code for the test class:

package original;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StrangeSortListTest {

    @Test
    void testEmptyList() {
        List<Object> input = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, StrangeSortList.strangeSortList(input));
    }

    @Test
    void testSingleElementList() {
        List<Object> input = Collections.singletonList(1);
        List<Object> expected = Collections.singletonList(1);
        assertEquals(expected, StrangeSortList.strangeSortList(input));
    }

    @Test
    void testAllEqualElements() {
        List<Object> input = Arrays.asList(5, 5, 5, 5);
        List<Object> expected = Arrays.asList(5, 5, 5, 5);
        assertEquals(expected, StrangeSortList.strangeSortList(input));
    }

    @Test
    void testOddNumberOfElements() {
        List<Object> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Object> expected = Arrays.asList(1, 5, 2, 4, 3);
        assertEquals(expected, StrangeSortList.strangeSortList(input));
    }

    @Test
    void testEvenNumberOfElements() {
        List<Object> input = Arrays.asList(1, 2, 3, 4);
        List<Object> expected = Arrays.asList(1, 4, 2, 3);
        assertEquals(expected, StrangeSortList.strangeSortList(input));
    }

    @Test
    void testNegativeElements() {
        List<Object> input = Arrays.asList(0, 2, 2, 2, 5, 5, -5, -5);
        List<Object> expected = Arrays.asList(-5, 5, -5, 5, 0, 2, 2, 2);
        assertEquals(expected, StrangeSortList.strangeSortList(input));
    }

    @Test
    void testLargeNumbers() {
        List<Object> input = Arrays.asList(111111, 999999, 555555, 777777);
        List<Object> expected = Arrays.asList(111111, 999999, 555555, 777777);
        assertEquals(expected, StrangeSortList.strangeSortList(input));
    }

    @Test
    void testMixedElements() {
        List<Object> input = Arrays.asList(5, 6, 7, 8, 9, 1);
        List<Object> expected = Arrays.asList(1, 9, 5, 8, 6, 7);
        assertEquals(expected, StrangeSortList.strangeSortList(input));
    }

    @Test
    void testNonIntegerElements() {
        List<Object> input = Arrays.asList("hello", 1, "world", 2);
        List<Object> expected = Arrays.asList(1, 2);
        assertEquals(expected, StrangeSortList.strangeSortList(input));
    }

    @Test
    void testOnlyNonIntegerElements() {
        List<Object> input = Arrays.asList("hello", "world");
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, StrangeSortList.strangeSortList(input));
    }
}