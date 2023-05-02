// FindClosestElementsTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindClosestElements}.
* It contains one unit test case for the {@link FindClosestElements#findClosestElements(List)} method.
*/
class FindClosestElementsTest {

	@Test
	void testFindClosestElements1() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(10.0); 
		numbers.add(15.0);
		numbers.add(2.0);
		Double minDiff = new FindClosestElements().findClosestElements(numbers).get(0);
		assertTrue("minDiff!= 3.23", minDiff == 3.23);
	}

	@Test
	void testFindClosestElements2() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.0); 
		numbers.add(2.0);
		numbers.add(3.9);
		numbers.add(4.0);
		Double minDiff = new FindClosestElements().findClosestElements(numbers).get(0);
		assertTrue("minDiff!= 2.0", minDiff == 2.0);
	}

	@Test
	void testFindClosestElements4() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(9.0); 
		numbers.add(5.9);
		numbers.add(5.1);
		numbers.add(5.9);
		Double minDiff = new FindClosestElements().findClosestElements(numbers).get(0);
		assertTrue("minDiff!= 5.5", minDiff == 5.5);
	}
		
	@Test
	void testFindClosestElementsB() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(11.0); 
		numbers.add(8.0);
		numbers.add(10.0);
		numbers.add(12.0);
		Double minDiff = new FindClosestElements().findClosestElements(numbers).get(0);
		assertTrue("minDiff!= 1.0", minDiff == 1.0);
	}

	@Test
	void testFindClosestElementsAOfSize1() {
		List<Double> numbers = new ArrayList<Double>();
		double minDiffValue = Double.MAX_VALUE;
		numbers.add(minDiffValue); 
		Collections.addAll(numbers, 1.0, 2.0, 3.0, 4.0);
		Double minDiff = new FindClosestElements().findClosestElements(numbers).get(0);
		assertTrue("minDiff!= 4.0", minDiff == 4.0);
	}


}
