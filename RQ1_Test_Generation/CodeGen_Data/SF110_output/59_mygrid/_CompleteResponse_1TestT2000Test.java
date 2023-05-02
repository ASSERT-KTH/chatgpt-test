// _CompleteResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _CompleteResponse}.
* It contains one unit test case for the {@link _CompleteResponse#getTypeDesc()} method.
*/
class _CompleteResponse_1Test {
// _CompleteResponse.java
/**
 * _CompleteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */
package mygrid.web;

public class _CompleteResponse implements java.io.Serializable {

    private boolean completeResult;

    public _CompleteResponse() {
    }

    public boolean isCompleteResult() {
        return completeResult;
    }

    public void setCompleteResult(boolean completeResult) {
        this.completeResult = completeResult;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof _CompleteResponse))
            return false;
        _CompleteResponse other = (_CompleteResponse) obj;
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (__equalsCalc!= null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && this.completeResult == other.isCompleteResult();
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
        _hashCode += new Boolean(isCompleteResult()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(_CompleteResponse.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">CompleteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CompleteResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
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

// _CompleteResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _CompleteResponse}.
* It contains one unit test case for the {@link _CompleteResponse#getTypeDesc()} method.
*/
class _CompleteResponse_1Test {
		private boolean completeResult;
		
		/**
		* Empty constructor
		*/
		public _CompleteResponse_1Test() {
			completeResult = false;
		}

		/**
		* Tests the getTypeDesc method of {@link _CompleteResponse}
		*/
		@Test
		public void test_CompleteResponse_1Test() {
			// TODO: check the return value
			assertEquals(completeResult);
		}
}
