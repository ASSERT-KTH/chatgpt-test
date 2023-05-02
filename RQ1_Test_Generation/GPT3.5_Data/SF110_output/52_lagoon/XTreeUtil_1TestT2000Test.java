// XTreeUtil_1Test.java
package nu.staldal.xtree;

import org.junit.jupiter.api.Test;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test class of {@link XTreeUtil}.
 * It contains ten unit test cases for the {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)} method.
 */
class XTreeUtil_1Test {

    @Test
    void testEmptyInput() throws IOException, SAXException {
        String input = "";
        InputSource xmlInput = new InputSource(new StringReader(input));
        Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, new DefaultHandler());
        assertEquals(null, root);
    }

    @Test
    void testSingleElement() throws IOException, SAXException {
        String input = "<root><child/></root>";
        InputSource xmlInput = new InputSource(new StringReader(input));
        Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, new DefaultHandler());
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        assertEquals("child", root.getChild(0).getName());
    }

    @Test
    void testMultipleElements() throws IOException, SAXException {
        String input = "<root><child1/><child2/><child3/></root>";
        InputSource xmlInput = new InputSource(new StringReader(input));
        Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, new DefaultHandler());
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("child1", root.getChild(0).getName());
        assertEquals("child2", root.getChild(1).getName());
        assertEquals("child3", root.getChild(2).getName());
    }

    @Test
    void testNestedElements() throws IOException, SAXException {
        String input = "<root><child1><child2><child3/></child2></child1></root>";
        InputSource xmlInput = new InputSource(new StringReader(input));
        Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, new DefaultHandler());
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child1 = root.getChild(0);
        assertEquals("child1", child1.getName());
        assertEquals(1, child1.getChildCount());
        Element child2 = child1.getChild(0);
        assertEquals("child2", child2.getName());
        assertEquals(1, child2.getChildCount());
        assertEquals("child3", child2.getChild(0).getName());
    }

    @Test
    void testAttributes() throws IOException, SAXException {
        String input = "<root attr1=\"value1\" attr2=\"value2\"><child attr3=\"value3\"/></root>";
        InputSource xmlInput = new InputSource(new StringReader(input));
        Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, new DefaultHandler());
        assertEquals("root", root.getName());
        assertEquals(2, root.getAttributeCount());
        assertEquals("value1", root.getAttribute("attr1"));
        assertEquals("value2", root.getAttribute("attr2"));
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(1, child.getAttributeCount());
        assertEquals("value3", child.getAttribute("attr3"));
    }

    @Test
    void testTextContent() throws IOException, SAXException {
        String input = "<root>text content</root>";
        InputSource xmlInput = new InputSource(new StringReader(input));
        Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, new DefaultHandler());
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        assertEquals("text content", root.getChild(0).getTextContent());
    }

    @Test
    void testCDATA() throws IOException, SAXException {
        String input = "<root><![CDATA[<child>]]></root>";
        InputSource xmlInput = new InputSource(new StringReader(input));
        Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, new DefaultHandler());
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        assertEquals("<child>", root.getChild(0).getTextContent());
    }

    @Test
    void testProcessingInstruction() throws IOException, SAXException {
        String input = "<?xml-stylesheet type=\"text/xsl\" href=\"style.xsl\"?><root/>";
        InputSource xmlInput = new InputSource(new StringReader(input));
        Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, new DefaultHandler());
        assertEquals("root", root.getName());
    }

    @Test
    void testComment() throws IOException, SAXException {
        String input = "<root><!-- comment --></root>";
        InputSource xmlInput = new InputSource(new StringReader(input));
        Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, new DefaultHandler());
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        assertEquals("<!-- comment -->", root.getChild(0).getTextContent());
    }

    @Test
    void testDTDValidation() {
        String input = "<!DOCTYPE root SYSTEM \"test.dtd\"><root/>";
        InputSource xmlInput = new InputSource(new StringReader(input));
        assertThrows(SAXException.class, () -> XTreeUtil.parseXMLSequential(xmlInput, true, null, null, new DefaultHandler()));
    }

    @Test
    void testSchemaValidation() throws IOException, SAXException {
        String input = "<root xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"test.xsd\"><child/></root>";
        InputSource xmlInput = new InputSource(new StringReader(input));
        InputSource schema = new InputSource(getClass().getResourceAsStream("/test.xsd"));
        Element root = XTreeUtil.parseXMLSequential(xmlInput, false, "http://www.w3.org/2001/XMLSchema", schema, new DefaultHandler());
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        assertEquals("child", root.getChild(0).getName());
    }

    @Test
    void testHandler() throws IOException, SAXException {
        String input = "<root><child1/><child2/><child3/></root>";
        InputSource xmlInput = new InputSource(new StringReader(input));
        List<String> elements = new ArrayList<>();
        ElementHandler handler = new ElementHandler() {
            @Override
            public void onElement(Element element) {
                elements.add(element.getName());
            }
        };
        XTreeUtil.parseXMLSequential(xmlInput, false, null, null, handler);
        assertEquals(3, elements.size());
        assertEquals("child1", elements.get(0));
        assertEquals("child2", elements.get(1));
        assertEquals("child3", elements.get(2));
    }
}