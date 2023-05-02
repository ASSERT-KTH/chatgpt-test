// TriangleArea.java
package updated;

public class TriangleArea {

    /**
     * Given length of a side and high return area for a triangle.
     *
     * @param a the length of a side of the triangle
     * @param h the height of the triangle
     * @return the area of the triangle
     */
    public static double triangleArea(double a, double h) {
        return (a * h) / 2.0;
    }
}

// TriangleAreaTest.java
package updated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link TriangleArea}.
 * It contains ten unit test cases for the {@link TriangleArea#triangleArea(double, double)} method.
 */
class TriangleAreaTest {

    @Test
    void testTriangleArea() {
        assertEquals(7.5, TriangleArea.triangleArea(5, 3));
        assertEquals(2.0, TriangleArea.triangleArea(2, 2));
        assertEquals(40.0, TriangleArea.triangleArea(10, 8));
        assertEquals(0.0, TriangleArea.triangleArea(0, 5));
        assertEquals(0.0, TriangleArea.triangleArea(5, 0));
        assertEquals(0.0, TriangleArea.triangleArea(0, 0));
        assertEquals(0.5, TriangleArea.triangleArea(1, 1));
        assertEquals(0.5, TriangleArea.triangleArea(1, 0.5));
        assertEquals(0.25, TriangleArea.triangleArea(0.5, 1));
        assertEquals(0.25, TriangleArea.triangleArea(0.5, 0.5));
    }
}