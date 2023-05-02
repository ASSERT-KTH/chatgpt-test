// Solve1Test.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve1}.
* It contains one unit test case for the {@link Solve1#solve(int)} method.
*/
class Solve1Test {

    /** test to solve a integer 1 to N with two digits.
     * The result of the {@link Solve1#solve(int)} should be true. */
    @Test
    public void testSolveN() {
        assertTrue(solve(1) + " equals to " + "1001");
    }

    /** test to solve a integer 1 to N with two digits.
     * The result of the {@link Solve1#solve(int)} should be false. */
    @Test
    public void testSolve1() {
        assertFalse(solve(1) + " equals to " + "1001");
    }

    /** test to solve a integer 0 to N with two digits.
     * The result of the {@link Solve1#solve(int)} should be false. */
    @Test
    public void testSolve0() {
        assertFalse(solve(0) + " equals to " + "1001");
    }

    /** test to solve a integer 2 to N with three digits.
     * The result of the {@link Solve1#solve(int)} should be true. */
    @Test
    public void testSolve2() {
        assertTrue(solve(2) + " equals to " + "110");
    }

    /** test to solve a integer 3 to N with three digits.
     * The result of the {@link Solve1#solve(int)} should be true. */
    @Test
    public void testSolve3() {
        assertTrue(solve(3) + " equals to " + "100");
    }

    /** test to solve a integer 9 to N with three digits.
     * The result of the {@link Solve1#solve(int)} should be false. */
    @Test
    public void testSolve9() {
        assertFalse(solve(9) + " equals to " + "111");
    }

}

