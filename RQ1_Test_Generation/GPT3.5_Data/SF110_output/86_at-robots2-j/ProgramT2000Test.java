// Here's an example of how you could write ten unit tests for the Program class:

@Test
void testCreateProgramMemory() {
    // Test case 1: empty program code
    Program program = new Program(new short[0]);
    MemoryArray memoryArray = program.createProgramMemory();
    assertEquals(0, memoryArray.getSize());

    // Test case 2: program code with one instruction
    program = new Program(new short[] { 0x0001 });
    memoryArray = program.createProgramMemory();
    assertEquals(1, memoryArray.getSize());
    assertEquals(0x0001, memoryArray.read(0));

    // Test case 3: program code with multiple instructions
    program = new Program(new short[] { 0x0001, 0x0002, 0x0003 });
    memoryArray = program.createProgramMemory();
    assertEquals(3, memoryArray.getSize());
    assertEquals(0x0001, memoryArray.read(0));
    assertEquals(0x0002, memoryArray.read(1));
    assertEquals(0x0003, memoryArray.read(2));

    // Test case 4: program code with negative instruction
    program = new Program(new short[] { -1 });
    memoryArray = program.createProgramMemory();
    assertEquals(1, memoryArray.getSize());
    assertEquals(-1, memoryArray.read(0));

    // Test case 5: program code with maximum positive instruction
    program = new Program(new short[] { Short.MAX_VALUE });
    memoryArray = program.createProgramMemory();
    assertEquals(1, memoryArray.getSize());
    assertEquals(Short.MAX_VALUE, memoryArray.read(0));

    // Test case 6: program code with maximum negative instruction
    program = new Program(new short[] { Short.MIN_VALUE });
    memoryArray = program.createProgramMemory();
    assertEquals(1, memoryArray.getSize());
    assertEquals(Short.MIN_VALUE, memoryArray.read(0));

    // Test case 7: program code with mixed positive and negative instructions
    program = new Program(new short[] { 0, 1, -1, 2, -2 });
    memoryArray = program.createProgramMemory();
    assertEquals(5, memoryArray.getSize());
    assertEquals(0, memoryArray.read(0));
    assertEquals(1, memoryArray.read(1));
    assertEquals(-1, memoryArray.read(2));
    assertEquals(2, memoryArray.read(3));
    assertEquals(-2, memoryArray.read(4));

    // Test case 8: program code with all zeroes
    program = new Program(new short[] { 0, 0, 0, 0, 0 });
    memoryArray = program.createProgramMemory();
    assertEquals(5, memoryArray.getSize());
    assertEquals(0, memoryArray.read(0));
    assertEquals(0, memoryArray.read(1));
    assertEquals(0, memoryArray.read(2));
    assertEquals(0, memoryArray.read(3));
    assertEquals(0, memoryArray.read(4));

    // Test case 9: program code with all ones
    program = new Program(new short[] { 1, 1, 1, 1, 1 });
    memoryArray = program.createProgramMemory();
    assertEquals(5, memoryArray.getSize());
    assertEquals(1, memoryArray.read(0));
    assertEquals(1, memoryArray.read(1));
    assertEquals(1, memoryArray.read(2));
    assertEquals(1, memoryArray.read(3));
    assertEquals(1, memoryArray.read(4));

    // Test case 10: program code with a mix of values
    program = new Program(new short[] { 0, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5 });
    memoryArray = program.createProgramMemory();
    assertEquals(11, memoryArray.getSize());
    assertEquals(0, memoryArray.read(0));
    assertEquals(1, memoryArray.read(1));
    assertEquals(2, memoryArray.read(2));
    assertEquals(3, memoryArray.read(3));
    assertEquals(4, memoryArray.read(4));
    assertEquals(5, memoryArray.read(5));
    assertEquals(-1, memoryArray.read(6));
    assertEquals(-2, memoryArray.read(7));
    assertEquals(-3, memoryArray.read(8));
    assertEquals(-4, memoryArray.read(9));
    assertEquals(-5, memoryArray.read(10));
}