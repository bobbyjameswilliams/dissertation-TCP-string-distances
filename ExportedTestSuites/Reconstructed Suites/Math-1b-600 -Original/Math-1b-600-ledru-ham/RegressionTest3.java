package org.apache.commons.math3.fraction;;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.FACTORIAL_NEGATIVE_PARAMETER;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.FACTORIAL_NEGATIVE_PARAMETER + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.FACTORIAL_NEGATIVE_PARAMETER));
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 1.07859136E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0785913600000002E9d + "'", double1 == 1.0785913600000002E9d);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.718281828459045d, (-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9233097485725157d + "'", double2 == 1.9233097485725157d);
    }

    @Test
    public void test1504() throws Throwable {
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
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        int int1 = org.apache.commons.math3.util.FastMath.abs(29);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (byte) 2, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9999999f + "'", float2 == 1.9999999f);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(1072693217, 1079525376);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 1811784996);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.811784996E9d + "'", double1 == 1.811784996E9d);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        int int2 = org.apache.commons.math3.util.FastMath.max(961, (-26));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 961 + "'", int2 == 961);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 2.68435456E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.68435456E8d + "'", double1 == 2.68435456E8d);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 28);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4886921905584123d + "'", double1 == 0.4886921905584123d);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 70L, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 140.0d + "'", double2 == 140.0d);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 9800L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        double double1 = org.apache.commons.math3.util.FastMath.log10(120.00416659433121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.07919632519356d + "'", double1 == 2.07919632519356d);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((long) 10, (long) (short) -30);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(3.1221078653007948d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1221078653007948d + "'", double2 == 3.1221078653007948d);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        float float1 = org.apache.commons.math3.util.FastMath.abs(128.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 128.0f + "'", float1 == 128.0f);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 30);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4771212547196624d + "'", double1 == 1.4771212547196624d);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (short) -30);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(6466043904L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((long) 30, (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 1, (-1072693248));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1072693248) + "'", int2 == (-1072693248));
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.9626058663135666d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38189641719793466d + "'", double1 == 0.38189641719793466d);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 52L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(520, 961);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        double double1 = org.apache.commons.math3.util.FastMath.asin(32.00000381469725d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(475956593, 52360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 476008953 + "'", int2 == 476008953);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 341642467);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.533571849246034d + "'", double1 == 8.533571849246034d);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        double double1 = org.apache.commons.math3.util.FastMath.cos(67.88974313718154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33866819356389966d + "'", double1 == 0.33866819356389966d);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 1395L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.3473430653209d + "'", double1 == 24.3473430653209d);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-99) + "'", int2 == (-99));
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.2291268324586927d, (double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2291268324586927d + "'", double2 == 0.2291268324586927d);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 1807551715, 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.86418E38f + "'", float2 == 2.86418E38f);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((long) 1083558912, (long) 1104155264);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2187714176L + "'", long2 == 2187714176L);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_UPPER_BOUND;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_UPPER_BOUND + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_UPPER_BOUND));
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.99999994f) + "'", float1 == (-0.99999994f));
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(0, (int) (byte) 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((long) 14, 52360L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52360L + "'", long2 == 52360L);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 3628800L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3628800.0d + "'", double1 == 3628800.0d);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-2L), 3.4016141E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1007.376777049702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.41642464E8f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction((int) (byte) 100, (int) '4');
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-26));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999948909d) + "'", double1 == (-0.9999999999948909d));
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((int) (short) 16, 9409);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9425 + "'", int2 == 9425);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.0747904E9f, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_FRACTION_TO_DIVIDE_BY;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_FRACTION_TO_DIVIDE_BY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_FRACTION_TO_DIVIDE_BY));
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-31), (long) 52360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1877073665 + "'", int2 == 1877073665);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.75d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9315964599440725d) + "'", double1 == (-0.9315964599440725d));
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 9700L, (-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5708614938627248d + "'", double2 == 1.5708614938627248d);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(32, (int) (short) 1);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(3, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(10000000000L, (-1074790401L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(10, 32);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((long) 30, (long) (byte) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-496.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 10, (long) (-4));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (short) 71);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 268435456);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        int int2 = org.apache.commons.math3.util.FastMath.max(97, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction((int) 'a', 1078591488);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 268435456L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.68435488E8f + "'", float1 == 2.68435488E8f);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNPARSEABLE_COMPLEX_NUMBER;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNPARSEABLE_COMPLEX_NUMBER + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNPARSEABLE_COMPLEX_NUMBER));
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow(35, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 1078591488);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.1798740081135376E10d + "'", double1 == 6.1798740081135376E10d);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-1), (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) -2662, 9800L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9800L + "'", long2 == 9800L);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 9700L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9700.001f + "'", float1 == 9700.001f);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 30, 52);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.162277660168382E-16d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5585053606381855d + "'", double1 == 0.5585053606381855d);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 1078591488);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7786307212869168d + "'", double1 == 0.7786307212869168d);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(9.332621544395286E157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.660549437995381E78d + "'", double1 == 9.660549437995381E78d);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        double double1 = org.apache.commons.math3.util.FastMath.atan(36.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430256902014756d + "'", double1 == 1.5430256902014756d);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow(1018167296, (long) 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException2 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_REGRESSION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_REGRESSION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_REGRESSION));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 1.5845633E31f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5845632502852868E31d + "'", double1 == 1.5845632502852868E31d);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        long long2 = org.apache.commons.math3.util.MathUtils.copySign(28L, (long) (short) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28L + "'", long2 == 28L);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 70.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.515438670919167E30d + "'", double1 == 2.515438670919167E30d);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 97.0f, (double) 0.25f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5682190129139257d + "'", double2 == 1.5682190129139257d);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.515438670919167E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((-99), 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        double double1 = org.apache.commons.math3.util.FastMath.asin(25.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(1074790400, 45);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 1152);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1152 + "'", int1 == 1152);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, 1811785010);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.4333571589785714d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(10L, 1233225L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12332250L + "'", long2 == 12332250L);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((long) 'a', (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9700L + "'", long2 == 9700L);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction((int) (short) -35, (-4));
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.stirlingS2((int) (short) 2, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308232d + "'", double1 == 57.29577951308232d);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (byte) 30);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0686474581523463E13d + "'", double1 == 1.0686474581523463E13d);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        int int2 = org.apache.commons.math3.util.FastMath.max(1078591488, 340593891);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1078591488 + "'", int2 == 1078591488);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 360339393, (double) (-4));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.931342865682863E-35d + "'", double2 == 5.931342865682863E-35d);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        double double1 = org.apache.commons.math3.util.FastMath.floor(67.88974313718154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 67.0d + "'", double1 == 67.0d);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        long long2 = org.apache.commons.math3.util.FastMath.max(1233225L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1233225L + "'", long2 == 1233225L);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 1079525376L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.675216045607117d) + "'", double1 == (-4.675216045607117d));
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281828459045d + "'", double1 == 2.718281828459045d);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((long) (-53), (-29L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-24L) + "'", long2 == (-24L));
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-1851382.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1851382.0d) + "'", double1 == (-1851382.0d));
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-1324025208));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 0.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        int int2 = org.apache.commons.math3.util.MathUtils.copySign((int) '#', 1078591488);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient(97, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        double double2 = org.apache.commons.math3.util.FastMath.log(23.7189981105004d, 1.2840254166877414d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07895710087951932d + "'", double2 == 0.07895710087951932d);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        int int2 = org.apache.commons.math3.util.FastMath.min(100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(12.566370614359172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.566370614359174d + "'", double1 == 12.566370614359174d);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 21952L, 1.9999999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 21952.0f + "'", float2 == 21952.0f);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(100L);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 0L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        float float2 = org.apache.commons.math3.util.FastMath.max(2.0f, (float) (-341642466L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((long) (-30), (long) (short) -35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 210L + "'", long2 == 210L);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 1072693248L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5384786408469177d + "'", double1 == 0.5384786408469177d);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((-929312903), 1811785010);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 2);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0000002f + "'", float1 == 2.0000002f);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.731537741517051d + "'", double1 == 1.731537741517051d);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        double double1 = org.apache.commons.math3.util.FastMath.rint(9800.052244771154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9800.0d + "'", double1 == 9800.0d);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, 19398656);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 52360L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52360 + "'", int1 == 52360);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        long long2 = org.apache.commons.math3.util.MathUtils.copySign((long) 40, 3628800L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 40L + "'", long2 == 40L);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        long long2 = org.apache.commons.math3.util.FastMath.max(88529281L, (long) 144);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 88529281L + "'", long2 == 88529281L);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.5708614938627248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8107908758857842d + "'", double1 == 3.8107908758857842d);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2204460492503128E-16d + "'", double1 == 2.2204460492503128E-16d);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(97.0f, (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 48.5f + "'", float2 == 48.5f);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, (int) (short) -2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 31, 1079525366L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        int int1 = org.apache.commons.math3.util.MathUtils.hash(6.338124408909002E-58d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1324025208) + "'", int1 == (-1324025208));
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(29, 52);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.3633850893556905d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0667541031272256d + "'", double1 == 1.0667541031272256d);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.75d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7499999999999999d) + "'", double1 == (-0.7499999999999999d));
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 4);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.7683716E-7f + "'", float1 == 4.7683716E-7f);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_COMPLEX_MODULE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_COMPLEX_MODULE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_COMPLEX_MODULE));
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.SIMPLEX_NEED_ONE_POINT;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.SIMPLEX_NEED_ONE_POINT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.SIMPLEX_NEED_ONE_POINT));
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(7.896326140304252E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015625d + "'", double1 == 0.015625d);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SYMMETRIC_MATRIX;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SYMMETRIC_MATRIX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SYMMETRIC_MATRIX));
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.627482429927895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.46603960848311693d) + "'", double1 == (-0.46603960848311693d));
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(929312903, 70);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((-2L), 9700L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-19400L) + "'", long2 == (-19400L));
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0E100d, (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-200d + "'", double2 == 1.0E-200d);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.4339872044851463d, 71);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1007932393182316E38d + "'", double2 == 1.1007932393182316E38d);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(0L, (long) 28);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28L + "'", long2 == 28L);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-1072693248));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1072693248L + "'", long1 == 1072693248L);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, (-1074790400));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        double double1 = org.apache.commons.math3.util.FastMath.log10(31.999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5051499783199058d + "'", double1 == 1.5051499783199058d);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        int int1 = org.apache.commons.math3.util.FastMath.round(100.00001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-200.0d), 70);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1805916207174114E161d + "'", double2 == 1.1805916207174114E161d);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.8563690240890007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1221078653007956d + "'", double1 == 3.1221078653007956d);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(0L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(8.533571849246034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2541.2837099876647d + "'", double1 == 2541.2837099876647d);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(1078591488, 8);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3.3289514180086344E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.328951418008635E-8d + "'", double1 == 3.328951418008635E-8d);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.4333571589785714d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.408123112566557d) + "'", double1 == (-0.408123112566557d));
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        int int1 = org.apache.commons.math3.util.MathUtils.hash((double) 1078591488);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1104155264 + "'", int1 == 1104155264);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.515438670919167E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4333571589785714d) + "'", double1 == (-0.4333571589785714d));
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-31.0d), 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-496.0d) + "'", double2 == (-496.0d));
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.07952524960206E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.07952524960206E9d + "'", double1 == 1.07952524960206E9d);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 38L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.0d + "'", double1 == 38.0d);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.5682190129139257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.294839597872029d + "'", double1 == 2.294839597872029d);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_PARSE_AS_TYPE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_PARSE_AS_TYPE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_PARSE_AS_TYPE));
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(0, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, (float) (-51L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.2840254166877414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2840254166877416d + "'", double1 == 1.2840254166877416d);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607966601082315d + "'", double1 == 1.5607966601082315d);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((-23.830835094447984d), 0.24739001493882623d, 30);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SUMS_TO_ZERO;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SUMS_TO_ZERO + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SUMS_TO_ZERO));
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9046745947545269d + "'", double1 == 0.9046745947545269d);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        double double1 = org.apache.commons.math3.util.FastMath.log10(5.649334448629621d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7519972863480745d + "'", double1 == 0.7519972863480745d);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, (int) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        double double1 = org.apache.commons.math3.util.FastMath.log(15.104412573075516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.714986924514427d + "'", double1 == 2.714986924514427d);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707055269350272d + "'", double1 == 1.5707055269350272d);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((-47), (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1504) + "'", int2 == (-1504));
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        int int2 = org.apache.commons.math3.util.FastMath.max((-4), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException3 = new org.apache.commons.math3.fraction.FractionConversionException(2005.3522829578812d, (long) 340593891, 3628800L);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        long long1 = org.apache.commons.math3.util.ArithmeticUtils.factorial(0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 30);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_NUMBER_OF_SAMPLES;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_NUMBER_OF_SAMPLES + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_NUMBER_OF_SAMPLES));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.5902773407317596E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5902773407317596E-15d + "'", double1 == 1.5902773407317596E-15d);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.9046745947545269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.812337498822692d + "'", double1 == 0.812337498822692d);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_2D_INDEX;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_2D_INDEX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_2D_INDEX));
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 31.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5410520681182421d + "'", double1 == 0.5410520681182421d);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) (-2));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9092974268256817d) + "'", double1 == (-0.9092974268256817d));
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_32_BITS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_32_BITS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_32_BITS));
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        double double1 = org.apache.commons.math3.util.FastMath.log(7.896326140304252E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.00000381469725d + "'", double1 == 32.00000381469725d);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-2762.0d), 3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.1070314728E10d) + "'", double2 == (-2.1070314728E10d));
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(127L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 126L + "'", long2 == 126L);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(0L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((-0.5210953054937474d), 0.9695548414907615d, (-127));
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.429369702178807E-8d + "'", double1 == 8.429369702178807E-8d);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.5384786408469175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5153607460569013d + "'", double1 == 0.5153607460569013d);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.pow((long) (short) 10, (long) 1018167296);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) 0.42279321873816184d);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 11);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.093102195050827d + "'", double1 == 3.093102195050827d);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(3.552713678800501E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5527136788004946E-15d + "'", double1 == 3.5527136788004946E-15d);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(635.856379863918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.456544166829538d + "'", double1 == 6.456544166829538d);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.pow(0L, (long) 1807551715);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) 97, 1.5845632502852868E31d, (-1079525376));
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 31L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 31.000002f + "'", float1 == 31.000002f);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (byte) 0, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.57090260800827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171692148363411d + "'", double1 == 0.9171692148363411d);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.4E-45f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient(97, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 2187714176L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.18771405E9f + "'", float1 == 2.18771405E9f);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.3010299956639812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.247748258387595d + "'", double1 == 17.247748258387595d);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_DEFINITE_OPERATOR;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_DEFINITE_OPERATOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_DEFINITE_OPERATOR));
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 35L, (double) '#', (int) (short) 1);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ITERATOR_EXHAUSTED;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ITERATOR_EXHAUSTED + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ITERATOR_EXHAUSTED));
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276743037347d + "'", double1 == 1.4711276743037347d);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NAN_VALUE_CONVERSION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NAN_VALUE_CONVERSION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NAN_VALUE_CONVERSION));
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.9999999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(1, 961);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 961 + "'", int2 == 961);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 0.5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5d + "'", double1 == 0.5d);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.050000000000001d + "'", double1 == 5.050000000000001d);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        int int2 = org.apache.commons.math3.util.FastMath.min(135070657, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        double double1 = org.apache.commons.math3.util.FastMath.atan(15.104412573075516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5046869858626275d + "'", double1 == 1.5046869858626275d);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, 1960992769);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1960992769 + "'", int2 == 1960992769);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INDEX_OUT_OF_RANGE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INDEX_OUT_OF_RANGE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INDEX_OUT_OF_RANGE));
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.9982229502979703d, (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.627482429927895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6783156523793671d + "'", double1 == 0.6783156523793671d);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 70L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70.0d + "'", double1 == 70.0d);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.4913616938342726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9546569268600785d + "'", double1 == 0.9546569268600785d);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        int int2 = org.apache.commons.math3.util.FastMath.max(11, (int) (short) 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.9982229502979703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7315377415170512d + "'", double1 == 1.7315377415170512d);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.6783156523793671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9705558343694834d + "'", double1 == 0.9705558343694834d);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(0, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) 1, (long) 1079525376);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1079525376L + "'", long2 == 1079525376L);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(140.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 140.0d + "'", double1 == 140.0d);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        int int2 = org.apache.commons.math3.util.FastMath.min(135070657, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(3.4339872044851463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9049610587953938d + "'", double1 == 1.9049610587953938d);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        double double1 = org.apache.commons.math3.util.FastMath.floor(22.408359761558884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.0d + "'", double1 == 22.0d);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.3010299956639812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5486620049392715d + "'", double1 == 0.5486620049392715d);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 1.9999999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException2 = new org.apache.commons.math3.fraction.FractionConversionException((double) (-2952716662570746864L), (int) (short) 71);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) 341642467, 100.00000762939453d, 0);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 52360);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52360.004f + "'", float1 == 52360.004f);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 31);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.0d + "'", double1 == 31.0d);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException3 = new org.apache.commons.math3.fraction.FractionConversionException(0.5585053606381855d, 10000000000L, (-1L));
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-341642466L), 3.1221078653007948d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((long) 1395, (-29L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1424L + "'", long2 == 1424L);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.5585053606381855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5925828509060219d + "'", double1 == 0.5925828509060219d);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-57.29577951308232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7336545584598283d + "'", double1 == 0.7336545584598283d);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((long) 0, (long) (short) -2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(6365139678740040577L, 125994627894135L);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (short) 71);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2626798770413155d + "'", double1 == 4.2626798770413155d);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.pow((long) (short) -1, 38L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.USER_EXCEPTION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.USER_EXCEPTION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.USER_EXCEPTION));
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.9233097485725157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9233097485725157d + "'", double1 == 1.9233097485725157d);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        long long2 = org.apache.commons.math3.util.FastMath.max((-2762L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((long) 1104155264, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1104155264L + "'", long2 == 1104155264L);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow(961, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 961 + "'", int2 == 961);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(35.0d, (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-5.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.380515006246586d + "'", double1 == 3.380515006246586d);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.0168438181538688d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) 1079525376, 125994627894135L);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow(1807551715, (int) (byte) 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-929312903) + "'", int2 == (-929312903));
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        double double1 = org.apache.commons.math3.util.FastMath.atan(31.026580882699598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5385770515676989d + "'", double1 == 1.5385770515676989d);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((long) (-99), (long) 961);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 862L + "'", long2 == 862L);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) 0L, 12.566370614359174d, (-1072693248));
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(3.552713678800507E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.888609052210118E-31d + "'", double1 == 7.888609052210118E-31d);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        double double14 = bigFraction11.doubleValue();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.75d) + "'", double14 == (-0.75d));
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(3.4339872044851463d, (int) (byte) -1);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 6.1035156E-5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.103515625000001E-5d + "'", double1 == 6.103515625000001E-5d);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        double double1 = org.apache.commons.math3.util.FastMath.abs(140.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 140.0d + "'", double1 == 140.0d);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        int int2 = org.apache.commons.math3.util.MathUtils.copySign((int) (short) -2, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(0.2291268324586927d, (int) (byte) 1);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 210L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 210.0d + "'", double1 == 210.0d);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        int int2 = org.apache.commons.math3.util.FastMath.min(1075314688, 268435456);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 268435456 + "'", int2 == 268435456);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 9409, 1.1641532E-10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9409.0f + "'", float2 == 9409.0f);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(1811784964L, (long) (-1072693248));
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999986258976d + "'", double1 == 0.9999999986258976d);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException3 = new org.apache.commons.math3.fraction.FractionConversionException(67.0d, 9700L, (long) (-268435456));
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3010299956639812d + "'", double1 == 0.3010299956639812d);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) (short) -2662, (long) 100000000);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 35, (long) 341642467);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(32, 100000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (short) 2);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 'a', 1.0471975511965979d, 97);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(10, (-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 990 + "'", int2 == 990);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 2.0f, 0.5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) 4L, (double) 1.5845633E31f, 1078591488);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException2 = new org.apache.commons.math3.fraction.FractionConversionException(0.6915237372951216d, 360339393);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.0000000000000016E-31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction(0.0d, (double) 99L, 268435456);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        short short2 = org.apache.commons.math3.util.MathUtils.copySign((short) (byte) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((-4188717411859075071L), (long) 10);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException3 = new org.apache.commons.math3.fraction.FractionConversionException(0.3010299956639812d, (long) (-17), (long) 4);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 30, 1395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-3L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_ELEMENT;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_ELEMENT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_ELEMENT));
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((-127), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.0471975511965979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 10, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806299707034d + "'", double1 == 1.5430806299707034d);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(0.49321676688550387d, 1078591458);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.75f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 341642467L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(43.5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7592182246175334d + "'", double1 == 0.7592182246175334d);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(0.3010299956639812d, (-1072693248));
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) (byte) 1, (long) (short) -2);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 48.5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((long) 28, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28L + "'", long2 == 28L);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        int int1 = org.apache.commons.math3.util.MathUtils.hash(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1807551715 + "'", int1 == 1807551715);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) '#', (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException2 = new org.apache.commons.math3.fraction.FractionConversionException((double) Float.POSITIVE_INFINITY, 97);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) 14, (long) (byte) 1);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.apache.commons.math3.util.MathUtils.checkFinite((double) (-1.07479027E9f));
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction(0.0d, 1.079515392E9d, (-238262335));
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-238262335), (-1324025208));
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException3 = new org.apache.commons.math3.fraction.FractionConversionException(0.0d, (long) 1072693217, 0L);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        double double1 = org.apache.commons.math3.util.FastMath.rint(3.552713678800507E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 4L, (-1074790400));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.POLYNOMIAL;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POLYNOMIAL + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POLYNOMIAL));
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, (-1074790400));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 32L, (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 16.0f + "'", float2 == 16.0f);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 4.75956608E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException3 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (long) (-542210689), (-3L));
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION));
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 1.1641532E-10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 1.0747904E9f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.627482429927895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((-1.5706907148240663d), 0);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((int) (short) 1, 1072693248);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((double) 6365139678740040577L);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(0, 1078591488);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 100, 1811784996);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((long) 2, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(0.2291268324586927d, 70);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(0L, (long) (-238262335));
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException2 = new org.apache.commons.math3.fraction.FractionConversionException(120.0d, (-1072693248));
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, (long) 28);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-23.830835094447984d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) 10.0f);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (byte) 30);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 1079525376);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) 1877073665, (long) 35);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException3 = new org.apache.commons.math3.fraction.FractionConversionException(0.0d, 0L, (long) (byte) 0);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CONSTRAINT;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CONSTRAINT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CONSTRAINT));
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) -2662);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-1072693248), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.0000000000000016E-31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        double double1 = org.apache.commons.math3.util.FastMath.asin(7.930067261567152E14d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        float float1 = org.apache.commons.math3.util.FastMath.signum(7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.5380218700469711E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        int int1 = org.apache.commons.math3.util.MathUtils.hash(0.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(0.5410520681182421d);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(0, (int) (short) 10);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.apache.commons.math3.exception.NotPositiveException notPositiveException1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) 31);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.9982229502979703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(9.833054852505912d);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 1078591488);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException2 = new org.apache.commons.math3.fraction.FractionConversionException((double) (byte) 2, 1960992769);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) (short) -2662);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((int) (byte) 2, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) (-30));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 1395);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207031E-4f + "'", float1 == 1.2207031E-4f);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(0, (int) (byte) -1);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 32.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.commons.math3.util.MathUtils.checkFinite(1.1849900242739125E151d);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.math3.util.MathUtils.checkFinite(4.2177681591407135d);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-1079525376));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(8.429369702178807E-8d);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(0, (int) (short) -2);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-268435456), (-53));
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(70.00714249274856d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(70L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 70L + "'", long2 == 70L);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(1072693248, (-31));
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        double double1 = org.apache.commons.math3.util.FastMath.exp(4.784907962876926E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(4.6566128730773926E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble((int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 48.5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 28);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        double double1 = org.apache.commons.math3.util.FastMath.acos(9800.052244771154d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (-1504));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (-100.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.apache.commons.math3.util.MathUtils.checkFinite((double) 10.000001f);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(3.4934271057485095E19d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.6606403793348095d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.apache.commons.math3.exception.NotPositiveException notPositiveException1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) 31.999999999999996d);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(28);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (short) -2662);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((int) (short) -71, 1072693248);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.07952524960206E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) -1, 340593891);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        byte byte2 = org.apache.commons.math3.util.MathUtils.copySign((byte) -35, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 35 + "'", byte2 == (byte) 35);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((-1074790400), 30);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.5107651208185948d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-1079525376));
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow(2, (long) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 1075314688);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.5410520681182421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.pow(0L, 1079525376L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) -3);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((int) (short) 2, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-26) + "'", int2 == (-26));
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        double double1 = org.apache.commons.math3.util.FastMath.floor(3.1221078653007956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((long) 6, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-29L) + "'", long2 == (-29L));
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((double) 70.0f);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(6.897704943128636d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) '4', 1072693248L);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-26), 71L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 71L + "'", long2 == 71L);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) 71.84044670030279d);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 9409);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1939() throws Throwable {
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
    public void test1940() throws Throwable {
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
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.commons.math3.util.MathUtils.checkFinite(1.0766809667216182d);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.9171692148363411d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.apache.commons.math3.util.MathUtils.checkFinite(1.6606403793348095d);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 1078591458);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.00001f + "'", float1 == 100.00001f);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(1083558912, 1077673984);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(144, (-31));
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (-1074790471));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(0, 1077673984);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((-238262335));
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.apache.commons.math3.util.MathUtils.checkFinite((double) 341642467);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.104155264E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.015625d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        double double1 = org.apache.commons.math3.util.FastMath.acos(4.2177681591407135d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) 'a', 1);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        int int1 = org.apache.commons.math3.util.FastMath.round(0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1959() throws Throwable {
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
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 10000000000L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(1.104155264E9d);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) (byte) 0);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(1079525376, (-4));
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(1811784996, 1152);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 35L, (float) (short) 71);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow(1018167296, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 35L);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (short) -2662);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(1079525376, 1072693248);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (short) 71);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(9409, 11);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(1.5607966601082315d);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.math3.util.MathUtils.checkFinite((double) 97.0f);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 97);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(4, (-99));
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.apache.commons.math3.util.MathUtils.checkFinite((double) 1811784964L);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) -1);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(1078591488);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(4, (int) ' ');
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(542210703);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (short) 0, 99);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.commons.math3.util.MathUtils.checkFinite((double) (short) 71);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 127L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.math3.util.MathUtils.checkFinite((double) 35840.0f);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (byte) 30);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(475956593);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.9999912096442254d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(0, (-1324025208));
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 1395L);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(27405L);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((double) 32L);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (short) 0);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-30));
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) (short) -2, 99L);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 99L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 99.0f + "'", float1 == 99.0f);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        double double1 = org.apache.commons.math3.util.FastMath.rint(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(0);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-1074790344));
    }
}
