// Here's the updated version of the EncryptTest class with ten test cases for the encrypt method.

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncryptTest {

    @Test
    void testEncryptHi() {
        String expected = "lm";
        String actual = Encrypt.encrypt("hi");
        assertEquals(expected, actual);
    }

    @Test
    void testEncryptAsdfghjkl() {
        String expected = "ewhjklnop";
        String actual = Encrypt.encrypt("asdfghjkl");
        assertEquals(expected, actual);
    }

    @Test
    void testEncryptGf() {
        String expected = "kj";
        String actual = Encrypt.encrypt("gf");
        assertEquals(expected, actual);
    }

    @Test
    void testEncryptEt() {
        String expected = "ix";
        String actual = Encrypt.encrypt("et");
        assertEquals(expected, actual);
    }

    @Test
    void testEncryptFaewfawefaewg() {
        String expected = "jeiajeaijeiak";
        String actual = Encrypt.encrypt("faewfawefaewg");
        assertEquals(expected, actual);
    }

    @Test
    void testEncryptHellomyfriend() {
        String expected = "lippsqcjvmirh";
        String actual = Encrypt.encrypt("hellomyfriend");
        assertEquals(expected, actual);
    }

    @Test
    void testEncryptDxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh() {
        String expected = "hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl";
        String actual = Encrypt.encrypt("dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh");
        assertEquals(expected, actual);
    }

    @Test
    void testEncryptA() {
        String expected = "e";
        String actual = Encrypt.encrypt("a");
        assertEquals(expected, actual);
    }

    @Test
    void testEncryptEmptyString() {
        String expected = "";
        String actual = Encrypt.encrypt("");
        assertEquals(expected, actual);
    }

    @Test
    void testEncryptNonAlphabeticString() {
        String expected = "123";
        String actual = Encrypt.encrypt("123");
        assertEquals(expected, actual);
    }
}