// Here's the source code for EnumeratedPropertiesTest.java

package ghm.follow.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link EnumeratedProperties}.
 * It contains ten unit test cases for the {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
 */
class EnumeratedPropertiesTest {

    /**
     * Test case for an empty list.
     */
    @Test
    void testEmptyList() {
        EnumeratedProperties props = new EnumeratedProperties();
        List<String> expected = new ArrayList<String>();
        List<String> actual = props.getEnumeratedProperty("emptyList");
        assertEquals(expected, actual);
    }

    /**
     * Test case for a list with one element.
     */
    @Test
    void testSingleElementList() {
        EnumeratedProperties props = new EnumeratedProperties();
        List<String> expected = new ArrayList<String>();
        expected.add("value1");
        props.setEnumeratedProperty("singleElementList", expected);
        List<String> actual = props.getEnumeratedProperty("singleElementList");
        assertEquals(expected, actual);
    }

    /**
     * Test case for a list with multiple elements.
     */
    @Test
    void testMultipleElementList() {
        EnumeratedProperties props = new EnumeratedProperties();
        List<String> expected = new ArrayList<String>();
        expected.add("value1");
        expected.add("value2");
        expected.add("value3");
        props.setEnumeratedProperty("multipleElementList", expected);
        List<String> actual = props.getEnumeratedProperty("multipleElementList");
        assertEquals(expected, actual);
    }

    /**
     * Test case for a list with a null element.
     */
    @Test
    void testListWithNullElement() {
        EnumeratedProperties props = new EnumeratedProperties();
        List<String> expected = new ArrayList<String>();
        expected.add(null);
        props.setEnumeratedProperty("listWithNullElement", expected);
        List<String> actual = props.getEnumeratedProperty("listWithNullElement");
        assertEquals(expected, actual);
    }

    /**
     * Test case for a list with an empty string element.
     */
    @Test
    void testListWithEmptyStringElement() {
        EnumeratedProperties props = new EnumeratedProperties();
        List<String> expected = new ArrayList<String>();
        expected.add("");
        props.setEnumeratedProperty("listWithEmptyStringElement", expected);
        List<String> actual = props.getEnumeratedProperty("listWithEmptyStringElement");
        assertEquals(expected, actual);
    }

    /**
     * Test case for a list with a single space element.
     */
    @Test
    void testListWithSingleSpaceElement() {
        EnumeratedProperties props = new EnumeratedProperties();
        List<String> expected = new ArrayList<String>();
        expected.add(" ");
        props.setEnumeratedProperty("listWithSingleSpaceElement", expected);
        List<String> actual = props.getEnumeratedProperty("listWithSingleSpaceElement");
        assertEquals(expected, actual);
    }

    /**
     * Test case for a list with multiple spaces element.
     */
    @Test
    void testListWithMultipleSpacesElement() {
        EnumeratedProperties props = new EnumeratedProperties();
        List<String> expected = new ArrayList<String>();
        expected.add("  ");
        props.setEnumeratedProperty("listWithMultipleSpacesElement", expected);
        List<String> actual = props.getEnumeratedProperty("listWithMultipleSpacesElement");
        assertEquals(expected, actual);
    }

    /**
     * Test case for a list with a tab character element.
     */
    @Test
    void testListWithTabElement() {
        EnumeratedProperties props = new EnumeratedProperties();
        List<String> expected = new ArrayList<String>();
        expected.add("\t");
        props.setEnumeratedProperty("listWithTabElement", expected);
        List<String> actual = props.getEnumeratedProperty("listWithTabElement");
        assertEquals(expected, actual);
    }

    /**
     * Test case for a list with a newline character element.
     */
    @Test
    void testListWithNewlineElement() {
        EnumeratedProperties props = new EnumeratedProperties();
        List<String> expected = new ArrayList<String>();
        expected.add("\n");
        props.setEnumeratedProperty("listWithNewlineElement", expected);
        List<String> actual = props.getEnumeratedProperty("listWithNewlineElement");
        assertEquals(expected, actual);
    }

    /**
     * Test case for a list with a carriage return character element.
     */
    @Test
    void testListWithCarriageReturnElement() {
        EnumeratedProperties props = new EnumeratedProperties();
        List<String> expected = new ArrayList<String>();
        expected.add("\r");
        props.setEnumeratedProperty("listWithCarriageReturnElement", expected);
        List<String> actual = props.getEnumeratedProperty("listWithCarriageReturnElement");
        assertEquals(expected, actual);
    }
}