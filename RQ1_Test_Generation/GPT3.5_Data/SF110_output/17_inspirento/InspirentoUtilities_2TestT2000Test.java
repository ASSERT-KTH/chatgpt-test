// Test class of InspirentoUtilities
package com.allenstudio.ir.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for InspirentoUtilities.
 */
public class InspirentoUtilitiesTest {

    @Test
    public void testTokenize() {
        String input = "file edit view";
        String[] expected = {"file", "edit", "view"};
        assertArrayEquals(expected, InspirentoUtilities.tokenize(input));
    }

    @Test
    public void testTokenizeWithDelim() {
        String input = "file,edit,view";
        String delim = ",";
        String[] expected = {"file", "edit", "view"};
        assertArrayEquals(expected, InspirentoUtilities.tokenize(input, delim));
    }

    @Test
    public void testEscapeText() {
        String input = "<html>\n<body>\n<p>Hello, world!</p>\n</body>\n</html>";
        String expected = "&lt;html&gt;\n&lt;body&gt;\n&lt;p&gt;Hello, world!&lt;/p&gt;\n&lt;/body&gt;\n&lt;/html&gt;";
        assertEquals(expected, InspirentoUtilities.escapeText(input));
    }

    @Test
    public void testEscapeTextWithAmpersand() {
        String input = "AT&T";
        String expected = "AT&amp;T";
        assertEquals(expected, InspirentoUtilities.escapeText(input));
    }

    @Test
    public void testEscapeTextWithLessThan() {
        String input = "3 < 5";
        String expected = "3 &lt; 5";
        assertEquals(expected, InspirentoUtilities.escapeText(input));
    }

    @Test
    public void testEscapeTextWithGreaterThan() {
        String input = "5 > 3";
        String expected = "5 &gt; 3";
        assertEquals(expected, InspirentoUtilities.escapeText(input));
    }

    @Test
    public void testEscapeTextWithDoubleQuote() {
        String input = "She said, \"Hello!\"";
        String expected = "She said, &quot;Hello!&quot;";
        assertEquals(expected, InspirentoUtilities.escapeText(input));
    }

    @Test
    public void testEscapeTextWithSingleQuote() {
        String input = "It's a beautiful day.";
        String expected = "It&apos;s a beautiful day.";
        assertEquals(expected, InspirentoUtilities.escapeText(input));
    }

    @Test
    public void testStringReplaceAll() {
        StringBuffer source = new StringBuffer("Hello, world!");
        char token = 'o';
        String replacement = "x";
        StringBuffer expected = new StringBuffer("Hellx, wxrld!");
        assertEquals(expected.toString(), InspirentoUtilities.stringReplaceAll(source, token, replacement).toString());
    }
}