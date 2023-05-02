// DictionaryInfo_1Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getField(String)} method.
*/
class DictionaryInfo_1Test {
    
    /**
     * Test case for getting a field by name when the fieldsByName map is null.
     * Expects null to be returned.
     */
    @Test
    void testGetFieldByNameWhenFieldsByNameIsNull() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
        assertNull(dictionaryInfo.getField("TestField"));
    }
    
    /**
     * Test case for getting a field by name when the field exists in the fieldsByName map.
     * Expects the correct field to be returned.
     */
    @Test
    void testGetFieldByNameWhenFieldExists() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
        FieldInfo field = new FieldInfo(1, "TestField", "TestFieldType");
        dictionaryInfo.addField(field);
        assertEquals(field, dictionaryInfo.getField("TestField"));
    }
    
    /**
     * Test case for getting a field by name when the field does not exist in the fieldsByName map.
     * Expects null to be returned.
     */
    @Test
    void testGetFieldByNameWhenFieldDoesNotExist() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
        FieldInfo field = new FieldInfo(1, "TestField", "TestFieldType");
        dictionaryInfo.addField(field);
        assertNull(dictionaryInfo.getField("NonExistentField"));
    }
    
    /**
     * Test case for getting a field by name when the field name is null.
     * Expects null to be returned.
     */
    @Test
    void testGetFieldByNameWhenFieldNameIsNull() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
        FieldInfo field = new FieldInfo(1, "TestField", "TestFieldType");
        dictionaryInfo.addField(field);
        assertNull(dictionaryInfo.getField(null));
    }
    
    /**
     * Test case for getting a field by name when the field name is an empty string.
     * Expects null to be returned.
     */
    @Test
    void testGetFieldByNameWhenFieldNameIsEmpty() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
        FieldInfo field = new FieldInfo(1, "TestField", "TestFieldType");
        dictionaryInfo.addField(field);
        assertNull(dictionaryInfo.getField(""));
    }
    
    /**
     * Test case for getting a field by name when the field name contains only whitespace characters.
     * Expects null to be returned.
     */
    @Test
    void testGetFieldByNameWhenFieldNameIsWhitespace() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
        FieldInfo field = new FieldInfo(1, "TestField", "TestFieldType");
        dictionaryInfo.addField(field);
        assertNull(dictionaryInfo.getField("   "));
    }
    
    /**
     * Test case for getting a field by name when the field name contains leading and trailing whitespace characters.
     * Expects the correct field to be returned.
     */
    @Test
    void testGetFieldByNameWhenFieldNameHasLeadingAndTrailingWhitespace() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
        FieldInfo field = new FieldInfo(1, "TestField", "TestFieldType");
        dictionaryInfo.addField(field);
        assertEquals(field, dictionaryInfo.getField("   TestField   "));
    }
    
    /**
     * Test case for getting a field by name when the field name is in uppercase and the field name in the dictionary is in lowercase.
     * Expects the correct field to be returned.
     */
    @Test
    void testGetFieldByNameWhenFieldNameIsUppercase() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
        FieldInfo field = new FieldInfo(1, "TestField", "TestFieldType");
        dictionaryInfo.addField(field);
        assertEquals(field, dictionaryInfo.getField("TESTFIELD"));
    }
    
    /**
     * Test case for getting a field by name when the field name is in lowercase and the field name in the dictionary is in uppercase.
     * Expects the correct field to be returned.
     */
    @Test
    void testGetFieldByNameWhenFieldNameIsLowercase() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
        FieldInfo field = new FieldInfo(1, "TESTFIELD", "TestFieldType");
        dictionaryInfo.addField(field);
        assertEquals(field, dictionaryInfo.getField("testfield"));
    }
    
    /**
     * Test case for getting a field by name when the field name contains special characters.
     * Expects the correct field to be returned.
     */
    @Test
    void testGetFieldByNameWhenFieldNameContainsSpecialCharacters() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
        FieldInfo field = new FieldInfo(1, "Test_Field", "TestFieldType");
        dictionaryInfo.addField(field);
        assertEquals(field, dictionaryInfo.getField("Test_Field"));
    }
}