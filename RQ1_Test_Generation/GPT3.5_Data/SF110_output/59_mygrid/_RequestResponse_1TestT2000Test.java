// Test case 1: Test if getTypeDesc() returns a non-null TypeDesc object
@Test
public void testGetTypeDescNotNull() {
    assertNotNull(_RequestResponse.getTypeDesc());
}

// Test case 2: Test if getTypeDesc() returns an instance of TypeDesc
@Test
public void testGetTypeDescInstanceOf() {
    assertTrue(_RequestResponse.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);
}

// Test case 3: Test if getTypeDesc() returns the correct XML type
@Test
public void testGetTypeDescXmlType() {
    assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", ">RequestResponse"), _RequestResponse.getTypeDesc().getXmlType());
}

// Test case 4: Test if getTypeDesc() returns the correct number of fields
@Test
public void testGetTypeDescFieldsSize() {
    assertEquals(1, _RequestResponse.getTypeDesc().getFields().length);
}

// Test case 5: Test if getTypeDesc() returns the correct field name
@Test
public void testGetTypeDescFieldName() {
    assertEquals("requestResult", _RequestResponse.getTypeDesc().getFields()[0].getFieldName());
}

// Test case 6: Test if getTypeDesc() returns the correct XML name for the field
@Test
public void testGetTypeDescXmlName() {
    assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", "RequestResult"), _RequestResponse.getTypeDesc().getFields()[0].getXmlName());
}

// Test case 7: Test if getTypeDesc() returns the correct XML type for the field
@Test
public void testGetTypeDescXmlType() {
    assertEquals(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), _RequestResponse.getTypeDesc().getFields()[0].getXmlType());
}

// Test case 8: Test if getTypeDesc() returns the correct field description
@Test
public void testGetTypeDescFieldDescription() {
    assertEquals(null, _RequestResponse.getTypeDesc().getFields()[0].getDescription());
}

// Test case 9: Test if getTypeDesc() returns the correct field order
@Test
public void testGetTypeDescFieldOrder() {
    assertEquals(0, _RequestResponse.getTypeDesc().getFields()[0].getOrder());
}

// Test case 10: Test if getTypeDesc() returns the correct field minOccurs
@Test
public void testGetTypeDescFieldMinOccurs() {
    assertEquals(0, _RequestResponse.getTypeDesc().getFields()[0].getMinOccurs());
}