// Test cases for ExplosionBounds class

import java.awt.Point;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExplosionBoundsTest {

    @Test
    void testContainInsideBounds() {
        ExplosionBounds bounds = new ExplosionBounds(10, 20, 30, 40);
        Point p = new Point(25, 15);
        assertTrue(bounds.contain(p));
    }

    @Test
    void testContainOnUpperBound() {
        ExplosionBounds bounds = new ExplosionBounds(10, 20, 30, 40);
        Point p = new Point(25, 10);
        assertTrue(bounds.contain(p));
    }

    @Test
    void testContainOnLowerBound() {
        ExplosionBounds bounds = new ExplosionBounds(10, 20, 30, 40);
        Point p = new Point(25, 20);
        assertTrue(bounds.contain(p));
    }

    @Test
    void testContainOnRightBound() {
        ExplosionBounds bounds = new ExplosionBounds(10, 20, 30, 40);
        Point p = new Point(30, 15);
        assertTrue(bounds.contain(p));
    }

    @Test
    void testContainOnLeftBound() {
        ExplosionBounds bounds = new ExplosionBounds(10, 20, 30, 40);
        Point p = new Point(40, 15);
        assertTrue(bounds.contain(p));
    }

    @Test
    void testContainOutsideBounds() {
        ExplosionBounds bounds = new ExplosionBounds(10, 20, 30, 40);
        Point p = new Point(50, 25);
        assertFalse(bounds.contain(p));
    }

    @Test
    void testContainOnUpperRightCorner() {
        ExplosionBounds bounds = new ExplosionBounds(10, 20, 30, 40);
        Point p = new Point(30, 10);
        assertTrue(bounds.contain(p));
    }

    @Test
    void testContainOnUpperLeftCorner() {
        ExplosionBounds bounds = new ExplosionBounds(10, 20, 30, 40);
        Point p = new Point(40, 10);
        assertTrue(bounds.contain(p));
    }

    @Test
    void testContainOnLowerRightCorner() {
        ExplosionBounds bounds = new ExplosionBounds(10, 20, 30, 40);
        Point p = new Point(30, 20);
        assertTrue(bounds.contain(p));
    }

    @Test
    void testContainOnLowerLeftCorner() {
        ExplosionBounds bounds = new ExplosionBounds(10, 20, 30, 40);
        Point p = new Point(40, 20);
        assertTrue(bounds.contain(p));
    }
}