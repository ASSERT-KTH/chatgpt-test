import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

class DateTools_1Test {

	@Test
	void testFormatWithNullDate() {
		Date date = null;
		String formattedDate = DateTools.format(date, "yyyy-MM-dd");
		assertNull(formattedDate);
	}

	@Test
	void testFormatWithDefaultFormat() {
		Date date = new Date(1627776000000L); // August 1, 2021
		String formattedDate = DateTools.format(date);
		assertEquals("2021-08-01", formattedDate);
	}

	@Test
	void testFormatWithLongFormat() {
		Date date = new Date(1627776000000L); // August 1, 2021
		String formattedDate = DateTools.format(date, "yyyy-MM-dd HH:mm:ss");
		assertEquals("2021-08-01 00:00:00", formattedDate);
	}

	@Test
	void testFormatWithInvalidFormat() {
		Date date = new Date(1627776000000L); // August 1, 2021
		String formattedDate = DateTools.format(date, "invalid format");
		assertNull(formattedDate);
	}

	@Test
	void testFormatWithCustomFormat() {
		Date date = new Date(1627776000000L); // August 1, 2021
		String formattedDate = DateTools.format(date, "dd/MM/yyyy");
		assertEquals("01/08/2021", formattedDate);
	}

	@Test
	void testFormatWithEmptyFormat() {
		Date date = new Date(1627776000000L); // August 1, 2021
		String formattedDate = DateTools.format(date, "");
		assertNull(formattedDate);
	}

	@Test
	void testFormatWithNullFormat() {
		Date date = new Date(1627776000000L); // August 1, 2021
		String formattedDate = DateTools.format(date, null);
		assertNull(formattedDate);
	}

	@Test
	void testFormatWithInvalidDate() {
		String invalidDate = "invalid date";
		String formattedDate = DateTools.format(DateTools.parse(invalidDate), "yyyy-MM-dd");
		assertNull(formattedDate);
	}

	@Test
	void testFormatWithCustomFormatAndNullDate() {
		Date date = null;
		String formattedDate = DateTools.format(date, "dd/MM/yyyy");
		assertNull(formattedDate);
	}

	@Test
	void testFormatWithCustomFormatAndInvalidDate() {
		String invalidDate = "invalid date";
		String formattedDate = DateTools.format(DateTools.parse(invalidDate), "dd/MM/yyyy");
		assertNull(formattedDate);
	}

}