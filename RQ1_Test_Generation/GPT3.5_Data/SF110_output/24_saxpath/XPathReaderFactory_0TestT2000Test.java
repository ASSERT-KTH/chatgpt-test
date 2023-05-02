// Test case for createReader() method when system property is not set and default driver is used
@Test
void testCreateReaderWithDefaultDriver() throws SAXPathException {
    XPathReader reader = XPathReaderFactory.createReader();
    assertNotNull(reader);
    assertEquals("com.werken.saxpath.XPathReader", reader.getClass().getName());
}

// Test case for createReader() method when system property is set and valid driver is used
@Test
void testCreateReaderWithValidDriver() throws SAXPathException {
    System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.XPathReaderImpl");
    XPathReader reader = XPathReaderFactory.createReader();
    assertNotNull(reader);
    assertEquals("org.saxpath.XPathReaderImpl", reader.getClass().getName());
}

// Test case for createReader() method when system property is set but invalid driver is used
@Test
void testCreateReaderWithInvalidDriver() {
    System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "com.example.InvalidDriver");
    assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
}

// Test case for createReader() method when system property is set but driver class is not found
@Test
void testCreateReaderWithMissingDriver() {
    System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "com.example.MissingDriver");
    assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
}

// Test case for createReader() method when system property is set but driver class is not a valid XPathReader
@Test
void testCreateReaderWithNonXPathReaderDriver() {
    System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "java.lang.String");
    assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
}

// Test case for createReader() method when system property is not set and default driver is disabled
@Test
void testCreateReaderWithDisabledDefaultDriver() {
    XPathReaderFactory.USE_DEFAULT = false;
    assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
}

// Test case for createReader() method when security exception is thrown while accessing system property
@Test
void testCreateReaderWithSecurityException() {
    SecurityManager originalManager = System.getSecurityManager();
    try {
        System.setSecurityManager(new SecurityManager() {
            @Override
            public void checkPropertyAccess(String key) {
                if (XPathReaderFactory.DRIVER_PROPERTY.equals(key)) {
                    throw new SecurityException("Property access not allowed");
                }
            }
        });
        assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
    } finally {
        System.setSecurityManager(originalManager);
    }
}

// Test case for createReader() method when system property is set to empty string
@Test
void testCreateReaderWithEmptyDriver() {
    System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "");
    assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
}

// Test case for createReader() method when system property is set to null
@Test
void testCreateReaderWithNullDriver() {
    System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, null);
    assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
}

// Test case for createReader(String) method with valid driver class name
@Test
void testCreateReaderWithString() throws SAXPathException {
    XPathReader reader = XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
    assertNotNull(reader);
    assertEquals("org.saxpath.XPathReaderImpl", reader.getClass().getName());
}

// Test case for createReader(String) method with invalid driver class name
@Test
void testCreateReaderWithInvalidString() {
    assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader("com.example.InvalidDriver"));
}
}