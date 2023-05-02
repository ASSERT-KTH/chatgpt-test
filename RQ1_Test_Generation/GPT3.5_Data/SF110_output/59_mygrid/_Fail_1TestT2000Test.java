// _Fail_1Test.java
package mygrid.web;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link _Fail}.
 * It contains ten unit test cases for the {@link _Fail#getTypeDesc()} method.
 */
class _Fail_1Test {

    /**
     * Test case for getTypeDesc method.
     * It checks if the returned TypeDesc object is not null.
     */
    @Test
    void testGetTypeDescNotNull() {
        assertNotNull(_Fail.getTypeDesc());
    }

    /**
     * Test case for getTypeDesc method.
     * It checks if the returned TypeDesc object has the correct XML type.
     */
    @Test
    void testGetTypeDescXmlType() {
        assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", ">Fail"), _Fail.getTypeDesc().getXmlType());
    }

    /**
     * Test case for getTypeDesc method.
     * It checks if the returned TypeDesc object has the correct element name.
     */
    @Test
    void testGetTypeDescElementName() {
        assertEquals("_Fail", _Fail.getTypeDesc().getElementName());
    }

    /**
     * Test case for getTypeDesc method.
     * It checks if the returned TypeDesc object has the correct namespace URI.
     */
    @Test
    void testGetTypeDescNamespaceURI() {
        assertEquals("http://tempuri.org/", _Fail.getTypeDesc().getXmlType().getNamespaceURI());
    }

    /**
     * Test case for getTypeDesc method.
     * It checks if the returned TypeDesc object has the correct namespace prefix.
     */
    @Test
    void testGetTypeDescNamespacePrefix() {
        assertEquals("", _Fail.getTypeDesc().getXmlType().getPrefix());
    }

    /**
     * Test case for getTypeDesc method.
     * It checks if the returned TypeDesc object has the correct type class.
     */
    @Test
    void testGetTypeDescTypeClass() {
        assertEquals(_Fail.class, _Fail.getTypeDesc().getTypeClass());
    }

    /**
     * Test case for getTypeDesc method.
     * It checks if the returned TypeDesc object has the correct serializer class.
     */
    @Test
    void testGetTypeDescSerializerClass() {
        assertEquals(org.apache.axis.encoding.ser.BeanSerializer.class, _Fail.getTypeDesc().getSerializerClass());
    }

    /**
     * Test case for getTypeDesc method.
     * It checks if the returned TypeDesc object has the correct deserializer class.
     */
    @Test
    void testGetTypeDescDeserializerClass() {
        assertEquals(org.apache.axis.encoding.ser.BeanDeserializer.class, _Fail.getTypeDesc().getDeserializerClass());
    }

    /**
     * Test case for getTypeDesc method.
     * It checks if the returned TypeDesc object has the correct fields.
     */
    @Test
    void testGetTypeDescFields() {
        assertEquals(1, _Fail.getTypeDesc().getFields().length);
        assertEquals("job", _Fail.getTypeDesc().getFields()[0].getFieldName());
        assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", "job"), _Fail.getTypeDesc().getFields()[0].getXmlName());
        assertEquals(_Fail.class, _Fail.getTypeDesc().getFields()[0].getJavaType());
        assertEquals(0, _Fail.getTypeDesc().getFields()[0].getMinOccurs());
        assertEquals(1, _Fail.getTypeDesc().getFields()[0].getMaxOccurs());
    }

    /**
     * Test case for getTypeDesc method.
     * It checks if the returned TypeDesc object has the correct element description.
     */
    @Test
    void testGetTypeDescElementDescription() {
        assertEquals("job", _Fail.getTypeDesc().getElementDescription("_Fail"));
    }
}