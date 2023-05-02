// MoveOneBallTest.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link MoveOneBall}.
 * It contains ten unit test cases for the {@link MoveOneBall#moveOneBall(List)} method.
 */
class MoveOneBallTest {

    @Test
    void testEmptyList() {
        List<Object> arr = Arrays.asList();
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testSingleElementList() {
        List<Object> arr = Arrays.asList(1);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testSortedArray() {
        List<Object> arr = Arrays.asList(1, 2, 3, 4, 5);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testNonDecreasingArray() {
        List<Object> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testNonDecreasingArrayWithShifts() {
        List<Object> arr = Arrays.asList(3, 4, 5, 1, 2);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testNonDecreasingArrayWithMultipleShifts() {
        List<Object> arr = Arrays.asList(3, 5, 10, 1, 2);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testNonDecreasingArrayWithOneSwap() {
        List<Object> arr = Arrays.asList(4, 3, 1, 2);
        assertFalse(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testNonDecreasingArrayWithMultipleSwaps() {
        List<Object> arr = Arrays.asList(3, 5, 4, 1, 2);
        assertFalse(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testNonDecreasingArrayWithRepeatedElements() {
        List<Object> arr = Arrays.asList(1, 2, 3, 3, 4, 5);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testNonDecreasingArrayWithNegativeElements() {
        List<Object> arr = Arrays.asList(-5, -3, -1, 0, 2, 4, 6);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }
}