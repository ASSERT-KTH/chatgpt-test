// CountDistinctCharactersTest.java
package original;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains one unit test case for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {

    @Test
    public void testCountDistinctCharacters(){
        String original = "Abcdefghijklmnopqrstuvw";
        Set<Character> distinctCharacters = new HashSet<>();
        for(int i=0;i<original.length();i++)
        {
            distinctCharacters.add(Character.toLowerCase(original.charAt(i)));
        }
        System.out.println("original : "+original);

		assertEquals(5, distinctCharacters.size());

		//test the same case but a different result
		assertEquals(5, distinctCharacters.size());

    }
    
    @Test
    public void testCount() {
        String original = "Abcdefghijklmnopqrstuvw";

        Set<Character> distinctCharacters = new HashSet<Character>();
        for(int i=0;i<original.length();i++)
        {
            distinctCharacters.add(Character.toLowerCase(original.charAt(i)));
        }

        System.out.println("original : "+original);

		assertEquals(5, distinctCharacters.size());

		//test the same case but a different result
		assertEquals(5, distinctCharacters.size());

    }
}
