// DictionaryInfo_2Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getComponent(int)} method.
*/
class DictionaryInfo_2Test {
    
    /**
     * Test of getComponent method, of class DictionaryInfo.
     * Case when the component exists.
     */
    @Test
    void testGetComponent_Exists() {
        DictionaryInfo instance = new DictionaryInfo("FIX.4.4");
        ComponentInfo component = new ComponentInfo("TestComponent", 1);
        instance.addComponent(component);
        ComponentInfo result = instance.getComponent(1);
        assertEquals(component, result);
    }
    
    /**
     * Test of getComponent method, of class DictionaryInfo.
     * Case when the component does not exist.
     */
    @Test
    void testGetComponent_NotExists() {
        DictionaryInfo instance = new DictionaryInfo("FIX.4.4");
        ComponentInfo result = instance.getComponent(1);
        assertNull(result);
    }
    
    /**
     * Test of getComponent method, of class DictionaryInfo.
     * Case when the component exists and there are multiple components.
     */
    @Test
    void testGetComponent_MultipleComponents() {
        DictionaryInfo instance = new DictionaryInfo("FIX.4.4");
        ComponentInfo component1 = new ComponentInfo("TestComponent1", 1);
        ComponentInfo component2 = new ComponentInfo("TestComponent2", 2);
        instance.addComponent(component1);
        instance.addComponent(component2);
        ComponentInfo result = instance.getComponent(2);
        assertEquals(component2, result);
    }
    
    /**
     * Test of getComponent method, of class DictionaryInfo.
     * Case when the component exists and there are multiple components with the same id.
     */
    @Test
    void testGetComponent_MultipleComponentsSameId() {
        DictionaryInfo instance = new DictionaryInfo("FIX.4.4");
        ComponentInfo component1 = new ComponentInfo("TestComponent1", 1);
        ComponentInfo component2 = new ComponentInfo("TestComponent2", 1);
        instance.addComponent(component1);
        instance.addComponent(component2);
        ComponentInfo result = instance.getComponent(1);
        assertEquals(component1, result);
    }
    
    /**
     * Test of getComponent method, of class DictionaryInfo.
     * Case when the component exists and there are multiple components with the same name.
     */
    @Test
    void testGetComponent_MultipleComponentsSameName() {
        DictionaryInfo instance = new DictionaryInfo("FIX.4.4");
        ComponentInfo component1 = new ComponentInfo("TestComponent", 1);
        ComponentInfo component2 = new ComponentInfo("TestComponent", 2);
        instance.addComponent(component1);
        instance.addComponent(component2);
        ComponentInfo result = instance.getComponent("TestComponent");
        assertEquals(component1, result);
    }
    
    /**
     * Test of getComponent method, of class DictionaryInfo.
     * Case when the component exists and there are multiple components with the same name and id.
     */
    @Test
    void testGetComponent_MultipleComponentsSameNameAndId() {
        DictionaryInfo instance = new DictionaryInfo("FIX.4.4");
        ComponentInfo component1 = new ComponentInfo("TestComponent", 1);
        ComponentInfo component2 = new ComponentInfo("TestComponent", 1);
        instance.addComponent(component1);
        instance.addComponent(component2);
        ComponentInfo result = instance.getComponent("TestComponent");
        assertEquals(component1, result);
    }
    
    /**
     * Test of getComponent method, of class DictionaryInfo.
     * Case when there are no components.
     */
    @Test
    void testGetComponent_NoComponents() {
        DictionaryInfo instance = new DictionaryInfo("FIX.4.4");
        ComponentInfo result = instance.getComponent(1);
        assertNull(result);
    }
    
    /**
     * Test of getComponent method, of class DictionaryInfo.
     * Case when the component id is negative.
     */
    @Test
    void testGetComponent_NegativeId() {
        DictionaryInfo instance = new DictionaryInfo("FIX.4.4");
        ComponentInfo component = new ComponentInfo("TestComponent", -1);
        instance.addComponent(component);
        ComponentInfo result = instance.getComponent(-1);
        assertEquals(component, result);
    }
    
    /**
     * Test of getComponent method, of class DictionaryInfo.
     * Case when the component id is zero.
     */
    @Test
    void testGetComponent_ZeroId() {
        DictionaryInfo instance = new DictionaryInfo("FIX.4.4");
        ComponentInfo component = new ComponentInfo("TestComponent", 0);
        instance.addComponent(component);
        ComponentInfo result = instance.getComponent(0);
        assertEquals(component, result);
    }
    
    /**
     * Test of getComponent method, of class DictionaryInfo.
     * Case when the component id is greater than Integer.MAX_VALUE.
     */
    @Test
    void testGetComponent_MaxIntId() {
        DictionaryInfo instance = new DictionaryInfo("FIX.4.4");
        ComponentInfo component = new ComponentInfo("TestComponent", Integer.MAX_VALUE);
        instance.addComponent(component);
        ComponentInfo result = instance.getComponent(Integer.MAX_VALUE);
        assertEquals(component, result);
    }
}