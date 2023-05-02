// DateTools_4Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#isValidDate(String)} method.
*/
class DateTools_4Test {

    @Test
    void testIsValidDate_Null() {
        assertFalse(DateTools.isValidDate(null));
    }

    @Test
    void testIsValidDate_EmptyString() {
        assertFalse(DateTools.isValidDate(""));
    }

    @Test
    void testIsValidDate_InvalidFormat() {
        assertFalse(DateTools.isValidDate("2021-13-01"));
    }

    @Test
    void testIsValidDate_ValidFormat() {
        assertTrue(DateTools.isValidDate("2021-12-01"));
    }

    @Test
    void testIsValidDate_ValidFormatWithTime() {
        assertTrue(DateTools.isValidDate("2021-12-01 12:30:45", "yyyy-MM-dd HH:mm:ss"));
    }

    @Test
    void testIsValidDate_InvalidFormatWithTime() {
        assertFalse(DateTools.isValidDate("2021-12-01 25:30:45", "yyyy-MM-dd HH:mm:ss"));
    }

    @Test
    void testIsValidDate_ValidFormatWithDifferentSeparator() {
        assertTrue(DateTools.isValidDate("2021/12/01", "yyyy/MM/dd"));
    }

    @Test
    void testIsValidDate_InvalidFormatWithDifferentSeparator() {
        assertFalse(DateTools.isValidDate("2021/13/01", "yyyy/MM/dd"));
    }

    @Test
    void testIsValidDate_ValidFormatWithYearOnly() {
        assertTrue(DateTools.isValidDate("2021", "yyyy"));
    }

    @Test
    void testIsValidDate_InvalidFormatWithYearOnly() {
        assertFalse(DateTools.isValidDate("21", "yyyy"));
    }
}