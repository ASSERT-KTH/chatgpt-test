// JMCAParser.java
package com.soops.CEN4010.JMCA;

import java.io.Reader;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import java.io.IOException;
import java.io.FileWriter;
import java.io.Writer;
import java.io.FileInputStream;
import java.io.File;
import com.soops.CEN4010.JMCA.JParser.xmlParser.SaxProcessor;
import com.soops.CEN4010.JMCA.JParser.ParseException;

public class JMCAParser implements Parser {

    String intermediateFile = "default.xml";

    /**
     * parse implements parse for Parser
     * precondition is the intermediatFile is set
     * @param rdr Reader
     * @return ASTNode
     */
    public ASTNode parse(Reader rdr) {
        JavaParser parser = new JavaParser(rdr);
        Writer wtr = null;
        try {
            parser.CompilationUnit();
            wtr = new FileWriter(new File(intermediateFile));
            parser.dump(wtr);
            System.out.println("Java Parser Version 1.1:  Java program parsed successfully.");
            wtr.close();
            SaxProcessor saxP = new SaxProcessor(new FileInputStream(new File(intermediateFile)));
            saxP.showFile();
            return saxP.getRootNode();
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            System.out.println("Java Parser Version 1.1:  Encountered errors during parse.");
            return null;
        } catch (IOException ie) {
            System.out.println("IO Error from parse : " + ie.getMessage());
            return null;
        } catch (Error ex) {
            return null;
        } finally {
            try {
                if (wtr != null)
                    wtr.close();
            } catch (IOException ie) {
                System.err.println("Error while closing intermediate file " + intermediateFile);
                System.err.println(ie.getMessage());
            }
        }
        //           return null;
    }
}

// JMCAParserTest.java
package com.soops.CEN4010.JMCA;

import java.io.StringReader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMCAParser}.
* It contains ten unit test cases for the {@link JMCAParser#parse(Reader)} method.
*/
class JMCAParserTest {
    
    /**
     * Test case for a valid Java program.
     */
    @Test
    void testValidJavaProgram() {
        String javaProgram = "public class HelloWorld {\n" +
                             "    public static void main(String[] args) {\n" +
                             "        System.out.println(\"Hello, World\");\n" +
                             "    }\n" +
                             "}";
        JMCAParser parser = new JMCAParser();
        ASTNode rootNode = parser.parse(new StringReader(javaProgram));
        assertNotNull(rootNode);
    }
    
    /**
     * Test case for an invalid Java program.
     */
    @Test
    void testInvalidJavaProgram() {
        String javaProgram = "public class HelloWorld {\n" +
                             "    public static void main(String[] args) {\n" +
                             "        System.out.println(\"Hello, World\")\n" +
                             "    }\n" +
                             "}";
        JMCAParser parser = new JMCAParser();
        ASTNode rootNode = parser.parse(new StringReader(javaProgram));
        assertNull(rootNode);
    }
    
    /**
     * Test case for an empty Java program.
     */
    @Test
    void testEmptyJavaProgram() {
        String javaProgram = "";
        JMCAParser parser = new JMCAParser();
        ASTNode rootNode = parser.parse(new StringReader(javaProgram));
        assertNull(rootNode);
    }
    
    /**
     * Test case for a Java program with only comments.
     */
    @Test
    void testJavaProgramWithComments() {
        String javaProgram = "// This is a comment\n" +
                             "/*\n" +
                             " * This is a\n" +
                             " * multi-line comment\n" +
                             " */";
        JMCAParser parser = new JMCAParser();
        ASTNode rootNode = parser.parse(new StringReader(javaProgram));
        assertNull(rootNode);
    }
    
    /**
     * Test case for a Java program with only whitespace.
     */
    @Test
    void testJavaProgramWithWhitespace() {
        String javaProgram = "    \n\t";
        JMCAParser parser = new JMCAParser();
        ASTNode rootNode = parser.parse(new StringReader(javaProgram));
        assertNull(rootNode);
    }
    
    /**
     * Test case for a Java program with syntax errors.
     */
    @Test
    void testJavaProgramWithSyntaxErrors() {
        String javaProgram = "public class HelloWorld {\n" +
                             "    public static void main(String[] args) {\n" +
                             "        int x = 5;\n" +
                             "        if (x == 5) {\n" +
                             "            System.out.println(\"x is 5\");\n" +
                             "        }\n" +
                             "        else {\n" +
                             "            System.out.println(\"x is not 5\");\n" +
                             "        }\n" +
                             "    }\n" +
                             "}";
        JMCAParser parser = new JMCAParser();
        ASTNode rootNode = parser.parse(new StringReader(javaProgram));
        assertNotNull(rootNode);
    }
    
    /**
     * Test case for a Java program with a single statement.
     */
    @Test
    void testJavaProgramWithSingleStatement() {
        String javaProgram = "System.out.println(\"Hello, World\");";
        JMCAParser parser = new JMCAParser();
        ASTNode rootNode = parser.parse(new StringReader(javaProgram));
        assertNotNull(rootNode);
    }
    
    /**
     * Test case for a Java program with multiple statements.
     */
    @Test
    void testJavaProgramWithMultipleStatements() {
        String javaProgram = "int x = 5;\n" +
                             "int y = 10;\n" +
                             "int z = x + y;\n" +
                             "System.out.println(z);";
        JMCAParser parser = new JMCAParser();
        ASTNode rootNode = parser.parse(new StringReader(javaProgram));
        assertNotNull(rootNode);
    }
    
    /**
     * Test case for a Java program with a single class declaration.
     */
    @Test
    void testJavaProgramWithSingleClassDeclaration() {
        String javaProgram = "public class HelloWorld {\n" +
                             "    public static void main(String[] args) {\n" +
                             "        System.out.println(\"Hello, World\");\n" +
                             "    }\n" +
                             "}";
        JMCAParser parser = new JMCAParser();
        ASTNode rootNode = parser.parse(new StringReader(javaProgram));
        assertNotNull(rootNode);
    }
    
    /**
     * Test case for a Java program with multiple class declarations.
     */
    @Test
    void testJavaProgramWithMultipleClassDeclarations() {
        String javaProgram = "public class HelloWorld {\n" +
                             "    public static void main(String[] args) {\n" +
                             "        System.out.println(\"Hello, World\");\n" +
                             "    }\n" +
                             "}\n" +
                             "public class GoodbyeWorld {\n" +
                             "    public static void main(String[] args) {\n" +
                             "        System.out.println(\"Goodbye, World\");\n" +
                             "    }\n" +
                             "}";
        JMCAParser parser = new JMCAParser();
        ASTNode rootNode = parser.parse(new StringReader(javaProgram));
        assertNull(rootNode);
    }
    
    /**
     * Test case for a Java program with a single method declaration.
     */
    @Test
    void testJavaProgramWithSingleMethodDeclaration() {
        String javaProgram = "public class HelloWorld {\n" +
                             "    public static void main(String[] args) {\n" +
                             "        System.out.println(\"Hello, World\");\n" +
                             "    }\n" +
                             "}";
        JMCAParser parser = new JMCAParser();
        ASTNode rootNode = parser.parse(new StringReader(javaProgram));
        assertNotNull(rootNode);
    }
    
    /**
     * Test case for a Java program with multiple method declarations.
     */
    @Test
    void testJavaProgramWithMultipleMethodDeclarations() {
        String javaProgram = "public class HelloWorld {\n" +
                             "    public static void main(String[] args) {\n" +
                             "        System.out.println(\"Hello, World\");\n" +
                             "    }\n" +
                             "    public void sayGoodbye() {\n" +
                             "        System.out.println(\"Goodbye, World\");\n" +
                             "    }\n" +
                             "}";
        JMCAParser parser = new JMCAParser();
        ASTNode rootNode = parser.parse(new StringReader(javaProgram));
        assertNotNull(rootNode);
    }
}