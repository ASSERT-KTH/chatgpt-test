// BomberServer_1Test.java
package server;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link BomberServer}.
 * It contains ten unit test cases for the {@link BomberServer#getInstance()} method.
 */
class BomberServer_1Test {

    /**
     * Test case 1: Test if the getInstance method returns the same instance of BomberServer.
     */
    @Test
    void testGetInstanceSameInstance() {
        BomberServer server1 = BomberServer.getInstance();
        BomberServer server2 = BomberServer.getInstance();
        assertSame(server1, server2);
    }

    /**
     * Test case 2: Test if the getInstance method returns a non-null instance of BomberServer.
     */
    @Test
    void testGetInstanceNonNull() {
        BomberServer server = BomberServer.getInstance();
        assertNotNull(server);
    }

    /**
     * Test case 3: Test if the getInstance method returns an instance of BomberServer.
     */
    @Test
    void testGetInstanceInstanceOf() {
        BomberServer server = BomberServer.getInstance();
        assertTrue(server instanceof BomberServer);
    }

    /**
     * Test case 4: Test if the getInstance method returns the same instance of BomberServer after multiple calls.
     */
    @Test
    void testGetInstanceMultipleCalls() {
        BomberServer server1 = BomberServer.getInstance();
        BomberServer server2 = BomberServer.getInstance();
        BomberServer server3 = BomberServer.getInstance();
        assertSame(server1, server2);
        assertSame(server2, server3);
    }

    /**
     * Test case 5: Test if the getInstance method returns a non-null instance of BomberServer after multiple calls.
     */
    @Test
    void testGetInstanceNonNullMultipleCalls() {
        BomberServer server1 = BomberServer.getInstance();
        BomberServer server2 = BomberServer.getInstance();
        BomberServer server3 = BomberServer.getInstance();
        assertNotNull(server1);
        assertNotNull(server2);
        assertNotNull(server3);
    }

    /**
     * Test case 6: Test if the getInstance method returns an instance of BomberServer after multiple calls.
     */
    @Test
    void testGetInstanceInstanceOfMultipleCalls() {
        BomberServer server1 = BomberServer.getInstance();
        BomberServer server2 = BomberServer.getInstance();
        BomberServer server3 = BomberServer.getInstance();
        assertTrue(server1 instanceof BomberServer);
        assertTrue(server2 instanceof BomberServer);
        assertTrue(server3 instanceof BomberServer);
    }

    /**
     * Test case 7: Test if the getInstance method returns the same instance of BomberServer in a multi-threaded environment.
     */
    @Test
    void testGetInstanceMultiThreaded() {
        BomberServer server1 = BomberServer.getInstance();
        BomberServer server2 = BomberServer.getInstance();
        BomberServer server3 = BomberServer.getInstance();
        Runnable runnable = () -> {
            BomberServer server = BomberServer.getInstance();
            assertSame(server1, server);
            assertSame(server2, server);
            assertSame(server3, server);
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }

    /**
     * Test case 8: Test if the getInstance method returns a non-null instance of BomberServer in a multi-threaded environment.
     */
    @Test
    void testGetInstanceNonNullMultiThreaded() {
        BomberServer server1 = BomberServer.getInstance();
        BomberServer server2 = BomberServer.getInstance();
        BomberServer server3 = BomberServer.getInstance();
        Runnable runnable = () -> {
            BomberServer server = BomberServer.getInstance();
            assertNotNull(server);
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }

    /**
     * Test case 9: Test if the getInstance method returns an instance of BomberServer in a multi-threaded environment.
     */
    @Test
    void testGetInstanceInstanceOfMultiThreaded() {
        BomberServer server1 = BomberServer.getInstance();
        BomberServer server2 = BomberServer.getInstance();
        BomberServer server3 = BomberServer.getInstance();
        Runnable runnable = () -> {
            BomberServer server = BomberServer.getInstance();
            assertTrue(server instanceof BomberServer);
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }

    /**
     * Test case 10: Test if the getInstance method returns the same instance of BomberServer in a multi-threaded environment with synchronization.
     */
    @Test
    void testGetInstanceMultiThreadedSynchronized() {
        BomberServer server1 = BomberServer.getInstance();
        BomberServer server2 = BomberServer.getInstance();
        BomberServer server3 = BomberServer.getInstance();
        Runnable runnable = () -> {
            synchronized (BomberServer.class) {
                BomberServer server = BomberServer.getInstance();
                assertSame(server1, server);
                assertSame(server2, server);
                assertSame(server3, server);
            }
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}