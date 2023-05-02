// CompareTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Compare}.
* It contains ten unit test cases for the {@link Compare#compare(List, List)} method.
*/
class CompareTest {

	/**
	* Test case 1.
	* The game list is empty.
	* The guess list is empty.
	* The expected result is an empty list.
	*/
	@Test
	void testCompare_1() {
		List<Integer> game = new ArrayList<>();
		List<Integer> guess = new ArrayList<>();
		List<Integer> expected = new ArrayList<>();
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The game list is empty.
	* The guess list is not empty.
	* The expected result is an empty list.
	*/
	@Test
	void testCompare_2() {
		List<Integer> game = new ArrayList<>();
		List<Integer> guess = new ArrayList<>();
		guess.add(1);
		guess.add(2);
		guess.add(3);
		guess.add(4);
		List<Integer> expected = new ArrayList<>();
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The game list is not empty.
	* The guess list is empty.
	* The expected result is an empty list.
	*/
	@Test
	void testCompare_3() {
		List<Integer> game = new ArrayList<>();
		game.add(1);
		game.add(2);
		game.add(3);
		game.add(4);
		List<Integer> guess = new ArrayList<>();
		List<Integer> expected = new ArrayList<>();
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The game list is not empty.
	* The guess list is not empty.
	* The expected result is not empty.
	* The game list and the guess list have the same size.
	* The game list and the guess list have the same elements.
	*/
	@Test
	void testCompare_4() {
		List<Integer> game = new ArrayList<>();
		game.add(1);
		game.add(2);
		game.add(3);
		game.add(4);
		List<Integer> guess = new ArrayList<>();
		guess.add(1);
		guess.add(2);
		guess.add(3);
		guess.add(4);
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The game list is not empty.
	* The guess list is not empty.
	* The expected result is not empty.
	* The game list and the guess list have the same size.
	* The game list and the guess list have the same elements.
	* The game list and the guess list have the same elements but in different order.
	*/
	@Test
	void testCompare_5() {
		List<Integer> game = new ArrayList<>();
		game.add(1);
		game.add(2);
		game.add(3);
		game.add(4);
		List<Integer> guess = new ArrayList<>();
		guess.add(4);
		guess.add(3);
		guess.add(2);
		guess.add(1);
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The game list is not empty.
	* The guess list is not empty.
	* The expected result is not empty.
	* The game list and the guess list have the same size.
	* The game list and the guess list have the same elements.
	* The game list and the guess list have the same elements but in different order.
	* The game list and the guess list have the same elements but in different order and with different values.
	*/
	@Test
	void testCompare_6() {
		List<Integer> game = new ArrayList<>();
		game.add(1);
		game.add(2);
		game.add(3);
		game.add(4);
		List<Integer> guess = new ArrayList<>();
		guess.add(4);
		guess.add(3);
		guess.add(2);
		guess.add(1);
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The game list is not empty.
	* The guess list is not empty.
	* The expected result is not empty.
	* The game list and the guess list have the same size.
	* The game list and the guess list have the same elements.
	* The game list and the guess list have the same elements but in different order.
	* The game list and the guess list have the same elements but in different order and with different values.
	* The game list and the guess list have the same elements but in different order and with different values and with different size.
	*/
	@Test
	void testCompare_7() {
		List<Integer> game = new ArrayList<>();
		game.add(1);
		game.add(2);
		game.add(3);
		game.add(4);
		List<Integer> guess = new ArrayList<>();
		guess.add(4);
		guess.add(3);
		guess.add(2);
		guess.add(1);
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The game list is not empty.
	* The guess list is not empty.
	* The expected result is not empty.
	* The game list and the guess list have the same size.
	* The game list and the guess list have the same elements.
	* The game list and the guess list have the same elements but in different order.
	* The game list and the guess list have the same elements but in different order and with different values.
	* The game list and the guess list have the same elements but in different order and with different values and with different size.
	* The game list and the guess list have the same elements but in different order and with different values and with different size and with different values.
	*/
	@Test
	void testCompare_8() {
		List<Integer> game = new ArrayList<>();
		game.add(1);
		game.add(2);
		game.add(3);
		game.add(4);
		List<Integer> guess = new ArrayList<>();
		guess.add(4);
		guess.add(3);
		guess.add(2);