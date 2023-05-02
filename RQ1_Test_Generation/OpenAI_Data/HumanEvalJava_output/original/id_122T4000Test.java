// AddElementsTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AddElements}.
* It contains ten unit test cases for the {@link AddElements#addElements(List, int)} method.
*/
class AddElementsTest {

	@Test
	void testAddElements() {
		assertEquals(-4, AddElements.addElements(List.of(1, -2, -3, 41, 57, 76, 87, 88, 99), 3));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), 2));
		assertEquals(125, AddElements.addElements(List.of(11, 21, 3, 90, 5, 6, 7, 8, 9), 4));
		assertEquals(24, AddElements.addElements(List.of(111, 21, 3, 4000, 5, 6, 7, 8, 9), 4));
		assertEquals(1, AddElements.addElements(List.of(1), 1));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), 0));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), -1));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), -2));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), -3));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), -4));
	}
}

// AddElements.java
package refactored;

import java.util.List;

class AddElements {

    /**
     * * Given a non-empty array of integers arr and an integer k, return
     * the sum of the elements with at most two digits from the first k elements of arr.
     *
     * Example:
     *
     * Input: arr = [111,21,3,4000,5,6,7,8,9], k = 4
     * Output: 24 # sum of 21 + 3
     *
     * Constraints:
     * 1. 1 <= len(arr) <= 100
     * 2. 1 <= k <= len(arr)
     *
     * > addElements([1, -2, -3, 41, 57, 76, 87, 88, 99], 3)
     * -4
     * > addElements([111, 121, 3, 4000, 5, 6], 2)
     * 0
     * > addElements([11, 21, 3, 90, 5, 6, 7, 8, 9], 4)
     * 125
     * > addElements([111, 21, 3, 4000, 5, 6, 7, 8, 9], 4)
     * 24
     * > addElements([1], 1)
     * 1
     */
    public static int addElements(List<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }
}

// AddElementsTest.java
package refactored;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AddElements}.
* It contains ten unit test cases for the {@link AddElements#addElements(List, int)} method.
*/
class AddElementsTest {
		
	@Test
	void testAddElements() {
		assertEquals(-4, AddElements.addElements(List.of(1, -2, -3, 41, 57, 76, 87, 88, 99), 3));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), 2));
		assertEquals(125, AddElements.addElements(List.of(11, 21, 3, 90, 5, 6, 7, 8, 9), 4));
		assertEquals(24, AddElements.addElements(List.of(111, 21, 3, 4000, 5, 6, 7, 8, 9), 4));
		assertEquals(1, AddElements.addElements(List.of(1), 1));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), 0));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), -1));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), -2));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), -3));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), -4));
	}
}

// AddElements.java
package refactored;

import java.util.List;

class AddElements {

    /**
     * * Given a non-empty array of integers arr and an integer k, return
     * the sum of the elements with at most two digits from the first k elements of arr.
     *
     * Example:
     *
     * Input: arr = [111,21,3,4000,5,6,7,8,9], k = 4
     * Output: 24 # sum of 21 + 3
     *
     * Constraints:
     * 1. 1 <= len(arr) <= 100
     * 2. 1 <= k <= len(arr)
     *
     * > addElements([1, -2, -3, 41, 57, 76, 87, 88, 99], 3)
     * -4
     * > addElements([111, 121, 3, 4000, 5, 6], 2)
     * 0
     * > addElements([11, 21, 3, 90, 5, 6, 7, 8, 9], 4)
     * 125
     * > addElements([111, 21, 3, 4000, 5, 6, 7, 8, 9], 4)
     * 24
     * > addElements([1], 1)
     * 1
     */
    public static int addElements(List<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }
}

// AddElementsTest.java
package refactored;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AddElements}.
* It contains ten unit test cases for the {@link AddElements#addElements(List, int)} method.
*/
class AddElementsTest {
		
	@Test
	void testAddElements() {
		assertEquals(-4, AddElements.addElements(List.of(1, -2, -3, 41, 57, 76, 87, 88, 99), 3));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), 2));
		assertEquals(125, AddElements.addElements(List.of(11, 21, 3, 90, 5, 6, 7, 8, 9), 4));
		assertEquals(24, AddElements.addElements(List.of(111, 21, 3, 4000, 5, 6, 7, 8, 9), 4));
		assertEquals(1, AddElements.addElements(List.of(1), 1));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), 0));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), -1));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), -2));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), -3));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), -4));
	}
}

// AddElements.java
package refactored;

import java.util.List;

class AddElements {

    /**
     * * Given a non-empty array of integers arr and an integer k, return
     * the sum of the elements with at most two digits from the first k elements of arr.
     *
     * Example:
     *
     * Input: arr = [111,21,3,4000,5,6,7,8,9], k = 4
     * Output: 24 # sum of 21 + 3
     *
     * Constraints:
     * 1. 1 <= len(arr) <= 100
     * 2. 1 <= k <= len(arr)
     *
     * > addElements([1, -2, -3, 41, 57, 76, 87, 88, 99], 3)
     * -4
     * > addElements([111, 121, 3, 4000, 5, 6], 2)
     * 0
     * > addElements([11, 21, 3, 90, 5, 6, 7, 8, 9], 4)
     * 125
     * > addElements([111, 21, 3, 4000, 5, 6, 7, 8, 9], 4)
     * 24
     * > addElements([1], 1)
     * 1
     */
    public static int addElements(List<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }
}

// AddElementsTest.java
package refactored;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AddElements}.
* It contains ten unit test cases for the {@link AddElements#addElements(List, int)} method.
*/
class AddElementsTest {
		
	@Test
	void testAddElements() {
		assertEquals(-4, AddElements.addElements(List.of(1, -2, -3, 41, 57, 76, 87, 88, 99), 3));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), 2));
		assertEquals(125, AddElements.addElements(List.of(11, 21, 3, 90, 5, 6, 7, 8, 9), 4));
		assertEquals(24, AddElements.addElements(List.of(111, 21, 3, 4000, 5, 6, 7, 8, 9), 4));
		assertEquals(1, AddElements.addElements(List.of(1), 1));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), 0));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), -1));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), -2));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), -3));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), -4));
	}
}

// AddElements.java
package refactored;

import java.util.List;

class AddElements {

    /**
     * * Given a non-empty array of integers arr and an integer k, return
     * the sum of the elements with at most two digits from the first k elements of arr.
     *
     * Example:
     *
     * Input: arr = [111,21,3,4000,5,6,7,8,9], k = 4
     * Output: 24 # sum of 21 + 3
     *
     * Constraints:
     * 1. 1 <= len(arr) <= 100
     * 2. 1 <= k <= len(arr)
     *
     * > addElements([1, -2, -3, 41, 57, 76, 87, 88, 99], 3)
     * -4
     * > addElements([111, 121, 3, 4000, 5, 6], 2)
     * 0
     * > addElements([11, 21, 3, 90, 5, 6, 7, 8, 9], 4)
     * 125
     * > addElements([111, 21, 3, 4000, 5, 6, 7, 8, 9], 4)
     * 24
     * > addElements([1], 1)
     * 1
     */
    public static int addElements(List<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }
}

// AddElementsTest.java
package refactored;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AddElements}.
* It contains ten unit test cases for the {@link AddElements#addElements(List, int)} method.
*/
class AddElementsTest {
		
	@Test
	void testAddElements() {
		assertEquals(-4, AddElements.addElements(List.of(1, -2, -3, 41, 57, 76, 87, 88, 99), 3));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), 2));
		assertEquals(125, AddElements.addElements(List.of(11, 21, 3, 90, 5, 6, 7, 8, 9), 4));
		assertEquals(24, AddElements.addElements(List.of(111, 21, 3, 4000, 5, 6, 7, 8, 9), 4));
		assertEquals(1, AddElements.addElements(List.of(1), 1));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), 0));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), -1));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), -2));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), -3));
		assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), -4));
	}
}

// AddElements.java
package refactored;

import java.util.List;

class AddElements {

    /**
     * * Given a non-empty array of integers arr and an integer k, return
     * the sum of the elements with at most two digits from the first k elements of arr.
     *
     * Example:
     *
     * Input: arr