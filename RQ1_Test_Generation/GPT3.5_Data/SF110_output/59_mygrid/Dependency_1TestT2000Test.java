// Source code for Dependency_1Test.java

package mygrid.web;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Dependency}.
 * It contains ten unit test cases for the {@link Dependency#getTypeDesc()} method.
 */
class Dependency_1Test {

    /**
     * Test case for {@link Dependency#getTypeDesc()}.
     * Verifies that the returned TypeDesc object is not null.
     */
    @Test
    void testGetTypeDescNotNull() {
        assertNotNull(Dependency.getTypeDesc());
    }

    /**
     * Test case for {@link Dependency#getTypeDesc()}.
     * Verifies that the returned TypeDesc object has the correct XML type.
     */
    @Test
    void testGetTypeDescXmlType() {
        assertEquals("Dependency", Dependency.getTypeDesc().getXmlType().getLocalPart());
    }

    /**
     * Test case for {@link Dependency#getTypeDesc()}.
     * Verifies that the returned TypeDesc object has the correct namespace.
     */
    @Test
    void testGetTypeDescNamespace() {
        assertEquals("http://tempuri.org/", Dependency.getTypeDesc().getXmlType().getNamespaceURI());
    }

    /**
     * Test case for {@link Dependency#getTypeDesc()}.
     * Verifies that the returned TypeDesc object has the correct number of fields.
     */
    @Test
    void testGetTypeDescFields() {
        assertEquals(2, Dependency.getTypeDesc().getFieldCount());
    }

    /**
     * Test case for {@link Dependency#getTypeDesc()}.
     * Verifies that the returned TypeDesc object has the correct field names.
     */
    @Test
    void testGetTypeDescFieldNames() {
        assertEquals("Id", Dependency.getTypeDesc().getFieldNames()[0]);
        assertEquals("Name", Dependency.getTypeDesc().getFieldNames()[1]);
    }

    /**
     * Test case for {@link Dependency#getTypeDesc()}.
     * Verifies that the returned TypeDesc object has the correct field types.
     */
    @Test
    void testGetTypeDescFieldTypes() {
        assertEquals("string", Dependency.getTypeDesc().getFieldTypes()[0].getLocalPart());
        assertEquals("string", Dependency.getTypeDesc().getFieldTypes()[1].getLocalPart());
    }

    /**
     * Test case for {@link Dependency#getTypeDesc()}.
     * Verifies that the returned TypeDesc object has the correct field minOccurs values.
     */
    @Test
    void testGetTypeDescFieldMinOccurs() {
        assertEquals(0, Dependency.getTypeDesc().getFieldMinOccurs()[0]);
        assertEquals(0, Dependency.getTypeDesc().getFieldMinOccurs()[1]);
    }

    /**
     * Test case for {@link Dependency#getTypeDesc()}.
     * Verifies that the returned TypeDesc object has the correct field maxOccurs values.
     */
    @Test
    void testGetTypeDescFieldMaxOccurs() {
        assertEquals(1, Dependency.getTypeDesc().getFieldMaxOccurs()[0]);
        assertEquals(1, Dependency.getTypeDesc().getFieldMaxOccurs()[1]);
    }

    /**
     * Test case for {@link Dependency#getTypeDesc()}.
     * Verifies that the returned TypeDesc object has the correct field descriptions.
     */
    @Test
    void testGetTypeDescFieldDescriptions() {
        assertEquals("Id", Dependency.getTypeDesc().getFieldDescs()[0].getName());
        assertEquals("Name", Dependency.getTypeDesc().getFieldDescs()[1].getName());
    }
}