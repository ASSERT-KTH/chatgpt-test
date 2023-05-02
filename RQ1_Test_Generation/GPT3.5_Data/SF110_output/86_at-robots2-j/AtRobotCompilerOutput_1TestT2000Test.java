// Test case 1: Test hasErrors() with no errors
@Test
void testHasErrorsNoErrors() {
    AtRobotCompilerOutput output = new AtRobotCompilerOutput(new Errors(), new Program(), new HardwareSpecification(), 100, new DebugInfo(), "Hello World");
    assertFalse(output.hasErrors());
}

// Test case 2: Test hasErrors() with errors
@Test
void testHasErrorsWithErrors() {
    Errors errors = new Errors();
    errors.addError("Syntax error on line 5");
    AtRobotCompilerOutput output = new AtRobotCompilerOutput(errors, null, null, 0, null, "");
    assertTrue(output.hasErrors());
}

// Test case 3: Test hasErrors() with program null and no errors
@Test
void testHasErrorsProgramNull() {
    Errors errors = new Errors();
    AtRobotCompilerOutput output = new AtRobotCompilerOutput(errors, null, new HardwareSpecification(), 100, new DebugInfo(), "");
    assertThrows(IllegalStateException.class, output::getProgram);
    assertTrue(output.hasErrors());
}

// Test case 4: Test hasErrors() with debugInfo null and no errors
@Test
void testHasErrorsDebugInfoNull() {
    Errors errors = new Errors();
    AtRobotCompilerOutput output = new AtRobotCompilerOutput(errors, new Program(), new HardwareSpecification(), 100, null, "");
    assertThrows(IllegalStateException.class, output::getDebugInfo);
    assertTrue(output.hasErrors());
}

// Test case 5: Test hasErrors() with hardwareSpecification null and no errors
@Test
void testHasErrorsHardwareSpecificationNull() {
    Errors errors = new Errors();
    AtRobotCompilerOutput output = new AtRobotCompilerOutput(errors, new Program(), null, 100, new DebugInfo(), "");
    assertThrows(IllegalStateException.class, output::getHardwareSpecification);
    assertTrue(output.hasErrors());
}

// Test case 6: Test hasErrors() with message null and no errors
@Test
void testHasErrorsMessageNull() {
    Errors errors = new Errors();
    AtRobotCompilerOutput output = new AtRobotCompilerOutput(errors, new Program(), new HardwareSpecification(), 100, new DebugInfo(), null);
    assertThrows(IllegalStateException.class, output::getMessage);
    assertTrue(output.hasErrors());
}

// Test case 7: Test hasErrors() with program and debugInfo null and no errors
@Test
void testHasErrorsProgramAndDebugInfoNull() {
    Errors errors = new Errors();
    AtRobotCompilerOutput output = new AtRobotCompilerOutput(errors, null, new HardwareSpecification(), 100, null, "");
    assertThrows(IllegalStateException.class, output::getProgram);
    assertThrows(IllegalStateException.class, output::getDebugInfo);
    assertTrue(output.hasErrors());
}

// Test case 8: Test hasErrors() with program and hardwareSpecification null and no errors
@Test
void testHasErrorsProgramAndHardwareSpecificationNull() {
    Errors errors = new Errors();
    AtRobotCompilerOutput output = new AtRobotCompilerOutput(errors, null, null, 100, new DebugInfo(), "");
    assertThrows(IllegalStateException.class, output::getProgram);
    assertThrows(IllegalStateException.class, output::getHardwareSpecification);
    assertTrue(output.hasErrors());
}

// Test case 9: Test hasErrors() with debugInfo and hardwareSpecification null and no errors
@Test
void testHasErrorsDebugInfoAndHardwareSpecificationNull() {
    Errors errors = new Errors();
    AtRobotCompilerOutput output = new AtRobotCompilerOutput(errors, new Program(), null, 100, null, "");
    assertThrows(IllegalStateException.class, output::getDebugInfo);
    assertThrows(IllegalStateException.class, output::getHardwareSpecification);
    assertTrue(output.hasErrors());
}

// Test case 10: Test hasErrors() with program, debugInfo, and hardwareSpecification null and no errors
@Test
void testHasErrorsProgramDebugInfoAndHardwareSpecificationNull() {
    Errors errors = new Errors();
    AtRobotCompilerOutput output = new AtRobotCompilerOutput(errors, null, null, 100, null, "");
    assertThrows(IllegalStateException.class, output::getProgram);
    assertThrows(IllegalStateException.class, output::getDebugInfo);
    assertThrows(IllegalStateException.class, output::getHardwareSpecification);
    assertTrue(output.hasErrors());
}