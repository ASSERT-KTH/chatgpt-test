// DerivativeTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Derivative}.
* It contains ten unit test cases for the {@link Derivative#derivative(List)} method.
*/
class DerivativeTest {

	/**
	* Test case 1.
	* The input is a list of integers.
	* The expected output is a list of integers.
	*/
	@Test
	void testDerivative1() {
		List<Integer> xs = new ArrayList<Integer>();
		xs.add(1);
		xs.add(2);
		xs.add(3);
		xs.add(4);
		xs.add(5);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(6);
		expected.add(12);
		expected.add(20);
		List<Object> actual = Derivative.derivative(xs);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input is a list of integers.
	* The expected output is a list of integers.
	*/
	@Test
	void testDerivative2() {
		List<Integer> xs = new ArrayList<Integer>();
		xs.add(1);
		xs.add(2);
		xs.add(3);
		xs.add(4);
		xs.add(5);
		xs.add(6);
		xs.add(7);
		xs.add(8);
		xs.add(9);
		xs.add(10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(6);
		expected.add(12);
		expected.add(20);
		expected.add(30);
		expected.add(42);
		expected.add(56);
		expected.add(72);
		expected.add(90);
		List<Object> actual = Derivative.derivative(xs);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input is a list of integers.
	* The expected output is a list of integers.
	*/
	@Test
	void testDerivative3() {
		List<Integer> xs = new ArrayList<Integer>();
		xs.add(1);
		xs.add(2);
		xs.add(3);
		xs.add(4);
		xs.add(5);
		xs.add(6);
		xs.add(7);
		xs.add(8);
		xs.add(9);
		xs.add(10);
		xs.add(11);
		xs.add(12);
		xs.add(13);
		xs.add(14);
		xs.add(15);
		xs.add(16);
		xs.add(17);
		xs.add(18);
		xs.add(19);
		xs.add(20);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(6);
		expected.add(12);
		expected.add(20);
		expected.add(30);
		expected.add(42);
		expected.add(56);
		expected.add(72);
		expected.add(90);
		expected.add(110);
		expected.add(132);
		expected.add(156);
		expected.add(182);
		expected.add(210);
		expected.add(240);
		expected.add(272);
		expected.add(306);
		expected.add(342);
		expected.add(380);
		List<Object> actual = Derivative.derivative(xs);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input is a list of integers.
	* The expected output is a list of integers.
	*/
	@Test
	void testDerivative4() {
		List<Integer> xs = new ArrayList<Integer>();
		xs.add(1);
		xs.add(2);
		xs.add(3);
		xs.add(4);
		xs.add(5);
		xs.add(6);
		xs.add(7);
		xs.add(8);
		xs.add(9);
		xs.add(10);
		xs.add(11);
		xs.add(12);
		xs.add(13);
		xs.add(14);
		xs.add(15);
		xs.add(16);
		xs.add(17);
		xs.add(18);
		xs.add(19);
		xs.add(20);
		xs.add(21);
		xs.add(22);
		xs.add(23);
		xs.add(24);
		xs.add(25);
		xs.add(26);
		xs.add(27);
		xs.add(28);
		xs.add(29);
		xs.add(30);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(6);
		expected.add(12);
		expected.add(20);
		expected.add(30);
		expected.add(42);
		expected.add(56);
		expected.add(72);
		expected.add(90);
		expected.add(110);
		expected.add(132);
		expected.add(156);
		expected.add(182);
		expected.add(210);
		expected.add(240);
		expected.add(272);
		expected.add(306);
		expected.add(342);
		expected.add(380);
		expected.add(420);
		expected.add(462);
		expected.add(506);
		expected.add(552);
		expected.add(600);
		expected.add(650);
		expected.add(702);
		expected.add(756);
		expected.add(812);
		expected.add(870);
		List<Object> actual = Derivative.derivative(xs);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input is a list of integers.
	* The expected output is a list of integers.
	*/
	@Test
	void testDerivative5() {
		List<Integer> xs = new ArrayList<Integer>();
		xs.add(1);
		xs.add(2);
		xs.add(3);
		xs.add(4);
		xs.add(5);
		xs.add(6);
		xs.add(7);
		xs.add(8);
		xs.add(9);
		xs.add(10);
		xs.add(11);
		xs.add(12);
		xs.add(13);
		xs.add(14);
		xs.add(15);
		xs.add(16);
		xs.add(17);
		xs.add(18);
		xs.add(19);
		xs.add(20);
		xs.add(21);
		xs.add(22);
		xs.add(23);
		xs.add(24);
		xs.add(25);
		xs.add(26);
		xs.add(27);
		xs.add(28);
		xs.add(29);
		xs.add(30);
		xs.add(31);
		xs.add(32);
		xs.add(33);
		xs.add(34);
		xs.add(35);
		xs.add(36);
	