// ServerBombTest.java
package server;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.Collection;
import java.util.Vector;
import messages.round.BombExplodedMsg;
import org.apache.log4j.Logger;
import common.Bomb;
import common.Constants;
import common.GameObject;
import common.Player;
import common.PowerUp;
import common.Tile;
import db.DBException;
import db.DBGameUser;
import db.DBServiceFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ServerBomb}.
* It contains ten unit test cases for the {@link ServerBomb#tick()} method.
*/
class ServerBombTest {
    
    /**
     * Test case for the tick method when the tickFrames is greater than 0.
     * The method should return false.
     */
    @Test
    void testTickWhenTickFramesGreaterThanZero() {
        ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
        bomb.setTickFrames(10);
        assertFalse(bomb.tick());
    }
    
    /**
     * Test case for the tick method when the tickFrames is equal to 0.
     * The method should return true.
     */
    @Test
    void testTickWhenTickFramesEqualToZero() {
        ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
        bomb.setTickFrames(0);
        assertTrue(bomb.tick());
    }
    
    /**
     * Test case for the tick method when the tickFrames is less than 0 and greater than -40.
     * The method should return false.
     */
    @Test
    void testTickWhenTickFramesLessThanZeroAndGreaterThanNegativeForty() {
        ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
        bomb.setTickFrames(-20);
        assertFalse(bomb.tick());
    }
    
    /**
     * Test case for the tick method when the tickFrames is equal to -40.
     * The method should return true.
     */
    @Test
    void testTickWhenTickFramesEqualToNegativeForty() {
        ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
        bomb.setTickFrames(-40);
        assertTrue(bomb.tick());
    }
    
    /**
     * Test case for the tick method when the tickFrames is less than -40.
     * The method should return false.
     */
    @Test
    void testTickWhenTickFramesLessThanNegativeForty() {
        ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
        bomb.setTickFrames(-50);
        assertFalse(bomb.tick());
    }
    
    /**
     * Test case for the tick method when the tickFrames is equal to the maximum value of an integer.
     * The method should return false.
     */
    @Test
    void testTickWhenTickFramesEqualToMaxValue() {
        ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
        bomb.setTickFrames(Integer.MAX_VALUE);
        assertFalse(bomb.tick());
    }
    
    /**
     * Test case for the tick method when the tickFrames is equal to the minimum value of an integer.
     * The method should return false.
     */
    @Test
    void testTickWhenTickFramesEqualToMinValue() {
        ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
        bomb.setTickFrames(Integer.MIN_VALUE);
        assertFalse(bomb.tick());
    }
    
    /**
     * Test case for the tick method when the tickFrames is equal to 1.
     * The method should return false.
     */
    @Test
    void testTickWhenTickFramesEqualToOne() {
        ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
        bomb.setTickFrames(1);
        assertFalse(bomb.tick());
    }
    
    /**
     * Test case for the tick method when the tickFrames is equal to -1.
     * The method should return false.
     */
    @Test
    void testTickWhenTickFramesEqualToNegativeOne() {
        ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
        bomb.setTickFrames(-1);
        assertFalse(bomb.tick());
    }
    
    /**
     * Test case for the tick method when the tickFrames is equal to 40.
     * The method should return false.
     */
    @Test
    void testTickWhenTickFramesEqualToForty() {
        ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
        bomb.setTickFrames(40);
        assertFalse(bomb.tick());
    }
}