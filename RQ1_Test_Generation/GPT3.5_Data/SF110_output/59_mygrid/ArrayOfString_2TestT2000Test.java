// ArrayOfString_2Test.java
package mygrid.web;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ArrayOfString}.
 * It contains ten unit test cases for the {@link ArrayOfString#getTypeDesc()} method.
 */
class ArrayOfString_2Test {

    /**
     * Test method for {@link ArrayOfString#getTypeDesc()}.
     */
    @Test
    void testGetTypeDesc() {
        // Test case 1
        org.apache.axis.description.TypeDesc typeDesc = ArrayOfString.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("ArrayOfString", typeDesc.getXmlType().getLocalPart());

        // Test case 2
        org.apache.axis.description.ElementDesc[] elemFields = typeDesc.getElementDescs();
        assertNotNull(elemFields);
        assertEquals(1, elemFields.length);

        // Test case 3
        org.apache.axis.description.ElementDesc elemField = elemFields[0];
        assertNotNull(elemField);
        assertEquals("string", elemField.getFieldName());
        assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", "string"), elemField.getXmlName());
        assertEquals(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), elemField.getXmlType());
        assertEquals(0, elemField.getMinOccurs());

        // Test case 4
        ArrayOfString array = new ArrayOfString();
        assertNull(array.getString());

        // Test case 5
        String[] strings = new String[]{"string1", "string2", "string3"};
        array.setString(strings);
        assertArrayEquals(strings, array.getString());

        // Test case 6
        String string = array.getString(1);
        assertEquals("string2", string);

        // Test case 7
        array.setString(1, "newString");
        assertEquals("newString", array.getString(1));

        // Test case 8
        boolean equals = array.equals(null);
        assertFalse(equals);

        // Test case 9
        equals = array.equals(array);
        assertTrue(equals);

        // Test case 10
        int hashCode = array.hashCode();
        assertEquals(3, hashCode);
    }
}