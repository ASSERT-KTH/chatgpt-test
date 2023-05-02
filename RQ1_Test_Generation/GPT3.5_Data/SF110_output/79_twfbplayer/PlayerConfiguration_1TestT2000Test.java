// PlayerConfiguration_1Test.java
package de.outstare.fortbattleplayer.player;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link PlayerConfiguration}.
 * It contains ten unit test cases for the {@link PlayerConfiguration#showMoveTargets()} method.
 */
class PlayerConfiguration_1Test {

    /**
     * Test case for {@link PlayerConfiguration#showMoveTargets()}.
     * It should return the default value.
     */
    @Test
    void testShowMoveTargets_Default() {
        PlayerConfiguration config = new PlayerConfiguration();
        assertFalse(config.showMoveTargets());
    }

    /**
     * Test case for {@link PlayerConfiguration#showMoveTargets()}.
     * It should return the value set by {@link PlayerConfiguration#setShowMoveTargets(boolean)}.
     */
    @Test
    void testShowMoveTargets_Set() {
        PlayerConfiguration config = new PlayerConfiguration();
        config.setShowMoveTargets(true);
        assertTrue(config.showMoveTargets());
    }

    /**
     * Test case for {@link PlayerConfiguration#showMoveTargets()}.
     * It should return the value set by {@link PlayerConfiguration#setShowMoveTargets(boolean)}.
     */
    @Test
    void testShowMoveTargets_Set2() {
        PlayerConfiguration config = new PlayerConfiguration();
        config.setShowMoveTargets(false);
        assertFalse(config.showMoveTargets());
    }

    /**
     * Test case for {@link PlayerConfiguration#showMoveTargets()}.
     * It should return the value set by {@link PlayerConfiguration#setShowMoveTargets(boolean)}.
     */
    @Test
    void testShowMoveTargets_Set3() {
        PlayerConfiguration config = new PlayerConfiguration();
        config.setShowMoveTargets(true);
        config.setShowMoveTargets(false);
        assertFalse(config.showMoveTargets());
    }

    /**
     * Test case for {@link PlayerConfiguration#showMoveTargets()}.
     * It should return the value set by {@link PlayerConfiguration#setShowMoveTargets(boolean)}.
     */
    @Test
    void testShowMoveTargets_Set4() {
        PlayerConfiguration config = new PlayerConfiguration();
        config.setShowMoveTargets(false);
        config.setShowMoveTargets(true);
        assertTrue(config.showMoveTargets());
    }

    /**
     * Test case for {@link PlayerConfiguration#showMoveTargets()}.
     * It should return the value set by {@link PlayerConfiguration#setShowMoveTargets(boolean)}.
     */
    @Test
    void testShowMoveTargets_Set5() {
        PlayerConfiguration config = new PlayerConfiguration();
        config.setShowMoveTargets(true);
        config.setShowMoveTargets(true);
        assertTrue(config.showMoveTargets());
    }

    /**
     * Test case for {@link PlayerConfiguration#showMoveTargets()}.
     * It should return the value set by {@link PlayerConfiguration#setShowMoveTargets(boolean)}.
     */
    @Test
    void testShowMoveTargets_Set6() {
        PlayerConfiguration config = new PlayerConfiguration();
        config.setShowMoveTargets(false);
        config.setShowMoveTargets(false);
        assertFalse(config.showMoveTargets());
    }

    /**
     * Test case for {@link PlayerConfiguration#showMoveTargets()}.
     * It should return the value set by {@link PlayerConfiguration#setShowMoveTargets(boolean)}.
     */
    @Test
    void testShowMoveTargets_Set7() {
        PlayerConfiguration config = new PlayerConfiguration();
        config.setShowMoveTargets(true);
        config.setShowShootline(false);
        assertTrue(config.showMoveTargets());
    }

    /**
     * Test case for {@link PlayerConfiguration#showMoveTargets()}.
     * It should return the value set by {@link PlayerConfiguration#setShowMoveTargets(boolean)}.
     */
    @Test
    void testShowMoveTargets_Set8() {
        PlayerConfiguration config = new PlayerConfiguration();
        config.setShowMoveTargets(false);
        config.setShowShootline(true);
        assertFalse(config.showMoveTargets());
    }

    /**
     * Test case for {@link PlayerConfiguration#showMoveTargets()}.
     * It should return the value set by {@link PlayerConfiguration#setShowMoveTargets(boolean)}.
     */
    @Test
    void testShowMoveTargets_Set9() {
        PlayerConfiguration config = new PlayerConfiguration();
        config.setShowMoveTargets(true);
        config.setShowShootline(true);
        assertTrue(config.showMoveTargets());
    }

    /**
     * Test case for {@link PlayerConfiguration#showMoveTargets()}.
     * It should return the value set by {@link PlayerConfiguration#setShowMoveTargets(boolean)}.
     */
    @Test
    void testShowMoveTargets_Set10() {
        PlayerConfiguration config = new PlayerConfiguration();
        config.setShowMoveTargets(false);
        config.setShowShootline(false);
        assertFalse(config.showMoveTargets());
    }
}