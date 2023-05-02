// SolveTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve}.
* It contains one unit test case for the {@link Solve#solve(String)} method.
*/
class SolveTest {

		/**
		 * {@link SolverTest#solve(String)} with the argument {@code s} as the string.
		 *
		 * @param s the string.
		 * @throws IllegalArgumentException when s is a null
		 * @throws WrongIncorrectClassException when s is not {@link String}
		 */
		private void assertSolve(String s) throws IllegalArgumentException {
			String result = new Solve().solve("#" + s);
			assertEquals(s, result);
		}

		/**
		 * One test case for the {@link Solve#solve(String)} method.
		 */
		@Test
		public void solve() {
			
			//Null input
			assertNull(new Solve().solve(""));
			
			assertNull("null", new Solve().solve("#"));
			
			//Non-null input
			assertNotNull("null", new Solve().solve("#abcde"));
			assertNotNull("non-null", new Solve().solve("#asdf"));
			
			assertNull("null", new Solve().solve("#ccc"));
			assertNotNull("non-null", new Solve().solve("#cWY"));
			
			assertNull("null", new Solve().solve("##"));
			assertNull("wrong type", new Solve().solve("#2"));
			assertNull("wrong type", new Solve().solve("#123"));
		}
}
