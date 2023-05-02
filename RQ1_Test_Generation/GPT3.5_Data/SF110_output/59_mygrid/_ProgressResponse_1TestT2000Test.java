// Source code for _ProgressResponse_1Test.java

package mygrid.web;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link _ProgressResponse}.
 * It contains ten unit test cases for the {@link _ProgressResponse#getTypeDesc()} method.
 */
class _ProgressResponse_1Test {

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object is not null.
     */
    @Test
    void testGetTypeDescNotNull() {
        assertNotNull(_ProgressResponse.getTypeDesc());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct XML type.
     */
    @Test
    void testGetTypeDescXmlType() {
        assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", ">ProgressResponse"), _ProgressResponse.getTypeDesc().getXmlType());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct element name.
     */
    @Test
    void testGetTypeDescElementName() {
        assertEquals("_ProgressResponse", _ProgressResponse.getTypeDesc().getElementName());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct namespace URI.
     */
    @Test
    void testGetTypeDescNamespaceURI() {
        assertEquals("http://tempuri.org/", _ProgressResponse.getTypeDesc().getXmlType().getNamespaceURI());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct namespace prefix.
     */
    @Test
    void testGetTypeDescNamespacePrefix() {
        assertEquals("", _ProgressResponse.getTypeDesc().getXmlType().getPrefix());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct type class.
     */
    @Test
    void testGetTypeDescTypeClass() {
        assertEquals(_ProgressResponse.class, _ProgressResponse.getTypeDesc().getTypeClass());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct serializer.
     */
    @Test
    void testGetTypeDescSerializer() {
        assertNotNull(_ProgressResponse.getTypeDesc().getSerializer(null, null, null));
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct deserializer.
     */
    @Test
    void testGetTypeDescDeserializer() {
        assertNotNull(_ProgressResponse.getTypeDesc().getDeserializer(null, null, null));
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object is the same object every time.
     */
    @Test
    void testGetTypeDescSameObject() {
        assertSame(_ProgressResponse.getTypeDesc(), _ProgressResponse.getTypeDesc());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object is not affected by serialization.
     */
    @Test
    void testGetTypeDescNotAffectedBySerialization() {
        org.apache.axis.encoding.SerializationContext context = new org.apache.axis.encoding.SerializationContext(null);
        context.setWriteXMLType(null);
        org.apache.axis.description.TypeDesc serializedTypeDesc = (org.apache.axis.description.TypeDesc) context.serialize(_ProgressResponse.getTypeDesc());
        assertNotSame(_ProgressResponse.getTypeDesc(), serializedTypeDesc);
        assertEquals(_ProgressResponse.getTypeDesc().getXmlType(), serializedTypeDesc.getXmlType());
        assertEquals(_ProgressResponse.getTypeDesc().getElementName(), serializedTypeDesc.getElementName());
        assertEquals(_ProgressResponse.getTypeDesc().getXmlType().getNamespaceURI(), serializedTypeDesc.getXmlType().getNamespaceURI());
        assertEquals(_ProgressResponse.getTypeDesc().getXmlType().getPrefix(), serializedTypeDesc.getXmlType().getPrefix());
        assertEquals(_ProgressResponse.getTypeDesc().getTypeClass(), serializedTypeDesc.getTypeClass());
    }
}