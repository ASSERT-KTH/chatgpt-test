// SeparateParenGroups.java
package updated;

import java.util.ArrayList;
import java.util.List;

class SeparateParenGroups {

    /**
     * Input to this function is a string containing multiple groups of nested parentheses.
     * Your goal is to separate those group into separate strings and return the list of those.
     * Separate groups are balanced (each open brace is properly closed) and not nested within each other.
     * Ignore any spaces in the input string.
     *
     * > separateParenGroups("(()()) ((())) () ((())()())")
     * ["(()())", "((()))", "()", "((())()())"]
     * > separateParenGroups("() (()) ((())) (((())))")
     * ["()", "(())", "((()))", "(((())))"]
     * > separateParenGroups("(()(())((())))")
     * ["(()(())((())))"]
     * > separateParenGroups("( ) (( )) (( )( ))")
     * ["()", "(())", "(()())"]
     */
    public static List<String> separateParenGroups(String parenString) {
        List<String> result = new ArrayList<String>();
        int count = 0;
        StringBuilder curString = new StringBuilder();
        for (int i = 0; i < parenString.length(); i++) {
            if (parenString.charAt(i) == '(') {
                count++;
                curString.append('(');
            } else if (parenString.charAt(i) == ')') {
                count--;
                curString.append(')');
                if (count == 0) {
                    result.add(curString.toString());
                    curString = new StringBuilder();
                }
            }
        }
        return result;
    }
}

// SeparateParenGroupsTest.java
package updated;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SeparateParenGroups}.
* It contains ten unit test cases for the {@link SeparateParenGroups#separateParenGroups(String)} method.
*/
class SeparateParenGroupsTest {
    
    @Test
    void testSeparateParenGroups() {
        List<String> expectedOutput = new ArrayList<String>();
        expectedOutput.add("(()())");
        expectedOutput.add("((()))");
        expectedOutput.add("()");
        expectedOutput.add("((())()())");
        assertEquals(expectedOutput, SeparateParenGroups.separateParenGroups("(()()) ((())) () ((())()())"));
        
        expectedOutput.clear();
        expectedOutput.add("()");
        expectedOutput.add("(())");
        expectedOutput.add("((()))");
        expectedOutput.add("(((())))");
        assertEquals(expectedOutput, SeparateParenGroups.separateParenGroups("() (()) ((())) (((())))"));
        
        expectedOutput.clear();
        expectedOutput.add("(()(())((())))");
        assertEquals(expectedOutput, SeparateParenGroups.separateParenGroups("(()(())((())))"));
        
        expectedOutput.clear();
        expectedOutput.add("()");
        expectedOutput.add("(())");
        expectedOutput.add("(()())");
        assertEquals(expectedOutput, SeparateParenGroups.separateParenGroups("( ) (( )) (( )( ))"));
        
        expectedOutput.clear();
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        assertEquals(expectedOutput, SeparateParenGroups.separateParenGroups("()()()"));
        
        expectedOutput.clear();
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        assertEquals(expectedOutput, SeparateParenGroups.separateParenGroups("()()()()"));
        
        expectedOutput.clear();
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        assertEquals(expectedOutput, SeparateParenGroups.separateParenGroups("()()()()()"));
        
        expectedOutput.clear();
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        assertEquals(expectedOutput, SeparateParenGroups.separateParenGroups("()()()()()()"));
        
        expectedOutput.clear();
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        assertEquals(expectedOutput, SeparateParenGroups.separateParenGroups("()()()()()()()"));
        
        expectedOutput.clear();
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        assertEquals(expectedOutput, SeparateParenGroups.separateParenGroups("()()()()()()()()"));
    }
}