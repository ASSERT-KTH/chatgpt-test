// Test case 1: Test with empty input stream
@Test
void testEmptyInputStream() throws IOException {
    InputStream in = new ByteArrayInputStream(new byte[0]);
    char[] password = PasswordField.getPassword(in, "Enter password: ");
    assertNull(password);
}

// Test case 2: Test with valid input stream
@Test
void testValidInputStream() throws IOException {
    InputStream in = new ByteArrayInputStream("password".getBytes());
    char[] password = PasswordField.getPassword(in, "Enter password: ");
    assertArrayEquals("password".toCharArray(), password);
}

// Test case 3: Test with input stream containing newline character
@Test
void testInputStreamWithNewline() throws IOException {
    InputStream in = new ByteArrayInputStream("password\n".getBytes());
    char[] password = PasswordField.getPassword(in, "Enter password: ");
    assertArrayEquals("password".toCharArray(), password);
}

// Test case 4: Test with input stream containing carriage return character
@Test
void testInputStreamWithCarriageReturn() throws IOException {
    InputStream in = new ByteArrayInputStream("password\r".getBytes());
    char[] password = PasswordField.getPassword(in, "Enter password: ");
    assertArrayEquals("password".toCharArray(), password);
}

// Test case 5: Test with input stream containing carriage return and newline characters
@Test
void testInputStreamWithCarriageReturnAndNewline() throws IOException {
    InputStream in = new ByteArrayInputStream("password\r\n".getBytes());
    char[] password = PasswordField.getPassword(in, "Enter password: ");
    assertArrayEquals("password".toCharArray(), password);
}

// Test case 6: Test with input stream containing more than 128 characters
@Test
void testInputStreamWithMoreThan128Characters() throws IOException {
    String longPassword = String.join("", Collections.nCopies(150, "a"));
    InputStream in = new ByteArrayInputStream(longPassword.getBytes());
    char[] password = PasswordField.getPassword(in, "Enter password: ");
    assertArrayEquals(longPassword.toCharArray(), password);
}

// Test case 7: Test with null input stream
@Test
void testNullInputStream() {
    assertThrows(NullPointerException.class, () -> PasswordField.getPassword(null, "Enter password: "));
}

// Test case 8: Test with null prompt
@Test
void testNullPrompt() throws IOException {
    InputStream in = new ByteArrayInputStream("password".getBytes());
    char[] password = PasswordField.getPassword(in, null);
    assertArrayEquals("password".toCharArray(), password);
}

// Test case 9: Test with empty prompt
@Test
void testEmptyPrompt() throws IOException {
    InputStream in = new ByteArrayInputStream("password".getBytes());
    char[] password = PasswordField.getPassword(in, "");
    assertArrayEquals("password".toCharArray(), password);
}

// Test case 10: Test with prompt containing special characters
@Test
void testPromptWithSpecialCharacters() throws IOException {
    InputStream in = new ByteArrayInputStream("password".getBytes());
    char[] password = PasswordField.getPassword(in, "Enter !@#$%^&*() password: ");
    assertArrayEquals("password".toCharArray(), password);
}
}