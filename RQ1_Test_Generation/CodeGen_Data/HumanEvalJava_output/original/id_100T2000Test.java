// MakeAPileTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakeAPile}.
* It contains one unit test case for the {@link MakeAPile#makeAPile(int)} method.
*/
class MakeAPileTest {

    @Test
    public void makesAPile() {
            int n = 7 * 7;
            List<Integer> result = MakeAPile.makeAPile(n);
            assertContains(result, n);
            assertNotContains(result, n * 2);
    }
}


