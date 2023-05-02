// IsPalindromeTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPalindrome}.
* It contains ten unit test cases for the {@link IsPalindrome#isPalindrome(String)} method.
*/
class IsPalindromeTest {

		@Test
		void testIsPalindrome() {
			assertTrue(IsPalindrome.isPalindrome(""));
			assertTrue(IsPalindrome.isPalindrome("a"));
			assertTrue(IsPalindrome.isPalindrome("aa"));
			assertTrue(IsPalindrome.isPalindrome("aba"));
			assertTrue(IsPalindrome.isPalindrome("abba"));
			assertTrue(IsPalindrome.isPalindrome("abcba"));
			assertTrue(IsPalindrome.isPalindrome("amanaplanacanalpanama"));
			assertTrue(IsPalindrome.isPalindrome("amanaplanacanalpandemonium"));
			assertFalse(IsPalindrome.isPalindrome("ab"));
			assertFalse(IsPalindrome.isPalindrome("abc"));
			assertFalse(IsPalindrome.isPalindrome("abca"));
			assertFalse(IsPalindrome.isPalindrome("abcd"));
			assertFalse(IsPalindrome.isPalindrome("abcde"));
			assertFalse(IsPalindrome.isPalindrome("abcdef"));
			assertFalse(IsPalindrome.isPalindrome("abcdefg"));
			assertFalse(IsPalindrome.isPalindrome("abcdefgh"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghi"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghij"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijk"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijkl"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklm"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmn"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmno"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnop"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopq"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqr"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrs"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrst"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstu"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuv"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvw"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwx"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxy"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyz"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyza"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzab"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabc"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcd"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcde"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcdef"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcdefg"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcdefgh"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcdefghi"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcdefghij"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcdefghijk"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcdefghijkl"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcdefghijklm"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcdefghijklmn"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcdefghijklmno"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcdefghijklmnop"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopq"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqr"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrs"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrst"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstu"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuv"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvw"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwx"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxy"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyza"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzab"));
			assertFalse(IsPalindrome.isPalindrome("abcdefghijklmnopqrstuvwxy