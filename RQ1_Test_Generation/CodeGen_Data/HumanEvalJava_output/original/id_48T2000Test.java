// IsPalindromeTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPalindrome}.
* It contains one unit test case for the {@link IsPalindrome#isPalindrome(String)} method.
*/
class IsPalindromeTest {
// IsPalindrome.java
package original;

class IsPalindrome {

    /**
     * Checks if given string is a palindrome
     *
     * > isPalindrome("")
     * true
     * > isPalindrome("aba")
     * true
     * > isPalindrome("aaaaa")
     * true
     * > isPalindrome("zbcd")
     * false
     * > isPalindrome("xywyx")
     * true
     * > isPalindrome("xywyz")
     * false
     * > isPalindrome("xywzx")
     * false
     */
    public static Boolean isPalindrome(String text) {
        int i = 0;
        int j = text.length() - 1;
        while (i < j) {
            if (text.charAt(i)!= text.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

// IsPalindromeTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPalindrome}.
* It contains one unit test case for the {@link IsPalindrome#isPalindrome(String)} method.
*/
class IsPalindromeTest {
		
	@Test
	public void test() {
		// Given
		String text = "";
		
		// When
        Boolean result = IsPalindrome.isPalindrome(text);

		// Then
        assertEquals(true, result);
	}
	
}
