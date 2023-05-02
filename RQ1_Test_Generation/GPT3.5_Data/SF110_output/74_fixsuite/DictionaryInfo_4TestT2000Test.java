// DictionaryInfo_4Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getMessage(int)} method.
*/
class DictionaryInfo_4Test {
    
    /**
     * Test case for getMessage method with valid id.
     */
    @Test
    void testGetMessageWithValidId() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        MessageInfo message = new MessageInfo(1, "Heartbeat");
        dictionary.addMessage(message);
        assertEquals(message, dictionary.getMessage(1));
    }
    
    /**
     * Test case for getMessage method with invalid id.
     */
    @Test
    void testGetMessageWithInvalidId() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        MessageInfo message = new MessageInfo(1, "Heartbeat");
        dictionary.addMessage(message);
        assertNull(dictionary.getMessage(2));
    }
    
    /**
     * Test case for getMessage method with null messagesById.
     */
    @Test
    void testGetMessageWithNullMessagesById() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        assertNull(dictionary.getMessage(1));
    }
    
    /**
     * Test case for getMessage method with empty messagesById.
     */
    @Test
    void testGetMessageWithEmptyMessagesById() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        dictionary.messagesById = new TreeMap<Integer, MessageInfo>();
        assertNull(dictionary.getMessage(1));
    }
    
    /**
     * Test case for getMessage method with valid id and multiple messages.
     */
    @Test
    void testGetMessageWithValidIdAndMultipleMessages() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        MessageInfo message1 = new MessageInfo(1, "Heartbeat");
        MessageInfo message2 = new MessageInfo(2, "TestRequest");
        dictionary.addMessage(message1);
        dictionary.addMessage(message2);
        assertEquals(message2, dictionary.getMessage(2));
    }
    
    /**
     * Test case for getMessage method with valid id and multiple messages in reverse order.
     */
    @Test
    void testGetMessageWithValidIdAndMultipleMessagesInReverseOrder() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        MessageInfo message1 = new MessageInfo(1, "Heartbeat");
        MessageInfo message2 = new MessageInfo(2, "TestRequest");
        dictionary.addMessage(message2);
        dictionary.addMessage(message1);
        assertEquals(message2, dictionary.getMessage(2));
    }
    
    /**
     * Test case for getMessage method with valid id and multiple messages with same id.
     */
    @Test
    void testGetMessageWithValidIdAndMultipleMessagesWithSameId() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        MessageInfo message1 = new MessageInfo(1, "Heartbeat");
        MessageInfo message2 = new MessageInfo(1, "TestRequest");
        dictionary.addMessage(message1);
        dictionary.addMessage(message2);
        assertEquals(message2, dictionary.getMessage(1));
    }
    
    /**
     * Test case for getMessage method with valid id and multiple messages with same name.
     */
    @Test
    void testGetMessageWithValidIdAndMultipleMessagesWithSameName() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        MessageInfo message1 = new MessageInfo(1, "Heartbeat");
        MessageInfo message2 = new MessageInfo(2, "Heartbeat");
        dictionary.addMessage(message1);
        dictionary.addMessage(message2);
        assertEquals(message2, dictionary.getMessage(2));
    }
    
    /**
     * Test case for getMessage method with valid id and multiple messages with same id and name.
     */
    @Test
    void testGetMessageWithValidIdAndMultipleMessagesWithSameIdAndName() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        MessageInfo message1 = new MessageInfo(1, "Heartbeat");
        MessageInfo message2 = new MessageInfo(1, "Heartbeat");
        dictionary.addMessage(message1);
        dictionary.addMessage(message2);
        assertEquals(message2, dictionary.getMessage(1));
    }
    
    /**
     * Test case for getMessage method with valid id and multiple messages with different versions.
     */
    @Test
    void testGetMessageWithValidIdAndMultipleMessagesWithDifferentVersions() {
        DictionaryInfo dictionary1 = new DictionaryInfo("FIX.4.4");
        DictionaryInfo dictionary2 = new DictionaryInfo("FIX.5.0");
        MessageInfo message1 = new MessageInfo(1, "Heartbeat");
        MessageInfo message2 = new MessageInfo(1, "Heartbeat");
        dictionary1.addMessage(message1);
        dictionary2.addMessage(message2);
        assertEquals(message1, dictionary1.getMessage(1));
    }
}