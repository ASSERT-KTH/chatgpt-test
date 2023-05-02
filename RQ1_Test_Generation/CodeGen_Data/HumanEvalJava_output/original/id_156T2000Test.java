// IntToMiniRomanTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IntToMiniRoman}.
* It contains one unit test case for the {@link IntToMiniRoman#intToMiniRoman(int)} method.
*/
class IntToMiniRomanTest {

    String[] numbers;

    public IntToMiniRomanTest() {
     this.numbers = new String[9];
        this.numbers[1] = "m";
        this.numbers[2] = "c";
        this.numbers[5] = "l";
        this.numbers[8] = "d";
    }

    @Test
    public void testMinRomanParity() {
        assertEquals("m2", new IntToMiniRoman().intToMiniRoman(1));
        assertEquals("l2", new IntToMiniRoman().intToMiniRoman(2));
        assertEquals("c2", new IntToMiniRoman().intToMiniRoman(6));
        assertEquals("d2", new IntToMiniRoman().intToMiniRoman(12));
        assertEquals("l10", new IntToMiniRoman().intToMiniRoman(1000));
        assertEquals("m10", new IntToMiniRoman().intToMiniRoman(900));
        assertEquals("c10", new IntToMiniRoman().intToMiniRoman(500));
        assertEquals("d10", new IntToMiniRoman().intToMiniRoman(400));
        assertEquals("l5", new IntToMiniRoman().intToMiniRoman(1000));
        assertEquals("l9", new IntToMiniRoman().intToMiniRoman(900));
        assertEquals("x", new IntToMiniRoman().intToMiniRoman(99));
        assertEquals("x0", new IntToMiniRoman().intToMiniRoman(99));
        assertEquals("x5", new IntToMiniRoman().intToMiniRoman(5));
        assertEquals("x1", new IntToMiniRoman().intToMiniRoman(5));
        assertEquals("x11", new IntToMiniRoman().intToMiniRoman(5));
        assertEquals("x11", new IntToMiniRoman().intToMiniRoman(5));
        assertEquals("c1", new IntToMiniRoman().intToMiniRoman(10));
        assertEquals("c10", new IntToMiniRoman().intToMiniRoman(10));
        assertEquals("c9", new IntToMiniRoman().intToMiniRoman(10));
        assertEquals("h8", new IntToMiniRoman().intToMiniRoman(4));
    }

	@Test
	public void testMaxRomanParity() {
		assertEquals("m2", new IntToMiniRoman().intToMiniRoman(100));
		assertEquals("l2", new IntToMiniRoman().intToMiniRoman(9));
        assertEquals("c2", new IntToMiniRoman().intToMiniRoman(100));
        assertEquals("d2", new IntToMiniRoman().intToMiniRoman(9));
        assertEquals("l10", new IntToMiniRoman().intToMiniRoman(100));
        assertEquals("m10", new IntToMiniRoman().intToMiniRoman(100));
        assertEquals("c10", new IntToMiniRoman().intToMiniRoman(100));
        assertEquals("d10", new IntToMiniRoman().intToMiniRoman(100));
        assertEquals("l5", new IntToMiniRoman().intToMiniRoman(1000));
        assertEquals("l9", new IntToMiniRoman().intToMiniRoman(900));
        assertEquals("x", new IntToMiniRoman().intToMiniRoman(100));
        assertEquals("x0", new IntToMiniRoman().intToMiniRoman(10));
        assertEquals("x5", new IntToMiniRoman().intToMiniRoman(2));
        assertEquals("x1", new IntToMiniRoman().intToMiniRoman(2));
        assertEquals("x11", new IntToMiniRoman().intToMiniRoman(2));
        assertEquals("x11", new IntToMiniRoman().intToMiniRoman(2));
        assertEquals("c1", new IntToMiniRoman().intToMiniRoman(10));
        assertEquals("c10", new IntToMiniRoman().intToMiniRoman(10));
        assertEquals("c9", new IntToMiniRoman().intToMiniRoman(10));
        assertEquals("h8", new IntToMiniRoman().intToMiniRoman(4));
	}
    
    @Test
    public void testAllRoman() {
        assertEquals("m_iiii_iii", new IntToMiniRoman().intToMiniRoman(100));
        assertEquals("v_iv_i", new IntToMiniRoman().intToMiniRoman(900));
        assertEquals("v_iv_i", new IntToMiniRoman().intToMiniRoman(500));
        assertEquals("v_iv_i", new IntToMiniRoman().intToMiniRoman(400));
        assertEquals("v_iv_i", new IntToMiniRoman().intToMiniRoman(1000));
        assertEquals("x_iiii_iii", new IntToMiniRoman().intToMiniRoman(900));
    }
}
