// F.java
package original;

import java.util.ArrayList;
import java.util.List;

class F {

    /**
     * Implement the function f that takes n as a parameter,
     * and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
     * or the sum of numbers from 1 to i otherwise.
     * i starts from 1.
     * the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
     * Example:
     * f(5) == [1, 2, 6, 24, 15]
     *
     * > f(5)
     * [1, 2, 6, 24, 15]
     * > f(7)
     * [1, 2, 6, 24, 15, 720, 28]
     * > f(1)
     * [1]
     * > f(3)
     * [1, 2, 6]
     */
    public static List<Integer> f(int n) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result.add(factorial(i));
            } else {
                result.add(sum(i));
            }
        }
        return result;
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}

// FTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link F}.
* It contains ten unit test cases for the {@link F#f(int)} method.
*/
class FTest {
    
    @Test
    void testFWithNEqualOne() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        List<Integer> actual = F.f(1);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFWithNEqualTwo() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        List<Integer> actual = F.f(2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFWithNEqualThree() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        List<Integer> actual = F.f(3);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFWithNEqualFour() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(24);
        List<Integer> actual = F.f(4);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFWithNEqualFive() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(24);
        expected.add(15);
        List<Integer> actual = F.f(5);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFWithNEqualSix() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(24);
        expected.add(15);
        expected.add(720);
        List<Integer> actual = F.f(6);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFWithNEqualSeven() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(24);
        expected.add(15);
        expected.add(720);
        expected.add(28);
        List<Integer> actual = F.f(7);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFWithNEqualEight() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(24);
        expected.add(15);
        expected.add(720);
        expected.add(28);
        expected.add(40320);
        List<Integer> actual = F.f(8);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFWithNEqualNine() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(24);
        expected.add(15);
        expected.add(720);
        expected.add(28);
        expected.add(40320);
        expected.add(45);
        List<Integer> actual = F.f(9);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFWithNEqualTen() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(24);
        expected.add(15);
        expected.add(720);
        expected.add(28);
        expected.add(40320);
        expected.add(45);
        expected.add(362880);
        List<Integer> actual = F.f(10);
        assertEquals(expected, actual);
    }
}