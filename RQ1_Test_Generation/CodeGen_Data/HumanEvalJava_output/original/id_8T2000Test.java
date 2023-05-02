// SumProductTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumProduct}.
* It contains one unit test case for the {@link SumProduct#sumProduct(List)} method.
*/
class SumProductTest {

	public final static Integer[] input = new Integer[]{10, 24, 3, 1};
		
	@Test
	public void single() {
		
		List<Integer> result = new ArrayList<Integer>();
		SumProduct sumProduct = new SumProduct(input);
		
		for (int j = 0; j < input.length; j++) {
			result.add(sumProduct.sumProduct(input[j]));
		}
		
		assertEquals(result.get(0), 50);
		assertEquals(result.get(1), 24);
		assertEquals(result.get(2), 3);
		assertEquals(result.get(3), 1);
	}
	
	@Test
	public void two() {
		
		List<Integer> result = new ArrayList<Integer>();
		
		for (int j = 0; j < input.length; j++) {
			result.add(new SumProduct(input).sumProduct(input[j]));
		}
		
		assertEquals(result.get(0), 10);
		assertEquals(result.get(1), 24);
	}
	
}