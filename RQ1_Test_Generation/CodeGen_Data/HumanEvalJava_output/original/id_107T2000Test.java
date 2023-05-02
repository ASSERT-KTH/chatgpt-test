// EvenOddPalindromeTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddPalindrome}.
* It contains one unit test case for the {@link EvenOddPalindrome#evenOddPalindrome(int)} method.
*/
class EvenOddPalindromeTest {
@Test
		void evenOddPalindromeTest() {
				EvenOddPalindromePalindrome test = new EvenOddPalindromePalindrome();
				ArrayList<Integer> resultList = new ArrayList<>();
				resultList.add(test.evenOddPalindrome(10));
				assertEquals("testevenoddpalindrome", resultList, test.evenOddPalindrome(10));
		}
}
