// Here's an implementation of the JniInchiStructure_4Test class with ten unit test cases for the getBond() method.

class JniInchiStructure_4Test {

    @Test
    void testGetBondWithValidIndex() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond = new JniInchiBond();
        structure.bondList.add(bond);
        assertEquals(bond, structure.getBond(0));
    }

    @Test
    void testGetBondWithNegativeIndex() {
        JniInchiStructure structure = new JniInchiStructure();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            structure.getBond(-1);
        });
    }

    @Test
    void testGetBondWithIndexGreaterThanSize() {
        JniInchiStructure structure = new JniInchiStructure();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            structure.getBond(1);
        });
    }

    @Test
    void testGetBondWithEmptyList() {
        JniInchiStructure structure = new JniInchiStructure();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            structure.getBond(0);
        });
    }

    @Test
    void testGetBondWithNullList() {
        JniInchiStructure structure = new JniInchiStructure();
        structure.bondList = null;
        assertThrows(NullPointerException.class, () -> {
            structure.getBond(0);
        });
    }

    @Test
    void testGetBondWithNonBondObjectInList() {
        JniInchiStructure structure = new JniInchiStructure();
        structure.bondList.add(new Object());
        assertThrows(ClassCastException.class, () -> {
            structure.getBond(0);
        });
    }

    @Test
    void testGetBondWithNullObjectInList() {
        JniInchiStructure structure = new JniInchiStructure();
        structure.bondList.add(null);
        assertThrows(NullPointerException.class, () -> {
            structure.getBond(0);
        });
    }

    @Test
    void testGetBondWithValidIndexAndMultipleBonds() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond1 = new JniInchiBond();
        JniInchiBond bond2 = new JniInchiBond();
        structure.bondList.add(bond1);
        structure.bondList.add(bond2);
        assertEquals(bond2, structure.getBond(1));
    }

    @Test
    void testGetBondWithValidIndexAndMultipleTypesOfBonds() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond1 = new JniInchiBond();
        JniInchiBond bond2 = new JniInchiBond();
        structure.bondList.add(bond1);
        structure.bondList.add(new Object());
        structure.bondList.add(bond2);
        assertEquals(bond2, structure.getBond(2));
    }

    @Test
    void testGetBondWithValidIndexAndMultipleNullBonds() {
        JniInchiStructure structure = new JniInchiStructure();
        structure.bondList.add(null);
        structure.bondList.add(null);
        JniInchiBond bond = new JniInchiBond();
        structure.bondList.add(bond);
        assertEquals(bond, structure.getBond(2));
    }
}