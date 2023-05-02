// GetMaxTriplesTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetMaxTriples}.
* It contains ten unit test cases for the {@link GetMaxTriples#getMaxTriples(int)} method.
*/
class GetMaxTriplesTest {

	@Test
	void testGetMaxTriples() {
		assertEquals(1, GetMaxTriples.getMaxTriples(5));
		assertEquals(4, GetMaxTriples.getMaxTriples(6));
		assertEquals(36, GetMaxTriples.getMaxTriples(10));
		assertEquals(53361, GetMaxTriples.getMaxTriples(100));
		assertEquals(0, GetMaxTriples.getMaxTriples(1));
		assertEquals(0, GetMaxTriples.getMaxTriples(2));
		assertEquals(0, GetMaxTriples.getMaxTriples(3));
		assertEquals(0, GetMaxTriples.getMaxTriples(4));
		assertEquals(0, GetMaxTriples.getMaxTriples(7));
		assertEquals(0, GetMaxTriples.getMaxTriples(8));
	}
}

// GetMaxTriples.java
package refactored;

class GetMaxTriples {

    /**
     * * You are given a positive integer n. You have to create an integer array a of length n.
     * For each i (1 ≤ i ≤ n), the value of a[i] = i * i - i + 1.
     * Return the number of triples (a[i], a[j], a[k]) of a where i < j < k,
     * and a[i] + a[j] + a[k] is a multiple of 3.
     *
     * Example :
     * Input: n = 5
     * Output: 1
     * Explanation:
     * a = [1, 3, 7, 13, 21]
     * The only valid triple is (1, 7, 13).
     *
     * > getMaxTriples(5)
     * 1
     * > getMaxTriples(6)
     * 4
     * > getMaxTriples(10)
     * 36
     * > getMaxTriples(100)
     * 53361
     */
    public static int getMaxTriples(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                for (int k = j + 1; k <= n; k++) {
                    if ((i * i - i + 1 + j * j - j + 1 + k * k - k + 1) % 3 == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

// GetMaxTriplesTest.java
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetMaxTriples}.
* It contains ten unit test cases for the {@link GetMaxTriples#getMaxTriples(int)} method.
*/
class GetMaxTriplesTest {
		
	@Test
	void testGetMaxTriples() {
		assertEquals(1, GetMaxTriples.getMaxTriples(5));
		assertEquals(4, GetMaxTriples.getMaxTriples(6));
		assertEquals(36, GetMaxTriples.getMaxTriples(10));
		assertEquals(53361, GetMaxTriples.getMaxTriples(100));
		assertEquals(0, GetMaxTriples.getMaxTriples(1));
		assertEquals(0, GetMaxTriples.getMaxTriples(2));
		assertEquals(0, GetMaxTriples.getMaxTriples(3));
		assertEquals(0, GetMaxTriples.getMaxTriples(4));
		assertEquals(0, GetMaxTriples.getMaxTriples(7));
		assertEquals(0, GetMaxTriples.getMaxTriples(8));
	}
}