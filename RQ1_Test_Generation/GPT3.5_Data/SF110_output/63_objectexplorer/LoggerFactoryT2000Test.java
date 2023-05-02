// Source code for LoggerFactoryTest.java

package de.paragon.explorer.util;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link LoggerFactory}.
 * It contains ten unit test cases for the {@link LoggerFactory#make()} method.
 */
class LoggerFactoryTest {

    /**
     * Test case for creating a logger in the calling class.
     */
    @Test
    void testMake() {
        Logger logger = LoggerFactory.make();
        assertNotNull(logger);
    }

    /**
     * Test case for creating a logger in a specific class.
     */
    @Test
    void testMakeWithClassName() {
        Logger logger = LoggerFactory.make(LoggerFactoryTest.class);
        assertNotNull(logger);
        assertEquals(LoggerFactoryTest.class.getName(), logger.getName());
    }

    /**
     * Test case for creating a logger with a null class.
     */
    @Test
    void testMakeWithNullClass() {
        Logger logger = LoggerFactory.make(null);
        assertNotNull(logger);
        assertEquals(LoggerFactory.class.getName(), logger.getName());
    }

    /**
     * Test case for creating a logger with an empty class name.
     */
    @Test
    void testMakeWithEmptyClassName() {
        Logger logger = LoggerFactory.make("");
        assertNotNull(logger);
        assertEquals(LoggerFactory.class.getName(), logger.getName());
    }

    /**
     * Test case for creating a logger with a whitespace class name.
     */
    @Test
    void testMakeWithWhitespaceClassName() {
        Logger logger = LoggerFactory.make("   ");
        assertNotNull(logger);
        assertEquals(LoggerFactory.class.getName(), logger.getName());
    }

    /**
     * Test case for creating a logger with a non-existent class name.
     */
    @Test
    void testMakeWithNonExistentClassName() {
        Logger logger = LoggerFactory.make("NonExistentClass");
        assertNotNull(logger);
        assertEquals(LoggerFactory.class.getName(), logger.getName());
    }

    /**
     * Test case for creating a logger with a class name that is not a string.
     */
    @Test
    void testMakeWithNonStringClassName() {
        Logger logger = LoggerFactory.make(123);
        assertNotNull(logger);
        assertEquals(LoggerFactory.class.getName(), logger.getName());
    }

    /**
     * Test case for creating a logger with a class name that is an interface.
     */
    @Test
    void testMakeWithInterfaceClassName() {
        Logger logger = LoggerFactory.make(Runnable.class);
        assertNotNull(logger);
        assertEquals(LoggerFactory.class.getName(), logger.getName());
    }

    /**
     * Test case for creating a logger with a class name that is an anonymous class.
     */
    @Test
    void testMakeWithAnonymousClassClassName() {
        Logger logger = LoggerFactory.make(new Runnable() {
            @Override
            public void run() {
                // do nothing
            }
        }.getClass());
        assertNotNull(logger);
        assertEquals(LoggerFactory.class.getName(), logger.getName());
    }

    /**
     * Test case for creating a logger with a class name that is a lambda expression.
     */
    @Test
    void testMakeWithLambdaExpressionClassName() {
        Logger logger = LoggerFactory.make((Runnable) () -> {
            // do nothing
        }.getClass());
        assertNotNull(logger);
        assertEquals(LoggerFactory.class.getName(), logger.getName());
    }
}