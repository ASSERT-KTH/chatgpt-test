// Test case 1: Test decoding of empty string
@Test
void testDecodeStringEmpty() {
    String encoded = "";
    String decoded = Base64Coder.decodeString(encoded);
    assertEquals("", decoded);
}

// Test case 2: Test decoding of single character string
@Test
void testDecodeStringSingleChar() {
    String encoded = "QQ==";
    String decoded = Base64Coder.decodeString(encoded);
    assertEquals("A", decoded);
}

// Test case 3: Test decoding of string with padding
@Test
void testDecodeStringWithPadding() {
    String encoded = "SGVsbG8gV29ybGQh";
    String decoded = Base64Coder.decodeString(encoded);
    assertEquals("Hello World!", decoded);
}

// Test case 4: Test decoding of string without padding
@Test
void testDecodeStringWithoutPadding() {
    String encoded = "SGVsbG8gV29ybGQ";
    String decoded = Base64Coder.decodeString(encoded);
    assertEquals("Hello World", decoded);
}

// Test case 5: Test decoding of string with invalid character
@Test
void testDecodeStringInvalidChar() {
    String encoded = "SGVsbG8gV29ybGQ!";
    assertThrows(IllegalArgumentException.class, () -> {
        Base64Coder.decodeString(encoded);
    });
}

// Test case 6: Test decoding of string with invalid padding
@Test
void testDecodeStringInvalidPadding() {
    String encoded = "SGVsbG8gV29ybGQ=";
    assertThrows(IllegalArgumentException.class, () -> {
        Base64Coder.decodeString(encoded);
    });
}

// Test case 7: Test decoding of string with invalid length
@Test
void testDecodeStringInvalidLength() {
    String encoded = "SGVsbG8gV29ybGQ";
    assertThrows(IllegalArgumentException.class, () -> {
        Base64Coder.decodeString(encoded);
    });
}

// Test case 8: Test decoding of string with line breaks
@Test
void testDecodeStringWithLineBreaks() {
    String encoded = "SGVsbG8g\nV29ybGQh";
    String decoded = Base64Coder.decodeString(encoded);
    assertEquals("Hello World!", decoded);
}

// Test case 9: Test decoding of string with mixed case
@Test
void testDecodeStringMixedCase() {
    String encoded = "aGVsbG8gd29ybGQ=";
    String decoded = Base64Coder.decodeString(encoded);
    assertEquals("hello world", decoded);
}

// Test case 10: Test decoding of string with non-ASCII characters
@Test
void testDecodeStringNonAscii() {
    String encoded = "5L2g5aW977yM5LiW55WM";
    String decoded = Base64Coder.decodeString(encoded);
    assertEquals("你好，世界", decoded);
}
}