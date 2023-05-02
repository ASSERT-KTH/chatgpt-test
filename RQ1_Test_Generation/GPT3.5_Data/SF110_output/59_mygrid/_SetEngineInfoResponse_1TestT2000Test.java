// Source code for _SetEngineInfoResponse_1Test.java

package mygrid.web;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link _SetEngineInfoResponse}.
 * It contains ten unit test cases for the {@link _SetEngineInfoResponse#getTypeDesc()} method.
 */
class _SetEngineInfoResponse_1Test {

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object is not null.
     */
    @Test
    void testGetTypeDescNotNull() {
        assertNotNull(_SetEngineInfoResponse.getTypeDesc());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct XML type.
     */
    @Test
    void testGetTypeDescXmlType() {
        assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", ">SetEngineInfoResponse"), _SetEngineInfoResponse.getTypeDesc().getXmlType());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct element name.
     */
    @Test
    void testGetTypeDescElementName() {
        assertEquals("_SetEngineInfoResponse", _SetEngineInfoResponse.getTypeDesc().getElementName());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct namespace URI.
     */
    @Test
    void testGetTypeDescNamespaceURI() {
        assertEquals("http://tempuri.org/", _SetEngineInfoResponse.getTypeDesc().getXmlType().getNamespaceURI());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct namespace prefix.
     */
    @Test
    void testGetTypeDescNamespacePrefix() {
        assertEquals("", _SetEngineInfoResponse.getTypeDesc().getXmlType().getPrefix());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct type class.
     */
    @Test
    void testGetTypeDescTypeClass() {
        assertEquals(_SetEngineInfoResponse.class, _SetEngineInfoResponse.getTypeDesc().getTypeClass());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct serializer.
     */
    @Test
    void testGetTypeDescSerializer() {
        assertNotNull(_SetEngineInfoResponse.getTypeDesc().getSerializer(null, null, null));
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct deserializer.
     */
    @Test
    void testGetTypeDescDeserializer() {
        assertNotNull(_SetEngineInfoResponse.getTypeDesc().getDeserializer(null, null, null));
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object is the same object every time.
     */
    @Test
    void testGetTypeDescSameObject() {
        assertSame(_SetEngineInfoResponse.getTypeDesc(), _SetEngineInfoResponse.getTypeDesc());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object is not affected by changes to its properties.
     */
    @Test
    void testGetTypeDescImmutable() {
        org.apache.axis.description.TypeDesc typeDesc = _SetEngineInfoResponse.getTypeDesc();
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "NewXmlType"));
        typeDesc.setElementName(new javax.xml.namespace.QName("http://tempuri.org/", "NewElementName"));
        typeDesc.setNamespaceURI("http://newnamespaceuri.org/");
        typeDesc.setNamespacePrefix("newprefix");
        typeDesc.setTypeClass(java.lang.String.class);
        typeDesc.setSerializer(null);
        typeDesc.setDeserializer(null);
        assertNotEquals(typeDesc, _SetEngineInfoResponse.getTypeDesc());
    }
}