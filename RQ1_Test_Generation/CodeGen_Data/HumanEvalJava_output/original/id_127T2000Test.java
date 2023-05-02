// IntersectionTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersection}.
* It contains one unit test case for the {@link Intersection#intersection(List, List)} method.
*/
class IntersectionTest {
/** Unit test for {@link Intersection#intersection(List, List)}.
*/
    @Test
    public void testIntersection1() {
        assertEquals("", intersection((List<Integer>) null, (List<Integer>) null));
    }

    /** Unit test for {@link Intersection#intersection(List, List)}.
     * Note: This unit test should apply to all sub-type of {@link java.util.List}.
     */
    @Test
    public void testIntersection2() {
        assertEquals("", intersection((List<Integer>) null));
    }
}