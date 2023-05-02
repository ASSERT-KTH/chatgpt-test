import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateTools_5Test {

    @Test
    void testValidDateWithDefaultFormat() {
        assertTrue(DateTools.isValidDate("2021-05-01"));
    }

    @Test
    void testInvalidDateWithDefaultFormat() {
        assertFalse(DateTools.isValidDate("2021-05-32"));
    }

    @Test
    void testValidDateWithLongFormat() {
        assertTrue(DateTools.isValidDate("2021-05-01 12:30:45", DateTools.LONG_DATE_FORMAT));
    }

    @Test
    void testInvalidDateWithLongFormat() {
        assertFalse(DateTools.isValidDate("2021-05-01 25:30:45", DateTools.LONG_DATE_FORMAT));
    }

    @Test
    void testValidDateWithCustomFormat() {
        assertTrue(DateTools.isValidDate("05/01/2021", "MM/dd/yyyy"));
    }

    @Test
    void testInvalidDateWithCustomFormat() {
        assertFalse(DateTools.isValidDate("2021/05/01", "MM/dd/yyyy"));
    }

    @Test
    void testValidYear() {
        assertTrue(DateTools.isValidDate("2021", "yyyy"));
    }

    @Test
    void testInvalidYear() {
        assertFalse(DateTools.isValidDate("21", "yyyy"));
    }

    @Test
    void testNullDate() {
        assertFalse(DateTools.isValidDate(null));
    }

    @Test
    void testInvalidFormat() {
        assertThrows(IllegalArgumentException.class, () -> {
            DateTools.isValidDate("2021-05-01", "invalid format");
        });
    }
}