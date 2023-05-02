// Solve1Test.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve1}.
* It contains ten unit test cases for the {@link Solve1#solve(int)} method.
*/
class Solve1Test {

	@Test
	void testSolve1() {
		assertEquals("1010", Solve1.solve(10));
	}
	
	@Test
	void testSolve2() {
		assertEquals("11", Solve1.solve(3));
	}
	
	@Test
	void testSolve3() {
		assertEquals("101", Solve1.solve(5));
	}
	
	@Test
	void testSolve4() {
		assertEquals("1101", Solve1.solve(13));
	}
	
	@Test
	void testSolve5() {
		assertEquals("1101", Solve1.solve(13));
	}
	
	@Test
	void testSolve6() {
		assertEquals("1101", Solve1.solve(13));
	}
	
	@Test
	void testSolve7() {
		assertEquals("1101", Solve1.solve(13));
	}
	
	@Test
	void testSolve8() {
		assertEquals("1101", Solve1.solve(13));
	}
	
	@Test
	void testSolve9() {
		assertEquals("1101", Solve1.solve(13));
	}
	
	@Test
	void testSolve10() {
		assertEquals("1101", Solve1.solve(13));
	}
}

// Solve2.java
package scenario2;

class Solve2 {

    /**
     * Given a positive integer N, return the total sum of its digits in binary.
     *
     * Variables:
     *
     * @N integer
     * Constraints: 0 ≤ N ≤ 10000.
     * Output:
     * a string of binary number
     */
    public static String solve(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return Integer.toBinaryString(sum);
    }
}

// Solve2Test.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve2}.
* It contains ten unit test cases for the {@link Solve2#solve(int)} method.
*/
class Solve2Test {
		
	@Test
	void testSolve1() {
		assertEquals("1010", Solve2.solve(10));
	}
	
	@Test
	void testSolve2() {
		assertEquals("11", Solve2.solve(3));
	}
	
	@Test
	void testSolve3() {
		assertEquals("101", Solve2.solve(5));
	}
	
	@Test
	void testSolve4() {
		assertEquals("1101", Solve2.solve(13));
	}
	
	@Test
	void testSolve5() {
		assertEquals("1101", Solve2.solve(13));
	}
	
	@Test
	void testSolve6() {
		assertEquals("1101", Solve2.solve(13));
	}
	
	@Test
	void testSolve7() {
		assertEquals("1101", Solve2.solve(13));
	}
	
	@Test
	void testSolve8() {
		assertEquals("1101", Solve2.solve(13));
	}
	
	@Test
	void testSolve9() {
		assertEquals("1101", Solve2.solve(13));
	}
	
	@Test
	void testSolve10() {
		assertEquals("1101", Solve2.solve(13));
	}
}

// Solve3.java
package scenario2;

class Solve3 {

    /**
     * Given a positive integer N, return the total sum of its digits in binary.
     *
     * Variables:
     *
     * @N integer
     * Constraints: 0 ≤ N ≤ 10000.
     * Output:
     * a string of binary number
     */
    public static String solve(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return Integer.toBinaryString(sum);
    }
}

// Solve3Test.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve3}.
* It contains ten unit test cases for the {@link Solve3#solve(int)} method.
*/
class Solve3Test {
		
	@Test
	void testSolve1() {
		assertEquals("1010", Solve3.solve(10));
	}
	
	@Test
	void testSolve2() {
		assertEquals("11", Solve3.solve(3));
	}
	
	@Test
	void testSolve3() {
		assertEquals("101", Solve3.solve(5));
	}
	
	@Test
	void testSolve4() {
		assertEquals("1101", Solve3.solve(13));
	}
	
	@Test
	void testSolve5() {
		assertEquals("1101", Solve3.solve(13));
	}
	
	@Test
	void testSolve6() {
		assertEquals("1101", Solve3.solve(13));
	}
	
	@Test
	void testSolve7() {
		assertEquals("1101", Solve3.solve(13));
	}
	
	@Test
	void testSolve8() {
		assertEquals("1101", Solve3.solve(13));
	}
	
	@Test
	void testSolve9() {
		assertEquals("1101", Solve3.solve(13));
	}
	
	@Test
	void testSolve10() {
		assertEquals("1101", Solve3.solve(13));
	}
}

// Solve4.java
package scenario2;

class Solve4 {

    /**
     * Given a positive integer N, return the total sum of its digits in binary.
     *
     * Variables:
     *
     * @N integer
     * Constraints: 0 ≤ N ≤ 10000.
     * Output:
     * a string of binary number
     */
    public static String solve(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return Integer.toBinaryString(sum);
    }
}

// Solve4Test.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve4}.
* It contains ten unit test cases for the {@link Solve4#solve(int)} method.
*/
class Solve4Test {
		
	@Test
	void testSolve1() {
		assertEquals("1010", Solve4.solve(10));
	}
	
	@Test
	void testSolve2() {
		assertEquals("11", Solve4.solve(3));
	}
	
	@Test
	void testSolve3() {
		assertEquals("101", Solve4.solve(5));
	}
	
	@Test
	void testSolve4() {
		assertEquals("1101", Solve4.solve(13));
	}
	
	@