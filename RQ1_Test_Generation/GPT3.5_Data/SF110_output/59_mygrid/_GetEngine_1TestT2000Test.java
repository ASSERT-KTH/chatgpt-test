// Source code for _GetEngine_1Test.java

package mygrid.web;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link _GetEngine}.
 * It contains ten unit test cases for the {@link _GetEngine#getTypeDesc()} method.
 */
class _GetEngine_1Test {

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object is not null.
     */
    @Test
    void testGetTypeDescNotNull() {
        assertNotNull(_GetEngine.getTypeDesc());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct XML type.
     */
    @Test
    void testGetTypeDescXmlType() {
        assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", ">GetEngine"), _GetEngine.getTypeDesc().getXmlType());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct Java type.
     */
    @Test
    void testGetTypeDescJavaType() {
        assertEquals(_GetEngine.class, _GetEngine.getTypeDesc().getJavaType());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct serializer.
     */
    @Test
    void testGetTypeDescSerializer() {
        assertNotNull(_GetEngine.getTypeDesc().getSerializer(null, _GetEngine.class, new javax.xml.namespace.QName("http://tempuri.org/", ">GetEngine")));
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct deserializer.
     */
    @Test
    void testGetTypeDescDeserializer() {
        assertNotNull(_GetEngine.getTypeDesc().getDeserializer(null, _GetEngine.class, new javax.xml.namespace.QName("http://tempuri.org/", ">GetEngine")));
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct element name.
     */
    @Test
    void testGetTypeDescElementName() {
        assertEquals(">GetEngine", _GetEngine.getTypeDesc().getElementName());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct namespace URI.
     */
    @Test
    void testGetTypeDescNamespaceURI() {
        assertEquals("http://tempuri.org/", _GetEngine.getTypeDesc().getXmlType().getNamespaceURI());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct namespace prefix.
     */
    @Test
    void testGetTypeDescNamespacePrefix() {
        assertEquals("", _GetEngine.getTypeDesc().getXmlType().getPrefix());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct flags.
     */
    @Test
    void testGetTypeDescFlags() {
        assertEquals(0, _GetEngine.getTypeDesc().getFlags());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct base type.
     */
    @Test
    void testGetTypeDescBaseType() {
        assertNull(_GetEngine.getTypeDesc().getBaseType());
    }
}