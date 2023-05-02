// CorrectBracketingTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing}.
* It contains one unit test case for the {@link CorrectBracketing#correctBracketing(String)} method.
*/
class CorrectBracketingTest {

    /**
    * Verify the correctness of correctBracketing method.
	 * @throws {@code Exception}
	* @throws {@link java.lang.ArrayIndexOutOfBoundsException}
    *        if the brackets argument is invalid 
    */
    @Test
    public void testCorrectBracketing() throws Exception {
        assertEquals("<>", correctBracketing("<>"));
        assertFalse("<><><><><>", correctBracketing("<>"));
        assertEquals(">", correctBracketing("<>"));
        assertFalse(">><><><><>", correctBracketing("<>"));
        assertEquals("<><><>", correctBracketing("<>"));
    }

}
