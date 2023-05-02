// JavaSource_1Test.java
package org.sourceforge.ifx.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link JavaSource}.
 * It contains ten unit test cases for the {@link JavaSource#hasSuperClass()} method.
 */
class JavaSource_1Test {

    @Test
    void testHasSuperClassWithSuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("SuperClass");
        assertTrue(javaSource.hasSuperClass());
    }

    @Test
    void testHasSuperClassWithoutSuperClass() {
        JavaSource javaSource = new JavaSource();
        assertFalse(javaSource.hasSuperClass());
    }

    @Test
    void testHasSuperClassWithEmptySuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("");
        assertTrue(javaSource.hasSuperClass());
    }

    @Test
    void testHasSuperClassWithNullSuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass(null);
        assertFalse(javaSource.hasSuperClass());
    }

    @Test
    void testHasSuperClassWithWhiteSpaceSuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("   ");
        assertTrue(javaSource.hasSuperClass());
    }

    @Test
    void testHasSuperClassWithTabSuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("\t");
        assertTrue(javaSource.hasSuperClass());
    }

    @Test
    void testHasSuperClassWithNewLineSuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("\n");
        assertTrue(javaSource.hasSuperClass());
    }

    @Test
    void testHasSuperClassWithCarriageReturnSuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("\r");
        assertTrue(javaSource.hasSuperClass());
    }

    @Test
    void testHasSuperClassWithMixedWhiteSpaceSuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("  \t\n\r  ");
        assertTrue(javaSource.hasSuperClass());
    }

    @Test
    void testHasSuperClassWithMixedNonWhiteSpaceSuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("Super Class");
        assertTrue(javaSource.hasSuperClass());
    }
}