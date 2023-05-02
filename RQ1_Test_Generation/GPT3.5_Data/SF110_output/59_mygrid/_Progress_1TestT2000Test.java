// Test case 1: Test if getTypeDesc() returns a non-null TypeDesc object
@Test
public void testGetTypeDescNotNull() {
    assertNotNull(_Progress.getTypeDesc());
}

// Test case 2: Test if getTypeDesc() returns an instance of TypeDesc
@Test
public void testGetTypeDescInstanceOf() {
    assertTrue(_Progress.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);
}

// Test case 3: Test if getTypeDesc() returns a TypeDesc object with the correct XML type
@Test
public void testGetTypeDescXmlType() {
    assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", ">Progress"), _Progress.getTypeDesc().getXmlType());
}

// Test case 4: Test if getTypeDesc() returns a TypeDesc object with the correct number of fields
@Test
public void testGetTypeDescFieldsSize() {
    assertEquals(1, _Progress.getTypeDesc().getFieldDescs().length);
}

// Test case 5: Test if getTypeDesc() returns a TypeDesc object with the correct field name
@Test
public void testGetTypeDescFieldName() {
    assertEquals("job", _Progress.getTypeDesc().getFieldDesc("job").getFieldName());
}

// Test case 6: Test if getTypeDesc() returns a TypeDesc object with the correct XML name for the field
@Test
public void testGetTypeDescFieldXmlName() {
    assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", "job"), _Progress.getTypeDesc().getFieldDesc("job").getXmlName());
}

// Test case 7: Test if getTypeDesc() returns a TypeDesc object with the correct XML type for the field
@Test
public void testGetTypeDescFieldXmlType() {
    assertEquals(new javax.xml.namespace.QName("http://tempuri.org/", "Job"), _Progress.getTypeDesc().getFieldDesc("job").getXmlType());
}

// Test case 8: Test if getTypeDesc() returns a TypeDesc object with the correct minimum occurrence for the field
@Test
public void testGetTypeDescFieldMinOccurs() {
    assertEquals(0, _Progress.getTypeDesc().getFieldDesc("job").getMinOccurs());
}

// Test case 9: Test if getTypeDesc() returns a TypeDesc object with the correct maximum occurrence for the field
@Test
public void testGetTypeDescFieldMaxOccurs() {
    assertEquals(1, _Progress.getTypeDesc().getFieldDesc("job").getMaxOccurs());
}

// Test case 10: Test if getTypeDesc() returns a TypeDesc object with the correct type of the field
@Test
public void testGetTypeDescFieldType() {
    assertEquals(mygrid.web.Job.class, _Progress.getTypeDesc().getFieldDesc("job").getFieldType());
}