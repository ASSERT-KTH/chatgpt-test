// DerivativeTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Derivative}.
* It contains one unit test case for the {@link Derivative#derivative(List)} method.
*/
class DerivativeTest {
// Derivative.java
package scenario2;

import java.util.ArrayList;
import java.util.List;

class Derivative {

    /**
     * xs represent coefficients of a polynomial.
     * xs[0] + xs[1] * x + xs[2] * x^2 +....
     * Return derivative of this polynomial in the same form.
     */
    public static List<Object> derivative(List<Integer> xs) {
        List<Object> result = new ArrayList<Object>();
        for (int i = 1; i < xs.size(); i++) {
            result.add(xs.get(i) * i);
        }
        return result;
    }
}

// DerivativeTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Derivative}.
* It contains one unit test case for the {@link Derivative#derivative(List)} method.
*/
class DerivativeTest {
		
    // DerivativeTest.java
    @Test
    void testDerivative() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(3);
        xs.add(5);
        
        assertEquals("The derivative of a polynomial was expected to return 3", 3, Derivative.derivative(xs)[0]);
    }
}