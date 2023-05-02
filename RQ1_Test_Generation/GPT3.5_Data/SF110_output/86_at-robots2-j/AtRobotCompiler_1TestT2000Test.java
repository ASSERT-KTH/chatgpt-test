// Source code for AtRobotCompiler_1Test.java

package net.virtualinfinity.atrobots.compiler;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class of {@link AtRobotCompiler}.
 * It contains ten unit test cases for the {@link AtRobotCompiler#compile(InputStream)} method.
 */
class AtRobotCompiler_1Test {

    @Test
    void testCompileEmptySource() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8)));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobot().getInstructions().size());
    }

    @Test
    void testCompileSingleComment() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("; This is a comment".getBytes(StandardCharsets.UTF_8)));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobot().getInstructions().size());
    }

    @Test
    void testCompileSingleInstruction() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("MOV 0, 1".getBytes(StandardCharsets.UTF_8)));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobot().getInstructions().size());
    }

    @Test
    void testCompileMultipleInstructions() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("MOV 0, 1\nADD 1, 2".getBytes(StandardCharsets.UTF_8)));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(2, output.getRobot().getInstructions().size());
    }

    @Test
    void testCompileInvalidInstruction() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("INVALID".getBytes(StandardCharsets.UTF_8)));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobot().getInstructions().size());
    }

    @Test
    void testCompileInvalidArgumentCount() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("MOV 0".getBytes(StandardCharsets.UTF_8)));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobot().getInstructions().size());
    }

    @Test
    void testCompileInvalidArgumentType() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("MOV A, B".getBytes(StandardCharsets.UTF_8)));
        assertEquals(2, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobot().getInstructions().size());
    }

    @Test
    void testCompileInvalidLabel() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("LABEL:".getBytes(StandardCharsets.UTF_8)));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobot().getInstructions().size());
    }

    @Test
    void testCompileDuplicateLabel() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("LABEL\nLABEL:".getBytes(StandardCharsets.UTF_8)));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobot().getInstructions().size());
    }

    @Test
    void testCompileInvalidNumber() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("MOV A, B\nADD 1.5, 2".getBytes(StandardCharsets.UTF_8)));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobot().getInstructions().size());
    }

    @Test
    void testCompileInvalidCharacter() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("MOV A, B\nADD 1, 2, 3".getBytes(StandardCharsets.UTF_8)));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobot().getInstructions().size());
    }
}