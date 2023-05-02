// StartsOneEndsTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartsOneEnds}.
* It contains ten unit test cases for the {@link StartsOneEnds#startsOneEnds(int)} method.
*/
class StartsOneEndsTest {

	/**
	* Test case 1.
	* The input is 1.
	* The expected output is 2.
	*/
	@Test
	void testStartsOneEnds1() {
		assertEquals(2, StartsOneEnds.startsOneEnds(1));
	}
	
	/**
	* Test case 2.
	* The input is 2.
	* The expected output is 12.
	*/
	@Test
	void testStartsOneEnds2() {
		assertEquals(12, StartsOneEnds.startsOneEnds(2));
	}
	
	/**
	* Test case 3.
	* The input is 3.
	* The expected output is 60.
	*/
	@Test
	void testStartsOneEnds3() {
		assertEquals(60, StartsOneEnds.startsOneEnds(3));
	}
	
	/**
	* Test case 4.
	* The input is 4.
	* The expected output is 300.
	*/
	@Test
	void testStartsOneEnds4() {
		assertEquals(300, StartsOneEnds.startsOneEnds(4));
	}
	
	/**
	* Test case 5.
	* The input is 5.
	* The expected output is 1500.
	*/
	@Test
	void testStartsOneEnds5() {
		assertEquals(1500, StartsOneEnds.startsOneEnds(5));
	}
	
	/**
	* Test case 6.
	* The input is 6.
	* The expected output is 7500.
	*/
	@Test
	void testStartsOneEnds6() {
		assertEquals(7500, StartsOneEnds.startsOneEnds(6));
	}
	
	/**
	* Test case 7.
	* The input is 7.
	* The expected output is 37500.
	*/
	@Test
	void testStartsOneEnds7() {
		assertEquals(37500, StartsOneEnds.startsOneEnds(7));
	}
	
	/**
	* Test case 8.
	* The input is 8.
	* The expected output is 187500.
	*/
	@Test
	void testStartsOneEnds8() {
		assertEquals(187500, StartsOneEnds.startsOneEnds(8));
	}
	
	/**
	* Test case 9.
	* The input is 9.
	* The expected output is 937500.
	*/
	@Test
	void testStartsOneEnds9() {
		assertEquals(937500, StartsOneEnds.startsOneEnds(9));
	}
	
	/**
	* Test case 10.
	* The input is 10.
	* The expected output is 4687500.
	*/
	@Test
	void testStartsOneEnds10() {
		assertEquals(4687500, StartsOneEnds.startsOneEnds(10));
	}
}