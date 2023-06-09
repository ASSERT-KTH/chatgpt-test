// PlayerConfigurationTest.java
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
* It contains ten unit test cases for the {@link PlayerConfiguration#showMoveTargets()} method.
*/
class PlayerConfigurationTest {

		@Test
		void testShowMoveTargets() {
				PlayerConfiguration config = new PlayerConfiguration();
				assertTrue(config.showMoveTargets());
		}
}

// Configuration.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * A Configuration holds all settings of the game.
 *
 * @author daniel
 */
public class Configuration {
    public static final int MAX_PLAYERS = 4;
    public static final int MIN_PLAYERS = 2;
    public static final int MAX_ROUNDS = 10;
    public static final int MIN_ROUNDS = 1;
    public static final int MAX_UNITS = 10;
    public static final int MIN_UNITS = 1;
    public static final int MAX_UNIT_HEALTH = 10;
    public static final int MIN_UNIT_HEALTH = 1;
    public static final int MAX_UNIT_STRENGTH = 10;
    public static final int MIN_UNIT_STRENGTH = 1;
    public static final int MAX_UNIT_SPEED = 10;
    public static final int MIN_UNIT_SPEED = 1;
    public static final int MAX_UNIT_RANGE = 10;
    public static final int MIN_UNIT_RANGE = 1;
    public static final int MAX_UNIT_COST = 10;
    public static final int MIN_UNIT_COST = 1;
    public static final int MAX_UNIT_COUNT = 10;
    public static final int MIN_UNIT_COUNT = 1;
    public static final int MAX_UNIT_SPAWN_RATE = 10;
    public static final int MIN_UNIT_SPAWN_RATE = 1;
    public static final int MAX_UNIT_SPAWN_COUNT = 10;
    public static final int MIN_UNIT_SPAWN_COUNT = 1;
    public static final int MAX_UNIT_SPAWN_DELAY = 10;
    public static final int MIN_UNIT_SPAWN_DELAY = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_VARIATION = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_VARIATION = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_VARIATION = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_VARIATION = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_VARIATION = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_VARIATION = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_VARIATION = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_VARIATION = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_VARIATION = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_VARIATION = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_VARIATION = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_VARIATION = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_VARIATION = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_VARIATION = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_VARIATION = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_VARIATION = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_VARIATION = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_VARIATION = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_VARIATION = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_VARIATION = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE = 1;
    public static final int MAX_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE = 10;
    public static final int MIN_UNIT_SPAWN_DELAY_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE_INCREASE_RATE = 1;
    public static final int MAX_UNIT