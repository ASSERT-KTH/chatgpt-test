// WillItFlyTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WillItFly}.
* It contains one unit test case for the {@link WillItFly#willItFly(List, int)} method.
*/
class WillItFlyTest {
// WillItFly.java
package scenario2;

import java.util.List;

class WillItFly {

    /**
     * * Write a function that returns True if the object q will fly, and False otherwise.
     * The object q will fly if it's balanced (it is a palindromic list) and the sum of its elements is less than or equal the maximum possible weight w.
     */
    public static Boolean willItFly(List<Integer> q, int w) {
        int sum = 0;
        for (int i = 0; i < q.size(); i++) {
            sum += q.get(i);
        }
        if (sum > w) {
            return false;
        }
        for (int i = 0; i < q.size() / 2; i++) {
            if (q.get(i)!= q.get(q.size() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

// WillItFlyTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WillItFly}.
* It contains one unit test case for the {@link WillItFly#willItFly(List, int)} method.
*/
class WillItFlyTest {
		@Test
    public void test() {
        List<Integer> q = new List<Integer>();
        q.add(1);
        q.add(2);

        assertTrue(willItFly(q, 3));
        assertFalse(willItFly(q, 6));
    }
}
