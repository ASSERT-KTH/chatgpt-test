// HTMLFilterTest.java
package com.imsmart.servlet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link HTMLFilter}.
 * It contains ten unit test cases for the {@link HTMLFilter#filter(String)} method.
 */
class HTMLFilterTest {

    @Test
    void testNullInput() {
        assertNull(HTMLFilter.filter(null));
    }

    @Test
    void testNoSpecialCharacters() {
        String input = "This is a test message.";
        String expected = "This is a test message.";
        assertEquals(expected, HTMLFilter.filter(input));
    }

    @Test
    void testLessThan() {
        String input = "This is < a test message.";
        String expected = "This is &lt; a test message.";
        assertEquals(expected, HTMLFilter.filter(input));
    }

    @Test
    void testGreaterThan() {
        String input = "This is > a test message.";
        String expected = "This is &gt; a test message.";
        assertEquals(expected, HTMLFilter.filter(input));
    }

    @Test
    void testAmpersand() {
        String input = "This is & a test message.";
        String expected = "This is &amp; a test message.";
        assertEquals(expected, HTMLFilter.filter(input));
    }

    @Test
    void testDoubleQuotes() {
        String input = "This is \" a test message.";
        String expected = "This is &quot; a test message.";
        assertEquals(expected, HTMLFilter.filter(input));
    }

    @Test
    void testMultipleSpecialCharacters() {
        String input = "This is < a > test & message.";
        String expected = "This is &lt; a &gt; test &amp; message.";
        assertEquals(expected, HTMLFilter.filter(input));
    }

    @Test
    void testEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, HTMLFilter.filter(input));
    }

    @Test
    void testStringWithSpaces() {
        String input = "This is a test message with spaces.";
        String expected = "This is a test message with spaces.";
        assertEquals(expected, HTMLFilter.filter(input));
    }

    @Test
    void testStringWithTabs() {
        String input = "This is a test message\twith\ttabs.";
        String expected = "This is a test message\twith\ttabs.";
        assertEquals(expected, HTMLFilter.filter(input));
    }

    @Test
    void testStringWithNewLines() {
        String input = "This is a test message\nwith\nnew\nlines.";
        String expected = "This is a test message\nwith\nnew\nlines.";
        assertEquals(expected, HTMLFilter.filter(input));
    }
}