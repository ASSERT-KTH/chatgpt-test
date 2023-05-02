// WordsInSentenceTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsInSentence}.
* It contains ten unit test cases for the {@link WordsInSentence#wordsInSentence(String)} method.
*/
class WordsInSentenceTest {

		@Test
		void testWordsInSentence() {
				assertEquals("", WordsInSentence.wordsInSentence(""));
				assertEquals("", WordsInSentence.wordsInSentence(" "));
				assertEquals("", WordsInSentence.wordsInSentence("  "));
				assertEquals("", WordsInSentence.wordsInSentence("   "));
				assertEquals("", WordsInSentence.wordsInSentence("    "));
				assertEquals("", WordsInSentence.wordsInSentence("     "));
				assertEquals("", WordsInSentence.wordsInSentence("      "));
				assertEquals("", WordsInSentence.wordsInSentence("       "));
				assertEquals("", WordsInSentence.wordsInSentence("        "));
				assertEquals("", WordsInSentence.wordsInSentence("         "));
		}
		
		@Test
		void testWordsInSentence2() {
				assertEquals("", WordsInSentence.wordsInSentence("a"));
				assertEquals("", WordsInSentence.wordsInSentence("a "));
				assertEquals("", WordsInSentence.wordsInSentence("a  "));
				assertEquals("", WordsInSentence.wordsInSentence("a   "));
				assertEquals("", WordsInSentence.wordsInSentence("a    "));
				assertEquals("", WordsInSentence.wordsInSentence("a     "));
				assertEquals("", WordsInSentence.wordsInSentence("a      "));
				assertEquals("", WordsInSentence.wordsInSentence("a       "));
				assertEquals("", WordsInSentence.wordsInSentence("a        "));
				assertEquals("", WordsInSentence.wordsInSentence("a         "));
		}
		
		@Test
		void testWordsInSentence3() {
				assertEquals("", WordsInSentence.wordsInSentence(" a"));
				assertEquals("", WordsInSentence.wordsInSentence(" a "));
				assertEquals("", WordsInSentence.wordsInSentence(" a  "));
				assertEquals("", WordsInSentence.wordsInSentence(" a   "));
				assertEquals("", WordsInSentence.wordsInSentence(" a    "));
				assertEquals("", WordsInSentence.wordsInSentence(" a     "));
				assertEquals("", WordsInSentence.wordsInSentence(" a      "));
				assertEquals("", WordsInSentence.wordsInSentence(" a       "));
				assertEquals("", WordsInSentence.wordsInSentence(" a        "));
				assertEquals("", WordsInSentence.wordsInSentence(" a         "));
		}
		
		@Test
		void testWordsInSentence4() {
				assertEquals("", WordsInSentence.wordsInSentence("a "));
				assertEquals("", WordsInSentence.wordsInSentence("a  "));
				assertEquals("", WordsInSentence.wordsInSentence("a   "));
				assertEquals("", WordsInSentence.wordsInSentence("a    "));
				assertEquals("", WordsInSentence.wordsInSentence("a     "));
				assertEquals("", WordsInSentence.wordsInSentence("a      "));
				assertEquals("", WordsInSentence.wordsInSentence("a       "));
				assertEquals("", WordsInSentence.wordsInSentence("a        "));
				assertEquals("", WordsInSentence.wordsInSentence("a         "));
		}
		
		@Test
		void testWordsInSentence5() {
				assertEquals("", WordsInSentence.wordsInSentence(" a"));
				assertEquals("", WordsInSentence.wordsInSentence(" a "));
				assertEquals("", WordsInSentence.wordsInSentence(" a  "));
				assertEquals("", WordsInSentence.wordsInSentence(" a   "));
				assertEquals("", WordsInSentence.wordsInSentence(" a    "));
				assertEquals("", WordsInSentence.wordsInSentence(" a     "));
				assertEquals("", WordsInSentence.wordsInSentence(" a      "));
				assertEquals("", WordsInSentence.wordsInSentence(" a       "));
				assertEquals("", WordsInSentence.wordsInSentence(" a        "));
				assertEquals("", WordsInSentence.wordsInSentence(" a         "));
		}
		
		@Test
		void testWordsInSentence6() {
				assertEquals("", WordsInSentence.wordsInSentence("a b"));
				assertEquals("", WordsInSentence.wordsInSentence("a b "));
				assertEquals("", WordsInSentence.wordsInSentence("a b  "));
				assertEquals("", WordsInSentence.wordsInSentence("a b   "));
				assertEquals("", WordsInSentence.wordsInSentence("a b    "));
				assertEquals("", WordsInSentence.wordsInSentence("a b     "));
				assertEquals("", WordsInSentence.wordsInSentence("a b      "));
				assertEquals("", WordsInSentence.wordsInSentence("a b       "));
				assertEquals("", WordsInSentence.wordsInSentence("a b        "));
				assertEquals("", WordsInSentence.wordsInSentence("a b         "));
		}
		
		@Test
		void testWordsInSentence7() {
				assertEquals("", WordsInSentence.wordsInSentence(" a b"));
				assertEquals("", WordsInSentence.wordsInSentence(" a b "));
				assertEquals("", WordsInSentence.wordsInSentence(" a b  "));
				assertEquals("", WordsInSentence.wordsInSentence(" a b   "));
				assertEquals("", WordsInSentence.wordsInSentence(" a b    "));
				assertEquals("", WordsInSentence.wordsInSentence(" a b     "));
				assertEquals("", WordsInSentence.wordsInSentence(" a b      "));
				assertEquals("", WordsInSentence.wordsInSentence(" a b       "));
				assertEquals("", WordsInSentence.wordsInSentence(" a b        "));
				assertEquals("", WordsInSentence.wordsInSentence(" a b         "));
		}
		
		@Test
		void testWordsInSentence8() {
				assertEquals("", WordsInSentence.wordsInSentence("a b "));
				assertEquals("", WordsInSentence.wordsInSentence("a b  "));
				assertEquals("", WordsInSentence.wordsInSentence("a b   "));
				assertEquals("", WordsInSentence.wordsInSentence("a b    "));
				assertEquals("", WordsInSentence.wordsInSentence("a b     "));
				assertEquals("", WordsInSentence.wordsInSentence("a b      "));
				assertEquals("", WordsInSentence