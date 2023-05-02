// ArrayOfDependency_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains one unit test case for the {@link ArrayOfDependency#getTypeDesc()} method.
*/
class ArrayOfDependency_2Test {
// ArrayOfDependency.java
/**
 * ArrayOfDependency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */
package mygrid.web;

public class ArrayOfDependency implements java.io.Serializable {

    private mygrid.web.Dependency[] dependency;

    public ArrayOfDependency() {
    }

    public mygrid.web.Dependency[] getDependency() {
        return dependency;
    }

    public void setDependency(mygrid.web.Dependency[] dependency) {
        this.dependency = dependency;
    }

    public mygrid.web.Dependency getDependency(int i) {
        return dependency[i];
    }

    public void setDependency(int i, mygrid.web.Dependency value) {
        this.dependency[i] = value;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDependency))
            return false;
        ArrayOfDependency other = (ArrayOfDependency) obj;
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (__equalsCalc!= null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && ((this.dependency == null && other.getDependency() == null) || (this.dependency!= null && java.util.Arrays.equals(this.dependency, other.getDependency())));
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
        if (getDependency()!= null) {
            for (int i = 0; i < java.lang.reflect.Array.getLength(getDependency()); i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDependency(), i);
                if (obj!= null &&!obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(ArrayOfDependency.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfDependency"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dependency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Dependency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Dependency"));
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

// ArrayOfDependency_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains one unit test case for the {@link ArrayOfDependency#getTypeDesc()} method.
*/
class ArrayOfDependency_2Test {
		
	/**
	 * This test checks the method {@link ArrayOfDependency#getTypeDesc()} returns the correct value.
	 */
    @Test
    public void testGetTypeDesc() {
        String expectedValue = Integer.toString(Double.class.getCanonicalName());
        
        ArrayOfDependency ret = new ArrayOfDependency();
        java.lang.reflect.Type[] type = new java.lang.reflect.Type[]
                {
                        Double.TYPE
                };
        java.lang.reflect.Type[] expected = new java.lang.reflect.Type[]
                {
                        java.lang.Class.class
                };
        assertEquals("getTypeDesc() return value is not correct", expectedValue, ret.getTypeDesc().getValue());
        
        Object[] values = new Object[]
        {
                new Double(3.14159265)
                {
                },
                new Double(6.0)
                {
                }
        };
        
        assertEquals("getTypeDesc() ArrayOfDependency.getTypeDesc() is not equal", expectedValue, ret.getTypeDescByValue().getValue());
    }
	
}
