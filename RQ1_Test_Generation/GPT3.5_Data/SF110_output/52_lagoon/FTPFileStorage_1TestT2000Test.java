// FTPFileStorage_1Test.java
package nu.staldal.lagoon.filestorage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import nu.staldal.ftp.AuthenticationException;
import nu.staldal.ftp.FTPClient;
import nu.staldal.ftp.FTPException;
import nu.staldal.lagoon.core.LagoonContext;
import nu.staldal.lagoon.core.OutputHandler;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Test class of {@link FTPFileStorage}.
 * It contains ten unit test cases for the {@link FTPFileStorage#createFile(String)} method.
 */
class FTPFileStorage_1Test {

    private FTPFileStorage ftpFileStorage;
    private FTPClient ftpClient;
    private LagoonContext context;

    @BeforeEach
    void setUp() {
        ftpFileStorage = new FTPFileStorage();
        ftpClient = mock(FTPClient.class);
        context = mock(LagoonContext.class);
    }

    @Test
    void testCreateFile() throws IOException, FTPException, AuthenticationException {
        String pathname = "test.txt";
        OutputStream outputStream = mock(OutputStream.class);
        when(ftpClient.store(pathname)).thenReturn(outputStream);

        ftpFileStorage.ftp = ftpClient;
        OutputHandler outputHandler = ftpFileStorage.createFile(pathname);

        assertNotNull(outputHandler);
        assertEquals(FTPOutputHandler.class, outputHandler.getClass());
        assertEquals(pathname, ((FTPOutputHandler) outputHandler).currentPathname);
        assertEquals(outputStream, outputHandler.out);
    }

    @Test
    void testCreateFileIOException() throws IOException, FTPException, AuthenticationException {
        String pathname = "test.txt";
        when(ftpClient.store(pathname)).thenThrow(new IOException());

        ftpFileStorage.ftp = ftpClient;

        assertThrows(IOException.class, () -> ftpFileStorage.createFile(pathname));
    }

    @Test
    void testCreateFileFTPException() throws IOException, FTPException, AuthenticationException {
        String pathname = "test.txt";
        when(ftpClient.store(pathname)).thenThrow(new FTPException());

        ftpFileStorage.ftp = ftpClient;

        assertThrows(IOException.class, () -> ftpFileStorage.createFile(pathname));
    }

    @Test
    void testCreateFileAuthenticationException() throws IOException, FTPException, AuthenticationException {
        String pathname = "test.txt";
        when(ftpClient.store(pathname)).thenThrow(new AuthenticationException());

        ftpFileStorage.ftp = ftpClient;

        assertThrows(IOException.class, () -> ftpFileStorage.createFile(pathname));
    }

    @Test
    void testCreateFileIOExceptionReconnect() throws IOException, FTPException, AuthenticationException {
        String pathname = "test.txt";
        OutputStream outputStream = mock(OutputStream.class);
        when(ftpClient.store(pathname)).thenThrow(new IOException()).thenReturn(outputStream);

        ftpFileStorage.ftp = ftpClient;
        OutputHandler outputHandler = ftpFileStorage.createFile(pathname);

        assertNotNull(outputHandler);
        assertEquals(FTPOutputHandler.class, outputHandler.getClass());
        assertEquals(pathname, ((FTPOutputHandler) outputHandler).currentPathname);
        assertEquals(outputStream, outputHandler.out);
    }

    @Test
    void testCreateFileFTPExceptionReconnect() throws IOException, FTPException, AuthenticationException {
        String pathname = "test.txt";
        OutputStream outputStream = mock(OutputStream.class);
        when(ftpClient.store(pathname)).thenThrow(new FTPException()).thenReturn(outputStream);

        ftpFileStorage.ftp = ftpClient;
        OutputHandler outputHandler = ftpFileStorage.createFile(pathname);

        assertNotNull(outputHandler);
        assertEquals(FTPOutputHandler.class, outputHandler.getClass());
        assertEquals(pathname, ((FTPOutputHandler) outputHandler).currentPathname);
        assertEquals(outputStream, outputHandler.out);
    }

    @Test
    void testCreateFileAuthenticationExceptionReconnect() throws IOException, FTPException, AuthenticationException {
        String pathname = "test.txt";
        OutputStream outputStream = mock(OutputStream.class);
        when(ftpClient.store(pathname)).thenThrow(new AuthenticationException()).thenReturn(outputStream);

        ftpFileStorage.ftp = ftpClient;
        OutputHandler outputHandler = ftpFileStorage.createFile(pathname);

        assertNotNull(outputHandler);
        assertEquals(FTPOutputHandler.class, outputHandler.getClass());
        assertEquals(pathname, ((FTPOutputHandler) outputHandler).currentPathname);
        assertEquals(outputStream, outputHandler.out);
    }

    @Test
    void testCreateFileNullOutputStream() throws IOException, FTPException, AuthenticationException {
        String pathname = "test.txt";
        when(ftpClient.store(pathname)).thenReturn(null);

        ftpFileStorage.ftp = ftpClient;

        assertThrows(IOException.class, () -> ftpFileStorage.createFile(pathname));
    }

    @Test
    void testCreateFileNullFTPClient() throws IOException {
        String pathname = "test.txt";
        ftpFileStorage.ftp = null;

        assertThrows(NullPointerException.class, () -> ftpFileStorage.createFile(pathname));
    }

    @Test
    void testCreateFileNullPathname() throws IOException {
        ftpFileStorage.ftp = ftpClient;

        assertThrows(NullPointerException.class, () -> ftpFileStorage.createFile(null));
    }
}