// JavaSource_0Test.java
package org.sourceforge.ifx.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link JavaSource}.
 * It contains ten unit test cases for the {@link JavaSource#hasInterface()} method.
 */
class JavaSource_0Test {

    @Test
    void testHasInterfaceWithInterface() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("org.example.Interface");
        assertTrue(javaSource.hasInterface());
    }

    @Test
    void testHasInterfaceWithoutInterface() {
        JavaSource javaSource = new JavaSource();
        assertFalse(javaSource.hasInterface());
    }

    @Test
    void testHasInterfaceWithEmptyInterface() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("");
        assertTrue(javaSource.hasInterface());
    }

    @Test
    void testHasInterfaceWithNullInterface() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface(null);
        assertFalse(javaSource.hasInterface());
    }

    @Test
    void testHasInterfaceWithWhiteSpaceInterface() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("   ");
        assertTrue(javaSource.hasInterface());
    }

    @Test
    void testHasInterfaceWithMultipleWhiteSpaceInterface() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("   \t\n\r   ");
        assertTrue(javaSource.hasInterface());
    }

    @Test
    void testHasInterfaceWithInterfaceAndSuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("org.example.Interface");
        javaSource.setSuperClass("org.example.SuperClass");
        assertTrue(javaSource.hasInterface());
    }

    @Test
    void testHasInterfaceWithSuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("org.example.SuperClass");
        assertFalse(javaSource.hasInterface());
    }

    @Test
    void testHasInterfaceWithInterfaceAndEmptySuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("org.example.Interface");
        javaSource.setSuperClass("");
        assertTrue(javaSource.hasInterface());
    }
}