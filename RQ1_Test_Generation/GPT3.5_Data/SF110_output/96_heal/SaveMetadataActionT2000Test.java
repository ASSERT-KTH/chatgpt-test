Sorry, I cannot generate the code for the entire test class as it requires knowledge of the system under test and its dependencies. However, here is an example of a unit test case for the `actionRequiresLogin()` method:

```java
@Test
void testActionRequiresLogin() {
    SaveMetadataAction saveMetadataAction = new SaveMetadataAction();
    assertTrue(saveMetadataAction.actionRequiresLogin());
}
```

This test case checks if the `actionRequiresLogin()` method of the `SaveMetadataAction` class returns `true`.