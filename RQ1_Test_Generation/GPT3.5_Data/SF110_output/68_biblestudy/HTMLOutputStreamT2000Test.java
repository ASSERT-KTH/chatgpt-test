// Test case for HTMLOutputStream reset method
class HTMLOutputStreamTest {

    @Test
    void testReset() {
        // Create a new HTMLOutputStream
        HttpServletResponse response = mock(HttpServletResponse.class);
        HTMLOutputStream outputStream = new HTMLOutputStream(response);

        // Write some data to the stream
        outputStream.print("Hello");
        outputStream.print(" World!");

        // Reset the stream and check that the contents are correct
        String contents = outputStream.reset();
        assertEquals("", outputStream.reset());
        assertEquals("Hello World!", contents);
    }

    @Test
    void testResetEmpty() {
        // Create a new HTMLOutputStream
        HttpServletResponse response = mock(HttpServletResponse.class);
        HTMLOutputStream outputStream = new HTMLOutputStream(response);

        // Reset the empty stream and check that the contents are empty
        assertEquals("", outputStream.reset());
    }

    @Test
    void testResetMultipleTimes() {
        // Create a new HTMLOutputStream
        HttpServletResponse response = mock(HttpServletResponse.class);
        HTMLOutputStream outputStream = new HTMLOutputStream(response);

        // Write some data to the stream
        outputStream.print("Hello");
        outputStream.print(" World!");

        // Reset the stream multiple times and check that the contents are correct
        String contents1 = outputStream.reset();
        String contents2 = outputStream.reset();
        assertEquals("", outputStream.reset());
        assertEquals("Hello World!", contents1);
        assertEquals("", contents2);
    }

    @Test
    void testResetAfterFlush() throws IOException {
        // Create a new HTMLOutputStream
        HttpServletResponse response = mock(HttpServletResponse.class);
        HTMLOutputStream outputStream = new HTMLOutputStream(response);

        // Write some data to the stream
        outputStream.print("Hello");
        outputStream.print(" World!");

        // Flush the stream and check that the contents are correct
        outputStream.flush();
        assertEquals("", outputStream.reset());

        // Write some more data to the stream
        outputStream.print("Goodbye");
        outputStream.print(" World!");

        // Reset the stream and check that the contents are correct
        String contents = outputStream.reset();
        assertEquals("", outputStream.reset());
        assertEquals("Goodbye World!", contents);
    }

    @Test
    void testResetAfterFlushEmpty() throws IOException {
        // Create a new HTMLOutputStream
        HttpServletResponse response = mock(HttpServletResponse.class);
        HTMLOutputStream outputStream = new HTMLOutputStream(response);

        // Flush the empty stream and check that the contents are empty
        outputStream.flush();
        assertEquals("", outputStream.reset());
    }

    @Test
    void testResetAfterFlushMultipleTimes() throws IOException {
        // Create a new HTMLOutputStream
        HttpServletResponse response = mock(HttpServletResponse.class);
        HTMLOutputStream outputStream = new HTMLOutputStream(response);

        // Write some data to the stream
        outputStream.print("Hello");
        outputStream.print(" World!");

        // Flush the stream multiple times and check that the contents are correct
        outputStream.flush();
        String contents1 = outputStream.reset();
        String contents2 = outputStream.reset();
        assertEquals("", outputStream.reset());
        assertEquals("Hello World!", contents1);
        assertEquals("", contents2);

        // Write some more data to the stream
        outputStream.print("Goodbye");
        outputStream.print(" World!");

        // Flush the stream multiple times and check that the contents are correct
        outputStream.flush();
        String contents3 = outputStream.reset();
        String contents4 = outputStream.reset();
        assertEquals("", outputStream.reset());
        assertEquals("Goodbye World!", contents3);
        assertEquals("", contents4);
    }

    @Test
    void testResetAfterFlushAndReset() throws IOException {
        // Create a new HTMLOutputStream
        HttpServletResponse response = mock(HttpServletResponse.class);
        HTMLOutputStream outputStream = new HTMLOutputStream(response);

        // Write some data to the stream
        outputStream.print("Hello");
        outputStream.print(" World!");

        // Flush the stream and check that the contents are correct
        outputStream.flush();
        assertEquals("", outputStream.reset());

        // Write some more data to the stream
        outputStream.print("Goodbye");
        outputStream.print(" World!");

        // Reset the stream and check that the contents are correct
        String contents1 = outputStream.reset();
        assertEquals("", outputStream.reset());
        assertEquals("Goodbye World!", contents1);

        // Write some more data to the stream
        outputStream.print("Hello");
        outputStream.print(" Again!");

        // Flush the stream and check that the contents are correct
        outputStream.flush();
        assertEquals("", outputStream.reset());

        // Write some more data to the stream
        outputStream.print("Goodbye");
        outputStream.print(" Again!");

        // Reset the stream and check that the contents are correct
        String contents2 = outputStream.reset();
        assertEquals("", outputStream.reset());
        assertEquals("Goodbye Again!", contents2);
    }

    @Test
    void testResetAfterFlushAndResetEmpty() throws IOException {
        // Create a new HTMLOutputStream
        HttpServletResponse response = mock(HttpServletResponse.class);
        HTMLOutputStream outputStream = new HTMLOutputStream(response);

        // Flush the empty stream and check that the contents are empty
        outputStream.flush();
        assertEquals("", outputStream.reset());

        // Reset the empty stream and check that the contents are empty
        assertEquals("", outputStream.reset());
    }

    @Test
    void testResetAfterFlushAndResetMultipleTimes() throws IOException {
        // Create a new HTMLOutputStream
        HttpServletResponse response = mock(HttpServletResponse.class);
        HTMLOutputStream outputStream = new HTMLOutputStream(response);

        // Write some data to the stream
        outputStream.print("Hello");
        outputStream.print(" World!");

        // Flush the stream and check that the contents are correct
        outputStream.flush();
        assertEquals("", outputStream.reset());

        // Write some more data to the stream
        outputStream.print("Goodbye");
        outputStream.print(" World!");

        // Reset the stream multiple times and check that the contents are correct
        String contents1 = outputStream.reset();
        String contents2 = outputStream.reset();
        assertEquals("", outputStream.reset());
        assertEquals("Goodbye World!", contents1);
        assertEquals("", contents2);

        // Write some more data to the stream
        outputStream.print("Hello");
        outputStream.print(" Again!");

        // Flush the stream and check that the contents are correct
        outputStream.flush();
        assertEquals("", outputStream.reset());

        // Write some more data to the stream
        outputStream.print("Goodbye");
        outputStream.print(" Again!");

        // Reset the stream multiple times and check that the contents are correct
        String contents3 = outputStream.reset();
        String contents4 = outputStream.reset();
        assertEquals("", outputStream.reset());
        assertEquals("Goodbye Again!", contents3);
        assertEquals("", contents4);
    }
}