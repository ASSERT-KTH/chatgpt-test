// ClientPlayerTest.java
package client;

import java.awt.Point;
import org.apache.log4j.Logger;
import sound.SoundPlayer;
import common.Actor;
import common.Constants;
import common.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientPlayer}.
* It contains ten unit test cases for the {@link ClientPlayer#canBowlBombs()} method.
*/
class ClientPlayerTest {
    
    /**
     * Test case for when the player can bowl bombs.
     */
    @Test
    void testCanBowlBombsTrue() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.setBowlBombs();
        assertTrue(player.canBowlBombs());
    }
    
    /**
     * Test case for when the player can't bowl bombs.
     */
    @Test
    void testCanBowlBombsFalse() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.resetBowlBombs();
        assertFalse(player.canBowlBombs());
    }
    
    /**
     * Test case for when the player can bowl bombs and then can't.
     */
    @Test
    void testCanBowlBombsTrueToFalse() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.setBowlBombs();
        player.resetBowlBombs();
        assertFalse(player.canBowlBombs());
    }
    
    /**
     * Test case for when the player can't bowl bombs and then can.
     */
    @Test
    void testCanBowlBombsFalseToTrue() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.resetBowlBombs();
        player.setBowlBombs();
        assertTrue(player.canBowlBombs());
    }
    
    /**
     * Test case for when the player can bowl bombs and then can again.
     */
    @Test
    void testCanBowlBombsTrueToTrue() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.setBowlBombs();
        player.setBowlBombs();
        assertTrue(player.canBowlBombs());
    }
    
    /**
     * Test case for when the player can't bowl bombs and then can't again.
     */
    @Test
    void testCanBowlBombsFalseToFalse() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.resetBowlBombs();
        player.resetBowlBombs();
        assertFalse(player.canBowlBombs());
    }
    
    /**
     * Test case for when the player can bowl bombs and then dies.
     */
    @Test
    void testCanBowlBombsTrueAndDie() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.setBowlBombs();
        player.die();
        assertFalse(player.canBowlBombs());
    }
    
    /**
     * Test case for when the player can't bowl bombs and then dies.
     */
    @Test
    void testCanBowlBombsFalseAndDie() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.resetBowlBombs();
        player.die();
        assertFalse(player.canBowlBombs());
    }
    
    /**
     * Test case for when the player can bowl bombs and then resets.
     */
    @Test
    void testCanBowlBombsTrueAndReset() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.setBowlBombs();
        player.resetBowlBombs();
        assertFalse(player.canBowlBombs());
    }
    
    /**
     * Test case for when the player can't bowl bombs and then resets.
     */
    @Test
    void testCanBowlBombsFalseAndReset() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.resetBowlBombs();
        player.setBowlBombs();
        assertTrue(player.canBowlBombs());
    }
}