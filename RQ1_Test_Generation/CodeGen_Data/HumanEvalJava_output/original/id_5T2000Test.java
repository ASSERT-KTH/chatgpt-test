// IntersperseTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersperse}.
* It contains one unit test case for the {@link Intersperse#intersperse(List, int)} method.
*/
class IntersperseTest {
/**
		 * Unit test for {@link Intersperse#intersperse(List, int)}.
		*/
		@Test
		public void test() {
			// System.out.println(new Intersperse(5, 3));
			// 1
			List<Object> result = new ArrayList<Object>();
			result.add(new Object());
			result.add(5);
			System.out.println(
			    new Intersperse(new Object()).intersperse(result));
			
			// 3
			result = new ArrayList<Object>();
			result.add(new Object());
			result.add(new Object());
			result.add(3);
			System.out.println(
			    new Intersperse(new Object()).intersperse(result));
			
			// 3
			result = new ArrayList<Object>();
			result.add(new Object());
			result.add(new Object());
			result.add(new Object());
			System.out.println(
			    new Intersperse(new Object()).intersperse(result));

			// 4
			result = new ArrayList<Object>();
			result.add(new Object());
			result.add(new Object());
			result.add(new Object());
			result.add(4);
			System.out.println(
			    new Intersperse(new Object()).intersperse(result));

			// 2
			result = new ArrayList<Object>();
			result.add(new Object());
			result.add(new Object());
			result.add(3);
			System.out.println(
			    new Intersperse(new Object()).intersperse(result));
		}
}
