// IntersectionTest.java
package updated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Intersection}.
 * It contains ten unit test cases for the {@link Intersection#intersection(int[], int[])} method.
 */
class IntersectionTest {

    @Test
    void testIntersectionNo() {
        int[] interval1 = {1, 2};
        int[] interval2 = {2, 3};
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionNo2() {
        int[] interval1 = {-1, 1};
        int[] interval2 = {0, 4};
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionYes() {
        int[] interval1 = {-3, -1};
        int[] interval2 = {-5, 5};
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionYes2() {
        int[] interval1 = {-2, 2};
        int[] interval2 = {-4, 0};
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionNo3() {
        int[] interval1 = {-11, 2};
        int[] interval2 = {-1, -1};
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionNo4() {
        int[] interval1 = {1, 2};
        int[] interval2 = {3, 5};
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionNo5() {
        int[] interval1 = {1, 2};
        int[] interval2 = {1, 2};
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionNo6() {
        int[] interval1 = {-2, -2};
        int[] interval2 = {-3, -2};
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionYes3() {
        int[] interval1 = {2, 5};
        int[] interval2 = {3, 7};
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionNo7() {
        int[] interval1 = {2, 5};
        int[] interval2 = {6, 7};
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }
}

// Intersection.java
package updated;

class Intersection {

    /**
     * You are given two intervals,
     * where each interval is a pair of integers. For example, interval = (start, end) = (1, 2).
     * The given intervals are closed which means that the interval (start, end)
     * includes both start and end.
     * For each given interval, it is assumed that its start is less or equal its end.
     * Your task is to determine whether the length of intersection of these two
     * intervals is a prime number.
     * Example, the intersection of the intervals (1, 3), (2, 4) is (2, 3)
     * which its length is 1, which not a prime number.
     * If the length of the intersection is a prime number, return "YES",
     * otherwise, return "NO".
     * If the two intervals don't intersect, return "NO".
     *
     * [input/output] samples:
     * intersection([1, 2], [2, 3]) ==> "NO"
     * intersection([-1, 1], [0, 4]) ==> "NO"
     * intersection([-3, -1], [-5, 5]) ==> "YES"
     *
     * @param interval1 the first interval
     * @param interval2 the second interval
     * @return "YES" if the length of intersection is a prime number, "NO" otherwise
     */
    public static String intersection(int[] interval1, int[] interval2) {
        int start = Math.max(interval1[0], interval2[0]);
        int end = Math.min(interval1[1], interval2[1]);
        if (start > end) {
            return "NO";
        }
        if (isPrime(end - start)) {
            return "YES";
        }
        return "NO";
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}