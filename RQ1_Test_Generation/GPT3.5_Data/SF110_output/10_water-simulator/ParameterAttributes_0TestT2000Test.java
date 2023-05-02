// ParameterAttributes_0Test.java
package simulator.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ParameterAttributes}.
 * It contains ten unit test cases for the {@link ParameterAttributes#valueFor(int)} method.
 */
class ParameterAttributes_0Test {

    /**
     * Test case for a positive value of elasticity and a positive value of the function.
     */
    @Test
    void testValueForPositiveElasticityAndPositiveFunction() {
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
        assertEquals(10, result, 0.001);
    }

    /**
     * Test case for a positive value of elasticity and a negative value of the function.
     */
    @Test
    void testValueForPositiveElasticityAndNegativeFunction() {
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
        assertThrows(IllegalArgumentException.class, () -> parameter.valueFor(1));
    }

    /**
     * Test case for a negative value of elasticity and a positive value of the function.
     */
    @Test
    void testValueForNegativeElasticityAndPositiveFunction() {
        ParameterAttributes parameter = new ParameterAttributes();
        parameter.setElasticity(-2);
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
        assertEquals(-10, result, 0.001);
    }

    /**
     * Test case for a negative value of elasticity and a negative value of the function.
     */
    @Test
    void testValueForNegativeElasticityAndNegativeFunction() {
        ParameterAttributes parameter = new ParameterAttributes();
        parameter.setElasticity(-2);
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
        assertThrows(IllegalArgumentException.class, () -> parameter.valueFor(1));
    }

    /**
     * Test case for a positive value of elasticity and a positive value of the logarithm of the function.
     */
    @Test
    void testValueForPositiveElasticityAndPositiveLogarithm() {
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
        assertEquals(3.218, result, 0.001);
    }

    /**
     * Test case for a positive value of elasticity and a negative value of the logarithm of the function.
     */
    @Test
    void testValueForPositiveElasticityAndNegativeLogarithm() {
        ParameterAttributes parameter = new ParameterAttributes();
        parameter.setElasticity(2);
        parameter.setLn(true);
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
        assertThrows(IllegalArgumentException.class, () -> parameter.valueFor(1));
    }

    /**
     * Test case for a negative value of elasticity and a positive value of the logarithm of the function.
     */
    @Test
    void testValueForNegativeElasticityAndPositiveLogarithm() {
        ParameterAttributes parameter = new ParameterAttributes();
        parameter.setElasticity(-2);
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
        assertEquals(-3.218, result, 0.001);
    }

    /**
     * Test case for a negative value of elasticity and a negative value of the logarithm of the function.
     */
    @Test
    void testValueForNegativeElasticityAndNegativeLogarithm() {
        ParameterAttributes parameter = new ParameterAttributes();
        parameter.setElasticity(-2);
        parameter.setLn(true);
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
        assertThrows(IllegalArgumentException.class, () -> parameter.valueFor(1));
    }

    /**
     * Test case for a null demand curve function.
     */
    @Test
    void testValueForNullDemandCurveFunction() {
        ParameterAttributes parameter = new ParameterAttributes();
        parameter.setElasticity(2);
        parameter.setLn(false);
        parameter.setDemandCurveFunction(null);
        assertThrows(NullPointerException.class, () -> parameter.valueFor(1));
    }

    /**
     * Test case for a zero value of the function.
     */
    @Test
    void testValueForZeroFunction() {
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
        assertThrows(IllegalArgumentException.class, () -> parameter.valueFor(1));
    }

    /**
     * Test case for a negative value of the step.
     */
    @Test
    void testValueForNegativeStep() {
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
        assertThrows(IllegalArgumentException.class, () -> parameter.valueFor(-1));
    }
}