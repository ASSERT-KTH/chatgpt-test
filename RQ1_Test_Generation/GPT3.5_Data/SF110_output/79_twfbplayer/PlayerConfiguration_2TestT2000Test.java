// PlayerConfiguration_2Test.java
package de.outstare.fortbattleplayer.player;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link PlayerConfiguration}.
 * It contains ten unit test cases for the {@link PlayerConfiguration#showShootline()} method.
 */
class PlayerConfiguration_2Test {

    /**
     * Test method for {@link PlayerConfiguration#showShootline()}.
     * Tests that the default value is false.
     */
    @Test
    void testShowShootlineDefault() {
        final PlayerConfiguration config = new PlayerConfiguration();
        assertFalse(config.showShootline());
    }

    /**
     * Test method for {@link PlayerConfiguration#showShootline()}.
     * Tests that the value can be set to true.
     */
    @Test
    void testSetShowShootlineTrue() {
        final PlayerConfiguration config = new PlayerConfiguration();
        config.setShowShootline(true);
        assertTrue(config.showShootline());
    }

    /**
     * Test method for {@link PlayerConfiguration#showShootline()}.
     * Tests that the value can be set to false.
     */
    @Test
    void testSetShowShootlineFalse() {
        final PlayerConfiguration config = new PlayerConfiguration();
        config.setShowShootline(false);
        assertFalse(config.showShootline());
    }

    /**
     * Test method for {@link PlayerConfiguration#showShootline()}.
     * Tests that the value can be set to true and then to false.
     */
    @Test
    void testSetShowShootlineTrueFalse() {
        final PlayerConfiguration config = new PlayerConfiguration();
        config.setShowShootline(true);
        config.setShowShootline(false);
        assertFalse(config.showShootline());
    }

    /**
     * Test method for {@link PlayerConfiguration#showShootline()}.
     * Tests that the value can be set to false and then to true.
     */
    @Test
    void testSetShowShootlineFalseTrue() {
        final PlayerConfiguration config = new PlayerConfiguration();
        config.setShowShootline(false);
        config.setShowShootline(true);
        assertTrue(config.showShootline());
    }

    /**
     * Test method for {@link PlayerConfiguration#showShootline()}.
     * Tests that adding a listener notifies it about the change to true.
     */
    @Test
    void testAddListenerShowShootlineTrue() {
        final PlayerConfiguration config = new PlayerConfiguration();
        final MockPlayerConfigurationListener listener = new MockPlayerConfigurationListener();
        config.addListener(listener);
        config.setShowShootline(true);
        assertTrue(listener.changedShowShootingLineCalled);
        assertTrue(listener.changedShowShootingLineValue);
    }

    /**
     * Test method for {@link PlayerConfiguration#showShootline()}.
     * Tests that adding a listener notifies it about the change to false.
     */
    @Test
    void testAddListenerShowShootlineFalse() {
        final PlayerConfiguration config = new PlayerConfiguration();
        final MockPlayerConfigurationListener listener = new MockPlayerConfigurationListener();
        config.addListener(listener);
        config.setShowShootline(false);
        assertTrue(listener.changedShowShootingLineCalled);
        assertFalse(listener.changedShowShootingLineValue);
    }

    /**
     * Test method for {@link PlayerConfiguration#showShootline()}.
     * Tests that removing a listener does not notify it about the change to true.
     */
    @Test
    void testRemoveListenerShowShootlineTrue() {
        final PlayerConfiguration config = new PlayerConfiguration();
        final MockPlayerConfigurationListener listener = new MockPlayerConfigurationListener();
        config.addListener(listener);
        config.removeListener(listener);
        config.setShowShootline(true);
        assertFalse(listener.changedShowShootingLineCalled);
    }

    /**
     * Test method for {@link PlayerConfiguration#showShootline()}.
     * Tests that removing a listener does not notify it about the change to false.
     */
    @Test
    void testRemoveListenerShowShootlineFalse() {
        final PlayerConfiguration config = new PlayerConfiguration();
        final MockPlayerConfigurationListener listener = new MockPlayerConfigurationListener();
        config.addListener(listener);
        config.removeListener(listener);
        config.setShowShootline(false);
        assertFalse(listener.changedShowShootingLineCalled);
    }

    /**
     * Test method for {@link PlayerConfiguration#showShootline()}.
     * Tests that adding multiple listeners notifies all of them about the change to true.
     */
    @Test
    void testAddMultipleListenersShowShootlineTrue() {
        final PlayerConfiguration config = new PlayerConfiguration();
        final MockPlayerConfigurationListener listener1 = new MockPlayerConfigurationListener();
        final MockPlayerConfigurationListener listener2 = new MockPlayerConfigurationListener();
        config.addListener(listener1);
        config.addListener(listener2);
        config.setShowShootline(true);
        assertTrue(listener1.changedShowShootingLineCalled);
        assertTrue(listener1.changedShowShootingLineValue);
        assertTrue(listener2.changedShowShootingLineCalled);
        assertTrue(listener2.changedShowShootingLineValue);
    }

    /**
     * Test method for {@link PlayerConfiguration#showShootline()}.
     * Tests that adding multiple listeners notifies all of them about the change to false.
     */
    @Test
    void testAddMultipleListenersShowShootlineFalse() {
        final PlayerConfiguration config = new PlayerConfiguration();
        final MockPlayerConfigurationListener listener1 = new MockPlayerConfigurationListener();
        final MockPlayerConfigurationListener listener2 = new MockPlayerConfigurationListener();
        config.addListener(listener1);
        config.addListener(listener2);
        config.setShowShootline(false);
        assertTrue(listener1.changedShowShootingLineCalled);
        assertFalse(listener1.changedShowShootingLineValue);
        assertTrue(listener2.changedShowShootingLineCalled);
        assertFalse(listener2.changedShowShootingLineValue);
    }

    /**
     * A mock implementation of {@link PlayerConfigurationListener} for testing purposes.
     */
    private static class MockPlayerConfigurationListener implements PlayerConfigurationListener {
        boolean changedShowShootingLineCalled = false;
        boolean changedShowShootingLineValue = false;

        @Override
        public void changedShowShootingLine(final boolean showShootingLine) {
            changedShowShootingLineCalled = true;
            changedShowShootingLineValue = showShootingLine;
        }

        @Override
        public void changedShowMoveTarget(final boolean showMoveTarget) {
            // do nothing
        }
    }
}