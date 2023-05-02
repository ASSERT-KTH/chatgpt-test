// MatchParens.java
package revised;

import java.util.List;

class MatchParens {

    /**
     * * You are given a list of two strings, both strings consist of open
     * parentheses '(' or close parentheses ')' only.
     * Your job is to check if it is possible to concatenate the two strings in
     * some order, that the resulting string will be good.
     * A string S is considered to be good if and only if all parentheses in S
     * are balanced. For example: the string '(())()' is good, while the string
     * '())' is not.
     * Return 'Yes' if there's a way to make a good string, and return 'No' otherwise.
     *
     * Examples:
     * matchParens(['()(', ')']) == 'Yes'
     * matchParens([')', ')']) == 'No'
     *
     * > matchParens(["()(", ")"])
     * "Yes"
     * > matchParens([")", ")"])
     * "No"
     * > matchParens(["(()(())", "())())"])
     * "No"
     * > matchParens([")())", "(()()("])
     * "Yes"
     * > matchParens(["(())))", "(()())(("])
     * "Yes"
     * > matchParens(["()", "())"])
     * "No"
     * > matchParens(["(()(", "()))()"])
     * "Yes"
     * > matchParens(["((((", "((())"])
     * "No"
     * > matchParens([")(()", "(()("])
     * "No"
     * > matchParens([")(", ")("])
     * "No"
     * > matchParens(["(", ")"])
     * "Yes"
     * > matchParens([")", "("])
     * "Yes"
     */
    public static String matchParens(List<String> lst) {
        String s1 = lst.get(0);
        String s2 = lst.get(1);
        String s1s2 = s1 + s2;
        String s2s1 = s2 + s1;
        int count = 0;
        boolean flag = true;
        for (int i = 0; i < s1s2.length(); i++) {
            if (s1s2.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                flag = false;
                break;
            }
        }
        if (flag && count == 0) {
            return "Yes";
        }
        count = 0;
        for (int i = 0; i < s2s1.length(); i++) {
            if (s2s1.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                return "No";
            }
        }
        if (count == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }
}

// MatchParensTest.java
package revised;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MatchParens}.
* It contains ten unit test cases for the {@link MatchParens#matchParens(List)} method.
*/
class MatchParensTest {
    
    @Test
    void testMatchParens1() {
        List<String> lst = Arrays.asList("()(", ")");
        String result = MatchParens.matchParens(lst);
        assertEquals("Yes", result);
    }
    
    @Test
    void testMatchParens2() {
        List<String> lst = Arrays.asList(")", ")");
        String result = MatchParens.matchParens(lst);
        assertEquals("No", result);
    }
    
    @Test
    void testMatchParens3() {
        List<String> lst = Arrays.asList("(()(())", "())())");
        String result = MatchParens.matchParens(lst);
        assertEquals("No", result);
    }
    
    @Test
    void testMatchParens4() {
        List<String> lst = Arrays.asList(")())", "(()()(");
        String result = MatchParens.matchParens(lst);
        assertEquals("Yes", result);
    }
    
    @Test
    void testMatchParens5() {
        List<String> lst = Arrays.asList("(())))", "(()())((");
        String result = MatchParens.matchParens(lst);
        assertEquals("Yes", result);
    }
    
    @Test
    void testMatchParens6() {
        List<String> lst = Arrays.asList("()", "())");
        String result = MatchParens.matchParens(lst);
        assertEquals("No", result);
    }
    
    @Test
    void testMatchParens7() {
        List<String> lst = Arrays.asList("(()(", "()))()");
        String result = MatchParens.matchParens(lst);
        assertEquals("Yes", result);
    }
    
    @Test
    void testMatchParens8() {
        List<String> lst = Arrays.asList("((((", "((())");
        String result = MatchParens.matchParens(lst);
        assertEquals("No", result);
    }
    
    @Test
    void testMatchParens9() {
        List<String> lst = Arrays.asList(")(()", "(()(");
        String result = MatchParens.matchParens(lst);
        assertEquals("No", result);
    }
    
    @Test
    void testMatchParens10() {
        List<String> lst = Arrays.asList("(", ")");
        String result = MatchParens.matchParens(lst);
        assertEquals("Yes", result);
    }
    
    @Test
    void testMatchParens11() {
        List<String> lst = Arrays.asList(")", "(");
        String result = MatchParens.matchParens(lst);
        assertEquals("Yes", result);
    }
}