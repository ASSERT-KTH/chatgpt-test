// XmlIOTest.java
package com.allenstudio.ir.util;

import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlIO}.
* It contains ten unit test cases for the {@link XmlIO#load(InputStream)} method.
*/
class XmlIOTest {

		/**
		* Test case 1 for {@link XmlIO#load(InputStream)} method.
		* It tests the method with a valid input stream.
		*/
		@Test
		void testLoad1() {
				XmlIO xmlIO = new XmlIO();
				InputStream input = getClass().getResourceAsStream("/com/allenstudio/ir/util/test1.xml");
				assertTrue(xmlIO.load(input));
		}
		
		/**
		* Test case 2 for {@link XmlIO#load(InputStream)} method.
		* It tests the method with a null input stream.
		*/
		@Test
		void testLoad2() {
				XmlIO xmlIO = new XmlIO();
				InputStream input = null;
				assertFalse(xmlIO.load(input));
		}
		
		/**
		* Test case 3 for {@link XmlIO#load(InputStream)} method.
		* It tests the method with an empty input stream.
		*/
		@Test
		void testLoad3() {
				XmlIO xmlIO = new XmlIO();
				InputStream input = getClass().getResourceAsStream("/com/allenstudio/ir/util/test2.xml");
				assertFalse(xmlIO.load(input));
		}
		
		/**
		* Test case 4 for {@link XmlIO#load(InputStream)} method.
		* It tests the method with an input stream that contains only one element.
		*/
		@Test
		void testLoad4() {
				XmlIO xmlIO = new XmlIO();
				InputStream input = getClass().getResourceAsStream("/com/allenstudio/ir/util/test3.xml");
				assertTrue(xmlIO.load(input));
		}
		
		/**
		* Test case 5 for {@link XmlIO#load(InputStream)} method.
		* It tests the method with an input stream that contains only one element with attributes.
		*/
		@Test
		void testLoad5() {
				XmlIO xmlIO = new XmlIO();
				InputStream input = getClass().getResourceAsStream("/com/allenstudio/ir/util/test4.xml");
				assertTrue(xmlIO.load(input));
		}
		
		/**
		* Test case 6 for {@link XmlIO#load(InputStream)} method.
		* It tests the method with an input stream that contains only one element with attributes and text.
		*/
		@Test
		void testLoad6() {
				XmlIO xmlIO = new XmlIO();
				InputStream input = getClass().getResourceAsStream("/com/allenstudio/ir/util/test5.xml");
				assertTrue(xmlIO.load(input));
		}
		
		/**
		* Test case 7 for {@link XmlIO#load(InputStream)} method.
		* It tests the method with an input stream that contains only one element with attributes and text and child elements.
		*/
		@Test
		void testLoad7() {
				XmlIO xmlIO = new XmlIO();
				InputStream input = getClass().getResourceAsStream("/com/allenstudio/ir/util/test6.xml");
				assertTrue(xmlIO.load(input));
		}
		
		/**
		* Test case 8 for {@link XmlIO#load(InputStream)} method.
		* It tests the method with an input stream that contains only one element with attributes and text and child elements with attributes.
		*/
		@Test
		void testLoad8() {
				XmlIO xmlIO = new XmlIO();
				InputStream input = getClass().getResourceAsStream("/com/allenstudio/ir/util/test7.xml");
				assertTrue(xmlIO.load(input));
		}
		
		/**
		* Test case 9 for {@link XmlIO#load(InputStream)} method.
		* It tests the method with an input stream that contains only one element with attributes and text and child elements with attributes and text.
		*/
		@Test
		void testLoad9() {
				XmlIO xmlIO = new XmlIO();
				InputStream input = getClass().getResourceAsStream("/com/allenstudio/ir/util/test8.xml");
				assertTrue(xmlIO.load(input));
		}
		
		/**
		* Test case 10 for {@link XmlIO#load(InputStream)} method.
		* It tests the method with an input stream that contains only one element with attributes and text and child elements with attributes and text and child elements.
		*/
		@Test
		void testLoad10() {
				XmlIO xmlIO = new XmlIO();
				InputStream input = getClass().getResourceAsStream("/com/allenstudio/ir/util/test9.xml");
				assertTrue(xmlIO.load(input));
		}
}