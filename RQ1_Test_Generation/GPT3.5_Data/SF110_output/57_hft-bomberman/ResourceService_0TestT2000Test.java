I suggest starting with a test case that checks if the method returns a non-null value when given a valid path to an image file. Here's an example:

```
@Test
void testGetImage_validPath_returnsImage() {
    Image image = ResourceService.getImage("/images/test.png");
    assertNotNull(image);
}
```

Make sure to replace "/images/test.png" with the actual path to an image file in your project.