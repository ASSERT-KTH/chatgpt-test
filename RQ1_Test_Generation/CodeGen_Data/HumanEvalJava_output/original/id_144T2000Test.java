// SimplifyTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Simplify}.
* It contains one unit test case for the {@link Simplify#simplify(String, String)} method.
*/
class SimplifyTest {

    @Test
    public void testSimplify() {
        
        assertEquals("100", Simplify.simplify("100", "100"));
        assertEquals("0", Simplify.simplify("0", "0"));
        
        assertEquals("0", Simplify.simplify("2/3", "3/1"));
        assertEquals("1/3", Simplify.simplify("2/1", "1"));
        
        assertEquals("8/4", Simplify.simplify("4/5"));
        assertEquals("8/4", Simplify.simplify("4/5", "5/1"));
        try {
            assertTrue(Simplify.simplify("5/2", "3/1"));
            fail();
        } catch (java.lang.IllegalArgumentException e) {
            // expected case
        }
        
        assertEquals("10/7", Simplify.simplify("5/6", "5/7"));
        assertEquals("10/7", Simplify.simplify("5/7", "5/7"));
        assertEquals("1/5", Simplify.simplify("5/2", "5/1"));
        assertEquals("4/5/1", Simplify.simplify("4/5/1", "5/1"));
        assertEquals("10/7", Simplify.simplify("5/6", "5/1"));
        String[] expected = {"10", "1", "3", "7", "4", "5", "1", "8", "10", "1", "2", "2", "2", "4", "3"};
        assertEquals(expected, Simplify.simplify(
            "5/1",
            "5",
            "5'", // '''
            "5/11",
            "5 / 8 / 1 /1",
            "5/22",
            "6/1",
            "6 / 3 / 7",
            "6 / 7 / 4 * 12 /4"
            ));
        //assertEquals(expected, Simplify.simplify("5/1", "5", null));

        
    }
}