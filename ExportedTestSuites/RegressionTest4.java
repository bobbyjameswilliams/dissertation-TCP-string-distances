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
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.dayOfWeek();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("UTC", 100);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeZoneBuilder12.toDateTimeZone("ISOChronology[America/Los_Angeles]", false);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeZoneBuilder12.toDateTimeZone("2023-11-29T12:19:27.125-08:00/2023-11-29T12:19:27.125-08:00", false);
        org.joda.time.Chronology chronology19 = chronology6.withZone(dateTimeZone18);
        java.lang.String str21 = dateTimeZone18.getName(3252833653L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str8 = dateTimeZone7.toString();
        java.lang.String str10 = dateTimeZone7.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone12 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone11);
        long long14 = dateTimeZone6.getMillisKeepLocal((org.joda.time.DateTimeZone) cachedDateTimeZone12, 60035L);
        java.lang.Object obj15 = null;
        boolean boolean16 = cachedDateTimeZone12.equals(obj15);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(cachedDateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-28739965L) + "'", long14 == (-28739965L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        boolean boolean6 = unsupportedDurationField1.isPrecise();
        java.lang.String str7 = unsupportedDurationField1.toString();
        long long8 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str9 = unsupportedDurationField1.toString();
        java.lang.String str10 = unsupportedDurationField1.getName();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UnsupportedDurationField[hours]" + "'", str7, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnsupportedDurationField[hours]" + "'", str9, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hours" + "'", str10, "hours");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        long long13 = offsetDateTimeField11.roundHalfCeiling(29227899L);
        org.joda.time.DurationField durationField14 = offsetDateTimeField11.getLeapDurationField();
        java.util.Locale locale16 = null;
        int int17 = offsetDateTimeField11.convertText("74", locale16);
        long long19 = offsetDateTimeField11.roundHalfFloor((long) 16);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 28800000L + "'", long13 == 28800000L);
        org.junit.Assert.assertNull(durationField14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int int13 = dividedDateTimeField11.getMaximumValue(readablePartial12);
        int int14 = dividedDateTimeField11.getMaximumValue();
        java.util.Locale locale16 = null;
        java.lang.String str17 = dividedDateTimeField11.getAsText(9700L, locale16);
        long long19 = dividedDateTimeField11.roundHalfCeiling(0L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29227899 + "'", int13 == 29227899);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29227899 + "'", int14 == 29227899);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "197" + "'", str17, "197");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        org.joda.time.DurationField durationField8 = unsupportedDateTimeField6.getLeapDurationField();
        java.lang.String str9 = unsupportedDateTimeField6.toString();
        long long12 = unsupportedDateTimeField6.add((-21674226L), (-16792L));
        // The following exception was thrown during execution in test generation
        try {
            long long15 = unsupportedDateTimeField6.addWrapField(1701289160741L, 100);
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
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnsupportedDateTimeField" + "'", str9, "UnsupportedDateTimeField");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-21691018L) + "'", long12 == (-21691018L));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        boolean boolean6 = unsupportedDurationField1.isPrecise();
        org.joda.time.DurationFieldType durationFieldType7 = unsupportedDurationField1.getType();
        boolean boolean8 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = unsupportedDurationField1.getDifferenceAsLong(7063L, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str6 = dateTimeZone5.toString();
        java.lang.String str8 = dateTimeZone5.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.Chronology chronology11 = iSOChronology0.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone10);
        org.joda.time.DurationField durationField12 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(cachedDateTimeZone10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        boolean boolean6 = unsupportedDurationField1.isPrecise();
        boolean boolean7 = unsupportedDurationField1.isSupported();
        org.joda.time.DurationFieldType durationFieldType8 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = unsupportedDurationField1.getValue((-408315427200000L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(durationFieldType8);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
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
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology4.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology4.weekyear();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology4.millisOfSecond();
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        java.lang.String str13 = partial0.toString();
        org.joda.time.Chronology chronology14 = partial0.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = partial0.getFormatter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = partial0.toString("2023-12-30T20:26:19.087+00:00:00.007/2023-12-30T20:26:19.087+00:00:00.007");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNull(dateTimeFormatter15);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
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
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.dayOfWeek();
        org.joda.time.DurationField durationField13 = zonedChronology4.years();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology4.centuryOfEra();
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        boolean boolean6 = unsupportedDurationField1.isPrecise();
        org.joda.time.DurationFieldType durationFieldType7 = unsupportedDurationField1.getType();
        boolean boolean8 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = unsupportedDurationField1.getValue(315569520000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.weekyear();
        boolean boolean12 = dateTimeField10.isLeap((-28739965L));
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = dateTimeField10.set(1672531200000L, "ISOChronology[America/Los_Angeles]", locale15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"ISOChronology[America/Los_Angeles]\" for weekyear is not supported");
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
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField2 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType1);
        java.lang.String str3 = unsupportedDurationField2.toString();
        long long4 = unsupportedDurationField2.getUnitMillis();
        java.lang.String str5 = unsupportedDurationField2.toString();
        org.joda.time.DurationFieldType durationFieldType6 = unsupportedDurationField2.getType();
        java.lang.String str7 = unsupportedDurationField2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField8 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, (org.joda.time.DurationField) unsupportedDurationField2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(unsupportedDurationField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UnsupportedDurationField[hours]" + "'", str5, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UnsupportedDurationField[hours]" + "'", str7, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
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
        org.joda.time.DurationField durationField11 = zonedChronology4.weeks();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.dayOfWeek();
        java.lang.String str13 = zonedChronology4.toString();
        long long17 = zonedChronology4.add(35L, (-476134764377L), 30);
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
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str13, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-14284042931275L) + "'", long17 == (-14284042931275L));
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.lang.String str5 = zonedChronology4.toString();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = zonedChronology4.centuries();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.dayOfYear();
        boolean boolean13 = dateTimeField12.isSupported();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str5, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField12 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType8, 4, (int) ' ', (int) (short) -1);
        long long14 = offsetDateTimeField12.roundCeiling(2102400001L);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField16 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) offsetDateTimeField12, (int) (short) 1);
        int int17 = offsetDateTimeField16.getOffset();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 31536000000L + "'", long14 == 31536000000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        org.joda.time.DurationField durationField8 = unsupportedDateTimeField6.getLeapDurationField();
        java.lang.String str9 = unsupportedDateTimeField6.toString();
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getRangeDurationField();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = unsupportedDateTimeField6.getAsShortText(16931L);
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
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnsupportedDateTimeField" + "'", str9, "UnsupportedDateTimeField");
        org.junit.Assert.assertNull(durationField10);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.PreciseDurationField preciseDurationField3 = new org.joda.time.field.PreciseDurationField(durationFieldType1, 28354819L);
        long long6 = preciseDurationField3.getMillis((long) (short) 100, 1701289160741L);
        boolean boolean8 = preciseDurationField3.equals((java.lang.Object) (-6027150136924300L));
        long long11 = preciseDurationField3.getMillis((int) '4', 1701289172565L);
        long long14 = preciseDurationField3.getValueAsLong(53L, 551169L);
        long long17 = preciseDurationField3.getDifferenceAsLong((-476134739672L), 0L);
        long long20 = preciseDurationField3.getValueAsLong(16725225906607L, 0L);
        long long22 = preciseDurationField3.getMillis(69L);
        long long25 = preciseDurationField3.getDifferenceAsLong(52L, 6117984139486L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2835481900L + "'", long6 == 2835481900L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1474450588L + "'", long11 == 1474450588L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-16792L) + "'", long17 == (-16792L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 589854L + "'", long20 == 589854L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1956482511L + "'", long22 == 1956482511L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-215765L) + "'", long25 == (-215765L));
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = null;
        boolean boolean8 = readableInterval6.contains(readableInterval7);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = readableInterval6.toPeriod(periodType9);
        org.joda.time.DateTime dateTime11 = readableInterval6.getEnd();
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInstant4, (org.joda.time.ReadableInstant) dateTime11);
        boolean boolean13 = readableInterval1.isAfter((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.MutableInterval mutableInterval14 = readableInterval1.toMutableInterval();
        org.joda.time.DateTime dateTime15 = readableInterval1.getStart();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(mutableInterval14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
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
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.dayOfMonth();
        org.joda.time.DurationField durationField13 = zonedChronology4.years();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology4.secondOfMinute();
        org.joda.time.DurationField durationField15 = zonedChronology4.minutes();
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        boolean boolean11 = unsupportedDateTimeField6.isLenient();
        long long14 = unsupportedDateTimeField6.getDifferenceAsLong(1701260518316L, (long) 471);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = unsupportedDateTimeField6.isLeap((-62216288613471L));
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1701260517845L + "'", long14 == 1701260517845L);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        boolean boolean8 = unsupportedDateTimeField6.isLenient();
        long long11 = unsupportedDateTimeField6.add(173563257599995L, 53460005);
        org.joda.time.DurationField durationField12 = unsupportedDateTimeField6.getRangeDurationField();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = unsupportedDateTimeField6.roundHalfCeiling(1225226726705L);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 173563311060000L + "'", long11 == 173563311060000L);
        org.junit.Assert.assertNull(durationField12);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = partial0.getFieldTypes();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = partial0.getFormatter();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = partial0.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType17 = partial0.getFieldType((-479));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -479");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
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
        java.lang.String str13 = offsetDateTimeField11.getAsText((long) 1);
        long long16 = offsetDateTimeField11.set(28800000L, 12);
        int int18 = offsetDateTimeField11.get((-473385600000L));
        long long20 = offsetDateTimeField11.remainder(34620000L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 39600000L + "'", long16 == 39600000L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2220007L + "'", long20 == 2220007L);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.dayOfMonth();
        org.joda.time.DurationField durationField8 = zonedChronology4.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.millisOfSecond();
        java.lang.String str10 = zonedChronology4.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = zonedChronology4.getDateTimeMillis(1701289168592L, 970, (-1492), 60000, 96);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 970 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str10, "ZonedChronology[ISOChronology[UTC], UTC]");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str6 = dateTimeZone5.toString();
        java.lang.String str8 = dateTimeZone5.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.Chronology chronology11 = iSOChronology0.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology0.centuryOfEra();
        org.joda.time.Partial partial13 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField14 = iSOChronology0.hours();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(cachedDateTimeZone10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str5 = dateTimeZone4.toString();
        java.lang.String str7 = dateTimeZone4.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone9 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone8);
        java.lang.Object obj10 = null;
        boolean boolean11 = cachedDateTimeZone9.equals(obj10);
        long long13 = cachedDateTimeZone9.nextTransition((long) 97);
        long long15 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) cachedDateTimeZone9, (long) 53460006);
        java.lang.String str17 = cachedDateTimeZone9.getNameKey(6691L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-6L) + "'", long3 == (-6L));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(cachedDateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 53460013L + "'", long15 == 53460013L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField7 = iSOChronology6.minutes();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str9 = dateTimeZone8.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology10 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology6, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = zonedChronology10.getZone();
        boolean boolean12 = fixedDateTimeZone4.equals((java.lang.Object) zonedChronology10);
        org.joda.time.DurationField durationField13 = zonedChronology10.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology10.millisOfSecond();
        long long16 = dateTimeField14.remainder(935295968L);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        java.lang.String str5 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = iSOChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.dayOfWeek();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("-1", "", 0, (int) '4');
        java.lang.String str15 = fixedDateTimeZone13.getName(31556995200009L);
        org.joda.time.Chronology chronology16 = iSOChronology0.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[-1]" + "'", str5, "ISOChronology[-1]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField6.getRangeDurationField();
        org.joda.time.DurationField durationField12 = unsupportedDateTimeField6.getRangeDurationField();
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = unsupportedDateTimeField6.getAsShortText(296907, locale14);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertNull(durationField12);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        int int13 = unsupportedDateTimeField6.getDifference((long) (byte) 10, 10L);
        java.lang.String str14 = unsupportedDateTimeField6.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = unsupportedDateTimeField6.addWrapField(1701289185345L, 1439);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UnsupportedDateTimeField" + "'", str14, "UnsupportedDateTimeField");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
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
        long long13 = offsetDateTimeField11.roundFloor((-476134763546L));
        // The following exception was thrown during execution in test generation
        try {
            long long16 = offsetDateTimeField11.set((long) (-1), "minuteOfHour");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"minuteOfHour\" for millisOfDay is not supported");
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
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-476136000000L) + "'", long13 == (-476136000000L));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int int13 = dividedDateTimeField11.getMaximumValue(readablePartial12);
        org.joda.time.DurationField durationField14 = dividedDateTimeField11.getDurationField();
        long long16 = dividedDateTimeField11.roundFloor(165025048501570L);
        int int17 = dividedDateTimeField11.iDivisor;
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29227899 + "'", int13 == 29227899);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 164727302400000L + "'", long16 == 164727302400000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str15 = dateTimeZone14.toString();
        org.joda.time.Chronology chronology16 = iSOChronology13.withZone(dateTimeZone14);
        boolean boolean17 = partial0.equals((java.lang.Object) dateTimeZone14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField6.getRangeDurationField();
        long long14 = unsupportedDateTimeField6.getDifferenceAsLong(10L, 0L);
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = unsupportedDateTimeField6.getMaximumTextLength(locale15);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField7 = iSOChronology6.minutes();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str9 = dateTimeZone8.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology10 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology6, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = zonedChronology10.getZone();
        boolean boolean12 = fixedDateTimeZone4.equals((java.lang.Object) zonedChronology10);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = iSOChronology13.withZone(dateTimeZone14);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException14 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType11, (java.lang.Number) 60035L, "");
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType11.getDurationType();
        int int16 = partial0.indexOf(dateTimeFieldType11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType18 = partial0.getFieldType((-751463));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -751463");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException14 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType11, (java.lang.Number) 60035L, "");
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType11.getDurationType();
        int int16 = partial0.indexOf(dateTimeFieldType11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType18 = partial0.getFieldType((-751463));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -751463");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.lang.String str5 = zonedChronology4.toString();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.clockhourOfHalfday();
        java.lang.String str9 = zonedChronology4.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = zonedChronology4.getDateTimeMillis(300, 25306, (-1968), (-256), (-190992), 0, 970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -256 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str5, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str9, "ZonedChronology[ISOChronology[UTC], UTC]");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        java.lang.String str13 = partial0.toString();
        org.joda.time.Chronology chronology14 = partial0.getChronology();
        java.lang.String str15 = partial0.toString();
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = partial0.toString("", locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = partial0.getFieldTypes();
        boolean boolean15 = partial0.equals((java.lang.Object) 1702281558665L);
        java.lang.String str16 = partial0.toString();
        org.joda.time.Chronology chronology17 = partial0.getChronology();
        org.joda.time.Chronology chronology18 = chronology17.withUTC();
        org.joda.time.DurationField durationField19 = chronology17.minutes();
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.dayOfMonth();
        org.joda.time.DurationField durationField8 = zonedChronology4.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.millisOfSecond();
        java.lang.String str10 = zonedChronology4.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = zonedChronology4.getDateTimeMillis(59, 0, 99, 6, 32, 719, 20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 719 for secondOfMinute must be in the range [0,59]");
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
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str10, "ZonedChronology[ISOChronology[UTC], UTC]");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 60035L, "");
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.IllegalFieldValueException illegalFieldValueException7 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType4, (java.lang.Number) 10L, "hourOfDay");
        java.lang.String str8 = illegalFieldValueException7.getIllegalValueAsString();
        illegalFieldValueException3.addSuppressed((java.lang.Throwable) illegalFieldValueException7);
        org.joda.time.IllegalInstantException illegalInstantException11 = new org.joda.time.IllegalInstantException("60035");
        illegalFieldValueException3.addSuppressed((java.lang.Throwable) illegalInstantException11);
        java.lang.String str13 = illegalFieldValueException3.getFieldName();
        java.lang.String str14 = illegalFieldValueException3.getIllegalValueAsString();
        java.lang.Number number15 = illegalFieldValueException3.getIllegalNumberValue();
        java.lang.String str16 = illegalFieldValueException3.getFieldName();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hourOfDay" + "'", str13, "hourOfDay");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "60035" + "'", str14, "60035");
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 60035L + "'", number15, 60035L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hourOfDay" + "'", str16, "hourOfDay");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.dayOfWeek();
        org.joda.time.DurationField durationField9 = zonedChronology4.weekyears();
        java.lang.String str10 = zonedChronology4.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = zonedChronology4.getDateTimeMillis(0, (-256), 278753760, 1469, 9, 13, 58571700);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1469 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str10, "ZonedChronology[ISOChronology[UTC], UTC]");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = unsupportedDateTimeField6.getType();
        java.lang.String str12 = unsupportedDateTimeField6.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = unsupportedDateTimeField6.get((long) (-30878));
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UnsupportedDateTimeField" + "'", str12, "UnsupportedDateTimeField");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = null;
        boolean boolean5 = readableInterval1.isBefore(readableInterval4);
        org.joda.time.DateTime dateTime6 = readableInterval1.getEnd();
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = null;
        boolean boolean10 = readableInterval8.contains(readableInterval9);
        org.joda.time.ReadableInterval readableInterval11 = null;
        boolean boolean12 = readableInterval8.isBefore(readableInterval11);
        org.joda.time.DateTime dateTime13 = readableInterval8.getEnd();
        boolean boolean14 = readableInterval1.isBefore((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Duration duration15 = readableInterval1.toDuration();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(duration15);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        boolean boolean8 = unsupportedDateTimeField6.isLenient();
        org.joda.time.DurationField durationField9 = unsupportedDateTimeField6.getRangeDurationField();
        boolean boolean10 = unsupportedDateTimeField6.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = unsupportedDateTimeField6.roundHalfCeiling((-62216288613471L));
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        boolean boolean8 = unsupportedDateTimeField6.isLenient();
        org.joda.time.DurationField durationField9 = unsupportedDateTimeField6.getRangeDurationField();
        boolean boolean10 = unsupportedDateTimeField6.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unsupportedDateTimeField6.isLeap(922343405803848000L);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        org.joda.time.DateTimeField[] dateTimeFieldArray13 = partial11.getFields();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.Partial partial15 = partial11.plus(readablePeriod14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial18 = partial15.withField(dateTimeFieldType16, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray13);
        org.junit.Assert.assertNotNull(partial15);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = gregorianChronology14.getZone();
        org.joda.time.Chronology chronology16 = zonedChronology4.withZone(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone15.isLocalDateTimeGap(localDateTime17);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(gregorianChronology14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField12 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType8, 4, (int) ' ', (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField13 = offsetDateTimeField12.getWrappedField();
        int int15 = offsetDateTimeField12.getMaximumValue(1701289179712L);
        int int16 = offsetDateTimeField12.getOffset();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int int13 = dividedDateTimeField11.getMaximumValue(readablePartial12);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField14 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11);
        int int15 = remainderDateTimeField14.getMaximumValue();
        org.joda.time.DurationField durationField16 = remainderDateTimeField14.getDurationField();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29227899 + "'", int13 == 29227899);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        int int13 = unsupportedDateTimeField6.getDifference((long) (byte) 10, 10L);
        long long16 = unsupportedDateTimeField6.add((long) 1439, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = unsupportedDateTimeField6.roundHalfCeiling(1701260519822L);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1438L + "'", long16 == 1438L);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str4 = dateTimeZone3.toString();
        java.lang.String str6 = dateTimeZone3.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone7);
        java.lang.Object obj9 = null;
        boolean boolean10 = cachedDateTimeZone8.equals(obj9);
        org.joda.time.Chronology chronology11 = iSOChronology0.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone8);
        org.joda.time.chrono.ISOChronology iSOChronology12 = org.joda.time.chrono.ISOChronology.getInstance((org.joda.time.DateTimeZone) cachedDateTimeZone8);
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology12.year();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(iSOChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = zonedChronology4.getDateTimeMillis(28354759, (int) 'a', (-7), (int) (byte) 1, (int) (short) 1, 1969, (-28800000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for secondOfMinute must be in the range [0,59]");
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
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        org.joda.time.DateTimeField[] dateTimeFieldArray13 = partial11.getFields();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.Partial partial15 = partial11.plus(readablePeriod14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial18 = partial11.withField(dateTimeFieldType16, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray13);
        org.junit.Assert.assertNotNull(partial15);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int int13 = dividedDateTimeField11.getMaximumValue(readablePartial12);
        org.joda.time.DurationField durationField14 = dividedDateTimeField11.getDurationField();
        org.joda.time.DateTimeField dateTimeField15 = dividedDateTimeField11.getWrappedField();
        int int17 = dividedDateTimeField11.get(551169L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29227899 + "'", int13 == 29227899);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 197 + "'", int17 == 197);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int int13 = dividedDateTimeField11.getMaximumValue(readablePartial12);
        java.util.Locale locale16 = null;
        long long17 = dividedDateTimeField11.set((long) 28354759, "17", locale16);
        long long20 = dividedDateTimeField11.addWrapField((-476134747322L), 5);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29227899 + "'", int13 == 29227899);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-56802442045241L) + "'", long17 == (-56802442045241L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1101788452678L + "'", long20 == 1101788452678L);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        boolean boolean8 = unsupportedDateTimeField6.isLenient();
        org.joda.time.DurationField durationField9 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getRangeDurationField();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = unsupportedDateTimeField6.getMinimumValue();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertNull(durationField10);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        int int12 = offsetDateTimeField11.getMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = offsetDateTimeField11.set(1684046590251L, (-190992));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -190992 for millisOfDay must be in the range [1,24]");
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
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        long long16 = dividedDateTimeField11.roundFloor(291L);
        long long18 = dividedDateTimeField11.roundFloor((long) (short) 100);
        long long20 = dividedDateTimeField11.roundHalfFloor(86621026884870L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86466009600000L + "'", long20 == 86466009600000L);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField7 = iSOChronology6.minutes();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str9 = dateTimeZone8.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology10 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology6, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = zonedChronology10.getZone();
        boolean boolean12 = fixedDateTimeZone4.equals((java.lang.Object) zonedChronology10);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.weekOfWeekyear();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        boolean boolean6 = unsupportedDurationField1.isPrecise();
        java.lang.String str7 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = unsupportedDurationField1.add((long) (-30878), 9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UnsupportedDurationField[hours]" + "'", str7, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        int int13 = unsupportedDateTimeField6.getDifference((long) (byte) 10, 10L);
        long long16 = unsupportedDateTimeField6.add(3600000L, 9);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = unsupportedDateTimeField6.getMinimumValue();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3600009L + "'", long16 == 3600009L);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        long long6 = readableInterval5.getStartMillis();
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        long long9 = readableInterval8.getEndMillis();
        boolean boolean10 = readableInterval5.overlaps(readableInterval8);
        org.joda.time.MutableInterval mutableInterval11 = readableInterval5.toMutableInterval();
        org.joda.time.Duration duration12 = mutableInterval11.toDuration();
        boolean boolean13 = readableInterval1.isBefore((org.joda.time.ReadableInterval) mutableInterval11);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 296907L + "'", long6 == 296907L);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 296907L + "'", long9 == 296907L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(mutableInterval11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology4.halfdayOfDay();
        long long16 = dateTimeField13.getDifferenceAsLong(164727302400000L, (long) (-30878));
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3813132L + "'", long16 == 3813132L);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        java.lang.String str11 = partial0.toString();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = partial0.getFieldTypes();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean14 = partial0.isSupported(dateTimeFieldType13);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = partial0.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = zonedChronology4.getDateTimeMillis((-256), 14, (-28799992), (-28799992));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -28799992 for millisOfDay must be in the range [0,86399999]");
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
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        java.lang.String str13 = partial0.toString();
        org.joda.time.Chronology chronology14 = partial0.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = partial0.getFormatter();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = partial0.getValue((-479));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -479");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNull(dateTimeFormatter15);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        boolean boolean6 = unsupportedDurationField1.isPrecise();
        java.lang.String str7 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.getMillis(96);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UnsupportedDurationField[hours]" + "'", str7, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        org.joda.time.DurationField durationField11 = zonedChronology4.weeks();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology4.secondOfDay();
        int int16 = dateTimeField13.getDifference(1641255540000L, 1225154537837L);
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
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 416101002 + "'", int16 == 416101002);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField8 = iSOChronology7.centuries();
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology7.getZone();
        org.joda.time.DurationField durationField10 = iSOChronology7.centuries();
        boolean boolean11 = zonedChronology4.equals((java.lang.Object) durationField10);
        org.joda.time.DurationField durationField12 = zonedChronology4.days();
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology4.halfdayOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField8 = iSOChronology7.centuries();
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology7.getZone();
        org.joda.time.DurationField durationField10 = iSOChronology7.centuries();
        boolean boolean11 = zonedChronology4.equals((java.lang.Object) durationField10);
        org.joda.time.DurationField durationField12 = zonedChronology4.days();
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology4.minuteOfHour();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        java.lang.String str8 = zonedChronology4.toString();
        org.joda.time.DurationField durationField9 = zonedChronology4.hours();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.era();
        org.joda.time.Chronology chronology12 = zonedChronology4.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology4.hourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str8, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str3 = dateTimeZone0.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone5 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone4);
        java.lang.Object obj6 = null;
        boolean boolean7 = cachedDateTimeZone5.equals(obj6);
        long long9 = cachedDateTimeZone5.previousTransition(0L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone((org.joda.time.DateTimeZone) cachedDateTimeZone5);
        java.lang.String str12 = cachedDateTimeZone5.getName(53460006L);
        boolean boolean13 = cachedDateTimeZone5.isFixed();
        int int15 = cachedDateTimeZone5.getOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(cachedDateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone5 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology6.getZone();
        boolean boolean8 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) gregorianChronology6);
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology6.hourOfHalfday();
        java.lang.String str10 = gregorianChronology6.toString();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology6.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = gregorianChronology6.getDateTimeMillis((int) (byte) 0, 52, (-1492), (int) 'a', 0, 96, 15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GregorianChronology[100]" + "'", str10, "GregorianChronology[100]");
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        boolean boolean13 = dividedDateTimeField11.isLeap(9700L);
        org.joda.time.ReadablePartial readablePartial14 = null;
        java.util.Locale locale16 = null;
        java.lang.String str17 = dividedDateTimeField11.getAsShortText(readablePartial14, 4, locale16);
        long long20 = dividedDateTimeField11.getDifferenceAsLong(28800004L, (-476134739671L));
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4" + "'", str17, "4");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
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
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology4.halfdayOfDay();
        java.lang.String str15 = dateTimeField13.getAsShortText(1701260531873L);
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PM" + "'", str15, "PM");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        long long13 = offsetDateTimeField11.roundHalfCeiling(29227899L);
        long long16 = offsetDateTimeField11.add(9608L, 0L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = offsetDateTimeField11.getAsShortText(0L, locale18);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 28799993L + "'", long13 == 28799993L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9608L + "'", long16 == 9608L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1" + "'", str19, "1");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
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
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.era();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = zonedChronology4.getDateTimeMillis(0L, (-4), 0, (-30878), (-1076288));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -4 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = gregorianChronology14.getZone();
        org.joda.time.Chronology chronology16 = zonedChronology4.withZone(dateTimeZone15);
        long long19 = dateTimeZone15.convertLocalToUTC(29227923L, true);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(gregorianChronology14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 29227923L + "'", long19 == 29227923L);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        long long10 = unsupportedDateTimeField6.add((-53459996L), (int) (short) 0);
        java.lang.String str11 = unsupportedDateTimeField6.getName();
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = unsupportedDateTimeField6.getAsText(25306, locale13);
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-53459996L) + "'", long10 == (-53459996L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "dayOfYear" + "'", str11, "dayOfYear");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField5 = iSOChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone6 = iSOChronology0.getZone();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("UTC", "", 0, 4);
        java.util.TimeZone timeZone13 = fixedDateTimeZone12.toTimeZone();
        long long15 = dateTimeZone6.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone12, (-476134727033L));
        java.lang.String str17 = fixedDateTimeZone12.getNameKey((-19093958L));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-476134727033L) + "'", long15 == (-476134727033L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str6 = dateTimeZone5.toString();
        java.lang.String str8 = dateTimeZone5.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.Chronology chronology11 = iSOChronology0.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField13 = iSOChronology0.halfdays();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(cachedDateTimeZone10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "", 0, 4);
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.yearOfCentury();
        org.joda.time.DurationField durationField9 = chronology7.millis();
        org.joda.time.DurationField durationField10 = chronology7.centuries();
        org.joda.time.Chronology chronology11 = chronology7.withUTC();
        boolean boolean12 = fixedDateTimeZone4.equals((java.lang.Object) chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4, 53460006);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 53460006");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        java.lang.String str6 = unsupportedDurationField1.getName();
        java.lang.String str7 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = unsupportedDurationField1.getDifferenceAsLong(1701289169842L, 290818397127600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[hours]" + "'", str4, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hours" + "'", str6, "hours");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hours" + "'", str7, "hours");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(1L, locale6);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = cachedDateTimeZone8.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = cachedDateTimeZone8.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = cachedDateTimeZone8.getShortName(0L, locale13);
        java.lang.String str16 = cachedDateTimeZone8.getShortName((-63429523199709L));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        boolean boolean6 = unsupportedDurationField1.isPrecise();
        org.joda.time.DurationFieldType durationFieldType7 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = unsupportedDurationField1.getDifferenceAsLong((long) 5, 1701289183455L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(durationFieldType7);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField5 = iSOChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = iSOChronology0.halfdays();
        org.joda.time.DurationFieldType durationFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.ScaledDurationField scaledDurationField12 = new org.joda.time.field.ScaledDurationField(durationField9, durationFieldType10, (-1864065));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.getDifferenceAsLong((long) (short) 100, (-30610224000000L));
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getRangeDurationField();
        boolean boolean11 = unsupportedDateTimeField6.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = unsupportedDateTimeField6.getAsShortText((long) 254226);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 30610224000100L + "'", long9 == 30610224000100L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
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
        long long13 = offsetDateTimeField11.roundHalfCeiling(29227899L);
        boolean boolean15 = offsetDateTimeField11.isLeap((-476134712641L));
        long long17 = offsetDateTimeField11.roundHalfCeiling(63072000003L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 28800000L + "'", long13 == 28800000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 63072000000L + "'", long17 == 63072000000L);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        long long16 = dividedDateTimeField11.roundFloor(291L);
        long long18 = dividedDateTimeField11.roundFloor((long) (short) 100);
        long long20 = dividedDateTimeField11.roundFloor(0L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
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
        java.lang.String str13 = offsetDateTimeField11.getAsText((long) 1);
        long long15 = offsetDateTimeField11.remainder((long) 10);
        long long18 = offsetDateTimeField11.add((-30610224000000L), 1104537600000L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3976304749776000000L + "'", long18 == 3976304749776000000L);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        boolean boolean6 = unsupportedDurationField1.isPrecise();
        org.joda.time.DurationFieldType durationFieldType7 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = unsupportedDurationField1.getMillis((-31L), 103654969200000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(durationFieldType7);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str3 = dateTimeZone0.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone5 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone4);
        java.lang.String str6 = cachedDateTimeZone5.toString();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.hours();
        java.lang.String str8 = durationFieldType7.toString();
        boolean boolean9 = cachedDateTimeZone5.equals((java.lang.Object) durationFieldType7);
        int int11 = cachedDateTimeZone5.getStandardOffset(19808L);
        boolean boolean12 = cachedDateTimeZone5.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(cachedDateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hours" + "'", str8, "hours");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        int int6 = fixedDateTimeZone4.getStandardOffset((long) 24);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType7);
        boolean boolean9 = unsupportedDurationField8.isSupported();
        java.lang.String str10 = unsupportedDurationField8.toString();
        boolean boolean11 = unsupportedDurationField8.isSupported();
        boolean boolean12 = fixedDateTimeZone4.equals((java.lang.Object) unsupportedDurationField8);
        long long14 = fixedDateTimeZone4.nextTransition(16L);
        long long16 = fixedDateTimeZone4.previousTransition(104716132803L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDurationField[hours]" + "'", str10, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 16L + "'", long14 == 16L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 104716132803L + "'", long16 == 104716132803L);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.DateTimeField dateTimeField9 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField10 = chronology8.minutes();
        org.joda.time.DurationField durationField11 = chronology8.halfdays();
        org.joda.time.DurationField durationField12 = chronology8.weeks();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.millisOfDay();
        boolean boolean14 = gregorianChronology5.equals((java.lang.Object) chronology8);
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology5.yearOfCentury();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.getDifferenceAsLong((long) (short) 100, (-30610224000000L));
        long long12 = unsupportedDateTimeField6.add((long) '4', (int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = unsupportedDateTimeField6.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = unsupportedDateTimeField6.roundHalfEven(1638217172564L);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 30610224000100L + "'", long9 == 30610224000100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 53L + "'", long12 == 53L);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.getDifferenceAsLong((long) (short) 100, (-30610224000000L));
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getRangeDurationField();
        boolean boolean11 = unsupportedDateTimeField6.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = unsupportedDateTimeField6.getAsText(180816494L);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 30610224000100L + "'", long9 == 30610224000100L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        boolean boolean6 = unsupportedDurationField1.isPrecise();
        boolean boolean7 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.getValueAsLong((-56802442045241L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        java.lang.String str6 = unsupportedDurationField1.getName();
        java.lang.String str7 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = unsupportedDurationField1.getValue((-476134773354L), 5103867420000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[hours]" + "'", str4, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hours" + "'", str6, "hours");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hours" + "'", str7, "hours");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
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
        org.joda.time.DurationField durationField11 = zonedChronology4.weeks();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology4.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology4.weekyearOfCentury();
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
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = partial0.getFieldTypes();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = partial0.getFormatter();
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = partial0.toString("hours", locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNull(dateTimeFormatter14);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DurationField durationField6 = gregorianChronology5.days();
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology5.getZone();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = gregorianChronology13.getZone();
        long long17 = dateTimeZone14.adjustOffset(1701289183455L, false);
        boolean boolean18 = dateTimeZone14.isFixed();
        org.joda.time.Chronology chronology19 = gregorianChronology5.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology5.millisOfSecond();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gregorianChronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1701289183455L + "'", long17 == 1701289183455L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DurationField durationField6 = gregorianChronology5.days();
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology5.getZone();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = gregorianChronology13.getZone();
        long long17 = dateTimeZone14.adjustOffset(1701289183455L, false);
        boolean boolean18 = dateTimeZone14.isFixed();
        org.joda.time.Chronology chronology19 = gregorianChronology5.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology5.minuteOfHour();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gregorianChronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1701289183455L + "'", long17 == 1701289183455L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        boolean boolean4 = unsupportedDurationField1.isPrecise();
        java.lang.String str5 = unsupportedDurationField1.getName();
        java.lang.String str6 = unsupportedDurationField1.toString();
        boolean boolean7 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unsupportedDurationField1.getValue((-476134564980L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnsupportedDurationField[hours]" + "'", str6, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
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
        java.lang.String str11 = zonedChronology4.toString();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.weekyearOfCentury();
        long long15 = dateTimeField12.addWrapField(9721670400001L, 6);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str11, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9910972800001L + "'", long15 == 9910972800001L);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        java.lang.String str6 = unsupportedDurationField1.getName();
        java.lang.String str7 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = unsupportedDurationField1.getMillis(12, (-9088400913636830757L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[hours]" + "'", str4, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hours" + "'", str6, "hours");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hours" + "'", str7, "hours");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(1L, locale6);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = cachedDateTimeZone8.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = cachedDateTimeZone8.toTimeZone();
        long long13 = cachedDateTimeZone8.previousTransition(2580171L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = cachedDateTimeZone8.getName(0L, locale15);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2580171L + "'", long13 == 2580171L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = partial0.getFieldTypes();
        boolean boolean15 = partial0.equals((java.lang.Object) 1702281558665L);
        java.lang.String str16 = partial0.toString();
        org.joda.time.Chronology chronology17 = partial0.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.dayOfMonth();
        org.joda.time.DurationField durationField13 = zonedChronology4.years();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology4.weekyearOfCentury();
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = gregorianChronology14.getZone();
        org.joda.time.Chronology chronology16 = zonedChronology4.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology4.yearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(gregorianChronology14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(1L, locale6);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone2);
        java.lang.String str10 = cachedDateTimeZone8.getNameKey((-476134764377L));
        long long12 = cachedDateTimeZone8.previousTransition(18110895568550L);
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) cachedDateTimeZone8);
        long long17 = cachedDateTimeZone8.convertLocalToUTC(894727630297270142L, false, 113424418L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 18110895568550L + "'", long12 == 18110895568550L);
        org.junit.Assert.assertNotNull(gregorianChronology13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 894727630297270142L + "'", long17 == 894727630297270142L);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        boolean boolean6 = unsupportedDurationField1.isPrecise();
        long long7 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.getMillis((-21674226));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        boolean boolean4 = unsupportedDurationField1.isSupported();
        long long5 = unsupportedDurationField1.getUnitMillis();
        boolean boolean7 = unsupportedDurationField1.equals((java.lang.Object) 15L);
        boolean boolean8 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = unsupportedDurationField1.getValueAsLong(30925843200000L, (-658943805571L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField7 = iSOChronology6.minutes();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str9 = dateTimeZone8.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology10 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology6, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = zonedChronology10.getZone();
        boolean boolean12 = fixedDateTimeZone4.equals((java.lang.Object) zonedChronology10);
        org.joda.time.DurationField durationField13 = zonedChronology10.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology10.monthOfYear();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        long long10 = unsupportedDateTimeField6.add((-53459996L), (int) (short) 0);
        boolean boolean11 = unsupportedDateTimeField6.isLenient();
        long long14 = unsupportedDateTimeField6.add(1701289178411L, (-7793008029229804L));
        long long17 = unsupportedDateTimeField6.getDifferenceAsLong(24660006L, (-62135568000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-53459996L) + "'", long10 == (-53459996L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-7791306740051393L) + "'", long14 == (-7791306740051393L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 62135592660006L + "'", long17 == 62135592660006L);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.dayOfWeek();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField13 = new org.joda.time.field.OffsetDateTimeField(dateTimeField11, 471);
        org.joda.time.ReadablePartial readablePartial14 = null;
        int[] intArray15 = null;
        int int16 = dateTimeField11.getMinimumValue(readablePartial14, intArray15);
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField6.getRangeDurationField();
        long long14 = unsupportedDateTimeField6.getDifferenceAsLong(10L, 0L);
        long long17 = unsupportedDateTimeField6.getDifferenceAsLong(0L, (long) (byte) -1);
        org.joda.time.DurationField durationField18 = unsupportedDateTimeField6.getDurationField();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
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
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.dayOfMonth();
        org.joda.time.DurationField durationField13 = zonedChronology4.years();
        org.joda.time.DurationField durationField14 = zonedChronology4.minutes();
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        int int2 = dateTimeZone0.getStandardOffset((long) 1);
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.DurationField durationField7 = chronology5.millis();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.clockhourOfDay();
        boolean boolean10 = dateTimeZone0.equals((java.lang.Object) dateTimeField9);
        java.lang.String str12 = dateTimeZone0.getShortName(970L);
        int int14 = dateTimeZone0.getOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        boolean boolean6 = unsupportedDurationField1.isPrecise();
        org.joda.time.DurationFieldType durationFieldType7 = unsupportedDurationField1.getType();
        boolean boolean8 = unsupportedDurationField1.isSupported();
        java.lang.String str9 = unsupportedDurationField1.toString();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnsupportedDurationField[hours]" + "'", str9, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        java.lang.String str6 = unsupportedDurationField1.getName();
        java.lang.String str7 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.getMillis(6418158015600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[hours]" + "'", str4, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hours" + "'", str6, "hours");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hours" + "'", str7, "hours");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial.Property property15 = partial13.property(dateTimeFieldType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfHour' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        org.joda.time.DateTimeField[] dateTimeFieldArray13 = partial11.getFields();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.Partial partial15 = partial11.plus(readablePeriod14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = partial11.toString("hours");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray13);
        org.junit.Assert.assertNotNull(partial15);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.year();
        org.joda.time.DateTimeZone dateTimeZone13 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology4.hourOfDay();
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DurationField durationField6 = gregorianChronology5.days();
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = gregorianChronology5.seconds();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str11 = dateTimeFieldType10.toString();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType10.getDurationType();
        org.joda.time.field.ScaledDurationField scaledDurationField14 = new org.joda.time.field.ScaledDurationField(durationField9, durationFieldType12, 53460006);
        int int17 = scaledDurationField14.getDifference(189684677907L, (-39600494L));
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "dayOfMonth" + "'", str11, "dayOfMonth");
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        java.lang.String str6 = unsupportedDurationField1.getName();
        java.lang.String str7 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unsupportedDurationField1.getValue(53460006L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[hours]" + "'", str4, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hours" + "'", str6, "hours");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hours" + "'", str7, "hours");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone5 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology6.getZone();
        boolean boolean8 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) gregorianChronology6);
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology6.hourOfHalfday();
        org.joda.time.DurationField durationField10 = gregorianChronology6.minutes();
        org.joda.time.DateTimeZone dateTimeZone11 = gregorianChronology6.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gregorianChronology6.getDateTimeMillis((-593102), 955, 196222, (-472580));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -472580 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = partial0.getFieldTypes();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = partial0.getFormatter();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = partial0.toDateTime(readableInstant15);
        long long17 = org.joda.time.DateTimeUtils.getInstantMillis(readableInstant15);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-476134745124L) + "'", long17 == (-476134745124L));
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        java.lang.String str6 = unsupportedDurationField1.getName();
        java.lang.String str7 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = unsupportedDurationField1.getMillis(0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[hours]" + "'", str4, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hours" + "'", str6, "hours");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hours" + "'", str7, "hours");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        java.lang.String str6 = unsupportedDurationField1.getName();
        java.lang.String str7 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.getMillis(970);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[hours]" + "'", str4, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hours" + "'", str6, "hours");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hours" + "'", str7, "hours");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        org.joda.time.DurationField durationField8 = zonedChronology4.days();
        org.joda.time.DateTimeZone dateTimeZone9 = zonedChronology4.getZone();
        org.joda.time.DurationField durationField10 = zonedChronology4.days();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology4.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        long long14 = offsetDateTimeField11.addWrapField((long) 0, (int) (short) 0);
        long long17 = offsetDateTimeField11.add((long) (short) 0, 1439);
        int int19 = offsetDateTimeField11.get(1701260530724L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5180400000L + "'", long17 == 5180400000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13 + "'", int19 == 13);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        long long10 = unsupportedDateTimeField6.add((-53459996L), (int) (short) 0);
        boolean boolean11 = unsupportedDateTimeField6.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = unsupportedDateTimeField6.getAsText(1225226726705L);
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-53459996L) + "'", long10 == (-53459996L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
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
        long long13 = offsetDateTimeField11.roundHalfCeiling(29227899L);
        long long15 = offsetDateTimeField11.roundCeiling((long) 1);
        int int17 = offsetDateTimeField11.get(9972000000L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 28800000L + "'", long13 == 28800000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3600000L + "'", long15 == 3600000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException("dayOfMonth", "UTC");
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException6 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType3, (java.lang.Number) 60035L, "");
        boolean boolean7 = org.joda.time.IllegalInstantException.isIllegalInstant((java.lang.Throwable) illegalFieldValueException6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.IllegalFieldValueException illegalFieldValueException11 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType8, (java.lang.Number) 10L, "hourOfDay");
        java.lang.Number number12 = illegalFieldValueException11.getIllegalNumberValue();
        illegalFieldValueException6.addSuppressed((java.lang.Throwable) illegalFieldValueException11);
        java.lang.String str14 = illegalFieldValueException6.getFieldName();
        illegalFieldValueException2.addSuppressed((java.lang.Throwable) illegalFieldValueException6);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 10L + "'", number12, 10L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hourOfDay" + "'", str14, "hourOfDay");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        long long14 = offsetDateTimeField11.remainder(28800004L);
        long long16 = offsetDateTimeField11.remainder((-476134743490L));
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 4L + "'", long14 == 4L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1256510L + "'", long16 == 1256510L);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        java.lang.String str13 = partial0.toString();
        java.lang.String str14 = partial0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType16 = partial0.getFieldType(11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = partial0.getFieldTypes();
        org.joda.time.Chronology chronology14 = partial0.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType16 = partial0.getFieldType(1864073);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1864073");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        java.lang.String str5 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = iSOChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.dayOfWeek();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("-1", "", 0, (int) '4');
        java.lang.String str15 = fixedDateTimeZone13.getName(31556995200009L);
        org.joda.time.Chronology chronology16 = iSOChronology0.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[100]" + "'", str5, "ISOChronology[100]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("UTC", 28, 28354819, 100, 'a', 73, 7, 296907, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addCutover((int) (byte) 1, '4', 202, 719, 73, true, 73);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("-1", 9);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("DateTimeField[dayOfYear]", 297, 24, 21, 'a', (-5), (-190992), 29227899, true, 970);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder22.setFixedSavings("DateTimeField[dayOfMonth]", 71);
        java.io.OutputStream outputStream38 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder22.writeTo("1954-11-29T20:20:27.737-08:00/1954-11-29T20:20:27.737-08:00", outputStream38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField12 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType8, 4, (int) ' ', (int) (short) -1);
        long long14 = offsetDateTimeField12.remainder(31564800000L);
        org.joda.time.DurationField durationField15 = offsetDateTimeField12.getLeapDurationField();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(durationField15);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
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
        java.lang.String str11 = zonedChronology4.toString();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology4.yearOfEra();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str11, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.lang.String str5 = zonedChronology4.toString();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.millisOfDay();
        long long11 = zonedChronology4.getDateTimeMillis((-1), (int) (short) 1, 23, 4);
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = zonedChronology4.getDateTimeMillis(907354208L, 74, 1439, (-9632622), (-28800000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 74 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str5, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-62196854399996L) + "'", long11 == (-62196854399996L));
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
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
        java.lang.String str11 = zonedChronology4.toString();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology4.weekOfWeekyear();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str11, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        java.lang.String str11 = zonedChronology4.toString();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.clockhourOfDay();
        org.joda.time.DurationField durationField13 = zonedChronology4.weekyears();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str11, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        boolean boolean4 = unsupportedDurationField1.isSupported();
        boolean boolean5 = unsupportedDurationField1.isSupported();
        boolean boolean7 = unsupportedDurationField1.equals((java.lang.Object) 73);
        java.lang.String str8 = unsupportedDurationField1.getName();
        boolean boolean9 = unsupportedDurationField1.isPrecise();
        boolean boolean10 = unsupportedDurationField1.isSupported();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hours" + "'", str8, "hours");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        long long17 = dividedDateTimeField11.getDifferenceAsLong((long) 10, 1704067200000L);
        java.util.Locale locale18 = null;
        int int19 = dividedDateTimeField11.getMaximumShortTextLength(locale18);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-5L) + "'", long17 == (-5L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.minutes();
        boolean boolean6 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DateTimeField dateTimeField7 = chronology3.dayOfMonth();
        org.joda.time.Chronology chronology8 = chronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.halfdayOfDay();
        int int10 = dateTimeField9.getMinimumValue();
        long long12 = dateTimeField9.roundCeiling(1701260518022L);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1701302400000L + "'", long12 == 1701302400000L);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 60035L, "");
        boolean boolean4 = org.joda.time.IllegalInstantException.isIllegalInstant((java.lang.Throwable) illegalFieldValueException3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.IllegalFieldValueException illegalFieldValueException8 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType5, (java.lang.Number) 10L, "hourOfDay");
        java.lang.Number number9 = illegalFieldValueException8.getIllegalNumberValue();
        illegalFieldValueException3.addSuppressed((java.lang.Throwable) illegalFieldValueException8);
        java.lang.String str11 = illegalFieldValueException3.getFieldName();
        java.lang.String str12 = illegalFieldValueException3.getFieldName();
        java.lang.Throwable[] throwableArray13 = illegalFieldValueException3.getSuppressed();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 10L + "'", number9, 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hourOfDay" + "'", str11, "hourOfDay");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hourOfDay" + "'", str12, "hourOfDay");
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        java.lang.String str8 = zonedChronology4.toString();
        org.joda.time.DurationField durationField9 = zonedChronology4.hours();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.era();
        long long13 = dateTimeField11.remainder(4L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str8, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 62135596800004L + "'", long13 == 62135596800004L);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(1L, locale6);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = cachedDateTimeZone8.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = cachedDateTimeZone8.toTimeZone();
        long long13 = cachedDateTimeZone8.previousTransition(2580171L);
        boolean boolean14 = cachedDateTimeZone8.isFixed();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2580171L + "'", long13 == 2580171L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str6 = dateTimeZone5.toString();
        java.lang.String str8 = dateTimeZone5.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.Chronology chronology11 = iSOChronology0.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone10);
        java.lang.String str12 = chronology11.toString();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(cachedDateTimeZone10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ISOChronology[UTC]" + "'", str12, "ISOChronology[UTC]");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str3 = dateTimeZone0.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone5 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone4);
        java.lang.Object obj6 = null;
        boolean boolean7 = cachedDateTimeZone5.equals(obj6);
        long long9 = cachedDateTimeZone5.previousTransition(0L);
        long long11 = cachedDateTimeZone5.previousTransition((-1008800L));
        org.joda.time.DateTimeZone dateTimeZone12 = cachedDateTimeZone5.getUncachedZone();
        long long15 = cachedDateTimeZone5.adjustOffset(1701291599993L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(cachedDateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1008800L) + "'", long11 == (-1008800L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1701291599993L + "'", long15 == 1701291599993L);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = unsupportedDateTimeField6.getType();
        org.joda.time.Partial partial9 = new org.joda.time.Partial();
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = unsupportedDateTimeField6.getAsText((org.joda.time.ReadablePartial) partial9, 59, locale11);
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
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        boolean boolean4 = unsupportedDurationField1.isSupported();
        java.lang.String str5 = unsupportedDurationField1.toString();
        java.lang.String str6 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.add(9223372014350400000L, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UnsupportedDurationField[hours]" + "'", str5, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hours" + "'", str6, "hours");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(1L, locale6);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = cachedDateTimeZone8.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = cachedDateTimeZone8.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = zonedChronology4.getDateTimeMillis((-7), 28, (-1492), (int) (byte) -1, (-190992), (-593102), 24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone5 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology6.getZone();
        boolean boolean8 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) gregorianChronology6);
        org.joda.time.DurationField durationField9 = gregorianChronology6.minutes();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology6.dayOfWeek();
        org.joda.time.DurationField durationField11 = gregorianChronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology6.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology6.millisOfDay();
        org.joda.time.Partial partial14 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology6);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = partial13.getFormatter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField16 = partial13.getField(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateTimeFormatter14);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(1L, locale6);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone2);
        java.lang.String str10 = cachedDateTimeZone8.getNameKey((-476134764377L));
        long long12 = cachedDateTimeZone8.previousTransition(18110895568550L);
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) cachedDateTimeZone8);
        boolean boolean14 = cachedDateTimeZone8.isFixed();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 18110895568550L + "'", long12 == 18110895568550L);
        org.junit.Assert.assertNotNull(gregorianChronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = partial0.toString(dateTimeFormatter13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType16 = partial0.getFieldType(183276);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 183276");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(1L, locale6);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone2);
        java.lang.String str10 = cachedDateTimeZone8.getNameKey((-476134764377L));
        long long12 = cachedDateTimeZone8.previousTransition(18110895568550L);
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) cachedDateTimeZone8);
        int int15 = cachedDateTimeZone8.getOffsetFromLocal(2835481900L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 18110895568550L + "'", long12 == 18110895568550L);
        org.junit.Assert.assertNotNull(gregorianChronology13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("UTC", 100);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeZoneBuilder3.toDateTimeZone("ISOChronology[America/Los_Angeles]", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder3.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder3.setFixedSavings("1969", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder11.setStandardOffset(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder11.addRecurringSavings("org.joda.time.IllegalFieldValueException: Value 60035 for hourOfDay is not supported: ", (-223445), (-10), 0, 'a', 300, 2117409001, 197, false, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone10 = zonedChronology4.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = zonedChronology4.getDateTimeMillis((-5510), 16, 11, 17127628, 195, (int) (short) 100, (-7));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 17127628 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = zonedChronology4.getDateTimeMillis(2440588L, 1969, (int) (short) 10, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        java.lang.String str7 = dateTimeZone5.getNameKey((long) 28354819);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        long long14 = fixedDateTimeZone12.nextTransition(0L);
        int int16 = fixedDateTimeZone12.getStandardOffset(2440588L);
        long long18 = dateTimeZone5.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone12, (long) 25306);
        long long20 = fixedDateTimeZone12.convertUTCToLocal(1515848793868914L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25306L + "'", long18 == 25306L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1515848793868914L + "'", long20 == 1515848793868914L);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        java.lang.String str6 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.getMillis((-60589296000000L), (-476134744301L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[hours]" + "'", str4, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnsupportedDurationField[hours]" + "'", str6, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        int int7 = gregorianChronology5.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField8 = gregorianChronology5.weekyears();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = gregorianChronology5.withZone(dateTimeZone9);
        long long14 = gregorianChronology5.add((long) (-1893415679), (long) 195, 96);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = gregorianChronology5.getDateTimeMillis((-81420880752000000L), 53460006, (int) (short) 100, 10, (-28799989));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53460006 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1893396959L) + "'", long14 == (-1893396959L));
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        boolean boolean8 = unsupportedDateTimeField6.isLenient();
        org.joda.time.DurationField durationField9 = unsupportedDateTimeField6.getRangeDurationField();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = unsupportedDateTimeField6.addWrapField(306607L, 9);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(durationField9);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
        org.joda.time.DurationField durationField11 = zonedChronology4.weeks();
        org.joda.time.DurationField durationField12 = zonedChronology4.seconds();
        long long15 = durationField12.subtract(53460005L, 1256776840409L);
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
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1256776786948995L) + "'", long15 == (-1256776786948995L));
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = unsupportedDateTimeField6.getType();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = unsupportedDateTimeField6.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = unsupportedDateTimeField6.remainder(24L);
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
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = zonedChronology4.getDateTimeMillis(3160L, (-1893415679), 28354819, 9, 296907);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1893415679 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
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
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone2.getShortName(4043277714135727L, locale13);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone2.isLocalDateTimeGap(localDateTime15);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("-1", "", 0, (int) '4');
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = null;
        boolean boolean8 = readableInterval6.contains(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.halfdayOfDay();
        long long13 = dateTimeField10.add((long) ' ', (int) (byte) 10);
        boolean boolean14 = fixedDateTimeZone4.equals((java.lang.Object) ' ');
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = fixedDateTimeZone4.getOffset(readableInstant15);
        int int18 = fixedDateTimeZone4.getStandardOffset(3L);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 432000032L + "'", long13 == 432000032L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = zonedChronology4.getDateTimeMillis((-57530990L), (int) (short) -1, 8, (int) '#', (-190992));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getDurationType();
        org.joda.time.field.PreciseDurationField preciseDurationField9 = new org.joda.time.field.PreciseDurationField(durationFieldType7, 28354819L);
        long long12 = preciseDurationField9.getMillis((int) '#', 551169L);
        int int14 = preciseDurationField9.getValue((long) 21);
        boolean boolean15 = iSOChronology0.equals((java.lang.Object) 21);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 992418665L + "'", long12 == 992418665L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField12 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11);
        long long15 = remainderDateTimeField12.addWrapField((-252460798562L), (int) (byte) -1);
        org.joda.time.DurationField durationField16 = remainderDateTimeField12.getLeapDurationField();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-283996798562L) + "'", long15 == (-283996798562L));
        org.junit.Assert.assertNull(durationField16);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        java.lang.String str13 = partial0.toString();
        org.joda.time.DurationFieldType durationFieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial16 = partial0.withFieldAdded(durationFieldType14, 199);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        java.lang.String str8 = zonedChronology4.toString();
        org.joda.time.DurationField durationField9 = zonedChronology4.hours();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.era();
        org.joda.time.DurationField durationField12 = zonedChronology4.weeks();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str8, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        java.lang.String str6 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unsupportedDurationField1.getValue(17460000L, (long) 58571700);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[hours]" + "'", str4, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnsupportedDurationField[hours]" + "'", str6, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DurationField durationField11 = gregorianChronology5.halfdays();
        org.joda.time.Partial partial12 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.DurationField durationField13 = gregorianChronology5.millis();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology5.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = gregorianChronology5.getDateTimeMillis(0, 32, (int) (byte) 0, 10, (int) (short) 10, 53460006, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53460006 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        boolean boolean4 = unsupportedDurationField1.isPrecise();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.seconds();
        java.lang.String str6 = durationFieldType5.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.ScaledDurationField scaledDurationField8 = new org.joda.time.field.ScaledDurationField((org.joda.time.DurationField) unsupportedDurationField1, durationFieldType5, 28354759);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must be supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "seconds" + "'", str6, "seconds");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str4 = dateTimeZone3.toString();
        java.lang.String str6 = dateTimeZone3.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone7);
        java.lang.Object obj9 = null;
        boolean boolean10 = cachedDateTimeZone8.equals(obj9);
        org.joda.time.Chronology chronology11 = iSOChronology0.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone8);
        int int13 = cachedDateTimeZone8.getOffset((-476134737921L));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = zonedChronology4.getDateTimeMillis((int) (byte) 0, 60000, 195, 109);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 60000 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.Object obj4 = null;
        boolean boolean5 = unsupportedDurationField1.equals(obj4);
        org.joda.time.DurationFieldType durationFieldType6 = unsupportedDurationField1.getType();
        boolean boolean7 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = unsupportedDurationField1.getValueAsLong((-13108571884545774L), 165294489600028L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        long long17 = dividedDateTimeField11.getDifferenceAsLong((long) 10, 1704067200000L);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = dividedDateTimeField11.getType();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-5L) + "'", long17 == (-5L));
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DurationField durationField11 = gregorianChronology5.halfdays();
        org.joda.time.Partial partial12 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology5);
        int int13 = gregorianChronology5.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField14 = gregorianChronology5.minutes();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = gregorianChronology5.getDateTimeMillis((int) (short) -1, 4, 2, (-11021), 53, 199, 53460005);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -11021 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField2 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField5 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField6 = iSOChronology1.days();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.hourOfHalfday();
        boolean boolean9 = durationFieldType0.isSupported((org.joda.time.Chronology) iSOChronology1);
        java.lang.String str10 = iSOChronology1.toString();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ISOChronology[UTC]" + "'", str10, "ISOChronology[UTC]");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField7 = iSOChronology6.minutes();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str9 = dateTimeZone8.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology10 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology6, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = zonedChronology10.getZone();
        boolean boolean12 = fixedDateTimeZone4.equals((java.lang.Object) zonedChronology10);
        int int14 = fixedDateTimeZone4.getOffsetFromLocal(1256776840409L);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.secondOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology6 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology2, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology6.getZone();
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone7);
        org.joda.time.Chronology chronology9 = iSOChronology0.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField7 = iSOChronology6.minutes();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str9 = dateTimeZone8.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology10 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology6, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = zonedChronology10.getZone();
        boolean boolean12 = fixedDateTimeZone4.equals((java.lang.Object) zonedChronology10);
        int int14 = fixedDateTimeZone4.getStandardOffset((-45757612800000L));
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        long long6 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unsupportedDurationField1.getDifference((-163746160093797L), 1701260519822L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.minutes();
        boolean boolean6 = durationFieldType0.isSupported(chronology3);
        org.joda.time.field.PreciseDurationField preciseDurationField8 = new org.joda.time.field.PreciseDurationField(durationFieldType0, (long) (short) 100);
        long long9 = preciseDurationField8.getUnitMillis();
        boolean boolean10 = preciseDurationField8.isSupported();
        long long13 = preciseDurationField8.getMillis(197, 62167104000004L);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 19700L + "'", long13 == 19700L);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = partial0.getFieldTypes();
        int[] intArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial15 = new org.joda.time.Partial(dateTimeFieldTypeArray13, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Values array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        long long3 = unsupportedDurationField1.getUnitMillis();
        boolean boolean4 = unsupportedDurationField1.isPrecise();
        boolean boolean5 = unsupportedDurationField1.isPrecise();
        long long6 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType7 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = unsupportedDurationField1.getMillis((-4881L), 4789L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType7);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(1L, locale6);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone2);
        java.lang.String str9 = dateTimeZone2.toString();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        long long14 = dateTimeZone2.convertLocalToUTC((-62043766838086L), false, 828754621377181L);
        long long17 = dateTimeZone2.adjustOffset((-80340288961132L), true);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-62043766838086L) + "'", long14 == (-62043766838086L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-80340288961132L) + "'", long17 == (-80340288961132L));
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.lang.String str5 = zonedChronology4.toString();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = zonedChronology4.getDateTimeMillis(132259650, 97, 3, 2117409001, 96, 297, 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2117409001 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str5, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 60035L, "");
        boolean boolean4 = org.joda.time.IllegalInstantException.isIllegalInstant((java.lang.Throwable) illegalFieldValueException3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.IllegalFieldValueException illegalFieldValueException8 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType5, (java.lang.Number) 10L, "hourOfDay");
        java.lang.Number number9 = illegalFieldValueException8.getIllegalNumberValue();
        illegalFieldValueException3.addSuppressed((java.lang.Throwable) illegalFieldValueException8);
        java.lang.String str11 = illegalFieldValueException3.getFieldName();
        java.lang.String str12 = illegalFieldValueException3.getIllegalStringValue();
        java.lang.Number number13 = illegalFieldValueException3.getLowerBound();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 10L + "'", number9, 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hourOfDay" + "'", str11, "hourOfDay");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(number13);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        boolean boolean6 = unsupportedDurationField1.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.getMillis((-476134761769L), 18526321L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DurationField durationField4 = iSOChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField6 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField7 = iSOChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        boolean boolean6 = unsupportedDurationField1.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unsupportedDurationField1.getValue((-476134747319L), 28354819L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        boolean boolean6 = unsupportedDurationField1.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.getMillis((-1463), (-476134564980L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = chronology6.add(readablePeriod7, 0L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField11 = chronology6.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology6.hourOfHalfday();
        int int14 = dateTimeField12.getMinimumValue((-97L));
        int int17 = dateTimeField12.getDifference(73188819L, (-28800000L));
        int int19 = dateTimeField12.getMinimumValue(94696980268L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 28 + "'", int17 == 28);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, "2023-11-29T12:19:27.125-08:00/2023-11-29T12:19:27.125-08:00");
        java.lang.Number number3 = illegalFieldValueException2.getUpperBound();
        java.lang.String str4 = illegalFieldValueException2.getIllegalValueAsString();
        org.joda.time.DurationFieldType durationFieldType5 = illegalFieldValueException2.getDurationFieldType();
        org.joda.time.DurationFieldType durationFieldType6 = illegalFieldValueException2.getDurationFieldType();
        java.lang.Throwable[] throwableArray7 = illegalFieldValueException2.getSuppressed();
        java.lang.String str8 = illegalFieldValueException2.getIllegalValueAsString();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2023-11-29T12:19:27.125-08:00/2023-11-29T12:19:27.125-08:00" + "'", str4, "2023-11-29T12:19:27.125-08:00/2023-11-29T12:19:27.125-08:00");
        org.junit.Assert.assertNull(durationFieldType5);
        org.junit.Assert.assertNull(durationFieldType6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2023-11-29T12:19:27.125-08:00/2023-11-29T12:19:27.125-08:00" + "'", str8, "2023-11-29T12:19:27.125-08:00/2023-11-29T12:19:27.125-08:00");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        boolean boolean6 = unsupportedDurationField1.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unsupportedDurationField1.getDifference(3252833653L, 2580268L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
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
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone2.getName((-476134762581L), locale13);
        org.joda.time.chrono.GregorianChronology gregorianChronology15 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone2);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(gregorianChronology15);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        long long3 = unsupportedDurationField1.getUnitMillis();
        boolean boolean4 = unsupportedDurationField1.isPrecise();
        boolean boolean5 = unsupportedDurationField1.isPrecise();
        long long6 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType7 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.getMillis(38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType7);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.clockhourOfHalfday();
        java.lang.String str6 = iSOChronology0.toString();
        org.joda.time.DurationField durationField7 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = iSOChronology0.getDateTimeMillis(197, (int) '4', 96, (-223445));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -223445 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[hourOfDay]" + "'", str6, "ISOChronology[hourOfDay]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        org.joda.time.DurationField durationField8 = zonedChronology4.days();
        org.joda.time.DateTimeZone dateTimeZone9 = zonedChronology4.getZone();
        org.joda.time.DurationField durationField10 = zonedChronology4.days();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.hourOfDay();
        java.lang.String str12 = dateTimeField11.toString();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateTimeField[hourOfDay]" + "'", str12, "DateTimeField[hourOfDay]");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        boolean boolean6 = unsupportedDurationField1.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unsupportedDurationField1.getValue(1701260517072L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        long long6 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unsupportedDurationField1.getValue((-476134742633L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.Object obj4 = null;
        boolean boolean5 = unsupportedDurationField1.equals(obj4);
        org.joda.time.DurationFieldType durationFieldType6 = unsupportedDurationField1.getType();
        boolean boolean7 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.getValueAsLong(970L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = partial0.getFieldTypes();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = partial0.getFormatter();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = partial0.getFieldTypes();
        java.lang.Class<?> wildcardClass16 = dateTimeFieldTypeArray15.getClass();
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
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
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.year();
        int int14 = dateTimeField12.getMaximumValue(649027L);
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 292278993 + "'", int14 == 292278993);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        long long6 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.getDifferenceAsLong((-476134713443L), (-476134737972L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[hours]" + "'", str4, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField12 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11);
        long long14 = dividedDateTimeField11.remainder((-476134751380L));
        long long16 = dividedDateTimeField11.remainder(0L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 155017248620L + "'", long14 == 155017248620L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        boolean boolean5 = unsupportedDurationField1.isPrecise();
        java.lang.String str6 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unsupportedDurationField1.getValue((-124568580134000L), (-476134761950L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hours" + "'", str6, "hours");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        org.joda.time.DurationField durationField8 = zonedChronology4.days();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = zonedChronology4.getDateTimeMillis((-59028998263764L), 719, 292316, 53, 955);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 719 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        java.lang.String str6 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unsupportedDurationField1.getValue(9223371890899200000L, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[hours]" + "'", str4, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hours" + "'", str6, "hours");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology4.clockhourOfHalfday();
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "", 0, 4);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str7 = fixedDateTimeZone4.getName(97L);
        int int9 = fixedDateTimeZone4.getOffsetFromLocal((-210858120000000L));
        boolean boolean10 = fixedDateTimeZone4.isFixed();
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int13 = fixedDateTimeZone4.getOffsetFromLocal((-476134761954L));
        java.util.Locale locale15 = null;
        java.lang.String str16 = fixedDateTimeZone4.getShortName(1701260525343L, locale15);
        boolean boolean17 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iSOChronology11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        java.lang.String str6 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.getMillis((-53459996L), 1701291599993L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[hours]" + "'", str4, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hours" + "'", str6, "hours");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        boolean boolean6 = unsupportedDurationField1.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.add((long) 32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.PreciseDurationField preciseDurationField3 = new org.joda.time.field.PreciseDurationField(durationFieldType1, 28354819L);
        long long6 = preciseDurationField3.getMillis((long) (short) 100, 1701289160741L);
        boolean boolean8 = preciseDurationField3.equals((java.lang.Object) (-6027150136924300L));
        long long11 = preciseDurationField3.getMillis((int) '4', 1701289172565L);
        long long14 = preciseDurationField3.getValueAsLong(53L, 551169L);
        long long17 = preciseDurationField3.getDifferenceAsLong((-476134739672L), 0L);
        long long20 = preciseDurationField3.getDifferenceAsLong(1701274824730L, 1701289169593L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2835481900L + "'", long6 == 2835481900L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1474450588L + "'", long11 == 1474450588L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-16792L) + "'", long17 == (-16792L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "", 0, 4);
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.yearOfCentury();
        org.joda.time.DurationField durationField9 = chronology7.millis();
        org.joda.time.DurationField durationField10 = chronology7.centuries();
        org.joda.time.Chronology chronology11 = chronology7.withUTC();
        boolean boolean12 = fixedDateTimeZone4.equals((java.lang.Object) chronology11);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.lang.String str15 = fixedDateTimeZone4.getNameKey(1439L);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        long long10 = unsupportedDateTimeField6.add(9972000000L, 26297460000L);
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = unsupportedDateTimeField6.getAsShortText((-463), locale12);
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 36269460000L + "'", long10 == 36269460000L);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        boolean boolean5 = unsupportedDurationField1.isPrecise();
        java.lang.String str6 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.getMillis((-287999960), (-659796060535L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hours" + "'", str6, "hours");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.halfdayOfDay();
        org.joda.time.DurationField durationField9 = zonedChronology4.minutes();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = zonedChronology4.getDateTimeMillis(53, 0, (-1669753266), 1439);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField5 = zonedChronology4.secondOfDay();
        long long9 = zonedChronology4.add((long) 4, (-476134715294L), 60000);
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = zonedChronology4.getDateTimeMillis(1262304000000L, 52, 0, 7, 197);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
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
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "", 0, 4);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str7 = fixedDateTimeZone4.getName(97L);
        int int9 = fixedDateTimeZone4.getOffsetFromLocal((-210858120000000L));
        long long11 = fixedDateTimeZone4.nextTransition(0L);
        int int13 = fixedDateTimeZone4.getOffset(2580171L);
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
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
        org.joda.time.DurationField durationField11 = zonedChronology4.weeks();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology4.dayOfWeek();
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
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        boolean boolean5 = unsupportedDurationField1.isPrecise();
        java.lang.String str6 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.add((-476134718900L), (-476134749439L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hours" + "'", str6, "hours");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
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
        org.joda.time.DurationField durationField11 = zonedChronology4.weeks();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology4.monthOfYear();
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
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = null;
        boolean boolean7 = readableInterval5.contains(readableInterval6);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = readableInterval5.toPeriod(periodType8);
        int[] intArray12 = iSOChronology0.get((org.joda.time.ReadablePeriod) period9, 4L, (long) '#');
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology0.year();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, 0, 0, 0, 31]");
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = partial0.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType15 = partial0.getFieldType((-28799996));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -28799996");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
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
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.year();
        org.joda.time.DateTimeZone dateTimeZone12 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology4.millisOfDay();
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        boolean boolean5 = unsupportedDurationField1.isPrecise();
        java.lang.String str6 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.getValueAsLong(0L, (-3671845792L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hours" + "'", str6, "hours");
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        boolean boolean5 = unsupportedDurationField1.isPrecise();
        java.lang.String str6 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.subtract(19808L, (-28799992));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hours" + "'", str6, "hours");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.lang.String str5 = zonedChronology4.toString();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = zonedChronology4.centuries();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.dayOfMonth();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str5, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("UTC", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder3.addRecurringSavings("2023-11-29T12:19:27.691-08:00/2023-11-29T12:19:27.691-08:00", (-7), (int) (short) 0, (int) (short) -1, '4', (int) '4', (int) (short) 0, 32, true, (-28800000));
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeZoneBuilder3.toDateTimeZone("4", true);
        java.lang.String str19 = dateTimeZone17.getShortName(29227899L);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        long long22 = dateTimeZone17.getMillisKeepLocal(dateTimeZone20, (-476134731634L));
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone17.getName(6152027739375084L, locale24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-476134731534L) + "'", long22 == (-476134731534L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
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
        org.joda.time.DurationField durationField11 = zonedChronology4.weeks();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.weekyear();
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology4.era();
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
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
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
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.minuteOfHour();
        org.joda.time.DurationField durationField12 = zonedChronology4.years();
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology4.halfdayOfDay();
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.Duration duration4 = readableInterval1.toDuration();
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = null;
        boolean boolean8 = readableInterval6.contains(readableInterval7);
        org.joda.time.Duration duration9 = readableInterval6.toDuration();
        org.joda.time.DateTime dateTime10 = readableInterval6.getEnd();
        boolean boolean11 = readableInterval1.isBefore((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.MutableInterval mutableInterval12 = readableInterval1.toMutableInterval();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(mutableInterval12);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.dayOfMonth();
        org.joda.time.DurationField durationField13 = zonedChronology4.minutes();
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
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
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.year();
        org.joda.time.Chronology chronology12 = zonedChronology4.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology4.hourOfDay();
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
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
        org.joda.time.DurationField durationField11 = zonedChronology4.weeks();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.era();
        org.joda.time.DateTimeZone dateTimeZone13 = zonedChronology4.getZone();
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
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
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
        boolean boolean11 = dateTimeField10.isSupported();
        java.util.Locale locale14 = null;
        long long15 = dateTimeField10.set(1069199995L, "-472580", locale14);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-14975350124400005L) + "'", long15 == (-14975350124400005L));
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        boolean boolean6 = unsupportedDurationField1.equals((java.lang.Object) 216126000000L);
        long long7 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = unsupportedDurationField1.getMillis((-9632622), 1701260510770L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
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
        org.joda.time.DurationField durationField11 = zonedChronology4.millis();
        org.joda.time.Chronology chronology12 = zonedChronology4.withUTC();
        org.joda.time.DurationField durationField13 = zonedChronology4.months();
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
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.lang.String str5 = zonedChronology4.toString();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = dateTimeField8.set(30610224000100L, "");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for clockhourOfHalfday is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str5, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        boolean boolean6 = unsupportedDurationField1.equals((java.lang.Object) 216126000000L);
        long long7 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = unsupportedDurationField1.add(889061906552672364L, (long) 38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial7 = null;
        int[] intArray14 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int15 = dateTimeField6.getMaximumValue(readablePartial7, intArray14);
        java.util.Locale locale16 = null;
        int int17 = dateTimeField6.getMaximumTextLength(locale16);
        long long20 = dateTimeField6.addWrapField(1701289162973L, 6691);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1701271162973L + "'", long20 == 1701271162973L);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField12 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11);
        int int13 = dividedDateTimeField11.getMinimumValue();
        int int15 = dividedDateTimeField11.get(1225226725109L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        boolean boolean6 = unsupportedDurationField1.equals((java.lang.Object) 216126000000L);
        long long7 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = unsupportedDurationField1.getMillis((long) 1969, 9700L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.weekyear();
        boolean boolean12 = dateTimeField10.isLeap((-28739965L));
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeField10.getAsShortText(183661320862L, locale14);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1975" + "'", str15, "1975");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.lang.String str5 = zonedChronology4.toString();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.millisOfDay();
        long long11 = zonedChronology4.getDateTimeMillis((-1), (int) (short) 1, 23, 4);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = zonedChronology4.getDateTimeMillis(2835106303L, 0, 2, 29, (-28799992));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -28799992 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str5, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-62196854399996L) + "'", long11 == (-62196854399996L));
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        java.lang.String str11 = zonedChronology4.toString();
        org.joda.time.DurationField durationField12 = zonedChronology4.halfdays();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str11, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        java.lang.String str8 = unsupportedDateTimeField6.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = unsupportedDateTimeField6.getMaximumValue((-2208988800000L));
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnsupportedDateTimeField" + "'", str8, "UnsupportedDateTimeField");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.minutes();
        boolean boolean6 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DateTimeField dateTimeField7 = chronology3.dayOfMonth();
        org.joda.time.Chronology chronology8 = chronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.dayOfYear();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        boolean boolean11 = unsupportedDateTimeField6.isLenient();
        org.joda.time.DurationField durationField12 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DurationField durationField13 = unsupportedDateTimeField6.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(durationField12);
        org.junit.Assert.assertNull(durationField13);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add(2835106203L, (int) (byte) 100);
        boolean boolean10 = unsupportedDateTimeField6.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = unsupportedDateTimeField6.getMinimumValue((-4453608L));
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2835106303L + "'", long9 == 2835106303L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        long long7 = iSOChronology0.getDateTimeMillis(1, 1, (int) (byte) 1, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str9 = dateTimeZone8.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology10 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone8);
        org.joda.time.DurationField durationField11 = iSOChronology0.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = durationField11.add(680515656L, 186891078683L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 186891078683");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-62135596799900L) + "'", long7 == (-62135596799900L));
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str3 = dateTimeZone0.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone5 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone4);
        boolean boolean7 = cachedDateTimeZone5.equals((java.lang.Object) 432000032L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) cachedDateTimeZone5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(cachedDateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        org.joda.time.DurationField durationField8 = zonedChronology4.days();
        org.joda.time.DateTimeZone dateTimeZone9 = zonedChronology4.getZone();
        org.joda.time.DurationField durationField10 = zonedChronology4.days();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.era();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = unsupportedDateTimeField6.getType();
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = unsupportedDateTimeField6.set((long) 100, "60035", locale13);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        long long10 = unsupportedDateTimeField6.add((-53459996L), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = unsupportedDateTimeField6.getDifference(6887L, 16725225600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -16725225593113");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-53459996L) + "'", long10 == (-53459996L));
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        int int13 = unsupportedDateTimeField6.getDifference((long) (byte) 10, 10L);
        org.joda.time.DurationField durationField14 = unsupportedDateTimeField6.getDurationField();
        boolean boolean15 = unsupportedDateTimeField6.isSupported();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = zonedChronology4.centuries();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.clockhourOfHalfday();
        org.joda.time.Partial partial10 = new org.joda.time.Partial((org.joda.time.Chronology) zonedChronology4);
        java.lang.String str12 = partial10.toString("2");
        int int13 = partial10.size();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2" + "'", str12, "2");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(1L, locale6);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = cachedDateTimeZone8.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = cachedDateTimeZone8.toTimeZone();
        long long13 = cachedDateTimeZone8.previousTransition(31507200019L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 31507200019L + "'", long13 == 31507200019L);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        boolean boolean6 = unsupportedDurationField1.isPrecise();
        boolean boolean7 = unsupportedDurationField1.isSupported();
        org.joda.time.DurationFieldType durationFieldType8 = unsupportedDurationField1.getType();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(durationFieldType8);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.joda.time.tz.DefaultNameProvider defaultNameProvider0 = new org.joda.time.tz.DefaultNameProvider();
        java.util.Locale locale1 = null;
        java.lang.String str4 = defaultNameProvider0.getShortName(locale1, "UTC", "");
        java.util.Locale locale5 = null;
        java.lang.String str8 = defaultNameProvider0.getName(locale5, "69", "69");
        java.util.Locale locale9 = null;
        java.lang.String str12 = defaultNameProvider0.getName(locale9, "", "org.joda.time.IllegalFieldValueException: Value 10 for dayOfYear is not supported: hourOfDay");
        org.joda.time.DateTimeZone.setNameProvider((org.joda.time.tz.NameProvider) defaultNameProvider0);
        java.util.Locale locale14 = null;
        java.lang.String str17 = defaultNameProvider0.getName(locale14, "", "+00:00");
        java.util.Locale locale18 = null;
        java.lang.String str21 = defaultNameProvider0.getName(locale18, "208", "2001-01-01T08:00:00.007+00:00:00.007/2001-01-01T08:00:00.007+00:00:00.007");
        java.util.Locale locale22 = null;
        java.lang.String str25 = defaultNameProvider0.getName(locale22, "196", "seconds");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.lang.String str5 = zonedChronology4.toString();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.clockhourOfHalfday();
        java.lang.String str9 = zonedChronology4.toString();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.monthOfYear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str5, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str9, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology2.centuryOfEra();
        org.joda.time.DurationField durationField4 = iSOChronology2.weeks();
        java.lang.String str5 = durationField4.toString();
        int int6 = unsupportedDurationField1.compareTo(durationField4);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = durationField4.getMillis((-61220448000000L), 946713600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -61220448000000 * 604800000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DurationField[weeks]" + "'", str5, "DurationField[weeks]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.lang.String str5 = zonedChronology4.toString();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.clockhourOfHalfday();
        java.lang.String str9 = zonedChronology4.toString();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.centuryOfEra();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str5, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str9, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("UTC", 100);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeZoneBuilder3.toDateTimeZone("ISOChronology[America/Los_Angeles]", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder3.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder3.setFixedSavings("1969", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder11.setStandardOffset(1);
        java.io.OutputStream outputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder13.writeTo("hours", outputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.lang.String str5 = zonedChronology4.toString();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = zonedChronology4.centuries();
        java.lang.String str10 = zonedChronology4.toString();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str5, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str10, "ZonedChronology[ISOChronology[UTC], UTC]");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        boolean boolean6 = unsupportedDurationField1.isPrecise();
        org.joda.time.DurationFieldType durationFieldType7 = unsupportedDurationField1.getType();
        boolean boolean8 = unsupportedDurationField1.isPrecise();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str3 = dateTimeZone0.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone5 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone4);
        boolean boolean7 = cachedDateTimeZone5.equals((java.lang.Object) 432000032L);
        int int9 = cachedDateTimeZone5.getOffset(1L);
        java.lang.String str11 = cachedDateTimeZone5.getNameKey((-31507200000L));
        long long13 = cachedDateTimeZone5.previousTransition(182L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(cachedDateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 182L + "'", long13 == 182L);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        org.joda.time.DurationFieldType durationFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial15 = partial0.withFieldAddWrapped(durationFieldType13, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology2.centuryOfEra();
        org.joda.time.DurationField durationField4 = iSOChronology2.weeks();
        java.lang.String str5 = durationField4.toString();
        int int6 = unsupportedDurationField1.compareTo(durationField4);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.getDifferenceAsLong(3252833653L, 114669905158419L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DurationField[weeks]" + "'", str5, "DurationField[weeks]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology5.millisOfDay();
        org.joda.time.DurationField durationField12 = gregorianChronology5.weeks();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology5.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = gregorianChronology5.getDateTimeMillis(100, 28354759, 0, 296907);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28354759 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.Object obj5 = null;
        boolean boolean6 = unsupportedDurationField1.equals(obj5);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.getMillis(1701260525343L, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.PreciseDurationField preciseDurationField3 = new org.joda.time.field.PreciseDurationField(durationFieldType1, 28354819L);
        long long4 = preciseDurationField3.getUnitMillis();
        boolean boolean5 = preciseDurationField3.isPrecise();
        long long8 = preciseDurationField3.getValueAsLong((long) 719, 306607L);
        long long11 = preciseDurationField3.add(0L, 195);
        long long12 = preciseDurationField3.getUnitMillis();
        long long15 = preciseDurationField3.getMillis((long) (-472580), (-2177452800000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 28354819L + "'", long4 == 28354819L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5529189705L + "'", long11 == 5529189705L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 28354819L + "'", long12 == 28354819L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-13399920363020L) + "'", long15 == (-13399920363020L));
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology2.centuryOfEra();
        org.joda.time.DurationField durationField4 = iSOChronology2.weeks();
        java.lang.String str5 = durationField4.toString();
        int int6 = unsupportedDurationField1.compareTo(durationField4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unsupportedDurationField1.getDifference(3395L, 1515848793868914L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DurationField[weeks]" + "'", str5, "DurationField[weeks]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        boolean boolean6 = unsupportedDurationField1.isPrecise();
        long long7 = unsupportedDurationField1.getUnitMillis();
        boolean boolean8 = unsupportedDurationField1.isPrecise();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone5 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology6.getZone();
        boolean boolean8 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) gregorianChronology6);
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology6.hourOfHalfday();
        java.lang.String str10 = gregorianChronology6.toString();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology6.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology6.minuteOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GregorianChronology[100]" + "'", str10, "GregorianChronology[100]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = zonedChronology4.getDateTimeMillis((-593102), 0, 1968, (int) (short) 1, 197, (-1893415679), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 197 for minuteOfHour must be in the range [0,59]");
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
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, "2023-11-29T12:19:27.125-08:00/2023-11-29T12:19:27.125-08:00");
        java.lang.Number number3 = illegalFieldValueException2.getUpperBound();
        java.lang.String str4 = illegalFieldValueException2.getIllegalValueAsString();
        org.joda.time.DurationFieldType durationFieldType5 = illegalFieldValueException2.getDurationFieldType();
        org.joda.time.DurationFieldType durationFieldType6 = illegalFieldValueException2.getDurationFieldType();
        org.joda.time.DurationFieldType durationFieldType7 = illegalFieldValueException2.getDurationFieldType();
        java.lang.Throwable[] throwableArray8 = illegalFieldValueException2.getSuppressed();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2023-11-29T12:19:27.125-08:00/2023-11-29T12:19:27.125-08:00" + "'", str4, "2023-11-29T12:19:27.125-08:00/2023-11-29T12:19:27.125-08:00");
        org.junit.Assert.assertNull(durationFieldType5);
        org.junit.Assert.assertNull(durationFieldType6);
        org.junit.Assert.assertNull(durationFieldType7);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.lang.String str5 = zonedChronology4.toString();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.hourOfDay();
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = dateTimeField6.set((-476134763546L), "org.joda.time.IllegalFieldValueException: Value \"UTC\" for dayOfMonth is not supported", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"org.joda.time.IllegalFieldValueException: Value \"UTC\" for dayOfMonth is not supported\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str5, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = zonedChronology4.getDateTimeMillis((long) 6, (-1669753266), 297109, (-9632622), 1889);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1669753266 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        long long3 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, 2580171L);
        long long7 = dateTimeZone0.convertLocalToUTC((-1L), false, 946713600000L);
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone0.getOffset(readableInstant9);
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0, 3);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2580164L + "'", long3 == 2580164L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(iSOChronology11);
        org.junit.Assert.assertNotNull(gregorianChronology13);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology2.centuryOfEra();
        org.joda.time.DurationField durationField4 = iSOChronology2.weeks();
        java.lang.String str5 = durationField4.toString();
        int int6 = unsupportedDurationField1.compareTo(durationField4);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDurationField1.getMillis((-60505833599976L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DurationField[weeks]" + "'", str5, "DurationField[weeks]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        long long3 = unsupportedDurationField1.getUnitMillis();
        boolean boolean4 = unsupportedDurationField1.isPrecise();
        boolean boolean5 = unsupportedDurationField1.isPrecise();
        long long6 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.getDifferenceAsLong(86400028L, (-1702281628408L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = iSOChronology0.get(readablePeriod9, 52L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        java.lang.String str11 = partial0.toString();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = partial0.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField14 = partial0.getField(53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        boolean boolean8 = unsupportedDateTimeField6.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = unsupportedDateTimeField6.getAsText(1701289183453L);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.joda.time.tz.DefaultNameProvider defaultNameProvider0 = new org.joda.time.tz.DefaultNameProvider();
        java.util.Locale locale1 = null;
        java.lang.String str4 = defaultNameProvider0.getShortName(locale1, "UTC", "");
        java.util.Locale locale5 = null;
        java.lang.String str8 = defaultNameProvider0.getName(locale5, "69", "69");
        java.util.Locale locale9 = null;
        java.lang.String str12 = defaultNameProvider0.getName(locale9, "", "org.joda.time.IllegalFieldValueException: Value 10 for dayOfYear is not supported: hourOfDay");
        org.joda.time.DateTimeZone.setNameProvider((org.joda.time.tz.NameProvider) defaultNameProvider0);
        java.util.Locale locale14 = null;
        java.lang.String str17 = defaultNameProvider0.getName(locale14, "ISOChronology[America/Los_Angeles]", "dayOfMonth");
        java.util.Locale locale18 = null;
        java.lang.String str21 = defaultNameProvider0.getShortName(locale18, "", "-1");
        java.util.Locale locale22 = null;
        java.lang.String str25 = defaultNameProvider0.getShortName(locale22, "dayOfYear", "11");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology5.dayOfYear();
        org.joda.time.DurationField durationField12 = gregorianChronology5.eras();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology5.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = gregorianChronology5.getDateTimeMillis(0, 970, 58571700, 29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 970 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        int int2 = dateTimeZone0.getStandardOffset((long) 1);
        org.joda.time.chrono.ISOChronology iSOChronology3 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField4 = iSOChronology3.minutes();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str6 = dateTimeZone5.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology7 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology3, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = zonedChronology7.getZone();
        long long10 = dateTimeZone0.getMillisKeepLocal(dateTimeZone8, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(iSOChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField5 = iSOChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = iSOChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.secondOfMinute();
        org.joda.time.DurationField durationField10 = iSOChronology0.millis();
        org.joda.time.DurationField durationField11 = iSOChronology0.minutes();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.Object obj5 = null;
        boolean boolean6 = unsupportedDurationField1.equals(obj5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unsupportedDurationField1.getValue((long) 296907);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology2.centuryOfEra();
        org.joda.time.DurationField durationField4 = iSOChronology2.weeks();
        java.lang.String str5 = durationField4.toString();
        int int6 = unsupportedDurationField1.compareTo(durationField4);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.getMillis(0, (long) (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DurationField[weeks]" + "'", str5, "DurationField[weeks]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology2.centuryOfEra();
        org.joda.time.DurationField durationField4 = iSOChronology2.weeks();
        java.lang.String str5 = durationField4.toString();
        int int6 = unsupportedDurationField1.compareTo(durationField4);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDurationField1.getMillis((-9632622));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DurationField[weeks]" + "'", str5, "DurationField[weeks]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.lang.String str5 = zonedChronology4.toString();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.millisOfDay();
        long long11 = zonedChronology4.getDateTimeMillis((-1), (int) (short) 1, 23, 4);
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology4.dayOfYear();
        org.joda.time.Chronology chronology14 = zonedChronology4.withUTC();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str5, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-62196854399996L) + "'", long11 == (-62196854399996L));
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = zonedChronology4.getDateTimeMillis((int) ' ', 0, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
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
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.Object obj5 = null;
        boolean boolean6 = unsupportedDurationField1.equals(obj5);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.add(0L, 29227899);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        boolean boolean4 = unsupportedDurationField1.isSupported();
        boolean boolean5 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.getValueAsLong((-476134715130L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = zonedChronology4.getDateTimeMillis(2580171L, 1969, 4, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unsupportedDurationField1.getValue((-103027770L), (-476134747656L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        int int7 = gregorianChronology5.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField8 = gregorianChronology5.weekyears();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = gregorianChronology5.withZone(dateTimeZone9);
        long long14 = gregorianChronology5.add((long) (-1893415679), (long) 195, 96);
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology5.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology5.clockhourOfDay();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1893396959L) + "'", long14 == (-1893396959L));
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = unsupportedDateTimeField6.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = unsupportedDateTimeField6.roundCeiling((long) 296907);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = zonedChronology4.centuries();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = zonedChronology4.getDateTimeMillis(588244621852799997L, 59, 296907, (-28799996), 30);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        org.joda.time.DurationField durationField8 = unsupportedDateTimeField6.getLeapDurationField();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = unsupportedDateTimeField6.getMaximumValue(3599993L);
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
        org.junit.Assert.assertNull(durationField8);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        java.util.Locale locale21 = null;
        java.lang.String str24 = defaultNameProvider0.getShortName(locale21, "100", "DateTimeField[millisOfDay]");
        org.joda.time.DateTimeZone.setNameProvider((org.joda.time.tz.NameProvider) defaultNameProvider0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(1L, locale6);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = cachedDateTimeZone8.isLocalDateTimeGap(localDateTime9);
        int int12 = cachedDateTimeZone8.getOffset(255193371L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = cachedDateTimeZone8.getName((long) 20, locale14);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        long long10 = unsupportedDateTimeField6.add((-53459996L), (int) (short) 0);
        long long13 = unsupportedDateTimeField6.add((-210858120422000L), 0);
        boolean boolean14 = unsupportedDateTimeField6.isSupported();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-53459996L) + "'", long10 == (-53459996L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-210858120422000L) + "'", long13 == (-210858120422000L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.Object obj4 = null;
        boolean boolean5 = unsupportedDurationField1.equals(obj4);
        org.joda.time.DurationFieldType durationFieldType6 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.getMillis(28354819, (-476134727033L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationFieldType6);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology0.millis();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = iSOChronology0.getDateTimeMillis(954222071776508L, 10, (int) '#', 1439, 24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1439 for secondOfMinute must be in the range [0,59]");
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
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.minutes();
        boolean boolean6 = durationFieldType0.isSupported(chronology3);
        org.joda.time.field.PreciseDurationField preciseDurationField8 = new org.joda.time.field.PreciseDurationField(durationFieldType0, (long) (short) 100);
        long long9 = preciseDurationField8.getUnitMillis();
        long long10 = preciseDurationField8.getUnitMillis();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        long long7 = iSOChronology0.getDateTimeMillis(1, 1, (int) (byte) 1, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str9 = dateTimeZone8.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology10 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = zonedChronology10.getDateTimeMillis((-59005324746676L), 297, 200, (-1669753266), 296);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 297 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-62135596799900L) + "'", long7 == (-62135596799900L));
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology10);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        java.lang.String str5 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDurationField1.getMillis((long) (-28800000), 29078369458L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UnsupportedDurationField[hours]" + "'", str5, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.getValueAsLong(1701289159810L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unsupportedDurationField1.getValue((-624631917523L), (long) 190);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        boolean boolean8 = unsupportedDateTimeField6.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = unsupportedDateTimeField6.getLeapAmount(94090L);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        long long3 = unsupportedDurationField1.getUnitMillis();
        boolean boolean4 = unsupportedDurationField1.isPrecise();
        boolean boolean5 = unsupportedDurationField1.isPrecise();
        long long6 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDurationField1.getMillis(1701289603576L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial2 = new org.joda.time.Partial(dateTimeFieldType0, 297);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone9 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = gregorianChronology10.getZone();
        boolean boolean12 = dateTimeFieldType4.isSupported((org.joda.time.Chronology) gregorianChronology10);
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology10.minuteOfDay();
        org.joda.time.Partial partial14 = new org.joda.time.Partial(dateTimeFieldType0, (int) ' ', (org.joda.time.Chronology) gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.Object obj4 = null;
        boolean boolean5 = unsupportedDurationField1.equals(obj4);
        org.joda.time.DurationFieldType durationFieldType6 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.add(165294489600028L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationFieldType6);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDurationField1.getMillis(471, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int int13 = dividedDateTimeField11.getMaximumValue(readablePartial12);
        int int15 = dividedDateTimeField11.get(0L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29227899 + "'", int13 == 29227899);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 197 + "'", int15 == 197);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = zonedChronology4.getDateTimeMillis(53, (-30878), (-68), 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -30878 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.Object obj4 = null;
        boolean boolean5 = unsupportedDurationField1.equals(obj4);
        org.joda.time.DurationFieldType durationFieldType6 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDurationField1.getValueAsLong(2134L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationFieldType6);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = zonedChronology4.getDateTimeMillis(0L, 0, 0, (int) 'a', 3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
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
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        java.lang.String str11 = partial0.toString();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = partial0.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = partial0.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        long long5 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDurationField1.getDifferenceAsLong((-476134744733L), 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DurationField durationField4 = iSOChronology0.weeks();
        org.joda.time.DurationField durationField5 = iSOChronology0.halfdays();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone10 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        int int12 = fixedDateTimeZone10.getStandardOffset((long) 1439);
        org.joda.time.Chronology chronology13 = iSOChronology0.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DurationField durationField11 = gregorianChronology5.halfdays();
        org.joda.time.Partial partial12 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology5);
        int int13 = gregorianChronology5.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField14 = gregorianChronology5.days();
        org.joda.time.DurationField durationField15 = gregorianChronology5.hours();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology5.minuteOfDay();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone6 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone5);
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) cachedDateTimeZone6);
        java.util.Locale locale9 = null;
        java.lang.String str10 = cachedDateTimeZone6.getShortName((-124568580134000L), locale9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone((org.joda.time.DateTimeZone) cachedDateTimeZone6);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(cachedDateTimeZone6);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone5 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology6.getZone();
        boolean boolean8 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) gregorianChronology6);
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology6.hourOfHalfday();
        org.joda.time.DurationField durationField10 = gregorianChronology6.minutes();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology6.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology6.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.Object obj4 = null;
        boolean boolean5 = unsupportedDurationField1.equals(obj4);
        boolean boolean6 = unsupportedDurationField1.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unsupportedDurationField1.getValue((long) 19691);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        long long3 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, 2580171L);
        long long7 = dateTimeZone0.convertLocalToUTC((-1L), false, 946713600000L);
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone0.getOffset(readableInstant9);
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField12 = iSOChronology11.hours();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2580171L + "'", long3 == 2580171L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(iSOChronology11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        long long5 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.getValueAsLong((-992391506L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.getMillis(2835111344L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.dayOfWeek();
        org.joda.time.DurationField durationField9 = zonedChronology4.weeks();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = zonedChronology4.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.halfdayOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        java.lang.String str11 = partial0.toString();
        java.lang.String str12 = partial0.toStringList();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = partial0.getValue((-190992));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -190992");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        boolean boolean8 = unsupportedDateTimeField6.isLenient();
        long long11 = unsupportedDateTimeField6.getDifferenceAsLong(1701289170393L, 946684800000L);
        boolean boolean12 = unsupportedDateTimeField6.isSupported();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 754604370393L + "'", long11 == 754604370393L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DurationField durationField11 = gregorianChronology5.halfdays();
        org.joda.time.Partial partial12 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology5.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = gregorianChronology5.get(readablePeriod14, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        java.lang.String str5 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDurationField1.getMillis(9, (-60589295993309L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UnsupportedDurationField[hours]" + "'", str5, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        java.lang.String str11 = partial0.toString();
        int int12 = partial0.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField14 = partial0.getField(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.Object obj4 = null;
        boolean boolean5 = unsupportedDurationField1.equals(obj4);
        org.joda.time.DurationFieldType durationFieldType6 = unsupportedDurationField1.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException8 = new org.joda.time.IllegalFieldValueException(durationFieldType6, "99");
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField9 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(unsupportedDurationField9);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        boolean boolean6 = unsupportedDurationField1.equals((java.lang.Object) 216126000000L);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField1.getValueAsLong((-21691018L), 131871479137L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str4 = unsupportedDurationField1.toString();
        boolean boolean5 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDurationField1.add(1701287999993L, 199);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[hours]" + "'", str4, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDurationField1.add(1893456000000L, (-640572870328L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[hours]" + "'", str4, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType5);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.weekyear();
        org.joda.time.DurationField durationField11 = zonedChronology4.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.minuteOfDay();
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
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        boolean boolean7 = zonedChronology4.equals((java.lang.Object) 4L);
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.year();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.minuteOfHour();
        org.joda.time.DurationField durationField11 = zonedChronology4.weeks();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.yearOfEra();
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
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        long long5 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDurationField1.add(0L, (-28800000L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DurationField durationField11 = gregorianChronology5.halfdays();
        org.joda.time.Partial partial12 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology5.dayOfMonth();
        org.joda.time.Chronology chronology14 = gregorianChronology5.withUTC();
        org.joda.time.DurationField durationField15 = gregorianChronology5.hours();
        org.joda.time.DateTimeZone dateTimeZone16 = gregorianChronology5.getZone();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = partial0.getFieldTypes();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = partial0.getFormatter();
        java.lang.String str15 = partial0.toString();
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNull(dateTimeFormatter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.minuteOfHour();
        boolean boolean9 = gregorianChronology5.equals((java.lang.Object) (-2173831554426L));
        org.joda.time.DurationField durationField10 = gregorianChronology5.hours();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology5.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology5.dayOfYear();
        java.lang.String str14 = dateTimeField12.getAsText((-80816445234579L));
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "11" + "'", str14, "11");
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDurationField1.getMillis(3395L, (-62072524800007L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        org.joda.time.DurationField durationField11 = zonedChronology4.months();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.secondOfMinute();
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
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDurationField1.getMillis(196222, (-476134738486L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[hours]" + "'", str4, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType5);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        boolean boolean5 = unsupportedDurationField1.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unsupportedDurationField1.getDifference(9972000000L, (-164096150822000L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeZone dateTimeZone6 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = zonedChronology4.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = zonedChronology4.getDateTimeMillis((long) 12, 31, 719, 75, 200);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        long long5 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.getMillis(28L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.getValueAsLong((-4453608L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[hours]" + "'", str4, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType5);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        java.lang.String str5 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.getMillis(59);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UnsupportedDurationField[hours]" + "'", str5, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.minuteOfDay();
        org.joda.time.DurationField durationField3 = gregorianChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Chronology chronology6 = gregorianChronology1.withZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology1.monthOfYear();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDurationField1.add((-476134622998L), 12L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[hours]" + "'", str4, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType5);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        boolean boolean5 = unsupportedDurationField1.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDurationField1.add(1256774399900L, 292278993);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        int int6 = fixedDateTimeZone4.getStandardOffset((long) 1439);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        long long9 = fixedDateTimeZone4.nextTransition((long) 24);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        long long13 = dateTimeZone10.adjustOffset((long) 100, true);
        long long15 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone10, 10L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = fixedDateTimeZone4.getName((-17538766619L), locale17);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 24L + "'", long9 == 24L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 28800010L + "'", long15 == 28800010L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
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
        org.joda.time.DurationField durationField11 = zonedChronology4.days();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.dayOfMonth();
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
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField5 = zonedChronology4.secondOfDay();
        long long9 = zonedChronology4.add((long) 4, (-476134715294L), 60000);
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = zonedChronology4.getDateTimeMillis(1701289590309L, 52, 202, 60000, 297);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-28568082917639996L) + "'", long9 == (-28568082917639996L));
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        org.joda.time.DurationField durationField11 = zonedChronology4.weeks();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.weekOfWeekyear();
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
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("UTC", 100);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeZoneBuilder3.toDateTimeZone("ISOChronology[America/Los_Angeles]", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder3.setFixedSavings("DateTimeField[minuteOfDay]", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("9", 0, 199, 4, '#', (int) (short) 1, 59, 100, false, 0);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("ISOChronology[UTC]", false);
        long long26 = dateTimeZone23.adjustOffset((-476134737921L), true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-476134737921L) + "'", long26 == (-476134737921L));
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unsupportedDurationField1.getDifference(52L, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = partial11.toString("UnsupportedDurationField[hours]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: U");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology4.year();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology4.dayOfMonth();
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDurationField1.getMillis(8, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[hours]" + "'", str4, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType5);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        org.joda.time.DurationField durationField8 = zonedChronology4.days();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = zonedChronology4.getDateTimeMillis(0, 28354759, 3, 99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28354759 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        boolean boolean4 = unsupportedDurationField1.isPrecise();
        java.lang.String str5 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unsupportedDurationField1.getValue(1701260509270L, 95086309426292783L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(1L, locale6);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone9 = cachedDateTimeZone8.getUncachedZone();
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone((org.joda.time.DateTimeZone) cachedDateTimeZone8);
        long long14 = cachedDateTimeZone10.convertLocalToUTC(0L, true, (-163748995200000L));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(cachedDateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        boolean boolean4 = unsupportedDurationField1.isSupported();
        long long5 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unsupportedDurationField1.getValue((-476134727859L), 166726337681570L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        boolean boolean5 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unsupportedDurationField1.getValue((-408315427200000L), (-17538766619L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(164730137506203L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4347186L + "'", long1 == 4347186L);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(28786827352L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440921L + "'", long1 == 2440921L);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1225154538244L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2454768L + "'", long1 == 2454768L);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        boolean boolean5 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unsupportedDurationField1.getValue(1225154538244L, 1701289168592L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.getValueAsLong(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1225226721307L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1701260513284L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        boolean boolean4 = unsupportedDurationField1.isSupported();
        long long5 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unsupportedDurationField1.getValue(1225154538244L, 2440588L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        boolean boolean4 = unsupportedDurationField1.isSupported();
        long long5 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDurationField1.add(243995573972564L, 292278993);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((-476134772251L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2435076.6808767244d + "'", double1 == 2435076.6808767244d);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, (int) '4');
        org.joda.time.DurationField durationField15 = dividedDateTimeField11.iDurationField;
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-45757612800000L) + "'", long14 == (-45757612800000L));
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        org.joda.time.DurationField durationField8 = zonedChronology4.days();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = durationField8.subtract((long) (-28800000), (-476134721204L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 476134721204 * 86400000");
        } catch (java.lang.ArithmeticException e) {
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
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("UTC", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder3.addRecurringSavings("org.joda.time.IllegalFieldValueException: Value 10 for dayOfYear is not supported: hourOfDay", (int) (byte) 0, (int) ' ', (int) (short) -1, '4', 53460006, 0, (int) (short) -1, false, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("secondOfDay", 0);
        java.io.OutputStream outputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder17.writeTo("488", outputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.lang.String str5 = zonedChronology4.toString();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = zonedChronology4.centuries();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.yearOfEra();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str5, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) (-1492));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210995668800000L) + "'", long1 == (-210995668800000L));
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        org.joda.time.DurationField durationField8 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DurationField durationField9 = unsupportedDateTimeField6.getRangeDurationField();
        long long12 = unsupportedDateTimeField6.add(28757962973L, 152311996L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 28910274969L + "'", long12 == 28910274969L);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        long long6 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str7 = unsupportedDurationField1.toString();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[hours]" + "'", str4, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UnsupportedDurationField[hours]" + "'", str7, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone5.getOffset(readableInstant6);
        java.util.TimeZone timeZone8 = dateTimeZone5.toTimeZone();
        org.joda.time.chrono.ZonedChronology zonedChronology9 = org.joda.time.chrono.ZonedChronology.getInstance(chronology2, dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology9.year();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(zonedChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = zonedChronology4.days();
        long long11 = durationField10.getUnitMillis();
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
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 86400000L + "'", long11 == 86400000L);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        boolean boolean4 = unsupportedDurationField1.isSupported();
        long long5 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDurationField1.add(1701289179647L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology5.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology5.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology5.year();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology5.dayOfWeek();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeField11.getAsShortText((long) 53, locale13);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Thu" + "'", str14, "Thu");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.joda.time.tz.DefaultNameProvider defaultNameProvider0 = new org.joda.time.tz.DefaultNameProvider();
        java.util.Locale locale1 = null;
        java.lang.String str4 = defaultNameProvider0.getName(locale1, "13", "69");
        java.util.Locale locale5 = null;
        java.lang.String str8 = defaultNameProvider0.getShortName(locale5, "ISOChronology[UTC]", "UnsupportedDurationField[hours]");
        java.util.Locale locale9 = null;
        java.lang.String str12 = defaultNameProvider0.getName(locale9, "ISOChronology[UTC]", "DateTimeField[minuteOfDay]");
        java.util.Locale locale13 = null;
        java.lang.String str16 = defaultNameProvider0.getShortName(locale13, "1954-11-29T20:20:27.737-08:00/1954-11-29T20:20:27.737-08:00", "");
        java.util.Locale locale17 = null;
        java.lang.String str20 = defaultNameProvider0.getName(locale17, "DateTimeField[millisOfDay]", "1954-11-29T20:20:56.555-08:00/1954-11-29T20:20:56.555-08:00");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.joda.time.DurationField durationField0 = null;
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField2 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType1);
        org.joda.time.DurationFieldType durationFieldType3 = unsupportedDurationField2.getType();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField2.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.DecoratedDurationField decoratedDurationField5 = new org.joda.time.field.DecoratedDurationField(durationField0, durationFieldType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(unsupportedDurationField2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(1L, locale6);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = cachedDateTimeZone8.isLocalDateTimeGap(localDateTime9);
        int int12 = cachedDateTimeZone8.getOffset(255193371L);
        long long14 = cachedDateTimeZone8.nextTransition(69743L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 69743L + "'", long14 == 69743L);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        long long4 = unsupportedDurationField1.getUnitMillis();
        long long5 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.getMillis((-28799989));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.Object obj4 = null;
        boolean boolean5 = unsupportedDurationField1.equals(obj4);
        org.joda.time.DurationFieldType durationFieldType6 = unsupportedDurationField1.getType();
        boolean boolean7 = unsupportedDurationField1.isSupported();
        long long8 = unsupportedDurationField1.getUnitMillis();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField14 = partial0.getField(296);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 296");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.minuteOfHour();
        boolean boolean9 = gregorianChronology5.equals((java.lang.Object) (-2173831554426L));
        org.joda.time.DurationField durationField10 = gregorianChronology5.halfdays();
        org.joda.time.DateTimeZone dateTimeZone11 = gregorianChronology5.getZone();
        org.joda.time.Chronology chronology12 = gregorianChronology5.withUTC();
        org.joda.time.Chronology chronology13 = gregorianChronology5.withUTC();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.Object obj4 = null;
        boolean boolean5 = unsupportedDurationField1.equals(obj4);
        org.joda.time.DurationFieldType durationFieldType6 = unsupportedDurationField1.getType();
        boolean boolean7 = unsupportedDurationField1.isSupported();
        boolean boolean8 = unsupportedDurationField1.isSupported();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.Object obj4 = null;
        boolean boolean5 = unsupportedDurationField1.equals(obj4);
        org.joda.time.DurationFieldType durationFieldType6 = unsupportedDurationField1.getType();
        boolean boolean7 = unsupportedDurationField1.isSupported();
        java.lang.String str8 = unsupportedDurationField1.getName();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hours" + "'", str8, "hours");
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        long long4 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.getValueAsLong(330319566545590L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType5);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(0.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210866760000000L) + "'", long1 == (-210866760000000L));
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.joda.time.DurationField durationField0 = null;
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField2 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType1);
        boolean boolean3 = unsupportedDurationField2.isSupported();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField2.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.ScaledDurationField scaledDurationField6 = new org.joda.time.field.ScaledDurationField(durationField0, durationFieldType4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(unsupportedDurationField2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(durationFieldType4);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        boolean boolean5 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.getMillis((-28799996));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial7 = new org.joda.time.Partial(dateTimeFieldType0, (int) '#', chronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hourOfDay" + "'", str1, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField2 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType1);
        boolean boolean3 = unsupportedDurationField2.isSupported();
        org.joda.time.DurationField durationField4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.PreciseDateTimeField preciseDateTimeField5 = new org.joda.time.field.PreciseDateTimeField(dateTimeFieldType0, (org.joda.time.DurationField) unsupportedDurationField2, durationField4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The unit milliseconds must be at least 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(unsupportedDurationField2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
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
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone2.isLocalDateTimeGap(localDateTime12);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        boolean boolean6 = unsupportedDurationField1.equals((java.lang.Object) 216126000000L);
        java.lang.String str7 = unsupportedDurationField1.toString();
        org.joda.time.DurationFieldType durationFieldType8 = unsupportedDurationField1.getType();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UnsupportedDurationField[hours]" + "'", str7, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType8);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField12 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11);
        int int14 = dividedDateTimeField11.get(165025048501570L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 719 + "'", int14 == 719);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField2 = iSOChronology1.minutes();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType0.getField((org.joda.time.Chronology) iSOChronology1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial7 = new org.joda.time.Partial(dateTimeFieldType0, 955);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 955 for dayOfMonth must not be larger than 31");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        boolean boolean4 = unsupportedDurationField1.isSupported();
        long long5 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.getMillis(190);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone9.getShortName(83462400024L, locale14);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        long long7 = iSOChronology0.getDateTimeMillis(1, 1, (int) (byte) 1, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.clockhourOfDay();
        java.lang.String str9 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology0.year();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-62135596799900L) + "'", long7 == (-62135596799900L));
        org.junit.Assert.assertNotNull(dateTimeField8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ISOChronology[UTC]" + "'", str9, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        boolean boolean4 = unsupportedDurationField1.isPrecise();
        java.lang.String str5 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDurationField1.add(2678400000L, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        java.lang.String str5 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDurationField1.getValueAsLong(1669753266908L, 1701260524275L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        long long3 = unsupportedDurationField1.getUnitMillis();
        boolean boolean4 = unsupportedDurationField1.isPrecise();
        boolean boolean5 = unsupportedDurationField1.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unsupportedDurationField1.getDifference(1225154614179L, 1262304000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone5 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology6.getZone();
        boolean boolean8 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) gregorianChronology6);
        java.lang.String str9 = gregorianChronology6.toString();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology6.year();
        int int11 = gregorianChronology6.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GregorianChronology[100]" + "'", str9, "GregorianChronology[100]");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone5 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology6.getZone();
        boolean boolean8 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) gregorianChronology6);
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology6.hourOfHalfday();
        java.lang.String str10 = gregorianChronology6.toString();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology6.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GregorianChronology[100]" + "'", str10, "GregorianChronology[100]");
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField6 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.dayOfWeek();
        org.joda.time.DurationField durationField9 = zonedChronology4.weeks();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.minuteOfDay();
        org.joda.time.DurationField durationField11 = zonedChronology4.days();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, "2023-11-29T12:19:27.125-08:00/2023-11-29T12:19:27.125-08:00");
        java.lang.Number number3 = illegalFieldValueException2.getUpperBound();
        java.lang.String str4 = illegalFieldValueException2.getIllegalValueAsString();
        org.joda.time.DurationFieldType durationFieldType5 = illegalFieldValueException2.getDurationFieldType();
        org.joda.time.DurationFieldType durationFieldType6 = illegalFieldValueException2.getDurationFieldType();
        java.lang.Number number7 = illegalFieldValueException2.getUpperBound();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2023-11-29T12:19:27.125-08:00/2023-11-29T12:19:27.125-08:00" + "'", str4, "2023-11-29T12:19:27.125-08:00/2023-11-29T12:19:27.125-08:00");
        org.junit.Assert.assertNull(durationFieldType5);
        org.junit.Assert.assertNull(durationFieldType6);
        org.junit.Assert.assertNull(number7);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(1L, locale6);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone2);
        java.lang.String str9 = dateTimeZone2.toString();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        long long13 = dateTimeZone10.adjustOffset((-210866846400000L), false);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-210866846400000L) + "'", long13 == (-210866846400000L));
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.minuteOfHour();
        org.joda.time.DurationField durationField8 = gregorianChronology5.years();
        org.joda.time.DurationField durationField9 = gregorianChronology5.minutes();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = gregorianChronology5.getDateTimeMillis(1969, 28, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone5 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology6.getZone();
        boolean boolean8 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) gregorianChronology6);
        java.lang.String str9 = gregorianChronology6.toString();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology6.dayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GregorianChronology[100]" + "'", str9, "GregorianChronology[100]");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.getName();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType4 = unsupportedDurationField1.getType();
        java.lang.String str5 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDurationField1.add((-814926700800000L), (-476134715131L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hours" + "'", str2, "hours");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        java.lang.Number number3 = null;
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException("29", (java.lang.Number) 2835106303L, (java.lang.Number) (-210866846400000L), number3);
        java.lang.Number number5 = illegalFieldValueException4.getUpperBound();
        org.junit.Assert.assertNull(number5);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("UTC", 28, 28354819, 100, 'a', 73, 7, 296907, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("DurationField[weeks]", 1);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeZoneBuilder11.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder11.toDateTimeZone("1954-11-29T20:20:27.737-08:00/1954-11-29T20:20:27.737-08:00", true);
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(iSOChronology21);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(1L, locale6);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = cachedDateTimeZone8.isLocalDateTimeGap(localDateTime9);
        int int12 = cachedDateTimeZone8.getOffset(255193371L);
        org.joda.time.DateTimeZone dateTimeZone13 = cachedDateTimeZone8.getUncachedZone();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField12 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11);
        int int13 = dividedDateTimeField11.getMinimumValue();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        boolean boolean3 = unsupportedDurationField1.isPrecise();
        java.lang.String str4 = unsupportedDurationField1.getName();
        java.lang.String str5 = unsupportedDurationField1.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDurationField1.getValueAsLong(0L, 2580164L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hours" + "'", str5, "hours");
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology5.dayOfYear();
        org.joda.time.DurationField durationField12 = gregorianChronology5.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = gregorianChronology5.getDateTimeMillis(30610243440000L, 59, 471, 296907, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = partial0.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone10.getShortName((-504921600000L), locale12);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = durationField6.add(315590460035L, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        java.lang.Number number3 = null;
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException("DateTimeField[secondOfMinute]", (java.lang.Number) 15619000L, (java.lang.Number) 86399, number3);
        java.lang.Number number5 = illegalFieldValueException4.getUpperBound();
        org.junit.Assert.assertNull(number5);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone5 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology6.getZone();
        boolean boolean8 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) gregorianChronology6);
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology6.hourOfHalfday();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = dateTimeField9.getType();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hourOfHalfday" + "'", str11, "hourOfHalfday");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        java.io.DataInput dataInput0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.tz.DateTimeZoneBuilder.readFrom(dataInput0, "2023-11-29T12:19:27.691-08:00/2023-11-29T12:19:27.691-08:00");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        java.io.DataInput dataInput0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.tz.DateTimeZoneBuilder.readFrom(dataInput0, "1954-11-29T20:21:02.747-08:00/1954-11-29T20:21:02.747-08:00");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "", 0, 4);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str7 = fixedDateTimeZone4.getName(97L);
        int int9 = fixedDateTimeZone4.getStandardOffset(1701289170625L);
        java.util.Locale locale11 = null;
        java.lang.String str12 = fixedDateTimeZone4.getName(1701260527000L, locale11);
        int int14 = fixedDateTimeZone4.getOffset(22689676800000L);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-28799992));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: -28799992");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        java.lang.String str6 = unsupportedDurationField1.getName();
        boolean boolean7 = unsupportedDurationField1.isSupported();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[hours]" + "'", str4, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hours" + "'", str6, "hours");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("2023-11-29T12:19:27.125-08:00/2023-11-29T12:19:27.125-08:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '2023-11-29T12:19:27.125-08:00/2023-11-29T12:19:27.125-08:00' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        boolean boolean5 = unsupportedDurationField1.isPrecise();
        java.lang.String str6 = unsupportedDurationField1.getName();
        java.lang.String str7 = unsupportedDurationField1.getName();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[hours]" + "'", str3, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hours" + "'", str4, "hours");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hours" + "'", str6, "hours");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hours" + "'", str7, "hours");
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = durationField6.getValueAsLong(4L, (long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add(2835106203L, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = unsupportedDateTimeField6.set(1701289185345L, "DateTimeField[yearOfCentury]");
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2835106303L + "'", long9 == 2835106303L);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology5.millisOfDay();
        org.joda.time.DurationField durationField12 = gregorianChronology5.weeks();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology5.secondOfDay();
        org.joda.time.Partial partial15 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology5);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = unsupportedDateTimeField6.getType();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getRangeDurationType();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(durationFieldType12);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology5.dayOfYear();
        org.joda.time.DurationField durationField12 = gregorianChronology5.eras();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology5.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology5.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology5.yearOfEra();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.Chronology chronology5 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField10 = iSOChronology0.seconds();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        java.lang.String str11 = partial0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType13 = partial0.getFieldType((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.lang.Throwable throwable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.joda.time.IllegalInstantException.isIllegalInstant(throwable0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(155017236551L);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(296907L);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(17460000000L);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((-31556880000000L));
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(112968615600000L);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((-28800001L));
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((-17481235597L));
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(2678400000L);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.ZoneInfoProvider zoneInfoProvider1 = new org.joda.time.tz.ZoneInfoProvider("months");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: \"months/ZoneInfoMap\" ClassLoader: sun.misc.Launcher$AppClassLoader@18b4aac2");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(1L, locale6);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone2);
        java.lang.String str9 = dateTimeZone2.toString();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone11 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone2);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(cachedDateTimeZone11);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        boolean boolean4 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.getDifferenceAsLong(1701260530724L, (-653912610306L));
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
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.minuteOfHour();
        boolean boolean9 = gregorianChronology5.equals((java.lang.Object) (-2173831554426L));
        org.joda.time.DurationField durationField10 = gregorianChronology5.halfdays();
        org.joda.time.DateTimeZone dateTimeZone11 = gregorianChronology5.getZone();
        long long15 = gregorianChronology5.add((-315619200000L), 946684800000L, 0);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-315619200000L) + "'", long15 == (-315619200000L));
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        long long14 = dateTimeZone10.convertLocalToUTC(1704096000000L, true, (-80816445234579L));
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1704096000000L + "'", long14 == 1704096000000L);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("1971-01-01T00:00:00.000Z/1971-01-01T00:00:00.000Z");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(53460006, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 53460006");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1492), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: -1492");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long10 = gregorianChronology5.add(0L, (long) (byte) 1, (int) (byte) 0);
        org.joda.time.DurationField durationField11 = gregorianChronology5.halfdays();
        org.joda.time.Partial partial12 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.DateTime dateTime14 = partial12.toDateTime(readableInstant13);
        int int15 = partial12.size();
        org.joda.time.Chronology chronology16 = partial12.getChronology();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        java.io.DataInput dataInput0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.tz.DateTimeZoneBuilder.readFrom(dataInput0, "208");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeUtils.setDefaultTimeZoneNames(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20101193);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 20101193");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology5.getZone();
        long long11 = gregorianChronology5.getDateTimeMillis((int) '4', 8, 24, 24);
        org.joda.time.DurationField durationField12 = gregorianChronology5.days();
        org.joda.time.DateTimeZone dateTimeZone13 = gregorianChronology5.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone13.getShortName(0L, locale16);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-60505833599976L) + "'", long11 == (-60505833599976L));
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        long long3 = unsupportedDurationField1.getUnitMillis();
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.joda.time.DurationFieldType durationFieldType5 = unsupportedDurationField1.getType();
        java.lang.String str6 = unsupportedDurationField1.getName();
        long long7 = unsupportedDurationField1.getUnitMillis();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[hours]" + "'", str2, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[hours]" + "'", str4, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hours" + "'", str6, "hours");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-292275054), 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: -292275054");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        java.lang.String str3 = unsupportedDurationField1.toString();
        boolean boolean4 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = unsupportedDurationField1.getMillis(1701289161914L, (-903620L));
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
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("2008-10-28T00:42:23.414+00:00:00.007/2008-10-28T00:42:23.414+00:00:00.007");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '2008-10-28T00:42:23.414+00:00:00.007/2008-10-28T00:42:23.414+00:00:00.007' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("197");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '197' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        java.io.DataInput dataInput0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.tz.DateTimeZoneBuilder.readFrom(dataInput0, "DateTimeField[year]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("60035");
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException("2008-10-28T00:42:18.863+00:00:00.007/2008-10-28T00:42:18.863+00:00:00.007", "195");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        long long13 = dateTimeZone9.nextTransition((-2793600000L));
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-2793600000L) + "'", long13 == (-2793600000L));
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("5603-09-29T23:26:14.627+00:00:00.007/5603-09-29T23:26:14.627+00:00:00.007");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '5603-09-29T23:26:14.627+00:00:00.007/5603-09-29T23:26:14.627+00:00:00.007' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("DateTimeField[hourOfDay]");
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "", 0, 4);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str7 = fixedDateTimeZone4.getName(97L);
        int int9 = fixedDateTimeZone4.getOffsetFromLocal((-210858120000000L));
        long long11 = fixedDateTimeZone4.nextTransition(0L);
        long long13 = fixedDateTimeZone4.convertUTCToLocal(0L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int16 = fixedDateTimeZone4.getOffsetFromLocal(189684677907L);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }
}
