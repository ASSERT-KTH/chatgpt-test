// Base64Coder_5Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decode(char[])} method.
*/
class Base64Coder_5Test {
// Base64Coder.java
package com.pmdesigns.jvc.tools;

public class Base64Coder {

    public static byte[] decode(char[] in) {
        int iLen = in.length;
        if (iLen % 4!= 0)
            throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
        while (iLen > 0 && in[iLen - 1] == '=') iLen--;
        int oLen = (iLen * 3) / 4;
        byte[] out = new byte[oLen];
        int ip = 0;
        int op = 0;
        while (ip < iLen) {
            int i0 = in[ip++];
            int i1 = in[ip++];
            int i2 = ip < iLen? in[ip++] : 'A';
            int i3 = ip < iLen? in[ip++] : 'A';
            if (i0 > 127 || i1 > 127 || i2 > 127 || i3 > 127)
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            int b0 = map2[i0];
            int b1 = map2[i1];
            int b2 = map2[i2];
            int b3 = map2[i3];
            if (b0 < 0 || b1 < 0 || b2 < 0 || b3 < 0)
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            int o0 = (b0 << 2) | (b1 >>> 4);
            int o1 = ((b1 & 0xf) << 4) | (b2 >>> 2);
            int o2 = ((b2 & 3) << 6) | b3;
            out[op++] = (byte) o0;
            if (op < oLen)
                out[op++] = (byte) o1;
            if (op < oLen)
                out[op++] = (byte) o2;
        }
        return out;
    }
}

// Base64Coder_5Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decode(char[])} method.
*/
class Base64Coder_5Test {
		
	/** Test method. */
	@Test
	public void testDecode_1(){
		
		String[] source = {
				"A",
				"AD"
				};
		
		final String output = "AADADADADDADADADADADADADADADADADADADADADADADADADADADAD";
		assertEquals(
				"The character 'A' must be decoded from 'ABC' using an output character of 'A'.",
				Base64Coder.decode(source).charAt(0),output.charAt(0));
	}
	
	/** Test method. */
	@Test
	public void testDecode_2(){
		
		String[] source = {
				"AA"
				};
		
		final String output = null;
		assertEquals(
				"No character must be decoded from 'AA' using a null output character.",
				Base64Coder.decode(source).charAt(0),output);
	}
	
	/** Test method. */
	@Test
	public void testDecode_3(){
		
		String[] source = {
				"AAA"
				};
		
		final String output = null;
		assertEquals(
				"No character must be decoded from 'AAA' using a null output character.",
				Base64Coder.decode(source).length(),output);
	}
}
