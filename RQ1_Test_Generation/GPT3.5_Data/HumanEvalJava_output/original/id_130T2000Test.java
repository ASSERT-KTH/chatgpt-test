// TriTest.java
package updated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Test class of {@link Tri}.
 * It contains ten unit test cases for the {@link Tri#tri(int)} method.
 */
class TriTest {

    @Test
    void testTriWithZero() {
        List<Number> expected = Arrays.asList(1);
        List<Number> actual = Tri.tri(0);
        assertEquals(expected, actual);
    }

    @Test
    void testTriWithOne() {
        List<Number> expected = Arrays.asList(1, 3);
        List<Number> actual = Tri.tri(1);
        assertEquals(expected, actual);
    }

    @Test
    void testTriWithTwo() {
        List<Number> expected = Arrays.asList(1, 3, 2.0);
        List<Number> actual = Tri.tri(2);
        assertEquals(expected, actual);
    }

    @Test
    void testTriWithThree() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0);
        List<Number> actual = Tri.tri(3);
        assertEquals(expected, actual);
    }

    @Test
    void testTriWithFour() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0);
        List<Number> actual = Tri.tri(4);
        assertEquals(expected, actual);
    }

    @Test
    void testTriWithFive() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0);
        List<Number> actual = Tri.tri(5);
        assertEquals(expected, actual);
    }

    @Test
    void testTriWithSix() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0);
        List<Number> actual = Tri.tri(6);
        assertEquals(expected, actual);
    }

    @Test
    void testTriWithSeven() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0);
        List<Number> actual = Tri.tri(7);
        assertEquals(expected, actual);
    }

    @Test
    void testTriWithEight() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0);
        List<Number> actual = Tri.tri(8);
        assertEquals(expected, actual);
    }

    @Test
    void testTriWithTwenty() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0, 35.0, 6.0, 48.0, 7.0, 63.0, 8.0, 80.0, 9.0, 99.0, 10.0, 120.0, 11.0);
        List<Number> actual = Tri.tri(20);
        assertEquals(expected, actual);
    }
}

// Tri.java
package updated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Tri {

    /**
     * Everyone knows Fibonacci sequence, it was studied deeply by mathematicians in
     * the last couple centuries. However, what people don't know is Tribonacci sequence.
     * Tribonacci sequence is defined by the recurrence:
     * tri(1) = 3
     * tri(n) = 1 + n / 2, if n is even.
     * tri(n) =  tri(n - 1) + tri(n - 2) + tri(n + 1), if n is odd.
     * For example:
     * tri(2) = 1 + (2 / 2) = 2
     * tri(4) = 3
     * tri(3) = tri(2) + tri(1) + tri(4)
     * = 2 + 3 + 3 = 8
     * You are given a non-negative integer number n, you have to a return a list of the
     * first n + 1 numbers of the Tribonacci sequence.
     * Examples:
     * tri(3) = [1, 3, 2, 8]
     *
     * @param n non-negative integer number
     * @return a list of the first n + 1 numbers of the Tribonacci sequence
     */
    public static List<Number> tri(int n) {
        if (n == 0) {
            return Arrays.asList(1);
        }
        List<Number> my_tri = new ArrayList<>();
        my_tri.add(1);
        my_tri.add(3);
        for (int i = 2; i < n + 1; i++) {
            if (i % 2 == 0) {
                my_tri.add(i / 2 + 1.0);
            } else {
                my_tri.add(my_tri.get(i - 1).doubleValue() + my_tri.get(i - 2).doubleValue() + (i + 3) / 2);
            }
        }
        return my_tri;
    }
}