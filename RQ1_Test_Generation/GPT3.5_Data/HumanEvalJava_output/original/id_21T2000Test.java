// RescaleToUnit.java
package updated;

import java.util.ArrayList;
import java.util.List;

public class RescaleToUnit {

    /**
     * Given list of numbers (of at least two elements), apply a linear transform to that list,
     * such that the smallest number will become 0 and the largest will become 1
     *
     * @param numbers list of numbers to be rescaled
     * @return rescaled list of numbers
     */
    public static List<Double> rescaleToUnit(List<Double> numbers) {
        List<Double> result = new ArrayList<Double>();
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            result.add((numbers.get(i) - min) / (max - min));
        }
        return result;
    }
}

// RescaleToUnitTest.java
package updated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RescaleToUnit}.
* It contains ten unit test cases for the {@link RescaleToUnit#rescaleToUnit(List)} method.
*/
class RescaleToUnitTest {
    
    @Test
    void testRescaleToUnit() {
        List<Double> input1 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> expectedOutput1 = Arrays.asList(0.0, 0.25, 0.5, 0.75, 1.0);
        assertEquals(expectedOutput1, RescaleToUnit.rescaleToUnit(input1));
        
        List<Double> input2 = Arrays.asList(2.0, 49.9);
        List<Double> expectedOutput2 = Arrays.asList(0.0, 1.0);
        assertEquals(expectedOutput2, RescaleToUnit.rescaleToUnit(input2));
        
        List<Double> input3 = Arrays.asList(100.0, 49.9);
        List<Double> expectedOutput3 = Arrays.asList(1.0, 0.0);
        assertEquals(expectedOutput3, RescaleToUnit.rescaleToUnit(input3));
        
        List<Double> input4 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> expectedOutput4 = Arrays.asList(0.0, 0.25, 0.5, 0.75, 1.0);
        assertEquals(expectedOutput4, RescaleToUnit.rescaleToUnit(input4));
        
        List<Double> input5 = Arrays.asList(2.0, 1.0, 5.0, 3.0, 4.0);
        List<Double> expectedOutput5 = Arrays.asList(0.25, 0.0, 1.0, 0.5, 0.75);
        assertEquals(expectedOutput5, RescaleToUnit.rescaleToUnit(input5));
        
        List<Double> input6 = Arrays.asList(12.0, 11.0, 15.0, 13.0, 14.0);
        List<Double> expectedOutput6 = Arrays.asList(0.25, 0.0, 1.0, 0.5, 0.75);
        assertEquals(expectedOutput6, RescaleToUnit.rescaleToUnit(input6));
        
        List<Double> input7 = Arrays.asList(0.0, 0.0, 0.0, 0.0, 0.0);
        List<Double> expectedOutput7 = Arrays.asList(0.0, 0.0, 0.0, 0.0, 0.0);
        assertEquals(expectedOutput7, RescaleToUnit.rescaleToUnit(input7));
        
        List<Double> input8 = Arrays.asList(1.0, 1.0, 1.0, 1.0, 1.0);
        List<Double> expectedOutput8 = Arrays.asList(0.0, 0.0, 0.0, 0.0, 0.0);
        assertEquals(expectedOutput8, RescaleToUnit.rescaleToUnit(input8));
        
        List<Double> input9 = Arrays.asList(1.0, 2.0);
        List<Double> expectedOutput9 = Arrays.asList(0.0, 1.0);
        assertEquals(expectedOutput9, RescaleToUnit.rescaleToUnit(input9));
        
        List<Double> input10 = Arrays.asList(2.0, 1.0);
        List<Double> expectedOutput10 = Arrays.asList(1.0, 0.0);
        assertEquals(expectedOutput10, RescaleToUnit.rescaleToUnit(input10));
    }
}