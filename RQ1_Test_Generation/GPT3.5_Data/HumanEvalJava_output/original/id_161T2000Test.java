// SolveTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Solve}.
 * It contains ten unit test cases for the {@link Solve#solve(String)} method.
 */
class SolveTest {

    @Test
    void testSolve1() {
        String result = Solve.solve("AsDf");
        assertEquals("aSdF", result);
    }

    @Test
    void testSolve2() {
        String result = Solve.solve("1234");
        assertEquals("4321", result);
    }

    @Test
    void testSolve3() {
        String result = Solve.solve("ab");
        assertEquals("AB", result);
    }

    @Test
    void testSolve4() {
        String result = Solve.solve("#a@C");
        assertEquals("#A@c", result);
    }

    @Test
    void testSolve5() {
        String result = Solve.solve("#AsdfW^45");
        assertEquals("#aSDFw^45", result);
    }

    @Test
    void testSolve6() {
        String result = Solve.solve("#6@2");
        assertEquals("2@6#", result);
    }

    @Test
    void testSolve7() {
        String result = Solve.solve("#$a^D");
        assertEquals("#$A^d", result);
    }

    @Test
    void testSolve8() {
        String result = Solve.solve("#ccc");
        assertEquals("#CCC", result);
    }

    @Test
    void testSolve9() {
        String result = Solve.solve("aBcDeFgHiJkLmNoPqRsTuVwXyZ");
        assertEquals("AbCdEfGhIjKlMnOpQrStUvWxYz", result);
    }

    @Test
    void testSolve10() {
        String result = Solve.solve("1234#$%&");
        assertEquals("&%$#4321", result);
    }
}