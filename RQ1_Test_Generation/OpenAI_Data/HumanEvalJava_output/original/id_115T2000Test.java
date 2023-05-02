// MaxFillTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxFill}.
* It contains ten unit test cases for the {@link MaxFill#maxFill(List, int)} method.
*/
class MaxFillTest {

	@Test
	void testMaxFill() {
		List<List<Integer>> grid = List.of(List.of(0, 0, 1, 0), List.of(0, 1, 0, 0), List.of(1, 1, 1, 1));
		assertEquals(6, MaxFill.maxFill(grid, 1));
		
		grid = List.of(List.of(0, 0, 1, 1), List.of(0, 0, 0, 0), List.of(1, 1, 1, 1), List.of(0, 1, 1, 1));
		assertEquals(5, MaxFill.maxFill(grid, 2));
		
		grid = List.of(List.of(0, 0, 0), List.of(0, 0, 0));
		assertEquals(0, MaxFill.maxFill(grid, 5));
		
		grid = List.of(List.of(1, 1, 1, 1), List.of(1, 1, 1, 1));
		assertEquals(4, MaxFill.maxFill(grid, 2));
		
		grid = List.of(List.of(1, 1, 1, 1), List.of(1, 1, 1, 1));
		assertEquals(2, MaxFill.maxFill(grid, 9));
		
		grid = List.of(List.of(0, 0, 0, 0), List.of(0, 0, 0, 0), List.of(0, 0, 0, 0), List.of(0, 0, 0, 0));
		assertEquals(0, MaxFill.maxFill(grid, 1));
		
		grid = List.of(List.of(0, 0, 0, 0), List.of(0, 0, 0, 0), List.of(0, 0, 0, 0), List.of(0, 0, 0, 0));
		assertEquals(0, MaxFill.maxFill(grid, 2));
		
		grid = List.of(List.of(0, 0, 0, 0), List.of(0, 0, 0, 0), List.of(0, 0, 0, 0), List.of(0, 0, 0, 0));
		assertEquals(0, MaxFill.maxFill(grid, 3));
		
		grid = List.of(List.of(0, 0, 0, 0), List.of(0, 0, 0, 0), List.of(0, 0, 0, 0), List.of(0, 0, 0, 0));
		assertEquals(0, MaxFill.maxFill(grid, 4));
		
		grid = List.of(List.of(0, 0, 0, 0), List.of(0, 0, 0, 0), List.of(0, 0, 0, 0), List.of(0, 0, 0, 0));
		assertEquals(0, MaxFill.maxFill(grid, 5));
	}
}