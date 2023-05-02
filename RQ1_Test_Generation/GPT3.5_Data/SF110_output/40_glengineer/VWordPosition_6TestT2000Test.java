// Test case 1: Test if textAt() returns the correct text for a VWordPosition within a CharTable
@Test
void testTextAtWithinCharTable() {
    CharTable ct = new CharTable("ABCD\nEFGH\nIJKL\nMNOP");
    VWordPosition vwp = new VWordPosition(1, 0, 3);
    String expected = "BEIM";
    String actual = vwp.textAt(ct);
    assertEquals(expected, actual);
}

// Test case 2: Test if textAt() returns an empty string for a VWordPosition with zero height
@Test
void testTextAtZeroHeight() {
    CharTable ct = new CharTable("ABCD\nEFGH\nIJKL\nMNOP");
    VWordPosition vwp = new VWordPosition(1, 2, 2);
    String expected = "";
    String actual = vwp.textAt(ct);
    assertEquals(expected, actual);
}

// Test case 3: Test if textAt() returns an empty string for a VWordPosition outside of a CharTable
@Test
void testTextAtOutsideCharTable() {
    CharTable ct = new CharTable("ABCD\nEFGH\nIJKL\nMNOP");
    VWordPosition vwp = new VWordPosition(5, 0, 3);
    String expected = "";
    String actual = vwp.textAt(ct);
    assertEquals(expected, actual);
}

// Test case 4: Test if textAt() returns the correct text for a VWordPosition intersecting a Block
@Test
void testTextAtIntersectingBlock() {
    CharTable ct = new CharTable("ABCD\nEFGH\nIJKL\nMNOP");
    Block block = new Block(new CharPosition(1, 1), new CharPosition(3, 3));
    VWordPosition vwp = new VWordPosition(2, 0, 3);
    String expected = "CFK";
    String actual = vwp.textAt(ct);
    assertEquals(expected, actual);
}

// Test case 5: Test if textAt() returns an empty string for a VWordPosition not intersecting a Block
@Test
void testTextAtNotIntersectingBlock() {
    CharTable ct = new CharTable("ABCD\nEFGH\nIJKL\nMNOP");
    Block block = new Block(new CharPosition(1, 1), new CharPosition(3, 3));
    VWordPosition vwp = new VWordPosition(4, 0, 3);
    String expected = "";
    String actual = vwp.textAt(ct);
    assertEquals(expected, actual);
}

// Test case 6: Test if textAt() returns the correct text for a VWordPosition with height 1
@Test
void testTextAtHeight1() {
    CharTable ct = new CharTable("ABCD\nEFGH\nIJKL\nMNOP");
    VWordPosition vwp = new VWordPosition(3, 1, 2);
    String expected = "H";
    String actual = vwp.textAt(ct);
    assertEquals(expected, actual);
}

// Test case 7: Test if textAt() returns the correct text for a VWordPosition with height equal to the height of the CharTable
@Test
void testTextAtHeightEqualToCharTable() {
    CharTable ct = new CharTable("ABCD\nEFGH\nIJKL\nMNOP");
    VWordPosition vwp = new VWordPosition(1, 0, 4);
    String expected = "BFIJM";
    String actual = vwp.textAt(ct);
    assertEquals(expected, actual);
}

// Test case 8: Test if textAt() returns the correct text for a VWordPosition with height greater than the height of the CharTable
@Test
void testTextAtHeightGreaterThanCharTable() {
    CharTable ct = new CharTable("ABCD\nEFGH\nIJKL\nMNOP");
    VWordPosition vwp = new VWordPosition(1, 0, 5);
    String expected = "BFIJMN";
    String actual = vwp.textAt(ct);
    assertEquals(expected, actual);
}

// Test case 9: Test if textAt() returns the correct text for a trivial VWordPosition
@Test
void testTextAtTrivial() {
    CharTable ct = new CharTable("ABCD\nEFGH\nIJKL\nMNOP");
    VWordPosition vwp = new VWordPosition(2, 3, 3);
    String expected = "";
    String actual = vwp.textAt(ct);
    assertEquals(expected, actual);
}

// Test case 10: Test if textAt() returns the correct text for a VWordPosition with only one character
@Test
void testTextAtOneCharacter() {
    CharTable ct = new CharTable("ABCD\nEFGH\nIJKL\nMNOP");
    VWordPosition vwp = new VWordPosition(0, 1, 2);
    String expected = "F";
    String actual = vwp.textAt(ct);
    assertEquals(expected, actual);
}