package org.apache.commons.math3.fraction;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger2 = bigFraction1.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction1.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.subtract(bigFraction5);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float10 = bigFraction9.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction8.add(bigFraction9);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction11.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger14 = bigFraction13.getNumerator();
        int int15 = bigFraction12.compareTo(bigFraction13);
        int int16 = bigFraction13.getNumeratorAsInt();
        int int17 = bigFraction0.compareTo(bigFraction13);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField18 = bigFraction13.getField();
        int int19 = bigFraction13.getDenominatorAsInt();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction13.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction13.subtract(0);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.25f + "'", float10 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(bigFractionField18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction22);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.add(0);
        double double5 = bigFraction3.pow((double) 35L);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction3.subtract(28);
        java.math.BigInteger bigInteger8 = bigFraction3.getDenominator();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.1805916207174113E-14d + "'", double5 == 1.1805916207174113E-14d);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigInteger8);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OUTLINE_BOUNDARY_LOOP_OPEN;
        java.lang.String str1 = localizedFormats0.getSourceString();
        java.lang.Number number2 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats3 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger6 = bigFraction5.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction5.subtract((int) ' ');
        int int9 = bigFraction8.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction8.subtract(100);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction8.multiply((long) 87);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = org.apache.commons.math3.fraction.BigFraction.ONE_FIFTH;
        boolean boolean16 = bigFraction14.equals((java.lang.Object) 3.141592653589793d);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction8.multiply(bigFraction14);
        org.apache.commons.math3.exception.util.Localizable localizable18 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException22 = new org.apache.commons.math3.exception.NumberIsTooSmallException(localizable18, (java.lang.Number) 1.0f, (java.lang.Number) 10, false);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext23 = numberIsTooSmallException22.getContext();
        java.lang.Number number24 = numberIsTooSmallException22.getMin();
        java.lang.Throwable[] throwableArray25 = numberIsTooSmallException22.getSuppressed();
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException26 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction14, (java.lang.Object[]) throwableArray25);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException27 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats3, (java.lang.Number) 1.1505149978319904d, (java.lang.Object[]) throwableArray25);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException28 = new org.apache.commons.math3.exception.NotFiniteNumberException(number2, (java.lang.Object[]) throwableArray25);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException29 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Object[]) throwableArray25);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUTLINE_BOUNDARY_LOOP_OPEN + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUTLINE_BOUNDARY_LOOP_OPEN));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "an outline boundary loop is open" + "'", str1, "an outline boundary loop is open");
        org.junit.Assert.assertTrue("'" + localizedFormats3 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats3.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-31) + "'", int9 == (-31));
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(exceptionContext23);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 10 + "'", number24, 10);
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        java.math.BigInteger bigInteger35 = bigFraction34.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger37 = bigFraction36.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction36.negate();
        java.math.BigInteger bigInteger39 = bigFraction38.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = new org.apache.commons.math3.fraction.BigFraction(bigInteger35, bigInteger39);
        double double42 = bigFraction40.pow(0.011838841501833265d);
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
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        java.math.BigDecimal bigDecimal3 = bigFraction2.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.pow((-1));
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger7 = bigFraction6.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction6.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction6.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction10.reciprocal();
        int int12 = bigFraction11.getNumeratorAsInt();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction2.divide(bigFraction11);
        double double14 = bigFraction11.percentageValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-133.33333333333334d) + "'", double14 == (-133.33333333333334d));
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger2 = bigFraction1.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction1.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.subtract(bigFraction5);
        long long7 = bigFraction6.getDenominatorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = new org.apache.commons.math3.fraction.BigFraction((long) (byte) 1, (long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float14 = bigFraction13.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction12.add(bigFraction13);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction13.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long20 = bigFraction19.longValue();
        java.math.BigInteger bigInteger21 = bigFraction19.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long24 = bigFraction23.longValue();
        java.math.BigInteger bigInteger25 = bigFraction23.getDenominator();
        java.math.BigInteger bigInteger26 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger21, bigInteger25);
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = bigFraction17.multiply(bigInteger21);
        java.math.BigInteger bigInteger29 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger21, (long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction10.pow(bigInteger21);
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction6.multiply(bigInteger21);
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction31.multiply((long) (-30));
        double double34 = bigFraction31.percentageValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4L + "'", long7 == 4L);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.25f + "'", float14 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 75.0d + "'", double34 == 75.0d);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.5708614938627248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8107908758857842d + "'", double1 == 3.8107908758857842d);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long19 = bigFraction18.longValue();
        java.math.BigInteger bigInteger20 = bigFraction18.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction5.divide(bigInteger20);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats22 = org.apache.commons.math3.exception.util.LocalizedFormats.POPULATION_SIZE;
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = org.apache.commons.math3.fraction.BigFraction.THREE_FIFTHS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats24 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats25 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException28 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats29 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats30 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats32 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray33 = new java.lang.Object[] { (-1.0f), localizedFormats32 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException34 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats30, objArray33);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException35 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException28, (org.apache.commons.math3.exception.util.Localizable) localizedFormats29, objArray33);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException36 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats25, objArray33);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException37 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats24, objArray33);
        org.apache.commons.math3.exception.util.Localizable localizable38 = null;
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
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException63 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalArgumentException37, localizable38, objArray57);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException64 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats22, (java.lang.Number) bigFraction23, objArray57);
        double double65 = bigFraction23.percentageValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction66 = bigFraction5.multiply(bigFraction23);
        org.apache.commons.math3.fraction.BigFraction bigFraction67 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction69 = bigFraction67.multiply(35);
        org.apache.commons.math3.fraction.BigFraction bigFraction70 = bigFraction23.divide(bigFraction69);
        org.apache.commons.math3.fraction.BigFraction bigFraction71 = bigFraction23.negate();
        java.math.BigDecimal bigDecimal72 = bigFraction23.bigDecimalValue();
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertTrue("'" + localizedFormats22 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POPULATION_SIZE + "'", localizedFormats22.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POPULATION_SIZE));
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertTrue("'" + localizedFormats24 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR + "'", localizedFormats24.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats25 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats25.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats29 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats29.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats30 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats30.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats32 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats32.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
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
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 60.0d + "'", double65 == 60.0d);
        org.junit.Assert.assertNotNull(bigFraction66);
        org.junit.Assert.assertNotNull(bigFraction67);
        org.junit.Assert.assertNotNull(bigFraction69);
        org.junit.Assert.assertNotNull(bigFraction70);
        org.junit.Assert.assertNotNull(bigFraction71);
        org.junit.Assert.assertNotNull(bigDecimal72);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-2L), 3.4016141E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((-1072693248), (int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.divide(fraction3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-1074790344));
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INITIAL_ROW_AFTER_FINAL_ROW;
        java.lang.Object[] objArray1 = null;
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException2 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray1);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext3 = mathArithmeticException2.getContext();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INITIAL_ROW_AFTER_FINAL_ROW + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INITIAL_ROW_AFTER_FINAL_ROW));
        org.junit.Assert.assertNotNull(exceptionContext3);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger2 = bigFraction1.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction1.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.subtract(bigFraction5);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction6.subtract((long) 3);
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float12 = bigFraction11.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction10.add(bigFraction11);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction13.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float18 = bigFraction17.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction16.add(bigFraction17);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction19.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction14.add(bigFraction19);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger23 = bigFraction22.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction22.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction14.divide(bigFraction22);
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long28 = bigFraction27.longValue();
        java.math.BigInteger bigInteger29 = bigFraction27.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction14.divide(bigInteger29);
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger32 = bigFraction31.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction31.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = bigFraction31.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = bigFraction31.multiply(10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float41 = bigFraction40.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = bigFraction39.add(bigFraction40);
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = bigFraction39.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long46 = bigFraction45.longValue();
        java.math.BigInteger bigInteger47 = bigFraction45.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long50 = bigFraction49.longValue();
        java.math.BigInteger bigInteger51 = bigFraction49.getDenominator();
        java.math.BigInteger bigInteger52 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger47, bigInteger51);
        org.apache.commons.math3.fraction.BigFraction bigFraction53 = bigFraction39.add(bigInteger51);
        org.apache.commons.math3.fraction.BigFraction bigFraction54 = bigFraction37.pow(bigInteger51);
        org.apache.commons.math3.fraction.BigFraction bigFraction55 = new org.apache.commons.math3.fraction.BigFraction(bigInteger29, bigInteger51);
        org.apache.commons.math3.fraction.BigFraction bigFraction56 = bigFraction6.multiply(bigInteger29);
        org.apache.commons.math3.fraction.BigFraction bigFraction57 = bigFraction6.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction58 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction59 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger60 = bigFraction59.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction61 = bigFraction59.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction63 = bigFraction59.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction64 = bigFraction58.subtract(bigFraction63);
        long long65 = bigFraction64.getDenominatorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction68 = new org.apache.commons.math3.fraction.BigFraction((long) (byte) 1, (long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction70 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction71 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float72 = bigFraction71.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction73 = bigFraction70.add(bigFraction71);
        org.apache.commons.math3.fraction.BigFraction bigFraction75 = bigFraction71.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction77 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long78 = bigFraction77.longValue();
        java.math.BigInteger bigInteger79 = bigFraction77.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction81 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long82 = bigFraction81.longValue();
        java.math.BigInteger bigInteger83 = bigFraction81.getDenominator();
        java.math.BigInteger bigInteger84 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger79, bigInteger83);
        org.apache.commons.math3.fraction.BigFraction bigFraction85 = bigFraction75.multiply(bigInteger79);
        java.math.BigInteger bigInteger87 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger79, (long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction88 = bigFraction68.pow(bigInteger79);
        org.apache.commons.math3.fraction.BigFraction bigFraction89 = bigFraction64.multiply(bigInteger79);
        org.apache.commons.math3.fraction.BigFraction bigFraction90 = bigFraction57.multiply(bigInteger79);
        double double92 = bigFraction57.pow((double) 5);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.25f + "'", float12 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.25f + "'", float18 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertNotNull(bigFraction37);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 0.25f + "'", float41 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 100L + "'", long46 == 100L);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 100L + "'", long50 == 100L);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(bigFraction53);
        org.junit.Assert.assertNotNull(bigFraction54);
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertNotNull(bigFraction57);
        org.junit.Assert.assertNotNull(bigFraction58);
        org.junit.Assert.assertNotNull(bigFraction59);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(bigFraction61);
        org.junit.Assert.assertNotNull(bigFraction63);
        org.junit.Assert.assertNotNull(bigFraction64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 4L + "'", long65 == 4L);
        org.junit.Assert.assertNotNull(bigFraction71);
        org.junit.Assert.assertTrue("'" + float72 + "' != '" + 0.25f + "'", float72 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction73);
        org.junit.Assert.assertNotNull(bigFraction75);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 100L + "'", long78 == 100L);
        org.junit.Assert.assertNotNull(bigInteger79);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 100L + "'", long82 == 100L);
        org.junit.Assert.assertNotNull(bigInteger83);
        org.junit.Assert.assertNotNull(bigInteger84);
        org.junit.Assert.assertNotNull(bigFraction85);
        org.junit.Assert.assertNotNull(bigInteger87);
        org.junit.Assert.assertNotNull(bigFraction88);
        org.junit.Assert.assertNotNull(bigFraction89);
        org.junit.Assert.assertNotNull(bigFraction90);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.2373046875d + "'", double92 == 0.2373046875d);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = new org.apache.commons.math3.fraction.BigFraction(10L, 10L);
        int int46 = bigFraction16.compareTo(bigFraction45);
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = bigFraction16.reduce();
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(bigFraction47);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        double double1 = org.apache.commons.math3.util.FastMath.acos(9800.052244771154d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.subtract((int) ' ');
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction3.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long7 = bigFraction6.longValue();
        java.math.BigInteger bigInteger8 = bigFraction6.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long11 = bigFraction10.longValue();
        java.math.BigInteger bigInteger12 = bigFraction10.getDenominator();
        java.math.BigInteger bigInteger13 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger8, bigInteger12);
        java.math.BigInteger bigInteger15 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger12, 28L);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats16 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_RETRIEVE_AT_NEGATIVE_INDEX;
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long19 = bigFraction18.longValue();
        java.math.BigInteger bigInteger20 = bigFraction18.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long23 = bigFraction22.longValue();
        java.math.BigInteger bigInteger24 = bigFraction22.getDenominator();
        java.math.BigInteger bigInteger25 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger20, bigInteger24);
        java.math.BigInteger bigInteger27 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger24, 35);
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction28.divide(fraction29);
        int int31 = fraction30.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField33 = fraction32.getField();
        org.apache.commons.math3.fraction.Fraction fraction34 = fractionField33.getZero();
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction30.add(fraction34);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException37 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats16, (java.lang.Number) bigInteger24, (java.lang.Number) fraction34, false);
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = new org.apache.commons.math3.fraction.BigFraction(bigInteger12, bigInteger24);
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction4.subtract(bigInteger12);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats40 = org.apache.commons.math3.exception.util.LocalizedFormats.FRACTION_CONVERSION_OVERFLOW;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException43 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats44 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats45 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats47 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray48 = new java.lang.Object[] { (-1.0f), localizedFormats47 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException49 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats45, objArray48);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException50 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException43, (org.apache.commons.math3.exception.util.Localizable) localizedFormats44, objArray48);
        org.apache.commons.math3.exception.ZeroException zeroException51 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats40, objArray48);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException52 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction4, objArray48);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertTrue("'" + localizedFormats16 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_RETRIEVE_AT_NEGATIVE_INDEX + "'", localizedFormats16.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_RETRIEVE_AT_NEGATIVE_INDEX));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fractionField33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertTrue("'" + localizedFormats40 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.FRACTION_CONVERSION_OVERFLOW + "'", localizedFormats40.equals(org.apache.commons.math3.exception.util.LocalizedFormats.FRACTION_CONVERSION_OVERFLOW));
        org.junit.Assert.assertTrue("'" + localizedFormats44 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats44.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats45 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats45.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats47 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats47.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (-1504));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.divide(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.divide(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.reciprocal();
        int int16 = fraction9.compareTo(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction5.subtract(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((double) 1.07859136E9f);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction19.negate();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.multiply(961);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction22.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction17.subtract(fraction23);
        int int25 = fraction17.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(0.0d, 0.0d, (-1505755133));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(0.0d, (-1079525376));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2021() throws Throwable {
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
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        double double3 = bigFraction0.pow((double) (byte) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction0.pow(0L);
        long long6 = bigFraction5.getNumeratorAsLong();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = bigFraction5.bigDecimalValue(40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.048576E-4d + "'", double3 == 1.048576E-4d);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float1 = bigFraction0.floatValue();
        double double2 = bigFraction0.doubleValue();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) double2);
        java.lang.Throwable[] throwableArray4 = notPositiveException3.getSuppressed();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.25f + "'", float1 == 0.25f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.25d + "'", double2 == 0.25d);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply(1072693248);
        double double6 = fraction3.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long18 = bigFraction17.longValue();
        java.math.BigInteger bigInteger19 = bigFraction17.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long22 = bigFraction21.longValue();
        java.math.BigInteger bigInteger23 = bigFraction21.getDenominator();
        java.math.BigInteger bigInteger24 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger19, bigInteger23);
        java.math.BigInteger bigInteger25 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger13, bigInteger24);
        java.math.BigInteger bigInteger27 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger13, (int) (short) 10);
        java.math.BigInteger bigInteger29 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger13, 88529280);
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = new org.apache.commons.math3.fraction.BigFraction(bigInteger29);
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigInteger29);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        int int14 = bigFraction13.getNumeratorAsInt();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_LARGE_CUTOFF_SINGULAR_VALUE;
        org.apache.commons.math3.exception.util.Localizable localizable1 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException5 = new org.apache.commons.math3.exception.NumberIsTooSmallException(localizable1, (java.lang.Number) 1.0f, (java.lang.Number) 10, false);
        java.lang.Number number6 = numberIsTooSmallException5.getArgument();
        java.lang.Throwable[] throwableArray7 = numberIsTooSmallException5.getSuppressed();
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException8 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Object[]) throwableArray7);
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localizedFormats0.getLocalizedString(locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_LARGE_CUTOFF_SINGULAR_VALUE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_LARGE_CUTOFF_SINGULAR_VALUE));
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 1.0f + "'", number6, 1.0f);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction0.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.multiply(10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction0.pow((long) 32);
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction8.multiply((-1074790400));
        double double12 = bigFraction10.pow(12.566370614359172d);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField13 = bigFraction10.getField();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(bigFractionField13);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.subtract((int) ' ');
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction0.subtract((long) (short) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction0.multiply((long) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction0.negate();
        short short9 = bigFraction8.shortValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger3 = bigFraction2.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction(bigInteger1, bigInteger3);
        double double6 = bigFraction4.pow(5.649334448629621d);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger8 = bigFraction7.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction7.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction7.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction7.multiply(10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float17 = bigFraction16.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction15.add(bigFraction16);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction15.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long22 = bigFraction21.longValue();
        java.math.BigInteger bigInteger23 = bigFraction21.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long26 = bigFraction25.longValue();
        java.math.BigInteger bigInteger27 = bigFraction25.getDenominator();
        java.math.BigInteger bigInteger28 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger23, bigInteger27);
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction15.add(bigInteger27);
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction13.pow(bigInteger27);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction30.pow(0L);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float36 = bigFraction35.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = bigFraction34.add(bigFraction35);
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction35.add(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = org.apache.commons.math3.fraction.BigFraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger42 = bigFraction41.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = bigFraction41.negate();
        java.math.BigInteger bigInteger44 = bigFraction43.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = bigFraction40.multiply(bigInteger44);
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction35.divide(bigInteger44);
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = bigFraction32.add(bigInteger44);
        org.apache.commons.math3.fraction.BigFraction bigFraction48 = bigFraction4.multiply(bigInteger44);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.25f + "'", float17 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.25f + "'", float36 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction37);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertNotNull(bigFraction48);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 71);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 71.00001f + "'", float1 == 71.00001f);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction24.reciprocal();
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float29 = bigFraction28.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction27.add(bigFraction28);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction28.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long35 = bigFraction34.longValue();
        java.math.BigInteger bigInteger36 = bigFraction34.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long39 = bigFraction38.longValue();
        java.math.BigInteger bigInteger40 = bigFraction38.getDenominator();
        java.math.BigInteger bigInteger41 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger36, bigInteger40);
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = bigFraction32.multiply(bigInteger36);
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = bigFraction25.divide(bigInteger36);
        long long44 = bigFraction25.longValue();
        java.lang.Class<?> wildcardClass45 = bigFraction25.getClass();
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
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L + "'", long39 == 100L);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((double) 'a', (double) (byte) 1, (int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction6.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction2.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.abs();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.subtract(2);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField13 = fraction12.getField();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField16 = fraction15.getField();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.divide(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction12.multiply(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction12.add((int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction9.divide(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction23 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction21.subtract(fraction23);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException26 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) 241.66031448342542d, (java.lang.Number) fraction21, false);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction21.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction27.abs();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        double double1 = org.apache.commons.math3.util.FastMath.abs(53.5283502280899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.5283502280899d + "'", double1 == 53.5283502280899d);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.add(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = org.apache.commons.math3.fraction.BigFraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger9 = bigFraction8.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction8.negate();
        java.math.BigInteger bigInteger11 = bigFraction10.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction7.multiply(bigInteger11);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction2.divide(bigInteger11);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField14 = bigFraction13.getField();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFractionField14);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats17 = org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT;
        java.lang.String str18 = localizedFormats17.getSourceString();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction19.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction24 = new org.apache.commons.math3.fraction.Fraction((double) 'a', (double) (byte) 1, (int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction24.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction20.multiply(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.abs();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction27.subtract(2);
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = new org.apache.commons.math3.fraction.BigFraction(0.0d, 7.105427357600977E-15d, 1807551715);
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = new org.apache.commons.math3.fraction.BigFraction((long) (byte) 1, (long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float40 = bigFraction39.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = bigFraction38.add(bigFraction39);
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = bigFraction39.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long46 = bigFraction45.longValue();
        java.math.BigInteger bigInteger47 = bigFraction45.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long50 = bigFraction49.longValue();
        java.math.BigInteger bigInteger51 = bigFraction49.getDenominator();
        java.math.BigInteger bigInteger52 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger47, bigInteger51);
        org.apache.commons.math3.fraction.BigFraction bigFraction53 = bigFraction43.multiply(bigInteger47);
        java.math.BigInteger bigInteger55 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger47, (long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction56 = bigFraction36.pow(bigInteger47);
        org.apache.commons.math3.fraction.BigFraction bigFraction57 = bigFraction33.multiply(bigInteger47);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException59 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats17, (java.lang.Number) fraction27, (java.lang.Number) bigFraction33, true);
        org.apache.commons.math3.fraction.BigFraction bigFraction61 = bigFraction33.divide((long) (-1079525376));
        org.apache.commons.math3.fraction.BigFraction bigFraction62 = bigFraction16.multiply(bigFraction61);
        org.apache.commons.math3.fraction.BigFraction bigFraction63 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction64 = bigFraction62.subtract(bigFraction63);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + localizedFormats17 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT + "'", localizedFormats17.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Loess expects at least 1 point" + "'", str18, "Loess expects at least 1 point");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.25f + "'", float40 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 100L + "'", long46 == 100L);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 100L + "'", long50 == 100L);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(bigFraction53);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertNotNull(bigFraction57);
        org.junit.Assert.assertNotNull(bigFraction61);
        org.junit.Assert.assertNotNull(bigFraction62);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long3 = bigFraction2.longValue();
        java.math.BigDecimal bigDecimal5 = bigFraction2.bigDecimalValue((int) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = org.apache.commons.math3.fraction.BigFraction.THREE_FIFTHS;
        boolean boolean8 = bigFraction2.equals((java.lang.Object) bigFraction7);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats9 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats10 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException13 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats15 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats17 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray18 = new java.lang.Object[] { (-1.0f), localizedFormats17 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException19 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats15, objArray18);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException20 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException13, (org.apache.commons.math3.exception.util.Localizable) localizedFormats14, objArray18);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException21 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats10, objArray18);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException22 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats9, objArray18);
        org.apache.commons.math3.exception.util.Localizable localizable23 = null;
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger25 = bigFraction24.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = bigFraction24.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float29 = bigFraction28.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction24.add(bigFraction28);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats31 = org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT;
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger33 = bigFraction32.getNumerator();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats34 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException37 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats38 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats39 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats41 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray42 = new java.lang.Object[] { (-1.0f), localizedFormats41 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException43 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats39, objArray42);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException44 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException37, (org.apache.commons.math3.exception.util.Localizable) localizedFormats38, objArray42);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException45 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats34, objArray42);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException46 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction32, objArray42);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) bigFraction24, (org.apache.commons.math3.exception.util.Localizable) localizedFormats31, objArray42);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException48 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalArgumentException22, localizable23, objArray42);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException49 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) bigFraction7, objArray42);
        int int50 = bigFraction7.getNumeratorAsInt();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats51 = org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_ROOT_OF_UNITY_INDEX;
        boolean boolean52 = bigFraction7.equals((java.lang.Object) localizedFormats51);
        org.apache.commons.math3.fraction.BigFraction bigFraction54 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction55 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float56 = bigFraction55.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction57 = bigFraction54.add(bigFraction55);
        org.apache.commons.math3.fraction.BigFraction bigFraction58 = bigFraction57.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction60 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction61 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float62 = bigFraction61.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction63 = bigFraction60.add(bigFraction61);
        org.apache.commons.math3.fraction.BigFraction bigFraction64 = bigFraction63.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction65 = bigFraction58.add(bigFraction63);
        org.apache.commons.math3.fraction.BigFraction bigFraction66 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger67 = bigFraction66.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction68 = bigFraction66.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction69 = bigFraction58.divide(bigFraction66);
        java.math.BigInteger bigInteger70 = bigFraction58.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction71 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction72 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger73 = bigFraction72.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction74 = bigFraction72.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction76 = bigFraction72.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction77 = bigFraction71.subtract(bigFraction76);
        org.apache.commons.math3.fraction.BigFraction bigFraction79 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction80 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float81 = bigFraction80.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction82 = bigFraction79.add(bigFraction80);
        org.apache.commons.math3.fraction.BigFraction bigFraction83 = bigFraction82.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction84 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger85 = bigFraction84.getNumerator();
        int int86 = bigFraction83.compareTo(bigFraction84);
        int int87 = bigFraction84.getNumeratorAsInt();
        int int88 = bigFraction71.compareTo(bigFraction84);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField89 = bigFraction84.getField();
        int int90 = bigFraction84.getDenominatorAsInt();
        org.apache.commons.math3.fraction.BigFraction bigFraction91 = bigFraction58.add(bigFraction84);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException92 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats51, (java.lang.Number) bigFraction58);
        boolean boolean93 = notPositiveException92.getBoundIsAllowed();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + localizedFormats9 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR + "'", localizedFormats9.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats10 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats10.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats15 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats15.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats17 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats17.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.25f + "'", float29 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertTrue("'" + localizedFormats31 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT + "'", localizedFormats31.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT));
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertTrue("'" + localizedFormats34 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats34.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats38 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats38.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats39 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats39.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats41 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats41.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertTrue("'" + localizedFormats51 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_ROOT_OF_UNITY_INDEX + "'", localizedFormats51.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_ROOT_OF_UNITY_INDEX));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(bigFraction55);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 0.25f + "'", float56 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction57);
        org.junit.Assert.assertNotNull(bigFraction58);
        org.junit.Assert.assertNotNull(bigFraction61);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 0.25f + "'", float62 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction63);
        org.junit.Assert.assertNotNull(bigFraction64);
        org.junit.Assert.assertNotNull(bigFraction65);
        org.junit.Assert.assertNotNull(bigFraction66);
        org.junit.Assert.assertNotNull(bigInteger67);
        org.junit.Assert.assertNotNull(bigFraction68);
        org.junit.Assert.assertNotNull(bigFraction69);
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertNotNull(bigFraction71);
        org.junit.Assert.assertNotNull(bigFraction72);
        org.junit.Assert.assertNotNull(bigInteger73);
        org.junit.Assert.assertNotNull(bigFraction74);
        org.junit.Assert.assertNotNull(bigFraction76);
        org.junit.Assert.assertNotNull(bigFraction77);
        org.junit.Assert.assertNotNull(bigFraction80);
        org.junit.Assert.assertTrue("'" + float81 + "' != '" + 0.25f + "'", float81 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction82);
        org.junit.Assert.assertNotNull(bigFraction83);
        org.junit.Assert.assertNotNull(bigFraction84);
        org.junit.Assert.assertNotNull(bigInteger85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2 + "'", int87 == 2);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(bigFractionField89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 5 + "'", int90 == 5);
        org.junit.Assert.assertNotNull(bigFraction91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.divide(fraction2);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException4 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction1);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction1.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((-1), (int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction7.multiply(fraction10);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 88529280, (long) (-18));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 88529280L + "'", long2 == 88529280L);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long2 = bigFraction1.longValue();
        java.math.BigDecimal bigDecimal4 = bigFraction1.bigDecimalValue((int) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction1.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = org.apache.commons.math3.fraction.BigFraction.THREE_FIFTHS;
        boolean boolean7 = bigFraction1.equals((java.lang.Object) bigFraction6);
        long long8 = bigFraction1.longValue();
        java.lang.String str9 = bigFraction1.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100" + "'", str9, "100");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        java.math.BigDecimal bigDecimal3 = bigFraction2.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.pow((-1));
        float float6 = bigFraction2.floatValue();
        float float7 = bigFraction2.floatValue();
        java.math.BigInteger bigInteger8 = bigFraction2.getNumerator();
        long long9 = bigFraction2.longValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.25f + "'", float6 == 0.25f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.25f + "'", float7 == 0.25f);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(99L);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.pow(4);
        org.junit.Assert.assertNotNull(bigFraction3);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((long) 1, (long) 1073741824);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1073741824L + "'", long2 == 1073741824L);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.MINUS_ONE;
        long long1 = bigFraction0.longValue();
        long long2 = bigFraction0.longValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction0.subtract((long) 1);
        long long5 = bigFraction4.getNumeratorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger7 = bigFraction6.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction6.subtract((int) ' ');
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction9.abs();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_RETRIEVE_AT_NEGATIVE_INDEX;
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long14 = bigFraction13.longValue();
        java.math.BigInteger bigInteger15 = bigFraction13.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long18 = bigFraction17.longValue();
        java.math.BigInteger bigInteger19 = bigFraction17.getDenominator();
        java.math.BigInteger bigInteger20 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger15, bigInteger19);
        java.math.BigInteger bigInteger22 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger19, 35);
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction23.divide(fraction24);
        int int26 = fraction25.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField28 = fraction27.getField();
        org.apache.commons.math3.fraction.Fraction fraction29 = fractionField28.getZero();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction25.add(fraction29);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException32 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats11, (java.lang.Number) bigInteger19, (java.lang.Number) fraction29, false);
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction10.multiply(bigInteger19);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction4.divide(bigInteger19);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-2L) + "'", long5 == (-2L));
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_RETRIEVE_AT_NEGATIVE_INDEX + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_RETRIEVE_AT_NEGATIVE_INDEX));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fractionField28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction34);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO;
        org.apache.commons.math3.fraction.BigFractionField bigFractionField1 = bigFraction0.getField();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.subtract(32L);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.subtract((long) 99);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFractionField1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.pow(5392957440L);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float7 = bigFraction6.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction5.add(bigFraction6);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction8.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float13 = bigFraction12.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction11.add(bigFraction12);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction14.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction9.add(bigFraction14);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger18 = bigFraction17.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction17.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction9.divide(bigFraction17);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction17.subtract(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction3.multiply(bigFraction17);
        int int24 = bigFraction2.compareTo(bigFraction17);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long27 = bigFraction26.longValue();
        java.math.BigInteger bigInteger28 = bigFraction26.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long31 = bigFraction30.longValue();
        java.math.BigInteger bigInteger32 = bigFraction30.getDenominator();
        java.math.BigInteger bigInteger33 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger28, bigInteger32);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction17.divide(bigInteger33);
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float38 = bigFraction37.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction36.add(bigFraction37);
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = bigFraction36.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long43 = bigFraction42.longValue();
        java.math.BigInteger bigInteger44 = bigFraction42.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long47 = bigFraction46.longValue();
        java.math.BigInteger bigInteger48 = bigFraction46.getDenominator();
        java.math.BigInteger bigInteger49 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger44, bigInteger48);
        org.apache.commons.math3.fraction.BigFraction bigFraction50 = bigFraction36.add(bigInteger48);
        org.apache.commons.math3.fraction.BigFraction bigFraction52 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long53 = bigFraction52.longValue();
        java.math.BigInteger bigInteger54 = bigFraction52.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction56 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long57 = bigFraction56.longValue();
        java.math.BigInteger bigInteger58 = bigFraction56.getDenominator();
        java.math.BigInteger bigInteger59 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger54, bigInteger58);
        java.math.BigInteger bigInteger60 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger48, bigInteger59);
        org.apache.commons.math3.fraction.BigFraction bigFraction61 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger62 = bigFraction61.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction63 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger64 = bigFraction63.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction65 = new org.apache.commons.math3.fraction.BigFraction(bigInteger62, bigInteger64);
        org.apache.commons.math3.fraction.BigFraction bigFraction66 = new org.apache.commons.math3.fraction.BigFraction(bigInteger48, bigInteger64);
        java.math.BigInteger bigInteger68 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger64, 4);
        org.apache.commons.math3.fraction.BigFraction bigFraction69 = bigFraction17.multiply(bigInteger64);
        org.apache.commons.math3.fraction.BigFraction bigFraction71 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction72 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float73 = bigFraction72.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction74 = bigFraction71.add(bigFraction72);
        org.apache.commons.math3.fraction.BigFraction bigFraction76 = bigFraction72.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction78 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long79 = bigFraction78.longValue();
        java.math.BigInteger bigInteger80 = bigFraction78.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction82 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long83 = bigFraction82.longValue();
        java.math.BigInteger bigInteger84 = bigFraction82.getDenominator();
        java.math.BigInteger bigInteger85 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger80, bigInteger84);
        org.apache.commons.math3.fraction.BigFraction bigFraction86 = bigFraction76.multiply(bigInteger80);
        org.apache.commons.math3.fraction.BigFraction bigFraction87 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger88 = bigFraction87.getNumerator();
        java.math.BigInteger bigInteger89 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger80, bigInteger88);
        java.math.BigInteger bigInteger91 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger89, (long) 97);
        org.apache.commons.math3.fraction.BigFraction bigFraction92 = bigFraction17.subtract(bigInteger91);
        org.apache.commons.math3.fraction.BigFraction bigFraction93 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger94 = bigFraction93.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction95 = new org.apache.commons.math3.fraction.BigFraction(bigInteger91, bigInteger94);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.25f + "'", float7 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.25f + "'", float13 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 100L + "'", long31 == 100L);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.25f + "'", float38 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 100L + "'", long43 == 100L);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 100L + "'", long47 == 100L);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertNotNull(bigFraction50);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 100L + "'", long53 == 100L);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 100L + "'", long57 == 100L);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(bigFraction61);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(bigFraction63);
        org.junit.Assert.assertNotNull(bigInteger64);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertNotNull(bigFraction69);
        org.junit.Assert.assertNotNull(bigFraction72);
        org.junit.Assert.assertTrue("'" + float73 + "' != '" + 0.25f + "'", float73 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction74);
        org.junit.Assert.assertNotNull(bigFraction76);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 100L + "'", long79 == 100L);
        org.junit.Assert.assertNotNull(bigInteger80);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 100L + "'", long83 == 100L);
        org.junit.Assert.assertNotNull(bigInteger84);
        org.junit.Assert.assertNotNull(bigInteger85);
        org.junit.Assert.assertNotNull(bigFraction86);
        org.junit.Assert.assertNotNull(bigFraction87);
        org.junit.Assert.assertNotNull(bigInteger88);
        org.junit.Assert.assertNotNull(bigInteger89);
        org.junit.Assert.assertNotNull(bigInteger91);
        org.junit.Assert.assertNotNull(bigFraction92);
        org.junit.Assert.assertNotNull(bigFraction93);
        org.junit.Assert.assertNotNull(bigInteger94);
    }
}

