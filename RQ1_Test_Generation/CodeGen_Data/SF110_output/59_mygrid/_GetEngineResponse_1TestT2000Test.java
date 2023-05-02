// _GetEngineResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains one unit test case for the {@link _GetEngineResponse#getTypeDesc()} method.
*/
class _GetEngineResponse_1Test {
// _GetEngineResponse.java
/**
 * _GetEngineResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */
package mygrid.web;

public class _GetEngineResponse implements java.io.Serializable {

    private mygrid.web.Engine getEngineResult;

    public _GetEngineResponse() {
    }

    public mygrid.web.Engine getGetEngineResult() {
        return getEngineResult;
    }

    public void setGetEngineResult(mygrid.web.Engine getEngineResult) {
        this.getEngineResult = getEngineResult;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof _GetEngineResponse))
            return false;
        _GetEngineResponse other = (_GetEngineResponse) obj;
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (__equalsCalc!= null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && ((this.getEngineResult == null && other.getGetEngineResult() == null) || (this.getEngineResult!= null && this.getEngineResult.equals(other.getGetEngineResult())));
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
        if (getGetEngineResult()!= null) {
            _hashCode += getGetEngineResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(_GetEngineResponse.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetEngineResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getEngineResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetEngineResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Engine"));
        elemField.setMinOccurs(0);
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

// _GetEngineResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains one unit test case for the {@link _GetEngineResponse#getTypeDesc()} method.
*/
class _GetEngineResponse_1Test {
		
	
	private _GetEngineResponse getEngineResult = null; 
	
	
	@Test
	public void testTypeDesc(){
		this.getEngineResult = new _GetEngineResponse();
		boolean _equals = this.getEngineResult.getTypeDesc().equals(this.getEngineResult.getTypeDesc());
		
		assertTrue((_equals));
	}
	


}
