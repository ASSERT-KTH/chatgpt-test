// SolutionTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solution}.
* It contains one unit test case for the {@link Solution#solution(List)} method.
*/
class SolutionTest {

    private final Solution sol;
    SolutionTest() {
		sol = new Solution();
    }

    /**
     * Executes the unit tests
     */
    @Test
    void testSolution() {
        int res = sol.solution(new List<>());
        assertEquals(0, res);
        res = sol.solution(new List<>());
        assertEquals(0, res);
        res = sol.solution(new List<>());
        assertEquals(0, res);
        res = sol.solution(new List<>());
        assertEquals(0, res);
    }
}