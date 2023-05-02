// CarRaceCollisionTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link CarRaceCollision}.
 * It contains ten unit test cases for the {@link CarRaceCollision#carRaceCollision(int)} method.
 */
class CarRaceCollisionTest {

    @Test
    void testCarRaceCollisionWithTwoCars() {
        int expected = 4;
        int actual = CarRaceCollision.carRaceCollision(2);
        assertEquals(expected, actual);
    }

    @Test
    void testCarRaceCollisionWithThreeCars() {
        int expected = 9;
        int actual = CarRaceCollision.carRaceCollision(3);
        assertEquals(expected, actual);
    }

    @Test
    void testCarRaceCollisionWithFourCars() {
        int expected = 16;
        int actual = CarRaceCollision.carRaceCollision(4);
        assertEquals(expected, actual);
    }

    @Test
    void testCarRaceCollisionWithFiveCars() {
        int expected = 25;
        int actual = CarRaceCollision.carRaceCollision(5);
        assertEquals(expected, actual);
    }

    @Test
    void testCarRaceCollisionWithSixCars() {
        int expected = 36;
        int actual = CarRaceCollision.carRaceCollision(6);
        assertEquals(expected, actual);
    }

    @Test
    void testCarRaceCollisionWithSevenCars() {
        int expected = 49;
        int actual = CarRaceCollision.carRaceCollision(7);
        assertEquals(expected, actual);
    }

    @Test
    void testCarRaceCollisionWithEightCars() {
        int expected = 64;
        int actual = CarRaceCollision.carRaceCollision(8);
        assertEquals(expected, actual);
    }

    @Test
    void testCarRaceCollisionWithNineCars() {
        int expected = 81;
        int actual = CarRaceCollision.carRaceCollision(9);
        assertEquals(expected, actual);
    }

    @Test
    void testCarRaceCollisionWithTenCars() {
        int expected = 100;
        int actual = CarRaceCollision.carRaceCollision(10);
        assertEquals(expected, actual);
    }

    @Test
    void testCarRaceCollisionWithZeroCars() {
        int expected = 0;
        int actual = CarRaceCollision.carRaceCollision(0);
        assertEquals(expected, actual);
    }
}