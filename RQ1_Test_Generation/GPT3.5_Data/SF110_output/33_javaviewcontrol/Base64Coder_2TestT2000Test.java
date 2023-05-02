// Test case 1: Test encoding an empty byte array
@Test
void testEncodeEmptyByteArray() {
    byte[] input = new byte[0];
    char[] expectedOutput = new char[0];
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

// Test case 2: Test encoding a byte array with length 1
@Test
void testEncodeByteArrayLength1() {
    byte[] input = new byte[]{(byte) 0x41};
    char[] expectedOutput = new char[]{'Q', 'Q', '=', '='};
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

// Test case 3: Test encoding a byte array with length 2
@Test
void testEncodeByteArrayLength2() {
    byte[] input = new byte[]{(byte) 0x41, (byte) 0x42};
    char[] expectedOutput = new char[]{'Q', 'k', 'I', '='};
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

// Test case 4: Test encoding a byte array with length 3
@Test
void testEncodeByteArrayLength3() {
    byte[] input = new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43};
    char[] expectedOutput = new char[]{'Q', 'k', 'N', 'C'};
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

// Test case 5: Test encoding a byte array with length 4
@Test
void testEncodeByteArrayLength4() {
    byte[] input = new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43, (byte) 0x44};
    char[] expectedOutput = new char[]{'Q', 'k', 'N', 'k', '='};
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

// Test case 6: Test encoding a byte array with length 5
@Test
void testEncodeByteArrayLength5() {
    byte[] input = new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43, (byte) 0x44, (byte) 0x45};
    char[] expectedOutput = new char[]{'Q', 'k', 'N', 'k', 'V', 'A', '='};
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

// Test case 7: Test encoding a byte array with length 6
@Test
void testEncodeByteArrayLength6() {
    byte[] input = new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43, (byte) 0x44, (byte) 0x45, (byte) 0x46};
    char[] expectedOutput = new char[]{'Q', 'k', 'N', 'k', 'V', 'h', '='};
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

// Test case 8: Test encoding a byte array with length 7
@Test
void testEncodeByteArrayLength7() {
    byte[] input = new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43, (byte) 0x44, (byte) 0x45, (byte) 0x46, (byte) 0x47};
    char[] expectedOutput = new char[]{'Q', 'k', 'N', 'k', 'V', 'h', 'R', 'w', '='};
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

// Test case 9: Test encoding a byte array with length 8
@Test
void testEncodeByteArrayLength8() {
    byte[] input = new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43, (byte) 0x44, (byte) 0x45, (byte) 0x46, (byte) 0x47, (byte) 0x48};
    char[] expectedOutput = new char[]{'Q', 'k', 'N', 'k', 'V', 'h', 'R', '4', 'A', '='};
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

// Test case 10: Test encoding a byte array with length 9
@Test
void testEncodeByteArrayLength9() {
    byte[] input = new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43, (byte) 0x44, (byte) 0x45, (byte) 0x46, (byte) 0x47, (byte) 0x48, (byte) 0x49};
    char[] expectedOutput = new char[]{'Q', 'k', 'N', 'k', 'V', 'h', 'R', '4', 'S', 'Q', '='};
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}
}