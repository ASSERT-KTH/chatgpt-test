// FruitDistributionTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link FruitDistribution}.
 * It contains ten unit test cases for the {@link FruitDistribution#fruitDistribution(String, int)} method.
 */
class FruitDistributionTest {

    @Test
    void testFruitDistribution1() {
        int result = FruitDistribution.fruitDistribution("5 apples and 6 oranges", 19);
        assertEquals(8, result);
    }

    @Test
    void testFruitDistribution2() {
        int result = FruitDistribution.fruitDistribution("5 apples and 6 oranges", 21);
        assertEquals(10, result);
    }

    @Test
    void testFruitDistribution3() {
        int result = FruitDistribution.fruitDistribution("0 apples and 1 oranges", 3);
        assertEquals(2, result);
    }

    @Test
    void testFruitDistribution4() {
        int result = FruitDistribution.fruitDistribution("1 apples and 0 oranges", 3);
        assertEquals(2, result);
    }

    @Test
    void testFruitDistribution5() {
        int result = FruitDistribution.fruitDistribution("2 apples and 3 oranges", 100);
        assertEquals(95, result);
    }

    @Test
    void testFruitDistribution6() {
        int result = FruitDistribution.fruitDistribution("2 apples and 3 oranges", 5);
        assertEquals(0, result);
    }

    @Test
    void testFruitDistribution7() {
        int result = FruitDistribution.fruitDistribution("1 apples and 100 oranges", 120);
        assertEquals(19, result);
    }

    @Test
    void testFruitDistribution8() {
        int result = FruitDistribution.fruitDistribution("0 apples and 0 oranges", 10);
        assertEquals(10, result);
    }

    @Test
    void testFruitDistribution9() {
        int result = FruitDistribution.fruitDistribution("10 apples and 0 oranges", 15);
        assertEquals(5, result);
    }

    @Test
    void testFruitDistribution10() {
        int result = FruitDistribution.fruitDistribution("0 apples and 10 oranges", 15);
        assertEquals(5, result);
    }
}