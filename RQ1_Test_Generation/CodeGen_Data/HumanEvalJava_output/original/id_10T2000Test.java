// MakePalindromeTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakePalindrome}.
* It contains one unit test case for the {@link MakePalindrome#makePalindrome(String)} method.
*/
class MakePalindromeTest {
// Method to call the same method without parameter (test name)
		@Test
		void testMakePalindrome(String string) {
			assertFalse(makePalindrome(string).equals(null));
}

		// Method to call the same method with parameter (test name)
		@Test
		void testMakePalindrome(String string, char a) {
			assertFalse(makePalindrome(string).equals(makePalindrome(string, (byte) a)));
		}

		// Method to call the same method without parameter (test name)
		@Test
		void testMakePalindrome(String string, short a) {
			assertFalse(makePalindrome(string).equals(makePalindrome(string, (byte) a)));
		}

		// Method to call the same method without parameter (test name)
		@Test
		void testMakePalindrome(String string, int a) {
			assertFalse(makePalindrome(string).equals(makePalindrome(string, (byte) a)));
		}

		// Method to call the same method without parameter (test name)
		@Test
		void testMakePalindrome(String string, char b) {
			assertFalse(makePalindrome(string).equals(makePalindrome(string, (byte) b)));
		}

		// Method to call the same method without parameter (test name)
		@Test
		void testMakePalindrome(String string, short b) {
			assertFalse(makePalindrome(string).equals(makePalindrome(string, (byte) b)));
		}

		// Method to call the same method without parameter (test name)
		@Test
		void testMakePalindrome(String string, int b) {
			assertFalse(makePalindrome(string).equals(makePalindrome(string, (byte) b)));
		}

		@Test
		void testMakePalindrome(String string, byte b) {
			assertFalse(makePalindrome(string).equals(makePalindrome(string, (byte) b)));
		}

		// More tests if all expected methods or parameters of the methods fail
		@Test
		void testMakePalindrome1(String string) {
			assertEquals(MakePalindrome.makePalindrome(string), string);
		}

		@Test
		void testMakePalindrome2(String string) {
			assertNotEquals(MakePalindrome.makePalindrome(string), string);
		}

		@Test
		void testMakePalindrome2a(String string) {
			assertNotEquals(MakePalindrome.makePalindrome(string), MakePalindrome.makePalindrome(string));
		}
		
		
		@Test
		void testReverse(String string) {
			String reversed = string.substring(string.length() - 1, string.length()).reverse();
			log.info(reversed);
			assertNotEquals(String.valueOf(reversed), string.length() - 1);
		}

		
		@Test
		void testReverse2(String string) {
			string = "xxx";
			string = string.split(" ")[0];
			string = string.trim();
			System.out.println(string);
			assertNotEquals(string, "");
		}

		@Test
		void testReverse3(String string) {
			assertNotEquals(0, string.length());
			int offset = 0;
			string = string.substring(string.length() - offset, string.length());
			assertEquals(0, string.length());
		}


		@Test
		void testSplit2(String string) {
			String[] split = string.split(" ");
			log.info(split.length);
			assertNotEquals(split.length / 3, string.length());
		}

		@Test
		void testSplit4(String string) {
			String[] split = string.split(" ");
			log.info(split.length);
			assertEquals(3, split.length / 3);
		}

		@Test
		void testSplit5(String string) {
			String[] split = string.split(" ");
			log.info(split.length);
			assertFalse(string.substring(string.length() - split.length).equalsIgnoreCase(""));
		}
}
