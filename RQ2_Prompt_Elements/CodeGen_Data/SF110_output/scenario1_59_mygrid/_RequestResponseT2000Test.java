// _RequestResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains one unit test case for the {@link _RequestResponse#getTypeDesc()} method.
*/
class _RequestResponseTest {

    /**
     * Create an initialized object of {@link _RequestResponse}
     */
	static _RequestResponse create(final String service_path) {
        return new _RequestResponse(service_path);
	}
	
	/**
	*  Static block of code generated by jUnit
	*/
	private static final org.apache.axis.description.TypeDesc typeDesc = 
		new org.apache.axis.description.TypeDesc( _RequestResponse.class );
	

	/**
	* Empty test
	*/
void doTest() {
	_RequestResponse test = new _RequestResponse();
	assertNotNull(test.getTypeDesc());
	assertEquals(test.getTypeDesc().getFullTypeName(), "*/*");
}

/**
* main entry point for execution of this unit test.
*/
public static void main(String[] args) {
	junit.textui.TestRunner.run(org.junit.jupiter.api.TestInstance.bRunAllTests().
	        setDisplayName(org.junit.jupiter.api.DisplayName.INSTANCE.
	            getValue()).
	        addTests(new _RequestResponseTest()));
}


}
