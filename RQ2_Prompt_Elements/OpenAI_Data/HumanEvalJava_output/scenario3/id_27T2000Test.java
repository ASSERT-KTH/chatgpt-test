// FlipCaseTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FlipCase}.
* It contains ten unit test cases for the {@link FlipCase#flipCase(String)} method.
*/
class FlipCaseTest {

	@Test
	void testFlipCase_emptyString() {
		assertEquals("", FlipCase.flipCase(""));
	}
	
	@Test
	void testFlipCase_singleCharacter() {
		assertEquals("a", FlipCase.flipCase("A"));
		assertEquals("A", FlipCase.flipCase("a"));
	}
	
	@Test
	void testFlipCase_singleWord() {
		assertEquals("hELLO", FlipCase.flipCase("Hello"));
		assertEquals("HELLO", FlipCase.flipCase("hello"));
	}
	
	@Test
	void testFlipCase_singleWordWithPunctuation() {
		assertEquals("hELLO!", FlipCase.flipCase("Hello!"));
		assertEquals("HELLO!", FlipCase.flipCase("hello!"));
	}
	
	@Test
	void testFlipCase_multipleWords() {
		assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS", FlipCase.flipCase("These violent delights have violent ends"));
		assertEquals("THESE VIOLENT DELIGHTS HAVE VIOLENT ENDS", FlipCase.flipCase("these violent delights have violent ends"));
	}
	
	@Test
	void testFlipCase_multipleWordsWithPunctuation() {
		assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS!", FlipCase.flipCase("These violent delights have violent ends!"));
		assertEquals("THESE VIOLENT DELIGHTS HAVE VIOLENT ENDS!", FlipCase.flipCase("these violent delights have violent ends!"));
	}
	
	@Test
	void testFlipCase_multipleWordsWithNumbers() {
		assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS! 1", FlipCase.flipCase("These violent delights have violent ends! 1"));
		assertEquals("THESE VIOLENT DELIGHTS HAVE VIOLENT ENDS! 1", FlipCase.flipCase("these violent delights have violent ends! 1"));
	}
	
	@Test
	void testFlipCase_multipleWordsWithNumbersAndPunctuation() {
		assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS! 1.", FlipCase.flipCase("These violent delights have violent ends! 1."));
		assertEquals("THESE VIOLENT DELIGHTS HAVE VIOLENT ENDS! 1.", FlipCase.flipCase("these violent delights have violent ends! 1."));
	}
	
	@Test
	void testFlipCase_multipleWordsWithNumbersAndPunctuationAndSpaces() {
		assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS! 1. ", FlipCase.flipCase("These violent delights have violent ends! 1. "));
		assertEquals("THESE VIOLENT DELIGHTS HAVE VIOLENT ENDS! 1. ", FlipCase.flipCase("these violent delights have violent ends! 1. "));
	}
	
	@Test
	void testFlipCase_multipleWordsWithNumbersAndPunctuationAndSpacesAndNewlines() {
		assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS! 1. \n", FlipCase.flipCase("These violent delights have violent ends! 1. \n"));
		assertEquals("THESE VIOLENT DELIGHTS HAVE VIOLENT ENDS! 1. \n", FlipCase.flipCase("these violent delights have violent ends! 1. \n"));
	}
}