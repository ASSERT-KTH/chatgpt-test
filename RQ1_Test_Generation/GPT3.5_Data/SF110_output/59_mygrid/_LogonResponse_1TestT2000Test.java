// Test case 1: Test if getTypeDesc() returns a non-null TypeDesc object
@Test
void testGetTypeDescNotNull() {
    assertNotNull(_LogonResponse.getTypeDesc());
}

// Test case 2: Test if getTypeDesc() returns a TypeDesc object with the correct XML type
@Test
void testGetTypeDescXmlType() {
    assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", ">LogonResponse"), _LogonResponse.getTypeDesc().getXmlType());
}

// Test case 3: Test if getTypeDesc() returns a TypeDesc object with the correct number of fields
@Test
void testGetTypeDescFieldCount() {
    assertEquals(1, _LogonResponse.getTypeDesc().getFieldCount());
}

// Test case 4: Test if getTypeDesc() returns a TypeDesc object with the correct field name
@Test
void testGetTypeDescFieldName() {
    assertEquals("logonResult", _LogonResponse.getTypeDesc().getFieldDesc(0).getFieldName());
}

// Test case 5: Test if getTypeDesc() returns a TypeDesc object with the correct XML name
@Test
void testGetTypeDescXmlName() {
    assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", "LogonResult"), _LogonResponse.getTypeDesc().getFieldDesc(0).getXmlName());
}

// Test case 6: Test if getTypeDesc() returns a TypeDesc object with the correct XML type for the field
@Test
void testGetTypeDescFieldType() {
    assertEquals(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), _LogonResponse.getTypeDesc().getFieldDesc(0).getXmlType());
}

// Test case 7: Test if getTypeDesc() returns a TypeDesc object with the correct field type
@Test
void testGetTypeDescType() {
    assertEquals(boolean.class, _LogonResponse.getTypeDesc().getFieldDesc(0).getFieldType());
}

// Test case 8: Test if getTypeDesc() returns a TypeDesc object with the correct field order
@Test
void testGetTypeDescFieldOrder() {
    assertEquals(0, _LogonResponse.getTypeDesc().getFieldDesc(0).getFieldOrder());
}

// Test case 9: Test if getTypeDesc() returns a TypeDesc object with the correct element description
@Test
void testGetTypeDescElementDesc() {
    assertEquals(_LogonResponse.getTypeDesc().getFieldDesc(0), _LogonResponse.getTypeDesc().getElementDesc());
}

// Test case 10: Test if getTypeDesc() returns the same TypeDesc object every time it is called
@Test
void testGetTypeDescSameObject() {
    assertSame(_LogonResponse.getTypeDesc(), _LogonResponse.getTypeDesc());
}