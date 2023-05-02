// Source code for StartState_1Test.java

package uk.me.jockmacmad.jstate.state;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link StartState}.
 * It contains ten unit test cases for the {@link StartState#toObject()} method.
 */
class StartState_1Test {

    /**
     * Test method for {@link StartState#toObject()}.
     * Tests that the method returns an object of type java.lang.Object.
     */
    @Test
    void testToObjectReturnsObject() {
        StartState startState = StartState.getSingleton();
        Object obj = startState.toObject();
        assertTrue(obj instanceof Object);
    }

    /**
     * Test method for {@link StartState#toObject()}.
     * Tests that the method returns an object of type StartState.
     */
    @Test
    void testToObjectReturnsStartState() {
        StartState startState = StartState.getSingleton();
        Object obj = startState.toObject();
        assertTrue(obj instanceof StartState);
    }

    /**
     * Test method for {@link StartState#toObject()}.
     * Tests that the method returns an object that is equal to the original StartState object.
     */
    @Test
    void testToObjectReturnsEqualObject() {
        StartState startState = StartState.getSingleton();
        Object obj = startState.toObject();
        assertTrue(EqualsBuilder.reflectionEquals(startState, obj));
    }

    /**
     * Test method for {@link StartState#toObject()}.
     * Tests that the method returns an object with the same hash code as the original StartState object.
     */
    @Test
    void testToObjectReturnsObjectWithSameHashCode() {
        StartState startState = StartState.getSingleton();
        Object obj = startState.toObject();
        assertEquals(HashCodeBuilder.reflectionHashCode(startState), HashCodeBuilder.reflectionHashCode(obj));
    }

    /**
     * Test method for {@link StartState#toObject()}.
     * Tests that the method returns an object that is not null.
     */
    @Test
    void testToObjectReturnsNotNull() {
        StartState startState = StartState.getSingleton();
        Object obj = startState.toObject();
        assertNotNull(obj);
    }

    /**
     * Test method for {@link StartState#toObject()}.
     * Tests that the method returns an object that is not the same instance as the original StartState object.
     */
    @Test
    void testToObjectReturnsNotSameInstance() {
        StartState startState = StartState.getSingleton();
        Object obj = startState.toObject();
        assertNotSame(startState, obj);
    }

    /**
     * Test method for {@link StartState#toObject()}.
     * Tests that the method returns an object that is not equal to a different StartState object.
     */
    @Test
    void testToObjectReturnsNotEqualDifferentStartState() {
        StartState startState1 = StartState.getSingleton();
        StartState startState2 = new StartState();
        Object obj = startState1.toObject();
        assertFalse(EqualsBuilder.reflectionEquals(startState2, obj));
    }

    /**
     * Test method for {@link StartState#toObject()}.
     * Tests that the method returns an object with a different hash code than a different StartState object.
     */
    @Test
    void testToObjectReturnsObjectWithDifferentHashCode() {
        StartState startState1 = StartState.getSingleton();
        StartState startState2 = new StartState();
        Object obj = startState1.toObject();
        assertNotEquals(HashCodeBuilder.reflectionHashCode(startState2), HashCodeBuilder.reflectionHashCode(obj));
    }

    /**
     * Test method for {@link StartState#toObject()}.
     * Tests that the method returns an object that is not equal to null.
     */
    @Test
    void testToObjectReturnsNotEqualNull() {
        StartState startState = StartState.getSingleton();
        Object obj = startState.toObject();
        assertNotEquals(null, obj);
    }

    /**
     * Test method for {@link StartState#toObject()}.
     * Tests that the method returns an object that is not equal to a different type of object.
     */
    @Test
    void testToObjectReturnsNotEqualDifferentType() {
        StartState startState = StartState.getSingleton();
        Object obj = startState.toObject();
        assertNotEquals("test", obj);
    }
}