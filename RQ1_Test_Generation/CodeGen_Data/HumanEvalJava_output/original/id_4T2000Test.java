// MeanAbsoluteDeviationTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MeanAbsoluteDeviation}.
* It contains one unit test case for the {@link MeanAbsoluteDeviation#meanAbsoluteDeviation(List)} method.
*/
class MeanAbsoluteDeviationTest {
Double mean;
		Double expected_mean = Double.valueOf(1.2);
		double expected_mad;
		@Test
        public void should_return_expected() {
			assertNotEquals(Double.valueOf(0.0), mean(null, null));
			assertNotEquals(Double.valueOf(1.0), mean(null, 1.0));
			assertNotEquals(Double.valueOf(2.0), mean(null, 2.0));
			assertNotEquals(Double.valueOf(3.0), mean(null, 3.0));
		}
		@Test
        public void should_return_expected_mean() {
			assertEquals(expected_mean, mean(null, null));
		}
		@Test
        public void should_return_expected_mad() {
			assertEquals(expected_mad, mean(null, null) - mean(null, 5.0));
		}
		@Test
        public void should_return_expected_mad_square() {
			assertEquals(expected_mad, Math.pow(expected_mad, 2.0, 2.0));
		}
}
