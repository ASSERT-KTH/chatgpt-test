// AtRobotCompiler_3Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
*/
class AtRobotCompiler_3Test {

	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case that the source code contains a valid instruction.
	* The expected result is that the instruction is compiled.
	*/
	@Test
	void testCompile_1() throws Exception {
		String source = "; test\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n"