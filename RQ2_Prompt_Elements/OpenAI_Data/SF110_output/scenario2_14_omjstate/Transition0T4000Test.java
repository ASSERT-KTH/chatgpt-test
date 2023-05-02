// TransitionTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains ten unit test cases for the {@link Transition#trigger(IState, Event)} method.
*/
class TransitionTest {

		/**
		* Test case for the {@link Transition#trigger(IState, Event)} method.
		* <p>
		*   Given a start state and an event the transition
		*     firstly evaluates if it applies by checking
		*     the start state and and event match its own.
		*     Once it ascertains it is for the start state/event
		*     combination, then the transition evaluates any
		*     guard conditions it has associated to it.
		*     If all the guard conditions evaluate to true,
		*     then the transition executes and returns the
		*     new state that the state machine is in.
		* Creation date: (14/02/01 6:14:35 PM)
		*
		* @author:
		*/
		@Test
		public void testTrigger() {
				// TODO: implement this test case
				// Ensure the normal expectations are met
				// Ensure the exceptional expectations are met
				fail("unverified");
		}
}

// Transition.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * A transition that is evaluated upon receiving an event.
 * <p>
 *   Given a start state and an event the transition
 *     firstly evaluates if it applies by checking
 *     the start state and and event match its own.
 *     Once it ascertains it is for the start state/event
 *     combination, then the transition evaluates any
 *     guard conditions it has associated to it.
 *     If all the guard conditions evaluate to true,
 *     then the transition executes and returns the
 *     new state that the state machine is in.
 * Creation date: (14/02/01 6:14:35 PM)
 *
 * @author:
 */
public class Transition {

    /**
     * Causes this Transition to fire.
     * Creation date: (14/02/01 6:21:09 PM)
     *
     * @author Don Stewart
     * @since 0.1
     * @param pCurrentState the current State
     * @param pEvent the Event to trigger
     * @return com.objectmentors.state.State
     */
    public final IState trigger(final IState pCurrentState, final Event pEvent) {
        IState retVal = pCurrentState;
        boolean passesGuards = false;
        if ((initialState.equals(pCurrentState)) && (triggerEvent.equals(pEvent))) {
            // Check if there are any guard conditions
            if (guardConditions.isEmpty()) {
                // No guards so just trigger
                passesGuards = true;
            } else {
                for (IGuardCondition ig : guardConditions) {
                    passesGuards = ig.evaluate(pEvent);
                }
            }
            if (passesGuards) {
                retVal = outcomeState;
            }
        }
        return retVal;
    }
}

// TransitionTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains ten unit test cases for the {@link Transition#trigger(IState, Event)} method.
*/
class TransitionTest {
		
		/**
		* Test case for the {@link Transition#trigger(IState, Event)} method.
		* <p>
		*   Given a start state and an event the transition
		*     firstly evaluates if it applies by checking
		*     the start state and and event match its own.
		*     Once it ascertains it is for the start state/event
		*     combination, then the transition evaluates any
		*     guard conditions it has associated to it.
		*     If all the guard conditions evaluate to true,
		*     then the transition executes and returns the
		*     new state that the state machine is in.
		* Creation date: (14/02/01 6:14:35 PM)
		*
		* @author:
		*/
		@Test
		public void testTrigger() {
				// TODO: implement this test case
				// Ensure the normal expectations are met
				// Ensure the exceptional expectations are met
				fail("unverified");
		}
}

// Transition.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * A transition that is evaluated upon receiving an event.
 * <p>
 *   Given a start state and an event the transition
 *     firstly evaluates if it applies by checking
 *     the start state and and event match its own.
 *     Once it ascertains it is for the start state/event
 *     combination, then the transition evaluates any
 *     guard conditions it has associated to it.
 *     If all the guard conditions evaluate to true,
 *     then the transition executes and returns the
 *     new state that the state machine is in.
 * Creation date: (14/02/01 6:14:35 PM)
 *
 * @author:
 */
public class Transition {

    /**
     * Causes this Transition to fire.
     * Creation date: (14/02/01 6:21:09 PM)
     *
     * @author Don Stewart
     * @since 0.1
     * @param pCurrentState the current State
     * @param pEvent the Event to trigger
     * @return com.objectmentors.state.State
     */
    public final IState trigger(final IState pCurrentState, final Event pEvent) {
        IState retVal = pCurrentState;
        boolean passesGuards = false;
        if ((initialState.equals(pCurrentState)) && (triggerEvent.equals(pEvent))) {
            // Check if there are any guard conditions
            if (guardConditions.isEmpty()) {
                // No guards so just trigger
                passesGuards = true;
            } else {
                for (IGuardCondition ig : guardConditions) {
                    passesGuards = ig.evaluate(pEvent);
                }
            }
            if (passesGuards) {
                retVal = outcomeState;
            }
        }
        return retVal;
    }
}

// TransitionTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains ten unit test cases for the {@link Transition#trigger(IState, Event)} method.
*/
class TransitionTest {
		
		/**
		* Test case for the {@link Transition#trigger(IState, Event)} method.
		* <p>
		*   Given a start state and an event the transition
		*     firstly evaluates if it applies by checking
		*     the start state and and event match its own.
		*     Once it ascertains it is for the start state/event
		*     combination, then the transition evaluates any
		*     guard conditions it has associated to it.
		*     If all the guard conditions evaluate to true,
		*     then the transition executes and returns the
		*     new state that the state machine is in.
		* Creation date: (14/02/01 6:14:35 PM)
		*
		* @author:
		*/
		@Test
		public void testTrigger() {
				// TODO: implement this test case
				// Ensure the normal expectations are met
				// Ensure the exceptional expectations are met
				fail("unverified");
		}
}

// Transition.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * A transition that is evaluated upon receiving an event.
 * <p>
 *   Given a start state and an event the transition
 *     firstly evaluates if it applies by checking
 *     the start state and and event match its own.
 *     Once it ascertains it is for the start state/event
 *     combination, then the transition evaluates any
 *     guard conditions it has associated to it.
 *     If all the guard conditions evaluate to true,
 *     then the transition executes and returns the
 *     new state that the state machine is in.
 * Creation date: (14/02/01 6:14:35 PM)
 *
 * @author:
 */
public class Transition {

    /**
     * Causes this Transition to fire.
     * Creation date: (14/02/01 6:21:09 PM)
     *
     * @author Don Stewart
     * @since 0.1
     * @param pCurrentState the current State
     * @param pEvent the Event to trigger
     * @return com.objectmentors.state.State
     */
    public final IState trigger(final IState pCurrentState, final Event pEvent) {
        IState retVal = pCurrentState;
        boolean passesGuards = false;
        if ((initialState.equals(pCurrentState)) && (triggerEvent.equals(pEvent))) {
            // Check if there are any guard conditions
            if (guardConditions.isEmpty()) {
                // No guards so just trigger
                passesGuards = true;
            } else {
                for (IGuardCondition ig : guardConditions) {
                    passesGuards = ig.evaluate(pEvent);
                }
            }
            if (passesGuards) {
                retVal = outcomeState;
            }
        }
        return retVal;
    }
}

// TransitionTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains ten unit test cases for the {@link Transition#trigger(IState, Event)} method.
*/
class TransitionTest {
		
		/**
		* Test case for the {@link Transition#trigger(IState, Event)} method.
		* <p>
		*   Given a start state and an event the transition
		*     firstly evaluates if it applies by checking
		*     the start state and and event match its own.
		*     Once it ascertains it is for the start state/event
		*     combination, then the transition evaluates any
		*     guard conditions it has associated to it.
		*     If all the guard conditions evaluate to true,
		*     then the transition executes and returns the
		*     new state that the state machine is in.
		* Creation date: (14/02/01 6:14:35 PM)
		*
		* @author:
		*/
		@Test
		public void testTrigger() {
				// TODO: implement this test case
				// Ensure the normal expectations are met
				// Ensure the exceptional expectations are met
				fail("unverified");
		}
}

// Transition.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * A transition that is evaluated upon receiving an event.
 * <p>
 *   Given a start state and an event the transition
 *     firstly evaluates if it applies by checking
 *     the start state and and event match its own.
 *     Once it ascertains it is for the start state/event
 *     combination, then the transition evaluates any
 *     guard conditions it has associated to it.
 *     If all the guard conditions evaluate to true,
 *     then the transition executes and returns the
 *     new state that the state machine is in.
 * Creation date: (14/02/01 6:14:35 PM)
 *
 * @author:
 */
public class Transition {

    /**
     * Causes this Transition to fire.
     * Creation date: (14/02/01 6:21:09 PM)
     *
     * @author Don Stewart
     * @since 0.1
     * @param pCurrentState the current State
     * @param pEvent the Event to trigger
     * @return com.objectmentors.state.State
     */
    public final IState trigger(final IState pCurrentState, final Event pEvent) {
        IState retVal = pCurrentState;
        boolean passesGuards = false;
        if ((initialState.equals(pCurrentState)) && (triggerEvent.equals(pEvent))) {
            // Check if there are any guard conditions
            if (guardConditions.isEmpty()) {
                // No guards so just trigger
                passesGuards = true;
            } else {
                for (IGuardCondition ig : guardConditions) {
                    passesGuards = ig.evaluate(pEvent);
                }
            }
            if (passesGuards) {
                retVal = outcomeState;
            }
        }
        return retVal;
    }
}

// TransitionTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains ten unit test cases for the {@link Transition#trigger(IState, Event)} method.
*/
class TransitionTest {
		
		/**
		* Test case for the {@link Transition#trigger(IState, Event)} method.
		* <p>
		*   Given a start state and an event the transition
		*     firstly evaluates if it applies by checking
		*     the start state and and event match its own.
		*     Once it ascertains it is for the start state/event
		*     combination, then the transition evaluates any
		*     guard conditions it has associated to it.
		*     If all the guard conditions evaluate to true,
		*     then the transition executes and returns the
		*     new state that the state machine is in.
		* Creation date: (14/02/01 6:14:35 PM)
		*
		* @author:
		*/
		@Test
		public void testTrigger() {
				// TODO: implement this test case
				// Ensure the normal expectations are met
				// Ensure the exceptional expectations are met
				fail("unverified");
		}
}

// Transition.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * A transition that is evaluated