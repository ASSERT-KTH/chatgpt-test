// EncodeTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encode}.
* It contains one unit test case for the {@link Encode#encode(String)} method.
*/
class EncodeTest {
@Test
		void testEncode() {
		String message = "This is a message";
        assertEquals("This is a message", Encode.encode(message));
        assertEquals("This is a message", Encode.encode(message.toCharArray()));
	}
}