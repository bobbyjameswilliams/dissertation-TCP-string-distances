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
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction((int) (byte) 3, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math3.exception.ZeroException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.negate();
        java.lang.Class<?> wildcardClass3 = bigFraction2.getClass();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1003() throws Throwable {
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
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(340593891, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math3.exception.ZeroException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(6, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 6/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long2 = bigFraction1.longValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.reciprocal();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.pow(30);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 30, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 30/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1008() throws Throwable {
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
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((-1074790448L), (long) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math3.exception.ZeroException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math3.exception.ZeroException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) 1074790400, 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math3.exception.ZeroException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) (byte) 10, 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math3.exception.ZeroException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(1078591488, 1960992769);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: overflow in addition: 1,078,591,488 + 1,960,992,769");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math3.exception.ZeroException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 1.07859136E9f);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.negate();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(961);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction1.reciprocal();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NORM;
        java.lang.String str1 = localizedFormats0.getSourceString();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NORM + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NORM));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Norm ({0})" + "'", str1, "Norm ({0})");
    }

    @Test
    public void test1017() throws Throwable {
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
    public void test1018() throws Throwable {
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
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((-542210688), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math3.exception.ZeroException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(1018167296, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math3.exception.ZeroException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1021() throws Throwable {
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
    public void test1022() throws Throwable {
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
    public void test1023() throws Throwable {
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
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(28L, 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math3.exception.ZeroException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1025() throws Throwable {
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
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(0, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math3.exception.ZeroException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1027() throws Throwable {
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
    public void test1028() throws Throwable {
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
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.WHOLE_FORMAT;
        java.lang.Class<?> wildcardClass1 = localizedFormats0.getClass();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.WHOLE_FORMAT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.WHOLE_FORMAT));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((int) (short) -2662, 1077673984);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math3.util.ArithmeticUtils.stirlingS2(32, 40);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: 40 is larger than the maximum (32)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1032() throws Throwable {
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
    public void test1033() throws Throwable {
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
    public void test1034() throws Throwable {
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
    public void test1035() throws Throwable {
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
    public void test1036() throws Throwable {
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
    public void test1037() throws Throwable {
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
    public void test1038() throws Throwable {
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
    public void test1039() throws Throwable {
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
    public void test1040() throws Throwable {
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
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(8, (-1324025208));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1042() throws Throwable {
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
    public void test1043() throws Throwable {
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
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math3.util.ArithmeticUtils.factorial((-47));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: must have n >= 0 for n!, got n = -47");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math3.util.ArithmeticUtils.factorial((-30));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: must have n >= 0 for n!, got n = -30");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1046() throws Throwable {
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
    public void test1047() throws Throwable {
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
    public void test1048() throws Throwable {
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
    public void test1049() throws Throwable {
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
    public void test1050() throws Throwable {
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
    public void test1051() throws Throwable {
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
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(1072693248L);
        java.lang.Number number2 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException4 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigFraction1, number2, false);
        java.math.BigInteger bigInteger5 = bigFraction1.getDenominator();
        org.junit.Assert.assertNotNull(bigInteger5);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_COMPUTE_COVARIANCE_SINGULAR_PROBLEM;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_COMPUTE_COVARIANCE_SINGULAR_PROBLEM + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_COMPUTE_COVARIANCE_SINGULAR_PROBLEM));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.DISCRETE_CUMULATIVE_PROBABILITY_RETURNED_NAN;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DISCRETE_CUMULATIVE_PROBABILITY_RETURNED_NAN + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DISCRETE_CUMULATIVE_PROBABILITY_RETURNED_NAN));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(localizable0, (java.lang.Number) 1.0f, (java.lang.Number) 10, false);
        boolean boolean5 = numberIsTooSmallException4.getBoundIsAllowed();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1056() throws Throwable {
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
    public void test1057() throws Throwable {
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
    public void test1058() throws Throwable {
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
    public void test1059() throws Throwable {
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
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_INTERVAL_INITIAL_VALUE_PARAMETERS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_INTERVAL_INITIAL_VALUE_PARAMETERS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_INTERVAL_INITIAL_VALUE_PARAMETERS));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.POLYNOMIAL_INTERPOLANTS_MISMATCH_SEGMENTS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POLYNOMIAL_INTERPOLANTS_MISMATCH_SEGMENTS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POLYNOMIAL_INTERPOLANTS_MISMATCH_SEGMENTS));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_BRACKET_OPTIMUM_IN_LINE_SEARCH;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_BRACKET_OPTIMUM_IN_LINE_SEARCH + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_BRACKET_OPTIMUM_IN_LINE_SEARCH));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_DECREASING_NUMBER_OF_POINTS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_DECREASING_NUMBER_OF_POINTS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_DECREASING_NUMBER_OF_POINTS));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.SAMPLE_SIZE_LARGER_THAN_POPULATION_SIZE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.SAMPLE_SIZE_LARGER_THAN_POPULATION_SIZE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.SAMPLE_SIZE_LARGER_THAN_POPULATION_SIZE));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_MANY_ELEMENTS_TO_DISCARD_FROM_ARRAY;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_MANY_ELEMENTS_TO_DISCARD_FROM_ARRAY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_MANY_ELEMENTS_TO_DISCARD_FROM_ARRAY));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_PARAMETERS_RELATIVE_TOLERANCE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_PARAMETERS_RELATIVE_TOLERANCE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_PARAMETERS_RELATIVE_TOLERANCE));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_OBSERVED_POINTS_IN_SAMPLE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_OBSERVED_POINTS_IN_SAMPLE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_OBSERVED_POINTS_IN_SAMPLE));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_MULTIPLICATION_COMPATIBLE_MATRICES;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_MULTIPLICATION_COMPATIBLE_MATRICES + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_MULTIPLICATION_COMPATIBLE_MATRICES));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
    }

    @Test
    public void test1070() throws Throwable {
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
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.divide(28L);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction0.multiply(1072693248L);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 'a', (double) (byte) 1, (int) (byte) 0);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.divide((-2));
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OBSERVED_COUNTS_BOTTH_ZERO_FOR_ENTRY;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OBSERVED_COUNTS_BOTTH_ZERO_FOR_ENTRY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OBSERVED_COUNTS_BOTTH_ZERO_FOR_ENTRY));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1 + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction(71.84044670030279d, (double) 1077673984, 5);
        java.math.BigDecimal bigDecimal6 = bigFraction3.bigDecimalValue((int) (short) 1, (int) (short) 1);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction3.multiply((int) '#');
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigFraction8);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_KNOT_VALUES;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_KNOT_VALUES + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_KNOT_VALUES));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.MINUS_ONE;
        long long1 = bigFraction0.getNumeratorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.multiply(341642431L);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNotNull(bigFraction3);
    }

    @Test
    public void test1079() throws Throwable {
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
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction(71.84044670030279d, (double) 1077673984, 5);
        java.math.BigDecimal bigDecimal6 = bigFraction3.bigDecimalValue((int) (short) 1, (int) (short) 1);
        short short7 = bigFraction3.shortValue();
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 71 + "'", short7 == (short) 71);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((-31), (int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.subtract(990);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_COLUMN_INDEX_ARRAY;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_COLUMN_INDEX_ARRAY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_COLUMN_INDEX_ARRAY));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_COMPLEX;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_COMPLEX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_COMPLEX));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR_OVERFLOW_AFTER_MULTIPLY;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR_OVERFLOW_AFTER_MULTIPLY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR_OVERFLOW_AFTER_MULTIPLY));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DATA_FOR_T_STATISTIC;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DATA_FOR_T_STATISTIC + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DATA_FOR_T_STATISTIC));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.BOBYQA_BOUND_DIFFERENCE_CONDITION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BOBYQA_BOUND_DIFFERENCE_CONDITION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BOBYQA_BOUND_DIFFERENCE_CONDITION));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.DIFFERENT_ORIG_AND_PERMUTED_DATA;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIFFERENT_ORIG_AND_PERMUTED_DATA + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIFFERENT_ORIG_AND_PERMUTED_DATA));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(1.9233097485725157d, (int) (short) 100);
        java.lang.String str3 = bigFraction2.toString();
        java.lang.String str4 = bigFraction2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "25 / 13" + "'", str3, "25 / 13");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "25 / 13" + "'", str4, "25 / 13");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_SOLVE_SINGULAR_PROBLEM;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_SOLVE_SINGULAR_PROBLEM + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_SOLVE_SINGULAR_PROBLEM));
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ADDITION_COMPATIBLE_MATRICES;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ADDITION_COMPATIBLE_MATRICES + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ADDITION_COMPATIBLE_MATRICES));
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(0, 1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.negate();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test1093() throws Throwable {
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
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.HOLE_BETWEEN_MODELS_TIME_RANGES;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.HOLE_BETWEEN_MODELS_TIME_RANGES + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.HOLE_BETWEEN_MODELS_TIME_RANGES));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_SMALL_BOUND_EXCLUDED;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_SMALL_BOUND_EXCLUDED + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_SMALL_BOUND_EXCLUDED));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_NUMBER_OF_SAMPLES;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_NUMBER_OF_SAMPLES + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_NUMBER_OF_SAMPLES));
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_POLYNOMIAL_DEGREE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_POLYNOMIAL_DEGREE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_POLYNOMIAL_DEGREE));
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_DEFINITE_OPERATOR;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_DEFINITE_OPERATOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_DEFINITE_OPERATOR));
    }

    @Test
    public void test1099() throws Throwable {
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
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BRACKETING_PARAMETERS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BRACKETING_PARAMETERS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BRACKETING_PARAMETERS));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_BRIGHTNESS_EXPONENT;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_BRIGHTNESS_EXPONENT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_BRIGHTNESS_EXPONENT));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.FACTORIAL_NEGATIVE_PARAMETER;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.FACTORIAL_NEGATIVE_PARAMETER + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.FACTORIAL_NEGATIVE_PARAMETER));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_2D_INDEX;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_2D_INDEX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_2D_INDEX));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) 'a', 31);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField3 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide(1811784996);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 27405L);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fractionField2.getZero();
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test1106() throws Throwable {
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
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNPARSEABLE_COMPLEX_NUMBER;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNPARSEABLE_COMPLEX_NUMBER + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNPARSEABLE_COMPLEX_NUMBER));
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OUTLINE_BOUNDARY_LOOP_OPEN;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUTLINE_BOUNDARY_LOOP_OPEN + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUTLINE_BOUNDARY_LOOP_OPEN));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_LARGE_TOURNAMENT_ARITY;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_LARGE_TOURNAMENT_ARITY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_LARGE_TOURNAMENT_ARITY));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_FRACTION_TO_DIVIDE_BY;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_FRACTION_TO_DIVIDE_BY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_FRACTION_TO_DIVIDE_BY));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_REGRESSION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_REGRESSION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_REGRESSION));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_NUMBER_OF_TRIALS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_NUMBER_OF_TRIALS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_NUMBER_OF_TRIALS));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(0.0d, (double) 100.0f, (-1));
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.subtract((-929312903));
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.multiply((-238262335));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OBSERVED_COUNTS_ALL_ZERO;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OBSERVED_COUNTS_ALL_ZERO + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OBSERVED_COUNTS_ALL_ZERO));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_UPPER_BOUND;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_UPPER_BOUND + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_UPPER_BOUND));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 'a', (double) (byte) 1, (int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.reciprocal();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ARGUMENT_OUTSIDE_DOMAIN;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARGUMENT_OUTSIDE_DOMAIN + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARGUMENT_OUTSIDE_DOMAIN));
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_COMPLEX_MODULE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_COMPLEX_MODULE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_COMPLEX_MODULE));
    }

    @Test
    public void test1119() throws Throwable {
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
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.add((long) (byte) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.divide((-1072693248));
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.SIMPLEX_NEED_ONE_POINT;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.SIMPLEX_NEED_ONE_POINT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.SIMPLEX_NEED_ONE_POINT));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.negate();
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DEGREES_OF_FREEDOM;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DEGREES_OF_FREEDOM + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DEGREES_OF_FREEDOM));
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ARITHMETIC_EXCEPTION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARITHMETIC_EXCEPTION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARITHMETIC_EXCEPTION));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_PARSE_AS_TYPE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_PARSE_AS_TYPE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_PARSE_AS_TYPE));
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SYMMETRIC_MATRIX;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SYMMETRIC_MATRIX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SYMMETRIC_MATRIX));
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_32_BITS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_32_BITS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_32_BITS));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NAN_VALUE_CONVERSION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NAN_VALUE_CONVERSION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NAN_VALUE_CONVERSION));
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math3.util.MathUtils.checkFinite(doubleArray0);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
    }

    @Test
    public void test1132() throws Throwable {
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
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 2);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.multiply(11);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction1.multiply((int) (short) -35);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ITERATOR_EXHAUSTED;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ITERATOR_EXHAUSTED + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ITERATOR_EXHAUSTED));
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SUMS_TO_ZERO;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SUMS_TO_ZERO + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SUMS_TO_ZERO));
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.MAX_COUNT_EXCEEDED;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.MAX_COUNT_EXCEEDED + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.MAX_COUNT_EXCEEDED));
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INDEX_OUT_OF_RANGE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INDEX_OUT_OF_RANGE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INDEX_OUT_OF_RANGE));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(1.9233097485725157d, (int) (short) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction2.abs();
        java.math.BigInteger bigInteger4 = bigFraction2.getDenominator();
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigInteger4);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 4);
        org.apache.commons.math3.fraction.FractionField fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fractionField2.getOne();
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(0L);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField2 = bigFraction1.getField();
        long long3 = bigFraction1.getNumeratorAsLong();
        org.junit.Assert.assertNotNull(bigFractionField2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.SINGULAR_OPERATOR;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.SINGULAR_OPERATOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.SINGULAR_OPERATOR));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) ' ', (double) 341642467, (int) (short) 10);
        int int4 = bigFraction3.intValue();
        int int5 = bigFraction3.intValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 2);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.multiply(11);
        byte byte4 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 2 + "'", byte4 == (byte) 2);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 1.07859136E9f);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.negate();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.negate();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.USER_EXCEPTION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.USER_EXCEPTION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.USER_EXCEPTION));
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION));
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_BOUND;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_BOUND + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_BOUND));
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_ELEMENT;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_ELEMENT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_ELEMENT));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NORMALIZE_NAN;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NORMALIZE_NAN + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NORMALIZE_NAN));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        float float2 = bigFraction1.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(bigFraction3);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException2 = new org.apache.commons.math3.fraction.FractionConversionException(7.930067261567154E14d, (int) '#');
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext3 = fractionConversionException2.getContext();
        org.junit.Assert.assertNotNull(exceptionContext3);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        int int2 = bigFraction1.getNumeratorAsInt();
        short short3 = bigFraction1.shortValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.add((long) (byte) 2);
        int int4 = bigFraction3.intValue();
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12 + "'", int4 == 12);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.add((long) (byte) 2);
        java.math.BigInteger bigInteger4 = bigFraction1.getDenominator();
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigInteger4);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ELITISM_RATE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ELITISM_RATE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ELITISM_RATE));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.abs();
        float float3 = fraction1.floatValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.REAL_FORMAT;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.REAL_FORMAT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.REAL_FORMAT));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException2 = new org.apache.commons.math3.fraction.FractionConversionException(7.896326140304252E13d, 0);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext3 = fractionConversionException2.getContext();
        org.junit.Assert.assertNotNull(exceptionContext3);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ITERATIONS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ITERATIONS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ITERATIONS));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.POLYNOMIAL;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POLYNOMIAL + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POLYNOMIAL));
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CONSTRAINT;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CONSTRAINT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CONSTRAINT));
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.BANDWIDTH;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BANDWIDTH + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BANDWIDTH));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(465524053, (int) (byte) 10);
        double double4 = bigFraction2.pow((-30.0d));
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.156642126628464E-231d + "'", double4 == 9.156642126628464E-231d);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException2 = new org.apache.commons.math3.fraction.FractionConversionException(3628800.0d, (-1));
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext3 = fractionConversionException2.getContext();
        org.junit.Assert.assertNotNull(exceptionContext3);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        int int2 = bigFraction1.getNumeratorAsInt();
        java.math.BigDecimal bigDecimal3 = bigFraction1.bigDecimalValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bigDecimal3);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(localizable0, (java.lang.Number) 0.9705558343694834d, (java.lang.Number) 1.2676506002282296E-20d, true);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction(20.0d, (double) 20L, 14);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException6 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) 20.0d, (java.lang.Number) 3628800.0d, false);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction((int) (short) 2, (int) (byte) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction2.pow((long) 32);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(3, 1077673984);
        float float3 = bigFraction2.floatValue();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.7837732E-9f + "'", float3 == 2.7837732E-9f);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        java.lang.Object[] objArray1 = null;
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException2 = new org.apache.commons.math3.exception.MathIllegalArgumentException(localizable0, objArray1);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.lang.Number number0 = null;
        java.lang.Number number1 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException3 = new org.apache.commons.math3.exception.NumberIsTooSmallException(number0, number1, false);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(97, 35);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction2.pow((-127));
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 2);
        java.lang.String str3 = fraction2.toString();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((-1), (int) (short) -1);
        long long3 = fraction2.longValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.THREE_QUARTERS;
        double double1 = bigFraction0.doubleValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.75d + "'", double1 == 0.75d);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction(0.0d, 7.105427357600977E-15d, 1807551715);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.multiply((-341642466L));
        org.junit.Assert.assertNotNull(bigFraction5);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = bigFraction0.reciprocal();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        float float1 = fraction0.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.33333334f + "'", float1 == 0.33333334f);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        double double3 = org.apache.commons.math3.util.MathUtils.reduce((double) 862L, 0.7519972863480745d, (-20.101268236238415d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.008451349946998477d + "'", double3 == 0.008451349946998477d);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 16);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.junit.Assert.assertNotNull(fractionField2);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        double double3 = org.apache.commons.math3.util.MathUtils.reduce((double) 1077673984, (double) 31.0f, (double) 1.1641532E-10f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 27.999999999883585d + "'", double3 == 27.999999999883585d);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        double double3 = org.apache.commons.math3.util.MathUtils.reduce((-0.39794000867203755d), (double) 1079525376, (double) 126L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.07952524960206E9d + "'", double3 == 1.07952524960206E9d);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        short short1 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 2 + "'", short1 == (short) 2);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(1077673984, 1018167296);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble((int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.731030945644E13d + "'", double2 == 1.731030945644E13d);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.1805916207174113E-14d, (double) 10000000000L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1805916207174113E-14d + "'", double2 == 1.1805916207174113E-14d);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        double double3 = org.apache.commons.math3.util.MathUtils.reduce(1.5395564933646284d, (-0.9899924966004454d), 0.5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.049563996764182994d + "'", double3 == 0.049563996764182994d);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 'a', (-8667487270275645440L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8667487270275645440L) + "'", long2 == (-8667487270275645440L));
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.FOUR_FIFTHS;
        long long1 = bigFraction0.longValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        double double2 = org.apache.commons.math3.util.MathUtils.normalizeAngle(0.42279321873816184d, 0.4000000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.42279321873816184d + "'", double2 == 0.42279321873816184d);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((long) 2, 485210968859607040L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 485210968859607042L + "'", long2 == 485210968859607042L);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_THIRD;
        long long1 = bigFraction0.longValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 'a', (double) (byte) 1, (int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.7755575615628914E-17d, 1.8563690240890005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.775557561562892E-17d + "'", double2 == 2.775557561562892E-17d);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.384185791015625E-7d, 70.00714249274856d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.384185791015625E-7d + "'", double2 == 2.384185791015625E-7d);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-31.75d), (double) 2.7837732E-9f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.3567476031539627E-9d) + "'", double2 == (-1.3567476031539627E-9d));
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        double double2 = org.apache.commons.math3.util.MathUtils.normalizeAngle((double) (-1074790448L), 70.00714249274856d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 71.70903444290161d + "'", double2 == 71.70903444290161d);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        double double3 = org.apache.commons.math3.util.MathUtils.reduce((double) 9800.0f, 128.00000000000003d, (double) 4L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 67.99999999999818d + "'", double3 == 67.99999999999818d);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((-1074790400L), (long) (short) -2);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction2.add(60L);
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.THREE_QUARTERS;
        int int1 = bigFraction0.intValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.9315964599440725d), 3.4339872044851463d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2649110993460358d) + "'", double2 == (-0.2649110993460358d));
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.5925828509060219d, 4.784907962876926E45d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5925828509060219d + "'", double2 == 0.5925828509060219d);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog((int) ' ', (int) (byte) 30);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.206575926724928d + "'", double2 == 6.206575926724928d);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (short) 2, 1077673984);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        double double2 = org.apache.commons.math3.util.MathUtils.normalizeAngle(2.220446049250313E-16d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.220446049250313E-16d + "'", double2 == 2.220446049250313E-16d);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((double) 10.0f);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField2 = bigFraction1.getField();
        org.junit.Assert.assertNotNull(bigFractionField2);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(341642467, 28);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.85673842301471E209d + "'", double2 == 2.85673842301471E209d);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(7.896326140304252E13d, 100.00000762939453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.89632614030425E13d + "'", double2 == 7.89632614030425E13d);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.5384786408469177d, 1.0000000000000016E-31d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5384786408469175d + "'", double2 == 0.5384786408469175d);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-341642466L), (float) 1079525366L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.41642464E8f) + "'", float2 == (-3.41642464E8f));
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 20L, 2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7232658369464131d) + "'", double2 == (-0.7232658369464131d));
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(31.026580882699598d, 635.856379863918d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.026580882699598d + "'", double2 == 31.026580882699598d);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.6929693744344998d, 1.0000000000000016E-31d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6929693744344998d + "'", double2 == 1.6929693744344998d);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.2246467991473532E-16d, 1.5707963267948948d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948948d + "'", double2 == 1.5707963267948948d);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(3.4164246700000036E8d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.416424670000003E8d + "'", double2 == 3.416424670000003E8d);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.718281828459045d, (-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9233097485725157d + "'", double2 == 1.9233097485725157d);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 341642467, 1.5107651208185948d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.020999055593360003d + "'", double2 == 0.020999055593360003d);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.multiply(268435456);
        org.junit.Assert.assertNotNull(bigFraction3);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(45, (int) (short) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.897704943128636d + "'", double2 == 6.897704943128636d);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 1077673984, (double) 1.9073486E-6f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948948d + "'", double2 == 1.5707963267948948d);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(12.566370614359174d, (double) 3069L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.566370614359174d + "'", double2 == 12.566370614359174d);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        double double2 = org.apache.commons.math3.util.FastMath.pow(19.049875621120893d, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.754711873930048E127d + "'", double2 == 9.754711873930048E127d);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-1074790471));
        long long2 = fraction1.longValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1074790471L) + "'", long2 == (-1074790471L));
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((long) 1083558912, (long) 1104155264);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2187714176L + "'", long2 == 2187714176L);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.328951362599048E-8d, (double) 2.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.664475681299524E-8d + "'", double2 == 1.664475681299524E-8d);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 32L, 4.6566128730773926E-10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.999999999999996d + "'", double2 == 31.999999999999996d);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((long) 476008953, (long) (short) -35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 476008988L + "'", long2 == 476008988L);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(961, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 53.5283502280899d + "'", double2 == 53.5283502280899d);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (byte) 1, (long) (-1074790400));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1074790400L) + "'", long2 == (-1074790400L));
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((int) (short) -71, 1074790400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1074790471) + "'", int2 == (-1074790471));
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.07859136E9f, 1.5707963258685635d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.07859123E9f + "'", float2 == 1.07859123E9f);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(6.456544166829538d, (double) (-100.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0771167060885385d + "'", double2 == 3.0771167060885385d);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 268435456, 144);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        double double1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.332621544395286E157d + "'", double1 == 9.332621544395286E157d);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((double) 1.07859136E9f);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction1.negate();
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 9700L, (-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5708614938627248d + "'", double2 == 1.5708614938627248d);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 519.99994f, 1.2577193354595834E30d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 519.9999389648438d + "'", double2 == 519.9999389648438d);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.2291268324586927d, (double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2291268324586927d + "'", double2 == 0.2291268324586927d);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((long) (short) 10, (long) 1078591488);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5392957440L + "'", long2 == 5392957440L);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 32.000004f, 1.9233097485725157d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5107651208185948d + "'", double2 == 1.5107651208185948d);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        double double2 = org.apache.commons.math3.util.FastMath.log(23.7189981105004d, 1.2840254166877414d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07895710087951932d + "'", double2 == 0.07895710087951932d);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(1079525376, 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 635.856379863918d + "'", double2 == 635.856379863918d);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-1.0d), 0.5384786408469175d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07695728169383509d + "'", double2 == 0.07695728169383509d);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.627482429927895d), (double) 16.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.627482429927895d + "'", double2 == 0.627482429927895d);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) 'a', 31);
        java.lang.String str3 = fraction2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "97 / 31" + "'", str3, "97 / 31");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 100.0f, 23.7189981105004d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7415503163138826E47d + "'", double2 == 2.7415503163138826E47d);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.2711106893180253d), (double) (-618402555));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.18402555E8d) + "'", double2 == (-6.18402555E8d));
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 1.5845633E31f, (double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 360339393, (double) (-4));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.931342865682863E-35d + "'", double2 == 5.931342865682863E-35d);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1.9999999f, (double) 70L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1805866949154481E21d + "'", double2 == 1.1805866949154481E21d);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(97.0d, 35.0056243223838d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.016872967151407d) + "'", double2 == (-8.016872967151407d));
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((int) (short) -2662, (int) (short) 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-42592) + "'", int2 == (-42592));
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(52360, 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 408.6405381558429d + "'", double2 == 408.6405381558429d);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.027415567780803774d) + "'", double1 == (-0.027415567780803774d));
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(7.930067261567154E14d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.930067261567152E14d + "'", double2 == 7.930067261567152E14d);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5902773407317584E-15d + "'", double1 == 1.5902773407317584E-15d);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        boolean boolean1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo((long) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        short short2 = org.apache.commons.math3.util.MathUtils.copySign((short) (byte) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9801980198019802d, (int) (byte) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9607881580237231d + "'", double2 == 0.9607881580237231d);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 9409, (double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.57090260800827d + "'", double2 == 1.57090260800827d);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (short) 0, 1.9073486E-6f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9073486E-6f + "'", float2 == 1.9073486E-6f);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-1074790400), (-1074790400));
        long long3 = fraction2.longValue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) 1, (long) 1079525376);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1079525376L + "'", long2 == 1079525376L);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        double double2 = org.apache.commons.math3.util.FastMath.min(4.2177681591407135d, 2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.99822295029797d + "'", double2 == 2.99822295029797d);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((long) 1, (long) 1073741824);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1073741824L + "'", long2 == 1073741824L);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 1395, 1.5107651208185948d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5697133414686018d + "'", double2 == 1.5697133414686018d);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.41592653589793116d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-23.830835094447984d) + "'", double1 == (-23.830835094447984d));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-3L), (float) 5392957440L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.3929574E9f + "'", float2 == 5.3929574E9f);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 8, (-0.5210953054937474d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3383795023223786d + "'", double2 == 0.3383795023223786d);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        short short2 = org.apache.commons.math3.util.MathUtils.copySign((short) (byte) 0, (short) (byte) 30);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) 1L, 9.412486374792455E7d, 5);
        int int4 = bigFraction3.intValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.627482429927895d, (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.627482429927895d + "'", double2 == 0.627482429927895d);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((long) 1104155264, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1104155264L + "'", long2 == 1104155264L);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        double double2 = org.apache.commons.math3.util.FastMath.pow(6.1798740081135376E10d, 14);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1849900242739125E151d + "'", double2 == 1.1849900242739125E151d);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 126L, (double) 135070657);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 126.00001f + "'", float2 == 126.00001f);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.pow(70L, 38L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8667487270275645440L) + "'", long2 == (-8667487270275645440L));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (-1.0f));
        java.lang.String str2 = fraction1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (short) 100, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-100.0f) + "'", float2 == (-100.0f));
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.pow((long) 10, 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3136633892082024448L + "'", long2 == 3136633892082024448L);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0, 10);
        java.lang.String str3 = fraction2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(6L, (long) 1077673984);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6466043904L + "'", long2 == 6466043904L);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        short short2 = org.apache.commons.math3.util.MathUtils.copySign((short) (byte) 30, (short) -35);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -30 + "'", short2 == (short) -30);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.Number number0 = null;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException1 = new org.apache.commons.math3.exception.NotPositiveException(number0);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0);
        byte byte2 = fraction1.byteValue();
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        boolean boolean1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo((long) (-30));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.9982229502979703d, (double) 6L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6318098536861656d + "'", double2 == 1.6318098536861656d);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.5395564933646284d, (double) 1079525376);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.079525376E9d + "'", double2 == 1.079525376E9d);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (-1505755133));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5057551329999998E9d) + "'", double1 == (-1.5057551329999998E9d));
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(2.7415503163138826E47d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.784907962876926E45d + "'", double1 == 4.784907962876926E45d);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient((int) (byte) 30, 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 27405L + "'", long2 == 27405L);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow((int) (byte) -35, (long) 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-618402555) + "'", int2 == (-618402555));
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        double double1 = org.apache.commons.math3.util.ArithmeticUtils.factorialLog((int) (byte) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599453d + "'", double1 == 0.6931471805599453d);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 70);
        short short2 = bigFraction1.shortValue();
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 70 + "'", short2 == (short) 70);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        short short2 = org.apache.commons.math3.util.MathUtils.copySign((short) 35, (short) (byte) 35);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 35 + "'", short2 == (short) 35);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow(1807551715, (int) (byte) 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-929312903) + "'", int2 == (-929312903));
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(0L, (long) 341642467);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 341642467L + "'", long2 == 341642467L);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(3.1221078653007948d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1221078653007948d + "'", double2 == 3.1221078653007948d);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        float float2 = org.apache.commons.math3.util.FastMath.max(6.1035156E-5f, (float) (-18));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.1035156E-5f + "'", float2 == 6.1035156E-5f);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 4.75956608E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow(135070657, 181178499600L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1317061631) + "'", int2 == (-1317061631));
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.776356839400251E-15d + "'", double1 == 1.776356839400251E-15d);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-929312903), (int) (short) 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1054938553 + "'", int2 == 1054938553);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 97.0f, (double) 0.25f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5682190129139257d + "'", double2 == 1.5682190129139257d);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble((int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long2 = bigFraction1.getNumeratorAsLong();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.5380218700469711E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.0000000000000016E-31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000016E-31d + "'", double1 == 1.0000000000000016E-31d);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-542210688));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble((int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.020997512335618466d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.020997512335618466d + "'", double2 == 0.020997512335618466d);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 1505937885570L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1505937885570L + "'", long1 == 1505937885570L);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        boolean boolean1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo((long) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        byte byte2 = org.apache.commons.math3.util.MathUtils.copySign((byte) 100, (byte) 30);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 1072693248L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1424L, (double) (-100.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.45657346E-316d + "'", double2 == 4.45657346E-316d);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        float float2 = org.apache.commons.math3.util.FastMath.min(10.0f, (float) (-929312903));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.293129E8f) + "'", float2 == (-9.293129E8f));
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.02100368700041951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.665834932156521E-4d + "'", double1 == 3.665834932156521E-4d);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.5902773407317596E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5902773407317596E-15d + "'", double1 == 1.5902773407317596E-15d);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-1072693248));
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.reciprocal();
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(3.552713678800501E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5527136788004946E-15d + "'", double1 == 3.5527136788004946E-15d);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        byte byte2 = org.apache.commons.math3.util.MathUtils.copySign((byte) -35, (byte) -35);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -35 + "'", byte2 == (byte) -35);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 88529280, (long) (-18));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 88529280L + "'", long2 == 88529280L);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        int int2 = org.apache.commons.math3.util.MathUtils.copySign(268435456, (-1074790400));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-268435456) + "'", int2 == (-268435456));
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-1.6099162622898513E32d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6099162622898513E32d + "'", double1 == 1.6099162622898513E32d);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2204460492503128E-16d + "'", double1 == 2.2204460492503128E-16d);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        byte byte2 = org.apache.commons.math3.util.MathUtils.copySign((byte) 1, (byte) -35);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 1, (-1072693248));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1072693248) + "'", int2 == (-1072693248));
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        int int1 = org.apache.commons.math3.util.MathUtils.hash((double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2146435072 + "'", int1 == 2146435072);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-61L), (-17));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.6539307E-4f) + "'", float2 == (-4.6539307E-4f));
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(7.888609052210118E-31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7516230804060213E-46d + "'", double1 == 1.7516230804060213E-46d);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        byte byte2 = org.apache.commons.math3.util.MathUtils.copySign((byte) -35, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 35 + "'", byte2 == (byte) 35);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((long) (-53), (-29L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-24L) + "'", long2 == (-24L));
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        short short2 = org.apache.commons.math3.util.MathUtils.copySign((short) 71, (short) -2662);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -71 + "'", short2 == (short) -71);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.pow((long) (short) 10, (long) 1018167296);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 1078591488);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.1798740081135376E10d + "'", double1 == 6.1798740081135376E10d);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(14, 542210703);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-542210689) + "'", int2 == (-542210689));
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((long) (-99), (long) 961);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 862L + "'", long2 == 862L);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(268435456L, 6365139678740040577L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((long) (-30), (long) (short) -35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 210L + "'", long2 == 210L);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        double double3 = org.apache.commons.math3.util.MathUtils.reduce(100.0d, (-0.75d), (double) (-2952716662570746864L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((long) 6, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-29L) + "'", long2 == (-29L));
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        double double1 = org.apache.commons.math3.util.FastMath.exp(4.784907962876926E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        short short2 = bigFraction1.shortValue();
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((long) 30, (long) (byte) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.4339872044851463d, 71);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1007932393182316E38d + "'", double2 == 1.1007932393182316E38d);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient(97, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 10, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-1072693248));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1072693248) + "'", int1 == (-1072693248));
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1007.376777049702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(27405L, (long) 45);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1233225L + "'", long2 == 1233225L);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.515438670919167E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(475956593, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        double double1 = org.apache.commons.math3.util.FastMath.tan(3.1221078653007956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.019487254508783226d) + "'", double1 == (-0.019487254508783226d));
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 268435456);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5380218700469711E10d + "'", double1 == 1.5380218700469711E10d);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        boolean boolean1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(110L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
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
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 70L, (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 70.00714249274856d + "'", double2 == 70.00714249274856d);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 25L, (float) 1018167296);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 25.0f + "'", float2 == 25.0f);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((-30), 70);
        long long3 = bigFraction2.getNumeratorAsLong();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3L) + "'", long3 == (-3L));
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        int int1 = org.apache.commons.math3.util.MathUtils.hash(6.338124408909002E-58d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1324025208) + "'", int1 == (-1324025208));
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        double double1 = org.apache.commons.math3.util.FastMath.sin(3.552713678800501E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        short short2 = org.apache.commons.math3.util.MathUtils.copySign((short) 2, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 2 + "'", short2 == (short) 2);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.5384786408469175d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5384786408469175d + "'", double2 == 0.5384786408469175d);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((long) 0, (long) (short) -2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((long) 'a', (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9700L + "'", long2 == 9700L);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(3.552713678800507E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.888609052210118E-31d + "'", double1 == 7.888609052210118E-31d);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        long long2 = org.apache.commons.math3.util.FastMath.max(88529281L, (long) 144);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 88529281L + "'", long2 == 88529281L);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (short) 100, 200.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1505149978319904d + "'", double2 == 1.1505149978319904d);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 35L, (float) (short) 71);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 6.1035156E-5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.103515625000001E-5d + "'", double1 == 6.103515625000001E-5d);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient(28, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.629423635154472E-6d + "'", double1 == 7.629423635154472E-6d);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        long long2 = org.apache.commons.math3.util.FastMath.max(1077673984L, (long) 29);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1077673984L + "'", long2 == 1077673984L);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(475956593, 52360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 476008953 + "'", int2 == 476008953);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 1.5845633E31f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5845632502852868E31d + "'", double1 == 1.5845632502852868E31d);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((long) 1395, (-29L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1424L + "'", long2 == 1424L);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 1.07859136E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0785913600000002E9d + "'", double1 == 1.0785913600000002E9d);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(32, 1078591488);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1078591520 + "'", int2 == 1078591520);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 2187714176L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.18771405E9f + "'", float1 == 2.18771405E9f);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        boolean boolean1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(1424L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        boolean boolean1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(9800L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 1079525376);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        boolean boolean1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(21952L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        boolean boolean1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo((-99L));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 341642467);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 21952L, 1.9999999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 21952.0f + "'", float2 == 21952.0f);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.0000000013752508d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01745329254394595d + "'", double1 == 0.01745329254394595d);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (byte) 2, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9999999f + "'", float2 == 1.9999999f);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(9.332621544395286E157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.660549437995381E78d + "'", double1 == 9.660549437995381E78d);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 32, (float) 268435456L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        byte byte2 = org.apache.commons.math3.util.MathUtils.copySign((byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-1), (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        double double1 = org.apache.commons.math3.util.FastMath.log10(7.629394531324015E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.117509926283467d) + "'", double1 == (-5.117509926283467d));
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 268435456L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.68435488E8f + "'", float1 == 2.68435488E8f);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        double double1 = org.apache.commons.math3.util.FastMath.sin(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2246467991473532E-16d + "'", double1 == 1.2246467991473532E-16d);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.429369702178807E-8d + "'", double1 == 8.429369702178807E-8d);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-1072693248));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1072693248L + "'", long1 == 1072693248L);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        byte byte2 = org.apache.commons.math3.util.MathUtils.copySign((byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(100.0f, (int) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5845633E31f + "'", float2 == 1.5845633E31f);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((int) (short) 16, 9409);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9425 + "'", int2 == 9425);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, (float) (-542210689));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(4.61512051684126d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.61512051684126d + "'", double2 == 4.61512051684126d);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.627482429927895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.46603960848311693d) + "'", double1 == (-0.46603960848311693d));
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.pow((long) 1075314688, 5392957440L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3.3289514180086344E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.328951418008635E-8d + "'", double1 == 3.328951418008635E-8d);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.4000000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39794000867203755d) + "'", double1 == (-0.39794000867203755d));
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-1074790400));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0747904E9f + "'", float1 == 1.0747904E9f);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 341642431L, (-542210688));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(10000000000L, (-1074790401L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.4333571589785714d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.408123112566557d) + "'", double1 == (-0.408123112566557d));
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.99999994f) + "'", float1 == (-0.99999994f));
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((-2L), 9700L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-19400L) + "'", long2 == (-19400L));
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((-47), (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1504) + "'", int2 == (-1504));
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (short) 0, (float) 5392957440L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.078591488E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        short short2 = org.apache.commons.math3.util.MathUtils.copySign((short) -2, (short) 70);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 2 + "'", short2 == (short) 2);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.104155264E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(10L, 1233225L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12332250L + "'", long2 == 12332250L);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 1807551715, 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.86418E38f + "'", float2 == 2.86418E38f);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.1805916207174113E-14d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-47) + "'", int1 == (-47));
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.3010299956639812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.247748258387595d + "'", double1 == 17.247748258387595d);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((long) (-99), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-99L) + "'", long2 == (-99L));
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-2L), 3.4016141E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-8.016872967151407d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1621719397004844d) + "'", double1 == (-0.1621719397004844d));
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
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.515438670919167E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4333571589785714d) + "'", double1 == (-0.4333571589785714d));
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.9626058663135666d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38189641719793466d + "'", double1 == 0.38189641719793466d);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-99) + "'", int2 == (-99));
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        int int1 = org.apache.commons.math3.util.MathUtils.hash(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1018167296 + "'", int1 == 1018167296);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(0, (int) (byte) 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(4.2177681591407135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 241.66031448342542d + "'", double1 == 241.66031448342542d);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) (short) -71);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        boolean boolean1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(0L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        long long2 = org.apache.commons.math3.util.FastMath.max(1233225L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1233225L + "'", long2 == 1233225L);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(127L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 126L + "'", long2 == 126L);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((int) (byte) 100, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((int) (short) 2, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-26) + "'", int2 == (-26));
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 9409, 1.1641532E-10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9409.0f + "'", float2 == 9409.0f);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        double double1 = org.apache.commons.math3.util.ArithmeticUtils.factorialLog((int) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 349.9541180407703d + "'", double1 == 349.9541180407703d);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 4, 88529281L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 88529281L + "'", long2 == 88529281L);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 99L, 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4016141E12f + "'", float2 == 3.4016141E12f);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((long) 30, (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(35, 28);
        float float3 = fraction2.floatValue();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.25f + "'", float3 == 1.25f);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(0.0d);
        java.lang.String str2 = fraction1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((long) 2, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((long) 10, (long) (short) -30);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        int int2 = org.apache.commons.math3.util.FastMath.min(1075314688, 268435456);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 268435456 + "'", int2 == 268435456);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) '4', (double) (short) -2662);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-52.0d) + "'", double2 == (-52.0d));
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        int int2 = org.apache.commons.math3.util.FastMath.max(1078591488, 340593891);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1078591488 + "'", int2 == 1078591488);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        long long1 = org.apache.commons.math3.util.ArithmeticUtils.factorial((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3628800L + "'", long1 == 3628800L);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-31), (long) 52360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1877073665 + "'", int2 == 1877073665);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow((int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        long long2 = org.apache.commons.math3.util.MathUtils.copySign(28L, (long) (short) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28L + "'", long2 == 28L);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) -2662, 9800L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9800L + "'", long2 == 9800L);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(0L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-1.5706907148240663d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2079015320818893d + "'", double1 == 0.2079015320818893d);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((long) (-99), (long) 31);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3069L + "'", long2 == 3069L);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (byte) 30);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0686474581523463E13d + "'", double1 == 1.0686474581523463E13d);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-2762L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.4414062E-4f + "'", float1 == 2.4414062E-4f);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        long long1 = org.apache.commons.math3.util.FastMath.abs(9700L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9700L + "'", long1 == 9700L);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.stirlingS2((int) (short) 2, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((long) 2, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((-929312903), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        int int1 = org.apache.commons.math3.util.MathUtils.hash(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1807551715 + "'", int1 == 1807551715);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7853981633974483d) + "'", double1 == (-0.7853981633974483d));
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.3633850893556905d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0667541031272256d + "'", double1 == 1.0667541031272256d);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.0168438181538688d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 10, (long) (-4));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        int int1 = org.apache.commons.math3.util.MathUtils.hash(0.4d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1505755133) + "'", int1 == (-1505755133));
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 341642467);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 341642467L + "'", long1 == 341642467L);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        long long1 = org.apache.commons.math3.util.FastMath.abs(1072693248L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1072693248L + "'", long1 == 1072693248L);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.2840254166877414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2840254166877416d + "'", double1 == 1.2840254166877416d);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.49321676688550387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4932167668855039d + "'", double1 == 0.4932167668855039d);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 35, (long) 341642467);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-26));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999948909d) + "'", double1 == (-0.9999999999948909d));
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        int int2 = org.apache.commons.math3.util.MathUtils.copySign((-268435456), 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 268435456 + "'", int2 == 268435456);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-1.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.99999994f) + "'", float1 == (-0.99999994f));
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 7.6293945E-6f, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0517578125E-5d + "'", double2 == 3.0517578125E-5d);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(12.566370614359172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.566370614359174d + "'", double1 == 12.566370614359174d);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.811784996E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1621613518432293E7d + "'", double1 == 3.1621613518432293E7d);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 1395);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207031E-4f + "'", float1 == 1.2207031E-4f);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 31.999998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896280957293019E13d + "'", double1 == 7.896280957293019E13d);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 9800L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        double double1 = org.apache.commons.math3.util.FastMath.cos(9.292475992245455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.991260853091033d) + "'", double1 == (-0.991260853091033d));
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 961);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 1079525376L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.675216045607117d) + "'", double1 == (-4.675216045607117d));
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        int int2 = org.apache.commons.math3.util.FastMath.min((-4), 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(33228.83181816658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1903871.821330967d + "'", double1 == 1903871.821330967d);
    }
}
