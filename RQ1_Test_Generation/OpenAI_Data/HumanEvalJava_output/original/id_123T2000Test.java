// GetOddCollatzTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetOddCollatz}.
* It contains ten unit test cases for the {@link GetOddCollatz#getOddCollatz(int)} method.
*/
class GetOddCollatzTest {

	/**
	* Test case for {@link GetOddCollatz#getOddCollatz(int)} method.
	* It tests the method with a positive integer n.
	* The expected result is a sorted list that has the odd numbers in collatz sequence.
	*/
	@Test
	void testGetOddCollatz() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(5);
		expected.add(7);
		expected.add(11);
		expected.add(13);
		expected.add(17);
		List<Integer> actual = GetOddCollatz.getOddCollatz(14);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetOddCollatz#getOddCollatz(int)} method.
	* It tests the method with a positive integer n.
	* The expected result is a sorted list that has the odd numbers in collatz sequence.
	*/
	@Test
	void testGetOddCollatz2() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(5);
		List<Integer> actual = GetOddCollatz.getOddCollatz(5);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetOddCollatz#getOddCollatz(int)} method.
	* It tests the method with a positive integer n.
	* The expected result is a sorted list that has the odd numbers in collatz sequence.
	*/
	@Test
	void testGetOddCollatz3() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(3);
		expected.add(5);
		List<Integer> actual = GetOddCollatz.getOddCollatz(12);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetOddCollatz#getOddCollatz(int)} method.
	* It tests the method with a positive integer n.
	* The expected result is a sorted list that has the odd numbers in collatz sequence.
	*/
	@Test
	void testGetOddCollatz4() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		List<Integer> actual = GetOddCollatz.getOddCollatz(1);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetOddCollatz#getOddCollatz(int)} method.
	* It tests the method with a positive integer n.
	* The expected result is a sorted list that has the odd numbers in collatz sequence.
	*/
	@Test
	void testGetOddCollatz5() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(9);
		expected.add(11);
		expected.add(13);
		expected.add(15);
		expected.add(17);
		expected.add(19);
		expected.add(21);
		expected.add(23);
		expected.add(25);
		expected.add(27);
		expected.add(29);
		expected.add(31);
		expected.add(33);
		expected.add(35);
		expected.add(37);
		expected.add(39);
		expected.add(41);
		expected.add(43);
		expected.add(45);
		expected.add(47);
		expected.add(49);
		expected.add(51);
		expected.add(53);
		expected.add(55);
		expected.add(57);
		expected.add(59);
		expected.add(61);
		expected.add(63);
		expected.add(65);
		expected.add(67);
		expected.add(69);
		expected.add(71);
		expected.add(73);
		expected.add(75);
		expected.add(77);
		expected.add(79);
		expected.add(81);
		expected.add(83);
		expected.add(85);
		expected.add(87);
		expected.add(89);
		expected.add(91);
		expected.add(93);
		expected.add(95);
		expected.add(97);
		expected.add(99);
		expected.add(101);
		expected.add(103);
		expected.add(105);
		expected.add(107);
		expected.add(109);
		expected.add(111);
		expected.add(113);
		expected.add(115);
		expected.add(117);
		expected.add(119);
		expected.add(121);
		expected.add(123);
		expected.add(125);
		expected.add(127);
		expected.add(129);
		expected.add(131);
		expected.add(133);
		expected.add(135);
		expected.add(137);
		expected.add(139);
		expected.add(141);
		expected.add(143);
		expected.add(145);
		expected.add(147);
		expected.add(149);
		expected.add(151);
		expected.add(153);
		expected.add(155);
		expected.add(157);
		expected.add(159);
		expected.add(161);
		expected.add(163);
		expected.add(165);
		expected.add(167);
		expected.add(169);
		expected.add(171);
		expected.add(173);
		expected.add(175);
		expected.add(177);
		expected.add(179);
		expected.add(181);
		expected.add(183);
		expected.add(185);
		expected.add(187);
		expected.add(189);
		expected.add(191);
		expected.add(193);
		expected.add(195);
		expected.add(197);
		expected.add(199);
		expected.add(201);
		expected.add(203);
		expected.add(205);
		expected.add(207);
		expected.add(209);
		expected.add(211);
		expected.add(213);
		expected.add(215);
		expected.add(217);
		expected.add(219);
		expected.add(221);
		expected.add(223);
		expected.add(225);
		expected.add(227);
		expected.add(229);
		expected.add(231);
		expected.add(233);
		expected.add(235);
		expected.add(237);
		expected.add(239);
		expected.add(241);
		expected.add(243);
		expected.add(245);
		expected.add(247);
		expected.add(249);
		expected.add(251);
		expected.add(253);
		expected.add(255);
		expected.add(257);
		expected.add(259);
		expected.add(261);
		expected.add(263);
		expected.add(265);
		expected.add(267);
		expected.add(269);
		expected.add(271);
		expected.add(273);
		expected.add(275);
		expected.add(277);
		expected.add