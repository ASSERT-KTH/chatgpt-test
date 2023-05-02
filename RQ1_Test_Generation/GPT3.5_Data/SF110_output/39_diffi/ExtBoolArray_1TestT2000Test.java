// Here's an example of how you can write unit tests for the ExtBoolArray class

@Test
void testLeftWithAllFalse() {
    ExtBoolArray arr = new ExtBoolArray(5);
    int expected = 5;
    int actual = arr.left();
    assertEquals(expected, actual);
}

@Test
void testLeftWithAllTrue() {
    ExtBoolArray arr = new ExtBoolArray(5);
    arr.setTrue(0, 4);
    int expected = 0;
    int actual = arr.left();
    assertEquals(expected, actual);
}

@Test
void testLeftWithMixedValues() {
    ExtBoolArray arr = new ExtBoolArray(5);
    arr.setTrue(0, 2);
    int expected = 2;
    int actual = arr.left();
    assertEquals(expected, actual);
}

@Test
void testLeftWithEmptyArray() {
    ExtBoolArray arr = new ExtBoolArray(0);
    int expected = 0;
    int actual = arr.left();
    assertEquals(expected, actual);
}

@Test
void testLeftAfterSettingValues() {
    ExtBoolArray arr = new ExtBoolArray(5);
    arr.setTrue(0, 2);
    arr.setTrue(3, 4);
    int expected = 0;
    int actual = arr.left();
    assertEquals(expected, actual);
}

@Test
void testLeftAfterSettingValuesAndResetting() {
    ExtBoolArray arr = new ExtBoolArray(5);
    arr.setTrue(0, 2);
    arr.setTrue(3, 4);
    arr.setTrue(0, 4);
    int expected = 0;
    int actual = arr.left();
    assertEquals(expected, actual);
}

@Test
void testLeftAfterSettingValuesAndResettingPartially() {
    ExtBoolArray arr = new ExtBoolArray(5);
    arr.setTrue(0, 2);
    arr.setTrue(3, 4);
    arr.setTrue(1, 3);
    int expected = 1;
    int actual = arr.left();
    assertEquals(expected, actual);
}

@Test
void testLeftAfterSettingValuesAndResettingPartially2() {
    ExtBoolArray arr = new ExtBoolArray(5);
    arr.setTrue(0, 2);
    arr.setTrue(3, 4);
    arr.setTrue(2, 3);
    int expected = 2;
    int actual = arr.left();
    assertEquals(expected, actual);
}

@Test
void testLeftAfterSettingValuesAndResettingPartially3() {
    ExtBoolArray arr = new ExtBoolArray(5);
    arr.setTrue(0, 2);
    arr.setTrue(3, 4);
    arr.setTrue(1, 2);
    int expected = 2;
    int actual = arr.left();
    assertEquals(expected, actual);
}

@Test
void testLeftAfterSettingValuesAndResettingPartially4() {
    ExtBoolArray arr = new ExtBoolArray(5);
    arr.setTrue(0, 2);
    arr.setTrue(3, 4);
    arr.setTrue(0, 1);
    int expected = 3;
    int actual = arr.left();
    assertEquals(expected, actual);
}