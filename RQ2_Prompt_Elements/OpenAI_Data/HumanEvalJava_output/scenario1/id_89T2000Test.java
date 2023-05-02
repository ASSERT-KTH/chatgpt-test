// EncryptTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encrypt}.
* It contains ten unit test cases for the {@link Encrypt#encrypt(String)} method.
*/
class EncryptTest {

		/**
		* Test case for {@link Encrypt#encrypt(String)} method.
		* It tests if the method returns the correct encrypted string.
		*/
		@Test
		void testEncrypt() {
				assertEquals("cdefghijklmnopqrstuvwxyzab", Encrypt.encrypt("abcdefghijklmnopqrstuvwxyz"));
		}
		
		/**
		* Test case for {@link Encrypt#encrypt(String)} method.
		* It tests if the method returns the correct encrypted string.
		*/
		@Test
		void testEncrypt2() {
				assertEquals("cdefghijklmnopqrstuvwxyzab", Encrypt.encrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		}
		
		/**
		* Test case for {@link Encrypt#encrypt(String)} method.
		* It tests if the method returns the correct encrypted string.
		*/
		@Test
		void testEncrypt3() {
				assertEquals("cdefghijklmnopqrstuvwxyzab", Encrypt.encrypt("AbCdEfGhIjKlMnOpQrStUvWxYz"));
		}
		
		/**
		* Test case for {@link Encrypt#encrypt(String)} method.
		* It tests if the method returns the correct encrypted string.
		*/
		@Test
		void testEncrypt4() {
				assertEquals("cdefghijklmnopqrstuvwxyzab", Encrypt.encrypt("aBcDeFgHiJkLmNoPqRsTuVwXyZ"));
		}
		
		/**
		* Test case for {@link Encrypt#encrypt(String)} method.
		* It tests if the method returns the correct encrypted string.
		*/
		@Test
		void testEncrypt5() {
				assertEquals("cdefghijklmnopqrstuvwxyzab", Encrypt.encrypt("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		}
		
		/**
		* Test case for {@link Encrypt#encrypt(String)} method.
		* It tests if the method returns the correct encrypted string.
		*/
		@Test
		void testEncrypt6() {
				assertEquals("cdefghijklmnopqrstuvwxyzab", Encrypt.encrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"));
		}
		
		/**
		* Test case for {@link Encrypt#encrypt(String)} method.
		* It tests if the method returns the correct encrypted string.
		*/
		@Test
		void testEncrypt7() {
				assertEquals("cdefghijklmnopqrstuvwxyzab", Encrypt.encrypt("AbCdEfGhIjKlMnOpQrStUvWxYzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		}
		
		/**
		* Test case for {@link Encrypt#encrypt(String)} method.
		* It tests if the method returns the correct encrypted string.
		*/
		@Test
		void testEncrypt8() {
				assertEquals("cdefghijklmnopqrstuvwxyzab", Encrypt.encrypt("aBcDeFgHiJkLmNoPqRsTuVwXyZABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		}
		
		/**
		* Test case for {@link Encrypt#encrypt(String)} method.
		* It tests if the method returns the correct encrypted string.
		*/
		@Test
		void testEncrypt9() {
				assertEquals("cdefghijklmnopqrstuvwxyzab", Encrypt.encrypt("AbCdEfGhIjKlMnOpQrStUvWxYzabcdefghijklmnopqrstuvwxyz"));
		}
		
		/**
		* Test case for {@link Encrypt#encrypt(String)} method.
		* It tests if the method returns the correct encrypted string.
		*/
		@Test
		void testEncrypt10() {
				assertEquals("cdefghijklmnopqrstuvwxyzab", Encrypt.encrypt("aBcDeFgHiJkLmNoPqRsTuVwXyZabcdefghijklmnopqrstuvwxyz"));
		}
}

// Decrypt.java
package scenario1;

class Decrypt {

    public static String decrypt(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c -= 2 * 2;
                if (c < 'a') {
                    c += 26;
                }
            }
            result += c;
        }
        return result;
    }
}

// DecryptTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Decrypt}.
* It contains ten unit test cases for the {@link Decrypt#decrypt(String)} method.
*/
class DecryptTest {
		
		/**
		* Test case for {@link Decrypt#decrypt(String)} method.
		* It tests if the method returns the correct decrypted string.
		*/
		@Test
		void testDecrypt() {
				assertEquals("abcdefghijklmnopqrstuvwxyz", Decrypt.decrypt("cdefghijklmnopqrstuvwxyzab"));
		}
		
		/**
		* Test case for {@link Decrypt#decrypt(String)} method.
		* It tests if the method returns the correct decrypted string.
		*/
		@Test
		void testDecrypt2() {
				assertEquals("abcdefghijklmnopqrstuvwxyz", Decrypt.decrypt("CDEFGHIJKLMNOPQRSTUVWXYZAB"));
		}
		
		/**
		* Test case for {@link Decrypt#decrypt(String)} method.
		* It tests if the method returns the correct decrypted string.
		*/
		@Test
		void testDecrypt3() {
				assertEquals("abcdefghijklmnopqrstuvwxyz", Decrypt.decrypt("CdEfGhIjKlMnOpQrStUvWxYzAb"));
		}
		
		/**
		* Test case for {@link Decrypt#decrypt(String)} method.
		* It tests if the method returns the correct decrypted string.
		*/
		@Test
		void testDecrypt4() {
				assertEquals("abcdefghijklmnopqrstuvwxyz", Decrypt.decrypt("cDeFgHiJkLmNoPqRsTuVwXyZaB"));
		}
		
		/**
		* Test case for {@link Decrypt#decrypt(String)} method.
		* It tests if the method returns the correct decrypted string.
		*/
		@Test
		void testDecrypt5()