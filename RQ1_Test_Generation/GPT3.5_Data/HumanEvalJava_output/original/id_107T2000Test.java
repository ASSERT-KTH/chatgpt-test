// EvenOddPalindrome.java
package original;

import java.util.ArrayList;
import java.util.List;

class EvenOddPalindrome {

    /**
     * * Given a positive integer n, return a tuple that has the number of even and odd
     * integer palindromes that fall within the range(1, n), inclusive.
     *
     * Example 1:
     *
     * Input: 3
     * Output: (1, 2)
     * Explanation:
     * Integer palindrome are 1, 2, 3. one of them is even, and two of them are odd.
     *
     * Example 2:
     *
     * Input: 12
     * Output: (4, 6)
     * Explanation:
     * Integer palindrome are 1, 2, 3, 4, 5, 6, 7, 8, 9, 11. four of them are even, and 6 of them are odd.
     *
     * Note:
     * 1. 1 <= n <= 10^3
     * 2. returned tuple has the number of even and odd integer palindromes respectively.
     *
     * > evenOddPalindrome(123)
     * [8, 13]
     * > evenOddPalindrome(12)
     * [4, 6]
     * > evenOddPalindrome(3)
     * [1, 2]
     * > evenOddPalindrome(63)
     * [6, 8]
     * > evenOddPalindrome(25)
     * [5, 6]
     * > evenOddPalindrome(19)
     * [4, 6]
     * > evenOddPalindrome(9)
     * [4, 5]
     * > evenOddPalindrome(1)
     * [0, 1]
     */
    public static List<Integer> evenOddPalindrome(int n) {
        List<Integer> result = new ArrayList<Integer>();
        int even = 0;
        int odd = 0;
        for (int i = 1; i <= n; i++) {
            if (isPalindrome(i)) {
                if (i % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        result.add(even);
        result.add(odd);
        return result;
    }

    private static boolean isPalindrome(int n) {
        int m = n;
        int reversed = 0;
        while (m > 0) {
            reversed = reversed * 10 + m % 10;
            m /= 10;
        }
        return n == reversed;
    }
}

// EvenOddPalindromeTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddPalindrome}.
* It contains ten unit test cases for the {@link EvenOddPalindrome#evenOddPalindrome(int)} method.
*/
class EvenOddPalindromeTest {
    @Test
    void testEvenOddPalindrome1() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(8);
        expected.add(13);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(123));
    }

    @Test
    void testEvenOddPalindrome2() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        expected.add(6);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(12));
    }

    @Test
    void testEvenOddPalindrome3() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(3));
    }

    @Test
    void testEvenOddPalindrome4() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(6);
        expected.add(8);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(63));
    }

    @Test
    void testEvenOddPalindrome5() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(5);
        expected.add(6);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(25));
    }

    @Test
    void testEvenOddPalindrome6() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        expected.add(6);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(19));
    }

    @Test
    void testEvenOddPalindrome7() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        expected.add(5);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(9));
    }

    @Test
    void testEvenOddPalindrome8() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(0);
        expected.add(1);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(1));
    }

    @Test
    void testEvenOddPalindrome9() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(0);
        expected.add(0);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(0));
    }

    @Test
    void testEvenOddPalindrome10() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(0);
        expected.add(0);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(-1));
    }
}