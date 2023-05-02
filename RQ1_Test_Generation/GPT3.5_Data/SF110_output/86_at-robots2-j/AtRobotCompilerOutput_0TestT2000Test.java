// Test case 1: Test createRobotFactory with no errors and all parameters set
@Test
void testCreateRobotFactoryWithAllParameters() {
    AtRobotCompilerOutput output = new AtRobotCompilerOutput(new Errors(), new Program(), new HardwareSpecification(), 100, new DebugInfo(), "Hello World");
    RobotFactory factory = output.createRobotFactory("TestRobot");
    assertNotNull(factory);
}

// Test case 2: Test createRobotFactory with errors
@Test
void testCreateRobotFactoryWithErrors() {
    Errors errors = new Errors();
    errors.addError("Syntax error on line 5");
    AtRobotCompilerOutput output = new AtRobotCompilerOutput(errors, null, null, 0, null, null);
    assertThrows(IllegalStateException.class, () -> output.createRobotFactory("TestRobot"));
}

// Test case 3: Test createRobotFactory with null program
@Test
void testCreateRobotFactoryWithNullProgram() {
    Errors errors = new Errors();
    AtRobotCompilerOutput output = new AtRobotCompilerOutput(errors, null, new HardwareSpecification(), 100, new DebugInfo(), "Hello World");
    assertThrows(NullPointerException.class, () -> output.createRobotFactory("TestRobot"));
}

// Test case 4: Test createRobotFactory with null debug info
@Test
void testCreateRobotFactoryWithNullDebugInfo() {
    Errors errors = new Errors();
    AtRobotCompilerOutput output = new AtRobotCompilerOutput(errors, new Program(), new HardwareSpecification(), 100, null, "Hello World");
    assertThrows(NullPointerException.class, () -> output.createRobotFactory("TestRobot"));
}

// Test case 5: Test createRobotFactory with null hardware specification
@Test
void testCreateRobotFactoryWithNullHardwareSpecification() {
    Errors errors = new Errors();
    AtRobotCompilerOutput output = new AtRobotCompilerOutput(errors, new Program(), null, 100, new DebugInfo(), "Hello World");
    assertThrows(NullPointerException.class, () -> output.createRobotFactory("TestRobot"));
}

// Test case 6: Test getProgram with no errors
@Test
void testGetProgramWithNoErrors() {
    Program program = new Program();
    AtRobotCompilerOutput output = new AtRobotCompilerOutput(new Errors(), program, new HardwareSpecification(), 100, new DebugInfo(), "Hello World");
    assertEquals(program, output.getProgram());
}

// Test case 7: Test getProgram with errors
@Test
void testGetProgramWithErrors() {
    Errors errors = new Errors();
    errors.addError("Syntax error on line 5");
    AtRobotCompilerOutput output = new AtRobotCompilerOutput(errors, null, null, 0, null, null);
    assertThrows(IllegalStateException.class, () -> output.getProgram());
}

// Test case 8: Test getMessage with no errors
@Test
void testGetMessageWithNoErrors() {
    AtRobotCompilerOutput output = new AtRobotCompilerOutput(new Errors(), new Program(), new HardwareSpecification(), 100, new DebugInfo(), "Hello World");
    assertEquals("Hello World", output.getMessage());
}

// Test case 9: Test getMessage with errors
@Test
void testGetMessageWithErrors() {
    Errors errors = new Errors();
    errors.addError("Syntax error on line 5");
    AtRobotCompilerOutput output = new AtRobotCompilerOutput(errors, null, null, 0, null, null);
    assertThrows(IllegalStateException.class, () -> output.getMessage());
}

// Test case 10: Test getHardwareSpecification with no errors
@Test
void testGetHardwareSpecificationWithNoErrors() {
    HardwareSpecification hardwareSpecification = new HardwareSpecification();
    AtRobotCompilerOutput output = new AtRobotCompilerOutput(new Errors(), new Program(), hardwareSpecification, 100, new DebugInfo(), "Hello World");
    assertEquals(hardwareSpecification, output.getHardwareSpecification());
}