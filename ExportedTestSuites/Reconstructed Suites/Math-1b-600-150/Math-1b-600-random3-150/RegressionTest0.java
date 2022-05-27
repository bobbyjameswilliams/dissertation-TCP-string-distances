package org.apache.commons.math3.fraction;;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        double double1 = org.apache.commons.math3.util.FastMath.asin(7.105427357600977E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357600977E-15d + "'", double1 == 7.105427357600977E-15d);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction4.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger7 = bigFraction6.getNumerator();
        int int8 = bigFraction5.compareTo(bigFraction6);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction6.reciprocal();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float13 = bigFraction12.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction11.add(bigFraction12);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction11.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long18 = bigFraction17.longValue();
        java.math.BigInteger bigInteger19 = bigFraction17.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long22 = bigFraction21.longValue();
        java.math.BigInteger bigInteger23 = bigFraction21.getDenominator();
        java.math.BigInteger bigInteger24 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger19, bigInteger23);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction11.add(bigInteger23);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger27 = bigFraction26.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction26.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float31 = bigFraction30.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction26.add(bigFraction30);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats33 = org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT;
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger35 = bigFraction34.getNumerator();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats36 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException39 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats40 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats41 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats43 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray44 = new java.lang.Object[] { (-1.0f), localizedFormats43 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException45 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats41, objArray44);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException46 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException39, (org.apache.commons.math3.exception.util.Localizable) localizedFormats40, objArray44);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException47 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats36, objArray44);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException48 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction34, objArray44);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) bigFraction26, (org.apache.commons.math3.exception.util.Localizable) localizedFormats33, objArray44);
        org.apache.commons.math3.fraction.BigFraction bigFraction50 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger51 = bigFraction50.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction53 = bigFraction50.subtract((int) ' ');
        int int54 = bigFraction53.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction56 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction57 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float58 = bigFraction57.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction59 = bigFraction56.add(bigFraction57);
        org.apache.commons.math3.fraction.Fraction fraction60 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField61 = fraction60.getField();
        org.apache.commons.math3.fraction.Fraction fraction62 = fractionField61.getZero();
        org.apache.commons.math3.fraction.Fraction fraction63 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction64 = fraction62.subtract(fraction63);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException66 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigFraction56, (java.lang.Number) fraction63, true);
        org.apache.commons.math3.fraction.BigFraction bigFraction68 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long69 = bigFraction68.longValue();
        java.math.BigInteger bigInteger70 = bigFraction68.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction72 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long73 = bigFraction72.longValue();
        java.math.BigInteger bigInteger74 = bigFraction72.getDenominator();
        java.math.BigInteger bigInteger75 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger70, bigInteger74);
        org.apache.commons.math3.fraction.BigFraction bigFraction76 = bigFraction56.multiply(bigInteger75);
        double double77 = bigFraction76.doubleValue();
        int int78 = bigFraction53.compareTo(bigFraction76);
        java.math.BigInteger bigInteger79 = bigFraction53.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction80 = bigFraction26.divide(bigInteger79);
        java.math.BigInteger bigInteger82 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger79, 0L);
        java.math.BigInteger bigInteger83 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger23, bigInteger79);
        org.apache.commons.math3.fraction.BigFraction bigFraction84 = bigFraction9.subtract(bigInteger79);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.25f + "'", float13 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.25f + "'", float31 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertTrue("'" + localizedFormats33 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT + "'", localizedFormats33.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT));
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertTrue("'" + localizedFormats36 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats36.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats40 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats40.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats41 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats41.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats43 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats43.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(bigFraction50);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(bigFraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-31) + "'", int54 == (-31));
        org.junit.Assert.assertNotNull(bigFraction57);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 0.25f + "'", float58 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fractionField61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 100L + "'", long69 == 100L);
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 100L + "'", long73 == 100L);
        org.junit.Assert.assertNotNull(bigInteger74);
        org.junit.Assert.assertNotNull(bigInteger75);
        org.junit.Assert.assertNotNull(bigFraction76);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(bigInteger79);
        org.junit.Assert.assertNotNull(bigFraction80);
        org.junit.Assert.assertNotNull(bigInteger82);
        org.junit.Assert.assertNotNull(bigInteger83);
        org.junit.Assert.assertNotNull(bigFraction84);
    }

    @Test
    public void test0003() throws Throwable {
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
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(6365139678740040577L, 125994627894135L);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.multiply(0);
        float float4 = fraction3.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = new org.apache.commons.math3.fraction.Fraction(1.0471975511965979d, 0.5d, 28);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.negate();
        org.apache.commons.math3.fraction.FractionField fractionField10 = fraction8.getField();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.divide(fraction12);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException14 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction13);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float18 = bigFraction17.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction16.add(bigFraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField21 = fraction20.getField();
        org.apache.commons.math3.fraction.Fraction fraction22 = fractionField21.getZero();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction22.subtract(fraction23);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException26 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigFraction16, (java.lang.Number) fraction23, true);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction13.divide(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction27.negate();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction8.divide(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 2);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction8.multiply(fraction32);
        int int34 = fraction3.compareTo(fraction33);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.25f + "'", float18 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fractionField21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float4 = bigFraction3.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.add(bigFraction3);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction5.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float10 = bigFraction9.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction8.add(bigFraction9);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction11.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction6.add(bigFraction11);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger15 = bigFraction14.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction14.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction6.divide(bigFraction14);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction14.subtract(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction0.multiply(bigFraction14);
        double double22 = bigFraction20.pow(10.0d);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger24 = bigFraction23.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction23.reduce();
        java.math.BigDecimal bigDecimal26 = bigFraction25.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction25.pow((-1));
        float float29 = bigFraction25.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float33 = bigFraction32.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction31.add(bigFraction32);
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = bigFraction31.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long38 = bigFraction37.longValue();
        java.math.BigInteger bigInteger39 = bigFraction37.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long42 = bigFraction41.longValue();
        java.math.BigInteger bigInteger43 = bigFraction41.getDenominator();
        java.math.BigInteger bigInteger44 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger39, bigInteger43);
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = bigFraction31.add(bigInteger43);
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction25.multiply(bigFraction45);
        int int47 = bigFraction20.compareTo(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.25f + "'", float4 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.25f + "'", float10 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.099511627776E-8d + "'", double22 == 1.099511627776E-8d);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.25f + "'", float29 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.25f + "'", float33 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 100L + "'", long42 == 100L);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction0.add((int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction9.negate();
        org.apache.commons.math3.fraction.Fraction fraction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.subtract(fraction11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 1.07859136E9f);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.negate();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.negate();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(0, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        double double18 = bigFraction0.doubleValue();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.25d + "'", double18 == 0.25d);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float4 = bigFraction3.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.add(bigFraction3);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction5.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float10 = bigFraction9.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction8.add(bigFraction9);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction11.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction6.add(bigFraction11);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger15 = bigFraction14.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction14.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction6.divide(bigFraction14);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction14.subtract(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction0.multiply(bigFraction14);
        double double22 = bigFraction20.pow(10.0d);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField23 = bigFraction20.getField();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.25f + "'", float4 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.25f + "'", float10 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.099511627776E-8d + "'", double22 == 1.099511627776E-8d);
        org.junit.Assert.assertNotNull(bigFractionField23);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow((int) (byte) -35, (long) 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-618402555) + "'", int2 == (-618402555));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49321676688550387d + "'", double1 == 0.49321676688550387d);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0E100d, (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-200d + "'", double2 == 1.0E-200d);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        float float2 = org.apache.commons.math3.util.FastMath.max(2.0f, (float) (-341642466L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(100.0f, (int) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5845633E31f + "'", float2 == 1.5845633E31f);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 4);
        org.apache.commons.math3.fraction.FractionField fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fractionField2.getOne();
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0018() throws Throwable {
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
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger3 = bigFraction2.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction(bigInteger1, bigInteger3);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = bigFraction4.bigDecimalValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigInteger3);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger24 = bigFraction23.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = new org.apache.commons.math3.fraction.BigFraction(10L, 10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction23.multiply(bigFraction27);
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction22.subtract(bigFraction28);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal31 = bigFraction28.bigDecimalValue(30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigFraction29);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = fractionField1.getZero();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.divide(fraction6);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField9 = fraction6.getField();
        org.apache.commons.math3.fraction.FractionField fractionField10 = fraction6.getField();
        int int11 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction3.divide(fraction6);
        int int13 = fraction3.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.divide(fraction15);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException17 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction16);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction3.add(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField20 = fraction19.getField();
        org.apache.commons.math3.fraction.Fraction fraction21 = fractionField20.getZero();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.subtract(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField26 = fraction25.getField();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction24.divide(fraction25);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField28 = fraction25.getField();
        org.apache.commons.math3.fraction.FractionField fractionField29 = fraction25.getField();
        int int30 = fraction25.intValue();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction22.divide(fraction25);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField32 = fraction22.getField();
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction18.divide(fraction22);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fractionField20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fractionField26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fractionField28);
        org.junit.Assert.assertNotNull(fractionField29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fractionField32);
        org.junit.Assert.assertNotNull(fraction33);
    }

    @Test
    public void test0022() throws Throwable {
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

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = fractionField1.getZero();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.divide(fraction6);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField9 = fraction6.getField();
        org.apache.commons.math3.fraction.FractionField fractionField10 = fraction6.getField();
        int int11 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction3.divide(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField15 = fraction14.getField();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.divide(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction16.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField20 = fraction19.getField();
        org.apache.commons.math3.fraction.Fraction fraction21 = fractionField20.getZero();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.subtract(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction18.divide(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction6.divide(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction26.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction24.divide(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction28.negate();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction28.divide((-1072693248));
        int int32 = fraction28.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fractionField15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fractionField20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 144 + "'", int32 == 144);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fractionField7.getOne();
        org.apache.commons.math3.fraction.Fraction fraction9 = fractionField7.getZero();
        java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.fraction.Fraction>> wildcardClass10 = fractionField7.getRuntimeClass();
        java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.fraction.Fraction>> wildcardClass11 = fractionField7.getRuntimeClass();
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
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.6929693744344998d, 1.0000000000000016E-31d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6929693744344998d + "'", double2 == 1.6929693744344998d);
    }

    @Test
    public void test0027() throws Throwable {
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
    public void test0028() throws Throwable {
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
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_EXPANSION_FACTOR;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger2 = bigFraction1.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.subtract((int) ' ');
        int int5 = bigFraction4.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float9 = bigFraction8.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction7.add(bigFraction8);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction10.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float15 = bigFraction14.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction13.add(bigFraction14);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction16.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction11.add(bigFraction16);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException20 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) int5, (java.lang.Number) bigFraction11, true);
        double double21 = bigFraction11.doubleValue();
        java.lang.String str22 = bigFraction11.toString();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction23.divide(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction24.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction27.divide(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction28.multiply(1);
        int int32 = fraction24.compareTo(fraction31);
        boolean boolean33 = bigFraction11.equals((java.lang.Object) fraction24);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException34 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) bigFraction11);
        java.math.BigInteger bigInteger35 = bigFraction11.getNumerator();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_EXPANSION_FACTOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_EXPANSION_FACTOR));
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-31) + "'", int5 == (-31));
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.25f + "'", float9 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.25f + "'", float15 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.25d + "'", double21 == 0.25d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1 / 4" + "'", str22, "1 / 4");
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(bigInteger35);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(0, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger6 = bigFraction5.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction5.negate();
        java.math.BigInteger bigInteger8 = bigFraction7.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction2.subtract(bigInteger8);
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction11 = new org.apache.commons.math3.fraction.BigFraction(bigInteger8, bigInteger10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: denominator");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
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
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.1805916207174113E-14d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-47) + "'", int1 == (-47));
    }

    @Test
    public void test0033() throws Throwable {
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

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float5 = bigFraction4.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.add(bigFraction4);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger8 = bigFraction7.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction7.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction7.add((int) (byte) -1);
        double double12 = bigFraction11.percentageValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction4.multiply(bigFraction11);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction4.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction14.pow(28);
        java.lang.String str17 = bigFraction14.toString();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.25f + "'", float5 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-75.0d) + "'", double12 == (-75.0d));
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1 / 4" + "'", str17, "1 / 4");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException2 = new org.apache.commons.math3.fraction.FractionConversionException(7.896326140304252E13d, 0);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext3 = fractionConversionException2.getContext();
        org.junit.Assert.assertNotNull(exceptionContext3);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_ELEMENT_AT_INDEX;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField5 = fraction4.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.divide(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction1.multiply(fraction6);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField8 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction9 = fractionField8.getOne();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.multiply(4);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_EXPONENT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX;
        java.lang.Object[] objArray15 = null;
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException16 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats14, objArray15);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats17 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats18 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats19 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException22 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats23 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats24 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats26 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray27 = new java.lang.Object[] { (-1.0f), localizedFormats26 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException28 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats24, objArray27);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException29 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException22, (org.apache.commons.math3.exception.util.Localizable) localizedFormats23, objArray27);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException30 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats19, objArray27);
        java.lang.Throwable[] throwableArray31 = mathArithmeticException30.getSuppressed();
        org.apache.commons.math3.exception.ZeroException zeroException32 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats18, (java.lang.Object[]) throwableArray31);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException33 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException16, (org.apache.commons.math3.exception.util.Localizable) localizedFormats17, (java.lang.Object[]) throwableArray31);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException34 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats13, (java.lang.Object[]) throwableArray31);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats35 = org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats36 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX;
        java.lang.Object[] objArray37 = null;
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException38 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats36, objArray37);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats39 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats40 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats41 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException44 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats45 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats46 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats48 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray49 = new java.lang.Object[] { (-1.0f), localizedFormats48 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException50 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats46, objArray49);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException51 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException44, (org.apache.commons.math3.exception.util.Localizable) localizedFormats45, objArray49);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException52 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats41, objArray49);
        java.lang.Throwable[] throwableArray53 = mathArithmeticException52.getSuppressed();
        org.apache.commons.math3.exception.ZeroException zeroException54 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats40, (java.lang.Object[]) throwableArray53);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException55 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException38, (org.apache.commons.math3.exception.util.Localizable) localizedFormats39, (java.lang.Object[]) throwableArray53);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException56 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats35, (java.lang.Object[]) throwableArray53);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException57 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats13, (java.lang.Object[]) throwableArray53);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) fraction11, (org.apache.commons.math3.exception.util.Localizable) localizedFormats12, (java.lang.Object[]) throwableArray53);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException59 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Object[]) throwableArray53);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats60 = org.apache.commons.math3.exception.util.LocalizedFormats.PROPAGATION_DIRECTION_MISMATCH;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats61 = org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats62 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats63 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1;
        org.apache.commons.math3.fraction.BigFraction bigFraction64 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger65 = bigFraction64.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction66 = bigFraction64.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction68 = bigFraction64.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction69 = bigFraction68.reciprocal();
        java.lang.Object[] objArray70 = new java.lang.Object[] { localizedFormats62, localizedFormats63, bigFraction69 };
        org.apache.commons.math3.exception.ZeroException zeroException71 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats61, objArray70);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException72 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathArithmeticException59, (org.apache.commons.math3.exception.util.Localizable) localizedFormats60, objArray70);
        java.lang.Throwable[] throwableArray73 = mathIllegalStateException72.getSuppressed();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_ELEMENT_AT_INDEX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_ELEMENT_AT_INDEX));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_EXPONENT + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_EXPONENT));
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS));
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX));
        org.junit.Assert.assertTrue("'" + localizedFormats17 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT + "'", localizedFormats17.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT));
        org.junit.Assert.assertTrue("'" + localizedFormats18 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS + "'", localizedFormats18.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS));
        org.junit.Assert.assertTrue("'" + localizedFormats19 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats19.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats23 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats23.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats24 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats24.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats26 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats26.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertTrue("'" + localizedFormats35 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS + "'", localizedFormats35.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS));
        org.junit.Assert.assertTrue("'" + localizedFormats36 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX + "'", localizedFormats36.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX));
        org.junit.Assert.assertTrue("'" + localizedFormats39 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT + "'", localizedFormats39.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT));
        org.junit.Assert.assertTrue("'" + localizedFormats40 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS + "'", localizedFormats40.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS));
        org.junit.Assert.assertTrue("'" + localizedFormats41 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats41.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats45 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats45.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats46 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats46.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats48 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats48.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertTrue("'" + localizedFormats60 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PROPAGATION_DIRECTION_MISMATCH + "'", localizedFormats60.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PROPAGATION_DIRECTION_MISMATCH));
        org.junit.Assert.assertTrue("'" + localizedFormats61 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM + "'", localizedFormats61.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM));
        org.junit.Assert.assertTrue("'" + localizedFormats62 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN + "'", localizedFormats62.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN));
        org.junit.Assert.assertTrue("'" + localizedFormats63 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1 + "'", localizedFormats63.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1));
        org.junit.Assert.assertNotNull(bigFraction64);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertNotNull(bigFraction66);
        org.junit.Assert.assertNotNull(bigFraction68);
        org.junit.Assert.assertNotNull(bigFraction69);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertNotNull(throwableArray73);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        double double1 = org.apache.commons.math3.util.FastMath.tan(3.1221078653007956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.019487254508783226d) + "'", double1 == (-0.019487254508783226d));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        double double1 = org.apache.commons.math3.util.FastMath.log10(31.999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5051499783199058d + "'", double1 == 1.5051499783199058d);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 35, (long) 341642467);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 2.0f, 0.5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long50 = bigFraction49.longValue();
        java.math.BigInteger bigInteger51 = bigFraction49.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction53 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long54 = bigFraction53.longValue();
        java.math.BigInteger bigInteger55 = bigFraction53.getDenominator();
        java.math.BigInteger bigInteger56 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger51, bigInteger55);
        java.math.BigInteger bigInteger58 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger55, 35);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException59 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) bigInteger58);
        org.apache.commons.math3.fraction.BigFraction bigFraction60 = new org.apache.commons.math3.fraction.BigFraction(bigInteger58);
        org.apache.commons.math3.fraction.BigFraction bigFraction62 = bigFraction60.subtract((long) 1);
        org.apache.commons.math3.fraction.BigFraction bigFraction63 = bigFraction44.subtract(bigFraction62);
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
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 100L + "'", long50 == 100L);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 100L + "'", long54 == 100L);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertNotNull(bigFraction62);
        org.junit.Assert.assertNotNull(bigFraction63);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        double double22 = fraction8.percentageValue();
        float float23 = fraction8.floatValue();
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-1072693248));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1072693248) + "'", int1 == (-1072693248));
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        short short2 = org.apache.commons.math3.util.MathUtils.copySign((short) (byte) 30, (short) -35);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -30 + "'", short2 == (short) -30);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        java.math.BigDecimal bigDecimal3 = bigFraction2.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.pow((-1));
        float float6 = bigFraction2.floatValue();
        float float7 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = new org.apache.commons.math3.fraction.BigFraction((double) 10.000001f);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction9.subtract((-99));
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction2.divide(bigFraction9);
        byte byte13 = bigFraction12.byteValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.25f + "'", float6 == 0.25f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.25f + "'", float7 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        org.apache.commons.math3.fraction.BigFraction bigFraction51 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction52 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float53 = bigFraction52.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction54 = bigFraction51.add(bigFraction52);
        org.apache.commons.math3.fraction.BigFraction bigFraction55 = bigFraction54.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction57 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction58 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float59 = bigFraction58.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction60 = bigFraction57.add(bigFraction58);
        org.apache.commons.math3.fraction.BigFraction bigFraction61 = bigFraction60.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction62 = bigFraction55.add(bigFraction60);
        org.apache.commons.math3.fraction.BigFraction bigFraction63 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger64 = bigFraction63.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction65 = bigFraction63.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction66 = bigFraction55.divide(bigFraction63);
        java.math.BigInteger bigInteger67 = bigFraction55.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction68 = bigFraction7.multiply(bigInteger67);
        org.apache.commons.math3.fraction.BigFraction bigFraction69 = new org.apache.commons.math3.fraction.BigFraction(bigInteger67);
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
        org.junit.Assert.assertNotNull(bigFraction52);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 0.25f + "'", float53 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction54);
        org.junit.Assert.assertNotNull(bigFraction55);
        org.junit.Assert.assertNotNull(bigFraction58);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.25f + "'", float59 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction60);
        org.junit.Assert.assertNotNull(bigFraction61);
        org.junit.Assert.assertNotNull(bigFraction62);
        org.junit.Assert.assertNotNull(bigFraction63);
        org.junit.Assert.assertNotNull(bigInteger64);
        org.junit.Assert.assertNotNull(bigFraction65);
        org.junit.Assert.assertNotNull(bigFraction66);
        org.junit.Assert.assertNotNull(bigInteger67);
        org.junit.Assert.assertNotNull(bigFraction68);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 1, (-1072693248));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1072693248) + "'", int2 == (-1072693248));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_ROOT_OF_UNITY_INDEX;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUPPORTED_IN_DIMENSION_N;
        java.lang.String str2 = localizedFormats1.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats3 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_WEIGHT;
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger5 = bigFraction4.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction4.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float9 = bigFraction8.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction4.add(bigFraction8);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT;
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger13 = bigFraction12.getNumerator();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException17 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats18 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats19 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats21 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray22 = new java.lang.Object[] { (-1.0f), localizedFormats21 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException23 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats19, objArray22);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException24 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException17, (org.apache.commons.math3.exception.util.Localizable) localizedFormats18, objArray22);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException25 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats14, objArray22);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException26 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction12, objArray22);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) bigFraction4, (org.apache.commons.math3.exception.util.Localizable) localizedFormats11, objArray22);
        org.apache.commons.math3.exception.ConvergenceException convergenceException28 = new org.apache.commons.math3.exception.ConvergenceException((org.apache.commons.math3.exception.util.Localizable) localizedFormats3, objArray22);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats29 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats30 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException33 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats34 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats35 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats37 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray38 = new java.lang.Object[] { (-1.0f), localizedFormats37 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException39 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats35, objArray38);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException40 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException33, (org.apache.commons.math3.exception.util.Localizable) localizedFormats34, objArray38);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException41 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats30, objArray38);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException42 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats29, objArray38);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats43 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED;
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float47 = bigFraction46.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction48 = bigFraction45.add(bigFraction46);
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = bigFraction48.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction50 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger51 = bigFraction50.getNumerator();
        int int52 = bigFraction49.compareTo(bigFraction50);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField53 = bigFraction49.getField();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats54 = org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats55 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats56 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1;
        org.apache.commons.math3.fraction.BigFraction bigFraction57 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger58 = bigFraction57.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction59 = bigFraction57.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction61 = bigFraction57.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction62 = bigFraction61.reciprocal();
        java.lang.Object[] objArray63 = new java.lang.Object[] { localizedFormats55, localizedFormats56, bigFraction62 };
        org.apache.commons.math3.exception.ZeroException zeroException64 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats54, objArray63);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException65 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats43, (java.lang.Number) bigFraction49, objArray63);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException66 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats29, objArray63);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException67 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats3, objArray63);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException68 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, objArray63);
        org.apache.commons.math3.exception.ZeroException zeroException69 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray63);
        java.lang.Number number70 = zeroException69.getArgument();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_ROOT_OF_UNITY_INDEX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_ROOT_OF_UNITY_INDEX));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUPPORTED_IN_DIMENSION_N + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUPPORTED_IN_DIMENSION_N));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "method not supported in dimension {0}" + "'", str2, "method not supported in dimension {0}");
        org.junit.Assert.assertTrue("'" + localizedFormats3 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_WEIGHT + "'", localizedFormats3.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_WEIGHT));
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.25f + "'", float9 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT));
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats18 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats18.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats19 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats19.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats21 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats21.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertTrue("'" + localizedFormats29 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR + "'", localizedFormats29.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats30 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats30.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats34 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats34.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats35 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats35.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats37 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats37.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertTrue("'" + localizedFormats43 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED + "'", localizedFormats43.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED));
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.25f + "'", float47 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction48);
        org.junit.Assert.assertNotNull(bigFraction49);
        org.junit.Assert.assertNotNull(bigFraction50);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(bigFractionField53);
        org.junit.Assert.assertTrue("'" + localizedFormats54 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM + "'", localizedFormats54.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM));
        org.junit.Assert.assertTrue("'" + localizedFormats55 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN + "'", localizedFormats55.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN));
        org.junit.Assert.assertTrue("'" + localizedFormats56 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1 + "'", localizedFormats56.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1));
        org.junit.Assert.assertNotNull(bigFraction57);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertNotNull(bigFraction59);
        org.junit.Assert.assertNotNull(bigFraction61);
        org.junit.Assert.assertNotNull(bigFraction62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertEquals("'" + number70 + "' != '" + 0 + "'", number70, 0);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, (-1074790400));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.DIFFERENT_ROWS_LENGTHS;
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
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException29 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, (java.lang.Object[]) throwableArray25);
        org.apache.commons.math3.exception.ZeroException zeroException30 = new org.apache.commons.math3.exception.ZeroException(localizable0, (java.lang.Object[]) throwableArray25);
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIFFERENT_ROWS_LENGTHS + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIFFERENT_ROWS_LENGTHS));
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
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        java.math.BigDecimal bigDecimal3 = bigFraction2.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.pow((-1));
        float float6 = bigFraction2.floatValue();
        float float7 = bigFraction2.floatValue();
        int int8 = bigFraction2.intValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.25f + "'", float6 == 0.25f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.25f + "'", float7 == 0.25f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException3 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0f), localizedFormats7 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException9 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats5, objArray8);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException10 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException3, (org.apache.commons.math3.exception.util.Localizable) localizedFormats4, objArray8);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException11 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray8);
        java.lang.Throwable[] throwableArray12 = mathArithmeticException11.getSuppressed();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext13 = mathArithmeticException11.getContext();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext14 = mathArithmeticException11.getContext();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats7.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(exceptionContext13);
        org.junit.Assert.assertNotNull(exceptionContext14);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.abs();
        float float3 = fraction1.floatValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0055() throws Throwable {
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
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_SELF_ADJOINT_OPERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.DENOMINATOR_FORMAT;
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
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException28 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, objArray21);
        org.apache.commons.math3.exception.ZeroException zeroException29 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray21);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats30 = org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_LENGTH_MISMATCH;
        org.apache.commons.math3.exception.util.Localizable localizable31 = null;
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger33 = bigFraction32.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction32.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = bigFraction32.add((int) (byte) -1);
        java.math.BigInteger bigInteger37 = bigFraction32.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction32.divide(100);
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = bigFraction39.subtract((-1072693248));
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats42 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats43 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION;
        org.apache.commons.math3.fraction.Fraction fraction44 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction45 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction44.divide(fraction45);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException47 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats43, (java.lang.Number) fraction44);
        java.lang.Throwable[] throwableArray48 = notPositiveException47.getSuppressed();
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException49 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats42, (java.lang.Object[]) throwableArray48);
        java.lang.Throwable[] throwableArray50 = mathIllegalStateException49.getSuppressed();
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException51 = new org.apache.commons.math3.exception.NotFiniteNumberException(localizable31, (java.lang.Number) (-1072693248), (java.lang.Object[]) throwableArray50);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException52 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats30, (java.lang.Object[]) throwableArray50);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException53 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Object[]) throwableArray50);
        java.util.Locale locale54 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = localizedFormats0.getLocalizedString(locale54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_SELF_ADJOINT_OPERATOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_SELF_ADJOINT_OPERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DENOMINATOR_FORMAT + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DENOMINATOR_FORMAT));
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
        org.junit.Assert.assertTrue("'" + localizedFormats30 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_LENGTH_MISMATCH + "'", localizedFormats30.equals(org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_LENGTH_MISMATCH));
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertTrue("'" + localizedFormats42 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats42.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertTrue("'" + localizedFormats43 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION + "'", localizedFormats43.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION));
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray50);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-57.29577951308232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7336545584598283d + "'", double1 == 0.7336545584598283d);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction4.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger7 = bigFraction6.getNumerator();
        int int8 = bigFraction5.compareTo(bigFraction6);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction6.reciprocal();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction6.reduce();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction10);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float5 = bigFraction4.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.add(bigFraction4);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger8 = bigFraction7.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction7.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction7.add((int) (byte) -1);
        double double12 = bigFraction11.percentageValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction4.multiply(bigFraction11);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT;
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long17 = bigFraction16.longValue();
        java.math.BigDecimal bigDecimal19 = bigFraction16.bigDecimalValue((int) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction16.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = org.apache.commons.math3.fraction.BigFraction.THREE_FIFTHS;
        boolean boolean22 = bigFraction16.equals((java.lang.Object) bigFraction21);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats23 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats24 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException27 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats28 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats29 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats31 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray32 = new java.lang.Object[] { (-1.0f), localizedFormats31 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException33 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats29, objArray32);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException34 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException27, (org.apache.commons.math3.exception.util.Localizable) localizedFormats28, objArray32);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException35 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats24, objArray32);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException36 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats23, objArray32);
        org.apache.commons.math3.exception.util.Localizable localizable37 = null;
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger39 = bigFraction38.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = bigFraction38.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float43 = bigFraction42.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = bigFraction38.add(bigFraction42);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats45 = org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT;
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger47 = bigFraction46.getNumerator();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats48 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException51 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats52 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats53 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats55 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray56 = new java.lang.Object[] { (-1.0f), localizedFormats55 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException57 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats53, objArray56);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException58 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException51, (org.apache.commons.math3.exception.util.Localizable) localizedFormats52, objArray56);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException59 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats48, objArray56);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException60 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction46, objArray56);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) bigFraction38, (org.apache.commons.math3.exception.util.Localizable) localizedFormats45, objArray56);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException62 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalArgumentException36, localizable37, objArray56);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException63 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats14, (java.lang.Number) bigFraction21, objArray56);
        org.apache.commons.math3.fraction.BigFraction bigFraction66 = new org.apache.commons.math3.fraction.BigFraction((long) (byte) 1, (long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction68 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction69 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float70 = bigFraction69.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction71 = bigFraction68.add(bigFraction69);
        org.apache.commons.math3.fraction.BigFraction bigFraction73 = bigFraction69.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction75 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long76 = bigFraction75.longValue();
        java.math.BigInteger bigInteger77 = bigFraction75.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction79 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long80 = bigFraction79.longValue();
        java.math.BigInteger bigInteger81 = bigFraction79.getDenominator();
        java.math.BigInteger bigInteger82 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger77, bigInteger81);
        org.apache.commons.math3.fraction.BigFraction bigFraction83 = bigFraction73.multiply(bigInteger77);
        java.math.BigInteger bigInteger85 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger77, (long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction86 = bigFraction66.pow(bigInteger77);
        org.apache.commons.math3.fraction.BigFraction bigFraction87 = bigFraction21.subtract(bigInteger77);
        org.apache.commons.math3.fraction.BigFraction bigFraction88 = bigFraction13.pow(bigInteger77);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.25f + "'", float5 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-75.0d) + "'", double12 == (-75.0d));
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + localizedFormats23 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR + "'", localizedFormats23.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats24 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats24.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats28 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats28.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats29 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats29.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats31 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats31.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.25f + "'", float43 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertTrue("'" + localizedFormats45 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT + "'", localizedFormats45.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT));
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertTrue("'" + localizedFormats48 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats48.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats52 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats52.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats53 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats53.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats55 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats55.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(bigFraction69);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 0.25f + "'", float70 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction71);
        org.junit.Assert.assertNotNull(bigFraction73);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 100L + "'", long76 == 100L);
        org.junit.Assert.assertNotNull(bigInteger77);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 100L + "'", long80 == 100L);
        org.junit.Assert.assertNotNull(bigInteger81);
        org.junit.Assert.assertNotNull(bigInteger82);
        org.junit.Assert.assertNotNull(bigFraction83);
        org.junit.Assert.assertNotNull(bigInteger85);
        org.junit.Assert.assertNotNull(bigFraction86);
        org.junit.Assert.assertNotNull(bigFraction87);
        org.junit.Assert.assertNotNull(bigFraction88);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((int) (short) 1, 1072693248);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(0, (-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.MINUS_ONE;
        long long1 = bigFraction0.longValue();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESSES;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats3 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException7 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats9 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0f), localizedFormats11 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException13 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats9, objArray12);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException14 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException7, (org.apache.commons.math3.exception.util.Localizable) localizedFormats8, objArray12);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException15 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats4, objArray12);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException16 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats3, objArray12);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats17 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED;
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float21 = bigFraction20.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction19.add(bigFraction20);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction22.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger25 = bigFraction24.getNumerator();
        int int26 = bigFraction23.compareTo(bigFraction24);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField27 = bigFraction23.getField();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats28 = org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats29 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats30 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1;
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger32 = bigFraction31.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction31.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = bigFraction31.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = bigFraction35.reciprocal();
        java.lang.Object[] objArray37 = new java.lang.Object[] { localizedFormats29, localizedFormats30, bigFraction36 };
        org.apache.commons.math3.exception.ZeroException zeroException38 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats28, objArray37);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException39 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats17, (java.lang.Number) bigFraction23, objArray37);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException40 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats3, objArray37);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) bigFraction0, (org.apache.commons.math3.exception.util.Localizable) localizedFormats2, objArray37);
        java.math.BigDecimal bigDecimal42 = bigFraction0.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = bigFraction0.add(0);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESSES + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESSES));
        org.junit.Assert.assertTrue("'" + localizedFormats3 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR + "'", localizedFormats3.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats9 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats9.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertTrue("'" + localizedFormats17 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED + "'", localizedFormats17.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED));
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.25f + "'", float21 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(bigFractionField27);
        org.junit.Assert.assertTrue("'" + localizedFormats28 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM + "'", localizedFormats28.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM));
        org.junit.Assert.assertTrue("'" + localizedFormats29 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN + "'", localizedFormats29.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN));
        org.junit.Assert.assertTrue("'" + localizedFormats30 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1 + "'", localizedFormats30.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1));
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigFraction44);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.4339872044851463d, 71);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1007932393182316E38d + "'", double2 == 1.1007932393182316E38d);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient(97, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger2 = bigFraction1.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.negate();
        java.math.BigInteger bigInteger4 = bigFraction3.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction0.multiply(bigInteger4);
        java.math.BigInteger bigInteger6 = bigFraction0.getNumerator();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigInteger6);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(140.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 140.0d + "'", double1 == 140.0d);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        double double1 = org.apache.commons.math3.util.FastMath.acos(4.2626798770413155d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, 1960992769);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1960992769 + "'", int2 == 1960992769);
    }

    @Test
    public void test0069() throws Throwable {
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
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (-1074790400L), 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -1,074,790,400 to fraction (1,074,790,401/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
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
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats22 = org.apache.commons.math3.exception.util.LocalizedFormats.DIGEST_NOT_INITIALIZED;
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger24 = bigFraction23.getNumerator();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats25 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException28 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats29 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats30 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats32 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray33 = new java.lang.Object[] { (-1.0f), localizedFormats32 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException34 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats30, objArray33);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException35 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException28, (org.apache.commons.math3.exception.util.Localizable) localizedFormats29, objArray33);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException36 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats25, objArray33);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException37 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction23, objArray33);
        org.apache.commons.math3.exception.ConvergenceException convergenceException38 = new org.apache.commons.math3.exception.ConvergenceException((org.apache.commons.math3.exception.util.Localizable) localizedFormats22, objArray33);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException39 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats9, objArray33);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats40 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_OPTIMUM_COMPUTED_YET;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats41 = org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_64_BITS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats42 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException44 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats42, (java.lang.Number) 10);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext45 = notPositiveException44.getContext();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats46 = org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_ROW_INDEX_ARRAY;
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
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException62 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) notPositiveException44, (org.apache.commons.math3.exception.util.Localizable) localizedFormats46, objArray57);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException63 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats41, objArray57);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException64 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathArithmeticException39, (org.apache.commons.math3.exception.util.Localizable) localizedFormats40, objArray57);
        java.lang.Number number65 = null;
        org.apache.commons.math3.fraction.BigFraction bigFraction67 = new org.apache.commons.math3.fraction.BigFraction((long) 5);
        org.apache.commons.math3.fraction.BigFraction bigFraction69 = bigFraction67.divide((int) '#');
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException71 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats40, number65, (java.lang.Number) bigFraction69, false);
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
        org.junit.Assert.assertTrue("'" + localizedFormats22 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIGEST_NOT_INITIALIZED + "'", localizedFormats22.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIGEST_NOT_INITIALIZED));
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertTrue("'" + localizedFormats25 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats25.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats29 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats29.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats30 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats30.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats32 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats32.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertTrue("'" + localizedFormats40 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_OPTIMUM_COMPUTED_YET + "'", localizedFormats40.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_OPTIMUM_COMPUTED_YET));
        org.junit.Assert.assertTrue("'" + localizedFormats41 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_64_BITS + "'", localizedFormats41.equals(org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_64_BITS));
        org.junit.Assert.assertTrue("'" + localizedFormats42 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA + "'", localizedFormats42.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA));
        org.junit.Assert.assertNotNull(exceptionContext45);
        org.junit.Assert.assertTrue("'" + localizedFormats46 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_ROW_INDEX_ARRAY + "'", localizedFormats46.equals(org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_ROW_INDEX_ARRAY));
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertTrue("'" + localizedFormats49 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats49.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats53 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats53.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats54 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats54.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats56 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats56.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(bigFraction69);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(140.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.192494101851104d + "'", double1 == 5.192494101851104d);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = fractionField1.getZero();
        java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.fraction.Fraction>> wildcardClass3 = fractionField1.getRuntimeClass();
        java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.fraction.Fraction>> wildcardClass4 = fractionField1.getRuntimeClass();
        org.apache.commons.math3.fraction.Fraction fraction5 = fractionField1.getZero();
        org.apache.commons.math3.fraction.Fraction fraction6 = fractionField1.getZero();
        org.apache.commons.math3.fraction.Fraction fraction7 = fractionField1.getZero();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((long) 1104155264, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1104155264L + "'", long2 == 1104155264L);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(31.026580882699598d, 635.856379863918d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.026580882699598d + "'", double2 == 31.026580882699598d);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float1 = bigFraction0.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField3 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField6 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.divide(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction2.multiply(fraction7);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField9 = fraction7.getField();
        org.apache.commons.math3.fraction.Fraction fraction10 = fractionField9.getOne();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT;
        java.lang.String str12 = localizedFormats11.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats15 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION;
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction16.divide(fraction17);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException19 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats15, (java.lang.Number) fraction16);
        java.lang.Throwable[] throwableArray20 = notPositiveException19.getSuppressed();
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException21 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats14, (java.lang.Object[]) throwableArray20);
        java.lang.Object[] objArray22 = new java.lang.Object[] { localizedFormats13, localizedFormats14 };
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) fraction10, (org.apache.commons.math3.exception.util.Localizable) localizedFormats11, objArray22);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException24 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction0, objArray22);
        double double25 = bigFraction0.doubleValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.25f + "'", float1 == 0.25f);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Loess expects at least 1 point" + "'", str12, "Loess expects at least 1 point");
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertTrue("'" + localizedFormats15 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION + "'", localizedFormats15.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR, UNABLE_TO_ORTHOGONOLIZE_MATRIX]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR, UNABLE_TO_ORTHOGONOLIZE_MATRIX]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.25d + "'", double25 == 0.25d);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR;
        java.lang.String str1 = localizedFormats0.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats3 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX;
        java.lang.Object[] objArray4 = null;
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException5 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats3, objArray4);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats6 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException11 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats15 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0f), localizedFormats15 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException17 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats13, objArray16);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException18 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException11, (org.apache.commons.math3.exception.util.Localizable) localizedFormats12, objArray16);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException19 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats8, objArray16);
        java.lang.Throwable[] throwableArray20 = mathArithmeticException19.getSuppressed();
        org.apache.commons.math3.exception.ZeroException zeroException21 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats7, (java.lang.Object[]) throwableArray20);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException22 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException5, (org.apache.commons.math3.exception.util.Localizable) localizedFormats6, (java.lang.Object[]) throwableArray20);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException23 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats2, (java.lang.Object[]) throwableArray20);
        org.apache.commons.math3.exception.ZeroException zeroException24 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Object[]) throwableArray20);
        java.lang.Number number25 = zeroException24.getArgument();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cannot format a {0} instance as a 3D vector" + "'", str1, "cannot format a {0} instance as a 3D vector");
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS));
        org.junit.Assert.assertTrue("'" + localizedFormats3 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX + "'", localizedFormats3.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX));
        org.junit.Assert.assertTrue("'" + localizedFormats6 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT + "'", localizedFormats6.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT));
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS + "'", localizedFormats7.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS));
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats15 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats15.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 0 + "'", number25, 0);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger26 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger14, (long) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: exponent (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = fractionField1.getZero();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.divide(fraction6);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField9 = fraction6.getField();
        org.apache.commons.math3.fraction.FractionField fractionField10 = fraction6.getField();
        int int11 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction3.divide(fraction6);
        int int13 = fraction3.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.divide(fraction15);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException17 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction16);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction3.add(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.multiply(0);
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(1, 1078591488);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction20.multiply(fraction23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction25 = fraction24.reciprocal();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 1/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DEGREES_OF_FREEDOM;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DEGREES_OF_FREEDOM + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DEGREES_OF_FREEDOM));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
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
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction2.add(bigInteger13);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction20.add(bigFraction21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
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
        org.junit.Assert.assertNotNull(bigFraction20);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(475956593, 52360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 476008953 + "'", int2 == 476008953);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = fractionField1.getZero();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.divide(fraction4);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException6 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0);
        int int9 = fraction5.compareTo(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.divide(fraction11);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException13 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0);
        int int16 = fraction12.compareTo(fraction15);
        int int17 = fraction5.compareTo(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField19 = fraction18.getField();
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField22 = fraction21.getField();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.divide(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction18.multiply(fraction23);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField25 = fraction24.getField();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction24.reciprocal();
        int int27 = fraction15.compareTo(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField29 = fraction28.getField();
        org.apache.commons.math3.fraction.Fraction fraction30 = fractionField29.getZero();
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction30.subtract(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField35 = fraction34.getField();
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction33.divide(fraction34);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField37 = fraction34.getField();
        org.apache.commons.math3.fraction.FractionField fractionField38 = fraction34.getField();
        int int39 = fraction34.intValue();
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction31.divide(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction15.subtract(fraction40);
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction2.subtract(fraction40);
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction44 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField45 = fraction44.getField();
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction43.divide(fraction44);
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction46.add((int) '#');
        double double49 = fraction48.doubleValue();
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException51 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) fraction42, (java.lang.Number) double49, true);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fractionField19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fractionField22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fractionField25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fractionField29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fractionField35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fractionField37);
        org.junit.Assert.assertNotNull(fractionField38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fractionField45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 36.0d + "'", double49 == 36.0d);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        boolean boolean1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(21952L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        int int3 = fraction2.getNumerator();
        double double4 = fraction2.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.multiply(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.multiply(fraction8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(127L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 126L + "'", long2 == 126L);
    }

    @Test
    public void test0088() throws Throwable {
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
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUPPORTED_IN_DIMENSION_N;
        java.lang.String str1 = localizedFormats0.getSourceString();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float5 = bigFraction4.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.add(bigFraction4);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction6.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float11 = bigFraction10.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction9.add(bigFraction10);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction12.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction7.add(bigFraction12);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger16 = bigFraction15.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction15.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction7.divide(bigFraction15);
        java.math.BigInteger bigInteger19 = bigFraction7.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger22 = bigFraction21.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction21.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction21.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction20.subtract(bigFraction25);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float30 = bigFraction29.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction28.add(bigFraction29);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction31.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger34 = bigFraction33.getNumerator();
        int int35 = bigFraction32.compareTo(bigFraction33);
        int int36 = bigFraction33.getNumeratorAsInt();
        int int37 = bigFraction20.compareTo(bigFraction33);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField38 = bigFraction33.getField();
        int int39 = bigFraction33.getDenominatorAsInt();
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = bigFraction7.add(bigFraction33);
        java.lang.String str41 = bigFraction7.toString();
        org.apache.commons.math3.fraction.Fraction fraction45 = new org.apache.commons.math3.fraction.Fraction((double) 'a', (double) (byte) 1, (int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction45.reciprocal();
        long long47 = fraction45.longValue();
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException49 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) bigFraction7, (java.lang.Number) long47, false);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUPPORTED_IN_DIMENSION_N + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUPPORTED_IN_DIMENSION_N));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "method not supported in dimension {0}" + "'", str1, "method not supported in dimension {0}");
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.25f + "'", float5 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.25f + "'", float11 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.25f + "'", float30 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(bigFractionField38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1 / 4" + "'", str41, "1 / 4");
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 97L + "'", long47 == 97L);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        double double1 = org.apache.commons.math3.util.FastMath.acos(9800.052244771154d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_64_BITS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, (java.lang.Number) 10);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext4 = notPositiveException3.getContext();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_ROW_INDEX_ARRAY;
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger7 = bigFraction6.getNumerator();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException11 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats15 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0f), localizedFormats15 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException17 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats13, objArray16);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException18 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException11, (org.apache.commons.math3.exception.util.Localizable) localizedFormats12, objArray16);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException19 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats8, objArray16);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException20 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction6, objArray16);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException21 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) notPositiveException3, (org.apache.commons.math3.exception.util.Localizable) localizedFormats5, objArray16);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException22 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray16);
        java.util.Locale locale23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = localizedFormats0.getLocalizedString(locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_64_BITS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_64_BITS));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA));
        org.junit.Assert.assertNotNull(exceptionContext4);
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_ROW_INDEX_ARRAY + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_ROW_INDEX_ARRAY));
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats15 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats15.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction0.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.multiply(10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction0.pow((long) 32);
        long long9 = bigFraction8.getNumeratorAsLong();
        long long10 = bigFraction8.getDenominatorAsLong();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(10L, 10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger4 = bigFraction3.getNumerator();
        double double6 = bigFraction3.pow((double) (byte) 10);
        int int7 = bigFraction2.compareTo(bigFraction3);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction2.subtract((int) (short) -1);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.048576E-4d + "'", double6 == 1.048576E-4d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(bigFraction9);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.718281828459045d, (-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9233097485725157d + "'", double2 == 1.9233097485725157d);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction19.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction20.reciprocal();
        long long22 = bigFraction21.getDenominatorAsLong();
        float float23 = bigFraction21.floatValue();
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
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + Float.POSITIVE_INFINITY + "'", float23 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction22.multiply(35);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction22.abs();
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
        java.math.BigInteger bigInteger44 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger36, (long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = bigFraction25.divide(bigInteger44);
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = new org.apache.commons.math3.fraction.BigFraction(bigInteger20, bigInteger44);
        java.math.BigInteger bigInteger48 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger44, 125994627894135L);
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
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction24);
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
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertNotNull(bigInteger48);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.math3.exception.util.Localizable localizable1 = null;
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
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) 1.5845632502852868E31d, localizable1, objArray12);
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
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1007.376777049702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.5410520681182421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.75d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7499999999999999d) + "'", double1 == (-0.7499999999999999d));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide(fraction1);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction1.getField();
        org.apache.commons.math3.fraction.FractionField fractionField5 = fraction1.getField();
        byte byte6 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction17.abs();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction22.multiply(0);
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
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7853981633974483d) + "'", double1 == (-0.7853981633974483d));
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.lang.Number number0 = null;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException1 = new org.apache.commons.math3.exception.NotPositiveException(number0);
        java.lang.Number number2 = notPositiveException1.getMin();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext3 = notPositiveException1.getContext();
        org.junit.Assert.assertEquals("'" + number2 + "' != '" + 0 + "'", number2, 0);
        org.junit.Assert.assertNotNull(exceptionContext3);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.MINUS_ONE;
        long long1 = bigFraction0.longValue();
        long long2 = bigFraction0.longValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction0.subtract((long) 1);
        long long5 = bigFraction4.getDenominatorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction4.abs();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(bigFraction6);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        short short2 = bigFraction1.shortValue();
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (short) 71);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2626798770413155d + "'", double1 == 4.2626798770413155d);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS;
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
        org.apache.commons.math3.exception.ZeroException zeroException23 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Object[]) throwableArray19);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats24 = org.apache.commons.math3.exception.util.LocalizedFormats.FRACTION_CONVERSION_OVERFLOW;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats25 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_BRIGHTNESS_EXPONENT;
        java.lang.String str26 = localizedFormats25.getSourceString();
        org.apache.commons.math3.fraction.Fraction fraction28 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField30 = fraction29.getField();
        org.apache.commons.math3.fraction.Fraction fraction31 = fractionField30.getZero();
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction31.subtract(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField36 = fraction35.getField();
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction34.divide(fraction35);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField38 = fraction35.getField();
        org.apache.commons.math3.fraction.FractionField fractionField39 = fraction35.getField();
        int int40 = fraction35.intValue();
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction32.divide(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction42 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField44 = fraction43.getField();
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction42.divide(fraction43);
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction45.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction48 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField49 = fraction48.getField();
        org.apache.commons.math3.fraction.Fraction fraction50 = fractionField49.getZero();
        org.apache.commons.math3.fraction.Fraction fraction51 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction50.subtract(fraction51);
        org.apache.commons.math3.fraction.Fraction fraction53 = fraction47.divide(fraction51);
        org.apache.commons.math3.fraction.Fraction fraction54 = fraction35.divide(fraction53);
        org.apache.commons.math3.fraction.Fraction fraction55 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction56 = fraction55.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction57 = fraction53.divide(fraction56);
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction28.multiply(fraction56);
        org.apache.commons.math3.fraction.Fraction fraction60 = new org.apache.commons.math3.fraction.Fraction(45);
        org.apache.commons.math3.fraction.Fraction fraction61 = fraction58.multiply(fraction60);
        org.apache.commons.math3.fraction.Fraction fraction62 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction63 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction64 = fraction62.divide(fraction63);
        int int65 = fraction64.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction66 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField67 = fraction66.getField();
        org.apache.commons.math3.fraction.Fraction fraction68 = fractionField67.getZero();
        org.apache.commons.math3.fraction.Fraction fraction69 = fraction64.add(fraction68);
        int int70 = fraction64.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction71 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction73 = bigFraction71.multiply(35);
        java.lang.Object[] objArray74 = new java.lang.Object[] { localizedFormats25, fraction61, int70, bigFraction71 };
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) localizedFormats0, (org.apache.commons.math3.exception.util.Localizable) localizedFormats24, objArray74);
        org.apache.commons.math3.fraction.BigFraction bigFraction76 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction78 = bigFraction76.pow(5392957440L);
        org.apache.commons.math3.fraction.BigFraction bigFraction80 = bigFraction76.multiply(5392957440L);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException81 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats24, (java.lang.Number) 5392957440L);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS));
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
        org.junit.Assert.assertTrue("'" + localizedFormats24 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.FRACTION_CONVERSION_OVERFLOW + "'", localizedFormats24.equals(org.apache.commons.math3.exception.util.LocalizedFormats.FRACTION_CONVERSION_OVERFLOW));
        org.junit.Assert.assertTrue("'" + localizedFormats25 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_BRIGHTNESS_EXPONENT + "'", localizedFormats25.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_BRIGHTNESS_EXPONENT));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "brightness exponent should be positive or null, but got {0}" + "'", str26, "brightness exponent should be positive or null, but got {0}");
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fractionField30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fractionField36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fractionField38);
        org.junit.Assert.assertNotNull(fractionField39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fractionField44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fractionField49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fractionField67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(bigFraction71);
        org.junit.Assert.assertNotNull(bigFraction73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[NEGATIVE_BRIGHTNESS_EXPONENT, 0, 1, 2 / 5]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[NEGATIVE_BRIGHTNESS_EXPONENT, 0, 1, 2 / 5]");
        org.junit.Assert.assertNotNull(bigFraction76);
        org.junit.Assert.assertNotNull(bigFraction78);
        org.junit.Assert.assertNotNull(bigFraction80);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = fractionField1.getZero();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.divide(fraction6);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField9 = fraction6.getField();
        org.apache.commons.math3.fraction.FractionField fractionField10 = fraction6.getField();
        int int11 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction3.divide(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField15 = fraction14.getField();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.divide(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction16.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField20 = fraction19.getField();
        org.apache.commons.math3.fraction.Fraction fraction21 = fractionField20.getZero();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.subtract(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction18.divide(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction6.divide(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction26.divide(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction27.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction30.divide(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction31.reciprocal();
        int int34 = fraction27.compareTo(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction35.divide(fraction36);
        int int38 = fraction33.compareTo(fraction37);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction24.divide(fraction33);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField40 = fraction39.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fractionField15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fractionField20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fractionField40);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 32, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(4.6566128730773926E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0113() throws Throwable {
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
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 1395, 1.5107651208185948d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5697133414686018d + "'", double2 == 1.5697133414686018d);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_ROW_INDEX_ARRAY;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.divide(fraction2);
        double double4 = fraction2.doubleValue();
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException7 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) double4, (java.lang.Number) (-1.0d), true);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext8 = numberIsTooSmallException7.getContext();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats9 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats10 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUPPORTED_IN_DIMENSION_N;
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger12 = bigFraction11.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction11.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction11.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction15.reciprocal();
        org.apache.commons.math3.exception.util.Localizable localizable17 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException21 = new org.apache.commons.math3.exception.NumberIsTooSmallException(localizable17, (java.lang.Number) 1.0f, (java.lang.Number) 10, false);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats22 = org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_LENGTH_MISMATCH;
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField26 = fraction25.getField();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction24.divide(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction27.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField31 = fraction30.getField();
        org.apache.commons.math3.fraction.Fraction fraction32 = fractionField31.getZero();
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction32.subtract(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction29.divide(fraction33);
        org.apache.commons.math3.fraction.FractionField fractionField36 = fraction33.getField();
        java.lang.Object[] objArray37 = new java.lang.Object[] { localizedFormats10, bigFraction15, false, localizedFormats22, 10.0f, fraction33 };
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException38 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) numberIsTooSmallException7, (org.apache.commons.math3.exception.util.Localizable) localizedFormats9, objArray37);
        java.lang.Throwable[] throwableArray39 = mathIllegalStateException38.getSuppressed();
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) throwableArray39);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException41 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Object[]) throwableArray39);
        org.apache.commons.math3.fraction.Fraction fraction42 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField44 = fraction43.getField();
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction42.divide(fraction43);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField46 = fraction43.getField();
        org.apache.commons.math3.fraction.FractionField fractionField47 = fraction43.getField();
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction43.add(28);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException52 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction43, (java.lang.Number) 1807551715, true);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_ROW_INDEX_ARRAY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_ROW_INDEX_ARRAY));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertNotNull(exceptionContext8);
        org.junit.Assert.assertTrue("'" + localizedFormats9 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats9.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + localizedFormats10 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUPPORTED_IN_DIMENSION_N + "'", localizedFormats10.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUPPORTED_IN_DIMENSION_N));
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertTrue("'" + localizedFormats22 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_LENGTH_MISMATCH + "'", localizedFormats22.equals(org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_LENGTH_MISMATCH));
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fractionField26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fractionField31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fractionField36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[NOT_SUPPORTED_IN_DIMENSION_N, -3 / 4, false, VECTOR_LENGTH_MISMATCH, 10.0, 1 / 2]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[NOT_SUPPORTED_IN_DIMENSION_N, -3 / 4, false, VECTOR_LENGTH_MISMATCH, 10.0, 1 / 2]");
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fractionField44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fractionField46);
        org.junit.Assert.assertNotNull(fractionField47);
        org.junit.Assert.assertNotNull(fraction49);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
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
        boolean boolean15 = bigFraction13.equals((java.lang.Object) (-127));
        java.math.BigDecimal bigDecimal16 = bigFraction13.bigDecimalValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3175.0d) + "'", double6 == (-3175.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bigDecimal16);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        double double18 = bigFraction16.pow((double) 1807551715);
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 20L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (byte) 30);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0686474581523463E13d + "'", double1 == 1.0686474581523463E13d);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR_OVERFLOW_AFTER_MULTIPLY;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR_OVERFLOW_AFTER_MULTIPLY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR_OVERFLOW_AFTER_MULTIPLY));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger2 = bigFraction1.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float7 = bigFraction6.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction5.add(bigFraction6);
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction6.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long13 = bigFraction12.longValue();
        java.math.BigInteger bigInteger14 = bigFraction12.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long17 = bigFraction16.longValue();
        java.math.BigInteger bigInteger18 = bigFraction16.getDenominator();
        java.math.BigInteger bigInteger19 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger14, bigInteger18);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction10.multiply(bigInteger14);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction3.add(bigInteger14);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = new org.apache.commons.math3.fraction.BigFraction(bigInteger14);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction0.pow(bigInteger14);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.25f + "'", float7 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigFraction23);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction0.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.multiply(10L);
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
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction6.pow(bigInteger20);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction23.pow(0L);
        boolean boolean27 = bigFraction25.equals((java.lang.Object) 0);
        long long28 = bigFraction25.getDenominatorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float33 = bigFraction32.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction31.add(bigFraction32);
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = bigFraction31.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long38 = bigFraction37.longValue();
        java.math.BigInteger bigInteger39 = bigFraction37.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long42 = bigFraction41.longValue();
        java.math.BigInteger bigInteger43 = bigFraction41.getDenominator();
        java.math.BigInteger bigInteger44 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger39, bigInteger43);
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = bigFraction31.add(bigInteger43);
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction29.subtract(bigInteger43);
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = bigFraction25.divide(bigFraction29);
        double double48 = bigFraction25.percentageValue();
        int int49 = bigFraction25.getDenominatorAsInt();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
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
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.25f + "'", float33 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 100L + "'", long42 == 100L);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-30));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.4000000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39794000867203755d) + "'", double1 == (-0.39794000867203755d));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        java.math.BigDecimal bigDecimal3 = bigFraction2.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.pow((-1));
        float float6 = bigFraction2.floatValue();
        float float7 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction2.negate();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.25f + "'", float6 == 0.25f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.25f + "'", float7 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction8);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 127L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((long) 1395, (-29L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1424L + "'", long2 == 1424L);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        double double1 = org.apache.commons.math3.util.FastMath.asin(7.930067261567152E14d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(0, 1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction2.add((-238262335));
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.add(360339393);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.Number number0 = null;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException1 = new org.apache.commons.math3.exception.NotPositiveException(number0);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        java.lang.Object obj0 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NOT_ALLOWED;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField5 = fraction4.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField8 = fraction7.getField();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.divide(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction4.multiply(fraction9);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField11 = fraction9.getField();
        org.apache.commons.math3.fraction.Fraction fraction12 = fractionField11.getOne();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT;
        java.lang.String str14 = localizedFormats13.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats15 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats16 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats17 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION;
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.divide(fraction19);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException21 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats17, (java.lang.Number) fraction18);
        java.lang.Throwable[] throwableArray22 = notPositiveException21.getSuppressed();
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException23 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats16, (java.lang.Object[]) throwableArray22);
        java.lang.Object[] objArray24 = new java.lang.Object[] { localizedFormats15, localizedFormats16 };
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) fraction12, (org.apache.commons.math3.exception.util.Localizable) localizedFormats13, objArray24);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException26 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction2, objArray24);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.util.MathUtils.checkNotNull(obj0, (org.apache.commons.math3.exception.util.Localizable) localizedFormats1, objArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: zero not allowed here");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NOT_ALLOWED + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NOT_ALLOWED));
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Loess expects at least 1 point" + "'", str14, "Loess expects at least 1 point");
        org.junit.Assert.assertTrue("'" + localizedFormats15 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR + "'", localizedFormats15.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats16 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats16.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertTrue("'" + localizedFormats17 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION + "'", localizedFormats17.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION));
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR, UNABLE_TO_ORTHOGONOLIZE_MATRIX]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR, UNABLE_TO_ORTHOGONOLIZE_MATRIX]");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (short) 0, 1.9073486E-6f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9073486E-6f + "'", float2 == 1.9073486E-6f);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        int int22 = fraction17.getNumerator();
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField23 = fraction17.getField();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction17.negate();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(fractionField23);
        org.junit.Assert.assertNotNull(fraction24);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-542210688));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.5682190129139257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.294839597872029d + "'", double1 == 2.294839597872029d);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        double double1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble(1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.add(10);
        byte byte7 = bigFraction6.byteValue();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-341642466L), 3.1221078653007948d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = fractionField1.getZero();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.divide(fraction6);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField9 = fraction6.getField();
        org.apache.commons.math3.fraction.FractionField fractionField10 = fraction6.getField();
        int int11 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction3.divide(fraction6);
        int int13 = fraction3.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField16 = fraction15.getField();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.divide(fraction15);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField18 = fraction15.getField();
        org.apache.commons.math3.fraction.Fraction fraction19 = fractionField18.getZero();
        java.lang.String str20 = fraction19.toString();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction3.add(fraction19);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fractionField18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertNotNull(fraction21);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger2 = bigFraction1.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.negate();
        java.math.BigInteger bigInteger4 = bigFraction3.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction0.multiply(bigInteger4);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField10 = fraction9.getField();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.divide(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction6.multiply(fraction11);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField13 = fraction11.getField();
        org.apache.commons.math3.fraction.Fraction fraction14 = fractionField13.getOne();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.multiply(4);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats17 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_EXPONENT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats18 = org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats19 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX;
        java.lang.Object[] objArray20 = null;
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException21 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats19, objArray20);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats22 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats23 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats24 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException27 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats28 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats29 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats31 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray32 = new java.lang.Object[] { (-1.0f), localizedFormats31 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException33 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats29, objArray32);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException34 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException27, (org.apache.commons.math3.exception.util.Localizable) localizedFormats28, objArray32);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException35 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats24, objArray32);
        java.lang.Throwable[] throwableArray36 = mathArithmeticException35.getSuppressed();
        org.apache.commons.math3.exception.ZeroException zeroException37 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats23, (java.lang.Object[]) throwableArray36);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException38 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException21, (org.apache.commons.math3.exception.util.Localizable) localizedFormats22, (java.lang.Object[]) throwableArray36);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException39 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats18, (java.lang.Object[]) throwableArray36);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats40 = org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats41 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX;
        java.lang.Object[] objArray42 = null;
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException43 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats41, objArray42);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats44 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats45 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats46 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException49 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats50 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats51 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats53 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray54 = new java.lang.Object[] { (-1.0f), localizedFormats53 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException55 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats51, objArray54);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException56 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException49, (org.apache.commons.math3.exception.util.Localizable) localizedFormats50, objArray54);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException57 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats46, objArray54);
        java.lang.Throwable[] throwableArray58 = mathArithmeticException57.getSuppressed();
        org.apache.commons.math3.exception.ZeroException zeroException59 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats45, (java.lang.Object[]) throwableArray58);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException60 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException43, (org.apache.commons.math3.exception.util.Localizable) localizedFormats44, (java.lang.Object[]) throwableArray58);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException61 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats40, (java.lang.Object[]) throwableArray58);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException62 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats18, (java.lang.Object[]) throwableArray58);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) fraction16, (org.apache.commons.math3.exception.util.Localizable) localizedFormats17, (java.lang.Object[]) throwableArray58);
        boolean boolean64 = bigFraction5.equals((java.lang.Object) localizedFormats17);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField65 = bigFraction5.getField();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + localizedFormats17 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_EXPONENT + "'", localizedFormats17.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_EXPONENT));
        org.junit.Assert.assertTrue("'" + localizedFormats18 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS + "'", localizedFormats18.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS));
        org.junit.Assert.assertTrue("'" + localizedFormats19 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX + "'", localizedFormats19.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX));
        org.junit.Assert.assertTrue("'" + localizedFormats22 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT + "'", localizedFormats22.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT));
        org.junit.Assert.assertTrue("'" + localizedFormats23 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS + "'", localizedFormats23.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS));
        org.junit.Assert.assertTrue("'" + localizedFormats24 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats24.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats28 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats28.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats29 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats29.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats31 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats31.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertTrue("'" + localizedFormats40 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS + "'", localizedFormats40.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS));
        org.junit.Assert.assertTrue("'" + localizedFormats41 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX + "'", localizedFormats41.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX));
        org.junit.Assert.assertTrue("'" + localizedFormats44 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT + "'", localizedFormats44.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT));
        org.junit.Assert.assertTrue("'" + localizedFormats45 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS + "'", localizedFormats45.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS));
        org.junit.Assert.assertTrue("'" + localizedFormats46 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats46.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats50 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats50.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats51 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats51.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats53 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats53.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(bigFractionField65);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BRACKETING_PARAMETERS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BRACKETING_PARAMETERS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BRACKETING_PARAMETERS));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        long long2 = org.apache.commons.math3.util.FastMath.max(1233225L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1233225L + "'", long2 == 1233225L);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.subtract((int) ' ');
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction0.subtract((long) (short) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction0.divide((long) '#');
        short short8 = bigFraction0.shortValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1424L, (double) (-100.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.45657346E-316d + "'", double2 == 4.45657346E-316d);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        double double2 = org.apache.commons.math3.util.FastMath.min(4.2177681591407135d, 2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.99822295029797d + "'", double2 == 2.99822295029797d);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = fractionField1.getZero();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.divide(fraction6);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField9 = fraction6.getField();
        org.apache.commons.math3.fraction.FractionField fractionField10 = fraction6.getField();
        int int11 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction3.divide(fraction6);
        int int13 = fraction3.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.divide(fraction15);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException17 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction16);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction3.add(fraction16);
        long long19 = fraction3.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(14);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        long long1 = org.apache.commons.math3.util.FastMath.abs(99L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 99L + "'", long1 == 99L);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.POPULATION_LIMIT_NOT_POSITIVE;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger3 = bigFraction2.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float7 = bigFraction6.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction2.add(bigFraction6);
        org.apache.commons.math3.exception.util.Localizable localizable9 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats10 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException14 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats15 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats16 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats18 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (-1.0f), localizedFormats18 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException20 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats16, objArray19);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException21 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException14, (org.apache.commons.math3.exception.util.Localizable) localizedFormats15, objArray19);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException22 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats11, objArray19);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException23 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats10, objArray19);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats24 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED;
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float28 = bigFraction27.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction26.add(bigFraction27);
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction29.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger32 = bigFraction31.getNumerator();
        int int33 = bigFraction30.compareTo(bigFraction31);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField34 = bigFraction30.getField();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats35 = org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats36 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats37 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1;
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger39 = bigFraction38.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = bigFraction38.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = bigFraction38.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = bigFraction42.reciprocal();
        java.lang.Object[] objArray44 = new java.lang.Object[] { localizedFormats36, localizedFormats37, bigFraction43 };
        org.apache.commons.math3.exception.ZeroException zeroException45 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats35, objArray44);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException46 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats24, (java.lang.Number) bigFraction30, objArray44);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException47 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats10, objArray44);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) bigFraction8, localizable9, objArray44);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException49 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) 7.569397566060481d, objArray44);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POPULATION_LIMIT_NOT_POSITIVE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POPULATION_LIMIT_NOT_POSITIVE));
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.25f + "'", float7 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + localizedFormats10 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR + "'", localizedFormats10.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats15 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats15.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats16 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats16.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats18 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats18.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertTrue("'" + localizedFormats24 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED + "'", localizedFormats24.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED));
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.25f + "'", float28 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(bigFractionField34);
        org.junit.Assert.assertTrue("'" + localizedFormats35 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM + "'", localizedFormats35.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM));
        org.junit.Assert.assertTrue("'" + localizedFormats36 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN + "'", localizedFormats36.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN));
        org.junit.Assert.assertTrue("'" + localizedFormats37 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1 + "'", localizedFormats37.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1));
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.divide(fraction2);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException4 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction1);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction1.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.divide(fraction9);
        double double11 = fraction9.doubleValue();
        double double12 = fraction9.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction9.negate();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField15 = fraction14.getField();
        org.apache.commons.math3.fraction.Fraction fraction16 = fractionField15.getZero();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction16.subtract(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField21 = fraction20.getField();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.divide(fraction20);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField23 = fraction20.getField();
        org.apache.commons.math3.fraction.FractionField fractionField24 = fraction20.getField();
        int int25 = fraction20.intValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction17.divide(fraction20);
        int int27 = fraction17.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction28.divide(fraction29);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException31 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction30);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction17.add(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction9.divide(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction7.subtract(fraction9);
        float float35 = fraction7.floatValue();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fractionField15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fractionField21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fractionField23);
        org.junit.Assert.assertNotNull(fractionField24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.9f + "'", float35 == 0.9f);
    }

}
