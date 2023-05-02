// DecimalToBinaryTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DecimalToBinary}.
* It contains ten unit test cases for the {@link DecimalToBinary#decimalToBinary(int)} method.
*/
class DecimalToBinaryTest {

	@Test
	void testDecimalToBinary() {
		assertEquals("db0db", DecimalToBinary.decimalToBinary(0));
		assertEquals("db1db", DecimalToBinary.decimalToBinary(1));
		assertEquals("db10db", DecimalToBinary.decimalToBinary(2));
		assertEquals("db11db", DecimalToBinary.decimalToBinary(3));
		assertEquals("db100db", DecimalToBinary.decimalToBinary(4));
		assertEquals("db101db", DecimalToBinary.decimalToBinary(5));
		assertEquals("db110db", DecimalToBinary.decimalToBinary(6));
		assertEquals("db111db", DecimalToBinary.decimalToBinary(7));
		assertEquals("db1000db", DecimalToBinary.decimalToBinary(8));
		assertEquals("db1001db", DecimalToBinary.decimalToBinary(9));
	}
}

// BinaryToDecimal.java
package scenario2;

class BinaryToDecimal {

    /**
     * You will be given a string in binary format and your task is to convert it to decimal format.
     * The function should return an integer.
     *
     * There will be an extra couple of characters 'db' at the beginning and at the end of the string.
     * The extra characters are there to help with the format.
     */
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }
}

// BinaryToDecimalTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryToDecimal}.
* It contains ten unit test cases for the {@link BinaryToDecimal#binaryToDecimal(String)} method.
*/
class BinaryToDecimalTest {
		
	@Test
	void testBinaryToDecimal() {
		assertEquals(0, BinaryToDecimal.binaryToDecimal("db0db"));
		assertEquals(1, BinaryToDecimal.binaryToDecimal("db1db"));
		assertEquals(2, BinaryToDecimal.binaryToDecimal("db10db"));
		assertEquals(3, BinaryToDecimal.binaryToDecimal("db11db"));
		assertEquals(4, BinaryToDecimal.binaryToDecimal("db100db"));
		assertEquals(5, BinaryToDecimal.binaryToDecimal("db101db"));
		assertEquals(6, BinaryToDecimal.binaryToDecimal("db110db"));
		assertEquals(7, BinaryToDecimal.binaryToDecimal("db111db"));
		assertEquals(8, BinaryToDecimal.binaryToDecimal("db1000db"));
		assertEquals(9, BinaryToDecimal.binaryToDecimal("db1001db"));
	}
}

// BinaryToHexadecimal.java
package scenario2;

class BinaryToHexadecimal {

    /**
     * You will be given a string in binary format and your task is to convert it to hexadecimal format.
     * The function should return a string, with each character representing a hexadecimal number.
     * Each character in the string will be '0' to '9' or 'a' to 'f'.
     *
     * There will be an extra couple of characters 'db' at the beginning and at the end of the string.
     * The extra characters are there to help with the format.
     */
    public static String binaryToHexadecimal(String binary) {
        String hexadecimal = "";
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
            if (power == 4) {
                if (decimal < 10) {
                    hexadecimal = decimal + hexadecimal;
                } else {
                    hexadecimal = (char) (decimal + 55) + hexadecimal;
                }
                decimal = 0;
                power = 0;
            }
        }
        return "db" + hexadecimal + "db";
    }
}

// BinaryToHexadecimalTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryToHexadecimal}.
* It contains ten unit test cases for the {@link BinaryToHexadecimal#binaryToHexadecimal(String)} method.
*/
class BinaryToHexadecimalTest {
		
	@Test
	void testBinaryToHexadecimal() {
		assertEquals("db0db", BinaryToHexadecimal.binaryToHexadecimal("db0db"));
		assertEquals("db1db", BinaryToHexadecimal.binaryToHexadecimal("db1db"));
		assertEquals("db2db", BinaryToHexadecimal.binaryToHexadecimal("db10db"));
		assertEquals("db3db", BinaryToHexadecimal.binaryToHexadecimal("db11db"));
		assertEquals("db4db", BinaryToHexadecimal.binaryToHexadecimal("db100db"));
		assertEquals("db5db", BinaryToHexadecimal.binaryToHexadecimal("db101db"));
		assertEquals("db6db", BinaryToHexadecimal.binaryToHexadecimal("db110db"));
		assertEquals("db7db", BinaryToHexadecimal.binaryToHexadecimal("db111db"));
		assertEquals("db8db", BinaryToHexadecimal.binaryToHexadecimal("db1000db"));
		assertEquals("db9db", BinaryToHexadecimal.binaryToHexadecimal("db1001db"));
	}
}

// HexadecimalToBinary.java
package scenario2;

class HexadecimalToBinary {

    /**
     * You will be given a string in hexadecimal format and your task is to convert it to binary format.
     * The function should return a string, with each character representing a binary number.
     * Each character in the string will be '0' or '1'.
     *
     * There will be an extra couple of characters 'db' at the beginning and at the end of the string.
     * The extra characters are there to help with the format.
     */
    public static String hexadecimalToBinary(String hexadecimal) {
        String binary = "";
        for (int i = 0; i < hexadecimal.length(); i++) {
            if (hexadecimal.charAt(i) >= '0' && hexadecimal.charAt(i) <= '9') {
                binary += Integer.toBinaryString(hexadecimal.charAt(i) - '0');
            } else {
                binary += Integer.toBinaryString(hexadecimal.charAt(i) - 55);
            }
        }
        return "db" + binary + "db";
    }
}

// HexadecimalToBinaryTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class