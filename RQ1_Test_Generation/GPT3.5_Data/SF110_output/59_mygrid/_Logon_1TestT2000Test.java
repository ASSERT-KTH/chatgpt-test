// _Logon_1Test.java
package mygrid.web;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link _Logon}.
 * It contains ten unit test cases for the {@link _Logon#getTypeDesc()} method.
 */
class _Logon_1Test {

    /**
     * Test case for getTypeDesc method.
     * Test if the returned TypeDesc object is not null.
     */
    @Test
    void testGetTypeDescNotNull() {
        assertNotNull(_Logon.getTypeDesc());
    }

    /**
     * Test case for getTypeDesc method.
     * Test if the returned TypeDesc object has the correct XML type.
     */
    @Test
    void testGetTypeDescXmlType() {
        assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", ">Logon"), _Logon.getTypeDesc().getXmlType());
    }

    /**
     * Test case for getTypeDesc method.
     * Test if the returned TypeDesc object has the correct element count.
     */
    @Test
    void testGetTypeDescElementCount() {
        assertEquals(3, _Logon.getTypeDesc().getElementCount());
    }

    /**
     * Test case for getTypeDesc method.
     * Test if the returned TypeDesc object has the correct element names.
     */
    @Test
    void testGetTypeDescElementNames() {
        assertEquals("clusterUrl", _Logon.getTypeDesc().getElementDesc(0).getXmlName().getLocalPart());
        assertEquals("user", _Logon.getTypeDesc().getElementDesc(1).getXmlName().getLocalPart());
        assertEquals("password", _Logon.getTypeDesc().getElementDesc(2).getXmlName().getLocalPart());
    }

    /**
     * Test case for getTypeDesc method.
     * Test if the returned TypeDesc object has the correct element types.
     */
    @Test
    void testGetTypeDescElementTypes() {
        assertEquals(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), _Logon.getTypeDesc().getElementDesc(0).getTypeQName());
        assertEquals(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), _Logon.getTypeDesc().getElementDesc(1).getTypeQName());
        assertEquals(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), _Logon.getTypeDesc().getElementDesc(2).getTypeQName());
    }

    /**
     * Test case for getTypeDesc method.
     * Test if the returned TypeDesc object has the correct element minOccurs values.
     */
    @Test
    void testGetTypeDescElementMinOccurs() {
        assertEquals(0, _Logon.getTypeDesc().getElementDesc(0).getMinOccurs());
        assertEquals(0, _Logon.getTypeDesc().getElementDesc(1).getMinOccurs());
        assertEquals(0, _Logon.getTypeDesc().getElementDesc(2).getMinOccurs());
    }

    /**
     * Test case for getTypeDesc method.
     * Test if the returned TypeDesc object has the correct element maxOccurs values.
     */
    @Test
    void testGetTypeDescElementMaxOccurs() {
        assertEquals(1, _Logon.getTypeDesc().getElementDesc(0).getMaxOccurs());
        assertEquals(1, _Logon.getTypeDesc().getElementDesc(1).getMaxOccurs());
        assertEquals(1, _Logon.getTypeDesc().getElementDesc(2).getMaxOccurs());
    }

    /**
     * Test case for getTypeDesc method.
     * Test if the returned TypeDesc object has the correct element nillable values.
     */
    @Test
    void testGetTypeDescElementNillable() {
        assertFalse(_Logon.getTypeDesc().getElementDesc(0).isNillable());
        assertFalse(_Logon.getTypeDesc().getElementDesc(1).isNillable());
        assertFalse(_Logon.getTypeDesc().getElementDesc(2).isNillable());
    }

    /**
     * Test case for getTypeDesc method.
     * Test if the returned TypeDesc object has the correct element itemQName values.
     */
    @Test
    void testGetTypeDescElementItemQName() {
        assertNull(_Logon.getTypeDesc().getElementDesc(0).getItemQName());
        assertNull(_Logon.getTypeDesc().getElementDesc(1).getItemQName());
        assertNull(_Logon.getTypeDesc().getElementDesc(2).getItemQName());
    }

    /**
     * Test case for getTypeDesc method.
     * Test if the returned TypeDesc object has the correct element itemType values.
     */
    @Test
    void testGetTypeDescElementItemType() {
        assertNull(_Logon.getTypeDesc().getElementDesc(0).getItemType());
        assertNull(_Logon.getTypeDesc().getElementDesc(1).getItemType());
        assertNull(_Logon.getTypeDesc().getElementDesc(2).getItemType());
    }
}