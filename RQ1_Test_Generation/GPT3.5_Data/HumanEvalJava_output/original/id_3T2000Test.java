// BelowZero.java
package updated;

import java.util.List;

public class BelowZero {

    /**
     * You're given a list of deposit and withdrawal operations on a bank account that starts with
     * zero balance. Your task is to detect if at any point the balance of account falls below zero, and
     * at that point function should return True. Otherwise, it should return False.
     *
     * @param operations a list of deposit and withdrawal operations on a bank account
     * @return true if the balance of account falls below zero, false otherwise
     */
    public static boolean belowZero(List<Number> operations) {
        double balance = 0.0;
        for (Number operation : operations) {
            balance += operation.doubleValue();
            if (balance < 0) {
                return true;
            }
        }
        return false;
    }
}

// BelowZeroTest.java
package updated;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link BelowZero}.
 * It contains ten unit test cases for the {@link BelowZero#belowZero(List)} method.
 */
class BelowZeroTest {

    @Test
    void testEmptyList() {
        assertFalse(BelowZero.belowZero(Collections.emptyList()));
    }

    @Test
    void testPositiveOperations() {
        assertFalse(BelowZero.belowZero(Arrays.asList(1, 2, 3)));
    }

    @Test
    void testNegativeOperations() {
        assertTrue(BelowZero.belowZero(Arrays.asList(1, 2, -4, 5)));
    }

    @Test
    void testMixedOperations() {
        assertFalse(BelowZero.belowZero(Arrays.asList(1, 2, -3, 1, 2, -3)));
    }

    @Test
    void testPositiveOperationsAfterNegative() {
        assertTrue(BelowZero.belowZero(Arrays.asList(1, 2, -4, 5, 6)));
    }

    @Test
    void testNoNegativeBalance() {
        assertFalse(BelowZero.belowZero(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -4)));
    }

    @Test
    void testNegativeBalanceAtEnd() {
        assertTrue(BelowZero.belowZero(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -5)));
    }

    @Test
    void testNegativeBalanceAtStart() {
        assertTrue(BelowZero.belowZero(Arrays.asList(1, -2, 2, -2, 5, -5, 4, -4)));
    }

    @Test
    void testDoubleOperations() {
        assertTrue(BelowZero.belowZero(Arrays.asList(1.0, -2.5, 2.5, -2.5, 5.0, -5.0, 4.0, -4.0)));
    }

    @Test
    void testInvalidOperationType() {
        assertThrows(IllegalArgumentException.class, () -> BelowZero.belowZero(Arrays.asList("1", "2", "3")));
    }

    @Test
    void testNullList() {
        assertThrows(NullPointerException.class, () -> BelowZero.belowZero(null));
    }
}