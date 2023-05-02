// TruncateNumberTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TruncateNumber}.
* It contains one unit test case for the {@link TruncateNumber#truncateNumber(Double)} method.
*/
class TruncateNumberTest {
Double test_1 = new Double(1.5);
		Double test_2 = new Double(1.333);
		Double test_3 = new Double(1232341232443.5);
		Double test_4 = new Double(123.5557);
		Double test_5 = new Double(1000.5556);

		@Test
		void test_1() {
			assertEquals(7.5, test_1.truncateNumber(test_1));
			assertEquals(99.5, test_1.truncateNumber(test_2));
			assertEquals(99.5556, test_1.truncateNumber(test_3));
			assertEquals(1000.5557, test_1.truncateNumber(test_4));
			assertEquals(1000.5556, test_5.truncateNumber(test_4));
		}
} 