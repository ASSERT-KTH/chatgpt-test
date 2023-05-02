// TriTest.java
package original;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Tri}.
* It contains ten unit test cases for the {@link Tri#tri(int)} method.
*/
class TriTest {

	@Test
	void testTri() {
		List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0, 35.0, 6.0, 48.0, 7.0, 63.0, 8.0, 80.0, 9.0, 99.0, 10.0, 120.0, 11.0);
		assertEquals(expected, Tri.tri(20));
		
		expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0, 35.0, 6.0, 48.0, 7.0, 63.0, 8.0, 80.0, 9.0, 99.0, 10.0, 120.0, 11.0, 143.0, 12.0, 168.0, 13.0, 195.0, 14.0, 224.0, 15.0, 255.0, 16.0, 288.0, 17.0, 323.0, 18.0, 360.0, 19.0, 399.0, 20.0, 440.0, 21.0, 483.0, 22.0, 528.0, 23.0, 575.0, 24.0, 624.0, 25.0, 675.0, 26.0, 728.0, 27.0, 783.0, 28.0, 840.0, 29.0, 899.0, 30.0, 960.0, 31.0, 1023.0, 32.0, 1088.0, 33.0, 1155.0, 34.0, 1224.0, 35.0, 1295.0, 36.0, 1368.0, 37.0, 1443.0, 38.0, 1520.0, 39.0, 1599.0, 40.0, 1680.0, 41.0, 1763.0, 42.0, 1848.0, 43.0, 1935.0, 44.0, 2024.0, 45.0, 2115.0, 46.0, 2208.0, 47.0, 2303.0, 48.0, 2400.0, 49.0, 2499.0, 50.0, 2600.0, 51.0, 2703.0, 52.0, 2808.0, 53.0, 2915.0, 54.0, 3024.0, 55.0, 3135.0, 56.0, 3248.0, 57.0, 3363.0, 58.0, 3480.0, 59.0, 3599.0, 60.0, 3720.0, 61.0, 3843.0, 62.0, 3968.0, 63.0, 4096.0, 64.0, 4225.0, 65.0, 4356.0, 66.0, 4489.0, 67.0, 4624.0, 68.0, 4761.0, 69.0, 4900.0, 70.0, 5041.0, 71.0, 5184.0, 72.0, 5329.0, 73.0, 5476.0, 74.0, 5625.0, 75.0, 5776.0, 76.0, 5929.0, 77.0, 6084.0, 78.0, 6241.0, 79.0, 6400.0, 80.0, 6561.0, 81.0, 6724.0, 82.0, 6889.0, 83.0, 7056.0, 84.0, 7225.0, 85.0, 7396.0, 86.0, 7569.0, 87.0, 7744.0, 88.0, 7921.0, 89.0, 8100.0, 90.0, 8281.0, 91.0, 8464.0, 92.0, 8649.0, 93.0, 8836.0, 94.0, 9025.0, 95.0, 9216.0, 96.0, 9409.0, 97.0, 9604.0, 98.0, 9801.0, 99.0, 10000.0, 100.0);
		assertEquals(expected, Tri.tri(100));
		
		expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0, 35.0, 6.0, 48.0, 7.0, 63.0, 8.0, 80.0, 9.0, 99.0, 10.0, 120.0, 11.0, 143.0, 12.0, 168.0, 13.0, 195.0, 14.0, 224.0, 15.0, 255.0, 16.0, 288.0, 17.0, 323.0, 18.0, 360.0, 19.0, 399.0, 20.0, 440.0, 21.0, 483.0, 22.0, 528.0, 23.0, 575.0, 24.0, 624.0, 25.0, 675.0, 26.0, 728.0, 27.0, 783.0, 28.0, 840.0, 29.0, 899.0, 30.0, 960.0, 31.0, 1023.0, 32.0, 1088.0, 33.0, 1155.0, 34.0, 1224.0, 35.0, 1295.0, 36.0, 1368.0, 37.0, 1443.0, 38.0, 1520.0, 39.0, 1599.0, 40.0, 1680.0, 41.0, 1763.0, 42.0, 1848.0, 43.0, 1935.0, 44.0, 2024.0, 45.0, 2115.0, 46.0, 2208.0, 47.0, 2303.0, 48.0, 2400.0, 49.0, 2499.0, 50.0, 2600.0, 51.0, 2703.0, 52.0, 2808.0, 53.0, 2915.0, 54.0, 3024.0, 55.0, 3135.0, 56.0, 3248.0, 57.0, 3363.0, 58.0, 3480.0, 59.0, 3599.0, 60.0, 3720.0, 61.0, 3843.0, 62.0, 3968.0, 63.0, 4096.0, 64.0, 4225.0, 65.0, 4356.0, 66.0, 4489.0, 67.0, 4624.0, 68.0, 4761.0, 69.0, 4900.0, 70.0, 5041.0, 71.0, 5184.0, 72.0, 5329.0, 73.0, 5476.0, 74.0, 5625.0, 75.0, 5776.0, 76.0, 5929.0, 77.0, 6084.0, 78.0, 6241.0, 79.0, 6400.0, 80.0, 6561.0, 81.0, 6724.0, 82.0, 6889.0, 83.0, 7056.0, 84.0, 7225.0, 85.0, 7396.0, 86.0, 7569.0, 87.0, 7744.0, 88.0, 7921.0, 89.0, 8100.0, 90.0, 8281.0, 91.0, 8464.0, 92.0, 8649.0, 93.0, 8836.0, 94.0, 9025.0, 95.0, 9216.0, 96.0, 9409.0, 97.0, 9604.0, 98.0, 9801.0, 99.0, 10000.0, 100.0, 10201.0, 101.0, 10404.0, 102.0, 10609.0, 103.0, 10816.0, 104.0, 11025.0, 105.0, 11236.0, 106.0, 11449.0, 107.0, 11664.0, 108.0, 11881.0, 109.0, 12100.0, 110.0, 12321.0, 111.0, 12544.0, 112