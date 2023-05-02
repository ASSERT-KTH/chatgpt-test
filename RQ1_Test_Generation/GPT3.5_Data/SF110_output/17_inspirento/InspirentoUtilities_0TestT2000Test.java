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
    public void testStringReplaceAll() {
        StringBuffer input = new StringBuffer("Hello, world!");
        char token = 'o';
        String replacement = "0";
        StringBuffer expected = new StringBuffer("Hell0, w0rld!");
        assertEquals(expected.toString(), InspirentoUtilities.stringReplaceAll(input, token, replacement).toString());
    }
}