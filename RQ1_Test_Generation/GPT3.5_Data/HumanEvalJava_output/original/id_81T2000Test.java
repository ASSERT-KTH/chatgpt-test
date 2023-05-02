// NumericalLetterGradeTest.java
package updated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Test class of {@link NumericalLetterGrade}.
 * It contains ten unit test cases for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
 */
class NumericalLetterGradeTest {

    @Test
    void testNumericalLetterGrade() {
        List<Number> grades = new ArrayList<>();
        grades.add(4.0);
        grades.add(3);
        grades.add(1.7);
        grades.add(2);
        grades.add(3.5);
        List<String> expected = new ArrayList<>();
        expected.add("A+");
        expected.add("B");
        expected.add("C-");
        expected.add("C");
        expected.add("A-");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    @Test
    void testNumericalLetterGradeWithOneGrade() {
        List<Number> grades = new ArrayList<>();
        grades.add(1.2);
        List<String> expected = new ArrayList<>();
        expected.add("D+");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    @Test
    void testNumericalLetterGradeWithZeroPointFive() {
        List<Number> grades = new ArrayList<>();
        grades.add(0.5);
        List<String> expected = new ArrayList<>();
        expected.add("D-");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    @Test
    void testNumericalLetterGradeWithZero() {
        List<Number> grades = new ArrayList<>();
        grades.add(0.0);
        List<String> expected = new ArrayList<>();
        expected.add("E");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    @Test
    void testNumericalLetterGradeWithMultipleGrades() {
        List<Number> grades = new ArrayList<>();
        grades.add(1);
        grades.add(0.3);
        grades.add(1.5);
        grades.add(2.8);
        grades.add(3.3);
        List<String> expected = new ArrayList<>();
        expected.add("D");
        expected.add("D-");
        expected.add("C-");
        expected.add("B");
        expected.add("B+");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    @Test
    void testNumericalLetterGradeWithZeroAndZeroPointSeven() {
        List<Number> grades = new ArrayList<>();
        grades.add(0);
        grades.add(0.7);
        List<String> expected = new ArrayList<>();
        expected.add("E");
        expected.add("D-");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    @Test
    void testNumericalLetterGradeWithAllGradesAboveFour() {
        List<Number> grades = new ArrayList<>();
        grades.add(4.0);
        grades.add(4.0);
        grades.add(4.0);
        List<String> expected = new ArrayList<>();
        expected.add("A+");
        expected.add("A+");
        expected.add("A+");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    @Test
    void testNumericalLetterGradeWithAllGradesBelowOne() {
        List<Number> grades = new ArrayList<>();
        grades.add(0.7);
        grades.add(0.3);
        grades.add(0.5);
        List<String> expected = new ArrayList<>();
        expected.add("D");
        expected.add("D-");
        expected.add("D-");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    @Test
    void testNumericalLetterGradeWithAllGradesEqual() {
        List<Number> grades = new ArrayList<>();
        grades.add(2.0);
        grades.add(2.0);
        grades.add(2.0);
        List<String> expected = new ArrayList<>();
        expected.add("C+");
        expected.add("C+");
        expected.add("C+");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    @Test
    void testNumericalLetterGradeWithNegativeGrade() {
        List<Number> grades = new ArrayList<>();
        grades.add(-1.0);
        List<String> expected = new ArrayList<>();
        expected.add("E");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }
}