// Here is the source code for the LocalFileStorage_1Test class

package nu.staldal.lagoon.filestorage;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class of {@link LocalFileStorage}.
 * It contains ten unit test cases for the {@link LocalFileStorage#fileLastModified(String)} method.
 */
class LocalFileStorage_1Test {

    /**
     * Test case for a file that doesn't exist.
     */
    @Test
    void testFileLastModifiedNonExisting() throws IOException {
        LocalFileStorage storage = new LocalFileStorage();
        storage.open(".", null, null);
        long lastModified = storage.fileLastModified("non-existing-file.txt");
        assertEquals(0, lastModified);
        storage.close();
    }

    /**
     * Test case for a file that exists.
     */
    @Test
    void testFileLastModifiedExisting() throws IOException {
        LocalFileStorage storage = new LocalFileStorage();
        storage.open(".", null, null);
        File file = new File("test-file.txt");
        file.createNewFile();
        long lastModified = storage.fileLastModified("test-file.txt");
        assertEquals(file.lastModified(), lastModified);
        file.delete();
        storage.close();
    }

    /**
     * Test case for a file in a subdirectory that doesn't exist.
     */
    @Test
    void testFileLastModifiedNonExistingSubdirectory() throws IOException {
        LocalFileStorage storage = new LocalFileStorage();
        storage.open(".", null, null);
        long lastModified = storage.fileLastModified("non-existing-dir/non-existing-file.txt");
        assertEquals(0, lastModified);
        storage.close();
    }

    /**
     * Test case for a file in a subdirectory that exists.
     */
    @Test
    void testFileLastModifiedExistingSubdirectory() throws IOException {
        LocalFileStorage storage = new LocalFileStorage();
        storage.open(".", null, null);
        File dir = new File("test-dir");
        dir.mkdir();
        File file = new File(dir, "test-file.txt");
        file.createNewFile();
        long lastModified = storage.fileLastModified("test-dir/test-file.txt");
        assertEquals(file.lastModified(), lastModified);
        file.delete();
        dir.delete();
        storage.close();
    }

    /**
     * Test case for a file in a subdirectory that doesn't exist, but the parent directory does.
     */
    @Test
    void testFileLastModifiedNonExistingSubdirectoryParentExists() throws IOException {
        LocalFileStorage storage = new LocalFileStorage();
        storage.open(".", null, null);
        File dir = new File("existing-dir");
        dir.mkdir();
        long lastModified = storage.fileLastModified("existing-dir/non-existing-file.txt");
        assertEquals(0, lastModified);
        dir.delete();
        storage.close();
    }

    /**
     * Test case for a file in a subdirectory that exists, but the parent directory doesn't.
     */
    @Test
    void testFileLastModifiedExistingSubdirectoryParentNonExisting() throws IOException {
        LocalFileStorage storage = new LocalFileStorage();
        storage.open(".", null, null);
        long lastModified = storage.fileLastModified("non-existing-dir/test-file.txt");
        assertEquals(0, lastModified);
        storage.close();
    }

    /**
     * Test case for a file in the root directory.
     */
    @Test
    void testFileLastModifiedRoot() throws IOException {
        LocalFileStorage storage = new LocalFileStorage();
        storage.open(".", null, null);
        File file = new File("test-file.txt");
        file.createNewFile();
        long lastModified = storage.fileLastModified("/test-file.txt");
        assertEquals(file.lastModified(), lastModified);
        file.delete();
        storage.close();
    }

    /**
     * Test case for a file in the root directory that doesn't exist.
     */
    @Test
    void testFileLastModifiedRootNonExisting() throws IOException {
        LocalFileStorage storage = new LocalFileStorage();
        storage.open(".", null, null);
        long lastModified = storage.fileLastModified("/non-existing-file.txt");
        assertEquals(0, lastModified);
        storage.close();
    }

    /**
     * Test case for a file in a subdirectory of the root directory.
     */
    @Test
    void testFileLastModifiedSubdirectoryOfRoot() throws IOException {
        LocalFileStorage storage = new LocalFileStorage();
        storage.open(".", null, null);
        File dir = new File("test-dir");
        dir.mkdir();
        File file = new File(dir, "test-file.txt");
        file.createNewFile();
        long lastModified = storage.fileLastModified("/test-dir/test-file.txt");
        assertEquals(file.lastModified(), lastModified);
        file.delete();
        dir.delete();
        storage.close();
    }

    /**
     * Test case for a file in a subdirectory of the root directory that doesn't exist.
     */
    @Test
    void testFileLastModifiedSubdirectoryOfRootNonExisting() throws IOException {
        LocalFileStorage storage = new LocalFileStorage();
        storage.open(".", null, null);
        long lastModified = storage.fileLastModified("/non-existing-dir/test-file.txt");
        assertEquals(0, lastModified);
        storage.close();
    }
}