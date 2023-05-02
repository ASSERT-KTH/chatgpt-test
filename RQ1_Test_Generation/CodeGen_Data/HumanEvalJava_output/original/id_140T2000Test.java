// FixSpacesTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FixSpaces}.
* It contains one unit test case for the {@link FixSpaces#fixSpaces(String)} method.
*/
class FixSpacesTest {
// FixSpaces.java
package original;

class FixSpaces {

    /**
     * * Given a string text, replace all spaces in it with underscores,
     * and if a string has more than 2 consecutive spaces,
     * then replace all consecutive spaces with -
     *
     * fixSpaces("Example") == "Example"
     * fixSpaces("Example 1") == "Example_1"
     * fixSpaces(" Example 2") == "_Example_2"
     * fixSpaces(" Example   3") == "_Example-3"
     *
     * > fixSpaces("Example")
     * "Example"
     * > fixSpaces("Mudasir Hanif ")
     * "Mudasir_Hanif_"
     * > fixSpaces("Yellow Yellow  Dirty  Fellow")
     * "Yellow_Yellow__Dirty__Fellow"
     * > fixSpaces("Exa   mple")
     * "Exa-mple"
     * > fixSpaces("   Exa 1 2 2 mple")
     * "-Exa_1_2_2_mple"
     */
    public static String fixSpaces(String text) {
        String new_text = "";
        int i = 0;
        int start = 0;
        int end = 0;
        while (i < text.length()) {
            if (text.charAt(i) =='') {
                end += 1;
            } else {
                if (end - start > 2) {
                    new_text += "-" + text.charAt(i);
                } else if (end - start > 0) {
                    new_text += "_".repeat(end - start) + text.charAt(i);
                } else {
                    new_text += text.charAt(i);
                }
                start = i + 1;
                end = i + 1;
            }
            i += 1;
        }
        if (end - start > 2) {
            new_text += "-";
        } else if (end - start > 0) {
            new_text += "_";
        }
        return new_text;
    }
}

// FixSpacesTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FixSpaces}.
* It contains one unit test case for the {@link FixSpaces#fixSpaces(String)} method.
*/
class FixSpacesTest {
		/** The expected result. */
		String result;

    /**
    * set the expected result.
    * @param result expected result.
    */
    public void setExpectedResult( String result ) {
        this.result = result;
    }

	/**
	 * Test method for {@link FixSpaces#fixSpaces(String)}.
	 */
	@Test
	public void test_0() {
		String result = FixSpaces.fixSpaces("Exa_1_2_2_mple");
		assertEquals("_", result);
		assertEquals(String.class, result.getClass());
		assertEquals("Exa_1_2_2_mple", result );
	}

	/**
	 * Test method for {@link FixSpaces#fixSpaces(String)}.
	 */
	@Test
	public void test_1() {
		String result = FixSpaces.fixSpaces("Mudasir");
		assertEquals("Mudasir__Dirty__Fellow", result);
		assertEquals(String.class, result.getClass());
		assertEquals("Mudasir__Dirty__Fellow", result );
	}

  	/**
	 * Test method for {@link FixSpaces#fixSpaces(String)}.
	 */
	@Test
	public void test_2a() {
		String result = FixSpaces.fixSpaces("Exa 1 2 2 mple");
		assertEquals("Exa-1_2_2_2_mple", result);
		assertEquals(String.class, result.getClass());
		assertEquals("Exa 1 2 2 mple", result );
	}

  	/**
	 * Test method for {@link FixSpaces#fixSpaces(String)}.
	 */
	@Test
	public void test_2b() {
		String result = FixSpaces.fixSpaces("Exa Fellow - 1 1 1 white1blackFellow - white1blackFellow");
		assertEquals("Exa-FellowFellow-", result);
		assertEquals(String.class, result.getClass());
		assertEquals("Exa-FellowFellow-", result );
	}
}

// FixSpacesTest.java