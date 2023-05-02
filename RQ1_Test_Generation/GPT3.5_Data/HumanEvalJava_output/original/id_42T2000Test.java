// IncrList.java
package updated;

import java.util.ArrayList;
import java.util.List;

class IncrList {

    /**
     * Return list with elements incremented by 1.
     *
     * > incrList([1, 2, 3])
     * [2, 3, 4]
     * > incrList([5, 3, 5, 2, 3, 3, 9, 0, 123])
     * [6, 4, 6, 3, 4, 4, 10, 1, 124]
     * > incrList([])
     * []
     * > incrList([3, 2, 1])
     * [4, 3, 2]
     * > incrList([5, 2, 5, 2, 3, 3, 9, 0, 123])
     * [6, 3, 6, 3, 4, 4, 10, 1, 124]
     */
    public static List<Integer> incrList(List<Integer> l) {
        List<Integer> result = new ArrayList<Integer>();
        for (Integer value : l) {
            result.add(value + 1);
        }
        return result;
    }
}

// IncrListTest.java
package updated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IncrList}.
* It contains ten unit test cases for the {@link IncrList#incrList(List)} method.
*/
class IncrListTest {
    
    @Test
    void testIncrListWithPositiveNumbers() {
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> expectedOutput = Arrays.asList(2, 3, 4);
        assertEquals(expectedOutput, IncrList.incrList(input));
    }
    
    @Test
    void testIncrListWithMixedNumbers() {
        List<Integer> input = Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123);
        List<Integer> expectedOutput = Arrays.asList(6, 4, 6, 3, 4, 4, 10, 1, 124);
        assertEquals(expectedOutput, IncrList.incrList(input));
    }
    
    @Test
    void testIncrListWithEmptyList() {
        List<Integer> input = new ArrayList<Integer>();
        List<Integer> expectedOutput = new ArrayList<Integer>();
        assertEquals(expectedOutput, IncrList.incrList(input));
    }
    
    @Test
    void testIncrListWithDescendingNumbers() {
        List<Integer> input = Arrays.asList(3, 2, 1);
        List<Integer> expectedOutput = Arrays.asList(4, 3, 2);
        assertEquals(expectedOutput, IncrList.incrList(input));
    }
    
    @Test
    void testIncrListWithRepeatedNumbers() {
        List<Integer> input = Arrays.asList(5, 2, 5, 2, 3, 3, 9, 0, 123);
        List<Integer> expectedOutput = Arrays.asList(6, 3, 6, 3, 4, 4, 10, 1, 124);
        assertEquals(expectedOutput, IncrList.incrList(input));
    }
    
    @Test
    void testIncrListWithNull() {
        List<Integer> input = null;
        assertThrows(NullPointerException.class, () -> {
            IncrList.incrList(input);
        });
    }
    
    @Test
    void testIncrListWithNonIntegerValues() {
        List<Object> input = Arrays.asList("a", 2, 3.5, true);
        assertThrows(ClassCastException.class, () -> {
            IncrList.incrList(input);
        });
    }
    
    @Test
    void testIncrListWithMaxIntegerValue() {
        List<Integer> input = Arrays.asList(Integer.MAX_VALUE);
        List<Integer> expectedOutput = Arrays.asList(Integer.MIN_VALUE);
        assertEquals(expectedOutput, IncrList.incrList(input));
    }
    
    @Test
    void testIncrListWithMinIntegerValue() {
        List<Integer> input = Arrays.asList(Integer.MIN_VALUE);
        List<Integer> expectedOutput = Arrays.asList(Integer.MIN_VALUE + 1);
        assertEquals(expectedOutput, IncrList.incrList(input));
    }
    
    @Test
    void testIncrListWithLargeList() {
        List<Integer> input = new ArrayList<Integer>();
        for (int i = 0; i < 1000000; i++) {
            input.add(i);
        }
        List<Integer> expectedOutput = new ArrayList<Integer>();
        for (int i = 0; i < 1000000; i++) {
            expectedOutput.add(i + 1);
        }
        assertEquals(expectedOutput, IncrList.incrList(input));
    }
}