// FilterIntegersTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterIntegers}.
* It contains ten unit test cases for the {@link FilterIntegers#filterIntegers(List)} method.
*/
class FilterIntegersTest {

	@Test
	void testFilterIntegers_1() {
		List<Object> values = new ArrayList<Object>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(8);
		values.add(9);
		values.add(10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_2() {
		List<Object> values = new ArrayList<Object>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(8);
		values.add(9);
		values.add(10);
		values.add("a");
		values.add("b");
		values.add("c");
		values.add("d");
		values.add("e");
		values.add("f");
		values.add("g");
		values.add("h");
		values.add("i");
		values.add("j");
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_3() {
		List<Object> values = new ArrayList<Object>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(8);
		values.add(9);
		values.add(10);
		values.add("a");
		values.add("b");
		values.add("c");
		values.add("d");
		values.add("e");
		values.add("f");
		values.add("g");
		values.add("h");
		values.add("i");
		values.add("j");
		values.add(11);
		values.add(12);
		values.add(13);
		values.add(14);
		values.add(15);
		values.add(16);
		values.add(17);
		values.add(18);
		values.add(19);
		values.add(20);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);
		expected.add(11);
		expected.add(12);
		expected.add(13);
		expected.add(14);
		expected.add(15);
		expected.add(16);
		expected.add(17);
		expected.add(18);
		expected.add(19);
		expected.add(20);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_4() {
		List<Object> values = new ArrayList<Object>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(8);
		values.add(9);
		values.add(10);
		values.add("a");
		values.add("b");
		values.add("c");
		values.add("d");
		values.add("e");
		values.add("f");
		values.add("g");
		values.add("h");
		values.add("i");
		values.add("j");
		values.add(11);
		values.add(12);
		values.add(13);
		values.add(14);
		values.add(15);
		values.add(16);
		values.add(17);
		values.add(18);
		values.add(19);
		values.add(20);
		values.add("k");
		values.add("l");
		values.add("m");
		values.add("n");
		values.add("o");
		values.add("p");
		values.add("q");
		values.add("r");
		values.add("s");
		values.add("t");
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);
		expected.add(11);
		expected.add(12);
		expected.add(13);
		expected.add(14);
		expected.add(15);
		expected.add(16);
		expected.add(17);
		expected.add(18);
		expected.add(19);
		expected.add(20);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_5() {
		List<Object> values = new ArrayList<Object>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(8);
		values.add(9);
		values.add(10);
		values.add("a");
		values.add("b");
		values.add("c");
		values.add("d");
		values.add("e");
		values.add("f");
		values.add("g");
		values.add("h");
		values.add("i");
		values.add("j");
		values.add(11);
		values.add(12);
		