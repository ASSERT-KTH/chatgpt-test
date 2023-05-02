// FTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link F}.
* It contains one unit test case for the {@link F#f(int)} method.
*/
class FTest {
// F.java
package original;

import java.util.ArrayList;
import java.util.List;

class F {

    /**
     * Implement the function f that takes n as a parameter,
     * and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
     * or the sum of numbers from 1 to i otherwise.
     * i starts from 1.
     * the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 *... * i).
     * Example:
     * f(5) == [1, 2, 6, 24, 15]
     *
     * > f(5)
     * [1, 2, 6, 24, 15]
     * > f(7)
     * [1, 2, 6, 24, 15, 720, 28]
     * > f(1)
     * [1]
     * > f(3)
     * [1, 2, 6]
     */
    public static List<Integer> f(int n) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result.add(factorial(i));
            } else {
                result.add(sum(i));
            }
        }
        return result;
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}

// FTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link F}.
* It contains one unit test case for the {@link F#f(int)} method.
*/
class FTest {
		private static final int[] a = new int[] {1, 2, 4, 10, 60, 1024, 512 };
	
		/**
		 * This unit test case contains a test case for the {@link F#f(int)} method, which takes two ints as input and returns a list of size (int) where the total number of elements is (int) * (int) * (int), such that the value of the element at index i is the factorial of i if i is even or the sum of numbers from 1 to i otherwise.
		 * 
		 * Example:
		 * {@code
		 *   int n = 12;
		 *   Integer[] f = f1(n);
		 * 
		 *   for (int i = 0; i < n; i++) {
		 *       list.add(factorial(i));
		 *   }
		 * }
		 * 
		 * 
		 */
		@Test
	public void test() {
		F f = new F();
		List<Integer> result = f.f(a.length);
		Integer[][] array = f.split(a.length);
		
		for (int i = 0; i < a.length; i++) {
			assertTrue(array[i][0] == array[i][array[i].length - 1]);
			Integer res = result.get(i);
			assertEquals(res, array[i][0]);
			Integer factorial = factorial(array[i][1]);
			assertEquals(factorial, a[i]);
		}
		
		System.out.println("Test passed");
	}

}

// FTest.java