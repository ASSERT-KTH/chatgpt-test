// ProdSignsTest.java
package original;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ProdSigns}.
 * It contains ten unit test cases for the {@link ProdSigns#prodSigns(List)} method.
 */
class ProdSignsTest {

    @Test
    void testProdSigns() {
        List<Object> arr1 = Arrays.asList(1, 2, 2, -4);
        assertEquals(-9, ProdSigns.prodSigns(arr1));

        List<Object> arr2 = Arrays.asList(0, 1);
        assertEquals(0, ProdSigns.prodSigns(arr2));

        List<Object> arr3 = Arrays.asList(1, 1, 1, 2, 3, -1, 1);
        assertEquals(-10, ProdSigns.prodSigns(arr3));

        List<Object> arr4 = Collections.emptyList();
        assertNull(ProdSigns.prodSigns(arr4));

        List<Object> arr5 = Arrays.asList(2, 4, 1, 2, -1, -1, 9);
        assertEquals(20, ProdSigns.prodSigns(arr5));

        List<Object> arr6 = Arrays.asList(-1, 1, -1, 1);
        assertEquals(4, ProdSigns.prodSigns(arr6));

        List<Object> arr7 = Arrays.asList(-1, 1, 1, 1);
        assertEquals(-4, ProdSigns.prodSigns(arr7));

        List<Object> arr8 = Arrays.asList(-1, 1, 1, 0);
        assertEquals(0, ProdSigns.prodSigns(arr8));

        List<Object> arr9 = Arrays.asList(0, 0, 0);
        assertEquals(0, ProdSigns.prodSigns(arr9));

        List<Object> arr10 = Arrays.asList(-1, -2, -3);
        assertEquals(-6, ProdSigns.prodSigns(arr10));
    }
}