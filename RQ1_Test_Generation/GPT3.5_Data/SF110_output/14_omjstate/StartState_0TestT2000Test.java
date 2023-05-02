// StartState_0Test.java
package uk.me.jockmacmad.jstate.state;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#getSingleton()} method.
*/
class StartState_0Test {

    /**
     * Test method for {@link StartState#getSingleton()}.
     * Verifies that the returned object is not null.
     */
    @Test
    void testGetSingletonNotNull() {
        assertNotNull(StartState.getSingleton());
    }

    /**
     * Test method for {@link StartState#getSingleton()}.
     * Verifies that the returned object is an instance of StartState.
     */
    @Test
    void testGetSingletonIsInstanceOfStartState() {
        assertTrue(StartState.getSingleton() instanceof StartState);
    }

    /**
     * Test method for {@link StartState#getSingleton()}.
     * Verifies that the returned object is always the same instance.
     */
    @Test
    void testGetSingletonAlwaysReturnsSameInstance() {
        StartState instance1 = StartState.getSingleton();
        StartState instance2 = StartState.getSingleton();
        assertSame(instance1, instance2);
    }

    /**
     * Test method for {@link StartState#getName()}.
     * Verifies that the returned name is not null.
     */
    @Test
    void testGetNameNotNull() {
        assertNotNull(StartState.getSingleton().getName());
    }

    /**
     * Test method for {@link StartState#equals(Object)}.
     * Verifies that the StartState instance is equal to itself.
     */
    @Test
    void testEqualsIsReflexive() {
        StartState instance = StartState.getSingleton();
        assertTrue(instance.equals(instance));
    }

    /**
     * Test method for {@link StartState#equals(Object)}.
     * Verifies that the StartState instance is not equal to null.
     */
    @Test
    void testEqualsWithNull() {
        StartState instance = StartState.getSingleton();
        assertFalse(instance.equals(null));
    }

    /**
     * Test method for {@link StartState#equals(Object)}.
     * Verifies that the StartState instance is not equal to an object of a different class.
     */
    @Test
    void testEqualsWithDifferentClass() {
        StartState instance = StartState.getSingleton();
        assertFalse(instance.equals(new Object()));
    }

    /**
     * Test method for {@link StartState#equals(Object)}.
     * Verifies that two StartState instances are equal.
     */
    @Test
    void testEqualsWithEqualInstances() {
        StartState instance1 = StartState.getSingleton();
        StartState instance2 = StartState.getSingleton();
        assertTrue(instance1.equals(instance2));
    }

    /**
     * Test method for {@link StartState#equals(Object)}.
     * Verifies that two StartState instances are not equal.
     */
    @Test
    void testEqualsWithDifferentInstances() {
        StartState instance1 = StartState.getSingleton();
        StartState instance2 = new StartState();
        assertFalse(instance1.equals(instance2));
    }

    /**
     * Test method for {@link StartState#hashCode()}.
     * Verifies that the hash code of a StartState instance is always the same.
     */
    @Test
    void testHashCodeIsConsistent() {
        StartState instance = StartState.getSingleton();
        int hashCode1 = instance.hashCode();
        int hashCode2 = instance.hashCode();
        assertEquals(hashCode1, hashCode2);
    }
}