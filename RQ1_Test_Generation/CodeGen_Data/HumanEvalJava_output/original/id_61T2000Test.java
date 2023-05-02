// CorrectBracketing1Test.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing1}.
* It contains one unit test case for the {@link CorrectBracketing1#correctBracketing(String)} method.
*/
class CorrectBracketing1Test {
/**
		* Unit test for the {@link CorrectBracketing1#correctBracketing(String)} method.
		*/
	@Test
	public void correctlyBracketing1() {
		
		assertTrue(correctBracketing("()"));
		assertTrue(correctBracketing("()"));
		assertTrue(correctBracketing("()()"));
		assertTrue(correctBracketing("()()()"));
		assertTrue(correctBracketing("()()()()"));
		assertTrue(correctBracketing("(()())"));
		assertTrue(correctBracketing("()()()()"));
		assertTrue(correctBracketing("()()()"));
		assertTrue(correctBracketing("()()()()()"));
		assertTrue(correctBracketing("(())()()()"));
		assertTrue(correctBracketing("()()()()()()"));
		assertTrue(correctBracketing("()()()()()()"));
		assertTrue(correctBracketing("()()()"));
		assertTrue(correctBracketing("(()()()()())()"));
		assertTrue(correctBracketing("(())()()()()"));
	}

}