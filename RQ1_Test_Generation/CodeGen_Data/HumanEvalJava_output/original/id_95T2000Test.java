// CheckDictCaseTest.java
package original;

import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckDictCase}.
* It contains one unit test case for the {@link CheckDictCase#checkDictCase(Object)} method.
*/
class CheckDictCaseTest {

    /**
     * Test of checkDictCase method, of class CheckDictCase.
     */
    @Test
    public void checkDictCaseTest() {
        System.out.println("checkDictCaseTest");
        Boolean success = CheckDictCase.checkDictCase(new Object());
        assertTrue("success: " + success, success);
        success = CheckDictCase.checkDictCase(null);
        assertTrue("success: " + success, success);
        success = CheckDictCase.checkDictCase(new Boolean(true));
        assertTrue("success: " + success, success);
        success = CheckDictCase.checkDictCase(null);
        assertTrue("success: " + success, success);
        success = CheckDictCase.checkDictCase(new Integer(1));
        assertTrue("success: " + success, success);
        success = CheckDictCase.checkDictCase(new Boolean(false));
        assertTrue("success: " + success, success);
        success = CheckDictCase.checkDictCase(null);
        assertTrue("success: " + success, success);
    }

}
