// Source code for _AvailableJobs_1Test.java

package mygrid.web;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link _AvailableJobs}.
 * It contains ten unit test cases for the {@link _AvailableJobs#getTypeDesc()} method.
 */
class _AvailableJobs_1Test {

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object is not null.
     */
    @Test
    void testGetTypeDescNotNull() {
        assertNotNull(_AvailableJobs.getTypeDesc());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct XML type.
     */
    @Test
    void testGetTypeDescXmlType() {
        assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", ">AvailableJobs"), _AvailableJobs.getTypeDesc().getXmlType());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct element name.
     */
    @Test
    void testGetTypeDescElementName() {
        assertEquals("_AvailableJobs", _AvailableJobs.getTypeDesc().getElementName());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct namespace URI.
     */
    @Test
    void testGetTypeDescNamespaceURI() {
        assertEquals("http://tempuri.org/", _AvailableJobs.getTypeDesc().getXmlType().getNamespaceURI());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct namespace prefix.
     */
    @Test
    void testGetTypeDescNamespacePrefix() {
        assertEquals("", _AvailableJobs.getTypeDesc().getXmlType().getPrefix());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct type class.
     */
    @Test
    void testGetTypeDescTypeClass() {
        assertEquals(_AvailableJobs.class, _AvailableJobs.getTypeDesc().getTypeClass());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct serializer.
     */
    @Test
    void testGetTypeDescSerializer() {
        assertNotNull(_AvailableJobs.getTypeDesc().getSerializer(null, null, null));
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object has the correct deserializer.
     */
    @Test
    void testGetTypeDescDeserializer() {
        assertNotNull(_AvailableJobs.getTypeDesc().getDeserializer(null, null, null));
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object is the same object every time.
     */
    @Test
    void testGetTypeDescSameObject() {
        assertSame(_AvailableJobs.getTypeDesc(), _AvailableJobs.getTypeDesc());
    }

    /**
     * Test case for getTypeDesc() method.
     * It checks if the returned TypeDesc object is not affected by serialization.
     */
    @Test
    void testGetTypeDescNotAffectedBySerialization() {
        org.apache.axis.encoding.SerializationContext context = new org.apache.axis.encoding.SerializationContext(null);
        context.setWriteXMLType(null);
        org.apache.axis.description.TypeDesc originalTypeDesc = _AvailableJobs.getTypeDesc();
        originalTypeDesc.serialize(context);
        assertSame(originalTypeDesc, _AvailableJobs.getTypeDesc());
    }
}