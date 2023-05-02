// Derivative.java
package updated;

import java.util.ArrayList;
import java.util.List;

public class Derivative {

    /**
     * xs represent coefficients of a polynomial.
     * xs[0] + xs[1] * x + xs[2] * x^2 + ....
     * Return derivative of this polynomial in the same form.
     *
     * @param xs list of coefficients of the polynomial
     * @return list of coefficients of the derivative polynomial
     */
    public static List<Integer> derivative(List<Integer> xs) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < xs.size(); i++) {
            result.add(xs.get(i) * i);
        }
        return result;
    }
}

// DerivativeTest.java
package updated;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class of {@link Derivative}.
 * It contains ten unit test cases for the {@link Derivative#derivative(List)} method.
 */
class DerivativeTest {

    @Test
    void testDerivativeWithPositiveCoefficients() {
        List<Integer> xs = new ArrayList<>(Arrays.asList(3, 1, 2, 4, 5));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 4, 12, 20));
        assertEquals(expected, Derivative.derivative(xs));
    }

    @Test
    void testDerivativeWithPositiveCoefficients2() {
        List<Integer> xs = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, 6));
        assertEquals(expected, Derivative.derivative(xs));
    }

    @Test
    void testDerivativeWithPositiveCoefficients3() {
        List<Integer> xs = new ArrayList<>(Arrays.asList(3, 2, 1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, 2));
        assertEquals(expected, Derivative.derivative(xs));
    }

    @Test
    void testDerivativeWithPositiveAndZeroCoefficients() {
        List<Integer> xs = new ArrayList<>(Arrays.asList(3, 2, 1, 0, 4));
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, 2, 0, 16));
        assertEquals(expected, Derivative.derivative(xs));
    }

    @Test
    void testDerivativeWithSingleCoefficient() {
        List<Integer> xs = new ArrayList<>(Arrays.asList(1));
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, Derivative.derivative(xs));
    }

    @Test
    void testDerivativeWithNegativeCoefficients() {
        List<Integer> xs = new ArrayList<>(Arrays.asList(-3, -1, -2, -4, -5));
        List<Integer> expected = new ArrayList<>(Arrays.asList(-1, -4, -12, -20));
        assertEquals(expected, Derivative.derivative(xs));
    }

    @Test
    void testDerivativeWithMixedCoefficients() {
        List<Integer> xs = new ArrayList<>(Arrays.asList(-3, 1, 0, 4, -5));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 0, 12, -20));
        assertEquals(expected, Derivative.derivative(xs));
    }

    @Test
    void testDerivativeWithAllZeroCoefficients() {
        List<Integer> xs = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 0, 0, 0));
        assertEquals(expected, Derivative.derivative(xs));
    }

    @Test
    void testDerivativeWithAllNegativeCoefficients() {
        List<Integer> xs = new ArrayList<>(Arrays.asList(-1, -2, -3, -4, -5));
        List<Integer> expected = new ArrayList<>(Arrays.asList(-2, -6, -12, -20));
        assertEquals(expected, Derivative.derivative(xs));
    }

    @Test
    void testDerivativeWithMixedPositiveAndNegativeCoefficients() {
        List<Integer> xs = new ArrayList<>(Arrays.asList(-1, 2, -3, 4, -5));
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, -6, 12, -20));
        assertEquals(expected, Derivative.derivative(xs));
    }
}