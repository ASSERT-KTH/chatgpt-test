// Test case for creating an XPathReader with a valid class name
@Test
void testCreateReaderWithValidClassName() throws SAXPathException {
    XPathReader reader = XPathReaderFactory.createReader("com.example.XPathReaderImpl");
    assertNotNull(reader);
}

// Test case for creating an XPathReader with an invalid class name
@Test
void testCreateReaderWithInvalidClassName() {
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader("com.example.InvalidXPathReaderImpl");
    });
}

// Test case for creating an XPathReader with a class that doesn't implement XPathReader interface
@Test
void testCreateReaderWithNonXPathReaderClass() {
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader("com.example.NonXPathReaderImpl");
    });
}

// Test case for creating an XPathReader with a null class name
@Test
void testCreateReaderWithNullClassName() {
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader(null);
    });
}

// Test case for creating an XPathReader with an empty class name
@Test
void testCreateReaderWithEmptyClassName() {
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader("");
    });
}

// Test case for creating an XPathReader with a security exception when accessing system property
@Test
void testCreateReaderWithSecurityException() {
    SecurityManager originalSecurityManager = System.getSecurityManager();
    try {
        System.setSecurityManager(new SecurityManager() {
            @Override
            public void checkPropertyAccess(String key) {
                if (XPathReaderFactory.DRIVER_PROPERTY.equals(key)) {
                    throw new SecurityException("Property access not allowed");
                }
            }
        });
        assertThrows(SAXPathException.class, () -> {
            XPathReaderFactory.createReader();
        });
    } finally {
        System.setSecurityManager(originalSecurityManager);
    }
}

// Test case for creating an XPathReader with a valid system property
@Test
void testCreateReaderWithValidSystemProperty() throws SAXPathException {
    System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "com.example.XPathReaderImpl");
    XPathReader reader = XPathReaderFactory.createReader();
    assertNotNull(reader);
}

// Test case for creating an XPathReader with an invalid system property
@Test
void testCreateReaderWithInvalidSystemProperty() {
    System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "com.example.InvalidXPathReaderImpl");
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader();
    });
}

// Test case for creating an XPathReader with a system property that doesn't implement XPathReader interface
@Test
void testCreateReaderWithNonXPathReaderSystemProperty() {
    System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "com.example.NonXPathReaderImpl");
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader();
    });
}

// Test case for creating an XPathReader with a null system property
@Test
void testCreateReaderWithNullSystemProperty() {
    System.clearProperty(XPathReaderFactory.DRIVER_PROPERTY);
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader();
    });
}

// Test case for creating an XPathReader with the default driver
@Test
void testCreateReaderWithDefaultDriver() throws SAXPathException {
    XPathReaderFactory.USE_DEFAULT = true;
    XPathReader reader = XPathReaderFactory.createReader();
    assertNotNull(reader);
}