// XmlFunctions_1Test.java
package common;

import org.junit.jupiter.api.Test;
import org.w3c.dom.NodeList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link XmlFunctions}.
 * It contains ten unit test cases for the {@link XmlFunctions#findXmlNodes(String)} method.
 */
class XmlFunctions_1Test {

    @Test
    void testFindXmlNodes() {
        XmlFunctions xmlFunctions = new XmlFunctions("test.xml");
        NodeList nodeList = xmlFunctions.findXmlNodes("//book");
        assertEquals(2, nodeList.getLength());
    }

    @Test
    void testFindXmlNodesWithInvalidPath() {
        XmlFunctions xmlFunctions = new XmlFunctions("test.xml");
        NodeList nodeList = xmlFunctions.findXmlNodes("//invalidPath");
        assertNull(nodeList);
    }

    @Test
    void testFindXmlNodesWithEmptyPath() {
        XmlFunctions xmlFunctions = new XmlFunctions("test.xml");
        NodeList nodeList = xmlFunctions.findXmlNodes("");
        assertNull(nodeList);
    }

    @Test
    void testFindXmlNodesWithNullPath() {
        XmlFunctions xmlFunctions = new XmlFunctions("test.xml");
        NodeList nodeList = xmlFunctions.findXmlNodes(null);
        assertNull(nodeList);
    }

    @Test
    void testFindXmlNodesWithWhitespacePath() {
        XmlFunctions xmlFunctions = new XmlFunctions("test.xml");
        NodeList nodeList = xmlFunctions.findXmlNodes("   ");
        assertNull(nodeList);
    }

    @Test
    void testFindXmlNodesWithNonexistentFile() {
        XmlFunctions xmlFunctions = new XmlFunctions("nonexistent.xml");
        NodeList nodeList = xmlFunctions.findXmlNodes("//book");
        assertNull(nodeList);
    }

    @Test
    void testFindXmlNodesWithInvalidXmlFile() {
        XmlFunctions xmlFunctions = new XmlFunctions("invalid.xml");
        NodeList nodeList = xmlFunctions.findXmlNodes("//book");
        assertNull(nodeList);
    }

    @Test
    void testFindXmlNodesWithNamespace() {
        XmlFunctions xmlFunctions = new XmlFunctions("test.xml");
        NodeList nodeList = xmlFunctions.findXmlNodes("//ns:book", "ns:http://www.example.com/books");
        assertEquals(2, nodeList.getLength());
    }

    @Test
    void testFindXmlNodesWithInvalidNamespace() {
        XmlFunctions xmlFunctions = new XmlFunctions("test.xml");
        NodeList nodeList = xmlFunctions.findXmlNodes("//ns:book", "ns:invalidNamespace");
        assertNull(nodeList);
    }

    @Test
    void testFindXmlNodesWithEmptyNamespace() {
        XmlFunctions xmlFunctions = new XmlFunctions("test.xml");
        NodeList nodeList = xmlFunctions.findXmlNodes("//book", "");
        assertEquals(2, nodeList.getLength());
    }
}