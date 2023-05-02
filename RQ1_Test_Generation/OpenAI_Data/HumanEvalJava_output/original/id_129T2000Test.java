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

	/**
	* Test case 1.
	* Input: grid = [ [1,2,3], [4,5,6], [7,8,9]], k = 3
	* Output: [1, 2, 1]
	*/
	@Test
	void test1() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		List<Integer> row2 = new ArrayList<>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		List<Integer> row3 = new ArrayList<>();
		row3.add(7);
		row3.add(8);
		row3.add(9);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		int k = 3;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(1);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* Input: grid = [ [5,9,3], [4,1,6], [7,8,2]], k = 1
	* Output: [1]
	*/
	@Test
	void test2() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(5);
		row1.add(9);
		row1.add(3);
		List<Integer> row2 = new ArrayList<>();
		row2.add(4);
		row2.add(1);
		row2.add(6);
		List<Integer> row3 = new ArrayList<>();
		row3.add(7);
		row3.add(8);
		row3.add(2);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		int k = 1;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* Input: grid = [ [1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]], k = 4
	* Output: [1, 2, 1, 2]
	*/
	@Test
	void test3() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		row1.add(4);
		List<Integer> row2 = new ArrayList<>();
		row2.add(5);
		row2.add(6);
		row2.add(7);
		row2.add(8);
		List<Integer> row3 = new ArrayList<>();
		row3.add(9);
		row3.add(10);
		row3.add(11);
		row3.add(12);
		List<Integer> row4 = new ArrayList<>();
		row4.add(13);
		row4.add(14);
		row4.add(15);
		row4.add(16);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		grid.add(row4);
		int k = 4;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(1);
		expected.add(2);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* Input: grid = [ [6, 4, 13, 10], [5, 7, 12, 1], [3, 16, 11, 15], [8, 14, 9, 2]], k = 7
	* Output: [1, 10, 1, 10, 1, 10, 1]
	*/
	@Test
	void test4() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(6);
		row1.add(4);
		row1.add(13);
		row1.add(10);
		List<Integer> row2 = new ArrayList<>();
		row2.add(5);
		row2.add(7);
		row2.add(12);
		row2.add(1);
		List<Integer> row3 = new ArrayList<>();
		row3.add(3);
		row3.add(16);
		row3.add(11);
		row3.add(15);
		List<Integer> row4 = new ArrayList<>();
		row4.add(8);
		row4.add(14);
		row4.add(9);
		row4.add(2);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		grid.add(row4);
		int k = 7;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(10);
		expected.add(1);
		expected.add(10);
		expected.add(1);
		expected.add(10);
		expected.add(1);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* Input: grid = [ [5, 7, 12, 1], [6, 4, 13, 10], [3, 16, 11, 15], [8, 14, 9, 2]], k = 5
	* Output: [1, 7, 1, 7, 1]
	*/
	@Test
	void test5() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(5);
		row1.add(7);
		row1.add(12);
		row1.add(1);
		List<Integer> row2 = new ArrayList<>();
		row2.add(6);
		row2.add(4);
		row2.add(13);
		row2.add(10);
		List<Integer> row3 = new ArrayList<>();
		row3.add(3);
		row3.add(16);
		row3.add(11);
		row3.add(15);
		List<Integer> row4 = new ArrayList<>();
		row4.add(8);
		row4.add(14);
		row4.add(9);
		row4.add(2);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		grid.add(row4);
		int k = 5;
		List<Integer> expected = new ArrayList