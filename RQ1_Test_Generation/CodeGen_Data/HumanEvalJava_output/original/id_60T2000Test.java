// SumToNTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains one unit test case for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {

	/**
	 * Test method for {@link SumToN#sumToN(int)}.
	 */
	@Test
	public void testSumToNT() {
		assertEquals(5, SumToNTest.sumToN(5));
}

