// SplitWordsTest.java
package original;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SplitWords}.
* It contains ten unit test cases for the {@link SplitWords#splitWords(String)} method.
*/
class SplitWordsTest {

	@Test
	void testSplitWords() {
		assertEquals(Arrays.asList("Hello", "world!"), SplitWords.splitWords("Hello world!"));
		assertEquals(Arrays.asList("Hello", "world!"), SplitWords.splitWords("Hello,world!"));
		assertEquals(Arrays.asList("Hello", "world,!"), SplitWords.splitWords("Hello world,!"));
		assertEquals(Arrays.asList("Hello,Hello,world", "!"), SplitWords.splitWords("Hello,Hello,world !"));
		assertEquals(3, SplitWords.splitWords("abcdef"));
		assertEquals(2, SplitWords.splitWords("aaabb"));
		assertEquals(1, SplitWords.splitWords("aaaBb"));
		assertEquals(0, SplitWords.splitWords(""));
		assertEquals(Arrays.asList("Hello", "world!"), SplitWords.splitWords("Hello world!"));
		assertEquals(Arrays.asList("Hello", "world!"), SplitWords.splitWords("Hello,world!"));
	}
}

// SplitWordsTest.java
package refactored;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SplitWords}.
* It contains ten unit test cases for the {@link SplitWords#splitWords(String)} method.
*/
class SplitWordsTest {
		
	@Test
	void testSplitWords() {
		assertEquals(Arrays.asList("Hello", "world!"), SplitWords.splitWords("Hello world!"));
		assertEquals(Arrays.asList("Hello", "world!"), SplitWords.splitWords("Hello,world!"));
		assertEquals(Arrays.asList("Hello", "world,!"), SplitWords.splitWords("Hello world,!"));
		assertEquals(Arrays.asList("Hello,Hello,world", "!"), SplitWords.splitWords("Hello,Hello,world !"));
		assertEquals(3, SplitWords.splitWords("abcdef"));
		assertEquals(2, SplitWords.splitWords("aaabb"));
		assertEquals(1, SplitWords.splitWords("aaaBb"));
		assertEquals(0, SplitWords.splitWords(""));
		assertEquals(Arrays.asList("Hello", "world!"), SplitWords.splitWords("Hello world!"));
		assertEquals(Arrays.asList("Hello", "world!"), SplitWords.splitWords("Hello,world!"));
	}
}

// SplitWords.java
package refactored;

import java.util.Arrays;

class SplitWords {

    /**
     * * Given a string of words, return a list of words split on whitespace, if no whitespaces exists in the text you
     * should split on commas ',' if no commas exists you should return the number of lower-case letters with odd order in the
     * alphabet, ord('a') = 0, ord('b') = 1, ... ord('z') = 25
     * Examples
     * splitWords("Hello world!") ➞ ["Hello", "world!"]
     * splitWords("Hello,world!") ➞ ["Hello", "world!"]
     * splitWords("abcdef") == 3
     *
     * > splitWords("Hello world!")
     * ["Hello", "world!"]
     * > splitWords("Hello,world!")
     * ["Hello", "world!"]
     * > splitWords("Hello world,!")
     * ["Hello", "world,!"]
     * > splitWords("Hello,Hello,world !")
     * ["Hello,Hello,world", "!"]
     * > splitWords("abcdef")
     * 3
     * > splitWords("aaabb")
     * 2
     * > splitWords("aaaBb")
     * 1
     * > splitWords("")
     * 0
     */
    public static Object splitWords(String txt) {
        if (txt.contains(" ")) {
            return Arrays.asList(txt.split(" "));
        } else if (txt.contains(",")) {
            return Arrays.asList(txt.split(","));
        } else {
            int count = 0;
            for (int i = 0; i < txt.length(); i++) {
                if (txt.charAt(i) >= 'a' && txt.charAt(i) <= 'z' && (txt.charAt(i) - 'a') % 2 == 1) {
                    count++;
                }
            }
            return count;
        }
    }
}