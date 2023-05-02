// ReverseDelete.java
package revised;

import java.util.Arrays;
import java.util.List;

class ReverseDelete {

    /**
     * Task
     * We are given two strings s and c, you have to deleted all the characters in s that are equal to any character in c
     * then check if the result string is palindrome.
     * A string is called palindrome if it reads the same backward as forward.
     * You should return a tuple containing the result string and True/False for the check.
     * Example
     * For s = "abcde", c = "ae", the result should be ('bcd',False)
     * For s = "abcdef", c = "b"  the result should be ('acdef',False)
     * For s = "abcdedcba", c = "ab", the result should be ('cdedc',True)
     *
     * > reverseDelete("abcde", "ae")
     * ["bcd", false]
     * > reverseDelete("abcdef", "b")
     * ["acdef", false]
     * > reverseDelete("abcdedcba", "ab")
     * ["cdedc", true]
     * > reverseDelete("dwik", "w")
     * ["dik", false]
     * > reverseDelete("a", "a")
     * ["", true]
     * > reverseDelete("abcdedcba", "")
     * ["abcdedcba", true]
     * > reverseDelete("abcdedcba", "v")
     * ["abcdedcba", true]
     * > reverseDelete("vabba", "v")
     * ["abba", true]
     * > reverseDelete("mamma", "mia")
     * ["", true]
     */
    public static List<Object> reverseDelete(String s, String c) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (c.indexOf(s.charAt(i)) == -1) {
                result.append(s.charAt(i));
            }
        }
        boolean isPalindrome = true;
        for (int i = 0; i < result.length() / 2; i++) {
            if (result.charAt(i) != result.charAt(result.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        return Arrays.asList(result.toString(), isPalindrome);
    }
}

// ReverseDeleteTest.java
package revised;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ReverseDelete}.
* It contains ten unit test cases for the {@link ReverseDelete#reverseDelete(String, String)} method.
*/
class ReverseDeleteTest {
    
    @Test
    void testReverseDelete1() {
        List<Object> expected = Arrays.asList("bcd", false);
        List<Object> actual = ReverseDelete.reverseDelete("abcde", "ae");
        assertEquals(expected, actual);
    }
    
    @Test
    void testReverseDelete2() {
        List<Object> expected = Arrays.asList("acdef", false);
        List<Object> actual = ReverseDelete.reverseDelete("abcdef", "b");
        assertEquals(expected, actual);
    }
    
    @Test
    void testReverseDelete3() {
        List<Object> expected = Arrays.asList("cdedc", true);
        List<Object> actual = ReverseDelete.reverseDelete("abcdedcba", "ab");
        assertEquals(expected, actual);
    }
    
    @Test
    void testReverseDelete4() {
        List<Object> expected = Arrays.asList("dik", false);
        List<Object> actual = ReverseDelete.reverseDelete("dwik", "w");
        assertEquals(expected, actual);
    }
    
    @Test
    void testReverseDelete5() {
        List<Object> expected = Arrays.asList("", true);
        List<Object> actual = ReverseDelete.reverseDelete("a", "a");
        assertEquals(expected, actual);
    }
    
    @Test
    void testReverseDelete6() {
        List<Object> expected = Arrays.asList("abcdedcba", true);
        List<Object> actual = ReverseDelete.reverseDelete("abcdedcba", "");
        assertEquals(expected, actual);
    }
    
    @Test
    void testReverseDelete7() {
        List<Object> expected = Arrays.asList("abcdedcba", true);
        List<Object> actual = ReverseDelete.reverseDelete("abcdedcba", "v");
        assertEquals(expected, actual);
    }
    
    @Test
    void testReverseDelete8() {
        List<Object> expected = Arrays.asList("abba", true);
        List<Object> actual = ReverseDelete.reverseDelete("vabba", "v");
        assertEquals(expected, actual);
    }
    
    @Test
    void testReverseDelete9() {
        List<Object> expected = Arrays.asList("", true);
        List<Object> actual = ReverseDelete.reverseDelete("mamma", "mia");
        assertEquals(expected, actual);
    }
    
    @Test
    void testReverseDelete10() {
        List<Object> expected = Arrays.asList("", true);
        List<Object> actual = ReverseDelete.reverseDelete("", "");
        assertEquals(expected, actual);
    }
}