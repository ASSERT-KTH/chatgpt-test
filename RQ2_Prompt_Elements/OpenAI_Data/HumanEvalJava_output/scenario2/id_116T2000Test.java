// SortArrayTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray}.
* It contains ten unit test cases for the {@link SortArray#sortArray(List)} method.
*/
class SortArrayTest {

	/**
	* Test case for {@link SortArray#sortArray(List)} method.
	* It tests the method with a list of integers.
	*/
	@Test
	void testSortArray() {
		List<Object> list = new ArrayList<Object>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(4);
		expected.add(8);
		expected.add(3);
		expected.add(5);
		expected.add(6);
		expected.add(9);
		expected.add(10);
		expected.add(7);
		List<Object> actual = SortArray.sortArray(list);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortArray#sortArray(List)} method.
	* It tests the method with a list of integers.
	*/
	@Test
	void testSortArray2() {
		List<Object> list = new ArrayList<Object>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);
		list.add(20);
		list.add(21);
		list.add(22);
		list.add(23);
		list.add(24);
		list.add(25);
		list.add(26);
		list.add(27);
		list.add(28);
		list.add(29);
		list.add(30);
		list.add(31);
		list.add(32);
		list.add(33);
		list.add(34);
		list.add(35);
		list.add(36);
		list.add(37);
		list.add(38);
		list.add(39);
		list.add(40);
		list.add(41);
		list.add(42);
		list.add(43);
		list.add(44);
		list.add(45);
		list.add(46);
		list.add(47);
		list.add(48);
		list.add(49);
		list.add(50);
		list.add(51);
		list.add(52);
		list.add(53);
		list.add(54);
		list.add(55);
		list.add(56);
		list.add(57);
		list.add(58);
		list.add(59);
		list.add(60);
		list.add(61);
		list.add(62);
		list.add(63);
		list.add(64);
		list.add(65);
		list.add(66);
		list.add(67);
		list.add(68);
		list.add(69);
		list.add(70);
		list.add(71);
		list.add(72);
		list.add(73);
		list.add(74);
		list.add(75);
		list.add(76);
		list.add(77);
		list.add(78);
		list.add(79);
		list.add(80);
		list.add(81);
		list.add(82);
		list.add(83);
		list.add(84);
		list.add(85);
		list.add(86);
		list.add(87);
		list.add(88);
		list.add(89);
		list.add(90);
		list.add(91);
		list.add(92);
		list.add(93);
		list.add(94);
		list.add(95);
		list.add(96);
		list.add(97);
		list.add(98);
		list.add(99);
		list.add(100);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(4);
		expected.add(8);
		expected.add(16);
		expected.add(32);
		expected.add(64);
		expected.add(3);
		expected.add(5);
		expected.add(6);
		expected.add(9);
		expected.add(10);
		expected.add(12);
		expected.add(17);
		expected.add(18);
		expected.add(20);
		expected.add(24);
		expected.add(33);
		expected.add(34);
		expected.add(36);
		expected.add(40);
		expected.add(48);
		expected.add(65);
		expected.add(66);
		expected.add(68);
		expected.add(72);
		expected.add(80);
		expected.add(96);
		expected.add(7);
		expected.add(11);
		expected.add(13);
		expected.add(14);
		expected.add(19);
		expected.add(21);
		expected.add(22);
		expected.add(25);
		expected.add(26);
		expected.add(28);
		expected.add(35);
		expected.add(37);
		expected.add(38);
		expected.add(41);
		expected.add(42);
		expected.add(44);
		expected.add(49);
		expected.add(50);
		expected.add(52);
		expected.add(56);
		expected.add(67);
		expected.add(69);
		expected.add(70);
		expected.add(73);
		expected.add(74);
		expected.add(76);
		expected.add(81);
		expected.add(82);
		expected.add(84);
		expected.add(88);
		expected.add(97);
		expected.add(98);
		expected.add(100);
		expected.add(15);
		expected.add(23);
		expected.add(27);
		expected.add(29);
		expected.add(30);
		expected.add(39);
		expected.add(43);
		expected.add(45);
		expected.add(46);
		expected.add(51);
		expected.add(53);
		expected.add(54);
		expected.add(57);
		expected.add(58);
		expected.add(60);
		expected.add(75);
		expected.add(77);
		expected.add(78);
		expected.add(83);
	