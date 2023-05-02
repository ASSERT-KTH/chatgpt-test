// Test case for getTypeDesc() method
class _SetEngineInfo_1Test {

    @Test
    void testGetTypeDesc() {
        // Test case 1: getTypeDesc() should return a non-null TypeDesc object
        assertNotNull(_SetEngineInfo.getTypeDesc());

        // Test case 2: getTypeDesc() should return a TypeDesc object with the correct XML type name
        assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", ">SetEngineInfo"), _SetEngineInfo.getTypeDesc().getXmlType());

        // Test case 3: getTypeDesc() should return a TypeDesc object with the correct number of fields
        assertEquals(4, _SetEngineInfo.getTypeDesc().getFieldCount());

        // Test case 4: getTypeDesc() should return a TypeDesc object with the correct field names
        assertEquals("name", _SetEngineInfo.getTypeDesc().getFieldDesc("name").getFieldName());
        assertEquals("cpu", _SetEngineInfo.getTypeDesc().getFieldDesc("cpu").getFieldName());
        assertEquals("ram", _SetEngineInfo.getTypeDesc().getFieldDesc("ram").getFieldName());
        assertEquals("os", _SetEngineInfo.getTypeDesc().getFieldDesc("os").getFieldName());

        // Test case 5: getTypeDesc() should return a TypeDesc object with the correct field types
        assertEquals(org.apache.axis.description.FieldDesc.FIELD_TYPE_STRING, _SetEngineInfo.getTypeDesc().getFieldDesc("name").getFieldType());
        assertEquals(org.apache.axis.description.FieldDesc.FIELD_TYPE_FLOAT, _SetEngineInfo.getTypeDesc().getFieldDesc("cpu").getFieldType());
        assertEquals(org.apache.axis.description.FieldDesc.FIELD_TYPE_FLOAT, _SetEngineInfo.getTypeDesc().getFieldDesc("ram").getFieldType());
        assertEquals(org.apache.axis.description.FieldDesc.FIELD_TYPE_STRING, _SetEngineInfo.getTypeDesc().getFieldDesc("os").getFieldType());

        // Test case 6: getTypeDesc() should return a TypeDesc object with the correct field minOccurs values
        assertEquals(0, _SetEngineInfo.getTypeDesc().getFieldDesc("name").getMinOccurs());
        assertEquals(1, _SetEngineInfo.getTypeDesc().getFieldDesc("cpu").getMinOccurs());
        assertEquals(1, _SetEngineInfo.getTypeDesc().getFieldDesc("ram").getMinOccurs());
        assertEquals(0, _SetEngineInfo.getTypeDesc().getFieldDesc("os").getMinOccurs());

        // Test case 7: getTypeDesc() should return a TypeDesc object with the correct field maxOccurs values
        assertEquals(1, _SetEngineInfo.getTypeDesc().getFieldDesc("name").getMaxOccurs());
        assertEquals(1, _SetEngineInfo.getTypeDesc().getFieldDesc("cpu").getMaxOccurs());
        assertEquals(1, _SetEngineInfo.getTypeDesc().getFieldDesc("ram").getMaxOccurs());
        assertEquals(1, _SetEngineInfo.getTypeDesc().getFieldDesc("os").getMaxOccurs());

        // Test case 8: getTypeDesc() should return a TypeDesc object with the correct field nillable values
        assertFalse(_SetEngineInfo.getTypeDesc().getFieldDesc("name").isNillable());
        assertFalse(_SetEngineInfo.getTypeDesc().getFieldDesc("cpu").isNillable());
        assertFalse(_SetEngineInfo.getTypeDesc().getFieldDesc("ram").isNillable());
        assertFalse(_SetEngineInfo.getTypeDesc().getFieldDesc("os").isNillable());

        // Test case 9: getTypeDesc() should return a TypeDesc object with the correct field xml name values
        assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", "name"), _SetEngineInfo.getTypeDesc().getFieldDesc("name").getXmlName());
        assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", "cpu"), _SetEngineInfo.getTypeDesc().getFieldDesc("cpu").getXmlName());
        assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", "ram"), _SetEngineInfo.getTypeDesc().getFieldDesc("ram").getXmlName());
        assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", "os"), _SetEngineInfo.getTypeDesc().getFieldDesc("os").getXmlName());
        
        // Test case 10: getTypeDesc() should return the same TypeDesc object every time it is called
        assertSame(_SetEngineInfo.getTypeDesc(), _SetEngineInfo.getTypeDesc());
    }
}