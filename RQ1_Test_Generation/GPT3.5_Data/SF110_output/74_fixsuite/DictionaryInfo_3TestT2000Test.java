// Test case for DictionaryInfo.getComponent(String) method
class DictionaryInfo_3Test {
    
    // Test case 1: Test with null component name
    @Test
    void testGetComponent_NullName() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        ComponentInfo component = dictionary.getComponent(null);
        assertNull(component);
    }
    
    // Test case 2: Test with empty component name
    @Test
    void testGetComponent_EmptyName() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        ComponentInfo component = dictionary.getComponent("");
        assertNull(component);
    }
    
    // Test case 3: Test with non-existent component name
    @Test
    void testGetComponent_NonExistentName() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        ComponentInfo component = dictionary.getComponent("NonExistentComponent");
        assertNull(component);
    }
    
    // Test case 4: Test with existing component name
    @Test
    void testGetComponent_ExistingName() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        ComponentInfo component = new ComponentInfo("TestComponent", 1);
        dictionary.addComponent(component);
        ComponentInfo retrievedComponent = dictionary.getComponent("TestComponent");
        assertEquals(component, retrievedComponent);
    }
    
    // Test case 5: Test with multiple components with same name
    @Test
    void testGetComponent_MultipleComponentsWithSameName() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        ComponentInfo component1 = new ComponentInfo("TestComponent", 1);
        ComponentInfo component2 = new ComponentInfo("TestComponent", 2);
        dictionary.addComponent(component1);
        dictionary.addComponent(component2);
        ComponentInfo retrievedComponent = dictionary.getComponent("TestComponent");
        assertEquals(component1, retrievedComponent);
    }
    
    // Test case 6: Test with multiple components with different names
    @Test
    void testGetComponent_MultipleComponentsWithDifferentNames() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        ComponentInfo component1 = new ComponentInfo("TestComponent1", 1);
        ComponentInfo component2 = new ComponentInfo("TestComponent2", 2);
        dictionary.addComponent(component1);
        dictionary.addComponent(component2);
        ComponentInfo retrievedComponent = dictionary.getComponent("TestComponent1");
        assertEquals(component1, retrievedComponent);
    }
    
    // Test case 7: Test with case sensitivity
    @Test
    void testGetComponent_CaseSensitivity() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        ComponentInfo component = new ComponentInfo("TestComponent", 1);
        dictionary.addComponent(component);
        ComponentInfo retrievedComponent = dictionary.getComponent("testcomponent");
        assertNull(retrievedComponent);
    }
    
    // Test case 8: Test with multiple components with same name but different case
    @Test
    void testGetComponent_MultipleComponentsWithSameNameDifferentCase() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        ComponentInfo component1 = new ComponentInfo("TestComponent", 1);
        ComponentInfo component2 = new ComponentInfo("testcomponent", 2);
        dictionary.addComponent(component1);
        dictionary.addComponent(component2);
        ComponentInfo retrievedComponent = dictionary.getComponent("TestComponent");
        assertEquals(component1, retrievedComponent);
    }
    
    // Test case 9: Test with multiple components with different names but same case
    @Test
    void testGetComponent_MultipleComponentsWithDifferentNamesSameCase() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        ComponentInfo component1 = new ComponentInfo("TestComponent1", 1);
        ComponentInfo component2 = new ComponentInfo("TestComponent2", 2);
        dictionary.addComponent(component1);
        dictionary.addComponent(component2);
        ComponentInfo retrievedComponent = dictionary.getComponent("TestComponent1");
        assertEquals(component1, retrievedComponent);
    }
    
    // Test case 10: Test with multiple components with same name and case
    @Test
    void testGetComponent_MultipleComponentsWithSameNameAndCase() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        ComponentInfo component1 = new ComponentInfo("TestComponent", 1);
        ComponentInfo component2 = new ComponentInfo("TestComponent", 2);
        dictionary.addComponent(component1);
        dictionary.addComponent(component2);
        ComponentInfo retrievedComponent = dictionary.getComponent("TestComponent");
        assertEquals(component1, retrievedComponent);
    }
}