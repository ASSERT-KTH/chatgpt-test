// PluckTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pluck}.
* It contains ten unit test cases for the {@link Pluck#pluck(List)} method.
*/
class PluckTest {

	@Test
	void testPluck() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(4);
		arr.add(2);
		arr.add(3);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(1);
		assertEquals(expected, Pluck.pluck(arr));
		
		arr = new ArrayList<Object>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(1);
		assertEquals(expected, Pluck.pluck(arr));
		
		arr = new ArrayList<Object>();
		expected = new ArrayList<Object>();
		assertEquals(expected, Pluck.pluck(arr));
		
		arr = new ArrayList<Object>();
		arr.add(5);
		arr.add(0);
		arr.add(3);
		arr.add(0);
		arr.add(4);
		arr.add(2);
		expected = new ArrayList<Object>();
		expected.add(0);
		expected.add(1);
		assertEquals(expected, Pluck.pluck(arr));
		
		arr = new ArrayList<Object>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(0);
		arr.add(5);
		arr.add(3);
		expected = new ArrayList<Object>();
		expected.add(0);
		expected.add(3);
		assertEquals(expected, Pluck.pluck(arr));
		
		arr = new ArrayList<Object>();
		arr.add(5);
		arr.add(4);
		arr.add(8);
		arr.add(4);
		arr.add(8);
		expected = new ArrayList<Object>();
		expected.add(4);
		expected.add(1);
		assertEquals(expected, Pluck.pluck(arr));
		
		arr = new ArrayList<Object>();
		arr.add(7);
		arr.add(6);
		arr.add(7);
		arr.add(1);
		expected = new ArrayList<Object>();
		expected.add(6);
		expected.add(1);
		assertEquals(expected, Pluck.pluck(arr));
		
		arr = new ArrayList<Object>();
		arr.add(7);
		arr.add(9);
		arr.add(7);
		arr.add(1);
		expected = new ArrayList<Object>();
		assertEquals(expected, Pluck.pluck(arr));
		
		arr = new ArrayList<Object>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(0);
		arr.add(5);
		arr.add(3);
		expected = new ArrayList<Object>();
		expected.add(0);
		expected.add(3);
		assertEquals(expected, Pluck.pluck(arr));
		
		arr = new ArrayList<Object>();
		arr.add(5);
		arr.add(4);
		arr.add(8);
		arr.add(4);
		arr.add(8);
		expected = new ArrayList<Object>();
		expected.add(4);
		expected.add(1);
		assertEquals(expected, Pluck.pluck(arr));
	}
}