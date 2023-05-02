I can help you write the test cases for the `ResourceService` class. Here's an example test case for the `getImage` method:

```java
@Test
void testGetImage() {
    Image expectedImage = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
    try {
        InputStream inputStream = getClass().getResourceAsStream("/test.png");
        ImageIO.read(inputStream);
        when(ResourceService.getInputStream("/test.png")).thenReturn(inputStream);
    } catch (IOException e) {
        fail("Failed to load test image");
    }
    Image actualImage = ResourceService.getImage("/test.png");
    assertEquals(expectedImage.getWidth(null), actualImage.getWidth(null));
    assertEquals(expectedImage.getHeight(null), actualImage.getHeight(null));
}
```

This test case checks if the `getImage` method returns the expected image when given a valid path. You can write similar test cases for the other methods in the `ResourceService` class.