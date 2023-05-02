// Here's the test class for ClientPool.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClientPoolTest {

    @Test
    void testShouldNioWriteHappen_NoLimit() {
        ClientPool pool = new ClientPool(null, null);
        assertTrue(pool.shouldNioWriteHappen());
        assertTrue(pool.shouldNioWriteHappen());
        assertTrue(pool.shouldNioWriteHappen());
    }

    @Test
    void testShouldNioWriteHappen_LimitNotReached() {
        ClientPool pool = new ClientPool(null, null);
        pool.setMaxThreadsForNioWrite(2);
        assertTrue(pool.shouldNioWriteHappen());
        assertTrue(pool.shouldNioWriteHappen());
        assertFalse(pool.shouldNioWriteHappen());
        pool.nioWriteEnd();
        assertTrue(pool.shouldNioWriteHappen());
    }

    @Test
    void testShouldNioWriteHappen_LimitReached() {
        ClientPool pool = new ClientPool(null, null);
        pool.setMaxThreadsForNioWrite(2);
        assertTrue(pool.shouldNioWriteHappen());
        assertTrue(pool.shouldNioWriteHappen());
        assertFalse(pool.shouldNioWriteHappen());
        assertFalse(pool.shouldNioWriteHappen());
    }

    @Test
    void testShouldNioWriteHappen_LimitZero() {
        ClientPool pool = new ClientPool(null, null);
        pool.setMaxThreadsForNioWrite(0);
        assertTrue(pool.shouldNioWriteHappen());
        assertTrue(pool.shouldNioWriteHappen());
        assertTrue(pool.shouldNioWriteHappen());
    }

    @Test
    void testShouldNioWriteHappen_LimitNegative() {
        ClientPool pool = new ClientPool(null, null);
        pool.setMaxThreadsForNioWrite(-1);
        assertTrue(pool.shouldNioWriteHappen());
        assertTrue(pool.shouldNioWriteHappen());
        assertTrue(pool.shouldNioWriteHappen());
    }

    @Test
    void testNioWriteStart() {
        ClientPool pool = new ClientPool(null, null);
        assertEquals(0, pool.countNioWriteThreads);
        pool.nioWriteStart();
        assertEquals(1, pool.countNioWriteThreads);
        pool.nioWriteStart();
        assertEquals(2, pool.countNioWriteThreads);
    }

    @Test
    void testNioWriteEnd() {
        ClientPool pool = new ClientPool(null, null);
        pool.countNioWriteThreads = 2;
        pool.nioWriteEnd();
        assertEquals(1, pool.countNioWriteThreads);
        pool.nioWriteEnd();
        assertEquals(0, pool.countNioWriteThreads);
    }

    @Test
    void testNioWriteEnd_LessThanZero() {
        ClientPool pool = new ClientPool(null, null);
        pool.countNioWriteThreads = 0;
        pool.nioWriteEnd();
        assertEquals(0, pool.countNioWriteThreads);
        pool.nioWriteEnd();
        assertEquals(0, pool.countNioWriteThreads);
    }

    @Test
    void testGetMaxThreadsForNioWrite() {
        ClientPool pool = new ClientPool(null, null);
        assertEquals(10, pool.getMaxThreadsForNioWrite());
        pool.setMaxThreadsForNioWrite(5);
        assertEquals(5, pool.getMaxThreadsForNioWrite());
    }

    @Test
    void testGetPoolConfig() {
        PoolConfig config = new PoolConfig();
        ClientPool pool = new ClientPool(null, config);
        assertEquals(config, pool.getPoolConfig());
    }

}