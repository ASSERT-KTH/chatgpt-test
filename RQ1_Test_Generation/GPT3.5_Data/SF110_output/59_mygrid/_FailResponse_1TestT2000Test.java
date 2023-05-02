// Source code for _FailResponse_1Test.java

package mygrid.web;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link _FailResponse}.
 * It contains ten unit test cases for the {@link _FailResponse#getTypeDesc()} method.
 */
class _FailResponse_1Test {

    /**
     * Test case to check if getTypeDesc() returns a non-null TypeDesc object.
     */
    @Test
    void testGetTypeDescNotNull() {
        assertNotNull(_FailResponse.getTypeDesc());
    }

    /**
     * Test case to check if getTypeDesc() returns a TypeDesc object with the correct XML type.
     */
    @Test
    void testGetTypeDescXmlType() {
        assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", ">FailResponse"), _FailResponse.getTypeDesc().getXmlType());
    }

    /**
     * Test case to check if getTypeDesc() returns a TypeDesc object with the correct element name.
     */
    @Test
    void testGetTypeDescElementName() {
        assertEquals("_FailResponse", _FailResponse.getTypeDesc().getElementName());
    }

    /**
     * Test case to check if getTypeDesc() returns a TypeDesc object with the correct namespace URI.
     */
    @Test
    void testGetTypeDescNamespaceURI() {
        assertEquals("http://tempuri.org/", _FailResponse.getTypeDesc().getXmlType().getNamespaceURI());
    }

    /**
     * Test case to check if getTypeDesc() returns a TypeDesc object with the correct namespace prefix.
     */
    @Test
    void testGetTypeDescNamespacePrefix() {
        assertEquals("", _FailResponse.getTypeDesc().getXmlType().getPrefix());
    }

    /**
     * Test case to check if getTypeDesc() returns a TypeDesc object with the correct serializer.
     */
    @Test
    void testGetTypeDescSerializer() {
        assertNotNull(_FailResponse.getTypeDesc().getSerializer(null, _FailResponse.class, _FailResponse.getTypeDesc().getXmlType()));
    }

    /**
     * Test case to check if getTypeDesc() returns a TypeDesc object with the correct deserializer.
     */
    @Test
    void testGetTypeDescDeserializer() {
        assertNotNull(_FailResponse.getTypeDesc().getDeserializer(null, _FailResponse.class, _FailResponse.getTypeDesc().getXmlType()));
    }

    /**
     * Test case to check if getTypeDesc() returns the same TypeDesc object every time it is called.
     */
    @Test
    void testGetTypeDescSameObject() {
        assertSame(_FailResponse.getTypeDesc(), _FailResponse.getTypeDesc());
    }

    /**
     * Test case to check if getTypeDesc() returns a TypeDesc object with the correct type name.
     */
    @Test
    void testGetTypeDescTypeName() {
        assertEquals("_FailResponse", _FailResponse.getTypeDesc().getTypeName());
    }

    /**
     * Test case to check if getTypeDesc() returns a TypeDesc object with the correct type namespace URI.
     */
    @Test
    void testGetTypeDescTypeNamespaceURI() {
        assertEquals("http://tempuri.org/", _FailResponse.getTypeDesc().getTypeNamespace());
    }
}