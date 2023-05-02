// MinpathTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minpath}.
* It contains ten unit test cases for the {@link Minpath#minpath(List, int)} method.
*/
class MinpathTest {
    
    @Test
    void testMinpath1() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(new ArrayList<>(List.of(1, 2, 3)));
        grid.add(new ArrayList<>(List.of(4, 5, 6)));
        grid.add(new ArrayList<>(List.of(7, 8, 9)));
        int k = 3;
        List<Integer> expected = new ArrayList<>(List.of(1, 2, 1));
        List<Integer> actual = Minpath.minpath(grid, k);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMinpath2() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(new ArrayList<>(List.of(5, 9, 3)));
        grid.add(new ArrayList<>(List.of(4, 1, 6)));
        grid.add(new ArrayList<>(List.of(7, 8, 2)));
        int k = 1;
        List<Integer> expected = new ArrayList<>(List.of(1));
        List<Integer> actual = Minpath.minpath(grid, k);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMinpath3() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(new ArrayList<>(List.of(1, 2, 3, 4)));
        grid.add(new ArrayList<>(List.of(5, 6, 7, 8)));
        grid.add(new ArrayList<>(List.of(9, 10, 11, 12)));
        grid.add(new ArrayList<>(List.of(13, 14, 15, 16)));
        int k = 4;
        List<Integer> expected = new ArrayList<>(List.of(1, 2, 1, 2));
        List<Integer> actual = Minpath.minpath(grid, k);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMinpath4() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(new ArrayList<>(List.of(6, 4, 13, 10)));
        grid.add(new ArrayList<>(List.of(5, 7, 12, 1)));
        grid.add(new ArrayList<>(List.of(3, 16, 11, 15)));
        grid.add(new ArrayList<>(List.of(8, 14, 9, 2)));
        int k = 7;
        List<Integer> expected = new ArrayList<>(List.of(1, 10, 1, 10, 1, 10, 1));
        List<Integer> actual = Minpath.minpath(grid, k);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMinpath5() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(new ArrayList<>(List.of(8, 14, 9, 2)));
        grid.add(new ArrayList<>(List.of(6, 4, 13, 15)));
        grid.add(new ArrayList<>(List.of(5, 7, 1, 12)));
        grid.add(new ArrayList<>(List.of(3, 10, 11, 16)));
        int k = 5;
        List<Integer> expected = new ArrayList<>(List.of(1, 7, 1, 7, 1));
        List<Integer> actual = Minpath.minpath(grid, k);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMinpath6() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(new ArrayList<>(List.of(11, 8, 7, 2)));
        grid.add(new ArrayList<>(List.of(5, 16, 14, 4)));
        grid.add(new ArrayList<>(List.of(9, 3, 15, 6)));
        grid.add(new ArrayList<>(List.of(12, 13, 10, 1)));
        int k = 9;
        List<Integer> expected = new ArrayList<>(List.of(1, 6, 1, 6, 1, 6, 1, 6, 1));
        List<Integer> actual = Minpath.minpath(grid, k);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMinpath7() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(new ArrayList<>(List.of(12, 13, 10, 1)));
        grid.add(new ArrayList<>(List.of(9, 3, 15, 6)));
        grid.add(new ArrayList<>(List.of(5, 16, 14, 4)));
        grid.add(new ArrayList<>(List.of(11, 8, 7, 2)));
        int k = 12;
        List<Integer> expected = new ArrayList<>(List.of(1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6));
        List<Integer> actual = Minpath.minpath(grid, k);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMinpath8() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(new ArrayList<>(List.of(2, 7)));
        grid.add(new ArrayList<>(List.of(3, 1)));
        grid.add(new ArrayList<>(List.of(6, 8, 9)));
        int k = 8;
        List<Integer> expected = new ArrayList<>(List.of(1, 3, 1, 3, 1, 3, 1, 3));
        List<Integer> actual = Minpath.minpath(grid, k);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMinpath9() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(new ArrayList<>(List.of(6, 1, 5)));
        grid.add(new ArrayList<>(List.of(3, 8, 9)));
        grid.add(new ArrayList<>(List.of(2, 7, 4)));
        int k = 8;
        List<Integer> expected = new ArrayList<>(List.of(1, 5, 1, 5, 1, 5, 1, 5));
        List<Integer> actual = Minpath.minpath(grid, k);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMinpath10() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(new ArrayList<>(List.of(1, 2)));
        grid.add(new ArrayList<>(List.of(3, 4)));
        int k = 10;
        List<Integer> expected = new ArrayList<>(List.of(1, 2, 1, 2, 1, 2, 1, 2, 1, 2));
        List<Integer> actual = Minpath.minpath(grid, k);
        assertEquals(expected, actual);
    }
}