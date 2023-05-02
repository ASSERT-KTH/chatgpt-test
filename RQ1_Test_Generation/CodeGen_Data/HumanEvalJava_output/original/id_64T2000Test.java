// VowelsCountTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VowelsCount}.
* It contains one unit test case for the {@link VowelsCount#vowelsCount(String)} method.
*/
class VowelsCountTest {
int vowelsCount(String o) {
		if (o.length() <= 1) {
			return 0;
		}
		String s = o;
		char c;
		for (int i = 0; i < s.length(); i++) {
		c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return 1;
        }
		}
		return 0;
}

		@Test
		void testVowelsCount(){
		System.out.println(VowelsCount.vowelsCount("abcd"));
                assertEquals("vowelsCount(\"abcd\")",VowelsCount.vowelsCount("abcd"),"vowelsCount(\"abcd\")");
		}

}
