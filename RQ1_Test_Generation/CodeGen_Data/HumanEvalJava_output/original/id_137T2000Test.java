// CompareOneTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CompareOne}.
* It contains one unit test case for the {@link CompareOne#compareOne(Object, Object)} method.
*/
class CompareOneTest {
// CompareOne.java
package original;

class CompareOne {

    /**
     * Create a function that takes integers, floats, or strings representing
     * real numbers, and returns the larger variable in its given variable type.
     * Return null if the values are equal.
     * Note: If a real number is represented as a string, the floating point might be. or,
     *
     * compareOne(1, 2.5) ➞ 2.5
     * compareOne(1, "2,3") ➞ "2,3"
     * compareOne("5,1", "6") ➞ "6"
     * compareOne("1", 1) ➞ None
     *
     * > compareOne(1, 2)
     * 2
     * > compareOne(1, 2.5)
     * 2.5
     * > compareOne(2, 3)
     * 3
     * > compareOne(5, 6)
     * 6
     * > compareOne(1, "2,3")
     * "2,3"
     * > compareOne("5,1", "6")
     * "6"
     * > compareOne("1", "2")
     * "2"
     * > compareOne("1", 1)
     * null
     */
    public static Object compareOne(Object a, Object b) {
        Object temp_a = a;
        Object temp_b = b;
        if (temp_a instanceof String) {
            temp_a = ((String) temp_a).replace(',', '.');
        }
        if (temp_b instanceof String) {
            temp_b = ((String) temp_b).replace(',', '.');
        }
        if (Float.parseFloat(temp_a.toString()) == Float.parseFloat(temp_b.toString())) {
            return null;
        }
        return Float.parseFloat(temp_a.toString()) > Float.parseFloat(temp_b.toString())? a : b;
    }
}

// CompareOneTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CompareOne}.
* It contains one unit test case for the {@link CompareOne#compareOne(Object, Object)} method.
*/
class CompareOneTest {
		/**
		 * Unit test for {@link CompareOne#compareOne(Object, Object)}. 
		 *
		 * @throws java.lang.ArrayIndexOutOfBoundsException
		 * @throws java.lang.NullPointerException
		 */
	@Test
	public final void compareOneUnitTest1(){
		Object a = new String("aaa");
		assertEquals("2.5", compareOne(a, a));
		assertEquals("aaa", compareOne(a, new String("bbbb")));
	}
	
	/**
	 * Unit test for {@link CompareOne#compareOne(Object, Object)}. 
	 *
	 * @throws java.lang.ArrayIndexOutOfBoundsException
	 * @throws java.lang.NullPointerException
	 */
	@Test
	public final void compareOneUnitTest2() {
		Object a = "aaa";
		String b = "bbb";
		assertEquals("2.5", compareOne(a, b));
		assertEquals("aaa", compareOne(b, a));
	}
}
