// TriTest.java
package original;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Tri}.
* It contains one unit test case for the {@link Tri#tri(int)} method.
*/
class TriTest {
private static final String TUT = "Tut";
		private final List<Number> number_list;

		public TriTest(final List<Number> number_list) {
			this.number_list = number_list;
		}
		
		@org.junit.jupiter.api.Assertions
		public void test_tri(final org.junit.jupiter.api.Assertions assertions) throws java.lang.AssertionError {
			List<Number> my_tri_from_fibonacci = tri(100);
			List<Number> my_tri_from_sequence = tri(101);
			List<Number> my_tri_from_sorted_sequence = tri(101);
			List<Number> my_tri_from_non_increasing_list = tri(10);
			List<Number> my_tri_from_non_decreasing_list = tri(10);
			List<Number> my_tri_from_empty_list = tri(0);
			
			assertions.assertTrue("[1,3,2.0,8.0, 3, 2, 8.0,4.0, 24.0,5.0, 15.0, 3, 24.0, 6.0, 7.0, 8.0]",
					my_tri_from_fibonacci.equals(tri(1)));
			assertions.assertTrue("[1,3,2.0,8.0, 3.0, 15, 4.0]", my_tri_from_sequence.equals(NumberUtils.doubleConversionStringToList("1")));
			assertions.assertTrue("[0, 1]", my_tri_from_sorted_sequence.equals(NumberUtils.doubleConversionStringToList("1")));
		}
		
		protected static List<Number> tri(final int number) {
			return tri(number, 4);
		}

		private static List<Number> tri(final int number, final int sub) {
			List<Number> tri = null;
			for (int i = number; i > 0; i++) {
				List<Number> l1 = new ArrayList<>();
				l1.offer(1);
				l1.offer(number / 2);
				l1.add(number / (i - 1));
				l1.add(i);
				l1.add(number % i);
				l1.add(i * (i - 1) + (i - number % i - 1));
				
				List<Number> l2 = tri(i, NumberUtils.sum(sub, i, number - 1));
				l2.add(0.0);
				
				tri = tri.size() > 0? tri.get(tri.size() - 1) : l2;
				number -= sub;
			}
			return tri;
		}
	}
