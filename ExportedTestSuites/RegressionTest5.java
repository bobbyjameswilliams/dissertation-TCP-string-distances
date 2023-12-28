package org.apache.commons.math3.fraction;;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.tz.DateTimeZoneBuilder.readFrom(inputStream0, "DurationField[weeks]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str3 = dateTimeZone0.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone5 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone4);
        boolean boolean7 = cachedDateTimeZone5.equals((java.lang.Object) 432000032L);
        long long10 = cachedDateTimeZone5.convertLocalToUTC(432000032L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(cachedDateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 432000032L + "'", long10 == 432000032L);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException("73", "296");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException("dayOfWeek", "1439");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField11 = new org.joda.time.field.OffsetDateTimeField(dateTimeField8, dateTimeFieldType9, (int) (short) 1);
        org.joda.time.DurationField durationField12 = offsetDateTimeField11.getLeapDurationField();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNull(durationField12);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.PreciseDurationField preciseDurationField3 = new org.joda.time.field.PreciseDurationField(durationFieldType1, 28354819L);
        long long6 = preciseDurationField3.getMillis((long) (short) 100, 1701289160741L);
        boolean boolean8 = preciseDurationField3.equals((java.lang.Object) (-6027150136924300L));
        long long11 = preciseDurationField3.getMillis((int) '4', 1701289172565L);
        long long14 = preciseDurationField3.getMillis(94090L, (-476134736067L));
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2835481900L + "'", long6 == 2835481900L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1474450588L + "'", long11 == 1474450588L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2667904919710L + "'", long14 == 2667904919710L);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.getMillis(1256774400000L, 10281600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("UTC", 100);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeZoneBuilder3.toDateTimeZone("ISOChronology[America/Los_Angeles]", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder3.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.addRecurringSavings("15", 0, 29227999, 0, 'a', (int) (short) 0, (int) '4', 0, false, (-5));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder3.setFixedSavings("35", 21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.Chronology chronology5 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = iSOChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.year();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.minuteOfDay();
        org.joda.time.DurationField durationField3 = gregorianChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology1.monthOfYear();
        org.joda.time.DurationField durationField5 = gregorianChronology1.minutes();
        org.joda.time.DurationField durationField6 = gregorianChronology1.minutes();
        long long8 = durationField6.getMillis((int) (short) 1);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60000L + "'", long8 == 60000L);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        boolean boolean4 = unsupportedDurationField1.isSupported();
        long long5 = unsupportedDurationField1.getUnitMillis();
        boolean boolean7 = unsupportedDurationField1.equals((java.lang.Object) 15L);
        java.lang.String str8 = unsupportedDurationField1.getName();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hours" + "'", str8, "hours");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.joda.time.IllegalInstantException illegalInstantException2 = new org.joda.time.IllegalInstantException(0L, "5514305");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException("32", "hourOfDay");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.ZoneInfoProvider zoneInfoProvider1 = new org.joda.time.tz.ZoneInfoProvider("4");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: \"4/ZoneInfoMap\" ClassLoader: sun.misc.Launcher$AppClassLoader@18b4aac2");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.hourOfHalfday();
        java.lang.String str11 = dateTimeField10.toString();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateTimeField[hourOfHalfday]" + "'", str11, "DateTimeField[hourOfHalfday]");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.ZoneInfoProvider zoneInfoProvider1 = new org.joda.time.tz.ZoneInfoProvider("DurationField[millis]");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: \"DurationField[millis]/ZoneInfoMap\" ClassLoader: sun.misc.Launcher$AppClassLoader@18b4aac2");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.joda.time.IllegalInstantException illegalInstantException1 = new org.joda.time.IllegalInstantException("weeks");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.joda.time.IllegalInstantException illegalInstantException1 = new org.joda.time.IllegalInstantException("100");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DurationField durationField11 = gregorianChronology5.halfdays();
        org.joda.time.Partial partial12 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology5);
        int int13 = gregorianChronology5.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField14 = gregorianChronology5.minutes();
        org.joda.time.DurationField durationField15 = gregorianChronology5.halfdays();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.junit.Assert.assertNotNull(nameProvider0);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone5 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology6.getZone();
        boolean boolean8 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) gregorianChronology6);
        org.joda.time.DurationField durationField9 = gregorianChronology6.minutes();
        org.joda.time.DurationField durationField10 = gregorianChronology6.days();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology6.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(53460006, 37113);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 53460006");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.era();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.yearOfEra();
        java.lang.String str11 = dateTimeField10.toString();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateTimeField[yearOfEra]" + "'", str11, "DateTimeField[yearOfEra]");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.joda.time.IllegalInstantException illegalInstantException2 = new org.joda.time.IllegalInstantException((long) 297, "-1");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone2 = provider0.getZone("1");
        java.util.Set<java.lang.String> strSet3 = provider0.getAvailableIDs();
        java.util.Set<java.lang.String> strSet4 = provider0.getAvailableIDs();
        org.joda.time.DateTimeZone dateTimeZone6 = provider0.getZone("-08:00");
        org.joda.time.DateTimeZone dateTimeZone8 = provider0.getZone("+00:00:01.439");
        org.joda.time.DateTimeZone dateTimeZone10 = provider0.getZone("2008-10-28T00:42:23.407Z/2008-10-28T00:42:23.407Z");
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNull(dateTimeZone8);
        org.junit.Assert.assertNull(dateTimeZone10);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unsupportedDurationField1.getValue((long) 29227999, (-15778464L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.joda.time.IllegalInstantException illegalInstantException2 = new org.joda.time.IllegalInstantException((-2173831554426L), "DurationField[hours]");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.joda.time.DurationField durationField0 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long3 = durationField0.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long5 = durationField0.getValueAsLong((long) 10);
        int int7 = durationField0.getValue((long) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.field.ScaledDurationField scaledDurationField10 = new org.joda.time.field.ScaledDurationField(durationField0, durationFieldType8, 28354819);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DurationField durationField12 = durationFieldType8.getField(chronology11);
        org.junit.Assert.assertNotNull(durationField0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.Chronology chronology5 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfYear();
        org.joda.time.DurationField durationField7 = iSOChronology0.millis();
        org.joda.time.DurationField durationField8 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DurationField durationField11 = gregorianChronology5.halfdays();
        org.joda.time.Partial partial12 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology5.dayOfMonth();
        org.joda.time.Chronology chronology14 = gregorianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology5.hourOfHalfday();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone6 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = gregorianChronology7.getZone();
        org.joda.time.DateTimeZone dateTimeZone9 = gregorianChronology7.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.Chronology chronology11 = iSOChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException("1", (java.lang.Number) 2900521162108L, (java.lang.Number) 1.0d, (java.lang.Number) (-97L));
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        boolean boolean4 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getValueAsLong(1701289170697L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        java.io.DataInput dataInput0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.tz.DateTimeZoneBuilder.readFrom(dataInput0, "1672560000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.ZoneInfoProvider zoneInfoProvider2 = new org.joda.time.tz.ZoneInfoProvider("0", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: \"0/ZoneInfoMap\" ClassLoader: system");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException("0", (java.lang.Number) (short) 1, (java.lang.Number) 1701289162973L, (java.lang.Number) 1702281558665L);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.Partial partial3 = new org.joda.time.Partial(dateTimeFieldType1, 100);
        org.joda.time.IllegalFieldValueException illegalFieldValueException7 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType1, (java.lang.Number) 53L, (java.lang.Number) (-2173831554426L), (java.lang.Number) 5185620582L);
        java.lang.String str8 = dateTimeFieldType1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.DividedDateTimeField dividedDateTimeField10 = new org.joda.time.field.DividedDateTimeField(dateTimeField0, dateTimeFieldType1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "dayOfYear" + "'", str8, "dayOfYear");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException("centuryOfEra", (java.lang.Number) 15319361229L, (java.lang.Number) 1701289169842L, (java.lang.Number) 315590460035L);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        java.io.DataInput dataInput0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.tz.DateTimeZoneBuilder.readFrom(dataInput0, "-00:00:00.007");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unsupportedDurationField1.getValue((-62072524800007L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = chronology6.add(readablePeriod7, 0L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField11 = chronology6.centuryOfEra();
        long long14 = dateTimeField11.add(1701289160741L, (int) (byte) -1);
        boolean boolean15 = dateTimeField11.isSupported();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1454470839259L) + "'", long14 == (-1454470839259L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException("UnsupportedDateTimeField", (java.lang.Number) 1701289172400L, (java.lang.Number) (-31507200000L), (java.lang.Number) 31380171L);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException("ZonedChronology[ISOChronology[UTC], UTC]", (java.lang.Number) 28354819L, (java.lang.Number) 1701289170819L, (java.lang.Number) 99);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("UTC", 100);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeZoneBuilder3.toDateTimeZone("ISOChronology[America/Los_Angeles]", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder3.setFixedSavings("DateTimeField[minuteOfDay]", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("9", 0, 199, 4, '#', (int) (short) 1, 59, 100, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.tz.DateTimeZoneBuilder.readFrom(inputStream0, "(\"org.joda.time.JodaTimePermission\" \"ISOChronology[UTC]\")");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("UTC", 100);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeZoneBuilder3.toDateTimeZone("ISOChronology[America/Los_Angeles]", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder3.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder8.setFixedSavings("+00:00", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder11.setStandardOffset(28354819);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.joda.time.tz.DefaultNameProvider defaultNameProvider0 = new org.joda.time.tz.DefaultNameProvider();
        java.util.Locale locale1 = null;
        java.lang.String str4 = defaultNameProvider0.getName(locale1, "13", "69");
        java.util.Locale locale5 = null;
        java.lang.String str8 = defaultNameProvider0.getShortName(locale5, "[]", "org.joda.time.IllegalFieldValueException: Value 9 for 60035 must be in the range [97,97]");
        java.util.Locale locale9 = null;
        java.lang.String str12 = defaultNameProvider0.getShortName(locale9, "", "DateTimeField[yearOfCentury]");
        org.joda.time.DateTimeZone.setNameProvider((org.joda.time.tz.NameProvider) defaultNameProvider0);
        java.util.Locale locale14 = null;
        java.lang.String str17 = defaultNameProvider0.getShortName(locale14, "59", "centuryOfEra");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.hourOfHalfday();
        int int13 = dateTimeField10.getDifference((-476134738803L), (-62135596799907L));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17127628 + "'", int13 == 17127628);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("UTC", 100);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeZoneBuilder3.toDateTimeZone("ISOChronology[America/Los_Angeles]", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder3.setStandardOffset((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder3.addCutover(96, 'a', (int) (byte) 0, (int) (short) 0, (int) ' ', true, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.tz.DateTimeZoneBuilder.readFrom(inputStream0, "1641");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DurationField durationField11 = gregorianChronology5.halfdays();
        org.joda.time.Partial partial12 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.DurationField durationField13 = gregorianChronology5.millis();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology5.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology5.yearOfCentury();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "", 0, 4);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str7 = fixedDateTimeZone4.getName(97L);
        int int9 = fixedDateTimeZone4.getStandardOffset(31564800000L);
        java.lang.String str11 = fixedDateTimeZone4.getNameKey((-183661320863L));
        int int13 = fixedDateTimeZone4.getStandardOffset((long) (short) -1);
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        boolean boolean4 = unsupportedDurationField1.isPrecise();
        java.lang.String str5 = unsupportedDurationField1.getName();
        boolean boolean6 = unsupportedDurationField1.isPrecise();
        java.lang.String str7 = unsupportedDurationField1.getName();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hours" + "'", str7, "hours");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str4 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unsupportedDurationField1.getDifference(998424838114737L, 28757969465L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[hours]" + "'", str4, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = zonedChronology4.getDateTimeMillis(1L, (int) (byte) 0, (int) (short) 10, (-1), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(970);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        int int6 = fixedDateTimeZone4.getStandardOffset((long) 1439);
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.weekOfWeekyear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.joda.time.tz.DefaultNameProvider defaultNameProvider0 = new org.joda.time.tz.DefaultNameProvider();
        java.util.Locale locale1 = null;
        java.lang.String str4 = defaultNameProvider0.getShortName(locale1, "UTC", "");
        java.util.Locale locale5 = null;
        java.lang.String str8 = defaultNameProvider0.getName(locale5, "69", "69");
        java.util.Locale locale9 = null;
        java.lang.String str12 = defaultNameProvider0.getName(locale9, "", "org.joda.time.IllegalFieldValueException: Value 10 for dayOfYear is not supported: hourOfDay");
        java.util.Locale locale13 = null;
        java.lang.String str16 = defaultNameProvider0.getShortName(locale13, "years", "197");
        java.util.Locale locale17 = null;
        java.lang.String str20 = defaultNameProvider0.getName(locale17, "100", "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
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
        org.joda.time.DateTimeField dateTimeField12 = chronology6.hourOfDay();
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeField12.getAsShortText(1701289172561L, locale14);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "20" + "'", str15, "20");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        java.lang.String str1 = durationFieldType0.getName();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology2.weekyearOfCentury();
        boolean boolean7 = durationFieldType0.isSupported((org.joda.time.Chronology) iSOChronology2);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eras" + "'", str1, "eras");
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException("dayOfMonth", "UTC");
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = illegalFieldValueException2.getDateTimeFieldType();
        illegalFieldValueException2.prependMessage("");
        java.lang.Number number6 = illegalFieldValueException2.getLowerBound();
        org.joda.time.IllegalFieldValueException illegalFieldValueException9 = new org.joda.time.IllegalFieldValueException("dayOfMonth", "UTC");
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = illegalFieldValueException9.getDateTimeFieldType();
        illegalFieldValueException9.prependMessage("");
        illegalFieldValueException2.addSuppressed((java.lang.Throwable) illegalFieldValueException9);
        org.junit.Assert.assertNull(dateTimeFieldType3);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(dateTimeFieldType10);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        java.lang.String str8 = unsupportedDateTimeField6.toString();
        long long11 = unsupportedDateTimeField6.add((-61202908936366L), 28757979647L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnsupportedDateTimeField" + "'", str8, "UnsupportedDateTimeField");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-61174150956719L) + "'", long11 == (-61174150956719L));
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "53460006", (-1492), 0);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str3 = dateTimeZone0.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone5 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone4);
        java.lang.Object obj6 = null;
        boolean boolean7 = cachedDateTimeZone5.equals(obj6);
        long long9 = cachedDateTimeZone5.previousTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(cachedDateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField4 = gregorianChronology1.eras();
        org.joda.time.DateTimeZone dateTimeZone5 = gregorianChronology1.getZone();
        java.lang.String str7 = dateTimeZone5.getNameKey(290818397127600000L);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ISOChronology[America/Los_Angeles]" + "'", str7, "ISOChronology[America/Los_Angeles]");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("1954-11-29T20:20:27.737-08:00/1954-11-29T20:20:27.737-08:00", "1969", 38, 31);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology5.getZone();
        org.joda.time.DurationField durationField8 = gregorianChronology5.millis();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("UTC", "", 0, 4);
        java.util.TimeZone timeZone14 = fixedDateTimeZone13.toTimeZone();
        org.joda.time.Chronology chronology15 = gregorianChronology5.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException("minuteOfHour", "hours");
        java.lang.Throwable[] throwableArray3 = illegalFieldValueException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unsupportedDurationField1.getValue(39600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.Object obj4 = null;
        boolean boolean5 = unsupportedDurationField1.equals(obj4);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unsupportedDurationField1.getValue((-1454470839268L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("35", "hi!", (-7), (-5));
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.Class<?> wildcardClass1 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.lang.String str5 = zonedChronology4.toString();
        org.joda.time.DurationField durationField6 = zonedChronology4.minutes();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = zonedChronology4.getDateTimeMillis((int) 'a', (-1893415679), (int) (byte) 100, 16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1893415679 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str5, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.joda.time.tz.DefaultNameProvider defaultNameProvider0 = new org.joda.time.tz.DefaultNameProvider();
        java.util.Locale locale1 = null;
        java.lang.String str4 = defaultNameProvider0.getName(locale1, "13", "69");
        java.util.Locale locale5 = null;
        java.lang.String str8 = defaultNameProvider0.getShortName(locale5, "[]", "org.joda.time.IllegalFieldValueException: Value 9 for 60035 must be in the range [97,97]");
        java.util.Locale locale9 = null;
        java.lang.String str12 = defaultNameProvider0.getShortName(locale9, "", "DateTimeField[yearOfCentury]");
        java.util.Locale locale13 = null;
        java.lang.String str16 = defaultNameProvider0.getName(locale13, "dayOfMonth", "");
        org.joda.time.DateTimeZone.setNameProvider((org.joda.time.tz.NameProvider) defaultNameProvider0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DurationField durationField11 = gregorianChronology5.halfdays();
        org.joda.time.Partial partial12 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.DurationField durationField13 = gregorianChronology5.millis();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology5.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = gregorianChronology5.getZone();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(3600000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unsupportedDurationField1.getValue((-30610224000000L), (-80340288961132L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DurationField durationField6 = gregorianChronology5.days();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology5.era();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology5.halfdayOfDay();
        java.lang.String str10 = gregorianChronology5.toString();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology5.centuryOfEra();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GregorianChronology[100]" + "'", str10, "GregorianChronology[100]");
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.millisOfSecond();
        long long10 = dateTimeField8.roundHalfCeiling(1225154538244L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1225154538244L + "'", long10 == 1225154538244L);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.Object obj4 = null;
        boolean boolean5 = unsupportedDurationField1.equals(obj4);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unsupportedDurationField1.getValue(180815090L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str3 = dateTimeZone0.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone5 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone4);
        boolean boolean7 = cachedDateTimeZone5.equals((java.lang.Object) 432000032L);
        int int9 = cachedDateTimeZone5.getOffset(1L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(cachedDateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-30878));
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.add(1701260510760L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.Object obj4 = null;
        boolean boolean5 = unsupportedDurationField1.equals(obj4);
        boolean boolean6 = unsupportedDurationField1.isPrecise();
        java.lang.String str7 = unsupportedDurationField1.toString();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UnsupportedDurationField[hours]" + "'", str7, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.joda.time.ReadableInstant readableInstant0 = null;
        long long1 = org.joda.time.DateTimeUtils.getInstantMillis(readableInstant0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-476134747246L) + "'", long1 == (-476134747246L));
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unsupportedDateTimeField6.getMaximumValue(1701289179647L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException("1969", "dayOfWeek");
        java.lang.String str3 = illegalFieldValueException2.getIllegalStringValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "dayOfWeek" + "'", str3, "dayOfWeek");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.lang.String str5 = zonedChronology4.toString();
        org.joda.time.DurationField durationField6 = zonedChronology4.minutes();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = zonedChronology4.getDateTimeMillis((long) 208, 28354759, (-315585559), 38, 297);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28354759 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str5, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unsupportedDurationField1.getValue((-30610194772100L), (-476134747656L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long11 = gregorianChronology5.getDateTimeMillis((int) '4', 8, 24, 24);
        org.joda.time.DurationField durationField12 = gregorianChronology5.centuries();
        org.joda.time.DateTimeZone dateTimeZone13 = gregorianChronology5.getZone();
        int int15 = dateTimeZone13.getStandardOffset(0L);
        java.util.TimeZone timeZone16 = dateTimeZone13.toTimeZone();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-60505833599976L) + "'", long11 == (-60505833599976L));
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getValueAsLong((long) 132259650);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("3");
        java.lang.String str2 = jodaTimePermission1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3" + "'", str2, "3");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "", 0, 4);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str7 = fixedDateTimeZone4.getName(97L);
        int int9 = fixedDateTimeZone4.getStandardOffset(31564800000L);
        java.lang.String str11 = fixedDateTimeZone4.getNameKey((-183661320863L));
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int14 = fixedDateTimeZone4.getOffsetFromLocal(165025049349446L);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        java.util.Set<java.lang.String> strSet2 = provider0.getAvailableIDs();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "", 0, 4);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone6 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone7, 297);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 297");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "", 0, 4);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str7 = fixedDateTimeZone4.getName(97L);
        int int9 = fixedDateTimeZone4.getStandardOffset(31564800000L);
        java.lang.String str11 = fixedDateTimeZone4.getNameKey((-183661320863L));
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int14 = fixedDateTimeZone4.getOffsetFromLocal(1701289185345L);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.minuteOfHour();
        boolean boolean9 = gregorianChronology5.equals((java.lang.Object) (-2173831554426L));
        org.joda.time.DurationField durationField10 = gregorianChronology5.hours();
        org.joda.time.DurationField durationField11 = gregorianChronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology5.weekyearOfCentury();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("3");
        java.lang.String str2 = jodaTimePermission1.getActions();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(1L, locale6);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone9 = cachedDateTimeZone8.getUncachedZone();
        long long12 = dateTimeZone9.convertLocalToUTC(0L, false);
        java.lang.String str14 = dateTimeZone9.getName(0L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        long long9 = dateTimeZone7.nextTransition((-476134745124L));
        int int11 = dateTimeZone7.getStandardOffset(0L);
        java.lang.String str13 = dateTimeZone7.getNameKey((-53L));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-476134745124L) + "'", long9 == (-476134745124L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.minuteOfHour();
        boolean boolean9 = gregorianChronology5.equals((java.lang.Object) (-2173831554426L));
        org.joda.time.DurationField durationField10 = gregorianChronology5.hours();
        org.joda.time.DurationField durationField11 = gregorianChronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology5.hourOfHalfday();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        boolean boolean3 = unsupportedDurationField1.isPrecise();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unsupportedDurationField1.getValue(1893415777L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(durationFieldType4);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = zonedChronology4.getDateTimeMillis(28354819, 20, 25306, 52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.Object obj4 = null;
        boolean boolean5 = unsupportedDurationField1.equals(obj4);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.getMillis(1701260513284L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.secondOfMinute();
        int int13 = dateTimeField10.getDifference(0L, (-3671845792L));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3671845 + "'", int13 == 3671845);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = chronology2.getDateTimeMillis(16, 0, 21, 0, 719, 6, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 719 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((-2177424000000L), true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-2177424000000L) + "'", long3 == (-2177424000000L));
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException("dayOfMonth", "UTC");
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = illegalFieldValueException2.getDateTimeFieldType();
        illegalFieldValueException2.prependMessage("");
        java.lang.Number number6 = illegalFieldValueException2.getLowerBound();
        illegalFieldValueException2.prependMessage("seconds");
        org.junit.Assert.assertNull(dateTimeFieldType3);
        org.junit.Assert.assertNull(number6);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        long long3 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, 2580171L);
        long long7 = dateTimeZone0.convertLocalToUTC((-1L), false, 946713600000L);
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 31380171L + "'", long3 == 31380171L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add(2835106203L, (int) (byte) 100);
        long long12 = unsupportedDateTimeField6.getDifferenceAsLong((long) ' ', (-57530990L));
        java.lang.String str13 = unsupportedDateTimeField6.getName();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2835106303L + "'", long9 == 2835106303L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 57531022L + "'", long12 == 57531022L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "dayOfYear" + "'", str13, "dayOfYear");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "", 0, 4);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str7 = fixedDateTimeZone4.getName(97L);
        int int9 = fixedDateTimeZone4.getStandardOffset(1701289170625L);
        int int11 = fixedDateTimeZone4.getOffset((-1454470839259L));
        java.lang.String str13 = fixedDateTimeZone4.getShortName(1701289178411L);
        long long15 = fixedDateTimeZone4.nextTransition(0L);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getMillis(28757986764L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1439);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((-476134764377L), locale3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:01.439" + "'", str4, "+00:00:01.439");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "", 0, 4);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str7 = fixedDateTimeZone4.getName(97L);
        int int9 = fixedDateTimeZone4.getOffsetFromLocal((-210858120000000L));
        boolean boolean10 = fixedDateTimeZone4.isFixed();
        int int12 = fixedDateTimeZone4.getOffset((-476134759656L));
        int int14 = fixedDateTimeZone4.getOffset((-1702281628408L));
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException("195", (java.lang.Number) 28L, (java.lang.Number) (-81420902612492069L), (java.lang.Number) 118839990170189L);
        java.lang.Number number5 = illegalFieldValueException4.getIllegalNumberValue();
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 28L + "'", number5, 28L);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean3 = dateTimeZone1.isStandardOffset((-413969929858L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        java.lang.String str3 = dateTimeZone0.getID();
        java.lang.String str4 = dateTimeZone0.toString();
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone5 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone6 = cachedDateTimeZone5.getUncachedZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(cachedDateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("UTC", 28, 28354819, 100, 'a', 73, 7, 296907, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addCutover((int) (byte) 1, '4', 202, 719, 73, true, 73);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("-1", 9);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder19.toDateTimeZone("73", false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone7, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 24");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("17", "", 196222, (int) ' ');
        int int6 = fixedDateTimeZone4.getOffset(131868000000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 196222 + "'", int6 == 196222);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField5 = iSOChronology0.centuries();
        org.joda.time.DurationField durationField6 = iSOChronology0.years();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = iSOChronology0.getDateTimeMillis(0L, 0, 202, 29227899, (-472580));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 202 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.junit.Assert.assertNotNull(iSOChronology1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[UTC]" + "'", str2, "ISOChronology[UTC]");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("UTC", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("2008-10-28T00:42:23.414+00:00:00.007/2008-10-28T00:42:23.414+00:00:00.007", (-10));
        java.io.DataOutput dataOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("0", dataOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.joda.time.tz.DefaultNameProvider defaultNameProvider0 = new org.joda.time.tz.DefaultNameProvider();
        java.util.Locale locale1 = null;
        java.lang.String str4 = defaultNameProvider0.getName(locale1, "13", "69");
        java.util.Locale locale5 = null;
        java.lang.String str8 = defaultNameProvider0.getShortName(locale5, "[]", "org.joda.time.IllegalFieldValueException: Value 9 for 60035 must be in the range [97,97]");
        java.util.Locale locale9 = null;
        java.lang.String str12 = defaultNameProvider0.getShortName(locale9, "", "DateTimeField[yearOfCentury]");
        java.util.Locale locale13 = null;
        java.lang.String str16 = defaultNameProvider0.getName(locale13, "+00:00:00.100", "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("UTC", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder3.addRecurringSavings("2023-11-29T12:19:27.691-08:00/2023-11-29T12:19:27.691-08:00", (-7), (int) (short) 0, (int) (short) -1, '4', (int) '4', (int) (short) 0, 32, true, (-28800000));
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeZoneBuilder3.toDateTimeZone("4", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField4 = gregorianChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.secondOfMinute();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException("23", "7");
        boolean boolean3 = org.joda.time.IllegalInstantException.isIllegalInstant((java.lang.Throwable) illegalFieldValueException2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.joda.time.tz.DefaultNameProvider defaultNameProvider0 = new org.joda.time.tz.DefaultNameProvider();
        java.util.Locale locale1 = null;
        java.lang.String str4 = defaultNameProvider0.getName(locale1, "13", "69");
        java.util.Locale locale5 = null;
        java.lang.String str8 = defaultNameProvider0.getShortName(locale5, "ISOChronology[UTC]", "UnsupportedDurationField[hours]");
        java.util.Locale locale9 = null;
        java.lang.String str12 = defaultNameProvider0.getName(locale9, "ISOChronology[UTC]", "DateTimeField[minuteOfDay]");
        java.util.Locale locale13 = null;
        java.lang.String str16 = defaultNameProvider0.getShortName(locale13, "minuteOfHour", "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone2 = provider0.getZone("1");
        java.util.Set<java.lang.String> strSet3 = provider0.getAvailableIDs();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeZone dateTimeZone6 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = zonedChronology4.getDateTimeMillis((-1669753266), 0, 202, (-4));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -4 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        boolean boolean4 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.getDifferenceAsLong(0L, (-476134772251L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        org.joda.time.DurationFieldType durationFieldType3 = unsupportedDurationField1.getType();
        java.lang.String str4 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.getDifferenceAsLong((-476134764377L), (-46185073064226L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gregorianChronology1.weeks();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1439);
        java.lang.String str3 = dateTimeZone1.getName(1262304000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:01.439" + "'", str3, "+00:00:01.439");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.PreciseDurationField preciseDurationField3 = new org.joda.time.field.PreciseDurationField(durationFieldType1, 28354819L);
        long long4 = preciseDurationField3.getUnitMillis();
        boolean boolean5 = preciseDurationField3.isPrecise();
        long long8 = preciseDurationField3.getValueAsLong((long) 719, 306607L);
        long long11 = preciseDurationField3.add(31536000000L, 10256400000L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 28354819L + "'", long4 == 28354819L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 290818397127600000L + "'", long11 == 290818397127600000L);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology5.dayOfYear();
        org.joda.time.DurationField durationField12 = gregorianChronology5.eras();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology5.era();
        long long16 = dateTimeField13.addWrapField((-28354759L), (-751463));
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-124271308354759L) + "'", long16 == (-124271308354759L));
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial12 = partial0.with(dateTimeFieldType10, 3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3 for era must not be larger than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("UTC", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder3.addRecurringSavings("org.joda.time.IllegalFieldValueException: Value 10 for dayOfYear is not supported: hourOfDay", (int) (byte) 0, (int) ' ', (int) (short) -1, '4', 53460006, 0, (int) (short) -1, false, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("days", 73);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("UTC", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("-21674226", 86399);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getMillis(28800004L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        long long7 = iSOChronology0.getDateTimeMillis(1, 1, (int) (byte) 1, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.clockhourOfDay();
        java.lang.String str9 = iSOChronology0.toString();
        org.joda.time.DurationField durationField10 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology0.secondOfMinute();
        long long13 = dateTimeField11.roundHalfCeiling(1701260526990L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-62135596799900L) + "'", long7 == (-62135596799900L));
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ISOChronology[UTC]" + "'", str9, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1701260527000L + "'", long13 == 1701260527000L);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(1L, locale6);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone2);
        java.lang.String str9 = dateTimeZone2.toString();
        int int11 = dateTimeZone2.getStandardOffset((long) 97);
        boolean boolean12 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.millisOfSecond();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str3 = dateTimeZone0.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone4, 28354819);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 28354819");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "", 0, 4);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str7 = fixedDateTimeZone4.getName(97L);
        int int9 = fixedDateTimeZone4.getStandardOffset(1701289170625L);
        int int11 = fixedDateTimeZone4.getOffset((-1454470839259L));
        int int13 = fixedDateTimeZone4.getOffsetFromLocal(37113L);
        long long15 = fixedDateTimeZone4.convertUTCToLocal((long) 'a');
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add(2835106203L, (int) (byte) 100);
        long long12 = unsupportedDateTimeField6.getDifferenceAsLong((long) ' ', (-57530990L));
        boolean boolean13 = unsupportedDateTimeField6.isSupported();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2835106303L + "'", long9 == 2835106303L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 57531022L + "'", long12 == 57531022L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale1 = null;
        java.lang.String str4 = nameProvider0.getName(locale1, "org.joda.time.IllegalFieldValueException: Value 10 for dayOfYear is not supported: hourOfDay", "dayOfWeek");
        java.util.Locale locale5 = null;
        java.lang.String str8 = nameProvider0.getName(locale5, "years", "GregorianChronology[100]");
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("UTC", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder3.addRecurringSavings("org.joda.time.IllegalFieldValueException: Value 10 for dayOfYear is not supported: hourOfDay", (int) (byte) 0, (int) ' ', (int) (short) -1, '4', 53460006, 0, (int) (short) -1, false, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder14.setStandardOffset(3600000);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "", 0, 4);
        long long6 = fixedDateTimeZone4.previousTransition(2102400001L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2102400001L + "'", long6 == 2102400001L);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInstant0, readableInstant1);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.year();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = chronology2.getDateTimeMillis((-223445), (-593102), 73, (-256), (-1492), 195, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -256 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = zonedChronology4.getZone();
        java.lang.String str11 = dateTimeZone9.getNameKey((-183661320863L));
        java.lang.Class<?> wildcardClass12 = dateTimeZone9.getClass();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long11 = gregorianChronology5.getDateTimeMillis((int) '4', 8, 24, 24);
        org.joda.time.DurationField durationField12 = gregorianChronology5.days();
        org.joda.time.DateTimeZone dateTimeZone13 = gregorianChronology5.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField15 = iSOChronology14.days();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-60505833599976L) + "'", long11 == (-60505833599976L));
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hourOfDay", "197", 7, 7);
        java.lang.String str5 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hourOfDay" + "'", str5, "hourOfDay");
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInstant0, readableInstant1);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.millisOfDay();
        long long6 = dateTimeField3.getDifferenceAsLong((-62233531200000L), (-17242586529L));
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-62216288613471L) + "'", long6 == (-62216288613471L));
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.joda.time.tz.DefaultNameProvider defaultNameProvider0 = new org.joda.time.tz.DefaultNameProvider();
        java.util.Locale locale1 = null;
        java.lang.String str4 = defaultNameProvider0.getName(locale1, "13", "69");
        java.util.Locale locale5 = null;
        java.lang.String str8 = defaultNameProvider0.getName(locale5, "DurationField[millis]", "32");
        org.joda.time.DateTimeZone.setNameProvider((org.joda.time.tz.NameProvider) defaultNameProvider0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.Chronology chronology5 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = iSOChronology0.getDateTimeMillis((-62135568421900L), 296907, 100, (int) (short) 10, 1439);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 296907 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.getValueAsLong((-476134745124L), (-476134760335L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hourOfDay", "197", 7, 7);
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = zonedChronology4.getDateTimeMillis(29227899, 970, 0, 0, 60000, 60000, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 60000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
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
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        boolean boolean4 = unsupportedDurationField1.isSupported();
        boolean boolean5 = unsupportedDurationField1.isSupported();
        org.joda.time.DurationFieldType durationFieldType6 = unsupportedDurationField1.getType();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationFieldType6);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.add(1701289185345L, (-476134769564L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = zonedChronology4.getDateTimeMillis(96, (-1492), 297, 99, (-190992), (-1492), 96);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
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
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology0.days();
        org.joda.time.DurationField durationField5 = iSOChronology0.months();
        org.joda.time.DurationField durationField6 = iSOChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.dayOfMonth();
        long long11 = iSOChronology0.add((-1893600000L), 0L, (int) (byte) 0);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1893600000L) + "'", long11 == (-1893600000L));
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        boolean boolean4 = unsupportedDurationField1.isSupported();
        boolean boolean5 = unsupportedDurationField1.isSupported();
        org.joda.time.DurationFieldType durationFieldType6 = unsupportedDurationField1.getType();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationFieldType6);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.joda.time.tz.DefaultNameProvider defaultNameProvider0 = new org.joda.time.tz.DefaultNameProvider();
        java.util.Locale locale1 = null;
        java.lang.String str4 = defaultNameProvider0.getName(locale1, "13", "69");
        java.util.Locale locale5 = null;
        java.lang.String str8 = defaultNameProvider0.getShortName(locale5, "ISOChronology[UTC]", "UnsupportedDurationField[hours]");
        org.joda.time.DateTimeZone.setNameProvider((org.joda.time.tz.NameProvider) defaultNameProvider0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) 1, false);
        java.lang.String str4 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 28800001L + "'", long3 == 28800001L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "America/Los_Angeles" + "'", str4, "America/Los_Angeles");
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        boolean boolean3 = unsupportedDurationField1.isPrecise();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = unsupportedDurationField1.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(durationFieldType4);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField4 = gregorianChronology1.eras();
        org.joda.time.DateTimeZone dateTimeZone5 = gregorianChronology1.getZone();
        java.lang.String str6 = dateTimeZone5.toString();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "", 0, 4);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str7 = fixedDateTimeZone4.getName(97L);
        int int9 = fixedDateTimeZone4.getStandardOffset(1701289170625L);
        int int11 = fixedDateTimeZone4.getOffset((-1454470839259L));
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gregorianChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology1.dayOfMonth();
        org.joda.time.DurationField durationField5 = gregorianChronology1.weekyears();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = zonedChronology4.getDateTimeMillis((int) (short) -1, 4, 96, 99, 296, (-5510), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
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
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = null;
        boolean boolean5 = readableInterval1.isBefore(readableInterval4);
        org.joda.time.DateTime dateTime6 = readableInterval1.getEnd();
        org.joda.time.MutableInterval mutableInterval7 = readableInterval1.toMutableInterval();
        org.joda.time.Interval interval8 = readableInterval1.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = interval8.toMutableInterval();
        org.joda.time.Duration duration10 = interval8.toDuration();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableInterval7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(mutableInterval9);
        org.junit.Assert.assertNotNull(duration10);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.joda.time.tz.DefaultNameProvider defaultNameProvider0 = new org.joda.time.tz.DefaultNameProvider();
        java.util.Locale locale1 = null;
        java.lang.String str4 = defaultNameProvider0.getName(locale1, "13", "69");
        org.joda.time.DateTimeZone.setNameProvider((org.joda.time.tz.NameProvider) defaultNameProvider0);
        java.util.Locale locale6 = null;
        java.lang.String str9 = defaultNameProvider0.getShortName(locale6, "69", "days");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = zonedChronology4.getDateTimeMillis((int) '#', (-1893415679), 3, 6691);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1893415679 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
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
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        long long4 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.getMillis(455808672000000L, 166726225165018L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.era();
        org.joda.time.DurationField durationField10 = zonedChronology4.centuries();
        long long12 = durationField10.getValueAsLong(0L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unsupportedDurationField1.getValue((-476134743445L), 173563311060000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getMillis(471);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.centuryOfEra();
        org.joda.time.DurationField durationField10 = zonedChronology4.weeks();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.weekyearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException("32", "hourOfDay");
        boolean boolean3 = org.joda.time.IllegalInstantException.isIllegalInstant((java.lang.Throwable) illegalFieldValueException2);
        java.lang.String str4 = illegalFieldValueException2.getIllegalValueAsString();
        java.lang.Number number5 = illegalFieldValueException2.getUpperBound();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hourOfDay" + "'", str4, "hourOfDay");
        org.junit.Assert.assertNull(number5);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        org.joda.time.Chronology chronology6 = null;
        boolean boolean7 = durationFieldType5.isSupported(chronology6);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[hours]" + "'", str4, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.joda.time.tz.DefaultNameProvider defaultNameProvider0 = new org.joda.time.tz.DefaultNameProvider();
        java.util.Locale locale1 = null;
        java.lang.String str4 = defaultNameProvider0.getName(locale1, "13", "69");
        java.util.Locale locale5 = null;
        java.lang.String str8 = defaultNameProvider0.getName(locale5, "31", "2023-11-29T12:19:27.691-08:00/2023-11-29T12:19:27.691-08:00");
        org.joda.time.DateTimeZone.setNameProvider((org.joda.time.tz.NameProvider) defaultNameProvider0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        long long4 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.add(0L, (-1893415679));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.era();
        org.joda.time.DateTimeZone dateTimeZone10 = zonedChronology4.getZone();
        int int12 = dateTimeZone10.getOffsetFromLocal((-476134754960L));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        long long4 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getMillis((-315585559));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField4 = gregorianChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology1.yearOfCentury();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "", 0, 4);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str7 = fixedDateTimeZone4.getName(97L);
        int int9 = fixedDateTimeZone4.getStandardOffset(31564800000L);
        int int11 = fixedDateTimeZone4.getStandardOffset(1701289160741L);
        java.lang.String str13 = fixedDateTimeZone4.getNameKey((long) 200);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        int int11 = gregorianChronology5.getMinimumDaysInFirstWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gregorianChronology5.getDateTimeMillis(53460006, 9, 197, 1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 197 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.add(10281600000L, 2117409001);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.hourOfHalfday();
        org.joda.time.DurationField durationField11 = zonedChronology4.minutes();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        int int6 = fixedDateTimeZone4.getStandardOffset((long) 1439);
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology8.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = dateTimeField9.getType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getValueAsLong(180000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException("UnsupportedDateTimeField", (java.lang.Number) 1701289172400L, (java.lang.Number) (-31507200000L), (java.lang.Number) 31380171L);
        java.lang.String str5 = illegalFieldValueException4.getFieldName();
        boolean boolean6 = org.joda.time.IllegalInstantException.isIllegalInstant((java.lang.Throwable) illegalFieldValueException4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UnsupportedDateTimeField" + "'", str5, "UnsupportedDateTimeField");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(2580268L);
        java.lang.String str8 = fixedDateTimeZone4.getShortName((-992391506L));
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((-476134763891L));
        long long12 = fixedDateTimeZone4.nextTransition((long) 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[America/Los_Angeles]" + "'", str6, "ISOChronology[America/Los_Angeles]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ISOChronology[America/Los_Angeles]" + "'", str10, "ISOChronology[America/Los_Angeles]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 4L + "'", long12 == 4L);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        boolean boolean3 = unsupportedDurationField1.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getDifferenceAsLong((-62072524800007L), (-6214039961954960L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        java.lang.String str5 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[100]" + "'", str5, "ISOChronology[100]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = null;
        boolean boolean5 = readableInterval1.isBefore(readableInterval4);
        long long6 = readableInterval1.getEndMillis();
        org.joda.time.Period period7 = readableInterval1.toPeriod();
        org.joda.time.Duration duration8 = readableInterval1.toDuration();
        long long9 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-504921600000L) + "'", long6 == (-504921600000L));
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str3 = dateTimeZone0.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone5 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone4);
        java.lang.String str6 = cachedDateTimeZone5.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(cachedDateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology5.dayOfYear();
        org.joda.time.ReadablePartial readablePartial12 = null;
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeField11.getAsText(readablePartial12, 1439, locale14);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField17 = new org.joda.time.field.OffsetDateTimeField(dateTimeField11, (-315585559));
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1439" + "'", str15, "1439");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.add(7063L, 2835106300L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone10 = zonedChronology4.getZone();
        boolean boolean11 = dateTimeZone10.isFixed();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("35", "hi!", (-7), (-5));
        int int6 = fixedDateTimeZone4.getStandardOffset((-476134754563L));
        java.lang.String str8 = fixedDateTimeZone4.getShortName(0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-5) + "'", int6 == (-5));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.007" + "'", str8, "-00:00:00.007");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        long long7 = iSOChronology0.getDateTimeMillis(1, 1, (int) (byte) 1, (int) (short) 100);
        org.joda.time.DurationField durationField8 = iSOChronology0.weeks();
        org.joda.time.DurationField durationField9 = iSOChronology0.days();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.dayOfMonth();
        java.lang.String str11 = dateTimeField10.getName();
        long long14 = dateTimeField10.add((long) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-62135596799900L) + "'", long7 == (-62135596799900L));
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "dayOfMonth" + "'", str11, "dayOfMonth");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 864000100L + "'", long14 == 864000100L);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unsupportedDurationField1.getValue((long) 28354759);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        org.joda.time.DurationFieldType durationFieldType3 = unsupportedDurationField1.getType();
        java.lang.String str4 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getValueAsLong(259695947701570L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        long long4 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        java.lang.String str6 = unsupportedDurationField1.toString();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnsupportedDurationField[hours]" + "'", str6, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hourOfDay", "197", 7, 7);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getName((-183661320863L), locale6);
        int int9 = fixedDateTimeZone4.getOffset((-39600494L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.007" + "'", str7, "+00:00:00.007");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        org.joda.time.DurationFieldType durationFieldType3 = unsupportedDurationField1.getType();
        java.lang.String str4 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.getMillis(14, 296907L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        long long4 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getValueAsLong((-476134723881L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        long long3 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getMillis((-476134734588L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology5.dayOfYear();
        org.joda.time.DurationField durationField12 = gregorianChronology5.eras();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology5.hourOfDay();
        int int14 = gregorianChronology5.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.era();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology5.secondOfDay();
        long long12 = gregorianChronology5.add((long) 100, 0L, 197);
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology5.dayOfYear();
        org.joda.time.DurationField durationField14 = gregorianChronology5.hours();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        java.lang.String str5 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[UTC]" + "'", str5, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("35", "hi!", (-7), (-5));
        int int6 = fixedDateTimeZone4.getStandardOffset((-476134754563L));
        long long8 = fixedDateTimeZone4.nextTransition((long) 6691);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-5) + "'", int6 == (-5));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 6691L + "'", long8 == 6691L);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        org.joda.time.DurationFieldType durationFieldType3 = unsupportedDurationField1.getType();
        java.lang.String str4 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unsupportedDurationField1.getValue((long) (-28799996));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        org.joda.time.Partial partial13 = new org.joda.time.Partial((org.joda.time.ReadablePartial) partial11);
        java.lang.String str14 = partial13.toString();
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        long long4 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.add(291L, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.millisOfDay();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.dayOfMonth();
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
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.joda.time.ReadablePartial readablePartial0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial1 = new org.joda.time.Partial(readablePartial0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = zonedChronology4.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = zonedChronology4.getZone();
        org.joda.time.DurationField durationField11 = zonedChronology4.halfdays();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.Duration duration4 = readableInterval1.toDuration();
        org.joda.time.DateTime dateTime5 = readableInterval1.getEnd();
        org.joda.time.Period period6 = readableInterval1.toPeriod();
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.DateTime dateTime9 = readableInterval8.getEnd();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        org.joda.time.DurationFieldType durationFieldType3 = unsupportedDurationField1.getType();
        java.lang.String str4 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getValueAsLong(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "", 0, 4);
        long long6 = fixedDateTimeZone4.previousTransition(2102400001L);
        long long8 = fixedDateTimeZone4.nextTransition((-17481235597L));
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(922462214214515017L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2102400001L + "'", long6 == 2102400001L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-17481235597L) + "'", long8 == (-17481235597L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        boolean boolean5 = unsupportedDurationField1.isSupported();
        java.lang.String str6 = unsupportedDurationField1.toString();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnsupportedDurationField[hours]" + "'", str6, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        long long4 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unsupportedDurationField1.getValue(100L, 3437656380000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.DividedDateTimeField dividedDateTimeField3 = new org.joda.time.field.DividedDateTimeField(dateTimeField0, dateTimeFieldType1, 296907);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        org.joda.time.DurationFieldType durationFieldType3 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.add((-30610224000000L), 195);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(durationFieldType3);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        boolean boolean3 = unsupportedDurationField1.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unsupportedDurationField1.getValue((-476134750838L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology5.getZone();
        org.joda.time.DurationField durationField8 = gregorianChronology5.millis();
        org.joda.time.DurationField durationField9 = gregorianChronology5.minutes();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology5.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone11 = gregorianChronology5.getZone();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology5.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology5.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology5.secondOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology5.minuteOfDay();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        boolean boolean3 = unsupportedDurationField1.isPrecise();
        java.lang.String str4 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.getMillis((-11021), 1701292973409L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 60035L, "");
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.IllegalFieldValueException illegalFieldValueException7 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType4, (java.lang.Number) 10L, "hourOfDay");
        java.lang.String str8 = illegalFieldValueException7.getIllegalValueAsString();
        illegalFieldValueException3.addSuppressed((java.lang.Throwable) illegalFieldValueException7);
        java.lang.String str10 = illegalFieldValueException7.getFieldName();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "dayOfYear" + "'", str10, "dayOfYear");
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology5.dayOfYear();
        org.joda.time.DurationField durationField12 = gregorianChronology5.eras();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology5.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology5.yearOfEra();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = iSOChronology0.halfdays();
        long long10 = durationField7.getValueAsLong((-476134725557L), 3335L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-11021L) + "'", long10 == (-11021L));
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder2.addRecurringSavings("1", (int) (byte) -1, (int) (byte) 1, (int) ' ', 'a', (int) 'a', (int) (byte) 1, (int) (short) 10, true, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        boolean boolean5 = unsupportedDurationField1.isPrecise();
        boolean boolean6 = unsupportedDurationField1.isSupported();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        boolean boolean3 = unsupportedDurationField1.isPrecise();
        java.lang.String str4 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unsupportedDurationField1.getDifference(588244621852800000L, (long) (-68));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        long long2 = readableInterval1.getStartMillis();
        org.joda.time.ReadableInterval readableInterval3 = null;
        boolean boolean4 = readableInterval1.isAfter(readableInterval3);
        org.joda.time.Interval interval5 = readableInterval1.toInterval();
        java.lang.String str6 = interval5.toString();
        org.joda.time.MutableInterval mutableInterval7 = interval5.toMutableInterval();
        org.junit.Assert.assertNotNull(readableInterval1);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1701289617882L + "'", long2 == 1701289617882L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(interval5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2023-11-29T20:26:57.882Z/2023-11-29T20:26:57.882Z" + "'", str6, "2023-11-29T20:26:57.882Z/2023-11-29T20:26:57.882Z");
        org.junit.Assert.assertNotNull(mutableInterval7);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.PreciseDurationField preciseDurationField2 = new org.joda.time.field.PreciseDurationField(durationFieldType0, (long) 28354759);
        long long5 = preciseDurationField2.getMillis(0L, 2173737600000L);
        long long8 = preciseDurationField2.subtract((-139582L), 0L);
        long long11 = preciseDurationField2.getMillis((-1), 17539063634L);
        long long14 = preciseDurationField2.getDifferenceAsLong((-1L), (long) 53324);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-139582L) + "'", long8 == (-139582L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-28354759L) + "'", long11 == (-28354759L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.DurationField durationField6 = durationFieldType0.getField(chronology3);
        org.joda.time.Partial partial7 = new org.joda.time.Partial(chronology3);
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = partial7.getFields();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray8);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        int int6 = fixedDateTimeZone4.getStandardOffset((long) 1439);
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology8.weekyearOfCentury();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        long long4 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getMillis(2900521162108L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.Chronology chronology3 = iSOChronology0.withZone(dateTimeZone1);
        org.joda.time.DurationField durationField4 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = partial0.isAfter(readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.weekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = zonedChronology4.getZone();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "", 0, 4);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str7 = fixedDateTimeZone4.getName(97L);
        int int9 = fixedDateTimeZone4.getStandardOffset(31564800000L);
        org.joda.time.chrono.ISOChronology iSOChronology10 = org.joda.time.chrono.ISOChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(iSOChronology10);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        long long4 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unsupportedDurationField1.getValue((long) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField5 = zonedChronology4.secondOfDay();
        long long9 = zonedChronology4.add((long) 4, (-476134715294L), 60000);
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.yearOfEra();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-28568082917639996L) + "'", long9 == (-28568082917639996L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DurationField durationField11 = gregorianChronology5.halfdays();
        org.joda.time.Partial partial12 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology5);
        int int13 = gregorianChronology5.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField14 = gregorianChronology5.hours();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.OffsetDateTimeField offsetDateTimeField5 = new org.joda.time.field.OffsetDateTimeField(dateTimeField0, dateTimeFieldType1, 0, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        long long6 = fixedDateTimeZone4.nextTransition(0L);
        int int8 = fixedDateTimeZone4.getStandardOffset(2440588L);
        long long10 = fixedDateTimeZone4.previousTransition(86400028L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400028L + "'", long10 == 86400028L);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("UTC", 28, 28354819, 100, 'a', 73, 7, 296907, true, 0);
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder11.writeTo("months", outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getValueAsLong(3395L, (-476134715294L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.add((-476134739671L), 1701260510770L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        boolean boolean3 = unsupportedDurationField1.isPrecise();
        java.lang.String str4 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.getMillis(196, (-39381L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder2.addCutover(183276, '#', 14, 3, 59, false, 74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.Chronology chronology5 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField8 = iSOChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        int int6 = fixedDateTimeZone4.getStandardOffset((long) 24);
        int int8 = fixedDateTimeZone4.getStandardOffset(1893456000000L);
        java.lang.String str9 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100" + "'", str9, "100");
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DurationField durationField11 = gregorianChronology5.halfdays();
        org.joda.time.Partial partial12 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology5);
        int int13 = gregorianChronology5.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology5.millisOfSecond();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        int int6 = fixedDateTimeZone4.getStandardOffset((long) 1439);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey(0L);
        int int11 = fixedDateTimeZone4.getOffset(31564800000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ISOChronology[America/Los_Angeles]" + "'", str9, "ISOChronology[America/Los_Angeles]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        long long3 = unsupportedDurationField1.getUnitMillis();
        boolean boolean4 = unsupportedDurationField1.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unsupportedDurationField1.getValue((long) 471, (long) (-751463));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        long long6 = fixedDateTimeZone4.nextTransition(0L);
        int int8 = fixedDateTimeZone4.getOffset(100L);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone9 = org.joda.time.tz.CachedDateTimeZone.forZone((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getStandardOffset((-2177452800009L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(cachedDateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unsupportedDurationField1.getDifference(1701289170819L, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getValueAsLong((-210866817600000L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        long long4 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getMillis(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        java.lang.Class<?> wildcardClass1 = dateTimeFieldType0.getClass();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.PreciseDurationField preciseDurationField3 = new org.joda.time.field.PreciseDurationField(durationFieldType1, 0L);
        long long6 = preciseDurationField3.add((-60505833599976L), (long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = preciseDurationField3.getValueAsLong(0L, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60505833599976L) + "'", long6 == (-60505833599976L));
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        boolean boolean3 = unsupportedDurationField1.isPrecise();
        java.lang.String str4 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.add((-476134772649L), (-634L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, "2023-11-29T12:19:27.125-08:00/2023-11-29T12:19:27.125-08:00");
        java.lang.Number number3 = illegalFieldValueException2.getUpperBound();
        java.lang.String str4 = illegalFieldValueException2.getIllegalValueAsString();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2023-11-29T12:19:27.125-08:00/2023-11-29T12:19:27.125-08:00" + "'", str4, "2023-11-29T12:19:27.125-08:00/2023-11-29T12:19:27.125-08:00");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DurationField durationField11 = gregorianChronology5.halfdays();
        org.joda.time.Partial partial12 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.DurationField durationField13 = gregorianChronology5.millis();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology5.hourOfDay();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DurationField durationField11 = gregorianChronology5.halfdays();
        org.joda.time.Partial partial12 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.DurationField durationField13 = gregorianChronology5.millis();
        org.joda.time.DateTimeZone dateTimeZone14 = gregorianChronology5.getZone();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.minuteOfHour();
        boolean boolean9 = gregorianChronology5.equals((java.lang.Object) (-2173831554426L));
        org.joda.time.DurationField durationField10 = gregorianChronology5.hours();
        int int11 = gregorianChronology5.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DurationField durationField11 = gregorianChronology5.halfdays();
        org.joda.time.Partial partial12 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.DurationField durationField13 = gregorianChronology5.millis();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology5.monthOfYear();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        boolean boolean3 = unsupportedDurationField1.isPrecise();
        java.lang.String str4 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unsupportedDurationField1.getValue(9223372014350400000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.add((-31536000007L), 21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 2440587L, "Thu");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        java.lang.String str1 = durationFieldType0.toString();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(durationFieldType0, "17");
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "days" + "'", str1, "days");
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.year();
        org.joda.time.DurationField durationField6 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField7 = iSOChronology0.years();
        org.joda.time.DurationField durationField8 = iSOChronology0.millis();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial2 = new org.joda.time.Partial(dateTimeFieldType0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        boolean boolean3 = unsupportedDurationField1.isPrecise();
        java.lang.String str4 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.getMillis(38, 315524864422L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial2 = new org.joda.time.Partial(dateTimeFieldType0, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getValueAsLong(1638217172564L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) (-46185073064226L), (java.lang.Number) 1701289167159L, (java.lang.Number) 29227899L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.eras();
        org.joda.time.DurationFieldType durationFieldType7 = durationField6.getType();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationFieldType7);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 18915L, "1672560000000");
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.months();
        java.lang.String str1 = durationFieldType0.toString();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "months" + "'", str1, "months");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.hourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DurationField durationField4 = iSOChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField6 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField7 = iSOChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.dayOfMonth();
        long long10 = dateTimeField8.roundCeiling(41506203L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86399993L + "'", long10 == 86399993L);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getDifferenceAsLong((-315619200000L), (-1454470837707L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.dayOfWeek();
        org.joda.time.DurationField durationField8 = iSOChronology0.weekyears();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.Chronology chronology5 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfYear();
        org.joda.time.DurationField durationField7 = iSOChronology0.millis();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.weekyear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial2 = new org.joda.time.Partial(dateTimeFieldType0, 1439);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.Partial partial2 = new org.joda.time.Partial(dateTimeFieldType0, 190);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.PreciseDurationField preciseDurationField2 = new org.joda.time.field.PreciseDurationField(durationFieldType0, (long) 28354759);
        org.joda.time.DurationFieldType durationFieldType3 = preciseDurationField2.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException5 = new org.joda.time.IllegalFieldValueException(durationFieldType3, "1954-11-30T04:21:20.611Z/1954-11-30T04:21:20.611Z");
        org.joda.time.field.PreciseDurationField preciseDurationField7 = new org.joda.time.field.PreciseDurationField(durationFieldType3, 3405356356140L);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = readableInterval1.toPeriod(periodType4);
        org.joda.time.DateTime dateTime6 = readableInterval1.getEnd();
        org.joda.time.MutableInterval mutableInterval7 = readableInterval1.toMutableInterval();
        org.joda.time.Period period8 = readableInterval1.toPeriod();
        org.joda.time.ReadableInstant readableInstant9 = null;
        boolean boolean10 = readableInterval1.isAfter(readableInstant9);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableInterval7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 1701289172564L, "org.joda.time.IllegalFieldValueException: Value 10 for dayOfYear is not supported: hourOfDay");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Partial partial7 = new org.joda.time.Partial(dateTimeFieldType0, 4, chronology6);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        java.lang.Number number3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 306607L, (java.lang.Number) 1225154538244L, number3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.PreciseDurationField preciseDurationField3 = new org.joda.time.field.PreciseDurationField(durationFieldType1, 28354819L);
        long long6 = preciseDurationField3.getMillis(60035L, (-210866846400000L));
        long long9 = preciseDurationField3.getMillis((long) (short) -1, 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1702281558665L + "'", long6 == 1702281558665L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-28354819L) + "'", long9 == (-28354819L));
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = iSOChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology0.getDateTimeMillis(17L, 59, (int) (byte) 10, (-21674226), 28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        long long3 = unsupportedDurationField1.getUnitMillis();
        long long4 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unsupportedDurationField1.getValue(1701289162205L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.eras();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.weekOfWeekyear();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 60035L, "");
        java.lang.Throwable[] throwableArray4 = illegalFieldValueException3.getSuppressed();
        java.lang.String str5 = illegalFieldValueException3.getIllegalStringValue();
        java.lang.String str6 = illegalFieldValueException3.getFieldName();
        org.joda.time.DurationFieldType durationFieldType7 = illegalFieldValueException3.getDurationFieldType();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hourOfDay" + "'", str6, "hourOfDay");
        org.junit.Assert.assertNull(durationFieldType7);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unsupportedDurationField1.getDifference((long) (short) 100, (-476134761769L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        boolean boolean3 = unsupportedDurationField1.isPrecise();
        java.lang.String str4 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unsupportedDurationField1.getValue((-53L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        long long3 = unsupportedDurationField1.getUnitMillis();
        boolean boolean4 = unsupportedDurationField1.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unsupportedDurationField1.getValue(1701260510770L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.eras();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.yearOfCentury();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        long long3 = unsupportedDurationField1.getUnitMillis();
        boolean boolean4 = unsupportedDurationField1.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.add((-28354819L), 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.Chronology chronology1 = null;
        boolean boolean2 = durationFieldType0.isSupported(chronology1);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField3 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField3.getMillis(0L, 1439L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weeks field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(unsupportedDurationField3);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        long long4 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        java.lang.String str6 = durationFieldType5.toString();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hours" + "'", str6, "hours");
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.eras();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.weekyear();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 60035L, "");
        java.lang.String str4 = illegalFieldValueException3.getIllegalValueAsString();
        java.lang.String str5 = illegalFieldValueException3.getFieldName();
        java.lang.Number number6 = illegalFieldValueException3.getIllegalNumberValue();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "60035" + "'", str4, "60035");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hourOfDay" + "'", str5, "hourOfDay");
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 60035L + "'", number6, 60035L);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unsupportedDurationField1.getValue(1701289186764L, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        java.lang.String str9 = zonedChronology4.toString();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.minuteOfHour();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str9, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.Object obj2 = null;
        boolean boolean3 = unsupportedDurationField1.equals(obj2);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField2 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType1);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(unsupportedDurationField2);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial2 = new org.joda.time.Partial(dateTimeFieldType0, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getMillis(103664620800000L, (long) 29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.PreciseDurationField preciseDurationField3 = new org.joda.time.field.PreciseDurationField(durationFieldType1, 28354819L);
        long long4 = preciseDurationField3.getUnitMillis();
        long long7 = preciseDurationField3.add(9223372014351583455L, 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 28354819L + "'", long4 == 28354819L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372014351583455L + "'", long7 == 9223372014351583455L);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getDifferenceAsLong((-60505833599976L), (-53459996L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.add((-4453608L), (-5510));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.halfdays();
        org.joda.time.DurationField durationField7 = chronology3.centuries();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getMillis(9642225L, 15619000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        long long7 = iSOChronology0.getDateTimeMillis(1, 1, (int) (byte) 1, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str9 = dateTimeZone8.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology10 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone8);
        int int12 = dateTimeZone8.getOffset((-210858120422000L));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-62135596799907L) + "'", long7 == (-62135596799907L));
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(1L, locale6);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone9 = cachedDateTimeZone8.getUncachedZone();
        long long11 = cachedDateTimeZone8.nextTransition(588244621852799997L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 588244621852799997L + "'", long11 == 588244621852799997L);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getMillis(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DurationFieldType durationFieldType2 = unsupportedDurationField1.getType();
        org.joda.time.DurationFieldType durationFieldType3 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unsupportedDurationField1.getValue((-476134763511L), (-476134744301L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.PreciseDurationField preciseDurationField2 = new org.joda.time.field.PreciseDurationField(durationFieldType0, (long) 28354759);
        long long5 = preciseDurationField2.getValueAsLong(0L, (-3155695200000L));
        long long8 = preciseDurationField2.getMillis(13, (long) (short) -1);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 368611867L + "'", long8 == 368611867L);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = unsupportedDurationField1.getMillis((-97L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.add((-476134751380L), 1701291599993L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: days field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isPrecise();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.year();
        java.lang.String str4 = iSOChronology0.toString();
        org.joda.time.Partial partial5 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = partial5.toString("DurationField[hours]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: u");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[100]" + "'", str4, "ISOChronology[100]");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 10L, "hourOfDay");
        java.lang.String str4 = illegalFieldValueException3.getIllegalValueAsString();
        java.lang.Number number5 = illegalFieldValueException3.getUpperBound();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNull(number5);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology0.days();
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.clockhourOfDay();
        java.lang.String str7 = iSOChronology0.toString();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ISOChronology[UTC]" + "'", str7, "ISOChronology[UTC]");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getMillis((-1), (-1893456000000L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.add(255193371L, 59);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.add(946713600000L, (-28800000));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.Partial partial2 = new org.joda.time.Partial(dateTimeFieldType0, 100);
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, "minuteOfDay");
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.lang.String str5 = zonedChronology4.toString();
        org.joda.time.DurationField durationField6 = zonedChronology4.minutes();
        long long8 = durationField6.getMillis(1701289169842L);
        int int11 = durationField6.getValue(16725225600000L, 5681L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str5, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102077350190520000L + "'", long8 == 102077350190520000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 278753760 + "'", int11 == 278753760);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.PreciseDurationField preciseDurationField2 = new org.joda.time.field.PreciseDurationField(durationFieldType0, (long) 28354759);
        long long5 = preciseDurationField2.getMillis(0L, 2173737600000L);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getDifferenceAsLong((long) 59, 1704096000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = unsupportedDurationField1.getMillis((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.add(180000L, 74);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.add(190993L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        java.lang.String str5 = unsupportedDurationField1.getName();
        long long6 = unsupportedDurationField1.getUnitMillis();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getDifferenceAsLong((long) 8, 53459998L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.PreciseDurationField preciseDurationField3 = new org.joda.time.field.PreciseDurationField(durationFieldType1, 0L);
        long long6 = preciseDurationField3.add(1L, 97L);
        boolean boolean7 = preciseDurationField3.isPrecise();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getMillis((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = unsupportedDurationField1.getDifference(1701289170625L, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.minuteOfHour();
        org.joda.time.DurationField durationField8 = gregorianChronology5.years();
        org.joda.time.DurationField durationField9 = gregorianChronology5.minutes();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology5.dayOfMonth();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getMillis((-28800000));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        boolean boolean3 = unsupportedDurationField1.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getValueAsLong((-476134731634L), 1701289179712L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        long long7 = iSOChronology0.getDateTimeMillis(1, 1, (int) (byte) 1, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str9 = dateTimeZone8.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology10 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology10.millisOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-62135596799900L) + "'", long7 == (-62135596799900L));
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.add(1577836800000L, (long) 58571700);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unsupportedDurationField1.getValue((long) 32, (-31L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.weekOfWeekyear();
        java.lang.String str9 = zonedChronology4.toString();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str9, "ZonedChronology[ISOChronology[UTC], UTC]");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 10L, "hourOfDay");
        java.lang.String str4 = illegalFieldValueException3.getIllegalValueAsString();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = illegalFieldValueException3.getDateTimeFieldType();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.PreciseDurationField preciseDurationField3 = new org.joda.time.field.PreciseDurationField(durationFieldType1, 0L);
        long long6 = preciseDurationField3.add(1L, 97L);
        long long9 = preciseDurationField3.getMillis(0L, 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 10L, "hourOfDay");
        org.joda.time.IllegalFieldValueException illegalFieldValueException6 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 1672560000000L, "America/Los_Angeles");
        java.lang.String str7 = illegalFieldValueException6.getIllegalValueAsString();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1672560000000" + "'", str7, "1672560000000");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unsupportedDurationField1.getValue((long) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DurationFieldType durationFieldType2 = unsupportedDurationField1.getType();
        org.joda.time.DurationFieldType durationFieldType3 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getValueAsLong(190993L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.field.PreciseDurationField preciseDurationField2 = new org.joda.time.field.PreciseDurationField(durationFieldType0, (long) 'a');
        long long5 = preciseDurationField2.add((-534470L), (long) (short) 10);
        long long8 = preciseDurationField2.getMillis((-476134742634L), 0L);
        boolean boolean9 = preciseDurationField2.isPrecise();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-533500L) + "'", long5 == (-533500L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-46185070035498L) + "'", long8 == (-46185070035498L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = unsupportedDurationField1.getValue(28800004L, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unsupportedDurationField1.getValue(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DurationFieldType durationFieldType2 = unsupportedDurationField1.getType();
        org.joda.time.DurationFieldType durationFieldType3 = unsupportedDurationField1.getType();
        java.lang.String str4 = unsupportedDurationField1.getName();
        boolean boolean6 = unsupportedDurationField1.equals((java.lang.Object) "minutes");
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        org.joda.time.DurationFieldType durationFieldType3 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getMillis(139583L, 31536000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.PreciseDurationField preciseDurationField2 = new org.joda.time.field.PreciseDurationField(durationFieldType0, (long) 28354759);
        org.joda.time.DurationFieldType durationFieldType3 = preciseDurationField2.getType();
        boolean boolean5 = preciseDurationField2.equals((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.add(1701289161428L, 1701289170697L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        org.joda.time.DurationFieldType durationFieldType3 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getMillis(1439, 57531022L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        org.joda.time.DurationFieldType durationFieldType3 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getMillis(3600009L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.PreciseDurationField preciseDurationField3 = new org.joda.time.field.PreciseDurationField(durationFieldType1, 28354819L);
        java.lang.Object obj4 = null;
        boolean boolean5 = preciseDurationField3.equals(obj4);
        boolean boolean6 = preciseDurationField3.isSupported();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getMillis((-31507200000L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getDifferenceAsLong(1701289608136L, (-6932109094395L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: days field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        org.joda.time.DurationFieldType durationFieldType3 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unsupportedDurationField1.getValue((-476134773858L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DurationField durationField4 = iSOChronology0.weeks();
        org.joda.time.DurationField durationField5 = iSOChronology0.halfdays();
        org.joda.time.DurationField durationField6 = iSOChronology0.weekyears();
        long long9 = durationField6.getMillis(0, (long) 28);
        long long12 = durationField6.getMillis(719, (-159176534399281L));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 22689676800000L + "'", long12 == 22689676800000L);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology5.getZone();
        org.joda.time.DurationField durationField8 = gregorianChronology5.millis();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology5.minuteOfDay();
        org.joda.time.DurationField durationField10 = dateTimeField9.getDurationField();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology5.dayOfYear();
        org.joda.time.DurationField durationField12 = gregorianChronology5.eras();
        org.joda.time.Partial partial13 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology5);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        org.joda.time.DurationFieldType durationFieldType3 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unsupportedDurationField1.getValue((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = durationFieldType1.toString();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "weeks" + "'", str2, "weeks");
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = partial0.getValue(199);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 199");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.Chronology chronology3 = iSOChronology0.withZone(dateTimeZone1);
        org.joda.time.DurationField durationField4 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unsupportedDurationField1.getDifference(18526321L, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getMillis(73);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DurationField durationField6 = gregorianChronology5.days();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gregorianChronology5.getDateTimeMillis(100, 1889, (-190992), (-28799996));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -28799996 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        org.joda.time.DurationFieldType durationFieldType3 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getMillis(296);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = unsupportedDurationField1.getDifference((long) 199, 2835106203L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology5.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone9 = gregorianChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology5.halfdayOfDay();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        org.joda.time.DurationFieldType durationFieldType3 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unsupportedDurationField1.getValue((-28799995L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone6 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        org.joda.time.DurationFieldType durationFieldType3 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getMillis(0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unsupportedDurationField1.getValue(1L, (-210858120422000L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getMillis((-2173831554426L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology5.dayOfYear();
        org.joda.time.DurationField durationField12 = gregorianChronology5.eras();
        org.joda.time.DateTimeZone dateTimeZone13 = gregorianChronology5.getZone();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfSecond();
        org.joda.time.Chronology chronology3 = iSOChronology0.withUTC();
        org.joda.time.DurationField durationField4 = iSOChronology0.weekyears();
        org.joda.time.Chronology chronology5 = iSOChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = iSOChronology0.add(readablePeriod6, 2835481900L, (int) (short) 0);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2835481900L + "'", long9 == 2835481900L);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.Chronology chronology5 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.clockhourOfDay();
        java.lang.String str7 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ISOChronology[73]" + "'", str7, "ISOChronology[73]");
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        org.joda.time.DurationFieldType durationFieldType3 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unsupportedDurationField1.getValue((long) 53460006);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.lang.String str5 = zonedChronology4.toString();
        org.joda.time.DurationField durationField6 = zonedChronology4.minutes();
        long long8 = durationField6.getMillis(1701289169842L);
        java.lang.String str9 = durationField6.getName();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str5, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102077350190520000L + "'", long8 == 102077350190520000L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "minutes" + "'", str9, "minutes");
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unsupportedDurationField1.getValue((long) 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unsupportedDurationField1.getValue(0L, 3600009L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.Partial partial2 = new org.joda.time.Partial(dateTimeFieldType0, 100);
        int int4 = partial2.getValue(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField6 = partial2.getField((-21674226));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -21674226");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        java.lang.String str2 = readableInterval1.toString();
        org.junit.Assert.assertNotNull(readableInterval1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2023-11-29T12:19:48.798-08:00/2023-11-29T12:19:48.798-08:00" + "'", str2, "2023-11-29T12:19:48.798-08:00/2023-11-29T12:19:48.798-08:00");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.subtract((long) 60000, (long) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.yearOfCentury();
        boolean boolean11 = zonedChronology4.equals((java.lang.Object) 1638217172564L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.lang.String str5 = zonedChronology4.toString();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.millisOfDay();
        org.joda.time.DurationField durationField7 = zonedChronology4.seconds();
        long long9 = durationField7.getMillis((-476134743461L));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str5, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-476134743461000L) + "'", long9 == (-476134743461000L));
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DurationField durationField6 = gregorianChronology5.days();
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = gregorianChronology5.seconds();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getMillis(100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        boolean boolean3 = unsupportedDurationField1.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getMillis(5184000000L, 114669905162471L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DurationField durationField11 = gregorianChronology5.halfdays();
        org.joda.time.Partial partial12 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology5.monthOfYear();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        long long4 = unsupportedDurationField1.getUnitMillis();
        boolean boolean5 = unsupportedDurationField1.isPrecise();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getValueAsLong((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DurationFieldType durationFieldType2 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getMillis((-472580), (-29855590310655L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertNotNull(durationFieldType2);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.minuteOfDay();
        int int5 = dateTimeField4.getMinimumValue();
        long long8 = dateTimeField4.add(0L, (long) (byte) 1);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeField4.getAsText((int) (byte) 1, locale10);
        java.util.Locale locale12 = null;
        int int13 = dateTimeField4.getMaximumTextLength(locale12);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60000L + "'", long8 == 60000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = null;
        boolean boolean5 = readableInterval1.isBefore(readableInterval4);
        long long6 = readableInterval1.getEndMillis();
        org.joda.time.Chronology chronology7 = readableInterval1.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.centuries();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1701289605198L + "'", long6 == 1701289605198L);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DurationField durationField6 = gregorianChronology5.days();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology5.era();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology5.clockhourOfDay();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = gregorianChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology5.dayOfWeek();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getMillis(0, (-476134743445L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField5 = iSOChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.hourOfDay();
        org.joda.time.Partial partial7 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology0);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = null;
        boolean boolean5 = readableInterval1.isBefore(readableInterval4);
        org.joda.time.Interval interval6 = readableInterval1.toInterval();
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        long long8 = readableInterval1.toDurationMillis();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(1L, locale6);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone9 = cachedDateTimeZone8.getUncachedZone();
        int int11 = cachedDateTimeZone8.getStandardOffset(62167104000004L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[hours]" + "'", str4, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DurationFieldType durationFieldType2 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getDifferenceAsLong(0L, 1136300384379601261L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertNotNull(durationFieldType2);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        boolean boolean3 = unsupportedDurationField1.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getValueAsLong((-6027150136924300L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfSecond();
        org.joda.time.Chronology chronology3 = iSOChronology0.withUTC();
        org.joda.time.Partial partial4 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField5 = iSOChronology0.weekyears();
        long long8 = durationField5.subtract(1225154544139L, (-1968));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 63329042544139L + "'", long8 == 63329042544139L);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.Duration duration4 = readableInterval1.toDuration();
        org.joda.time.MutableInterval mutableInterval5 = readableInterval1.toMutableInterval();
        long long6 = readableInterval1.getStartMillis();
        boolean boolean8 = readableInterval1.equals((java.lang.Object) 349200000L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(mutableInterval5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-210861660779418L) + "'", long6 == (-210861660779418L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.secondOfDay();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone6 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = gregorianChronology7.getZone();
        org.joda.time.Chronology chronology9 = iSOChronology0.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.year();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType11 = partial0.getFieldType(9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.Chronology chronology3 = iSOChronology0.withZone(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        long long3 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.add(3160L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField11 = partial0.getField((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        long long3 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.add(1669781969458L, 4908568725L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DurationField durationField6 = gregorianChronology5.hours();
        java.lang.String str7 = gregorianChronology5.toString();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GregorianChronology[100]" + "'", str7, "GregorianChronology[100]");
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.Partial partial2 = new org.joda.time.Partial(dateTimeFieldType0, 100);
        int int3 = partial2.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType5 = partial2.getFieldType((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        long long3 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getValueAsLong((-476134712641L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        long long2 = readableInterval1.getStartMillis();
        org.joda.time.Duration duration3 = readableInterval1.toDuration();
        long long4 = readableInterval1.toDurationMillis();
        org.joda.time.Period period5 = readableInterval1.toPeriod();
        org.joda.time.MutableInterval mutableInterval6 = readableInterval1.toMutableInterval();
        org.junit.Assert.assertNotNull(readableInterval1);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1701260509270L + "'", long2 == 1701260509270L);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutableInterval6);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = iSOChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyearOfCentury();
        long long6 = dateTimeField4.roundHalfEven((-70510730125093589L));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-70510727318400000L) + "'", long6 == (-70510727318400000L));
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gregorianChronology5.getDateTimeMillis(0, (int) (byte) 10, 32, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getMillis(9700L, (-476134755948L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        long long3 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getValueAsLong(970L, (long) (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        int int11 = gregorianChronology5.getMinimumDaysInFirstWeek();
        org.joda.time.Chronology chronology12 = gregorianChronology5.withUTC();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDateTimeField6.roundCeiling(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long9 = dateTimeZone6.adjustOffset(1701289183455L, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1701289183455L + "'", long9 == 1701289183455L);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(1L, locale6);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone2);
        int int10 = cachedDateTimeZone8.getOffset((long) 5);
        int int12 = cachedDateTimeZone8.getStandardOffset((long) (-28799992));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = zonedChronology4.getZone();
        java.lang.String str11 = dateTimeZone9.getShortName(2835481900L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unsupportedDurationField1.getDifference(1702281558665L, (-31L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getDifferenceAsLong(5L, (-31556880000000L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.Chronology chronology11 = gregorianChronology5.withUTC();
        org.joda.time.DurationField durationField12 = gregorianChronology5.days();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getMillis(28354759, 2963593164695L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.Duration duration4 = readableInterval1.toDuration();
        org.joda.time.MutableInterval mutableInterval5 = readableInterval1.toMutableInterval();
        org.joda.time.ReadableInstant readableInstant6 = null;
        boolean boolean7 = readableInterval1.isAfter(readableInstant6);
        org.joda.time.Chronology chronology8 = readableInterval1.getChronology();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField5 = iSOChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.era();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getDifferenceAsLong(1701260513284L, 3600009L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getValueAsLong((-28568082917639996L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = iSOChronology0.millis();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = iSOChronology0.getDateTimeMillis(11, (-9632622), (int) ' ', 32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -9632622 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.add(1701289161428L, 28800010L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField5 = iSOChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.dayOfWeek();
        long long11 = dateTimeField8.addWrapField((-476134747656L), 0);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-476134747656L) + "'", long11 == (-476134747656L));
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.Duration duration4 = readableInterval1.toDuration();
        java.lang.String str5 = readableInterval1.toString();
        org.joda.time.Duration duration6 = readableInterval1.toDuration();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(duration4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1954-11-29T20:20:27.737-08:00/1954-11-29T20:20:27.737-08:00" + "'", str5, "1954-11-29T20:20:27.737-08:00/1954-11-29T20:20:27.737-08:00");
        org.junit.Assert.assertNotNull(duration6);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        long long7 = iSOChronology0.getDateTimeMillis(1, 1, (int) (byte) 1, (int) (short) 100);
        org.joda.time.DurationField durationField8 = iSOChronology0.weeks();
        org.joda.time.DurationField durationField9 = iSOChronology0.days();
        org.joda.time.DurationField durationField10 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-62135596799907L) + "'", long7 == (-62135596799907L));
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology0.days();
        org.joda.time.DurationField durationField5 = iSOChronology0.months();
        org.joda.time.Chronology chronology6 = iSOChronology0.withUTC();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology5.dayOfYear();
        org.joda.time.DurationField durationField12 = gregorianChronology5.millis();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.Chronology chronology3 = iSOChronology0.withZone(dateTimeZone1);
        org.joda.time.DurationField durationField4 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.era();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = readableInterval1.toPeriod(periodType4);
        org.joda.time.DateTime dateTime6 = readableInterval1.getEnd();
        org.joda.time.MutableInterval mutableInterval7 = readableInterval1.toMutableInterval();
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.Chronology chronology3 = iSOChronology0.withZone(dateTimeZone1);
        java.lang.String str5 = dateTimeZone1.getName(222926773380171L);
        int int7 = dateTimeZone1.getStandardOffset(9088400374460359810L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfSecond();
        org.joda.time.Chronology chronology3 = iSOChronology0.withUTC();
        org.joda.time.Partial partial4 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology0);
        long long8 = iSOChronology0.add((-476134772251L), 284028180171L, 0);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-476134772251L) + "'", long8 == (-476134772251L));
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unsupportedDurationField1.getValue(1701289161914L, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField5 = iSOChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = iSOChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.Chronology chronology5 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField8 = dateTimeField7.getRangeDurationField();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getDifferenceAsLong(2173737600000L, (-476134773354L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DurationField durationField6 = gregorianChronology5.millis();
        org.joda.time.DurationField durationField7 = gregorianChronology5.hours();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getMillis((-6932109094395L), 62167104000004L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.clockhourOfDay();
        java.util.Locale locale5 = null;
        int int6 = dateTimeField4.getMaximumShortTextLength(locale5);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unsupportedDurationField1.getDifference((long) 1969, (long) (-28800000));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        org.joda.time.DurationField durationField7 = gregorianChronology5.minutes();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.minutes();
        org.joda.time.DurationField durationField5 = chronology2.halfdays();
        org.joda.time.DurationField durationField6 = chronology2.weeks();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.millisOfDay();
        long long9 = dateTimeField7.roundFloor(0L);
        boolean boolean10 = dateTimeField7.isLenient();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getMillis((-139582L), 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        org.joda.time.DurationFieldType durationFieldType3 = unsupportedDurationField1.getType();
        java.lang.String str4 = unsupportedDurationField1.getName();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfSecond();
        org.joda.time.Chronology chronology3 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.centuryOfEra();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfSecond();
        org.joda.time.Chronology chronology3 = iSOChronology0.withUTC();
        org.joda.time.Partial partial4 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unsupportedDurationField1.getValue(1701288000000L, 1701289179712L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unsupportedDurationField1.getValue(1701289160741L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int int5 = dateTimeField3.getMinimumValue(readablePartial4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeField3.getAsShortText(0L, locale7);
        org.joda.time.DurationField durationField9 = dateTimeField3.getDurationField();
        boolean boolean10 = durationField9.isSupported();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "70" + "'", str8, "70");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unsupportedDurationField1.getValue(1701289165018L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.add(1701288000000L, (long) 19691);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfSecond();
        org.joda.time.Chronology chronology3 = iSOChronology0.withUTC();
        org.joda.time.DurationField durationField4 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField5 = iSOChronology0.centuries();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unsupportedDurationField1.getValue((long) 28354759);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.Chronology chronology5 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unsupportedDurationField1.getValue((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.minuteOfDay();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField7 = new org.joda.time.field.OffsetDateTimeField(dateTimeField5, (-9632622));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology5.getZone();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyearOfCentury();
        java.lang.String str5 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[UTC]" + "'", str5, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unsupportedDurationField1.getValue((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.add(53459998L, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField5 = iSOChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        long long3 = unsupportedDurationField1.getUnitMillis();
        boolean boolean4 = unsupportedDurationField1.isPrecise();
        long long5 = unsupportedDurationField1.getUnitMillis();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getMillis(7, 1641274285996L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }
}
