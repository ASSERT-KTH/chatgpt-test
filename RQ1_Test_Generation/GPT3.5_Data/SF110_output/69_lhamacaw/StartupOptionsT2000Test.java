// StartupOptionsTest.java
package macaw.system;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link StartupOptions}.
 * It contains ten unit test cases for the {@link StartupOptions#useDemo()} method.
 */
class StartupOptionsTest {

    @Test
    void testUseDemoTrue() {
        StartupOptions options = new StartupOptions();
        assertTrue(options.useDemo());
    }

    @Test
    void testUseDemoFalse() {
        StartupOptions options = new StartupOptions();
        options.setUseDemo(false);
        assertFalse(options.useDemo());
    }

    @Test
    void testUseDemoDefault() {
        StartupOptions options = new StartupOptions();
        assertEquals(true, options.useDemo());
    }

    @Test
    void testUseDemoSetTrue() {
        StartupOptions options = new StartupOptions();
        options.setUseDemo(true);
        assertEquals(true, options.useDemo());
    }

    @Test
    void testUseDemoSetFalse() {
        StartupOptions options = new StartupOptions();
        options.setUseDemo(false);
        assertEquals(false, options.useDemo());
    }

    @Test
    void testUseDemoSetTrueThenFalse() {
        StartupOptions options = new StartupOptions();
        options.setUseDemo(true);
        options.setUseDemo(false);
        assertEquals(false, options.useDemo());
    }

    @Test
    void testUseDemoSetFalseThenTrue() {
        StartupOptions options = new StartupOptions();
        options.setUseDemo(false);
        options.setUseDemo(true);
        assertEquals(true, options.useDemo());
    }

    @Test
    void testUseDemoSetTrueTwice() {
        StartupOptions options = new StartupOptions();
        options.setUseDemo(true);
        options.setUseDemo(true);
        assertEquals(true, options.useDemo());
    }

    @Test
    void testUseDemoSetFalseTwice() {
        StartupOptions options = new StartupOptions();
        options.setUseDemo(false);
        options.setUseDemo(false);
        assertEquals(false, options.useDemo());
    }
}