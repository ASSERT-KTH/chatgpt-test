// RemoveDuplicatesTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveDuplicates}.
* It contains ten unit test cases for the {@link RemoveDuplicates#removeDuplicates(List)} method.
*/
class RemoveDuplicatesTest {

	/**
	* Test case for {@link RemoveDuplicates#removeDuplicates(List)} method.
	* It tests the method with a list of integers that contains duplicates.
	* The expected result is a list of integers that contains only the elements that occur once.
	*/
	@Test
	void testRemoveDuplicatesWithDuplicates() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2);
		numbers.add(4);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		expected.add(4);
		List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link RemoveDuplicates#removeDuplicates(List)} method.
	* It tests the method with an empty list.
	* The expected result is an empty list.
	*/
	@Test
	void testRemoveDuplicatesWithEmptyList() {
		List<Object> numbers = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link RemoveDuplicates#removeDuplicates(List)} method.
	* It tests the method with a list of integers that contains no duplicates.
	* The expected result is a list of integers that contains all the elements.
	*/
	@Test
	void testRemoveDuplicatesWithNoDuplicates() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link RemoveDuplicates#removeDuplicates(List)} method.
	* It tests the method with a list of integers that contains duplicates.
	* The expected result is a list of integers that contains only the elements that occur once.
	*/
	@Test
	void testRemoveDuplicatesWithDuplicates2() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2);
		numbers.add(4);
		numbers.add(3);
		numbers.add(5);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(4);
		expected.add(5);
		List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link RemoveDuplicates#removeDuplicates(List)} method.
	* It tests the method with a list of integers that contains duplicates.
	* The expected result is a list of integers that contains only the elements that occur once.
	*/
	@Test
	void testRemoveDuplicatesWithDuplicates3() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2);
		numbers.add(4);
		numbers.add(3);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		numbers.add(11);
		numbers.add(12);
		numbers.add(13);
		numbers.add(14);
		numbers.add(15);
		numbers.add(16);
		numbers.add(17);
		numbers.add(18);
		numbers.add(19);
		numbers.add(20);
		numbers.add(21);
		numbers.add(22);
		numbers.add(23);
		numbers.add(24);
		numbers.add(25);
		numbers.add(26);
		numbers.add(27);
		numbers.add(28);
		numbers.add(29);
		numbers.add(30);
		numbers.add(31);
		numbers.add(32);
		numbers.add(33);
		numbers.add(34);
		numbers.add(35);
		numbers.add(36);
		numbers.add(37);
		numbers.add(38);
		numbers.add(39);
		numbers.add(40);
		numbers.add(41);
		numbers.add(42);
		numbers.add(43);
		numbers.add(44);
		numbers.add(45);
		numbers.add(46);
		numbers.add(47);
		numbers.add(48);
		numbers.add(49);
		numbers.add(50);
		numbers.add(51);
		numbers.add(52);
		numbers.add(53);
		numbers.add(54);
		numbers.add(55);
		numbers.add(56);
		numbers.add(57);
		numbers.add(58);
		numbers.add(59);
		numbers.add(60);
		numbers.add(61);
		numbers.add(62);
		numbers.add(63);
		numbers.add(64);
		numbers.add(65);
		numbers.add(66);
		numbers.add(67);
		numbers.add(68);
		numbers.add(69);
		numbers.add(70);
		numbers.add(71);
		numbers.add(72);
		numbers.add(73);
		numbers.add(74);
		numbers.add(75);
		numbers.add(76);
		numbers.add(77);
		numbers.add(78);
		numbers.add(79);
		numbers.add(80);
		numbers.add(81);
		numbers.add(82);
		numbers.add(83);
		numbers.add(84);
		numbers.add(85);
		numbers.add(86);
		numbers.add(87);
		numbers.add(88);
		numbers.add(89);
		numbers.add(90);
		numbers.add(91);
		numbers.add(92);
		numbers.add(93);
		numbers.add(94);
		numbers.add(95);
		numbers.add(96);
		numbers.add(97);
		numbers.add(98);
		numbers.add(99);
		numbers.add(100);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected