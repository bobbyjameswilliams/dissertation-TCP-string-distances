package org.apache.commons.math3.fraction;;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_PARSE_AS_TYPE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_PARSE_AS_TYPE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_PARSE_AS_TYPE));
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUPPORTED_IN_DIMENSION_N;
        java.lang.String str1 = localizedFormats0.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_WEIGHT;
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger4 = bigFraction3.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float8 = bigFraction7.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction3.add(bigFraction7);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats10 = org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT;
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger12 = bigFraction11.getNumerator();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException16 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats17 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats18 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats20 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray21 = new java.lang.Object[] { (-1.0f), localizedFormats20 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException22 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats18, objArray21);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException23 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException16, (org.apache.commons.math3.exception.util.Localizable) localizedFormats17, objArray21);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException24 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats13, objArray21);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException25 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction11, objArray21);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) bigFraction3, (org.apache.commons.math3.exception.util.Localizable) localizedFormats10, objArray21);
        org.apache.commons.math3.exception.ConvergenceException convergenceException27 = new org.apache.commons.math3.exception.ConvergenceException((org.apache.commons.math3.exception.util.Localizable) localizedFormats2, objArray21);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats28 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats29 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException32 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats33 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats34 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats36 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray37 = new java.lang.Object[] { (-1.0f), localizedFormats36 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException38 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats34, objArray37);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException39 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException32, (org.apache.commons.math3.exception.util.Localizable) localizedFormats33, objArray37);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException40 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats29, objArray37);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException41 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats28, objArray37);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats42 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED;
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float46 = bigFraction45.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = bigFraction44.add(bigFraction45);
        org.apache.commons.math3.fraction.BigFraction bigFraction48 = bigFraction47.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger50 = bigFraction49.getNumerator();
        int int51 = bigFraction48.compareTo(bigFraction49);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField52 = bigFraction48.getField();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats53 = org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats54 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats55 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1;
        org.apache.commons.math3.fraction.BigFraction bigFraction56 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger57 = bigFraction56.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction58 = bigFraction56.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction60 = bigFraction56.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction61 = bigFraction60.reciprocal();
        java.lang.Object[] objArray62 = new java.lang.Object[] { localizedFormats54, localizedFormats55, bigFraction61 };
        org.apache.commons.math3.exception.ZeroException zeroException63 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats53, objArray62);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException64 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats42, (java.lang.Number) bigFraction48, objArray62);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException65 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats28, objArray62);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException66 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats2, objArray62);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException67 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray62);
        java.lang.String str68 = localizedFormats0.getSourceString();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUPPORTED_IN_DIMENSION_N + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUPPORTED_IN_DIMENSION_N));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "method not supported in dimension {0}" + "'", str1, "method not supported in dimension {0}");
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_WEIGHT + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_WEIGHT));
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.25f + "'", float8 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + localizedFormats10 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT + "'", localizedFormats10.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT));
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats17 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats17.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats18 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats18.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats20 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats20.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertTrue("'" + localizedFormats28 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR + "'", localizedFormats28.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats29 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats29.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats33 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats33.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats34 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats34.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats36 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats36.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertTrue("'" + localizedFormats42 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED + "'", localizedFormats42.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED));
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.25f + "'", float46 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertNotNull(bigFraction48);
        org.junit.Assert.assertNotNull(bigFraction49);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(bigFractionField52);
        org.junit.Assert.assertTrue("'" + localizedFormats53 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM + "'", localizedFormats53.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM));
        org.junit.Assert.assertTrue("'" + localizedFormats54 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN + "'", localizedFormats54.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN));
        org.junit.Assert.assertTrue("'" + localizedFormats55 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1 + "'", localizedFormats55.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1));
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertNotNull(bigFraction58);
        org.junit.Assert.assertNotNull(bigFraction60);
        org.junit.Assert.assertNotNull(bigFraction61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "method not supported in dimension {0}" + "'", str68, "method not supported in dimension {0}");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) 0.42279321873816184d);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = fractionField1.getZero();
        java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.fraction.Fraction>> wildcardClass3 = fractionField1.getRuntimeClass();
        java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.fraction.Fraction>> wildcardClass4 = fractionField1.getRuntimeClass();
        org.apache.commons.math3.fraction.Fraction fraction5 = fractionField1.getZero();
        org.apache.commons.math3.fraction.Fraction fraction6 = fractionField1.getZero();
        java.lang.String str7 = fraction6.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((-2L), 9700L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-19400L) + "'", long2 == (-19400L));
    }

    @Test
    public void test2006() throws Throwable {
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
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow(1807551715, (int) (byte) 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-929312903) + "'", int2 == (-929312903));
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.subtract((int) ' ');
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.pow((-1));
        double double6 = bigFraction3.percentageValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long9 = bigFraction8.longValue();
        java.math.BigDecimal bigDecimal11 = bigFraction8.bigDecimalValue((int) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction8.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction3.add(bigFraction12);
        int int14 = bigFraction12.getDenominatorAsInt();
        int int15 = bigFraction12.intValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3175.0d) + "'", double6 == (-3175.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fractionField7.getZero();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.subtract(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction5.divide(fraction9);
        double double12 = fraction5.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3600.0d + "'", double12 == 3600.0d);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.divide(fraction2);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException4 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction1);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction1.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.negate();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.abs();
        int int10 = fraction7.getDenominator();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(0.6783156523793671d, 349.9541180407703d, 52360);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.divide(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.reciprocal();
        int int8 = fraction1.compareTo(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.divide(fraction10);
        int int12 = fraction11.getNumerator();
        double double13 = fraction11.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction14.negate();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction11.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction7.divide(fraction11);
        org.apache.commons.math3.fraction.FractionField fractionField18 = fraction17.getField();
        java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.fraction.Fraction>> wildcardClass19 = fractionField18.getRuntimeClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fractionField18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.pow(5392957440L);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long5 = bigFraction4.longValue();
        java.math.BigInteger bigInteger6 = bigFraction4.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long9 = bigFraction8.longValue();
        java.math.BigInteger bigInteger10 = bigFraction8.getDenominator();
        java.math.BigInteger bigInteger11 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger6, bigInteger10);
        java.math.BigInteger bigInteger13 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger10, 35);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException14 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) bigInteger13);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float19 = bigFraction18.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction17.add(bigFraction18);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction17.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long24 = bigFraction23.longValue();
        java.math.BigInteger bigInteger25 = bigFraction23.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long28 = bigFraction27.longValue();
        java.math.BigInteger bigInteger29 = bigFraction27.getDenominator();
        java.math.BigInteger bigInteger30 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger25, bigInteger29);
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction17.add(bigInteger29);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction15.subtract(bigInteger29);
        java.math.BigInteger bigInteger33 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger13, bigInteger29);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction0.divide(bigInteger29);
        double double35 = bigFraction34.percentageValue();
        long long36 = bigFraction34.longValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction34.multiply((long) (short) 35);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.25f + "'", float19 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(bigFraction38);
    }

    @Test
    public void test2014() throws Throwable {
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
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-2.1070314728E10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23566964736463444d + "'", double1 == 0.23566964736463444d);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long2 = bigFraction1.longValue();
        java.math.BigInteger bigInteger3 = bigFraction1.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long6 = bigFraction5.longValue();
        java.math.BigInteger bigInteger7 = bigFraction5.getDenominator();
        java.math.BigInteger bigInteger8 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger3, bigInteger7);
        java.math.BigInteger bigInteger10 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger7, 35);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException11 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) bigInteger10);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction(bigInteger10);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction12.reciprocal();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction12.reciprocal();
        double double15 = bigFraction14.percentageValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField3 = fraction0.getField();
        java.lang.String str4 = fraction0.toString();
        double double5 = fraction0.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.subtract(6);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.multiply((int) (short) -2662);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 / 2" + "'", str4, "1 / 2");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(1072693248L);
        java.lang.Number number2 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException4 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigFraction1, number2, false);
        java.math.BigInteger bigInteger5 = bigFraction1.getDenominator();
        org.junit.Assert.assertNotNull(bigInteger5);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        int int3 = fraction2.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField5 = fraction4.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = fractionField5.getZero();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.add(fraction6);
        int int8 = fraction2.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction2.subtract(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField13 = fraction12.getField();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.divide(fraction12);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField15 = fraction12.getField();
        org.apache.commons.math3.fraction.FractionField fractionField16 = fraction12.getField();
        org.apache.commons.math3.fraction.Fraction fraction17 = fractionField16.getOne();
        org.apache.commons.math3.fraction.Fraction fraction18 = fractionField16.getZero();
        long long19 = fraction18.longValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField21 = fraction20.getField();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField24 = fraction23.getField();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction22.divide(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction20.multiply(fraction25);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField27 = fraction25.getField();
        org.apache.commons.math3.fraction.Fraction fraction28 = fractionField27.getZero();
        int int29 = fraction18.compareTo(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction30.negate();
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction28.subtract(fraction30);
        int int33 = fraction28.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction9.multiply(fraction28);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fractionField15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fractionField21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fractionField24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fractionField27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(fraction34);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 30, 1395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.pow(5392957440L);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger5 = bigFraction4.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction4.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction4.add((int) (byte) -1);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException10 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) bigFraction1, (java.lang.Number) bigFraction4, false);
        long long11 = bigFraction4.getDenominatorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction4.multiply((long) (byte) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction13.subtract((long) (-1));
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction16.pow(5392957440L);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float23 = bigFraction22.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction21.add(bigFraction22);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction24.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float29 = bigFraction28.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction27.add(bigFraction28);
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction30.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction25.add(bigFraction30);
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger34 = bigFraction33.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = bigFraction33.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = bigFraction25.divide(bigFraction33);
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction33.subtract(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction19.multiply(bigFraction33);
        int int40 = bigFraction18.compareTo(bigFraction33);
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long43 = bigFraction42.longValue();
        java.math.BigInteger bigInteger44 = bigFraction42.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long47 = bigFraction46.longValue();
        java.math.BigInteger bigInteger48 = bigFraction46.getDenominator();
        java.math.BigInteger bigInteger49 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger44, bigInteger48);
        org.apache.commons.math3.fraction.BigFraction bigFraction50 = bigFraction33.divide(bigInteger49);
        org.apache.commons.math3.fraction.BigFraction bigFraction52 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction53 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float54 = bigFraction53.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction55 = bigFraction52.add(bigFraction53);
        org.apache.commons.math3.fraction.BigFraction bigFraction56 = bigFraction52.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction58 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long59 = bigFraction58.longValue();
        java.math.BigInteger bigInteger60 = bigFraction58.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction62 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long63 = bigFraction62.longValue();
        java.math.BigInteger bigInteger64 = bigFraction62.getDenominator();
        java.math.BigInteger bigInteger65 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger60, bigInteger64);
        org.apache.commons.math3.fraction.BigFraction bigFraction66 = bigFraction52.add(bigInteger64);
        org.apache.commons.math3.fraction.BigFraction bigFraction68 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long69 = bigFraction68.longValue();
        java.math.BigInteger bigInteger70 = bigFraction68.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction72 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long73 = bigFraction72.longValue();
        java.math.BigInteger bigInteger74 = bigFraction72.getDenominator();
        java.math.BigInteger bigInteger75 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger70, bigInteger74);
        java.math.BigInteger bigInteger76 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger64, bigInteger75);
        org.apache.commons.math3.fraction.BigFraction bigFraction77 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger78 = bigFraction77.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction79 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger80 = bigFraction79.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction81 = new org.apache.commons.math3.fraction.BigFraction(bigInteger78, bigInteger80);
        org.apache.commons.math3.fraction.BigFraction bigFraction82 = new org.apache.commons.math3.fraction.BigFraction(bigInteger64, bigInteger80);
        java.math.BigInteger bigInteger84 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger80, 4);
        org.apache.commons.math3.fraction.BigFraction bigFraction85 = bigFraction33.multiply(bigInteger80);
        org.apache.commons.math3.fraction.BigFraction bigFraction86 = new org.apache.commons.math3.fraction.BigFraction(bigInteger80);
        org.apache.commons.math3.fraction.BigFraction bigFraction87 = bigFraction13.subtract(bigInteger80);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4L + "'", long11 == 4L);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.25f + "'", float23 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.25f + "'", float29 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 100L + "'", long43 == 100L);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 100L + "'", long47 == 100L);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertNotNull(bigFraction50);
        org.junit.Assert.assertNotNull(bigFraction53);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.25f + "'", float54 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction55);
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 100L + "'", long59 == 100L);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 100L + "'", long63 == 100L);
        org.junit.Assert.assertNotNull(bigInteger64);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertNotNull(bigFraction66);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 100L + "'", long69 == 100L);
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 100L + "'", long73 == 100L);
        org.junit.Assert.assertNotNull(bigInteger74);
        org.junit.Assert.assertNotNull(bigInteger75);
        org.junit.Assert.assertNotNull(bigInteger76);
        org.junit.Assert.assertNotNull(bigFraction77);
        org.junit.Assert.assertNotNull(bigInteger78);
        org.junit.Assert.assertNotNull(bigFraction79);
        org.junit.Assert.assertNotNull(bigInteger80);
        org.junit.Assert.assertNotNull(bigInteger84);
        org.junit.Assert.assertNotNull(bigFraction85);
        org.junit.Assert.assertNotNull(bigFraction87);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction2);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext4 = notPositiveException3.getContext();
        java.lang.String str5 = notPositiveException3.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(exceptionContext4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.math3.exception.NotPositiveException: 1 is smaller than the minimum (0)" + "'", str5, "org.apache.commons.math3.exception.NotPositiveException: 1 is smaller than the minimum (0)");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.lang.Object obj0 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_ADDITION;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger3 = bigFraction2.getNumerator();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException7 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats9 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0f), localizedFormats11 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException13 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats9, objArray12);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException14 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException7, (org.apache.commons.math3.exception.util.Localizable) localizedFormats8, objArray12);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException15 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats4, objArray12);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException16 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction2, objArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.util.MathUtils.checkNotNull(obj0, (org.apache.commons.math3.exception.util.Localizable) localizedFormats1, objArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: overflow in addition: -1 + BINOMIAL_NEGATIVE_PARAMETER");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_ADDITION + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_ADDITION));
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats9 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats9.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.PERCENTILE_IMPLEMENTATION_CANNOT_ACCESS_METHOD;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX;
        java.lang.Object[] objArray3 = null;
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException4 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats2, objArray3);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats6 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException10 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray15 = new java.lang.Object[] { (-1.0f), localizedFormats14 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException16 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats12, objArray15);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException17 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException10, (org.apache.commons.math3.exception.util.Localizable) localizedFormats11, objArray15);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException18 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats7, objArray15);
        java.lang.Throwable[] throwableArray19 = mathArithmeticException18.getSuppressed();
        org.apache.commons.math3.exception.ZeroException zeroException20 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats6, (java.lang.Object[]) throwableArray19);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException21 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException4, (org.apache.commons.math3.exception.util.Localizable) localizedFormats5, (java.lang.Object[]) throwableArray19);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException22 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, (java.lang.Object[]) throwableArray19);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats23 = org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats24 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX;
        java.lang.Object[] objArray25 = null;
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException26 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats24, objArray25);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats27 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats28 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats29 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException32 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats33 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats34 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats36 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray37 = new java.lang.Object[] { (-1.0f), localizedFormats36 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException38 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats34, objArray37);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException39 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException32, (org.apache.commons.math3.exception.util.Localizable) localizedFormats33, objArray37);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException40 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats29, objArray37);
        java.lang.Throwable[] throwableArray41 = mathArithmeticException40.getSuppressed();
        org.apache.commons.math3.exception.ZeroException zeroException42 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats28, (java.lang.Object[]) throwableArray41);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException43 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException26, (org.apache.commons.math3.exception.util.Localizable) localizedFormats27, (java.lang.Object[]) throwableArray41);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException44 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats23, (java.lang.Object[]) throwableArray41);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException45 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, (java.lang.Object[]) throwableArray41);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException46 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Object[]) throwableArray41);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext47 = mathArithmeticException46.getContext();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERCENTILE_IMPLEMENTATION_CANNOT_ACCESS_METHOD + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERCENTILE_IMPLEMENTATION_CANNOT_ACCESS_METHOD));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS));
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT));
        org.junit.Assert.assertTrue("'" + localizedFormats6 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS + "'", localizedFormats6.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS));
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats7.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertTrue("'" + localizedFormats23 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS + "'", localizedFormats23.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS));
        org.junit.Assert.assertTrue("'" + localizedFormats24 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX + "'", localizedFormats24.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX));
        org.junit.Assert.assertTrue("'" + localizedFormats27 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT + "'", localizedFormats27.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT));
        org.junit.Assert.assertTrue("'" + localizedFormats28 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS + "'", localizedFormats28.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS));
        org.junit.Assert.assertTrue("'" + localizedFormats29 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats29.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats33 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats33.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats34 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats34.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats36 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats36.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(exceptionContext47);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 1075314688);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-268435456), (-53));
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.pow(5392957440L);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger5 = bigFraction4.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction4.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction4.add((int) (byte) -1);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException10 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) bigFraction1, (java.lang.Number) bigFraction4, false);
        long long11 = bigFraction4.getDenominatorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction4.multiply((long) (byte) 100);
        java.math.BigInteger bigInteger14 = bigFraction4.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long17 = bigFraction16.longValue();
        java.math.BigInteger bigInteger18 = bigFraction16.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long21 = bigFraction20.longValue();
        java.math.BigInteger bigInteger22 = bigFraction20.getDenominator();
        java.math.BigInteger bigInteger23 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger18, bigInteger22);
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = new org.apache.commons.math3.fraction.BigFraction(bigInteger14, bigInteger18);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float29 = bigFraction28.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction27.add(bigFraction28);
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction27.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long34 = bigFraction33.longValue();
        java.math.BigInteger bigInteger35 = bigFraction33.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long38 = bigFraction37.longValue();
        java.math.BigInteger bigInteger39 = bigFraction37.getDenominator();
        java.math.BigInteger bigInteger40 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger35, bigInteger39);
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = bigFraction27.add(bigInteger39);
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = bigFraction25.subtract(bigInteger39);
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = bigFraction24.add(bigInteger39);
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger45 = bigFraction44.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction44.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = bigFraction24.divide(bigFraction44);
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = bigFraction24.divide(27405L);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4L + "'", long11 == 4L);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.25f + "'", float29 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertNotNull(bigFraction49);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.9171692148363411d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 97.0f, (double) 0.25f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5682190129139257d + "'", double2 == 1.5682190129139257d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) 4.75956608E8f, (double) 35840.0f, (-1072693248));
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.4339872044851463d, (-0.6321205588285577d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide(fraction1);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction1.getField();
        org.apache.commons.math3.fraction.FractionField fractionField5 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = fractionField5.getOne();
        org.apache.commons.math3.fraction.Fraction fraction7 = fractionField5.getZero();
        long long8 = fraction7.longValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField10 = fraction9.getField();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField13 = fraction12.getField();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.divide(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction9.multiply(fraction14);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField16 = fraction14.getField();
        org.apache.commons.math3.fraction.Fraction fraction17 = fractionField16.getZero();
        int int18 = fraction7.compareTo(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction19.negate();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction17.subtract(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(1, 1078591488);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction24.subtract(1395);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction17.add(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction27.negate();
        int int29 = fraction28.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 465524053 + "'", int29 == 465524053);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction1.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long8 = bigFraction7.longValue();
        java.math.BigInteger bigInteger9 = bigFraction7.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long12 = bigFraction11.longValue();
        java.math.BigInteger bigInteger13 = bigFraction11.getDenominator();
        java.math.BigInteger bigInteger14 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger9, bigInteger13);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction1.add(bigInteger13);
        int int16 = bigFraction1.getDenominatorAsInt();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction0.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.multiply(10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction0.pow((long) 32);
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction8.multiply((-1074790400));
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction10.subtract((-1072693248));
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction12);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.3010299956639812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.247748258387595d + "'", double1 == 17.247748258387595d);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608274590866d + "'", double1 == 0.6483608274590866d);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) (byte) 1, (long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float6 = bigFraction5.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction4.add(bigFraction5);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction5.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long12 = bigFraction11.longValue();
        java.math.BigInteger bigInteger13 = bigFraction11.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long16 = bigFraction15.longValue();
        java.math.BigInteger bigInteger17 = bigFraction15.getDenominator();
        java.math.BigInteger bigInteger18 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger13, bigInteger17);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction9.multiply(bigInteger13);
        java.math.BigInteger bigInteger21 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger13, (long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction2.pow(bigInteger13);
        int int23 = bigFraction2.getNumeratorAsInt();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction2.reduce();
        int int25 = bigFraction2.getNumeratorAsInt();
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.25f + "'", float6 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, (int) (short) -2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(7.896326140304252E13d, 100.00000762939453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.89632614030425E13d + "'", double2 == 7.89632614030425E13d);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        long long1 = fraction0.longValue();
        boolean boolean3 = fraction0.equals((java.lang.Object) (-0.6321205588285577d));
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.abs();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(1, 1078591488);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField10 = fraction9.getField();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.divide(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction16.divide(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.reciprocal();
        int int20 = fraction13.compareTo(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.divide(fraction22);
        int int24 = fraction23.getNumerator();
        double double25 = fraction23.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction26.negate();
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction23.multiply(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction19.divide(fraction23);
        int int30 = fraction9.compareTo(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction19.subtract((int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction7.multiply(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction7.negate();
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction0.divide(fraction7);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        int int1 = org.apache.commons.math3.util.MathUtils.hash((double) 1078591488);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1104155264 + "'", int1 == 1104155264);
    }

    @Test
    public void test2042() throws Throwable {
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
    public void test2043() throws Throwable {
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
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.9626058663135666d), 1.048576E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.048576E-4d + "'", double2 == 1.048576E-4d);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.162277660168382E-16d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(3.328951362599048E-8d, (double) (-61L), (int) (short) 16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0 to fraction (77/2,313,040,703)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_WEIGHT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT;
        java.lang.String str2 = localizedFormats1.getSourceString();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction8 = new org.apache.commons.math3.fraction.Fraction((double) 'a', (double) (byte) 1, (int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction4.multiply(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.abs();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.subtract(2);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = new org.apache.commons.math3.fraction.BigFraction(0.0d, 7.105427357600977E-15d, 1807551715);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = new org.apache.commons.math3.fraction.BigFraction((long) (byte) 1, (long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float24 = bigFraction23.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction22.add(bigFraction23);
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = bigFraction23.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long30 = bigFraction29.longValue();
        java.math.BigInteger bigInteger31 = bigFraction29.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long34 = bigFraction33.longValue();
        java.math.BigInteger bigInteger35 = bigFraction33.getDenominator();
        java.math.BigInteger bigInteger36 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger31, bigInteger35);
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = bigFraction27.multiply(bigInteger31);
        java.math.BigInteger bigInteger39 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger31, (long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = bigFraction20.pow(bigInteger31);
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = bigFraction17.multiply(bigInteger31);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException43 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, (java.lang.Number) fraction11, (java.lang.Number) bigFraction17, true);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats44 = org.apache.commons.math3.exception.util.LocalizedFormats.CROSSOVER_RATE;
        org.apache.commons.math3.exception.util.Localizable localizable45 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException49 = new org.apache.commons.math3.exception.NumberIsTooSmallException(localizable45, (java.lang.Number) 1.0f, (java.lang.Number) 10, false);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext50 = numberIsTooSmallException49.getContext();
        java.lang.Number number51 = numberIsTooSmallException49.getMin();
        java.lang.Throwable[] throwableArray52 = numberIsTooSmallException49.getSuppressed();
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException53 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats44, (java.lang.Object[]) throwableArray52);
        org.apache.commons.math3.exception.ConvergenceException convergenceException54 = new org.apache.commons.math3.exception.ConvergenceException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, (java.lang.Object[]) throwableArray52);
        org.apache.commons.math3.exception.ZeroException zeroException55 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Object[]) throwableArray52);
        java.lang.Throwable throwable56 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats57 = org.apache.commons.math3.exception.util.LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_ONE;
        org.apache.commons.math3.fraction.BigFraction bigFraction58 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger59 = bigFraction58.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction60 = bigFraction58.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction62 = bigFraction58.add((int) (byte) -1);
        double double63 = bigFraction62.percentageValue();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats64 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats65 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException68 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats69 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats70 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats72 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray73 = new java.lang.Object[] { (-1.0f), localizedFormats72 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException74 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats70, objArray73);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException75 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException68, (org.apache.commons.math3.exception.util.Localizable) localizedFormats69, objArray73);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException76 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats65, objArray73);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException77 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats64, objArray73);
        java.lang.String str78 = localizedFormats64.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats79 = org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats80 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException83 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats84 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats85 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats87 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray88 = new java.lang.Object[] { (-1.0f), localizedFormats87 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException89 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats85, objArray88);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException90 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException83, (org.apache.commons.math3.exception.util.Localizable) localizedFormats84, objArray88);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException91 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats80, objArray88);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException92 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats79, objArray88);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) bigFraction62, (org.apache.commons.math3.exception.util.Localizable) localizedFormats64, objArray88);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException94 = new org.apache.commons.math3.exception.MathIllegalStateException(throwable56, (org.apache.commons.math3.exception.util.Localizable) localizedFormats57, objArray88);
        org.apache.commons.math3.exception.ConvergenceException convergenceException95 = new org.apache.commons.math3.exception.ConvergenceException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray88);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_WEIGHT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_WEIGHT));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Loess expects at least 1 point" + "'", str2, "Loess expects at least 1 point");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.25f + "'", float24 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(bigFraction37);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertTrue("'" + localizedFormats44 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CROSSOVER_RATE + "'", localizedFormats44.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CROSSOVER_RATE));
        org.junit.Assert.assertNotNull(exceptionContext50);
        org.junit.Assert.assertEquals("'" + number51 + "' != '" + 10 + "'", number51, 10);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertTrue("'" + localizedFormats57 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_ONE + "'", localizedFormats57.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_ONE));
        org.junit.Assert.assertNotNull(bigFraction58);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigFraction60);
        org.junit.Assert.assertNotNull(bigFraction62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-75.0d) + "'", double63 == (-75.0d));
        org.junit.Assert.assertTrue("'" + localizedFormats64 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR + "'", localizedFormats64.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats65 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats65.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats69 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats69.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats70 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats70.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats72 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats72.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "cannot normalize a zero norm vector" + "'", str78, "cannot normalize a zero norm vector");
        org.junit.Assert.assertTrue("'" + localizedFormats79 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION + "'", localizedFormats79.equals(org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION));
        org.junit.Assert.assertTrue("'" + localizedFormats80 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats80.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats84 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats84.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats85 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats85.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats87 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats87.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray88), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray88), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
    }
}
