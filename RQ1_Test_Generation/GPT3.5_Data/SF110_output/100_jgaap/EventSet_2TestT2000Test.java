// EventSet_2Test.java

import java.util.Vector;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link EventSet}.
 * It contains ten unit test cases for the {@link EventSet#size()} method.
 */
class EventSet_2Test {

    /**
     * Test case for an empty event set.
     */
    @Test
    void testEmptyEventSet() {
        EventSet eventSet = new EventSet();
        assertEquals(0, eventSet.size());
    }

    /**
     * Test case for an event set with one event.
     */
    @Test
    void testEventSetWithOneEvent() {
        EventSet eventSet = new EventSet();
        Event event = new Event("Test Event");
        eventSet.events.add(event);
        assertEquals(1, eventSet.size());
    }

    /**
     * Test case for an event set with multiple events.
     */
    @Test
    void testEventSetWithMultipleEvents() {
        EventSet eventSet = new EventSet();
        Event event1 = new Event("Test Event 1");
        Event event2 = new Event("Test Event 2");
        Event event3 = new Event("Test Event 3");
        eventSet.events.add(event1);
        eventSet.events.add(event2);
        eventSet.events.add(event3);
        assertEquals(3, eventSet.size());
    }

    /**
     * Test case for an event set with null events.
     */
    @Test
    void testEventSetWithNullEvents() {
        EventSet eventSet = new EventSet();
        eventSet.events.add(null);
        assertEquals(1, eventSet.size());
    }

    /**
     * Test case for an event set with a mix of null and non-null events.
     */
    @Test
    void testEventSetWithMixedNullAndNonNullEvents() {
        EventSet eventSet = new EventSet();
        Event event1 = new Event("Test Event 1");
        eventSet.events.add(null);
        eventSet.events.add(event1);
        eventSet.events.add(null);
        assertEquals(3, eventSet.size());
    }

    /**
     * Test case for an event set with a large number of events.
     */
    @Test
    void testEventSetWithLargeNumberOfEvents() {
        EventSet eventSet = new EventSet();
        for (int i = 0; i < 1000000; i++) {
            Event event = new Event("Test Event " + i);
            eventSet.events.add(event);
        }
        assertEquals(1000000, eventSet.size());
    }

    /**
     * Test case for an event set with duplicate events.
     */
    @Test
    void testEventSetWithDuplicateEvents() {
        EventSet eventSet = new EventSet();
        Event event1 = new Event("Test Event 1");
        Event event2 = new Event("Test Event 2");
        eventSet.events.add(event1);
        eventSet.events.add(event2);
        eventSet.events.add(event1);
        assertEquals(3, eventSet.size());
    }

    /**
     * Test case for an event set with events added through the constructor.
     */
    @Test
    void testEventSetConstructor() {
        List<Event> eventList = new Vector<Event>();
        Event event1 = new Event("Test Event 1");
        Event event2 = new Event("Test Event 2");
        eventList.add(event1);
        eventList.add(event2);
        EventSet eventSet = new EventSet(eventList);
        assertEquals(2, eventSet.size());
    }

    /**
     * Test case for an event set with a subset of events.
     */
    @Test
    void testEventSetSubset() {
        EventSet eventSet = new EventSet();
        Event event1 = new Event("Test Event 1");
        Event event2 = new Event("Test Event 2");
        Event event3 = new Event("Test Event 3");
        eventSet.events.add(event1);
        eventSet.events.add(event2);
        eventSet.events.add(event3);
        EventSet subset = eventSet.subset(1, 2);
        assertEquals(2, subset.size());
    }

    /**
     * Test case for an event set with an index out of bounds.
     */
    @Test
    void testEventSetIndexOutOfBounds() {
        EventSet eventSet = new EventSet();
        Event event1 = new Event("Test Event 1");
        eventSet.events.add(event1);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            eventSet.eventAt(1);
        });
    }
}