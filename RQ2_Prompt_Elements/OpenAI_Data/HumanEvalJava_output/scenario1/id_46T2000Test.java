// Fib4Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib4}.
* It contains ten unit test cases for the {@link Fib4#fib4(int)} method.
*/
class Fib4Test {

	@Test
	void testFib4() {
		assertEquals(0, Fib4.fib4(1));
		assertEquals(0, Fib4.fib4(2));
		assertEquals(2, Fib4.fib4(3));
		assertEquals(2, Fib4.fib4(4));
		assertEquals(4, Fib4.fib4(5));
		assertEquals(6, Fib4.fib4(6));
		assertEquals(10, Fib4.fib4(7));
		assertEquals(16, Fib4.fib4(8));
		assertEquals(26, Fib4.fib4(9));
		assertEquals(42, Fib4.fib4(10));
	}
}

// Fib5.java
package scenario1;

class Fib5 {

    public static int fib5(int n) {
        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            return 2;
        }
        int a = 0;
        int b = 0;
        int c = 2;
        int d = 0;
        int e = 0;
        for (int i = 4; i <= n; i++) {
            e = a + b + c + d;
            a = b;
            b = c;
            c = d;
            d = e;
        }
        return e;
    }
}

// Fib5Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib5}.
* It contains ten unit test cases for the {@link Fib5#fib5(int)} method.
*/
class Fib5Test {
		
	@Test
	void testFib5() {
		assertEquals(0, Fib5.fib5(1));
		assertEquals(0, Fib5.fib5(2));
		assertEquals(2, Fib5.fib5(3));
		assertEquals(2, Fib5.fib5(4));
		assertEquals(4, Fib5.fib5(5));
		assertEquals(6, Fib5.fib5(6));
		assertEquals(10, Fib5.fib5(7));
		assertEquals(16, Fib5.fib5(8));
		assertEquals(26, Fib5.fib5(9));
		assertEquals(42, Fib5.fib5(10));
	}
}

// Fib6.java
package scenario1;

class Fib6 {

    public static int fib6(int n) {
        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            return 2;
        }
        int a = 0;
        int b = 0;
        int c = 2;
        int d = 0;
        int e = 0;
        for (int i = 4; i <= n; i++) {
            e = a + b + c + d;
            a = b;
            b = c;
            c = d;
            d = e;
        }
        return e;
    }
}

// Fib6Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib6}.
* It contains ten unit test cases for the {@link Fib6#fib6(int)} method.
*/
class Fib6Test {
		
	@Test
	void testFib6() {
		assertEquals(0, Fib6.fib6(1));
		assertEquals(0, Fib6.fib6(2));
		assertEquals(2, Fib6.fib6(3));
		assertEquals(2, Fib6.fib6(4));
		assertEquals(4, Fib6.fib6(5));
		assertEquals(6, Fib6.fib6(6));
		assertEquals(10, Fib6.fib6(7));
		assertEquals(16, Fib6.fib6(8));
		assertEquals(26, Fib6.fib6(9));
		assertEquals(42, Fib6.fib6(10));
	}
}

// Fib7.java
package scenario1;

class Fib7 {

    public static int fib7(int n) {
        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            return 2;
        }
        int a = 0;
        int b = 0;
        int c = 2;
        int d = 0;
        int e = 0;
        for (int i = 4; i <= n; i++) {
            e = a + b + c + d;
            a = b;
            b = c;
            c = d;
            d = e;
        }
        return e;
    }
}

// Fib7Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib7}.
* It contains ten unit test cases for the {@link Fib7#fib7(int)} method.
*/
class Fib7Test {
		
	@Test
	void testFib7() {
		assertEquals(0, Fib7.fib7(1));
		assertEquals(0, Fib7.fib7(2));
		assertEquals(2, Fib7.fib7(3));
		assertEquals(2, Fib7.fib7(4));
		assertEquals(4, Fib7.fib7(5));
		assertEquals(6, Fib7.fib7(6));
		assertEquals(10, Fib7.fib7(7));
		assertEquals(16, Fib7.fib7(8));
		assertEquals(26, Fib7.fib7(9));
		assertEquals(42, Fib7.fib7(10));
	}
}

// Fib8.java
package scenario1;

class Fib8 {

    public static int fib8(int n) {
        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            return 2;
        }
        int a = 0;
        int b = 0;
        int c = 2;
        int d = 0;
        int e = 0;
        for (int i = 4; i <= n; i++) {
            e = a + b + c + d;
            a = b;
            b = c;
            c = d;
            d = e;
        }
        return e;
    }
}

// Fib8Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib8}.
* It contains ten unit test cases for the {@link Fib8#fib8(int)} method.
*/
class Fib8Test {
		
	@Test
	void testFib8() {
		assertEquals(0, Fib8.fib8(1));
		assertEquals(0, Fib8.fib8(2));
		assertEquals(2, Fib8.fib8(3));
		assertEquals(2, Fib8.fib8(4));
		assertEquals(4, Fib8.fib8(5));
		assertEquals(6, Fib8.fib8(6));
		assertEquals(10, Fib8.fib8(7));
		assertEquals(16, Fib8.fib8(8));
		assertEquals(26, Fib8.fib8