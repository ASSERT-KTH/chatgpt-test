// Text.java
/*
 * Copyright (c) 2001-2003, Mikael St�ldal
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *
 * 3. Neither the name of the author nor the names of its contributors
 * may be used to endorse or promote products derived from this software
 * without specific prior written permission.
 *
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * ``AS IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE REGENTS OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY
 * OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *
 * Note: This is known as "the modified BSD license". It's an approved
 * Open Source and Free Software license, see
 * http://www.opensource.org/licenses/
 * and
 * http://www.gnu.org/philosophy/license-list.html
 */
package nu.staldal.xtree;

import org.xml.sax.*;

/**
 * Character content in an XML document. This class is immutible.
 */
public class Text extends Node {

    static final long serialVersionUID = -128692223369356277L;

    final String value;

    transient char[] charArrayCache;

    /**
     * Constructs a text node from a char[] buffer.
     *
     * @param data  a char[] buffer
     * @param start  the offset to read from in the buffer
     * @param length  the number of characters to read from the buffer
     * @param forceCopy  force copying of the data, if false a reference
     *                   to the buffer may be keept.
     */
    public Text(char[] data, int start, int length, boolean forceCopy) {
        value = new String(data, start, length);
        if (start == 0 && length == data.length && !forceCopy)
            charArrayCache = data;
    }

    /**
     * Constructs a text node from a String.
     *
     * @param value  the string
     */
    public Text(String value) {
        this.value = value;
    }

    /**
     * Get the character content as a string
     */
    public String getValue() {
        return value;
    }

    private void obtainCharArray() {
        if (charArrayCache == null)
            charArrayCache = value.toCharArray();
    }

    /**
     * Get the character content as a char[].
     */
    public char[] asCharArray() {
        obtainCharArray();
        return charArrayCache;
    }

    public void toSAX(ContentHandler sax) throws SAXException {
        obtainCharArray();
        sax.characters(charArrayCache, 0, charArrayCache.length);
    }

    public boolean isWhitespaceNode() {
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) > ' ')
                return false;
        }
        return true;
    }
}

// TextTest.java
package nu.staldal.xtree;

import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Text}.
* It contains ten unit test cases for the {@link Text#asCharArray()} method.
*/
class TextTest {
    
    /**
     * Test case for empty string.
     */
    @Test
    void testEmptyString() {
        Text text = new Text("");
        assertArrayEquals(new char[0], text.asCharArray());
    }
    
    /**
     * Test case for string with one character.
     */
    @Test
    void testOneCharString() {
        Text text = new Text("a");
        assertArrayEquals(new char[]{'a'}, text.asCharArray());
    }
    
    /**
     * Test case for string with multiple characters.
     */
    @Test
    void testMultipleCharString() {
        Text text = new Text("hello");
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, text.asCharArray());
    }
    
    /**
     * Test case for string with special characters.
     */
    @Test
    void testSpecialCharString() {
        Text text = new Text("&#x3C; &lt; <");
        assertArrayEquals(new char[]{'&', '#', 'x', '3', 'C', ';', ' ', '<', 't', ';', ' ', '<'}, text.asCharArray());
    }
    
    /**
     * Test case for string with whitespace characters.
     */
    @Test
    void testWhitespaceString() {
        Text text = new Text(" \t\n\r");
        assertArrayEquals(new char[]{' ', '\t', '\n', '\r'}, text.asCharArray());
    }
    
    /**
     * Test case for string with non-ASCII characters.
     */
    @Test
    void testNonAsciiString() {
        Text text = new Text("åäö");
        assertArrayEquals(new char[]{'å', 'ä', 'ö'}, text.asCharArray());
    }
    
    /**
     * Test case for string with surrogate pairs.
     */
    @Test
    void testSurrogatePairString() {
        Text text = new Text("\uD83D\uDE00");
        assertArrayEquals(new char[]{'\uD83D', '\uDE00'}, text.asCharArray());
    }
    
    /**
     * Test case for string with surrogate pairs and other characters.
     */
    @Test
    void testMixedString() {
        Text text = new Text("hello\uD83D\uDE00world");
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o', '\uD83D', '\uDE00', 'w', 'o', 'r', 'l', 'd'}, text.asCharArray());
    }
    
    /**
     * Test case for string with cached char array.
     */
    @Test
    void testCachedCharArray() {
        char[] data = new char[]{'h', 'e', 'l', 'l', 'o'};
        Text text = new Text(data, 0, 5, false);
        assertSame(data, text.asCharArray());
    }
    
    /**
     * Test case for string with cached char array and forceCopy=true.
     */
    @Test
    void testCachedCharArrayForceCopy() {
        char[] data = new char[]{'h', 'e', 'l', 'l', 'o'};
        Text text = new Text(data, 0, 5, true);
        assertNotSame(data, text.asCharArray());
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, text.asCharArray());
    }
}