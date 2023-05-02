// CarRaceCollisionTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CarRaceCollision}.
* It contains one unit test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
*/
class CarRaceCollisionTest {
/**
		 * Basic {@link CarRaceCollision#carRaceCollision(int)}, 
		 * just an example.
		 */
	@Test
    public void test() {
        assertEquals(4, CarRaceCollision.carRaceCollision(1000));
    }
}
