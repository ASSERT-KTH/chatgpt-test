// SumSquaresTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares}.
* It contains one unit test case for the {@link SumSquares#sumSquares(List)} method.
*/
class SumSquaresTest {

	@Test
    public void testSumSquaresList() {
		List<Number> numbersToSum =  new SumSquares().sumSquares(new List<Number>(2));
		assertNotNull(numbersToSum);
		assertNotNull(numbersToSum);
		numbersToSum =  new SumSquares().sumSquares(new List<Number>(5));
		assertNotNull(numbersToSum);
		assertNotNull(numbersToSum);
		numbersToSum =  new SumSquares().sumSquares(new List<Number>(10));
		assertNotNull(numbersToSum);
		assertNotNull(numbersToSum);
		numbersToSum =  new SumSquares().sumSquares(new List<Number>(0));
		assertNotNull(numbersToSum);
		assertNotNull(numbersToSum);
	}
}
