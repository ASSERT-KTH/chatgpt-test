// ContextElement_1Test.java
package mygrid.web;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ContextElement}.
 * It contains ten unit test cases for the {@link ContextElement#getTypeDesc()} method.
 */
class ContextElement_1Test {

    @Test
    void testGetTypeDesc() {
        // Test case 1
        org.apache.axis.description.TypeDesc typeDesc = ContextElement.getTypeDesc();
        assertNotNull(typeDesc);

        // Test case 2
        assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", "ContextElement"), typeDesc.getXmlType());

        // Test case 3
        org.apache.axis.description.ElementDesc[] elemFields = typeDesc.getElementDescs();
        assertEquals(2, elemFields.length);

        // Test case 4
        assertEquals("Name", elemFields[0].getXmlName().getLocalPart());
        assertEquals("http://tempuri.org/", elemFields[0].getXmlName().getNamespaceURI());
        assertEquals("string", elemFields[0].getType().getName());

        // Test case 5
        assertEquals("Content", elemFields[1].getXmlName().getLocalPart());
        assertEquals("http://tempuri.org/", elemFields[1].getXmlName().getNamespaceURI());
        assertEquals("string", elemFields[1].getType().getName());

        // Test case 6
        assertEquals(0, elemFields[0].getMinOccurs());

        // Test case 7
        assertEquals(0, elemFields[1].getMinOccurs());

        // Test case 8
        assertEquals("name", elemFields[0].getFieldName());

        // Test case 9
        assertEquals("content", elemFields[1].getFieldName());

        // Test case 10
        assertEquals(ContextElement.class, typeDesc.getJavaType());
    }
}