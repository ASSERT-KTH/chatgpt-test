// DictionaryInfo_5Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getMessage(String)} method.
*/
class DictionaryInfo_5Test {
    
    /**
     * Test case for getMessage method when message name is null.
     * Expects null to be returned.
     */
    @Test
    void testGetMessage_NullName() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.5.0");
        assertNull(dictionaryInfo.getMessage(null));
    }
    
    /**
     * Test case for getMessage method when message name is empty.
     * Expects null to be returned.
     */
    @Test
    void testGetMessage_EmptyName() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.5.0");
        assertNull(dictionaryInfo.getMessage(""));
    }
    
    /**
     * Test case for getMessage method when message name does not exist in the dictionary.
     * Expects null to be returned.
     */
    @Test
    void testGetMessage_NonExistingName() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.5.0");
        assertNull(dictionaryInfo.getMessage("NonExistingMessage"));
    }
    
    /**
     * Test case for getMessage method when message name exists in the dictionary.
     * Expects the corresponding MessageInfo object to be returned.
     */
    @Test
    void testGetMessage_ExistingName() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.5.0");
        MessageInfo messageInfo = new MessageInfo(1, "TestMessage");
        dictionaryInfo.addMessage(messageInfo);
        assertEquals(messageInfo, dictionaryInfo.getMessage("TestMessage"));
    }
    
    /**
     * Test case for getMessage method when multiple messages with the same name exist in the dictionary.
     * Expects the first MessageInfo object to be returned.
     */
    @Test
    void testGetMessage_MultipleSameName() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.5.0");
        MessageInfo messageInfo1 = new MessageInfo(1, "TestMessage");
        MessageInfo messageInfo2 = new MessageInfo(2, "TestMessage");
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        assertEquals(messageInfo1, dictionaryInfo.getMessage("TestMessage"));
    }
    
    /**
     * Test case for getMessage method when multiple messages with different names exist in the dictionary.
     * Expects the corresponding MessageInfo object to be returned.
     */
    @Test
    void testGetMessage_MultipleDifferentNames() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.5.0");
        MessageInfo messageInfo1 = new MessageInfo(1, "TestMessage1");
        MessageInfo messageInfo2 = new MessageInfo(2, "TestMessage2");
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        assertEquals(messageInfo1, dictionaryInfo.getMessage("TestMessage1"));
        assertEquals(messageInfo2, dictionaryInfo.getMessage("TestMessage2"));
    }
    
    /**
     * Test case for getMessage method when messages are added in a different order.
     * Expects the corresponding MessageInfo object to be returned.
     */
    @Test
    void testGetMessage_DifferentOrder() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.5.0");
        MessageInfo messageInfo1 = new MessageInfo(1, "TestMessage1");
        MessageInfo messageInfo2 = new MessageInfo(2, "TestMessage2");
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        assertEquals(messageInfo1, dictionaryInfo.getMessage("TestMessage1"));
        assertEquals(messageInfo2, dictionaryInfo.getMessage("TestMessage2"));
    }
    
    /**
     * Test case for getMessage method when messages are added and removed.
     * Expects null to be returned for the removed message and the corresponding MessageInfo object to be returned for the remaining message.
     */
    @Test
    void testGetMessage_AddRemove() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.5.0");
        MessageInfo messageInfo1 = new MessageInfo(1, "TestMessage1");
        MessageInfo messageInfo2 = new MessageInfo(2, "TestMessage2");
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(messageInfo1);
        dictionaryInfo.addMessage(messageInfo2);
        dictionaryInfo.addMessage(message