// RescaleToUnitTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RescaleToUnit}.
* It contains one unit test case for the {@link RescaleToUnit#rescaleToUnit(List)} method.
*/
class RescaleToUnitTest {
List<Double> numbers = new ArrayList();

	@Test
	public void testAddAndGet() {
	    numbers.add(12.0);
	    List<Double> expectedList = new ArrayList<Double>();
	    expectedList.add(18.0);
	    List<Double> newList = new ArrayList<Double>();
	    for (int i = 0; i < numbers.size(); i++) {
	        newList.add(numbers.get(i));
	    }
	    assertTrue(expectedList.equals(numbers));
	    assertTrue(newList.equals(numbers));
	}

	@Test
	public void testGet() {
        assertEquals(18.0, rescaleToUnit(numbers).get(0), 1E-12);
        assertEquals(12.0, rescaleToUnit(numbers).get(1), 1E-12);

        Assertions.assertEquals(1.0, rescaleToUnit(numbers).get(1), 1E-12);
        Assertions.assertEquals(0.0, rescaleToUnit(numbers).get(2), 1E-12);
        Assertions.assertEquals(0.5, rescaleToUnit(numbers).get(3), 1E-12);
        Assertions.assertEquals(0.75, rescaleToUnit(numbers).get(4), 1E-12);
    }
}
