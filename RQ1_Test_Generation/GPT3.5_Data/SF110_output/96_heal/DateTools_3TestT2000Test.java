import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTools_3Test {

	@Test
	void testParseValidDate() {
		String dateString = "2021-05-20";
		String format = "yyyy-MM-dd";
		Date expectedDate = new Date(121, 4, 20);
		Date actualDate = DateTools.parse(dateString, format);
		assertEquals(expectedDate, actualDate);
	}

	@Test
	void testParseInvalidDate() {
		String dateString = "2021-05-32";
		String format = "yyyy-MM-dd";
		Date actualDate = DateTools.parse(dateString, format);
		assertNull(actualDate);
	}

	@Test
	void testParseInvalidFormat() {
		String dateString = "2021-05-20";
		String format = "MM/dd/yyyy";
		Date actualDate = DateTools.parse(dateString, format);
		assertNull(actualDate);
	}

	@Test
	void testParseNullDate() {
		String dateString = null;
		String format = "yyyy-MM-dd";
		Date actualDate = DateTools.parse(dateString, format);
		assertNull(actualDate);
	}

	@Test
	void testParseNullFormat() {
		String dateString = "2021-05-20";
		String format = null;
		Date actualDate = DateTools.parse(dateString, format);
		assertNull(actualDate);
	}

	@Test
	void testParseEmptyDate() {
		String dateString = "";
		String format = "yyyy-MM-dd";
		Date actualDate = DateTools.parse(dateString, format);
		assertNull(actualDate);
	}

	@Test
	void testParseEmptyFormat() {
		String dateString = "2021-05-20";
		String format = "";
		Date actualDate = DateTools.parse(dateString, format);
		assertNull(actualDate);
	}

	@Test
	void testParseLongDate() {
		String dateString = "2021-05-20 12:30:45";
		String format = "yyyy-MM-dd HH:mm:ss";
		Date expectedDate = new Date(121, 4, 20, 12, 30, 45);
		Date actualDate = DateTools.parse(dateString, format);
		assertEquals(expectedDate, actualDate);
	}

	@Test
	void testParseYearOnly() {
		String dateString = "2021";
		String format = "yyyy";
		Date expectedDate = new Date(121, 0, 1);
		Date actualDate = DateTools.parse(dateString, format);
		assertEquals(expectedDate, actualDate);
	}

	@Test
	void testParseInvalidYear() {
		String dateString = "abcd";
		String format = "yyyy";
		Date actualDate = DateTools.parse(dateString, format);
		assertNull(actualDate);
	}

}