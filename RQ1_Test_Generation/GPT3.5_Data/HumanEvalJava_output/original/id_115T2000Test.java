// MaxFillTest.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxFill}.
* It contains ten unit test cases for the {@link MaxFill#maxFill(List, int)} method.
*/
class MaxFillTest {
    
    @Test
    void testMaxFill1() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(0, 0, 1, 0),
            Arrays.asList(0, 1, 0, 0),
            Arrays.asList(1, 1, 1, 1)
        );
        int capacity = 1;
        int expected = 6;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMaxFill2() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(0, 0, 1, 1),
            Arrays.asList(0, 0, 0, 0),
            Arrays.asList(1, 1, 1, 1),
            Arrays.asList(0, 1, 1, 1)
        );
        int capacity = 2;
        int expected = 5;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMaxFill3() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(0, 0, 0),
            Arrays.asList(0, 0, 0)
        );
        int capacity = 5;
        int expected = 0;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMaxFill4() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1, 1, 1, 1),
            Arrays.asList(1, 1, 1, 1)
        );
        int capacity = 2;
        int expected = 4;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMaxFill5() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1, 1, 1, 1),
            Arrays.asList(1, 1, 1, 1)
        );
        int capacity = 9;
        int expected = 2;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMaxFill6() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(0, 0, 0),
            Arrays.asList(0, 0, 0),
            Arrays.asList(0, 0, 0)
        );
        int capacity = 1;
        int expected = 0;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMaxFill7() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1, 0, 0),
            Arrays.asList(0, 1, 0),
            Arrays.asList(0, 0, 1)
        );
        int capacity = 1;
        int expected = 3;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMaxFill8() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1, 0, 0),
            Arrays.asList(0, 1, 0),
            Arrays.asList(0, 0, 1)
        );
        int capacity = 2;
        int expected = 2;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMaxFill9() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1, 0, 0),
            Arrays.asList(0, 1, 0),
            Arrays.asList(0, 0, 1)
        );
        int capacity = 3;
        int expected = 1;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMaxFill10() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1, 0, 0),
            Arrays.asList(0, 1, 0),
            Arrays.asList(0, 0, 1)
        );
        int capacity = 4;
        int expected = 1;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }
}