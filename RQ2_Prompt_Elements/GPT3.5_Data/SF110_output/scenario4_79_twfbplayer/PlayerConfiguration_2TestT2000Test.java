// PlayerConfiguration.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;

/**
 * An instance of this will be used by the player to hold its tunable
 * parameters.
 *
 * @author daniel
 */
public class PlayerConfiguration implements Cloneable {

    /**
     * a configuration which skips animation (used for purposes where the user
     * should not see whats going on)
     */
    public static final PlayerConfiguration NO_DELAY = new PlayerConfiguration();

    static {
    }

    /**
     * this is used to control who currently does something with the player
     */
    private final Lock playLock = new ReentrantLock();

    private final Set<PlayerConfigurationListener> listeners = new HashSet<PlayerConfigurationListener>();

    /**
     * current state of the player
     */
    private PlayerState state = PlayerState.STOP;

    /**
     * pause between two rounds in milliseconds
     */
    public volatile int ROUND_DELAY = Configuration.ROUND_DELAY;

    /**
     * pause between two players in a round in milliseconds
     */
    public volatile int PLAYER_DELAY = Configuration.PLAYER_DELAY;

    /**
     * pause between two actions in milliseconds
     */
    public volatile int ACTION_DELAY = Configuration.ACTION_DELAY;

    /**
     * draw a line to the point, where the player wants to go
     */
    private volatile boolean SHOW_MOVETARGETS = Configuration.SHOW_MOVETARGETS;

    /**
     * draw a line to the enemy ath wich the player shoots
     */
    private volatile boolean SHOW_SHOOTLINE = Configuration.SHOW_SHOOTLINE;

    /**
     * @param other
     */
    public void setTo(final PlayerConfiguration other);

    /**
     * @return a copy of this object
     * @throws CloneNotSupportedException
     */
    public PlayerConfiguration copy() throws CloneNotSupportedException;

    /**
     * should only be called by {@link Battleplayer}!
     *
     * @param newState
     */
    synchronized void setState(final PlayerState newState);

    /**
     * @return true if the player should be playing
     */
    public synchronized boolean isPlaying();

    /**
     * @return true if the player is hold
     */
    public synchronized boolean isPaused();

    /**
     * @return true if the player is stopped
     */
    public synchronized boolean isStopped();

    /**
     * exclusive use of the player
     */
    void lock();

    /**
     * release the player
     */
    void unlock();

    /**
     * @return <code>true</code> if lines to movement targets should be
     *         displayed
     */
    public boolean showMoveTargets();

    /**
     * @param showMovetargets
     */
    public void setShowMoveTargets(final boolean showMovetargets);

    /**
     * @return <code>true</code> if shooting lines should be displayed
     */
    public boolean showShootline();

    /**
     * @param showShootline
     */
    public void setShowShootline(final boolean showShootline);

    /**
     * Adds a listener which will be notified about changes.
     *
     * @param listener
     */
    public void addListener(final PlayerConfigurationListener listener);

    /**
     * Removes the listener from the registered ones.
     *
     * @param listener
     */
    public void removeListener(final PlayerConfigurationListener listener);
}

// PlayerConfiguration_2Test.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains ten unit test cases for the {@link PlayerConfiguration#showShootline()} method.
*/
class PlayerConfiguration_2Test {
    @Test
    void testShowShootline() {
        PlayerConfiguration config = new PlayerConfiguration();
        assertTrue(config.showShootline());
        config.setShowShootline(false);
        assertFalse(config.showShootline());
        config.setShowShootline(true);
        assertTrue(config.showShootline());
        config.setShowShootline(false);
        assertFalse(config.showShootline());
        config.setShowShootline(true);
        assertTrue(config.showShootline());
        config.setShowShootline(false);
        assertFalse(config.showShootline());
        config.setShowShootline(true);
        assertTrue(config.showShootline());
        config.setShowShootline(false);
        assertFalse(config.showShootline());
        config.setShowShootline(true);
        assertTrue(config.showShootline());
        config.setShowShootline(false);
        assertFalse(config.showShootline());
    }
}