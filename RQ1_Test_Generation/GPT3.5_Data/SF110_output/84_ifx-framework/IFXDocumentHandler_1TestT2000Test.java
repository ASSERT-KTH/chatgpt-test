// IFXDocumentHandler_1Test.java
package org.sourceforge.ifx.utils;

import org.jdom.Document;
import org.junit.jupiter.api.Test;
import org.sourceforge.ifx.basetypes.IFXObject;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link IFXDocumentHandler}.
 * It contains ten unit test cases for the {@link IFXDocumentHandler#parse(Document)} method.
 */
class IFXDocumentHandler_1Test {

    @Test
    void testParseWithValidDocument() throws IFXException {
        // given
        IFXObject expected = new IFXObject();
        Document doc = new Document(expected.toElement());

        // when
        IFXObject actual = IFXDocumentHandler.parse(doc);

        // then
        assertEquals(expected, actual);
    }

    @Test
    void testParseWithNullDocument() {
        // given
        Document doc = null;

        // when, then
        assertThrows(IFXException.class, () -> IFXDocumentHandler.parse(doc));
    }

    @Test
    void testParseWithInvalidRootElement() {
        // given
        Document doc = new Document(new Element("invalid"));

        // when, then
        assertThrows(IFXException.class, () -> IFXDocumentHandler.parse(doc));
    }

    @Test
    void testParseWithInvalidChildElement() {
        // given
        IFXObject expected = new IFXObject();
        Document doc = new Document(expected.toElement().addContent(new Element("invalid")));

        // when, then
        assertThrows(IFXException.class, () -> IFXDocumentHandler.parse(doc));
    }

    @Test
    void testParseWithInvalidAttribute() {
        // given
        IFXObject expected = new IFXObject();
        Document doc = new Document(expected.toElement().setAttribute("invalid", "value"));

        // when, then
        assertThrows(IFXException.class, () -> IFXDocumentHandler.parse(doc));
    }

    @Test
    void testParseWithInvalidNamespace() {
        // given
        IFXObject expected = new IFXObject();
        Document doc = new Document(expected.toElement().setNamespace(org.jdom.Namespace.getNamespace("invalid")));

        // when, then
        assertThrows(IFXException.class, () -> IFXDocumentHandler.parse(doc));
    }

    @Test
    void testParseWithInvalidTextContent() {
        // given
        IFXObject expected = new IFXObject();
        Document doc = new Document(expected.toElement().setText("invalid"));

        // when, then
        assertThrows(IFXException.class, () -> IFXDocumentHandler.parse(doc));
    }

    @Test
    void testParseWithInvalidCDATAContent() {
        // given
        IFXObject expected = new IFXObject();
        Document doc = new Document(expected.toElement().addContent(new org.jdom.CDATA("invalid")));

        // when, then
        assertThrows(IFXException.class, () -> IFXDocumentHandler.parse(doc));
    }

    @Test
    void testParseWithInvalidComment() {
        // given
        IFXObject expected = new IFXObject();
        Document doc = new Document(expected.toElement().addContent(new org.jdom.Comment("invalid")));

        // when, then
        assertThrows(IFXException.class, () -> IFXDocumentHandler.parse(doc));
    }

    @Test
    void testParseWithInvalidProcessingInstruction() {
        // given
        IFXObject expected = new IFXObject();
        Document doc = new Document(expected.toElement().addContent(new org.jdom.ProcessingInstruction("invalid", "data")));

        // when, then
        assertThrows(IFXException.class, () -> IFXDocumentHandler.parse(doc));
    }
}