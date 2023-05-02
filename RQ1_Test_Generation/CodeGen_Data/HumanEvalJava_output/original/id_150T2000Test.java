// XOrYTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XOrY}.
* It contains one unit test case for the {@link XOrY#xOrY(int, int, int)} method.
*/
class XOrYTest {

    @Test
	public void testXOrY() {
		XorY xorY = new XorY();
		assertSame(xorY.xOrY(1, 1, 1), 1);
		assertSame(xorY.xOrY(4, 1, 1), 3);
		assertSame(xorY.xOrY(5, 1, 1), -1);
		assertSame(xorY.xOrY(6, 1, 1), 6);
		assertSame(xorY.xOrY(2, 1, 1), 2);
		assertSame(xorY.xOrY(34, 1, 1), 5);
		assertSame(xorY.xOrY(11, 1, 1), -7);

		assertSame(xorY.xOrY(7, 1, 1), 2);
		assertSame(xorY.xOrY(15, 1, 1), -5); // value
		assertSame(xorY.xOrY(3, 1, 1), 0); // prime
	}

}
