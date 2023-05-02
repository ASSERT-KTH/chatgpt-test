// FileEditor_0Test.java
package apbs_mem_gui;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link FileEditor}.
 * It contains ten unit test cases for the {@link FileEditor#getEnergy(String)} method.
 */
class FileEditor_0Test {

    /**
     * Test case for when the file does not exist.
     */
    @Test
    void testGetEnergyFileNotFound() {
        FileEditor fileEditor = new FileEditor();
        String[] energies = fileEditor.getEnergy("nonexistent_file.txt");
        assertNull(energies);
    }

    /**
     * Test case for when the file exists but does not contain the energy information.
     */
    @Test
    void testGetEnergyNoEnergyInfo() throws IOException {
        File file = File.createTempFile("test", ".txt");
        FileWriter writer = new FileWriter(file);
        writer.write("This file does not contain energy information.");
        writer.close();

        FileEditor fileEditor = new FileEditor();
        String[] energies = fileEditor.getEnergy(file.getAbsolutePath());
        assertNull(energies);
    }

    /**
     * Test case for when the file contains energy information in the solvated section.
     */
    @Test
    void testGetEnergySolvated() throws IOException {
        File file = File.createTempFile("test", ".txt");
        FileWriter writer = new FileWriter(file);
        writer.write("elec name solvated\n" +
                "Global net ELEC energy -1.23456789E+02 kJ/mol\n" +
                "This file contains energy information in the solvated section.");
        writer.close();

        FileEditor fileEditor = new FileEditor();
        String[] energies = fileEditor.getEnergy(file.getAbsolutePath());
        assertNotNull(energies);
        assertEquals("1.2346E+02 kJ/mol", energies[0]);
        assertEquals("2.9476E+01 kcal/mol", energies[1]);
        assertEquals("4.9715E+01 kT", energies[2]);
    }

    /**
     * Test case for when the file contains energy information in the reference section.
     */
    @Test
    void testGetEnergyReference() throws IOException {
        File file = File.createTempFile("test", ".txt");
        FileWriter writer = new FileWriter(file);
        writer.write("elec name reference\n" +
                "Global net ELEC energy +3.14159265E-01 kJ/mol\n" +
                "This file contains energy information in the reference section.");
        writer.close();

        FileEditor fileEditor = new FileEditor();
        String[] energies = fileEditor.getEnergy(file.getAbsolutePath());
        assertNotNull(energies);
        assertEquals("3.1416E-01 kJ/mol", energies[0]);
        assertEquals("7.5226E-02 kcal/mol", energies[1]);
        assertEquals("1.2703E-01 kT", energies[2]);
    }

    /**
     * Test case for when the file contains energy information in both the solvated and reference sections.
     * The method should return the energy information from the solvated section.
     */
    @Test
    void testGetEnergyBothSections() throws IOException {
        File file = File.createTempFile("test", ".txt");
        FileWriter writer = new FileWriter(file);
        writer.write("elec name solvated\n" +
                "Global net ELEC energy -1.23456789E+02 kJ/mol\n" +
                "elec name reference\n" +
                "Global net ELEC energy +3.14159265E-01 kJ/mol\n" +
                "This file contains energy information in both the solvated and reference sections.");
        writer.close();

        FileEditor fileEditor = new FileEditor();
        String[] energies = fileEditor.getEnergy(file.getAbsolutePath());
        assertNotNull(energies);
        assertEquals("1.2346E+02 kJ/mol", energies[0]);
        assertEquals("2.9476E+01 kcal/mol", energies[1]);
        assertEquals("4.9715E+01 kT", energies[2]);
    }

    /**
     * Test case for when the energy information is in scientific notation with a positive exponent.
     */
    @Test
    void testGetEnergyPositiveExponent() throws IOException {
        File file = File.createTempFile("test", ".txt");
        FileWriter writer = new FileWriter(file);
        writer.write("elec name solvated\n" +
                "Global net ELEC energy +1.23456789E+05 kJ/mol\n" +
                "This file contains energy information in scientific notation with a positive exponent.");
        writer.close();

        FileEditor fileEditor = new FileEditor();
        String[] energies = fileEditor.getEnergy(file.getAbsolutePath());
        assertNotNull(energies);
        assertEquals("1.2346E+05 kJ/mol", energies[0]);
        assertEquals("2.9476E+04 kcal/mol", energies[1]);
        assertEquals("4.9715E+04 kT", energies[2]);
    }

    /**
     * Test case for when the energy information is in scientific notation with a negative exponent.
     */
    @Test
    void testGetEnergyNegativeExponent() throws IOException {
        File file = File.createTempFile("test", ".txt");
        FileWriter writer = new FileWriter(file);
        writer.write("elec name solvated\n" +
                "Global net ELEC energy -1.23456789E-05 kJ/mol\n" +
                "This file contains energy information in scientific notation with a negative exponent.");
        writer.close();

        FileEditor fileEditor = new FileEditor();
        String[] energies = fileEditor.getEnergy(file.getAbsolutePath());
        assertNotNull(energies);
        assertEquals("-1.2346E-05 kJ/mol", energies[0]);
        assertEquals("-2.9476E-06 kcal/mol", energies[1]);
        assertEquals("-4.9715E-06 kT", energies[2]);
    }

    /**
     * Test case for when the energy information is in scientific notation with a positive exponent and no decimal point.
     */
    @Test
    void testGetEnergyPositiveExponentNoDecimal() throws IOException {
        File file = File.createTempFile("test", ".txt");
        FileWriter writer = new FileWriter(file);
        writer.write("elec name solvated\n" +
                "Global net ELEC energy +1E+05 kJ/mol\n" +
                "This file contains energy information in scientific notation with a positive exponent and no decimal point.");
        writer.close();

        FileEditor fileEditor = new FileEditor();
        String[] energies = fileEditor.getEnergy(file.getAbsolutePath());
        assertNotNull(energies);
        assertEquals("1.0000E+05 kJ/mol", energies[0]);
        assertEquals("2.3900E+04 kcal/mol", energies[1]);
        assertEquals("4.0350E+04 kT", energies[2]);
    }

    /**
     * Test case for when the energy information is in scientific notation with a negative exponent and no decimal point.
     */
    @Test
    void testGetEnergyNegativeExponentNoDecimal() throws IOException {
        File file = File.createTempFile("test", ".txt");
        FileWriter writer = new FileWriter(file);
        writer.write("elec name solvated\n" +
                "Global net ELEC energy -1E-05 kJ/mol\n" +
                "This file contains energy information in scientific notation with a negative exponent and no decimal point.");
        writer.close();

        FileEditor fileEditor = new FileEditor();
        String[] energies = fileEditor.getEnergy(file.getAbsolutePath());
        assertNotNull(energies);
        assertEquals("-1.0000E-05 kJ/mol", energies[0]);
        assertEquals("-2.3900E-06 kcal/mol", energies[1]);
        assertEquals("-4.0350E-06 kT", energies[2]);
    }

    /**
     * Test case for when the energy information is in scientific notation with a positive exponent and no plus sign.
     */
    @Test
    void testGetEnergyPositiveExponentNoPlus() throws IOException {
        File file = File.createTempFile("test", ".txt");
        FileWriter writer = new FileWriter(file);
        writer.write("elec name solvated\n" +
                "Global net ELEC energy 1.23456789E+05 kJ/mol\n" +
                "This file contains energy information in scientific notation with a positive exponent and no plus sign.");
        writer.close();

        FileEditor fileEditor = new FileEditor();
        String[] energies = fileEditor.getEnergy(file.getAbsolutePath());
        assertNotNull(energies);
        assertEquals("1.2346E+05 kJ/mol", energies[0]);
        assertEquals("2.9476E+04 kcal/mol", energies[1]);
        assertEquals("4.9715E+04 kT", energies[2]);
    }

    /**
     * Test case for when the energy information is in scientific notation with a negative exponent and no minus sign.
     */
    @Test
    void testGetEnergyNegativeExponentNoMinus() throws IOException {
        File file = File.createTempFile("test", ".txt");
        FileWriter writer = new FileWriter(file);
        writer.write("elec name solvated\n" +
                "Global net ELEC energy 1.23456789E-05 kJ/mol\n" +
                "This file contains energy information in scientific notation with a negative exponent and no minus sign.");
       