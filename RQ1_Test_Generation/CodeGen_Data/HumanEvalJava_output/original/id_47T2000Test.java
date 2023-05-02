// MedianTest.java
package original;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Median}.
* It contains one unit test case for the {@link Median#median(List)} method.
*/
class MedianTest {

	// TODO Auto-generated method stub
    @SuppressWarnings("boxing")
	@Test void median( ){
        List<Integer> l = Collections.nCopies(4, 0);
        Integer a = Integer.valueOf(0);
        @SuppressWarnings( "unused" )
        List<Integer> b = Collections.nCopies(4, 15);
        Integer b1 = Integer.valueOf(4);
        Integer b2 = Integer.valueOf(15);
                               
        assertEquals(Integer.valueOf(10), median(l).intValue());
        assertEquals(15, median(l).intValue());
        assertEquals(4, median(l).intValue());
        assertEquals(4, median(l).intValue());
        assertEquals(10, median(l).intValue());
        assertEquals(4, median(l).intValue());
        assertEquals(15, median(l).intValue());
        assertEquals(4, median(l).intValue());
        assertEquals(8, median(l).intValue());
        
        assertEquals(a, median(l).intValue());
        assertEquals(b1, median(b).intValue());
        assertEquals(b2, median(b).intValue());
        
        assertEquals(b1, median(b).intValue());
        assertEquals(b2, median(b).intValue());
    }
	
}
/*
 * This Java source file.
 *  13/09/22 12:43:00
 *  created by: fb
 *  to complete: 13/11/22
 *  http://forum.jmodunit.org/showthread.php?178815-JunitCon.6
 */
