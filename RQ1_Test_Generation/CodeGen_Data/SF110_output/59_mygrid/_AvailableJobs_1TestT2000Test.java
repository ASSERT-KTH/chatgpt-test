// _AvailableJobs_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobs}.
* It contains one unit test case for the {@link _AvailableJobs#getTypeDesc()} method.
*/
class _AvailableJobs_1Test {
// _AvailableJobs.java
/**
 * _AvailableJobs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */
package mygrid.web;

public class _AvailableJobs implements java.io.Serializable {

    public _AvailableJobs() {
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof _AvailableJobs))
            return false;
        _AvailableJobs other = (_AvailableJobs) obj;
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (__equalsCalc!= null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true;
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(_AvailableJobs.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AvailableJobs"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
    }
}

// _AvailableJobs_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobs}.
* It contains one unit test case for the {@link _AvailableJobs#getTypeDesc()} method.
*/
class _AvailableJobs_1Test {
		/**
		* Test case for the getTypeDesc method.
		*/
	@Test
    public void testGetTypeDesc1(){
		_AvailableJobs result = _AvailableJobs.getTypeDesc();
		
	}
	
}
