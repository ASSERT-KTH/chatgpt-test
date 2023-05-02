// DictionaryInfo_0Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getField(int)} method.
*/
class DictionaryInfo_0Test {
    
    /**
     * Test case for getting a field with a valid tag number.
     */
    @Test
    void testGetFieldWithValidTagNumber() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        FieldInfo field = new FieldInfo(1, "Account");
        dictionary.addField(field);
        assertEquals(field, dictionary.getField(1));
    }
    
    /**
     * Test case for getting a field with an invalid tag number.
     */
    @Test
    void testGetFieldWithInvalidTagNumber() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        FieldInfo field = new FieldInfo(1, "Account");
        dictionary.addField(field);
        assertNull(dictionary.getField(2));
    }
    
    /**
     * Test case for getting a field when no fields are added to the dictionary.
     */
    @Test
    void testGetFieldWhenNoFieldsAdded() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        assertNull(dictionary.getField(1));
    }
    
    /**
     * Test case for getting a field with a null tag number.
     */
    @Test
    void testGetFieldWithNullTagNumber() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        FieldInfo field = new FieldInfo(null, "Account");
        dictionary.addField(field);
        assertNull(dictionary.getField(null));
    }
    
    /**
     * Test case for getting a field with a valid tag number after adding multiple fields.
     */
    @Test
    void testGetFieldWithValidTagNumberAfterAddingMultipleFields() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        FieldInfo field1 = new FieldInfo(1, "Account");
        FieldInfo field2 = new FieldInfo(2, "AdvId");
        dictionary.addField(field1);
        dictionary.addField(field2);
        assertEquals(field2, dictionary.getField(2));
    }
    
    /**
     * Test case for getting a field with a valid tag number after adding multiple fields with the same tag number.
     */
    @Test
    void testGetFieldWithValidTagNumberAfterAddingMultipleFieldsWithSameTagNumber() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        FieldInfo field1 = new FieldInfo(1, "Account");
        FieldInfo field2 = new FieldInfo(1, "AdvId");
        dictionary.addField(field1);
        dictionary.addField(field2);
        assertEquals(field2, dictionary.getField(1));
    }
    
    /**
     * Test case for getting a field with a valid tag number after adding a field with a null tag number.
     */
    @Test
    void testGetFieldWithValidTagNumberAfterAddingFieldWithNullTagNumber() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        FieldInfo field1 = new FieldInfo(1, "Account");
        FieldInfo field2 = new FieldInfo(null, "AdvId");
        dictionary.addField(field1);
        dictionary.addField(field2);
        assertEquals(field1, dictionary.getField(1));
    }
    
    /**
     * Test case for getting a field with a valid tag number after adding a field with a null name.
     */
    @Test
    void testGetFieldWithValidTagNumberAfterAddingFieldWithNullName() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        FieldInfo field1 = new FieldInfo(1, "Account");
        FieldInfo field2 = new FieldInfo(2, null);
        dictionary.addField(field1);
        dictionary.addField(field2);
        assertEquals(field1, dictionary.getField(1));
    }
    
    /**
     * Test case for getting a field with a valid tag number after adding a field with an empty name.
     */
    @Test
    void testGetFieldWithValidTagNumberAfterAddingFieldWithEmptyName() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        FieldInfo field1 = new FieldInfo(1, "Account");
        FieldInfo field2 = new FieldInfo(2, "");
        dictionary.addField(field1);
        dictionary.addField(field2);
        assertEquals(field1, dictionary.getField(1));
    }
    
    /**
     * Test case for getting a field with a valid tag number after adding a field with a name that already exists.
     */
    @Test
    void testGetFieldWithValidTagNumberAfterAddingFieldWithNameThatAlreadyExists() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        FieldInfo field1 = new FieldInfo(1, "Account");
        FieldInfo field2 = new FieldInfo(2, "AdvId");
        FieldInfo field3 = new FieldInfo(3, "Account");
        dictionary.addField(field1);
        dictionary.addField(field2);
        dictionary.addField(field3);
        assertEquals(field3, dictionary.getField(3));
    }
}