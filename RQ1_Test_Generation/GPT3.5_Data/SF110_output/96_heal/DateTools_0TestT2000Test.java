// DateTools_0Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#format(Date)} method.
*/
class DateTools_0Test {

    @Test
    void testFormatNullDate() {
        assertNull(DateTools.format(null));
    }

    @Test
    void testFormatDefaultFormat() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT);
        Date date = formatter.parse("2021-01-01");
        assertEquals("2021-01-01", DateTools.format(date));
    }

    @Test
    void testFormatLongFormat() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(DateTools.LONG_DATE_FORMAT);
        Date date = formatter.parse("2021-01-01 12:00:00");
        assertEquals("2021-01-01", DateTools.format(date));
    }

    @Test
    void testFormatCustomFormat() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formatter.parse("01/01/2021");
        assertEquals("01/01/2021", DateTools.format(date, "dd/MM/yyyy"));
    }

    @Test
    void testFormatNullFormat() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT);
        Date date = formatter.parse("2021-01-01");
        assertEquals("2021-01-01", DateTools.format(date, null));
    }

    @Test
    void testFormatInvalidFormat() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT);
        Date date = formatter.parse("2021-01-01");
        assertNull(DateTools.format(date, "invalid format"));
    }

    @Test
    void testParseNullString() {
        assertNull(DateTools.parse(null));
    }

    @Test
    void testParseValidString() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT);
        Date expected = formatter.parse("2021-01-01");
        assertEquals(expected, DateTools.parse("2021-01-01"));
    }

    @Test
    void testParseInvalidString() {
        assertNull(DateTools.parse("invalid date"));
    }

    @Test
    void testIsValidDateValidString() {
        assertTrue(DateTools.isValidDate("2021-01-01"));
    }

    @Test
    void testIsValidDateInvalidString() {
        assertFalse(DateTools.isValidDate("invalid date"));
    }
}