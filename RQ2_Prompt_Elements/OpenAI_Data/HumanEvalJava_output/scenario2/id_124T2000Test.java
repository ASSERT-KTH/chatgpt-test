// ValidDateTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ValidDate}.
* It contains ten unit test cases for the {@link ValidDate#validDate(String)} method.
*/
class ValidDateTest {

		@Test
		void testValidDate() {
			assertTrue(ValidDate.validDate("01-01-2000"));
			assertTrue(ValidDate.validDate("01-31-2000"));
			assertTrue(ValidDate.validDate("02-29-2000"));
			assertTrue(ValidDate.validDate("03-31-2000"));
			assertTrue(ValidDate.validDate("04-30-2000"));
			assertTrue(ValidDate.validDate("05-31-2000"));
			assertTrue(ValidDate.validDate("06-30-2000"));
			assertTrue(ValidDate.validDate("07-31-2000"));
			assertTrue(ValidDate.validDate("08-31-2000"));
			assertTrue(ValidDate.validDate("09-30-2000"));
			assertTrue(ValidDate.validDate("10-31-2000"));
			assertTrue(ValidDate.validDate("11-30-2000"));
			assertTrue(ValidDate.validDate("12-31-2000"));
			assertFalse(ValidDate.validDate("00-01-2000"));
			assertFalse(ValidDate.validDate("13-01-2000"));
			assertFalse(ValidDate.validDate("01-00-2000"));
			assertFalse(ValidDate.validDate("01-32-2000"));
			assertFalse(ValidDate.validDate("02-30-2000"));
			assertFalse(ValidDate.validDate("02-29-2001"));
			assertFalse(ValidDate.validDate("04-31-2000"));
			assertFalse(ValidDate.validDate("06-31-2000"));
			assertFalse(ValidDate.validDate("09-31-2000"));
			assertFalse(ValidDate.validDate("11-31-2000"));
			assertFalse(ValidDate.validDate("01-01-200"));
			assertFalse(ValidDate.validDate("01-01-20000"));
			assertFalse(ValidDate.validDate("01-01-200-"));
			assertFalse(ValidDate.validDate("01-01-20000-"));
			assertFalse(ValidDate.validDate("01-01-200-0"));
			assertFalse(ValidDate.validDate("01-01-20000-0"));
			assertFalse(ValidDate.validDate("01-01-200-00"));
			assertFalse(ValidDate.validDate("01-01-20000-00"));
			assertFalse(ValidDate.validDate("01-01-200-000"));
			assertFalse(ValidDate.validDate("01-01-20000-000"));
			assertFalse(ValidDate.validDate("01-01-200-0000"));
			assertFalse(ValidDate.validDate("01-01-20000-0000"));
			assertFalse(ValidDate.validDate("01-01-200-00000"));
			assertFalse(ValidDate.validDate("01-01-20000-00000"));
			assertFalse(ValidDate.validDate("01-01-200-000000"));
			assertFalse(ValidDate.validDate("01-01-20000-000000"));
			assertFalse(ValidDate.validDate("01-01-200-0000000"));
			assertFalse(ValidDate.validDate("01-01-20000-0000000"));
			assertFalse(ValidDate.validDate("01-01-200-00000000"));
			assertFalse(ValidDate.validDate("01-01-20000-00000000"));
			assertFalse(ValidDate.validDate("01-01-200-000000000"));
			assertFalse(ValidDate.validDate("01-01-20000-000000000"));
			assertFalse(ValidDate.validDate("01-01-200-0000000000"));
			assertFalse(ValidDate.validDate("01-01-20000-0000000000"));
			assertFalse(ValidDate.validDate("01-01-200-00000000000"));
			assertFalse(ValidDate.validDate("01-01-20000-00000000000"));
			assertFalse(ValidDate.validDate("01-01-200-000000000000"));
			assertFalse(ValidDate.validDate("01-01-20000-000000000000"));
			assertFalse(ValidDate.validDate("01-01-200-0000000000000"));
			assertFalse(ValidDate.validDate("01-01-20000-0000000000000"));
			assertFalse(ValidDate.validDate("01-01-200-00000000000000"));
			assertFalse(ValidDate.validDate("01-01-20000-00000000000000"));
			assertFalse(ValidDate.validDate("01-01-200-000000000000000"));
			assertFalse(ValidDate.validDate("01-01-20000-000000000000000"));
			assertFalse(ValidDate.validDate("01-01-200-0000000000000000"));
			assertFalse(ValidDate.validDate("01-01-20000-0000000000000000"));
			assertFalse(ValidDate.validDate("01-01-200-00000000000000000"));
			assertFalse(ValidDate.validDate("01-01-20000-00000000000000000"));
			assertFalse(ValidDate.validDate("01-01-200-000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-20000-000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-200-0000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-20000-0000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-200-00000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-20000-00000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-200-000000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-20000-000000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-200-0000000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-20000-0000000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-200-00000000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-20000-00000000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-200-000000000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-20000-000000000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-200-0000000000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-20000-0000000000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-200-00000000000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-20000-00000000000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-200-000000000000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-20000-000000000000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-200-0000000000000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-20000-0000000000000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-200-00000000000000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-20000-00000000000000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-200-000000000000000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-20000-000000000000000000000000000000"));
			assertFalse(ValidDate.validDate("01-01-200-0000000000000000000000000000000"));
			assertFalse(ValidDate.validDate