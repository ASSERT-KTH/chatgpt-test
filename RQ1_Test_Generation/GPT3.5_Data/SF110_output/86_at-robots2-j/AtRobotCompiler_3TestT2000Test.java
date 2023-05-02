// Source code for AtRobotCompiler_3Test.java

package net.virtualinfinity.atrobots.compiler;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link AtRobotCompiler}.
 * It contains ten unit test cases for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
 */
class AtRobotCompiler_3Test {

    /**
     * Test case for empty source code.
     */
    @Test
    void testEmptySource() throws IOException {
        final String source = "";
        final AtRobotCompilerOutput output = compileSource(source);
        assertEquals(0, output.getCompiledCode().length);
        assertEquals(0, output.getErrors().size());
    }

    /**
     * Test case for a single comment line.
     */
    @Test
    void testSingleComment() throws IOException {
        final String source = "; This is a comment";
        final AtRobotCompilerOutput output = compileSource(source);
        assertEquals(0, output.getCompiledCode().length);
        assertEquals(0, output.getErrors().size());
    }

    /**
     * Test case for a single instruction.
     */
    @Test
    void testSingleInstruction() throws IOException {
        final String source = "MOV 0, 1";
        final AtRobotCompilerOutput output = compileSource(source);
        assertEquals(1, output.getCompiledCode().length);
        assertEquals(0, output.getErrors().size());
    }

    /**
     * Test case for multiple instructions.
     */
    @Test
    void testMultipleInstructions() throws IOException {
        final String source = "MOV 0, 1\nADD 2, 3";
        final AtRobotCompilerOutput output = compileSource(source);
        assertEquals(2, output.getCompiledCode().length);
        assertEquals(0, output.getErrors().size());
    }

    /**
     * Test case for a label.
     */
    @Test
    void testLabel() throws IOException {
        final String source = "label: MOV 0, 1";
        final AtRobotCompilerOutput output = compileSource(source);
        assertEquals(1, output.getCompiledCode().length);
        assertEquals(0, output.getErrors().size());
    }

    /**
     * Test case for a label and an instruction.
     */
    @Test
    void testLabelAndInstruction() throws IOException {
        final String source = "label: MOV 0, 1\nADD 2, 3";
        final AtRobotCompilerOutput output = compileSource(source);
        assertEquals(2, output.getCompiledCode().length);
        assertEquals(0, output.getErrors().size());
    }

    /**
     * Test case for a label and a comment.
     */
    @Test
    void testLabelAndComment() throws IOException {
        final String source = "label: ; This is a comment";
        final AtRobotCompilerOutput output = compileSource(source);
        assertEquals(0, output.getCompiledCode().length);
        assertEquals(0, output.getErrors().size());
    }

    /**
     * Test case for a label, a comment, and an instruction.
     */
    @Test
    void testLabelCommentAndInstruction() throws IOException {
        final String source = "label: ; This is a comment\nADD 2, 3";
        final AtRobotCompilerOutput output = compileSource(source);
        assertEquals(1, output.getCompiledCode().length);
        assertEquals(0, output.getErrors().size());
    }

    /**
     * Test case for an invalid instruction.
     */
    @Test
    void testInvalidInstruction() throws IOException {
        final String source = "INVALID 0, 1";
        final AtRobotCompilerOutput output = compileSource(source);
        assertEquals(0, output.getCompiledCode().length);
        assertEquals(1, output.getErrors().size());
    }

    /**
     * Test case for an invalid label.
     */
    @Test
    void testInvalidLabel() throws IOException {
        final String source = "label: MOV 0, 1\ninvalid: ADD 2, 3";
        final AtRobotCompilerOutput output = compileSource(source);
        assertEquals(1, output.getCompiledCode().length);
        assertEquals(1, output.getErrors().size());
    }

    /**
     * Helper method to compile source code.
     *
     * @param source the source code.
     * @return the compiler output.
     * @throws IOException if there is an error reading the source code.
     */
    private AtRobotCompilerOutput compileSource(String source) throws IOException {
        final ByteArrayInputStream inputStream = new ByteArrayInputStream(source.getBytes());
        final LineNumberReader reader = new LineNumberReader(new InputStreamReader(inputStream));
        final AtRobotCompiler compiler = new AtRobotCompiler();
        return compiler.compile(reader);
    }
}