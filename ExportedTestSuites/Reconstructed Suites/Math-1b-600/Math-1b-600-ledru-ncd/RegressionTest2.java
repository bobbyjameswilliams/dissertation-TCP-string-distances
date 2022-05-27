package org.apache.commons.math3.fraction;;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_INTERVAL_INITIAL_VALUE_PARAMETERS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_INTERVAL_INITIAL_VALUE_PARAMETERS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_INTERVAL_INITIAL_VALUE_PARAMETERS));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ITERATIONS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ITERATIONS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ITERATIONS));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_DEFINITE_OPERATOR;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_DEFINITE_OPERATOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_DEFINITE_OPERATOR));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.HOLE_BETWEEN_MODELS_TIME_RANGES;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.HOLE_BETWEEN_MODELS_TIME_RANGES + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.HOLE_BETWEEN_MODELS_TIME_RANGES));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_KNOT_VALUES;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_KNOT_VALUES + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_KNOT_VALUES));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (byte) 0, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OBSERVED_COUNTS_BOTTH_ZERO_FOR_ENTRY;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OBSERVED_COUNTS_BOTTH_ZERO_FOR_ENTRY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OBSERVED_COUNTS_BOTTH_ZERO_FOR_ENTRY));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DATA_FOR_T_STATISTIC;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DATA_FOR_T_STATISTIC + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DATA_FOR_T_STATISTIC));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 28, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 28 to fraction (-27/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(1.0d, (int) (short) 2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 1 to fraction (-9,223,372,036,854,775,808/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((int) (byte) 10, 341642467);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.SAMPLE_SIZE_LARGER_THAN_POPULATION_SIZE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.SAMPLE_SIZE_LARGER_THAN_POPULATION_SIZE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.SAMPLE_SIZE_LARGER_THAN_POPULATION_SIZE));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BRACKETING_PARAMETERS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BRACKETING_PARAMETERS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BRACKETING_PARAMETERS));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 2 to fraction (-1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_COMPUTE_COVARIANCE_SINGULAR_PROBLEM;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_COMPUTE_COVARIANCE_SINGULAR_PROBLEM + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_COMPUTE_COVARIANCE_SINGULAR_PROBLEM));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ADDITION_COMPATIBLE_MATRICES;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ADDITION_COMPATIBLE_MATRICES + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ADDITION_COMPATIBLE_MATRICES));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_DECREASING_NUMBER_OF_POINTS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_DECREASING_NUMBER_OF_POINTS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_DECREASING_NUMBER_OF_POINTS));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OUTLINE_BOUNDARY_LOOP_OPEN;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUTLINE_BOUNDARY_LOOP_OPEN + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUTLINE_BOUNDARY_LOOP_OPEN));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INITIAL_COLUMN_AFTER_FINAL_COLUMN;
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) localizedFormats0);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INITIAL_COLUMN_AFTER_FINAL_COLUMN + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INITIAL_COLUMN_AFTER_FINAL_COLUMN));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR_OVERFLOW_AFTER_MULTIPLY;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR_OVERFLOW_AFTER_MULTIPLY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR_OVERFLOW_AFTER_MULTIPLY));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_COLUMN_INDEX_ARRAY;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_COLUMN_INDEX_ARRAY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_COLUMN_INDEX_ARRAY));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(1079525376, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient(0, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: must have n >= k for binomial coefficient (n, k), got k = 10, n = 0");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow((int) (byte) 2, (long) (short) -2662);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: exponent (-2,662)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(70L, 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math3.exception.ZeroException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.9982229502979703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999986258976d + "'", double1 == 0.9999999986258976d);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        double double3 = bigFraction0.pow((double) (byte) 10);
        int int4 = bigFraction0.intValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.048576E-4d + "'", double3 == 1.048576E-4d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 2 to fraction (-1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(200.0d, (int) (short) -2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 200 to fraction (-199/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 87, 0.0d, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 87 to fraction (9,223,372,036,854,775,722/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math3.util.MathUtils.checkFinite(doubleArray0);
        int int2 = org.apache.commons.math3.util.MathUtils.hash(doubleArray0);
        int int3 = org.apache.commons.math3.util.MathUtils.hash(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) '#');
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.divide(bigFraction2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(31, 1078591488);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide((int) (byte) 1);
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction2.getField();
        boolean boolean5 = fraction2.equals((java.lang.Object) true);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-1.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.99999994f) + "'", float1 == (-0.99999994f));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, (double) (byte) 30);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.WHOLE_FORMAT;
        java.lang.Class<?> wildcardClass1 = localizedFormats0.getClass();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.WHOLE_FORMAT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.WHOLE_FORMAT));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient(1395, 961);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (byte) 2, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9999999f + "'", float2 == 1.9999999f);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.FOUR_FIFTHS;
        long long1 = bigFraction0.longValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 25L, (float) 1018167296);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 25.0f + "'", float2 == 25.0f);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 27405L, (-4));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 27,405 to fraction (9,223,372,036,854,748,404/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        long long2 = org.apache.commons.math3.util.FastMath.max(1233225L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1233225L + "'", long2 == 1233225L);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math3.util.ArithmeticUtils.pow((long) 45, (long) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: exponent (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math3.util.ArithmeticUtils.factorial((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        java.lang.Number number0 = null;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((double) 10.000001f);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction2.subtract((-99));
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException6 = new org.apache.commons.math3.exception.NumberIsTooSmallException(number0, (java.lang.Number) (-99), true);
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.negate();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide((int) (byte) 10);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) 70, 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math3.exception.ZeroException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(1072693248L);
        java.lang.Number number2 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException4 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigFraction1, number2, false);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext5 = numberIsTooSmallException4.getContext();
        org.junit.Assert.assertNotNull(exceptionContext5);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_SCALE;
        java.lang.String str1 = localizedFormats0.getSourceString();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_SCALE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_SCALE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "scale must be positive ({0})" + "'", str1, "scale must be positive ({0})");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(0.0d, 0.0d, 341642467);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.MINUS_ONE;
        long long1 = bigFraction0.longValue();
        double double2 = bigFraction0.doubleValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.multiply(0);
        int int4 = fraction3.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 2, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 2/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math3.util.ArithmeticUtils.stirlingS2((-1074790400), (int) (short) -35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: -35 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.MINUS_ONE;
        long long1 = bigFraction0.longValue();
        int int2 = bigFraction0.intValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient((-2), 45);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: must have n >= k for binomial coefficient (n, k), got k = 45, n = -2");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 4L, (-1074790400));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((double) 144, 2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 144 to fraction (-143/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(1.9233097485725157d, (int) (short) 100);
        java.lang.String str3 = bigFraction2.toString();
        java.lang.String str4 = bigFraction2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "25 / 13" + "'", str3, "25 / 13");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "25 / 13" + "'", str4, "25 / 13");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-1324025208));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(1, 1078591488);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(1395);
        short short5 = fraction4.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 268435456L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.68435488E8f + "'", float1 == 2.68435488E8f);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.multiply(0);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.subtract((int) '#');
        byte byte6 = fraction5.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -35 + "'", byte6 == (byte) -35);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(1.0471975511965979d, 0.5d, 28);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.FractionField fractionField5 = fraction3.getField();
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField6 = fraction3.getField();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fractionField6);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(0.0d, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog((int) (byte) 1, 2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: must have n >= k for binomial coefficient (n, k), got k = 2, n = 1");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_RESULT_AVAILABLE;
        java.lang.String str1 = localizedFormats0.getSourceString();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_RESULT_AVAILABLE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_RESULT_AVAILABLE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "no result available" + "'", str1, "no result available");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.9233097485725157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9233097485725157d + "'", double1 == 1.9233097485725157d);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(0.0d, (double) 100.0f, (-1));
        org.apache.commons.math3.fraction.Fraction fraction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.add(fraction4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.multiply(0);
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction3.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.99999994f) + "'", float1 == (-0.99999994f));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 2L, (double) 1.07859136E9f, 45);
        org.apache.commons.math3.fraction.Fraction fraction7 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 100, 10.0d, (int) (byte) 100);
        int int8 = fraction7.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction3.subtract(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction(8.533571849246034d, 0.46011212426284637d, (-238262335));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Unable to convert 8.534 to fraction after -238,262,335 iterations");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-30.0d), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -30 to fraction (31/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((int) (byte) 2, (-1505755133));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble((-26));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: must have n >= 0 for n!, got n = -26");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO;
        org.apache.commons.math3.fraction.BigFractionField bigFractionField1 = bigFraction0.getField();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.subtract(32L);
        long long4 = bigFraction0.getDenominatorAsLong();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFractionField1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.07952524960206E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.07952524960206E9d + "'", double1 == 1.07952524960206E9d);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((-1079525376), (-2));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 99L, 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4016141E12f + "'", float2 == 3.4016141E12f);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(97, 35);
        int int3 = bigFraction2.getNumeratorAsInt();
        float float4 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.reduce();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.7714286f + "'", float4 == 2.7714286f);
        org.junit.Assert.assertNotNull(bigFraction5);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog((int) (byte) 1, 100000000);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: must have n >= k for binomial coefficient (n, k), got k = 100,000,000, n = 1");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(45, 1104155264);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: must have n >= k for binomial coefficient (n, k), got k = 1,104,155,264, n = 45");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math3.exception.ZeroException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math3.util.ArithmeticUtils.stirlingS2(1083558912, 1072693217);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((long) 30, (long) (byte) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(localizable0, (java.lang.Number) 1.0f, (java.lang.Number) 10, false);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext5 = numberIsTooSmallException4.getContext();
        java.lang.Throwable[] throwableArray6 = numberIsTooSmallException4.getSuppressed();
        org.junit.Assert.assertNotNull(exceptionContext5);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_FIFTH;
        boolean boolean2 = bigFraction0.equals((java.lang.Object) 3.141592653589793d);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction0.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction4.reduce();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.5384786408469175d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5384786408469175d + "'", double2 == 0.5384786408469175d);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog((-42592), 1078591520);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: must have n >= k for binomial coefficient (n, k), got k = 1,078,591,520, n = -42,592");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient(0, 1395);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: must have n >= k for binomial coefficient (n, k), got k = 1,395, n = 0");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math3.util.ArithmeticUtils.stirlingS2(12, (int) (short) 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: 35 is larger than the maximum (12)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.2840254166877414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2840254166877416d + "'", double1 == 1.2840254166877416d);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((-1324025208), 1072693217);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 'a', (double) (byte) 1, (int) (byte) 0);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.divide((-2));
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.9315964599440725d), 3.4339872044851463d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2649110993460358d) + "'", double2 == (-0.2649110993460358d));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 88529280, (long) (-18));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 88529280L + "'", long2 == 88529280L);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((long) 1, (long) 1073741824);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1073741824L + "'", long2 == 1073741824L);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_SMALL_BOUND_EXCLUDED;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_SMALL_BOUND_EXCLUDED + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_SMALL_BOUND_EXCLUDED));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        java.math.BigInteger bigInteger2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.multiply(bigInteger2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND));
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_NUMBER_OF_TRIALS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_NUMBER_OF_TRIALS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_NUMBER_OF_TRIALS));
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.DIFFERENT_ORIG_AND_PERMUTED_DATA;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIFFERENT_ORIG_AND_PERMUTED_DATA + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIFFERENT_ORIG_AND_PERMUTED_DATA));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_REGRESSION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_REGRESSION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_REGRESSION));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_BRACKET_OPTIMUM_IN_LINE_SEARCH;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_BRACKET_OPTIMUM_IN_LINE_SEARCH + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_BRACKET_OPTIMUM_IN_LINE_SEARCH));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.FACTORIAL_NEGATIVE_PARAMETER;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.FACTORIAL_NEGATIVE_PARAMETER + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.FACTORIAL_NEGATIVE_PARAMETER));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_LARGE_TOURNAMENT_ARITY;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_LARGE_TOURNAMENT_ARITY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_LARGE_TOURNAMENT_ARITY));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_SOLVE_SINGULAR_PROBLEM;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_SOLVE_SINGULAR_PROBLEM + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_SOLVE_SINGULAR_PROBLEM));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        double double1 = org.apache.commons.math3.util.FastMath.log(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.302585092994046d + "'", double1 == 2.302585092994046d);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.BANDWIDTH;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BANDWIDTH + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BANDWIDTH));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_MANY_ELEMENTS_TO_DISCARD_FROM_ARRAY;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_MANY_ELEMENTS_TO_DISCARD_FROM_ARRAY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_MANY_ELEMENTS_TO_DISCARD_FROM_ARRAY));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((long) 2, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_POLYNOMIAL_DEGREE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_POLYNOMIAL_DEGREE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_POLYNOMIAL_DEGREE));
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ELITISM_RATE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ELITISM_RATE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ELITISM_RATE));
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((double) 10.0f);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField2 = bigFraction1.getField();
        org.junit.Assert.assertNotNull(bigFractionField2);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_OBSERVED_POINTS_IN_SAMPLE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_OBSERVED_POINTS_IN_SAMPLE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_OBSERVED_POINTS_IN_SAMPLE));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (short) 0, (float) 5392957440L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.SIMPLEX_NEED_ONE_POINT;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.SIMPLEX_NEED_ONE_POINT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.SIMPLEX_NEED_ONE_POINT));
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNPARSEABLE_COMPLEX_NUMBER;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNPARSEABLE_COMPLEX_NUMBER + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNPARSEABLE_COMPLEX_NUMBER));
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_MULTIPLICATION_COMPATIBLE_MATRICES;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_MULTIPLICATION_COMPATIBLE_MATRICES + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_MULTIPLICATION_COMPATIBLE_MATRICES));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        double double1 = org.apache.commons.math3.util.FastMath.sin(3.552713678800501E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.POLYNOMIAL_INTERPOLANTS_MISMATCH_SEGMENTS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POLYNOMIAL_INTERPOLANTS_MISMATCH_SEGMENTS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POLYNOMIAL_INTERPOLANTS_MISMATCH_SEGMENTS));
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_FRACTION_TO_DIVIDE_BY;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_FRACTION_TO_DIVIDE_BY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_FRACTION_TO_DIVIDE_BY));
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 1.07859136E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0785913600000002E9d + "'", double1 == 1.0785913600000002E9d);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.DISCRETE_CUMULATIVE_PROBABILITY_RETURNED_NAN;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DISCRETE_CUMULATIVE_PROBABILITY_RETURNED_NAN + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DISCRETE_CUMULATIVE_PROBABILITY_RETURNED_NAN));
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow((int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(localizable0, (java.lang.Number) 1.0f, (java.lang.Number) 10, false);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext5 = numberIsTooSmallException4.getContext();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext6 = numberIsTooSmallException4.getContext();
        org.junit.Assert.assertNotNull(exceptionContext5);
        org.junit.Assert.assertNotNull(exceptionContext6);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308232d + "'", double1 == 57.29577951308232d);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (byte) 1, (long) (-1074790400));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1074790400L) + "'", long2 == (-1074790400L));
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 70L, (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 70.00714249274856d + "'", double2 == 70.00714249274856d);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        short short1 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 2 + "'", short1 == (short) 2);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 70L, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 140.0d + "'", double2 == 140.0d);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow(1018167296, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math3.util.ArithmeticUtils.stirlingS2((int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: 10 is larger than the maximum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) '#', (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) '4', (double) (short) -2662);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-52.0d) + "'", double2 == (-52.0d));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((long) (-99), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-99L) + "'", long2 == (-99L));
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException2 = new org.apache.commons.math3.fraction.FractionConversionException(7.930067261567154E14d, (int) '#');
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext3 = fractionConversionException2.getContext();
        org.junit.Assert.assertNotNull(exceptionContext3);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 0.25541281188299536d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction(0.0d, (-0.6321205588285577d), (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_PARAMETERS_RELATIVE_TOLERANCE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_PARAMETERS_RELATIVE_TOLERANCE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_PARAMETERS_RELATIVE_TOLERANCE));
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math3.util.ArithmeticUtils.factorial(360339393);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction(71.84044670030279d, (double) 1077673984, 5);
        java.math.BigDecimal bigDecimal6 = bigFraction3.bigDecimalValue((int) (short) 1, (int) (short) 1);
        short short7 = bigFraction3.shortValue();
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 71 + "'", short7 == (short) 71);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(6.691673596021348E41d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 669,167,359,602,134,800,000,000,000,000,000,000,000,000 to fraction (9,223,372,036,854,775,807/1)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        double double1 = org.apache.commons.math3.util.FastMath.log10(7.629394531324015E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.117509926283467d) + "'", double1 == (-5.117509926283467d));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math3.util.ArithmeticUtils.factorial(1807551715);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.569397566060481d + "'", double1 == 7.569397566060481d);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction(0.0d, 7.105427357600977E-15d, 1807551715);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.multiply((-341642466L));
        org.junit.Assert.assertNotNull(bigFraction5);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 9800L, (double) 341642467L, (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply(fraction4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.384185791015625E-7d, 70.00714249274856d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.384185791015625E-7d + "'", double2 == 2.384185791015625E-7d);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math3.util.ArithmeticUtils.stirlingS2(0, 340593891);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: 340,593,891 is larger than the maximum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((long) 28, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28L + "'", long2 == 28L);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) Float.POSITIVE_INFINITY, (double) (-1L), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert ? to fraction (9,223,372,036,854,775,807/1)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        short short2 = org.apache.commons.math3.util.MathUtils.copySign((short) 71, (short) -2662);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -71 + "'", short2 == (short) -71);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.429369702178807E-8d + "'", double1 == 8.429369702178807E-8d);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 2);
        java.lang.String str3 = fraction2.toString();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.629423635154472E-6d + "'", double1 == 7.629423635154472E-6d);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math3.util.ArithmeticUtils.factorial(97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((-31), 1074790400);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(12.566370614359172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.566370614359174d + "'", double1 == 12.566370614359174d);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.07859136E9f, 1.5707963258685635d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.07859123E9f + "'", float2 == 1.07859123E9f);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 4);
        org.apache.commons.math3.fraction.FractionField fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fractionField2.getOne();
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 9700L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9700.001f + "'", float1 == 9700.001f);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        long long1 = org.apache.commons.math3.util.ArithmeticUtils.factorial((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3628800L + "'", long1 == 3628800L);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281828459045d + "'", double1 == 2.718281828459045d);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(9.332621544395286E157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.660549437995381E78d + "'", double1 == 9.660549437995381E78d);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        int int2 = org.apache.commons.math3.util.MathUtils.copySign(268435456, (-1074790400));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-268435456) + "'", int2 == (-268435456));
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math3.util.ArithmeticUtils.stirlingS2(87, (-31));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: -31 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(0.0d, (double) 100.0f, (-1));
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.subtract((-929312903));
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.multiply((-238262335));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.multiply(35);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction(1.079525376E9d);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.multiply(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction5);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 1395L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.3473430653209d + "'", double1 == 24.3473430653209d);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 1505937885570L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1505937885570L + "'", long1 == 1505937885570L);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_FIFTH;
        boolean boolean2 = bigFraction0.equals((java.lang.Object) 3.141592653589793d);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.abs();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bigFraction3);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((long) 6, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-29L) + "'", long2 == (-29L));
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math3.util.ArithmeticUtils.factorial(30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-2762.0d), 3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.1070314728E10d) + "'", double2 == (-2.1070314728E10d));
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(3, 1077673984);
        float float3 = bigFraction2.floatValue();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.7837732E-9f + "'", float3 == 2.7837732E-9f);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        double double3 = fraction2.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 1395);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207031E-4f + "'", float1 == 1.2207031E-4f);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(1.0471975511965979d, 0.5d, 28);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.subtract((int) (short) -2);
        byte byte7 = fraction3.byteValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.5384786408469175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5153607460569013d + "'", double1 == 0.5153607460569013d);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) 1L, 9.412486374792455E7d, 5);
        int int4 = bigFraction3.intValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 1104155264L, (int) (byte) 2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 1,104,155,264 to fraction (-1,104,155,263/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.515438670919167E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        double double3 = org.apache.commons.math3.util.MathUtils.reduce(1.5395564933646284d, (-0.9899924966004454d), 0.5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.049563996764182994d + "'", double3 == 0.049563996764182994d);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.4913616938342726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9546569268600785d + "'", double1 == 0.9546569268600785d);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((-47), (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1504) + "'", int2 == (-1504));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 1.0747904E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.79539150370183d + "'", double1 == 20.79539150370183d);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math3.util.MathUtils.checkFinite(doubleArray0);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog((int) (short) -30, 360339393);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: must have n >= k for binomial coefficient (n, k), got k = 360,339,393, n = -30");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-61L), (-17));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.6539307E-4f) + "'", float2 == (-4.6539307E-4f));
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0d, (-200.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.6783156523793671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9705558343694834d + "'", double1 == 0.9705558343694834d);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(7.896326140304252E13d, 100.00000762939453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.89632614030425E13d + "'", double2 == 7.89632614030425E13d);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 126L, (double) 135070657);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 126.00001f + "'", float2 == 126.00001f);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math3.util.ArithmeticUtils.stirlingS2(0, 1811785010);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: 1,811,785,010 is larger than the maximum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        double double3 = org.apache.commons.math3.util.MathUtils.reduce((double) 862L, 0.7519972863480745d, (-20.101268236238415d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.008451349946998477d + "'", double3 == 0.008451349946998477d);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-1.5706907148240663d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2079015320818893d + "'", double1 == 0.2079015320818893d);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        double double1 = org.apache.commons.math3.util.FastMath.log10(120.00416659433121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.07919632519356d + "'", double1 == 2.07919632519356d);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        double double3 = org.apache.commons.math3.util.MathUtils.reduce((-0.39794000867203755d), (double) 1079525376, (double) 126L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.07952524960206E9d + "'", double3 == 1.07952524960206E9d);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-26));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999948909d) + "'", double1 == (-0.9999999999948909d));
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.add((long) (byte) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.divide((-1072693248));
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-31.75d), (double) 2.7837732E-9f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.3567476031539627E-9d) + "'", double2 == (-1.3567476031539627E-9d));
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(52, 1078591488);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.627482429927895d, (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.627482429927895d + "'", double2 == 0.627482429927895d);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math3.util.ArithmeticUtils.stirlingS2((-97), (-30));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: -30 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 1807551715, 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.86418E38f + "'", float2 == 2.86418E38f);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.multiply(35);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.abs();
        long long4 = bigFraction0.getDenominatorAsLong();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5L + "'", long4 == 5L);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        double double2 = org.apache.commons.math3.util.MathUtils.normalizeAngle(2.220446049250313E-16d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.220446049250313E-16d + "'", double2 == 2.220446049250313E-16d);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 96.99999f, (-1.3567476031539627E-9d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 31.999998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896280957293019E13d + "'", double1 == 7.896280957293019E13d);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (short) -35, (double) 3.60339392E8f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        long long2 = org.apache.commons.math3.util.FastMath.max(1077673984L, (long) 29);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1077673984L + "'", long2 == 1077673984L);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((int) (short) -2662, (int) (short) 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-42592) + "'", int2 == (-42592));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1424L, (double) (-100.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.45657346E-316d + "'", double2 == 4.45657346E-316d);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction(71.84044670030279d, (double) 1077673984, 5);
        java.math.BigDecimal bigDecimal6 = bigFraction3.bigDecimalValue((int) (short) 1, (int) (short) 1);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction3.multiply((int) '#');
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigFraction8);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        long long1 = org.apache.commons.math3.util.FastMath.round(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(7.888609052210118E-31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7516230804060213E-46d + "'", double1 == 1.7516230804060213E-46d);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((-2L), 9700L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-19400L) + "'", long2 == (-19400L));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((long) 1083558912, (long) 1104155264);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2187714176L + "'", long2 == 2187714176L);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        double double1 = org.apache.commons.math3.util.FastMath.cos(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.960170286650366d + "'", double1 == 0.960170286650366d);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0E100d, (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-200d + "'", double2 == 1.0E-200d);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((-1074790400L), (long) (short) -2);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction2.add(60L);
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.811784996E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1621613518432293E7d + "'", double1 == 3.1621613518432293E7d);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.0000000013752508d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01745329254394595d + "'", double1 == 0.01745329254394595d);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        short short2 = org.apache.commons.math3.util.MathUtils.copySign((short) 35, (short) (byte) 35);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 35 + "'", short2 == (short) 35);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3.3289514180086344E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.328951418008635E-8d + "'", double1 == 3.328951418008635E-8d);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction(20.0d, (double) 20L, 14);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException6 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) 20.0d, (java.lang.Number) 3628800.0d, false);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 3628800L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3628800.0d + "'", double1 == 3628800.0d);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 71);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 71.00001f + "'", float1 == 71.00001f);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        double double1 = org.apache.commons.math3.util.FastMath.abs(53.5283502280899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.5283502280899d + "'", double1 == 53.5283502280899d);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6321205588285577d) + "'", double1 == (-0.6321205588285577d));
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(localizable0, (java.lang.Number) 1.0f, (java.lang.Number) 10, false);
        boolean boolean5 = numberIsTooSmallException4.getBoundIsAllowed();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_UPPER_BOUND;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_UPPER_BOUND + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_UPPER_BOUND));
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_BRIGHTNESS_EXPONENT;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_BRIGHTNESS_EXPONENT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_BRIGHTNESS_EXPONENT));
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_BOUND;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_BOUND + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_BOUND));
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS));
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_NUMBER_OF_SAMPLES;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_NUMBER_OF_SAMPLES + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_NUMBER_OF_SAMPLES));
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 35L, (double) '#', (int) (short) 1);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 97.0f, (double) 0.25f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5682190129139257d + "'", double2 == 1.5682190129139257d);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        short short2 = bigFraction1.shortValue();
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.REAL_FORMAT;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.REAL_FORMAT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.REAL_FORMAT));
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((long) (short) 10, (long) 1078591488);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5392957440L + "'", long2 == 5392957440L);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OBSERVED_COUNTS_ALL_ZERO;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OBSERVED_COUNTS_ALL_ZERO + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OBSERVED_COUNTS_ALL_ZERO));
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(0L, (long) 341642467);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 341642467L + "'", long2 == 341642467L);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276743037347d + "'", double1 == 1.4711276743037347d);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_COMPLEX_MODULE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_COMPLEX_MODULE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_COMPLEX_MODULE));
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.0d, (-31));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.6566128730773926E-10d + "'", double2 == 4.6566128730773926E-10d);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.SINGULAR_OPERATOR;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.SINGULAR_OPERATOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.SINGULAR_OPERATOR));
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(9700L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9800L + "'", long2 == 9800L);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9046745947545269d + "'", double1 == 0.9046745947545269d);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 1.5845633E31f, (double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        boolean boolean1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo((long) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 70L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70.0d + "'", double1 == 70.0d);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        double double1 = org.apache.commons.math3.util.FastMath.sin(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2246467991473532E-16d + "'", double1 == 1.2246467991473532E-16d);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 32.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896326140304252E13d + "'", double1 == 7.896326140304252E13d);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((-1), (int) (short) -1);
        long long3 = fraction2.longValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (short) 100, 200.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1505149978319904d + "'", double2 == 1.1505149978319904d);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) (short) 1, (double) 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 28L, Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.2840254166877414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(4.6566128730773926E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.718281828459045d, (-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9233097485725157d + "'", double2 == 1.9233097485725157d);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(45, (int) (short) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.897704943128636d + "'", double2 == 6.897704943128636d);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.9046745947545269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.812337498822692d + "'", double1 == 0.812337498822692d);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(7.896326140304252E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015625d + "'", double1 == 0.015625d);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 4);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.7683716E-7f + "'", float1 == 4.7683716E-7f);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.5682190129139257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.294839597872029d + "'", double1 == 2.294839597872029d);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.pow(70L, 38L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8667487270275645440L) + "'", long2 == (-8667487270275645440L));
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2204460492503128E-16d + "'", double1 == 2.2204460492503128E-16d);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 32, (float) 268435456L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        int int1 = bigFraction0.intValue();
        int int2 = bigFraction0.getDenominatorAsInt();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        double double1 = org.apache.commons.math3.util.FastMath.log10(5.649334448629621d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7519972863480745d + "'", double1 == 0.7519972863480745d);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(6L, (long) 1077673984);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6466043904L + "'", long2 == 6466043904L);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(33228.83181816658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1903871.821330967d + "'", double1 == 1903871.821330967d);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.5585053606381855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5925828509060219d + "'", double1 == 0.5925828509060219d);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((int) (short) -71, 1074790400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1074790471) + "'", int2 == (-1074790471));
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((long) (-30), (long) (short) -35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 210L + "'", long2 == 210L);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-31), (long) 52360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1877073665 + "'", int2 == 1877073665);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException2 = new org.apache.commons.math3.fraction.FractionConversionException(7.896326140304252E13d, 0);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext3 = fractionConversionException2.getContext();
        org.junit.Assert.assertNotNull(exceptionContext3);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 30, 341642467);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 341642467 + "'", int2 == 341642467);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49321676688550387d + "'", double1 == 0.49321676688550387d);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (byte) 30);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0686474581523463E13d + "'", double1 == 1.0686474581523463E13d);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(3.552713678800507E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.888609052210118E-31d + "'", double1 == 7.888609052210118E-31d);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        float float1 = fraction0.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.33333334f + "'", float1 == 0.33333334f);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.8563690240890007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1221078653007956d + "'", double1 == 3.1221078653007956d);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_THIRD;
        long long1 = bigFraction0.longValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_2D_INDEX;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_2D_INDEX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_2D_INDEX));
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 1072693248L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5384786408469177d + "'", double1 == 0.5384786408469177d);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 32L, 4.6566128730773926E-10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.999999999999996d + "'", double2 == 31.999999999999996d);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 32.000004f, 1.9233097485725157d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5107651208185948d + "'", double2 == 1.5107651208185948d);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.75d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9315964599440725d) + "'", double1 == (-0.9315964599440725d));
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((long) (-1), (long) 70);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 70L + "'", long2 == 70L);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.1805916207174113E-14d, (double) 10000000000L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1805916207174113E-14d + "'", double2 == 1.1805916207174113E-14d);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 31.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5410520681182421d + "'", double1 == 0.5410520681182421d);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 1078591488);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.1798740081135376E10d + "'", double1 == 6.1798740081135376E10d);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, (float) (-542210689));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 100.0f, 23.7189981105004d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7415503163138826E47d + "'", double2 == 2.7415503163138826E47d);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(35.0d, (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 341642467, 1.5107651208185948d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.020999055593360003d + "'", double2 == 0.020999055593360003d);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_32_BITS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_32_BITS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_32_BITS));
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.0000000000000016E-31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.07952524960206E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(8.533571849246034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2541.2837099876647d + "'", double1 == 2541.2837099876647d);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        double double3 = org.apache.commons.math3.util.MathUtils.reduce(0.0d, (double) 21952L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 70);
        short short2 = bigFraction1.shortValue();
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 70 + "'", short2 == (short) 70);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.pow(5392957440L);
        float float3 = bigFraction0.floatValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0, 10);
        java.lang.String str3 = fraction2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 9700L, (-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5708614938627248d + "'", double2 == 1.5708614938627248d);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((long) 2, 485210968859607040L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 485210968859607042L + "'", long2 == 485210968859607042L);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.515438670919167E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4333571589785714d) + "'", double1 == (-0.4333571589785714d));
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.2291268324586927d, (double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2291268324586927d + "'", double2 == 0.2291268324586927d);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.util.MathUtils.checkFinite(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long2 = bigFraction1.getNumeratorAsLong();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        double double1 = org.apache.commons.math3.util.FastMath.rint(3.552713678800507E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        double double1 = org.apache.commons.math3.util.FastMath.log(7.896326140304252E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.00000381469725d + "'", double1 == 32.00000381469725d);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 70.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.515438670919167E30d + "'", double1 == 2.515438670919167E30d);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.9999912096442254d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 360339393, (double) (-4));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.931342865682863E-35d + "'", double2 == 5.931342865682863E-35d);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 1395, 1.5107651208185948d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5697133414686018d + "'", double2 == 1.5697133414686018d);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(341642467, 28);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.85673842301471E209d + "'", double2 == 2.85673842301471E209d);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-31.0d), 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-496.0d) + "'", double2 == (-496.0d));
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        double double1 = org.apache.commons.math3.util.ArithmeticUtils.factorialLog(961);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5643.4764194733725d + "'", double1 == 5643.4764194733725d);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (short) 71);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.5384786408469177d, 1.0000000000000016E-31d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5384786408469175d + "'", double2 == 0.5384786408469175d);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 268435456);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5380218700469711E10d + "'", double1 == 1.5380218700469711E10d);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.627482429927895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.46603960848311693d) + "'", double1 == (-0.46603960848311693d));
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(localizable0, (java.lang.Number) 0.9705558343694834d, (java.lang.Number) 1.2676506002282296E-20d, true);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 52360);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52360.004f + "'", float1 == 52360.004f);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.5395564933646284d, (double) 1079525376);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.079525376E9d + "'", double2 == 1.079525376E9d);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9801980198019802d, (int) (byte) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9607881580237231d + "'", double2 == 0.9607881580237231d);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(0, (-1072693248));
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        double double2 = org.apache.commons.math3.util.MathUtils.normalizeAngle(0.42279321873816184d, 0.4000000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.42279321873816184d + "'", double2 == 0.42279321873816184d);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (-1.0f));
        java.lang.String str2 = fraction1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(31.026580882699598d, 635.856379863918d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.026580882699598d + "'", double2 == 31.026580882699598d);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.49321676688550387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4932167668855039d + "'", double1 == 0.4932167668855039d);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        short short2 = org.apache.commons.math3.util.MathUtils.copySign((short) -2, (short) 70);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 2 + "'", short2 == (short) 2);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        double double1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(1.9233097485725157d, (int) (short) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction2.abs();
        java.math.BigInteger bigInteger4 = bigFraction2.getDenominator();
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigInteger4);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        double double1 = org.apache.commons.math3.util.FastMath.floor(67.88974313718154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 67.0d + "'", double1 == 67.0d);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 1.07859136E9f);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.negate();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.negate();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        double double1 = org.apache.commons.math3.util.FastMath.log10(31.999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5051499783199058d + "'", double1 == 1.5051499783199058d);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5585053606381855d + "'", double1 == 0.5585053606381855d);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(3.4164246700000036E8d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.416424670000003E8d + "'", double2 == 3.416424670000003E8d);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.078591488E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow(11, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 475956593 + "'", int2 == 475956593);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        double double1 = org.apache.commons.math3.util.FastMath.asin(7.105427357600977E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357600977E-15d + "'", double1 == 7.105427357600977E-15d);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.4333571589785714d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.5902773407317596E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5902773407317596E-15d + "'", double1 == 1.5902773407317596E-15d);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(4.2177681591407135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 241.66031448342542d + "'", double1 == 241.66031448342542d);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((-929312903), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(32, (int) (short) 1);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide((int) (byte) 1);
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction2.getField();
        java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.fraction.Fraction>> wildcardClass4 = fractionField3.getRuntimeClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 1078591488);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7786307212869168d + "'", double1 == 0.7786307212869168d);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 268435456, 144);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException2 = new org.apache.commons.math3.fraction.FractionConversionException(3628800.0d, (-1));
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext3 = fractionConversionException2.getContext();
        org.junit.Assert.assertNotNull(exceptionContext3);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(25.0d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 25.0d + "'", double2 == 25.0d);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 6.1035156E-5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.103515625000001E-5d + "'", double1 == 6.103515625000001E-5d);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 961);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.627482429927895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6783156523793671d + "'", double1 == 0.6783156523793671d);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        short short2 = org.apache.commons.math3.util.MathUtils.copySign((short) 2, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 2 + "'", short2 == (short) 2);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.4000000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39794000867203755d) + "'", double1 == (-0.39794000867203755d));
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(7.930067261567154E14d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.930067261567152E14d + "'", double2 == 7.930067261567152E14d);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.5925828509060219d, 4.784907962876926E45d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5925828509060219d + "'", double2 == 0.5925828509060219d);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-57.29577951308232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7336545584598283d + "'", double1 == 0.7336545584598283d);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        double double1 = org.apache.commons.math3.util.FastMath.log(15.104412573075516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.714986924514427d + "'", double1 == 2.714986924514427d);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707055269350272d + "'", double1 == 1.5707055269350272d);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        double double3 = org.apache.commons.math3.util.MathUtils.reduce(100.0d, (-0.75d), (double) (-2952716662570746864L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((long) 476008953, (long) (short) -35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 476008988L + "'", long2 == 476008988L);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.0471975511965979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(1078591488, 8);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 1, (-1072693248));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1072693248) + "'", int2 == (-1072693248));
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((long) 1104155264, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1104155264L + "'", long2 == 1104155264L);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(961, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 53.5283502280899d + "'", double2 == 53.5283502280899d);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble((int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.731030945644E13d + "'", double2 == 1.731030945644E13d);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.6929693744344998d, 1.0000000000000016E-31d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6929693744344998d + "'", double2 == 1.6929693744344998d);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-2.1070314728E10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23566964736463444d + "'", double1 == 0.23566964736463444d);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-127));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23235910202965793d + "'", double1 == 0.23235910202965793d);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5860134523134298E15d + "'", double1 == 1.5860134523134298E15d);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.multiply(268435456);
        org.junit.Assert.assertNotNull(bigFraction3);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        double double1 = org.apache.commons.math3.util.ArithmeticUtils.factorialLog((int) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 349.9541180407703d + "'", double1 == 349.9541180407703d);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.57090260800827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171692148363411d + "'", double1 == 0.9171692148363411d);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((-30), 70);
        long long3 = bigFraction2.getNumeratorAsLong();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3L) + "'", long3 == (-3L));
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow(135070657, 181178499600L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1317061631) + "'", int2 == (-1317061631));
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((long) (-53), (-29L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-24L) + "'", long2 == (-24L));
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(635.856379863918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.456544166829538d + "'", double1 == 6.456544166829538d);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-8.016872967151407d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1621719397004844d) + "'", double1 == (-0.1621719397004844d));
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 519.99994f, 1.2577193354595834E30d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 519.9999389648438d + "'", double2 == 519.9999389648438d);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 7.6293945E-6f, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0517578125E-5d + "'", double2 == 3.0517578125E-5d);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 465524053);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.651821505227584d + "'", double1 == 20.651821505227584d);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-200.0d), 70);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1805916207174114E161d + "'", double2 == 1.1805916207174114E161d);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(97, 35);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction2.pow((-127));
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.104155264E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        float float2 = org.apache.commons.math3.util.FastMath.min(10.0f, (float) (-929312903));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.293129E8f) + "'", float2 == (-9.293129E8f));
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(70.00714249274856d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 210L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 210.0d + "'", double1 == 210.0d);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 1104155264L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33228.83181816658d + "'", double1 == 33228.83181816658d);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.add((long) (byte) 2);
        java.math.BigInteger bigInteger4 = bigFraction1.getDenominator();
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigInteger4);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction((int) 'a', 1078591488);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException2 = new org.apache.commons.math3.fraction.FractionConversionException((double) (-2952716662570746864L), (int) (short) 71);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.1805916207174113E-14d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-47) + "'", int1 == (-47));
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608274590866d + "'", double1 == 0.6483608274590866d);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.4339872044851463d, 71);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1007932393182316E38d + "'", double2 == 1.1007932393182316E38d);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.050000000000001d + "'", double1 == 5.050000000000001d);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 30, 52);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        double double1 = org.apache.commons.math3.util.FastMath.cos(67.88974313718154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33866819356389966d + "'", double1 == 0.33866819356389966d);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        double double3 = org.apache.commons.math3.util.MathUtils.reduce((double) 9800.0f, 128.00000000000003d, (double) 4L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 67.99999999999818d + "'", double3 == 67.99999999999818d);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-5.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.380515006246586d + "'", double1 == 3.380515006246586d);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        java.lang.Object[] objArray1 = null;
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException2 = new org.apache.commons.math3.exception.MathIllegalArgumentException(localizable0, objArray1);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.3633850893556905d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0667541031272256d + "'", double1 == 1.0667541031272256d);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction((int) (short) 2, (int) (byte) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction2.pow((long) 32);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.731537741517051d + "'", double1 == 1.731537741517051d);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.9626058663135666d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38189641719793466d + "'", double1 == 0.38189641719793466d);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        double double1 = org.apache.commons.math3.util.FastMath.cos(9.292475992245455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.991260853091033d) + "'", double1 == (-0.991260853091033d));
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.9626058663135666d), 1.048576E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.048576E-4d + "'", double2 == 1.048576E-4d);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        double double1 = org.apache.commons.math3.util.FastMath.floor(22.408359761558884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.0d + "'", double1 == 22.0d);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        double double1 = org.apache.commons.math3.util.FastMath.atan(15.104412573075516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5046869858626275d + "'", double1 == 1.5046869858626275d);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        short short2 = org.apache.commons.math3.util.MathUtils.copySign((short) (byte) 30, (short) -35);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -30 + "'", short2 == (short) -30);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.3010299956639812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5486620049392715d + "'", double1 == 0.5486620049392715d);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.4333571589785714d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.408123112566557d) + "'", double1 == (-0.408123112566557d));
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.020997512335618466d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.020997512335618466d + "'", double2 == 0.020997512335618466d);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(12.566370614359174d, (double) 3069L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.566370614359174d + "'", double2 == 12.566370614359174d);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.162277660168382E-16d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.41592653589793116d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-23.830835094447984d) + "'", double1 == (-23.830835094447984d));
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-929312903), (int) (short) 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1054938553 + "'", int2 == 1054938553);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.5708614938627248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8107908758857842d + "'", double1 == 3.8107908758857842d);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.THREE_QUARTERS;
        double double1 = bigFraction0.doubleValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.75d + "'", double1 == 0.75d);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (-1504));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 30);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4771212547196624d + "'", double1 == 1.4771212547196624d);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) 'a', 31);
        java.lang.String str3 = fraction2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "97 / 31" + "'", str3, "97 / 31");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5902773407317584E-15d + "'", double1 == 1.5902773407317584E-15d);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.776356839400251E-15d + "'", double1 == 1.776356839400251E-15d);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 2.68435456E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.68435456E8d + "'", double1 == 2.68435456E8d);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.3010299956639812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.247748258387595d + "'", double1 == 17.247748258387595d);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException2 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        int int1 = org.apache.commons.math3.util.MathUtils.hash((double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2146435072 + "'", int1 == 2146435072);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION));
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(35, 28);
        float float3 = fraction2.floatValue();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.25f + "'", float3 == 1.25f);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.MAX_COUNT_EXCEEDED;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.MAX_COUNT_EXCEEDED + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.MAX_COUNT_EXCEEDED));
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(52360, 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 408.6405381558429d + "'", double2 == 408.6405381558429d);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(140.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.192494101851104d + "'", double1 == 5.192494101851104d);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.Number number0 = null;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException1 = new org.apache.commons.math3.exception.NotPositiveException(number0);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(52360, 1072693248);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 341642467);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 28);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4886921905584123d + "'", double1 == 0.4886921905584123d);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ITERATOR_EXHAUSTED;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ITERATOR_EXHAUSTED + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ITERATOR_EXHAUSTED));
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INDEX_OUT_OF_RANGE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INDEX_OUT_OF_RANGE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INDEX_OUT_OF_RANGE));
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ARITHMETIC_EXCEPTION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARITHMETIC_EXCEPTION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARITHMETIC_EXCEPTION));
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7853981633974483d) + "'", double1 == (-0.7853981633974483d));
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_ELEMENT;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_ELEMENT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_ELEMENT));
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        int int2 = bigFraction1.getNumeratorAsInt();
        java.math.BigDecimal bigDecimal3 = bigFraction1.bigDecimalValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bigDecimal3);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(100.0f, (int) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5845633E31f + "'", float2 == 1.5845633E31f);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_PARSE_AS_TYPE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_PARSE_AS_TYPE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_PARSE_AS_TYPE));
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SUMS_TO_ZERO;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SUMS_TO_ZERO + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SUMS_TO_ZERO));
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.9982229502979703d, (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NORMALIZE_NAN;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NORMALIZE_NAN + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NORMALIZE_NAN));
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        double double1 = org.apache.commons.math3.util.ArithmeticUtils.factorialLog(1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 11);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.093102195050827d + "'", double1 == 3.093102195050827d);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NAN_VALUE_CONVERSION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NAN_VALUE_CONVERSION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NAN_VALUE_CONVERSION));
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 1.5845633E31f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5845632502852868E31d + "'", double1 == 1.5845632502852868E31d);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = bigFraction0.reciprocal();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH));
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 'a', (double) (byte) 1, (int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction((int) (short) -35, (-4));
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (-1505755133));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5057551329999998E9d) + "'", double1 == (-1.5057551329999998E9d));
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-2762L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.4414062E-4f + "'", float1 == 2.4414062E-4f);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException3 = new org.apache.commons.math3.fraction.FractionConversionException(0.0d, 0L, (long) (byte) 0);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble((int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.328951362599048E-8d, (double) 2.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.664475681299524E-8d + "'", double2 == 1.664475681299524E-8d);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-1.6099162622898513E32d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6099162622898513E32d + "'", double1 == 1.6099162622898513E32d);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1007.376777049702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        double double1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA));
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient(28, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.USER_EXCEPTION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.USER_EXCEPTION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.USER_EXCEPTION));
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient(97, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }
}
