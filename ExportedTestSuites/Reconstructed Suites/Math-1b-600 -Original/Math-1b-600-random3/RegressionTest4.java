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
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float4 = bigFraction3.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.add(bigFraction3);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long9 = bigFraction8.longValue();
        java.math.BigInteger bigInteger10 = bigFraction8.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long13 = bigFraction12.longValue();
        java.math.BigInteger bigInteger14 = bigFraction12.getDenominator();
        java.math.BigInteger bigInteger15 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger10, bigInteger14);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction2.add(bigInteger14);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction0.subtract(bigInteger14);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction0.pow((int) 'a');
        int int20 = bigFraction0.getNumeratorAsInt();
        long long21 = bigFraction0.longValue();
        java.lang.String str22 = bigFraction0.toString();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float26 = bigFraction25.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = bigFraction24.add(bigFraction25);
        java.math.BigInteger bigInteger28 = bigFraction24.getDenominator();
        java.math.BigInteger bigInteger30 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger28, 1072693248L);
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction0.add(bigInteger28);
        java.math.BigInteger bigInteger32 = bigFraction0.getDenominator();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.25f + "'", float4 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1 / 4" + "'", str22, "1 / 4");
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.25f + "'", float26 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigInteger32);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT;
        java.lang.String str1 = localizedFormats0.getSourceString();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction7 = new org.apache.commons.math3.fraction.Fraction((double) 'a', (double) (byte) 1, (int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction3.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.abs();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.subtract(2);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = new org.apache.commons.math3.fraction.BigFraction(0.0d, 7.105427357600977E-15d, 1807551715);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = new org.apache.commons.math3.fraction.BigFraction((long) (byte) 1, (long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float23 = bigFraction22.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction21.add(bigFraction22);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction22.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long29 = bigFraction28.longValue();
        java.math.BigInteger bigInteger30 = bigFraction28.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long33 = bigFraction32.longValue();
        java.math.BigInteger bigInteger34 = bigFraction32.getDenominator();
        java.math.BigInteger bigInteger35 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger30, bigInteger34);
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = bigFraction26.multiply(bigInteger30);
        java.math.BigInteger bigInteger38 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger30, (long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction19.pow(bigInteger30);
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = bigFraction16.multiply(bigInteger30);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException42 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction10, (java.lang.Number) bigFraction16, true);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats43 = org.apache.commons.math3.exception.util.LocalizedFormats.CROSSOVER_RATE;
        org.apache.commons.math3.exception.util.Localizable localizable44 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException48 = new org.apache.commons.math3.exception.NumberIsTooSmallException(localizable44, (java.lang.Number) 1.0f, (java.lang.Number) 10, false);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext49 = numberIsTooSmallException48.getContext();
        java.lang.Number number50 = numberIsTooSmallException48.getMin();
        java.lang.Throwable[] throwableArray51 = numberIsTooSmallException48.getSuppressed();
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException52 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats43, (java.lang.Object[]) throwableArray51);
        org.apache.commons.math3.exception.ConvergenceException convergenceException53 = new org.apache.commons.math3.exception.ConvergenceException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Object[]) throwableArray51);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext54 = convergenceException53.getContext();
        java.lang.String str55 = convergenceException53.toString();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Loess expects at least 1 point" + "'", str1, "Loess expects at least 1 point");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.25f + "'", float23 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertTrue("'" + localizedFormats43 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CROSSOVER_RATE + "'", localizedFormats43.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CROSSOVER_RATE));
        org.junit.Assert.assertNotNull(exceptionContext49);
        org.junit.Assert.assertEquals("'" + number50 + "' != '" + 10 + "'", number50, 10);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(exceptionContext54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "org.apache.commons.math3.exception.ConvergenceException: illegal state: Loess expects at least 1 point" + "'", str55, "org.apache.commons.math3.exception.ConvergenceException: illegal state: Loess expects at least 1 point");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction1.add(0);
        double double7 = bigFraction1.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction1.add((long) '#');
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction1.pow(0);
        java.lang.String str12 = bigFraction11.toString();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(1);
        java.lang.String str5 = fraction1.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 / 2" + "'", str5, "1 / 2");
    }

    @Test
    public void test2005() throws Throwable {
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
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats3 = org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException7 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats9 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0f), localizedFormats11 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException13 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats9, objArray12);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException14 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException7, (org.apache.commons.math3.exception.util.Localizable) localizedFormats8, objArray12);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException15 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats4, objArray12);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException16 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats3, objArray12);
        org.apache.commons.math3.exception.ConvergenceException convergenceException17 = new org.apache.commons.math3.exception.ConvergenceException((org.apache.commons.math3.exception.util.Localizable) localizedFormats2, objArray12);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException18 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) 3628800L, objArray12);
        org.apache.commons.math3.exception.ZeroException zeroException19 = new org.apache.commons.math3.exception.ZeroException(localizable0, objArray12);
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS));
        org.junit.Assert.assertTrue("'" + localizedFormats3 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION + "'", localizedFormats3.equals(org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION));
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats9 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats9.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(6.897704943128636d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction4.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float9 = bigFraction8.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction7.add(bigFraction8);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction10.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction5.add(bigFraction10);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction12.abs();
        java.math.BigDecimal bigDecimal14 = bigFraction12.bigDecimalValue();
        java.math.BigInteger bigInteger15 = bigFraction12.getNumerator();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.25f + "'", float9 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigInteger15);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 1072693248L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5384786408469177d + "'", double1 == 0.5384786408469177d);
    }

    @Test
    public void test2010() throws Throwable {
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
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fractionField7.getOne();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats9 = org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT;
        java.lang.String str10 = localizedFormats9.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION;
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.divide(fraction15);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException17 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats13, (java.lang.Number) fraction14);
        java.lang.Throwable[] throwableArray18 = notPositiveException17.getSuppressed();
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException19 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats12, (java.lang.Object[]) throwableArray18);
        java.lang.Object[] objArray20 = new java.lang.Object[] { localizedFormats11, localizedFormats12 };
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) fraction8, (org.apache.commons.math3.exception.util.Localizable) localizedFormats9, objArray20);
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = new org.apache.commons.math3.fraction.BigFraction((long) (byte) 1, (long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float28 = bigFraction27.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction26.add(bigFraction27);
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction27.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long34 = bigFraction33.longValue();
        java.math.BigInteger bigInteger35 = bigFraction33.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long38 = bigFraction37.longValue();
        java.math.BigInteger bigInteger39 = bigFraction37.getDenominator();
        java.math.BigInteger bigInteger40 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger35, bigInteger39);
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = bigFraction31.multiply(bigInteger35);
        java.math.BigInteger bigInteger43 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger35, (long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = bigFraction24.pow(bigInteger35);
        int int45 = bigFraction24.getNumeratorAsInt();
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction24.reduce();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException47 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats9, (java.lang.Number) bigFraction24);
        java.lang.String str48 = notPositiveException47.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + localizedFormats9 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT + "'", localizedFormats9.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Loess expects at least 1 point" + "'", str10, "Loess expects at least 1 point");
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR, UNABLE_TO_ORTHOGONOLIZE_MATRIX]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR, UNABLE_TO_ORTHOGONOLIZE_MATRIX]");
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.25f + "'", float28 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "org.apache.commons.math3.exception.NotPositiveException: Loess expects at least 1 point" + "'", str48, "org.apache.commons.math3.exception.NotPositiveException: Loess expects at least 1 point");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) 'a', 340593891);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.divide(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction3.multiply(fraction8);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField10 = fraction8.getField();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.divide(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.divide(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction16.reciprocal();
        int int19 = fraction12.compareTo(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction8.subtract(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction2.divide(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.multiply(315);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999986258976d + "'", double1 == 0.9999999986258976d);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.math3.util.MathUtils.checkFinite((double) (short) 0);
    }

    @Test
    public void test2017() throws Throwable {
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
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) 1877073665, (long) 35);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long9 = bigFraction8.longValue();
        java.math.BigInteger bigInteger10 = bigFraction8.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long13 = bigFraction12.longValue();
        java.math.BigInteger bigInteger14 = bigFraction12.getDenominator();
        java.math.BigInteger bigInteger15 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger10, bigInteger14);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction6.multiply(bigInteger10);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction16.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction17.abs();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction18);
    }

    @Test
    public void test2020() throws Throwable {
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
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction4.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float9 = bigFraction8.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction7.add(bigFraction8);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction10.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction5.add(bigFraction10);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger14 = bigFraction13.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction13.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction5.divide(bigFraction13);
        short short17 = bigFraction5.shortValue();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.25f + "'", float9 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        int int5 = bigFraction4.intValue();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(0, 1);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField5 = fraction4.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.divide(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField10 = fraction9.getField();
        org.apache.commons.math3.fraction.Fraction fraction11 = fractionField10.getZero();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.subtract(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction8.divide(fraction12);
        double double15 = fraction14.percentageValue();
        int int16 = fraction2.compareTo(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.divide(fraction18);
        int int20 = fraction19.getNumerator();
        double double21 = fraction19.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction14.add(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction22.negate();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 7200.0d + "'", double15 == 7200.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(9.332621544395286E157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.660549437995381E78d + "'", double1 == 9.660549437995381E78d);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger6 = bigFraction5.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction5.negate();
        java.math.BigInteger bigInteger8 = bigFraction7.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction2.subtract(bigInteger8);
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = new org.apache.commons.math3.fraction.BigFraction(bigInteger8);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigFraction9);
    }

    @Test
    public void test2027() throws Throwable {
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
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_INVERTIBLE_TRANSFORM;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_RIGHT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.POPULATION_SIZE;
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.THREE_FIFTHS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException8 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats9 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats10 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0f), localizedFormats12 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException14 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats10, objArray13);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException15 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException8, (org.apache.commons.math3.exception.util.Localizable) localizedFormats9, objArray13);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException16 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats5, objArray13);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException17 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats4, objArray13);
        org.apache.commons.math3.exception.util.Localizable localizable18 = null;
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger20 = bigFraction19.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction19.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float24 = bigFraction23.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction19.add(bigFraction23);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats26 = org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT;
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger28 = bigFraction27.getNumerator();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats29 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException32 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats33 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats34 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats36 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray37 = new java.lang.Object[] { (-1.0f), localizedFormats36 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException38 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats34, objArray37);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException39 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException32, (org.apache.commons.math3.exception.util.Localizable) localizedFormats33, objArray37);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException40 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats29, objArray37);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException41 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction27, objArray37);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) bigFraction19, (org.apache.commons.math3.exception.util.Localizable) localizedFormats26, objArray37);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException43 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalArgumentException17, localizable18, objArray37);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException44 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats2, (java.lang.Number) bigFraction3, objArray37);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException45 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, objArray37);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException46 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray37);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_INVERTIBLE_TRANSFORM + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_INVERTIBLE_TRANSFORM));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_RIGHT + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_RIGHT));
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POPULATION_SIZE + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POPULATION_SIZE));
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats9 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats9.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats10 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats10.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.25f + "'", float24 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertTrue("'" + localizedFormats26 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT + "'", localizedFormats26.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT));
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertTrue("'" + localizedFormats29 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats29.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats33 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats33.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats34 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats34.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats36 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats36.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(1, 961);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 961 + "'", int2 == 961);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-127));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23235910202965793d + "'", double1 == 0.23235910202965793d);
    }

    @Test
    public void test2031() throws Throwable {
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
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException4 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats6 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f), localizedFormats8 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException10 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats6, objArray9);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException11 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException4, (org.apache.commons.math3.exception.util.Localizable) localizedFormats5, objArray9);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException12 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, objArray9);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException13 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray9);
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField15 = fraction14.getField();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField18 = fraction17.getField();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction16.divide(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction14.multiply(fraction19);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField21 = fraction19.getField();
        org.apache.commons.math3.fraction.Fraction fraction22 = fractionField21.getZero();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction22.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField27 = fraction26.getField();
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction25.multiply(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction26.subtract(341642467);
        long long31 = fraction30.longValue();
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction30.divide(100);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction22.multiply(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction34.negate();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats36 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_SELF_ADJOINT_OPERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats37 = org.apache.commons.math3.exception.util.LocalizedFormats.DENOMINATOR_FORMAT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats38 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_WEIGHT;
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger40 = bigFraction39.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = bigFraction39.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float44 = bigFraction43.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = bigFraction39.add(bigFraction43);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats46 = org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT;
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger48 = bigFraction47.getNumerator();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats49 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException52 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats53 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats54 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats56 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray57 = new java.lang.Object[] { (-1.0f), localizedFormats56 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException58 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats54, objArray57);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException59 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException52, (org.apache.commons.math3.exception.util.Localizable) localizedFormats53, objArray57);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException60 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats49, objArray57);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException61 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction47, objArray57);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) bigFraction39, (org.apache.commons.math3.exception.util.Localizable) localizedFormats46, objArray57);
        org.apache.commons.math3.exception.ConvergenceException convergenceException63 = new org.apache.commons.math3.exception.ConvergenceException((org.apache.commons.math3.exception.util.Localizable) localizedFormats38, objArray57);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException64 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats37, objArray57);
        org.apache.commons.math3.exception.ZeroException zeroException65 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats36, objArray57);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats66 = org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_LENGTH_MISMATCH;
        org.apache.commons.math3.exception.util.Localizable localizable67 = null;
        org.apache.commons.math3.fraction.BigFraction bigFraction68 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger69 = bigFraction68.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction70 = bigFraction68.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction72 = bigFraction68.add((int) (byte) -1);
        java.math.BigInteger bigInteger73 = bigFraction68.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction75 = bigFraction68.divide(100);
        org.apache.commons.math3.fraction.BigFraction bigFraction77 = bigFraction75.subtract((-1072693248));
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats78 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats79 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION;
        org.apache.commons.math3.fraction.Fraction fraction80 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction81 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction82 = fraction80.divide(fraction81);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException83 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats79, (java.lang.Number) fraction80);
        java.lang.Throwable[] throwableArray84 = notPositiveException83.getSuppressed();
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException85 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats78, (java.lang.Object[]) throwableArray84);
        java.lang.Throwable[] throwableArray86 = mathIllegalStateException85.getSuppressed();
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException87 = new org.apache.commons.math3.exception.NotFiniteNumberException(localizable67, (java.lang.Number) (-1072693248), (java.lang.Object[]) throwableArray86);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException88 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats66, (java.lang.Object[]) throwableArray86);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException89 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats36, (java.lang.Object[]) throwableArray86);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException90 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction34, (java.lang.Object[]) throwableArray86);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats6 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats6.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fractionField15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fractionField18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fractionField21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fractionField27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-341642466L) + "'", long31 == (-341642466L));
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + localizedFormats36 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_SELF_ADJOINT_OPERATOR + "'", localizedFormats36.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_SELF_ADJOINT_OPERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats37 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DENOMINATOR_FORMAT + "'", localizedFormats37.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DENOMINATOR_FORMAT));
        org.junit.Assert.assertTrue("'" + localizedFormats38 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_WEIGHT + "'", localizedFormats38.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_WEIGHT));
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.25f + "'", float44 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertTrue("'" + localizedFormats46 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT + "'", localizedFormats46.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT));
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertTrue("'" + localizedFormats49 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats49.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats53 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats53.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats54 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats54.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats56 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats56.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertTrue("'" + localizedFormats66 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_LENGTH_MISMATCH + "'", localizedFormats66.equals(org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_LENGTH_MISMATCH));
        org.junit.Assert.assertNotNull(bigFraction68);
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertNotNull(bigFraction70);
        org.junit.Assert.assertNotNull(bigFraction72);
        org.junit.Assert.assertNotNull(bigInteger73);
        org.junit.Assert.assertNotNull(bigFraction75);
        org.junit.Assert.assertNotNull(bigFraction77);
        org.junit.Assert.assertTrue("'" + localizedFormats78 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats78.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertTrue("'" + localizedFormats79 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION + "'", localizedFormats79.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION));
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertNotNull(fraction81);
        org.junit.Assert.assertNotNull(fraction82);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(throwableArray86);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math3.util.MathUtils.checkFinite(doubleArray0);
        org.apache.commons.math3.util.MathUtils.checkFinite(doubleArray0);
        int int3 = org.apache.commons.math3.util.MathUtils.hash(doubleArray0);
        int int4 = org.apache.commons.math3.util.MathUtils.hash(doubleArray0);
        org.apache.commons.math3.util.MathUtils.checkFinite(doubleArray0);
        org.apache.commons.math3.util.MathUtils.checkFinite(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-1.5057551329999998E9d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.subtract((int) ' ');
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction0.subtract((long) (short) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction0.divide((long) '#');
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction0.subtract(bigInteger8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((-31), (int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.negate();
        double double4 = fraction3.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.divide(fraction5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.31d + "'", double4 == 0.31d);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.add(0);
        long long7 = bigFraction6.getNumeratorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction6.divide(1078591488);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction9.subtract((long) 1078591488);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction11);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(1811784996, 1152);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        int int3 = fraction2.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField5 = fraction4.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = fractionField5.getZero();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.add(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField10 = fraction9.getField();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.divide(fraction9);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField12 = fraction9.getField();
        org.apache.commons.math3.fraction.FractionField fractionField13 = fraction9.getField();
        int int14 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction7.multiply(fraction9);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField16 = fraction7.getField();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction7.divide((int) (short) 2);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fractionField12);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction18);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT;
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fractionField4.getZero();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField10 = fraction9.getField();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.divide(fraction9);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField12 = fraction9.getField();
        org.apache.commons.math3.fraction.FractionField fractionField13 = fraction9.getField();
        int int14 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction6.divide(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField18 = fraction17.getField();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction16.divide(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField23 = fraction22.getField();
        org.apache.commons.math3.fraction.Fraction fraction24 = fractionField23.getZero();
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction24.subtract(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction21.divide(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction9.divide(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction29.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction27.divide(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction2.multiply(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction34 = new org.apache.commons.math3.fraction.Fraction(45);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction32.multiply(fraction34);
        java.lang.Object[] objArray36 = null;
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException37 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction34, objArray36);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fractionField12);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fractionField18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fractionField23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction35);
    }

    @Test
    public void test2041() throws Throwable {
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
    public void test2042() throws Throwable {
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
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float7 = bigFraction6.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction5.add(bigFraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField10 = fraction9.getField();
        org.apache.commons.math3.fraction.Fraction fraction11 = fractionField10.getZero();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.subtract(fraction12);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException15 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigFraction5, (java.lang.Number) fraction12, true);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction2.divide(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction18 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction19 = fraction2.divide(fraction18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: the fraction to divide by must not be zero: 0/1");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.25f + "'", float7 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction16);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        double double3 = org.apache.commons.math3.util.MathUtils.reduce(100.0d, (-0.75d), (double) (-2952716662570746864L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2045() throws Throwable {
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
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        java.math.BigDecimal bigDecimal3 = bigFraction2.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.pow((-1));
        float float6 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float10 = bigFraction9.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction8.add(bigFraction9);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction8.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long15 = bigFraction14.longValue();
        java.math.BigInteger bigInteger16 = bigFraction14.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long19 = bigFraction18.longValue();
        java.math.BigInteger bigInteger20 = bigFraction18.getDenominator();
        java.math.BigInteger bigInteger21 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger16, bigInteger20);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction8.add(bigInteger20);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction2.multiply(bigFraction22);
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction23.pow(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.25f + "'", float6 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.25f + "'", float10 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction23);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        double double2 = org.apache.commons.math3.util.MathUtils.normalizeAngle(0.42279321873816184d, 0.4000000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.42279321873816184d + "'", double2 == 0.42279321873816184d);
    }
}
