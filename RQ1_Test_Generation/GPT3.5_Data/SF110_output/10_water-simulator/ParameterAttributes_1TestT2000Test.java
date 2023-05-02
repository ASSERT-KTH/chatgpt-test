// ParameterAttributes_1Test.java
package simulator.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ParameterAttributes}.
 * It contains ten unit test cases for the {@link ParameterAttributes#valueFor(float)} method.
 */
class ParameterAttributes_1Test {

    /**
     * Test case for when the demand curve function returns a positive value and ln is false.
     */
    @Test
    void testValueForPositiveLnFalse() {
        ParameterAttributes parameter = new ParameterAttributes();
        parameter.setElasticity(2);
        parameter.setLn(false);
        parameter.setDemandCurveFunction(new Function() {
            @Override
            public float valueFor(float x) {
                return 5;
            }

            @Override
            public String getFunctionName() {
                return "Test Function";
            }
        });
        float result = parameter.valueFor(1);
        assertEquals(10, result);
    }

    /**
     * Test case for when the demand curve function returns a positive value and ln is true.
     */
    @Test
    void testValueForPositiveLnTrue() {
        ParameterAttributes parameter = new ParameterAttributes();
        parameter.setElasticity(2);
        parameter.setLn(true);
        parameter.setDemandCurveFunction(new Function() {
            @Override
            public float valueFor(float x) {
                return 5;
            }

            @Override
            public String getFunctionName() {
                return "Test Function";
            }
        });
        float result = parameter.valueFor(1);
        assertEquals(3.2188758f, result, 0.0001);
    }

    /**
     * Test case for when the demand curve function returns a zero value.
     */
    @Test
    void testValueForZero() {
        ParameterAttributes parameter = new ParameterAttributes();
        parameter.setElasticity(2);
        parameter.setLn(false);
        parameter.setDemandCurveFunction(new Function() {
            @Override
            public float valueFor(float x) {
                return 0;
            }

            @Override
            public String getFunctionName() {
                return "Test Function";
            }
        });
        assertThrows(IllegalArgumentException.class, () -> {
            parameter.valueFor(1);
        });
    }

    /**
     * Test case for when the demand curve function returns a negative value.
     */
    @Test
    void testValueForNegative() {
        ParameterAttributes parameter = new ParameterAttributes();
        parameter.setElasticity(2);
        parameter.setLn(false);
        parameter.setDemandCurveFunction(new Function() {
            @Override
            public float valueFor(float x) {
                return -5;
            }

            @Override
            public String getFunctionName() {
                return "Test Function";
            }
        });
        assertThrows(IllegalArgumentException.class, () -> {
            parameter.valueFor(1);
        });
    }

    /**
     * Test case for when the demand curve function returns a positive value and ln is false, and the input is a float number.
     */
    @Test
    void testValueForFloatPositiveLnFalse() {
        ParameterAttributes parameter = new ParameterAttributes();
        parameter.setElasticity(2);
        parameter.setLn(false);
        parameter.setDemandCurveFunction(new Function() {
            @Override
            public float valueFor(float x) {
                return 5;
            }

            @Override
            public String getFunctionName() {
                return "Test Function";
            }
        });
        float result = parameter.valueFor(5.5f);
        assertEquals(10, result);
    }

    /**
     * Test case for when the demand curve function returns a positive value and ln is true, and the input is a float number.
     */
    @Test
    void testValueForFloatPositiveLnTrue() {
        ParameterAttributes parameter = new ParameterAttributes();
        parameter.setElasticity(2);
        parameter.setLn(true);
        parameter.setDemandCurveFunction(new Function() {
            @Override
            public float valueFor(float x) {
                return 5;
            }

            @Override
            public String getFunctionName() {
                return "Test Function";
            }
        });
        float result = parameter.valueFor(5.5f);
        assertEquals(3.2188758f, result, 0.0001);
    }

    /**
     * Test case for when the demand curve function returns a zero value, and the input is a float number.
     */
    @Test
    void testValueForFloatZero() {
        ParameterAttributes parameter = new ParameterAttributes();
        parameter.setElasticity(2);
        parameter.setLn(false);
        parameter.setDemandCurveFunction(new Function() {
            @Override
            public float valueFor(float x) {
                return 0;
            }

            @Override
            public String getFunctionName() {
                return "Test Function";
            }
        });
        assertThrows(IllegalArgumentException.class, () -> {
            parameter.valueFor(5.5f);
        });
    }

    /**
     * Test case for when the demand curve function returns a negative value, and the input is a float number.
     */
    @Test
    void testValueForFloatNegative() {
        ParameterAttributes parameter = new ParameterAttributes();
        parameter.setElasticity(2);
        parameter.setLn(false);
        parameter.setDemandCurveFunction(new Function() {
            @Override
            public float valueFor(float x) {
                return -5;
            }

            @Override
            public String getFunctionName() {
                return "Test Function";
            }
        });
        assertThrows(IllegalArgumentException.class, () -> {
            parameter.valueFor(5.5f);
        });
    }

    /**
     * Test case for when the demand curve function is null.
     */
    @Test
    void testValueForNullDemandCurveFunction() {
        ParameterAttributes parameter = new ParameterAttributes();
        parameter.setElasticity(2);
        parameter.setLn(false);
        parameter.setDemandCurveFunction(null);
        assertThrows(NullPointerException.class, () -> {
            parameter.valueFor(1);
        });
    }

    /**
     * Test case for when the social function is set and the parameter is social.
     */
    @Test
    void testValueForSocial() {
        ParameterAttributes parameter = new ParameterAttributes();
        parameter.setElasticity(2);
        parameter.setLn(false);
        parameter.setSocial(true);
        parameter.setDemandCurveFunction(new Function() {
            @Override
            public float valueFor(float x) {
                return 5;
            }

            @Override
            public String getFunctionName() {
                return "Test Function";
            }
        });
        parameter.setSocialFunction(new Function() {
            @Override
            public float valueFor(float x) {
                return 3;
            }

            @Override
            public String getFunctionName() {
                return "Social Function";
            }
        });
        float result = parameter.valueFor(1);
        assertEquals(10, result);
    }

    /**
     * Test case for when the social function is set and the parameter is not social.
     */
    @Test
    void testValueForNotSocial() {
        ParameterAttributes parameter = new ParameterAttributes();
        parameter.setElasticity(2);
        parameter.setLn(false);
        parameter.setSocial(false);
        parameter.setDemandCurveFunction(new Function() {
            @Override
            public float valueFor(float x) {
                return 5;
            }

            @Override
            public String getFunctionName() {
                return "Test Function";
            }
        });
        parameter.setSocialFunction(new Function() {
            @Override
            public float valueFor(float x) {
                return 3;
            }

            @Override
            public String getFunctionName() {
                return "Social Function";
            }
        });
        float result = parameter.valueFor(1);
        assertEquals(10, result);
    }
}