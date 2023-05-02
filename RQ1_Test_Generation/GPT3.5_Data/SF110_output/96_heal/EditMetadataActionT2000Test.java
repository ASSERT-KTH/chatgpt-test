// EditMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link EditMetadataAction}.
 * It contains ten unit test cases for the {@link EditMetadataAction#actionRequiresLogin()} method.
 */
class EditMetadataActionTest {

    /**
     * Test case to check if actionRequiresLogin() returns true.
     */
    @Test
    void testActionRequiresLoginTrue() {
        EditMetadataAction editMetadataAction = new EditMetadataAction();
        assertTrue(editMetadataAction.actionRequiresLogin());
    }

    /**
     * Test case to check if actionRequiresLogin() returns false.
     */
    @Test
    void testActionRequiresLoginFalse() {
        EditMetadataAction editMetadataAction = new EditMetadataAction();
        assertFalse(!editMetadataAction.actionRequiresLogin());
    }

    /**
     * Test case to check if actionRequiresLogin() returns true when called multiple times.
     */
    @Test
    void testActionRequiresLoginMultipleCalls() {
        EditMetadataAction editMetadataAction = new EditMetadataAction();
        assertTrue(editMetadataAction.actionRequiresLogin());
        assertTrue(editMetadataAction.actionRequiresLogin());
        assertTrue(editMetadataAction.actionRequiresLogin());
    }

    /**
     * Test case to check if actionRequiresLogin() returns false when called multiple times.
     */
    @Test
    void testActionRequiresLoginMultipleCallsFalse() {
        EditMetadataAction editMetadataAction = new EditMetadataAction();
        assertFalse(!editMetadataAction.actionRequiresLogin());
        assertFalse(!editMetadataAction.actionRequiresLogin());
        assertFalse(!editMetadataAction.actionRequiresLogin());
    }

    /**
     * Test case to check if actionRequiresLogin() returns true when called after calling it as false.
     */
    @Test
    void testActionRequiresLoginTrueAfterFalse() {
        EditMetadataAction editMetadataAction = new EditMetadataAction();
        assertFalse(!editMetadataAction.actionRequiresLogin());
        assertTrue(editMetadataAction.actionRequiresLogin());
    }

    /**
     * Test case to check if actionRequiresLogin() returns false when called after calling it as true.
     */
    @Test
    void testActionRequiresLoginFalseAfterTrue() {
        EditMetadataAction editMetadataAction = new EditMetadataAction();
        assertTrue(editMetadataAction.actionRequiresLogin());
        assertFalse(!editMetadataAction.actionRequiresLogin());
    }

    /**
     * Test case to check if actionRequiresLogin() returns true when called after calling it as true and false.
     */
    @Test
    void testActionRequiresLoginTrueAfterTrueAndFalse() {
        EditMetadataAction editMetadataAction = new EditMetadataAction();
        assertTrue(editMetadataAction.actionRequiresLogin());
        assertFalse(!editMetadataAction.actionRequiresLogin());
        assertTrue(editMetadataAction.actionRequiresLogin());
    }

    /**
     * Test case to check if actionRequiresLogin() returns false when called after calling it as false and true.
     */
    @Test
    void testActionRequiresLoginFalseAfterFalseAndTrue() {
        EditMetadataAction editMetadataAction = new EditMetadataAction();
        assertFalse(!editMetadataAction.actionRequiresLogin());
        assertTrue(editMetadataAction.actionRequiresLogin());
        assertFalse(!editMetadataAction.actionRequiresLogin());
    }

    /**
     * Test case to check if actionRequiresLogin() returns true when called after calling it as true multiple times.
     */
    @Test
    void testActionRequiresLoginTrueMultipleTrueCalls() {
        EditMetadataAction editMetadataAction = new EditMetadataAction();
        assertTrue(editMetadataAction.actionRequiresLogin());
        assertTrue(editMetadataAction.actionRequiresLogin());
        assertTrue(editMetadataAction.actionRequiresLogin());
    }

    /**
     * Test case to check if actionRequiresLogin() returns false when called after calling it as false multiple times.
     */
    @Test
    void testActionRequiresLoginFalseMultipleFalseCalls() {
        EditMetadataAction editMetadataAction = new EditMetadataAction();
        assertFalse(!editMetadataAction.actionRequiresLogin());
        assertFalse(!editMetadataAction.actionRequiresLogin());
        assertFalse(!editMetadataAction.actionRequiresLogin());
    }
}