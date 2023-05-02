// Source code for AtRobotCompiler_2Test.java

package net.virtualinfinity.atrobots.compiler;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class of {@link AtRobotCompiler}.
 * It contains ten unit test cases for the {@link AtRobotCompiler#compile(Reader)} method.
 */
class AtRobotCompiler_2Test {

    @Test
    void testCompile_emptySource() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final String source = "";
        final AtRobotCompilerOutput output = compiler.compile(new StringReader(source));
        assertEquals(0, output.getCompiledCode().length);
    }

    @Test
    void testCompile_singleInstruction() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final String source = "MOV 0, 1";
        final AtRobotCompilerOutput output = compiler.compile(new StringReader(source));
        assertEquals(1, output.getCompiledCode().length);
        assertEquals(0x0100, output.getCompiledCode()[0]);
    }

    @Test
    void testCompile_multipleInstructions() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final String source = "MOV 0, 1\nADD 2, 3";
        final AtRobotCompilerOutput output = compiler.compile(new StringReader(source));
        assertEquals(2, output.getCompiledCode().length);
        assertEquals(0x0100, output.getCompiledCode()[0]);
        assertEquals(0x0203, output.getCompiledCode()[1]);
    }

    @Test
    void testCompile_comment() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final String source = "MOV 0, 1 ; This is a comment";
        final AtRobotCompilerOutput output = compiler.compile(new StringReader(source));
        assertEquals(1, output.getCompiledCode().length);
        assertEquals(0x0100, output.getCompiledCode()[0]);
    }

    @Test
    void testCompile_label() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final String source = "label: MOV 0, 1";
        final AtRobotCompilerOutput output = compiler.compile(new StringReader(source));
        assertEquals(1, output.getCompiledCode().length);
        assertEquals(0x0100, output.getCompiledCode()[0]);
        assertEquals(1, output.getLabels().size());
        assertEquals(0, output.getLabels().get("label"));
    }

    @Test
    void testCompile_labelWithOffset() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final String source = "ADD 1, label\nlabel: MOV 0, 1";
        final AtRobotCompilerOutput output = compiler.compile(new StringReader(source));
        assertEquals(2, output.getCompiledCode().length);
        assertEquals(0x0100, output.getCompiledCode()[1]);
        assertEquals(1, output.getLabels().size());
        assertEquals(1, output.getLabels().get("label"));
    }

    @Test
    void testCompile_duplicateLabel() {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final String source = "label: MOV 0, 1\nlabel: ADD 2, 3";
        assertThrows(DuplicateLabelException.class, () -> compiler.compile(new StringReader(source)));
    }

    @Test
    void testCompile_unknownLabel() {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final String source = "ADD 1, label";
        assertThrows(UnknownLabelException.class, () -> compiler.compile(new StringReader(source)));
    }

    @Test
    void testCompile_invalidInstruction() {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final String source = "INVALID 0, 1";
        assertThrows(InvalidInstructionException.class, () -> compiler.compile(new StringReader(source)));
    }

    @Test
    void testCompile_invalidOperand() {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final String source = "MOV 0, invalid";
        assertThrows(InvalidOperandException.class, () -> compiler.compile(new StringReader(source)));
    }
}