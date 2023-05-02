// SortNumbersTest.java
package updated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link SortNumbers}.
 * It contains ten unit test cases for the {@link SortNumbers#sortNumbers(String)} method.
 */
class SortNumbersTest {

    @Test
    void testSortNumbersWithEmptyString() {
        String result = SortNumbers.sortNumbers("");
        assertEquals("", result);
    }

    @Test
    void testSortNumbersWithOneNumber() {
        String result = SortNumbers.sortNumbers("three");
        assertEquals("three", result);
    }

    @Test
    void testSortNumbersWithTwoNumbers() {
        String result = SortNumbers.sortNumbers("three five");
        assertEquals("three five", result);
    }

    @Test
    void testSortNumbersWithThreeNumbers() {
        String result = SortNumbers.sortNumbers("three five nine");
        assertEquals("three five nine", result);
    }

    @Test
    void testSortNumbersWithFourNumbers() {
        String result = SortNumbers.sortNumbers("five zero four seven");
        assertEquals("zero four five seven", result);
    }

    @Test
    void testSortNumbersWithFiveNumbers() {
        String result = SortNumbers.sortNumbers("six five four three two one");
        assertEquals("one two three four five six", result);
    }

    @Test
    void testSortNumbersWithInvalidNumber() {
        String result = SortNumbers.sortNumbers("three five invalid");
        assertEquals("Invalid input", result);
    }

    @Test
    void testSortNumbersWithDuplicateNumbers() {
        String result = SortNumbers.sortNumbers("three five five nine");
        assertEquals("three five five nine", result);
    }

    @Test
    void testSortNumbersWithNumbersInUpperCase() {
        String result = SortNumbers.sortNumbers("THREE FIVE NINE");
        assertEquals("three five nine", result);
    }

    @Test
    void testSortNumbersWithNumbersInMixedCase() {
        String result = SortNumbers.sortNumbers("ThReE fIvE nInE");
        assertEquals("three five nine", result);
    }

    @Test
    void testSortNumbersWithNumbersInDescendingOrder() {
        String result = SortNumbers.sortNumbers("nine eight seven six five four three two one zero");
        assertEquals("zero one two three four five six seven eight nine", result);
    }
}

// SortNumbers.java
package updated;

import java.util.Arrays;

class SortNumbers {

    /**
     * Input is a space-delimited string of numbers from 'zero' to 'nine'.
     * Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
     * Return the string with numbers sorted from smallest to largest
     *
     * > sortNumbers("three one five")
     * "one three five"
     * > sortNumbers("")
     * ""
     * > sortNumbers("three")
     * "three"
     * > sortNumbers("three five nine")
     * "three five nine"
     * > sortNumbers("five zero four seven")
     * "zero four five seven"
     * > sortNumbers("six five four three two one")
     * "one two three four five six"
     */
    public static String sortNumbers(String numbers) {
        String[] numbersArray = numbers.split(" ");
        int[] numbersInt = new int[numbersArray.length];
        for (int i = 0; i < numbersArray.length; i++) {
            switch (numbersArray[i].toLowerCase()) {
                case "zero":
                    numbersInt[i] = 0;
                    break;
                case "one":
                    numbersInt[i] = 1;
                    break;
                case "two":
                    numbersInt[i] = 2;
                    break;
                case "three":
                    numbersInt[i] = 3;
                    break;
                case "four":
                    numbersInt[i] = 4;
                    break;
                case "five":
                    numbersInt[i] = 5;
                    break;
                case "six":
                    numbersInt[i] = 6;
                    break;
                case "seven":
                    numbersInt[i] = 7;
                    break;
                case "eight":
                    numbersInt[i] = 8;
                    break;
                case "nine":
                    numbersInt[i] = 9;
                    break;
                default:
                    return "Invalid input";
            }
        }
        Arrays.sort(numbersInt);
        String result = "";
        for (int i = 0; i < numbersInt.length; i++) {
            switch (numbersInt[i]) {
                case 0:
                    result += "zero ";
                    break;
                case 1:
                    result += "one ";
                    break;
                case 2:
                    result += "two ";
                    break;
                case 3:
                    result += "three ";
                    break;
                case 4:
                    result += "four ";
                    break;
                case 5:
                    result += "five ";
                    break;
                case 6:
                    result += "six ";
                    break;
                case 7:
                    result += "seven ";
                    break;
                case 8:
                    result += "eight ";
                    break;
                case 9:
                    result += "nine ";
                    break;
            }
        }
        return result.trim();
    }
}