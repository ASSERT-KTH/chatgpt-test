// TriplesSumToZeroTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriplesSumToZero}.
* It contains one unit test case for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
*/
class TriplesSumToZeroTest {

	/**
	 * One test function for two unit tests.
	 * @throws Exception exception thrown if an error occurs.
	 */
	@Test
    public void test1() throws Exception {
        // 1. call the method and check the output
        Boolean result = TriplesSumToZero.triplesSumToZero(12, 13);
        assertNotNull(result);
        assertEquals(true, result);
        assertFalse(TriplesSumToZero.triplesSumToZero(23, 14).equals(true));
    }
	
	/**
	 * One test function for three unit tests.
	 * @throws Exception exception thrown if an error occurs.
	 */
	@Test
    public void test2() throws Exception {
        // 1. call the method and check the output
        Integer result = TriplesSumToZero.triplesSumToZero(0, 3, -4);
        assertNotNull(result);
        assertEquals(5, result);
        assertFalse(TriplesSumToZero.triplesSumToZero(-1, 2, -7) == true);
    }
	
	/**
	 * One test function for four unit tests.
	 * @throws Exception exception thrown if an error occurs.
	 */
	@Test
    public void test3() throws Exception {
        // 1. call the method and check the output
        Integer[] result = TriplesSumToZero.triplesSumToZero(3, 0, 3);
        assertNotNull(result);
        assertEquals(5, result.length);
        assertEquals(5, result[0]);
        assertEquals(5, result[1]);
        assertEquals(5, result[2]);
        assertFalse(TriplesSumToZero.triplesSumToZero(-1, 5, 5).equals(true));
    }
}

