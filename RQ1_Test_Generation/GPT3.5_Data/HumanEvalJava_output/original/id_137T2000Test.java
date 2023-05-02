// CompareOneTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link CompareOne}.
 * It contains ten unit test cases for the {@link CompareOne#compareOne(Object, Object)} method.
 */
class CompareOneTest {

    @Test
    void testCompareOneIntegers() {
        assertEquals(2, CompareOne.compareOne(1, 2));
        assertEquals(2, CompareOne.compareOne(2, 1));
        assertEquals(3, CompareOne.compareOne(2, 3));
        assertEquals(6, CompareOne.compareOne(5, 6));
    }

    @Test
    void testCompareOneFloats() {
        assertEquals(2.5f, CompareOne.compareOne(1f, 2.5f));
        assertEquals(2.5f, CompareOne.compareOne(2.5f, 1f));
        assertEquals(3.5f, CompareOne.compareOne(2.5f, 3.5f));
        assertEquals(6.5f, CompareOne.compareOne(5.5f, 6.5f));
    }

    @Test
    void testCompareOneStrings() {
        assertEquals("2.3", CompareOne.compareOne("1", "2.3"));
        assertEquals("2.3", CompareOne.compareOne("2.3", "1"));
        assertEquals("3.5", CompareOne.compareOne("2.5", "3.5"));
        assertEquals("6.5", CompareOne.compareOne("5.5", "6.5"));
    }

    @Test
    void testCompareOneMixed() {
        assertNull(CompareOne.compareOne("1", 1));
        assertNull(CompareOne.compareOne(1, "1"));
        assertNull(CompareOne.compareOne("2.5", 2.5f));
        assertNull(CompareOne.compareOne(2.5f, "2.5"));
    }
}