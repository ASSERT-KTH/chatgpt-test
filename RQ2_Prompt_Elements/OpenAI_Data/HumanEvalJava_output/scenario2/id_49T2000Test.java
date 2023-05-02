// ModpTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Modp}.
* It contains ten unit test cases for the {@link Modp#modp(int, int)} method.
*/
class ModpTest {

	/**
	 * Test case for {@link Modp#modp(int, int)} method.
	 * It tests the case when the first parameter is negative.
	 */
	@Test
	void testModp_NegativeFirstParameter() {
		assertEquals(0, Modp.modp(-1, 2));
	}
	
	/**
	 * Test case for {@link Modp#modp(int, int)} method.
	 * It tests the case when the second parameter is negative.
	 */
	@Test
	void testModp_NegativeSecondParameter() {
		assertEquals(0, Modp.modp(1, -2));
	}
	
	/**
	 * Test case for {@link Modp#modp(int, int)} method.
	 * It tests the case when the first parameter is zero.
	 */
	@Test
	void testModp_ZeroFirstParameter() {
		assertEquals(0, Modp.modp(0, 2));
	}
	
	/**
	 * Test case for {@link Modp#modp(int, int)} method.
	 * It tests the case when the second parameter is zero.
	 */
	@Test
	void testModp_ZeroSecondParameter() {
		assertEquals(0, Modp.modp(1, 0));
	}
	
	/**
	 * Test case for {@link Modp#modp(int, int)} method.
	 * It tests the case when the first parameter is positive and the second parameter is positive.
	 */
	@Test
	void testModp_PositiveFirstParameterAndPositiveSecondParameter() {
		assertEquals(1, Modp.modp(1, 2));
	}
	
	/**
	 * Test case for {@link Modp#modp(int, int)} method.
	 * It tests the case when the first parameter is positive and the second parameter is positive.
	 */
	@Test
	void testModp_PositiveFirstParameterAndPositiveSecondParameter2() {
		assertEquals(0, Modp.modp(2, 2));
	}
	
	/**
	 * Test case for {@link Modp#modp(int, int)} method.
	 * It tests the case when the first parameter is positive and the second parameter is positive.
	 */
	@Test
	void testModp_PositiveFirstParameterAndPositiveSecondParameter3() {
		assertEquals(1, Modp.modp(3, 2));
	}
	
	/**
	 * Test case for {@link Modp#modp(int, int)} method.
	 * It tests the case when the first parameter is positive and the second parameter is positive.
	 */
	@Test
	void testModp_PositiveFirstParameterAndPositiveSecondParameter4() {
		assertEquals(0, Modp.modp(4, 2));
	}
	
	/**
	 * Test case for {@link Modp#modp(int, int)} method.
	 * It tests the case when the first parameter is positive and the second parameter is positive.
	 */
	@Test
	void testModp_PositiveFirstParameterAndPositiveSecondParameter5() {
		assertEquals(1, Modp.modp(5, 2));
	}
	
	/**
	 * Test case for {@link Modp#modp(int, int)} method.
	 * It tests the case when the first parameter is positive and the second parameter is positive.
	 */
	@Test
	void testModp_PositiveFirstParameterAndPositiveSecondParameter6() {
		assertEquals(0, Modp.modp(6, 2));
	}
	
	/**
	 * Test case for {@link Modp#modp(int, int)} method.
	 * It tests the case when the first parameter is positive and the second parameter is positive.
	 */
	@Test
	void testModp_PositiveFirstParameterAndPositiveSecondParameter7() {
		assertEquals(1, Modp.modp(7, 2));
	}
	
	/**
	 * Test case for {@link Modp#modp(int, int)} method.
	 * It tests the case when the first parameter is positive and the second parameter is positive.
	 */
	@Test
	void testModp_PositiveFirstParameterAndPositiveSecondParameter8() {
		assertEquals(0, Modp.modp(8, 2));
	}
	
	/**
	 * Test case for {@link Modp#modp(int, int)} method.
	 * It tests the case when the first parameter is positive and the second parameter is positive.
	 */
	@Test
	void testModp_PositiveFirstParameterAndPositiveSecondParameter9() {
		assertEquals(1, Modp.modp(9, 2));
	}
	
	/**
	 * Test case for {@link Modp#modp(int, int)} method.
	 * It tests the case when the first parameter is positive and the second parameter is positive.
	 */
	@Test
	void testModp_PositiveFirstParameterAndPositiveSecondParameter10() {
		assertEquals(0, Modp.modp(10, 2));
	}
	
	/**
	 * Test case for {@link Modp#modp(int, int)} method.
	 * It tests the case when the first parameter is positive and the second parameter is positive.
	 */
	@Test
	void testModp_PositiveFirstParameterAndPositiveSecondParameter11() {
		assertEquals(1, Modp.modp(11, 2));
	}
	
	/**
	 * Test case for {@link Modp#modp(int, int)} method.
	 * It tests the case when the first parameter is positive and the second parameter is positive.
	 */
	@Test
	void testModp_PositiveFirstParameterAndPositiveSecondParameter12() {
		assertEquals(0, Modp.modp(12, 2));
	}
	
	/**
	 * Test case for {@link Modp#modp(int, int)} method.
	 * It tests the case when the first parameter is positive and the second parameter is positive.
	 */
	@Test
	void testModp_PositiveFirstParameterAndPositiveSecondParameter13() {
		assertEquals(1, Modp.modp(13, 2));
	}
	
	/**
	 * Test case for {@link Modp#modp(int, int)} method.
	 * It tests the case when the first parameter is positive and the second parameter is positive.
	 */
	@Test
	void testModp_PositiveFirstParameterAndPositiveSecondParameter14() {
		assertEquals(0, Modp.modp(14, 2));
	}
	
	/**
	 * Test case for {@link Modp#modp(int, int)} method.
	 * It tests the case when the first parameter is positive and the second parameter is positive.
	 */
	@Test
	void testModp_PositiveFirstParameterAndPositiveSecondParameter15() {
		assertEquals(1, Modp.modp(15, 2));
	}
	
	/**
	 * Test case for {@link Modp#modp(int, int)} method.
	 * It tests the case when the first parameter is positive and the second parameter is positive.
	 */
	@Test
	void testModp_PositiveFirstParameterAndPositiveSecondParameter16() {
		assertEquals(0, Modp.modp(16, 2));
	}
	
	/**
	 * Test case for {@link Modp#modp(int, int)} method.
	 * It tests the case when the first parameter is positive and the second parameter is positive.
	 */
	@Test
	void testModp_PositiveFirstParameterAndPositiveSecondParameter17() {
		assertEquals(1, Modp.modp(17, 2));
	}
	
	/**
	 * Test case for {@link Modp#modp(int, int)} method.
	 * It tests the case when the first parameter is positive and the second parameter is positive.
	 */
	@Test
	void testModp_PositiveFirstParameterAndPositiveSecondParameter18() {
		assertEquals