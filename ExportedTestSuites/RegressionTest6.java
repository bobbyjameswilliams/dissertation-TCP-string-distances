package org.apache.commons.math3.fraction;;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getValueAsLong((-31L), 15619000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology5.millisOfDay();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        long long2 = readableInterval1.getStartMillis();
        org.joda.time.DateTime dateTime3 = readableInterval1.getEnd();
        org.junit.Assert.assertNotNull(readableInterval1);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 114669905157955L + "'", long2 == 114669905157955L);
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unsupportedDurationField1.getValue(315532800000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getDifferenceAsLong((-283996798562L), (-1669740000L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = unsupportedDurationField1.getValueAsLong(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.add((-476134736065L), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.yearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getMillis(0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getMillis(1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.add(52L, (-1454470837707L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.add(946684800000L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfHalfday();
        java.lang.String str4 = iSOChronology0.toString();
        org.joda.time.DurationField durationField5 = iSOChronology0.days();
        org.joda.time.DurationField durationField6 = iSOChronology0.seconds();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[100]" + "'", str4, "ISOChronology[100]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = unsupportedDurationField1.getValueAsLong((long) 199);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unsupportedDurationField1.getValue((long) (short) -1, 2580268L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getMillis((-476134747246L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DurationField durationField4 = iSOChronology0.weeks();
        java.lang.String str5 = iSOChronology0.toString();
        org.joda.time.DurationField durationField6 = iSOChronology0.centuries();
        int int8 = durationField6.getValue((long) 719);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[UTC]" + "'", str5, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.Chronology chronology5 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfYear();
        org.joda.time.DurationField durationField7 = iSOChronology0.hours();
        org.joda.time.DurationField durationField8 = iSOChronology0.hours();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = unsupportedDurationField1.getValue((long) 100, 31380171L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = unsupportedDurationField1.getValue(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.lang.String str5 = zonedChronology4.toString();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.monthOfYear();
        org.joda.time.DurationField durationField8 = zonedChronology4.centuries();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str5, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getMillis(0L, 1701289170697L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getDifferenceAsLong(315590460035L, (long) 297);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = unsupportedDurationField1.getMillis((-210861660779418L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = iSOChronology0.weeks();
        org.joda.time.DurationField durationField4 = iSOChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField6 = iSOChronology0.minutes();
        int int9 = durationField6.getDifference(57531022L, (long) 183276);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 955 + "'", int9 == 955);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.weekyearOfCentury();
        org.joda.time.Chronology chronology9 = zonedChronology4.withUTC();
        org.joda.time.DurationField durationField10 = zonedChronology4.millis();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = chronology6.add(readablePeriod7, 0L, (int) (short) 10);
        org.joda.time.DurationField durationField11 = chronology6.months();
        org.joda.time.DateTimeField dateTimeField12 = chronology6.centuryOfEra();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.add((long) 28, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.yearOfCentury();
        org.joda.time.Chronology chronology10 = zonedChronology4.withUTC();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = unsupportedDurationField1.getValue(9700L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unsupportedDurationField1.getValue(12L, (long) 202);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.hourOfHalfday();
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeField4.getAsShortText(59, locale6);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "59" + "'", str7, "59");
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.year();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.secondOfMinute();
        org.joda.time.DurationField durationField5 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.add(291L, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.year();
        java.lang.String str4 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[UTC]" + "'", str4, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField5 = zonedChronology4.secondOfDay();
        long long9 = zonedChronology4.add((long) 4, (-476134715294L), 60000);
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.secondOfMinute();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-28568082917639996L) + "'", long9 == (-28568082917639996L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        boolean boolean3 = unsupportedDurationField1.isPrecise();
        boolean boolean4 = unsupportedDurationField1.isPrecise();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        java.lang.String str5 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[America/Los_Angeles]" + "'", str5, "ISOChronology[America/Los_Angeles]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getMillis(0, 73188819L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = zonedChronology4.getZone();
        int int11 = dateTimeZone9.getOffset(0L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.secondOfMinute();
        org.joda.time.DurationField durationField5 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.weekyear();
        org.joda.time.DurationField durationField9 = chronology6.hours();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.weekyearOfCentury();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = durationField5.getValueAsLong((-210866846400000L), (-31L));
        boolean boolean10 = durationField5.isPrecise();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-210866846400000L) + "'", long9 == (-210866846400000L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getMillis(24, 313861710L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        long long6 = dateTimeZone2.convertLocalToUTC((long) 23, false, 17539063802L);
        java.lang.Class<?> wildcardClass7 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 23L + "'", long6 == 23L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.DurationField durationField4 = iSOChronology0.days();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField5 = zonedChronology4.secondOfDay();
        long long9 = zonedChronology4.add((long) 4, (-476134715294L), 60000);
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.hourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-28568082917639996L) + "'", long9 == (-28568082917639996L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField5 = zonedChronology4.secondOfDay();
        long long9 = zonedChronology4.add((long) 4, (-476134715294L), 60000);
        org.joda.time.DateTimeZone dateTimeZone10 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.secondOfMinute();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-28568082917639996L) + "'", long9 == (-28568082917639996L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        long long2 = readableInterval1.getStartMillis();
        org.joda.time.Duration duration3 = readableInterval1.toDuration();
        long long4 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration3);
        org.junit.Assert.assertNotNull(readableInterval1);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1683808134545L + "'", long2 == 1683808134545L);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        java.lang.String str5 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = iSOChronology0.hours();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[America/Los_Angeles]" + "'", str5, "ISOChronology[America/Los_Angeles]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.add(30444585870L, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.halfdayOfDay();
        int int10 = dateTimeField8.get((-31536000007L));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getMillis(28, 3160L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField3 = iSOChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = iSOChronology0.getDateTimeMillis(3671845, (-256), 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -256 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getMillis((long) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.dayOfMonth();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.centuries();
        org.joda.time.DurationField durationField2 = iSOChronology0.millis();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.year();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        org.joda.time.DurationField durationField8 = zonedChronology4.minutes();
        long long10 = durationField8.getMillis(9);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 540000L + "'", long10 == 540000L);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.hourOfHalfday();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField6 = new org.joda.time.field.DividedDateTimeField(dateTimeField3, dateTimeFieldType4, 53460006);
        long long8 = dividedDateTimeField6.remainder(1701289183453L);
        int int10 = dividedDateTimeField6.get(1703967976367L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1701289183453L + "'", long8 == 1701289183453L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        java.lang.String str4 = dateTimeZone2.getName(1701289178411L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.hourOfHalfday();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField6 = new org.joda.time.field.DividedDateTimeField(dateTimeField3, dateTimeFieldType4, 53460006);
        long long9 = dividedDateTimeField6.set((long) 8, 0);
        long long11 = dividedDateTimeField6.remainder(9642225L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 8L + "'", long9 == 8L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9642225L + "'", long11 == 9642225L);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology0.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone5, (-21674226));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: -21674226");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.year();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField5 = iSOChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.weekyear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        long long12 = durationField1.getMillis(120290668366403774L, 649027L);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 120290668366403774L + "'", long12 == 120290668366403774L);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.centuries();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.minuteOfDay();
        long long6 = dateTimeField3.getDifferenceAsLong((-4761347508380L), (-476134715128L));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-71420213L) + "'", long6 == (-71420213L));
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfHalfday();
        java.lang.String str4 = iSOChronology0.toString();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[UTC]" + "'", str4, "ISOChronology[UTC]");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.Chronology chronology5 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DurationField durationField4 = iSOChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField6 = iSOChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.Chronology chronology5 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.clockhourOfDay();
        org.joda.time.Chronology chronology7 = iSOChronology0.withUTC();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.clockhourOfHalfday();
        java.lang.String str6 = iSOChronology0.toString();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[America/Los_Angeles]" + "'", str6, "ISOChronology[America/Los_Angeles]");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        long long7 = iSOChronology0.getDateTimeMillis(1, 1, (int) (byte) 1, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField9 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-62135596799900L) + "'", long7 == (-62135596799900L));
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = iSOChronology0.weeks();
        org.joda.time.DurationField durationField4 = iSOChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfMinute();
        java.lang.String str6 = iSOChronology0.toString();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[America/Los_Angeles]" + "'", str6, "ISOChronology[America/Los_Angeles]");
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        long long7 = iSOChronology0.getDateTimeMillis(1, 1, (int) (byte) 1, (int) (short) 100);
        org.joda.time.DurationField durationField8 = iSOChronology0.weeks();
        org.joda.time.DurationField durationField9 = iSOChronology0.days();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-62135568421900L) + "'", long7 == (-62135568421900L));
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology0.millis();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DurationField durationField4 = iSOChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = iSOChronology0.millis();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeField8.getAsText(3600009L, locale10);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970" + "'", str11, "1970");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = zonedChronology4.getDateTimeMillis((int) (short) 10, 0, 97, 97, 32, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        long long7 = iSOChronology0.getDateTimeMillis(1, 1, (int) (byte) 1, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField9 = iSOChronology0.centuries();
        org.joda.time.DurationField durationField10 = iSOChronology0.days();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-62135596799900L) + "'", long7 == (-62135596799900L));
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        int int4 = durationField1.getValue(1701289179712L, 1701289172561L);
        boolean boolean5 = durationField1.isPrecise();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 28354819 + "'", int4 == 28354819);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField5 = iSOChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.clockhourOfDay();
        org.joda.time.Partial partial7 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology0);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = zonedChronology4.getDateTimeMillis(8, 8, 1439, (int) ' ', (int) (byte) 1, (int) '#', 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField4 = iSOChronology0.minutes();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DurationField durationField4 = iSOChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.hourOfDay();
        org.joda.time.Chronology chronology6 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = iSOChronology0.getDateTimeMillis(14, 0, 32, 292316, 0, 10, 3060);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292316 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology0.minutes();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = iSOChronology0.getDateTimeMillis(970L, 28354759, (int) '4', (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28354759 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DurationField durationField4 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = iSOChronology0.weeks();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.minuteOfDay();
        long long6 = dateTimeField4.roundHalfFloor(0L);
        int int8 = dateTimeField4.getMinimumValue(35L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeField4.getAsText(84195, locale10);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "84195" + "'", str11, "84195");
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DurationField durationField4 = iSOChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.era();
        org.joda.time.DurationField durationField7 = iSOChronology0.weekyears();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = iSOChronology0.months();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone7.getShortName((-476134738486L), locale9);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.dayOfYear();
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology((org.joda.time.Chronology) iSOChronology0);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.minutes();
        org.joda.time.DurationField durationField5 = chronology2.halfdays();
        org.joda.time.DurationField durationField6 = chronology2.weeks();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = chronology2.halfdays();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = iSOChronology0.weeks();
        org.joda.time.DurationField durationField4 = iSOChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekOfWeekyear();
        long long5 = dateTimeField3.roundHalfFloor((-53015644800000L));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-53015817600007L) + "'", long5 == (-53015817600007L));
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DurationField durationField4 = iSOChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.hourOfDay();
        org.joda.time.Chronology chronology6 = iSOChronology0.withUTC();
        org.joda.time.Partial partial7 = new org.joda.time.Partial(chronology6);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.millisOfSecond();
        boolean boolean6 = dateTimeField4.isLeap((-476134737921L));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = iSOChronology0.centuries();
        org.joda.time.DurationField durationField6 = iSOChronology0.months();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeZone dateTimeZone6 = zonedChronology4.getZone();
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology((org.joda.time.Chronology) zonedChronology4);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.dayOfWeek();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = zonedChronology4.getDateTimeMillis(29227899L, 100, 0, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.minuteOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.months();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.era();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = dateTimeField3.add((-476134754563L), 8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.millisOfSecond();
        org.joda.time.DurationField durationField5 = iSOChronology0.millis();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        java.lang.String str5 = iSOChronology0.toString();
        org.joda.time.DurationField durationField6 = iSOChronology0.centuries();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[73]" + "'", str5, "ISOChronology[73]");
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DurationField durationField4 = iSOChronology0.years();
        int int7 = durationField4.getDifference(0L, (-3155695200000L));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DurationField durationField4 = iSOChronology0.hours();
        org.joda.time.Chronology chronology5 = iSOChronology0.withUTC();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.years();
        long long6 = durationField4.getMillis((int) '#');
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1104493320000L + "'", long6 == 1104493320000L);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(1L, locale6);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone2);
        int int10 = cachedDateTimeZone8.getOffset(179569353600000L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = zonedChronology4.centuries();
        long long10 = durationField7.subtract((-476134727033L), 74);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-233997536327033L) + "'", long10 == (-233997536327033L));
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DurationField durationField4 = iSOChronology0.hours();
        org.joda.time.DurationField durationField5 = iSOChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.era();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.lang.String str5 = zonedChronology4.toString();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.dayOfMonth();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str5, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.weekyearOfCentury();
        boolean boolean10 = dateTimeField8.isLeap(9603L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField5 = iSOChronology0.days();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone8 = iSOChronology0.getZone();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.weekyearOfCentury();
        int int10 = dateTimeField8.getMinimumValue((-80340288961132L));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField5 = iSOChronology0.millis();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        java.lang.String str4 = durationField3.getName();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "months" + "'", str4, "months");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.secondOfDay();
        org.joda.time.Chronology chronology8 = iSOChronology0.withUTC();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology0.halfdays();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.minuteOfDay();
        int int5 = dateTimeField4.getMinimumValue();
        long long7 = dateTimeField4.roundHalfFloor(28800004L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 28799991L + "'", long7 == 28799991L);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = iSOChronology0.centuries();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        org.joda.time.DurationField durationField9 = dateTimeField8.getRangeDurationField();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNull(durationField9);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = zonedChronology4.getDateTimeMillis((int) (short) 10, 8, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        java.lang.String str9 = dateTimeZone7.getName(1438L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        org.joda.time.DurationField durationField9 = zonedChronology4.weekyears();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = zonedChronology4.hours();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.halfdayOfDay();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = zonedChronology4.centuries();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.secondOfDay();
        long long10 = iSOChronology0.add((-449095625936L), 1701289191463L, 7);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11459928714305L + "'", long10 == 11459928714305L);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.minuteOfHour();
        org.joda.time.DurationField durationField8 = zonedChronology4.years();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = zonedChronology4.centuries();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.centuryOfEra();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone6 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone7 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone5);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(cachedDateTimeZone6);
        org.junit.Assert.assertNotNull(cachedDateTimeZone7);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = zonedChronology4.centuries();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.dayOfYear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.dayOfMonth();
        java.lang.String str6 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.year();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[73]" + "'", str6, "ISOChronology[73]");
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        long long10 = durationField7.subtract((-476134729858L), 0L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-476134729858L) + "'", long10 == (-476134729858L));
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = zonedChronology4.getDateTimeMillis(3, 3, 1439, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1439 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone6 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone5);
        long long8 = dateTimeZone5.convertUTCToLocal(0L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(cachedDateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfDay();
        org.joda.time.Chronology chronology7 = iSOChronology0.withUTC();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.weekyear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.monthOfYear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DurationField durationField5 = iSOChronology0.hours();
        long long8 = durationField5.getMillis(60035L, (-62135568421900L));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 216126000000L + "'", long8 == 216126000000L);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField5 = zonedChronology4.secondOfDay();
        long long7 = dateTimeField5.roundHalfFloor(1701289179647L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1701289180000L + "'", long7 == 1701289180000L);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField5 = zonedChronology4.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.clockhourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField5 = zonedChronology4.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.dayOfYear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField5 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }
}
