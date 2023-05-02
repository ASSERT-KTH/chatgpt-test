import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateTools_2Test {

    @Test
    void testParseNull() {
        assertNull(DateTools.parse(null));
    }

    @Test
    void testParseEmptyString() {
        assertNull(DateTools.parse(""));
    }

    @Test
    void testParseInvalidDateString() {
        assertNull(DateTools.parse("invalid date string"));
    }

    @Test
    void testParseValidDateString() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT);
        Date expected = formatter.parse("2021-01-01");
        assertEquals(expected, DateTools.parse("2021-01-01"));
    }

    @Test
    void testParseValidDateStringWithLongFormat() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(DateTools.LONG_DATE_FORMAT);
        Date expected = formatter.parse("2021-01-01 12:00:00");
        assertEquals(expected, DateTools.parse("2021-01-01 12:00:00"));
    }

    @Test
    void testParseValidDateStringWithDifferentFormat() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date expected = formatter.parse("01/01/2021");
        assertEquals(expected, DateTools.parse("01/01/2021"));
    }

    @Test
    void testParseValidDateStringWithDifferentFormat2() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        Date expected = formatter.parse("01-01-2021");
        assertEquals(expected, DateTools.parse("01-01-2021"));
    }

    @Test
    void testParseValidDateStringWithYearOnlyFormat() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        Date expected = formatter.parse("2021");
        assertEquals(expected, DateTools.parse("2021"));
    }

    @Test
    void testParseInvalidDateStringWithFormat() {
        assertNull(DateTools.parse("2021-01-01", "invalid format"));
    }
}