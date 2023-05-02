// Engine_1Test.java
package mygrid.web;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Engine}.
 * It contains ten unit test cases for the {@link Engine#getTypeDesc()} method.
 */
class Engine_1Test {
    
    @Test
    void testGetTypeDesc() {
        // Test case 1
        org.apache.axis.description.TypeDesc typeDesc = Engine.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("http://tempuri.org/", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("Engine", typeDesc.getXmlType().getLocalPart());
        assertEquals(5, typeDesc.getFieldCount());
        
        // Test case 2
        org.apache.axis.description.ElementDesc elemField = typeDesc.getElementDesc("id");
        assertNotNull(elemField);
        assertEquals("http://tempuri.org/", elemField.getXmlName().getNamespaceURI());
        assertEquals("Id", elemField.getXmlName().getLocalPart());
        assertEquals("string", elemField.getType().getName());
        assertEquals(0, elemField.getMinOccurs());
        
        // Test case 3
        elemField = typeDesc.getElementDesc("name");
        assertNotNull(elemField);
        assertEquals("http://tempuri.org/", elemField.getXmlName().getNamespaceURI());
        assertEquals("Name", elemField.getXmlName().getLocalPart());
        assertEquals("string", elemField.getType().getName());
        assertEquals(0, elemField.getMinOccurs());
        
        // Test case 4
        elemField = typeDesc.getElementDesc("RAM");
        assertNotNull(elemField);
        assertEquals("http://tempuri.org/", elemField.getXmlName().getNamespaceURI());
        assertEquals("RAM", elemField.getXmlName().getLocalPart());
        assertEquals("float", elemField.getType().getName());
        assertEquals(1, elemField.getMinOccurs());
        
        // Test case 5
        elemField = typeDesc.getElementDesc("CPU");
        assertNotNull(elemField);
        assertEquals("http://tempuri.org/", elemField.getXmlName().getNamespaceURI());
        assertEquals("CPU", elemField.getXmlName().getLocalPart());
        assertEquals("float", elemField.getType().getName());
        assertEquals(1, elemField.getMinOccurs());
        
        // Test case 6
        elemField = typeDesc.getElementDesc("OS");
        assertNotNull(elemField);
        assertEquals("http://tempuri.org/", elemField.getXmlName().getNamespaceURI());
        assertEquals("OS", elemField.getXmlName().getLocalPart());
        assertEquals("string", elemField.getType().getName());
        assertEquals(0, elemField.getMinOccurs());
    }
}