// IFXDocumentHandler_2Test.java
package org.sourceforge.ifx.utils;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.jdom.Document;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXParseException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link IFXDocumentHandler}.
 * It contains ten unit test cases for the {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
 */
class IFXDocumentHandler_2Test {

    /**
     * Test case to verify that a valid XML document is parsed successfully.
     */
    @Test
    void testReadValidDocument() throws IFXException {
        String xml = "<root><child>value</child></root>";
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        Document doc = IFXDocumentHandler.read(is, false, null);
        assertNotNull(doc);
    }

    /**
     * Test case to verify that an invalid XML document throws an exception when validation is turned off.
     */
    @Test
    void testReadInvalidDocumentWithoutValidation() {
        String xml = "<root><child>value</child></invalid>";
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        assertThrows(IFXException.class, () -> IFXDocumentHandler.read(is, false, null));
    }

    /**
     * Test case to verify that an invalid XML document throws an exception when validation is turned on.
     */
    @Test
    void testReadInvalidDocumentWithValidation() {
        String xml = "<root><child>value</child></invalid>";
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        assertThrows(IFXException.class, () -> IFXDocumentHandler.read(is, true, null));
    }

    /**
     * Test case to verify that a valid XML document with schema validation is parsed successfully.
     */
    @Test
    void testReadValidDocumentWithSchemaValidation() throws IFXException {
        String xml = "<root xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"test.xsd\"><child>value</child></root>";
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        Map<String, String> validationProps = new HashMap<>();
        validationProps.put("http://www.w3.org/2001/XMLSchema-instance schemaLocation", "test.xsd");
        Document doc = IFXDocumentHandler.read(is, true, validationProps);
        assertNotNull(doc);
    }

    /**
     * Test case to verify that an invalid XML document with schema validation throws an exception.
     */
    @Test
    void testReadInvalidDocumentWithSchemaValidation() {
        String xml = "<root xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"test.xsd\"><child>value</invalid></root>";
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        Map<String, String> validationProps = new HashMap<>();
        validationProps.put("http://www.w3.org/2001/XMLSchema-instance schemaLocation", "test.xsd");
        assertThrows(IFXException.class, () -> IFXDocumentHandler.read(is, true, validationProps));
    }

    /**
     * Test case to verify that an invalid XML document with schema validation throws a SAXParseException.
     */
    @Test
    void testReadInvalidDocumentWithSchemaValidationThrowsSAXParseException() {
        String xml = "<root xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"test.xsd\"><child>value</invalid></root>";
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        Map<String, String> validationProps = new HashMap<>();
        validationProps.put("http://www.w3.org/2001/XMLSchema-instance schemaLocation", "test.xsd");
        assertThrows(SAXParseException.class, () -> IFXDocumentHandler.read(is, true, validationProps));
    }

    /**
     * Test case to verify that a valid XML document with DTD validation is parsed successfully.
     */
    @Test
    void testReadValidDocumentWithDTDValidation() throws IFXException {
        String xml = "<!DOCTYPE root SYSTEM \"test.dtd\"><root><child>value</child></root>";
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        Map<String, String> validationProps = new HashMap<>();
        validationProps.put("http://apache.org/xml/features/nonvalidating/load-external-dtd", "true");
        Document doc = IFXDocumentHandler.read(is, true, validationProps);
        assertNotNull(doc);
    }

    /**
     * Test case to verify that an invalid XML document with DTD validation throws an exception.
     */
    @Test
    void testReadInvalidDocumentWithDTDValidation() {
        String xml = "<!DOCTYPE root SYSTEM \"test.dtd\"><root><child>value</invalid></root>";
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        Map<String, String> validationProps = new HashMap<>();
        validationProps.put("http://apache.org/xml/features/nonvalidating/load-external-dtd", "true");
        assertThrows(IFXException.class, () -> IFXDocumentHandler.read(is, true, validationProps));
    }

    /**
     * Test case to verify that an invalid XML document with DTD validation throws a SAXParseException.
     */
    @Test
    void testReadInvalidDocumentWithDTDValidationThrowsSAXParseException() {
        String xml = "<!DOCTYPE root SYSTEM \"test.dtd\"><root><child>value</invalid></root>";
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        Map<String, String> validationProps = new HashMap<>();
        validationProps.put("http://apache.org/xml/features/nonvalidating/load-external-dtd", "true");
        assertThrows(SAXParseException.class, () -> IFXDocumentHandler.read(is, true, validationProps));
    }

    /**
     * Test case to verify that a valid XML document with external entities is parsed successfully.
     */
    @Test
    void testReadValidDocumentWithExternalEntities() throws IFXException {
        String xml = "<!DOCTYPE root [<!ENTITY ext SYSTEM \"test.txt\">]><root><child>&ext;</child></root>";
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        Map<String, String> validationProps = new HashMap<>();
        validationProps.put("http://apache.org/xml/features/nonvalidating/load-external-dtd", "true");
        Document doc = IFXDocumentHandler.read(is, true, validationProps);
        assertNotNull(doc);
    }

    /**
     * Test case to verify that an invalid XML document with external entities throws an exception.
     */
    @Test
    void testReadInvalidDocumentWithExternalEntities() {
        String xml = "<!DOCTYPE root [<!ENTITY ext SYSTEM \"test.txt\">]><root><child>&ext;</invalid></root>";
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        Map<String, String> validationProps = new HashMap<>();
        validationProps.put("http://apache.org/xml/features/nonvalidating/load-external-dtd", "true");
        assertThrows(IFXException.class, () -> IFXDocumentHandler.read(is, true, validationProps));
    }

    /**
     * Test case to verify that an invalid XML document with external entities throws a SAXParseException.
     */
    @Test
    void testReadInvalidDocumentWithExternalEntitiesThrowsSAXParseException() {
        String xml = "<!DOCTYPE root [<!ENTITY ext SYSTEM \"test.txt\">]><root><child>&ext;</invalid></root>";
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        Map<String, String> validationProps = new HashMap<>();
        validationProps.put("http://apache.org/xml/features/nonvalidating/load-external-dtd", "true");
        assertThrows(SAXParseException.class, () -> IFXDocumentHandler.read(is, true, validationProps));
    }
}