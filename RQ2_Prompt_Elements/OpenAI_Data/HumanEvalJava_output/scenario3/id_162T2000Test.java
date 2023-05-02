// StringToMd5Test.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringToMd5}.
* It contains ten unit test cases for the {@link StringToMd5#stringToMd5(String)} method.
*/
class StringToMd5Test {

	@Test
	void testStringToMd5_1() {
		assertEquals("3e25960a79dbc69b674cd4ec67a72c62", StringToMd5.stringToMd5("Hello world"));
	}
	
	@Test
	void testStringToMd5_2() {
		assertEquals(null, StringToMd5.stringToMd5(""));
	}
	
	@Test
	void testStringToMd5_3() {
		assertEquals("0ef78513b0cb8cef12743f5aeb35f888", StringToMd5.stringToMd5("A B C"));
	}
	
	@Test
	void testStringToMd5_4() {
		assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
	}
	
	@Test
	void testStringToMd5_5() {
		assertEquals("d41d8cd98f00b204e9800998ecf8427e", StringToMd5.stringToMd5(""));
	}
	
	@Test
	void testStringToMd5_6() {
		assertEquals("900150983cd24fb0d6963f7d28e17f72", StringToMd5.stringToMd5("abc"));
	}
	
	@Test
	void testStringToMd5_7() {
		assertEquals("f96b697d7cb7938d525a2f31aaf161d0", StringToMd5.stringToMd5("message digest"));
	}
	
	@Test
	void testStringToMd5_8() {
		assertEquals("c3fcd3d76192e4007dfb496cca67e13b", StringToMd5.stringToMd5("abcdefghijklmnopqrstuvwxyz"));
	}
	
	@Test
	void testStringToMd5_9() {
		assertEquals("d174ab98d277d9f5a5611c2c9f419d9f", StringToMd5.stringToMd5("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"));
	}
	
	@Test
	void testStringToMd5_10() {
		assertEquals("57edf4a22be3c955ac49da2e2107b67a", StringToMd5.stringToMd5("12345678901234567890123456789012345678901234567890123456789012345678901234567890"));
	}
}