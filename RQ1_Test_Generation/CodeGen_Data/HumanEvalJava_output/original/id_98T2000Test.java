// CountUpperTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpper}.
* It contains one unit test case for the {@link CountUpper#countUpper(String)} method.
*/
class CountUpperTest {

	@Test
	  public void test() {
	    assertEquals("CountUpper.countUpper('aBCdEf') returns 1", new CountUpper().countUpper("aBCdEf"));
	  }
}
