// IsSimplePowerTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSimplePower}.
* It contains one unit test case for the {@link IsSimplePower#isSimplePower(int, int)} method.
*/
class IsSimplePowerTest {
/**
		 * Unit test is simple if it returns true.
		 */
		@Test
		void test() {
			IsSimplePower IS = new IsSimplePower();
   			assertTrue(IS.isSimplePower(1, 1));
				assertTrue(IS.isSimplePower(2, 2));
				assertFalse(IS.isSimplePower(8, 2));
				assertTrue(IS.isSimplePower(3, 2));
				assertTrue(IS.isSimplePower(3, 1));
				assertTrue(IS.isSimplePower(5, 3));
				assertTrue(IS.isSimplePower(2, 3));
				assertTrue(IS.isSimplePower(2, 4));
				assertTrue(IS.isSimplePower(2, 6));
				assertFalse(IS.isSimplePower(1, 2));
				assertFalse(IS.isSimplePower(1, 1));
				assertTrue(IS.isSimplePower(4, 3));
				assertTrue(IS.isSimplePower(4, 4));
				assertTrue(IS.isSimplePower(4, 5));
				assertTrue(IS.isSimplePower(3, 5));
				assertTrue(IS.isSimplePower(3, 6));
				assertTrue(IS.isSimplePower(2, 6));
				assertTrue(IS.isSimplePower(48, 49));
				assertTrue(IS.isSimplePower(1, 1));
				assertTrue(IS.isSimplePower(1, 12));
		}
}
