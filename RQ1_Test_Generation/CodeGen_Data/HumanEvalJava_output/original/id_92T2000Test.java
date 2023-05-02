// AnyIntTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AnyInt}.
* It contains one unit test case for the {@link AnyInt#anyInt(Number, Number, Number)} method.
*/
class AnyIntTest {
final TestObject tObj;
		
		/**
     * Constructor for {@link AnyIntTest}.
     *
     * All units test cases must begin with this method.
     *
	     * @param tObject the object under test
     */
	     public AnyIntTest(TestObject tObject) {
             this.tObj = tObject;
		}
		
    /**
     * Test instance of {@link AnyInt} where class is abstract.
     */
	public void testAnyIntClassAbstract () {
		throw new UnsupportedOperationException();
	}
	
// TESTS
    /**
     * Test get method for {@link AnyInt#getInt(Number)}.
     */
	@Test
	public void testGetInt() {
			throw new UnsupportedOperationException();
	}
	
// TESTS
    /**
     * Test set method for {@link AnyInt#setInt(Number, int)}.
     */
	@Test
	public void testSetInt() {
		throw new UnsupportedOperationException();
	}
	
// TESTS
    /**
     * Test equals method for {@link AnyInt#equals(Object)}.
     */
	@Test
	public void testEquals() {
		throw new UnsupportedOperationException();
	}
	
}