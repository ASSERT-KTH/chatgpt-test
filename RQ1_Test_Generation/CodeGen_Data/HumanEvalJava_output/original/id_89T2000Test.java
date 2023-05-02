// EncryptTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encrypt}.
* It contains one unit test case for the {@link Encrypt#encrypt(String)} method.
*/
class EncryptTest {
/**
		 * Constructor of {@link EncryptTest}.
		 */
		public EncryptTest() {
		}
		/**
		* The constructor of {@link EncryptTest} creates one test case that will evaluate
		* the result of "Encrypt".
		*/
		@Test
		public final void testEncrypt( ) {
		assertNotNull( "encrypt(");
		assertNotNull( "encrypt(");
		assertNotNull( "encrypt(");
		assertNull( "encrypt (");
		assertArrayEquals( "encrypt(");
		Encrypt testEncrypt = new Encrypt();
		String s1 = testEncrypt.encrypt("" + EncryptTest.encrypt("" + EncryptTest.encrypt("" + EncryptTest.encrypt("" + EncryptTest.encrypt("" + EncryptTest.encrypt("abc"))))));
		String s2 = testEncrypt.encrypt("" + EncryptTest.encrypt("" + EncryptTest.encrypt("def")));
		String s3 = testEncrypt.encrypt("" + EncryptTest.encrypt("efghijklmnop"));
		assertNotNull( "encrypt(");
		assertNotNull( "encrypt(");
		assertNotNull( "encrypt(");
		assertNull( "encrypt (");
		assertNull( "encrypt (");
		assertArrayEquals( "encrypt(");
	}
}
