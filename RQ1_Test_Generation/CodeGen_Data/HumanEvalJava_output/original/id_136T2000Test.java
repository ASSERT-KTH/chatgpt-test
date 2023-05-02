// LargestSmallestIntegersTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestSmallestIntegers}.
* It contains one unit test case for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
*/
class LargestSmallestIntegersTest {
private LargestSmallestIntegers testObj = new LargestSmallestIntegers();

	/**
	* Returns the largest of the list.
	*
	* @return the largest value from list
	*/
	public List<Object> largestSmallest() {
        return testObj.largestSmallestIntegers(new ArrayList<>());
	}

}