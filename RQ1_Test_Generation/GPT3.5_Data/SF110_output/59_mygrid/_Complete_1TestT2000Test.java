// Source code for _Complete_1Test.java

package mygrid.web;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link _Complete}.
 * It contains ten unit test cases for the {@link _Complete#getTypeDesc()} method.
 */
class _Complete_1Test {

    /**
     * Test case to check if the type descriptor is not null.
     */
    @Test
    void testGetTypeDescNotNull() {
        assertNotNull(_Complete.getTypeDesc());
    }

    /**
     * Test case to check if the type descriptor has the correct XML type.
     */
    @Test
    void testGetTypeDescXmlType() {
        assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", ">Complete"), _Complete.getTypeDesc().getXmlType());
    }

    /**
     * Test case to check if the type descriptor has the correct element name.
     */
    @Test
    void testGetTypeDescElementName() {
        assertEquals("_Complete", _Complete.getTypeDesc().getElementName());
    }

    /**
     * Test case to check if the type descriptor has the correct namespace URI.
     */
    @Test
    void testGetTypeDescNamespaceURI() {
        assertEquals("http://tempuri.org/", _Complete.getTypeDesc().getXmlType().getNamespaceURI());
    }

    /**
     * Test case to check if the type descriptor has the correct namespace prefix.
     */
    @Test
    void testGetTypeDescNamespacePrefix() {
        assertEquals("", _Complete.getTypeDesc().getXmlType().getPrefix());
    }

    /**
     * Test case to check if the type descriptor has the correct type class.
     */
    @Test
    void testGetTypeDescTypeClass() {
        assertEquals(_Complete.class, _Complete.getTypeDesc().getTypeClass());
    }

    /**
     * Test case to check if the type descriptor has the correct element description.
     */
    @Test
    void testGetTypeDescElementDescription() {
        assertEquals("job", _Complete.getTypeDesc().getElementDescription("job").getName());
    }

    /**
     * Test case to check if the type descriptor has the correct element type.
     */
    @Test
    void testGetTypeDescElementType() {
        assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", "Job"), _Complete.getTypeDesc().getElementDescription("job").getTypeQName());
    }

    /**
     * Test case to check if the type descriptor has the correct element minOccurs.
     */
    @Test
    void testGetTypeDescElementMinOccurs() {
        assertEquals(0, _Complete.getTypeDesc().getElementDescription("job").getMinOccurs());
    }

    /**
     * Test case to check if the type descriptor has the correct element maxOccurs.
     */
    @Test
    void testGetTypeDescElementMaxOccurs() {
        assertEquals(1, _Complete.getTypeDesc().getElementDescription("job").getMaxOccurs());
    }
}