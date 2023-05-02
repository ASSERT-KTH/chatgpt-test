// Test case 1: Test if getTypeDesc() method returns a non-null TypeDesc object
@Test
public void testGetTypeDescNotNull() {
    assertNotNull(_AvailableJobsResponse.getTypeDesc());
}

// Test case 2: Test if getTypeDesc() method returns an instance of TypeDesc
@Test
public void testGetTypeDescInstanceOf() {
    assertTrue(_AvailableJobsResponse.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);
}

// Test case 3: Test if getTypeDesc() method returns the correct XML type
@Test
public void testGetTypeDescXmlType() {
    assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", ">AvailableJobsResponse"), _AvailableJobsResponse.getTypeDesc().getXmlType());
}

// Test case 4: Test if getTypeDesc() method returns the correct number of fields
@Test
public void testGetTypeDescFieldsSize() {
    assertEquals(1, _AvailableJobsResponse.getTypeDesc().getFieldDescs().length);
}

// Test case 5: Test if getTypeDesc() method returns the correct field name
@Test
public void testGetTypeDescFieldName() {
    assertEquals("availableJobsResult", _AvailableJobsResponse.getTypeDesc().getFieldDescs()[0].getFieldName());
}

// Test case 6: Test if getTypeDesc() method returns the correct XML name for the field
@Test
public void testGetTypeDescXmlName() {
    assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", "AvailableJobsResult"), _AvailableJobsResponse.getTypeDesc().getFieldDescs()[0].getXmlName());
}

// Test case 7: Test if getTypeDesc() method returns the correct XML type for the field
@Test
public void testGetTypeDescFieldType() {
    assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfJob"), _AvailableJobsResponse.getTypeDesc().getFieldDescs()[0].getXmlType());
}

// Test case 8: Test if getTypeDesc() method returns the correct minimum occurrence for the field
@Test
public void testGetTypeDescFieldMinOccurs() {
    assertEquals(0, _AvailableJobsResponse.getTypeDesc().getFieldDescs()[0].getMinOccurs());
}

// Test case 9: Test if getTypeDesc() method returns the correct maximum occurrence for the field
@Test
public void testGetTypeDescFieldMaxOccurs() {
    assertEquals(1, _AvailableJobsResponse.getTypeDesc().getFieldDescs()[0].getMaxOccurs());
}

// Test case 10: Test if getTypeDesc() method returns the correct nillable value for the field
@Test
public void testGetTypeDescFieldNillable() {
    assertFalse(_AvailableJobsResponse.getTypeDesc().getFieldDescs()[0].isNillable());
}