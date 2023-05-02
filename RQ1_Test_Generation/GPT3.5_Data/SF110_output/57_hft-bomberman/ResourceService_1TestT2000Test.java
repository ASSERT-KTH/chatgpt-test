I can help you write the test cases for the `ResourceService` class. Here's an example test case for the `getImageIcon` method:

```
@Test
void testGetImageIcon() {
    ImageIcon icon = ResourceService.getImageIcon("/images/test.png");
    assertNotNull(icon);
    assertEquals(100, icon.getIconWidth());
    assertEquals(100, icon.getIconHeight());
}
```

This test case loads an image located at `/images/test.png` in the classpath and checks if the returned `ImageIcon` object is not null and has the expected dimensions of 100x100 pixels. You can write similar test cases for other methods in the `ResourceService` class.