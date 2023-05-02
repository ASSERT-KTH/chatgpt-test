// FileEncrypter_0Test.java
package osa.ora.server.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileEncrypter}.
* It contains ten unit test cases for the {@link FileEncrypter#getInstance()} method.
*/
class FileEncrypter_0Test {

    @Test
    void testGetInstance() {
        FileEncrypter instance1 = FileEncrypter.getInstance();
        assertNotNull(instance1);
        FileEncrypter instance2 = FileEncrypter.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    void testGetInstanceInit() {
        byte[] key = "test".getBytes();
        FileEncrypter instance1 = FileEncrypter.getInstanceInit(key);
        assertNotNull(instance1);
        FileEncrypter instance2 = FileEncrypter.getInstanceInit(key);
        assertSame(instance1, instance2);
    }

    @Test
    void testEncryptBlowfish() {
        byte[] key = "test".getBytes();
        FileEncrypter instance = FileEncrypter.getInstanceInit(key);
        byte[] data = "test".getBytes();
        byte[] encryptedData = instance.encryptBlowfish(data);
        assertNotNull(encryptedData);
        assertNotEquals(data, encryptedData);
    }

    @Test
    void testDecryptBlowfish() {
        byte[] key = "test".getBytes();
        FileEncrypter instance = FileEncrypter.getInstanceInit(key);
        byte[] data = "test".getBytes();
        byte[] encryptedData = instance.encryptBlowfish(data);
        byte[] decryptedData = instance.decryptBlowfish(encryptedData);
        assertNotNull(decryptedData);
        assertArrayEquals(data, decryptedData);
    }

    @Test
    void testFileEncrypt() {
        byte[] key = "test".getBytes();
        FileEncrypter instance = FileEncrypter.getInstanceInit(key);
        File inputFile = new File("test.txt");
        File outputFile = new File("test_encrypted.txt");
        byte[] encryptedData = instance.fileEncrypt(inputFile, outputFile);
        assertNotNull(encryptedData);
        assertTrue(outputFile.exists());
        assertTrue(outputFile.length() > 0);
        outputFile.delete();
    }

    @Test
    void testFileDecrypt() {
        byte[] key = "test".getBytes();
        FileEncrypter instance = FileEncrypter.getInstanceInit(key);
        File inputFile = new File("test.txt");
        File encryptedFile = new File("test_encrypted.txt");
        byte[] encryptedData = instance.fileEncrypt(inputFile, encryptedFile);
        File outputFile = new File("test_decrypted.txt");
        instance.fileDecrypt(encryptedData, outputFile);
        assertNotNull(outputFile);
        assertTrue(outputFile.exists());
        assertTrue(outputFile.length() > 0);
        outputFile.delete();
        encryptedFile.delete();
    }

    @Test
    void testMain() {
        FileEncrypter.main(new String[] {});
        File outputFile = new File("/osama4.zip");
        assertTrue(outputFile.exists());
        assertTrue(outputFile.length() > 0);
        outputFile.delete();
    }
}