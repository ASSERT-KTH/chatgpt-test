// Source code for Discriminator_1Test.java

package mygrid.web;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Discriminator}.
 * It contains ten unit test cases for the {@link Discriminator#getTypeDesc()} method.
 */
class Discriminator_1Test {

    /**
     * Test case for getTypeDesc() method.
     * Test if the type description object is not null.
     */
    @Test
    void testGetTypeDescNotNull() {
        assertNotNull(Discriminator.getTypeDesc());
    }

    /**
     * Test case for getTypeDesc() method.
     * Test if the type description object has the correct XML type.
     */
    @Test
    void testGetTypeDescXmlType() {
        assertEquals("http://tempuri.org/", Discriminator.getTypeDesc().getXmlType().getNamespaceURI());
        assertEquals("Discriminator", Discriminator.getTypeDesc().getXmlType().getLocalPart());
    }

    /**
     * Test case for getTypeDesc() method.
     * Test if the type description object has the correct element fields.
     */
    @Test
    void testGetTypeDescElementFields() {
        assertEquals(5, Discriminator.getTypeDesc().getElementDescs().length);

        assertEquals("AllowedEngines", Discriminator.getTypeDesc().getElementDescs()[0].getXmlName().getLocalPart());
        assertEquals("ArrayOfString", Discriminator.getTypeDesc().getElementDescs()[0].getTypeQName().getLocalPart());

        assertEquals("Processor", Discriminator.getTypeDesc().getElementDescs()[1].getXmlName().getLocalPart());
        assertEquals("Processor", Discriminator.getTypeDesc().getElementDescs()[1].getTypeQName().getLocalPart());

        assertEquals("CPU", Discriminator.getTypeDesc().getElementDescs()[2].getXmlName().getLocalPart());
        assertEquals("float", Discriminator.getTypeDesc().getElementDescs()[2].getTypeQName().getLocalPart());

        assertEquals("RAM", Discriminator.getTypeDesc().getElementDescs()[3].getXmlName().getLocalPart());
        assertEquals("float", Discriminator.getTypeDesc().getElementDescs()[3].getTypeQName().getLocalPart());

        assertEquals("OS", Discriminator.getTypeDesc().getElementDescs()[4].getXmlName().getLocalPart());
        assertEquals("string", Discriminator.getTypeDesc().getElementDescs()[4].getTypeQName().getLocalPart());
    }

    /**
     * Test case for getTypeDesc() method.
     * Test if the type description object has the correct field names.
     */
    @Test
    void testGetTypeDescFieldNames() {
        assertEquals("allowedEngines", Discriminator.getTypeDesc().getFieldDesc("allowedEngines").getFieldName());
        assertEquals("processor", Discriminator.getTypeDesc().getFieldDesc("processor").getFieldName());
        assertEquals("CPU", Discriminator.getTypeDesc().getFieldDesc("CPU").getFieldName());
        assertEquals("RAM", Discriminator.getTypeDesc().getFieldDesc("RAM").getFieldName());
        assertEquals("OS", Discriminator.getTypeDesc().getFieldDesc("OS").getFieldName());
    }

    /**
     * Test case for getTypeDesc() method.
     * Test if the type description object has the correct field types.
     */
    @Test
    void testGetTypeDescFieldTypes() {
        assertEquals(ArrayOfString.class, Discriminator.getTypeDesc().getFieldDesc("allowedEngines").getFieldType());
        assertEquals(Processor.class, Discriminator.getTypeDesc().getFieldDesc("processor").getFieldType());
        assertEquals(float.class, Discriminator.getTypeDesc().getFieldDesc("CPU").getFieldType());
        assertEquals(float.class, Discriminator.getTypeDesc().getFieldDesc("RAM").getFieldType());
        assertEquals(String.class, Discriminator.getTypeDesc().getFieldDesc("OS").getFieldType());
    }

    /**
     * Test case for getTypeDesc() method.
     * Test if the type description object has the correct field minOccurs values.
     */
    @Test
    void testGetTypeDescFieldMinOccurs() {
        assertEquals(0, Discriminator.getTypeDesc().getFieldDesc("allowedEngines").getMinOccurs());
        assertEquals(0, Discriminator.getTypeDesc().getFieldDesc("processor").getMinOccurs());
        assertEquals(1, Discriminator.getTypeDesc().getFieldDesc("CPU").getMinOccurs());
        assertEquals(1, Discriminator.getTypeDesc().getFieldDesc("RAM").getMinOccurs());
        assertEquals(0, Discriminator.getTypeDesc().getFieldDesc("OS").getMinOccurs());
    }

    /**
     * Test case for getTypeDesc() method.
     * Test if the type description object has the correct field maxOccurs values.
     */
    @Test
    void testGetTypeDescFieldMaxOccurs() {
        assertEquals(1, Discriminator.getTypeDesc().getFieldDesc("allowedEngines").getMaxOccurs());
        assertEquals(1, Discriminator.getTypeDesc().getFieldDesc("processor").getMaxOccurs());
        assertEquals(1, Discriminator.getTypeDesc().getFieldDesc("CPU").getMaxOccurs());
        assertEquals(1, Discriminator.getTypeDesc().getFieldDesc("RAM").getMaxOccurs());
        assertEquals(1, Discriminator.getTypeDesc().getFieldDesc("OS").getMaxOccurs());
    }

    /**
     * Test case for getTypeDesc() method.
     * Test if the type description object has the correct field nillable values.
     */
    @Test
    void testGetTypeDescFieldNillable() {
        assertFalse(Discriminator.getTypeDesc().getFieldDesc("allowedEngines").isNillable());
        assertFalse(Discriminator.getTypeDesc().getFieldDesc("processor").isNillable());
        assertFalse(Discriminator.getTypeDesc().getFieldDesc("CPU").isNillable());
        assertFalse(Discriminator.getTypeDesc().getFieldDesc("RAM").isNillable());
        assertTrue(Discriminator.getTypeDesc().getFieldDesc("OS").isNillable());
    }
}