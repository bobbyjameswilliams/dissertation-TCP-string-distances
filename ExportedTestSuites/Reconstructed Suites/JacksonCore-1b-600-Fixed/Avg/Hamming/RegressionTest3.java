package com.fasterxml.jackson.core.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = readerBasedJsonParser14.nextToken();
        boolean boolean16 = readerBasedJsonParser14.isClosed();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder17 = readerBasedJsonParser14._getByteArrayBuilder();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext18 = readerBasedJsonParser14.getParsingContext();
        boolean boolean19 = readerBasedJsonParser14.getValueAsBoolean();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-196260602) + "'", int13 == (-196260602));
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArrayBuilder17);
        org.junit.Assert.assertNotNull(jsonStreamContext18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        readerBasedJsonParser14.close();
        java.lang.String str17 = readerBasedJsonParser14.nextTextValue();
        com.fasterxml.jackson.core.JsonLocation jsonLocation18 = readerBasedJsonParser14.getCurrentLocation();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = readerBasedJsonParser14.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2032397844) + "'", int13 == (-2032397844));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(jsonLocation18);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        int int88 = uTF8StreamJsonParser84.getTokenColumnNr();
        int int89 = uTF8StreamJsonParser84.getValueAsInt();
        java.lang.Object obj90 = uTF8StreamJsonParser84.getEmbeddedObject();
        com.fasterxml.jackson.core.FormatSchema formatSchema91 = uTF8StreamJsonParser84.getSchema();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNull(formatSchema91);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        int int85 = uTF8StreamJsonParser84.getTextOffset();
        com.fasterxml.jackson.core.JsonLocation jsonLocation86 = uTF8StreamJsonParser84.getCurrentLocation();
        double double88 = uTF8StreamJsonParser84.getValueAsDouble((double) 63);
        com.fasterxml.jackson.core.JsonParser jsonParser89 = uTF8StreamJsonParser84.skipChildren();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(jsonLocation86);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 63.0d + "'", double88 == 63.0d);
        org.junit.Assert.assertNotNull(jsonParser89);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        java.lang.Object obj88 = uTF8StreamJsonParser84.getEmbeddedObject();
        int int89 = uTF8StreamJsonParser84.getTokenColumnNr();
        int int91 = uTF8StreamJsonParser84.getValueAsInt((int) (byte) -1);
        char[] charArray92 = uTF8StreamJsonParser84.getTextCharacters();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertNull(charArray92);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec88 = uTF8StreamJsonParser84.getCodec();
        char[] charArray89 = uTF8StreamJsonParser84.getTextCharacters();
        int int90 = uTF8StreamJsonParser84.getTokenColumnNr();
        int int91 = uTF8StreamJsonParser84.getFeatureMask();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(objectCodec88);
        org.junit.Assert.assertNull(charArray89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        int int85 = uTF8StreamJsonParser84.getTextOffset();
        com.fasterxml.jackson.core.JsonLocation jsonLocation86 = uTF8StreamJsonParser84.getCurrentLocation();
        com.fasterxml.jackson.core.ObjectCodec objectCodec87 = uTF8StreamJsonParser84.getCodec();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext88 = uTF8StreamJsonParser84.getParsingContext();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(jsonLocation86);
        org.junit.Assert.assertNull(objectCodec87);
        org.junit.Assert.assertNotNull(jsonStreamContext88);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        java.lang.String str17 = readerBasedJsonParser14.getText();
        int int18 = readerBasedJsonParser14.getTextOffset();
        java.lang.String str19 = readerBasedJsonParser14.getCurrentName();
        int int20 = readerBasedJsonParser14.getFeatureMask();
        com.fasterxml.jackson.core.JsonToken jsonToken21 = readerBasedJsonParser14.getLastClearedToken();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-217473122) + "'", int13 == (-217473122));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1954973613) + "'", int20 == (-1954973613));
        org.junit.Assert.assertNull(jsonToken21);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        com.fasterxml.jackson.core.JsonLocation jsonLocation17 = readerBasedJsonParser14.getTokenLocation();
        java.lang.String str18 = readerBasedJsonParser14.getCurrentName();
        boolean boolean19 = readerBasedJsonParser14.getValueAsBoolean();
        com.fasterxml.jackson.core.JsonToken jsonToken20 = readerBasedJsonParser14.getCurrentToken();
        java.lang.String str21 = readerBasedJsonParser14.getCurrentName();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1293014012 + "'", int13 == 1293014012);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(jsonLocation17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jsonToken20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation88 = uTF8StreamJsonParser84.getTokenLocation();
        char[] charArray89 = uTF8StreamJsonParser84.getTextCharacters();
        java.lang.Object obj90 = uTF8StreamJsonParser84.getInputSource();
        int int92 = uTF8StreamJsonParser84.getValueAsInt((int) (short) 1);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNotNull(jsonLocation88);
        org.junit.Assert.assertNull(charArray89);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        int int85 = uTF8StreamJsonParser84.getTextOffset();
        com.fasterxml.jackson.core.JsonLocation jsonLocation86 = uTF8StreamJsonParser84.getCurrentLocation();
        double double88 = uTF8StreamJsonParser84.getValueAsDouble((double) 63);
        int int89 = uTF8StreamJsonParser84.getTokenLineNr();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(jsonLocation86);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 63.0d + "'", double88 == 63.0d);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder15 = readerBasedJsonParser14._getByteArrayBuilder();
        com.fasterxml.jackson.core.FormatSchema formatSchema16 = readerBasedJsonParser14.getSchema();
        com.fasterxml.jackson.core.JsonLocation jsonLocation17 = readerBasedJsonParser14.getTokenLocation();
        long long19 = readerBasedJsonParser14.getValueAsLong(0L);
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = readerBasedJsonParser14.getCodec();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1252187322) + "'", int13 == (-1252187322));
        org.junit.Assert.assertNotNull(byteArrayBuilder15);
        org.junit.Assert.assertNull(formatSchema16);
        org.junit.Assert.assertNotNull(jsonLocation17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(objectCodec20);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray87 = uTF8StreamJsonParser84.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: com.fasterxml.jackson.core.JsonParseException: ; line: 1, column: 0]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        com.fasterxml.jackson.core.JsonLocation jsonLocation17 = readerBasedJsonParser14.getTokenLocation();
        java.lang.String str18 = readerBasedJsonParser14.getCurrentName();
        java.lang.Object obj19 = readerBasedJsonParser14.getTypeId();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext20 = readerBasedJsonParser14.getParsingContext();
        boolean boolean21 = readerBasedJsonParser14.hasTextCharacters();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1306493696 + "'", int13 == 1306493696);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(jsonLocation17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(jsonStreamContext20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        int int16 = readerBasedJsonParser14.getTextLength();
        boolean boolean17 = readerBasedJsonParser14.hasCurrentToken();
        int int18 = readerBasedJsonParser14.getTextLength();
        com.fasterxml.jackson.core.JsonToken jsonToken19 = readerBasedJsonParser14.getCurrentToken();
        java.lang.String str20 = readerBasedJsonParser14.nextTextValue();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 509169466 + "'", int13 == 509169466);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(jsonToken19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        readerBasedJsonParser14.close();
        java.lang.String str17 = readerBasedJsonParser14.nextTextValue();
        int int18 = readerBasedJsonParser14.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = readerBasedJsonParser14.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1342643682 + "'", int13 == 1342643682);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation88 = uTF8StreamJsonParser84.getTokenLocation();
        uTF8StreamJsonParser84.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            uTF8StreamJsonParser84.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNotNull(jsonLocation88);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = readerBasedJsonParser14.nextToken();
        boolean boolean16 = readerBasedJsonParser14.isClosed();
        int int18 = readerBasedJsonParser14.nextIntValue(0);
        com.fasterxml.jackson.core.JsonToken jsonToken19 = readerBasedJsonParser14.getCurrentToken();
        long long21 = readerBasedJsonParser14.nextLongValue((long) (-2141583118));
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-871896012) + "'", int13 == (-871896012));
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(jsonToken19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-2141583118L) + "'", long21 == (-2141583118L));
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        java.lang.Object obj15 = readerBasedJsonParser14.getEmbeddedObject();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        int int17 = readerBasedJsonParser14.getTokenLineNr();
        int int19 = readerBasedJsonParser14.getValueAsInt(954746372);
        long long20 = readerBasedJsonParser14.getTokenCharacterOffset();
        char[] charArray21 = readerBasedJsonParser14.getTextCharacters();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1896236346) + "'", int13 == (-1896236346));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 954746372 + "'", int19 == 954746372);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(charArray21);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        int int85 = uTF8StreamJsonParser84.getTextLength();
        boolean boolean86 = uTF8StreamJsonParser84.canReadTypeId();
        int int87 = uTF8StreamJsonParser84.getTextOffset();
        com.fasterxml.jackson.core.JsonParser jsonParser89 = uTF8StreamJsonParser84.setFeatureMask((int) '#');
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(jsonParser89);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        java.lang.Object obj15 = readerBasedJsonParser14.getEmbeddedObject();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        int int17 = readerBasedJsonParser14.getTokenLineNr();
        int int19 = readerBasedJsonParser14.getValueAsInt(954746372);
        readerBasedJsonParser14.overrideCurrentName("[Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
        com.fasterxml.jackson.core.JsonToken jsonToken22 = readerBasedJsonParser14.getLastClearedToken();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1995799926) + "'", int13 == (-1995799926));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 954746372 + "'", int19 == 954746372);
        org.junit.Assert.assertNull(jsonToken22);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec88 = uTF8StreamJsonParser84.getCodec();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken89 = uTF8StreamJsonParser84.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(objectCodec88);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation88 = uTF8StreamJsonParser84.getTokenLocation();
        char[] charArray89 = uTF8StreamJsonParser84.getTextCharacters();
        java.lang.String str90 = uTF8StreamJsonParser84.getText();
        boolean boolean91 = uTF8StreamJsonParser84.isClosed();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNotNull(jsonLocation88);
        org.junit.Assert.assertNull(charArray89);
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        int int16 = readerBasedJsonParser14.getTextLength();
        boolean boolean17 = readerBasedJsonParser14.hasCurrentToken();
        readerBasedJsonParser14.clearCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext19 = readerBasedJsonParser14.getParsingContext();
        java.lang.String str20 = jsonStreamContext19.getTypeDesc();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 658890922 + "'", int13 == 658890922);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ROOT" + "'", str20, "ROOT");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder15 = readerBasedJsonParser14._getByteArrayBuilder();
        long long16 = readerBasedJsonParser14.getTokenCharacterOffset();
        boolean boolean18 = readerBasedJsonParser14.getValueAsBoolean(false);
        int int19 = readerBasedJsonParser14.getTokenColumnNr();
        int int21 = readerBasedJsonParser14.nextIntValue(48300286);
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-889554782) + "'", int13 == (-889554782));
        org.junit.Assert.assertNotNull(byteArrayBuilder15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 48300286 + "'", int21 == 48300286);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        char[] charArray88 = uTF8StreamJsonParser84.getTextCharacters();
        boolean boolean89 = uTF8StreamJsonParser84.canReadObjectId();
        com.fasterxml.jackson.core.Version version90 = uTF8StreamJsonParser84.version();
        java.lang.Object obj91 = uTF8StreamJsonParser84.getInputSource();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(charArray88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(version90);
        org.junit.Assert.assertNull(obj91);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        int int16 = readerBasedJsonParser14.getTextLength();
        boolean boolean17 = readerBasedJsonParser14.hasCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        readerBasedJsonParser14.setCodec(objectCodec18);
        boolean boolean20 = readerBasedJsonParser14.hasTextCharacters();
        com.fasterxml.jackson.core.JsonToken jsonToken21 = readerBasedJsonParser14.getLastClearedToken();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1594873988 + "'", int13 == 1594873988);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(jsonToken21);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        com.fasterxml.jackson.core.ObjectCodec objectCodec90 = uTF8StreamJsonParser84.getCodec();
        com.fasterxml.jackson.core.ObjectCodec objectCodec91 = null;
        uTF8StreamJsonParser84.setCodec(objectCodec91);
        boolean boolean94 = uTF8StreamJsonParser84.getValueAsBoolean(true);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(objectCodec90);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.Version version15 = readerBasedJsonParser14.version();
        boolean boolean16 = readerBasedJsonParser14.getValueAsBoolean();
        readerBasedJsonParser14.close();
        // The following exception was thrown during execution in test generation
        try {
            byte byte18 = readerBasedJsonParser14.getByteValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 704421780 + "'", int13 == 704421780);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        int int85 = uTF8StreamJsonParser84.getTextOffset();
        com.fasterxml.jackson.core.JsonParser.Feature feature86 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser87 = uTF8StreamJsonParser84.enable(feature86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        int int16 = readerBasedJsonParser14.getTextLength();
        boolean boolean17 = readerBasedJsonParser14.hasCurrentToken();
        java.lang.String str18 = readerBasedJsonParser14.nextTextValue();
        readerBasedJsonParser14.close();
        readerBasedJsonParser14.clearCurrentToken();
        com.fasterxml.jackson.core.Version version21 = readerBasedJsonParser14.version();
        java.lang.String str22 = readerBasedJsonParser14.getCurrentName();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 118487434 + "'", int13 == 118487434);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(version21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        int int88 = uTF8StreamJsonParser84.getTokenColumnNr();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken89 = uTF8StreamJsonParser84.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        readerBasedJsonParser14.close();
        com.fasterxml.jackson.core.Version version17 = readerBasedJsonParser14.version();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType18 = readerBasedJsonParser14.getNumberType();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1689890824 + "'", int13 == 1689890824);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(version17);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder15 = readerBasedJsonParser14._getByteArrayBuilder();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = readerBasedJsonParser14.nextToken();
        java.lang.String str17 = readerBasedJsonParser14.getCurrentName();
        readerBasedJsonParser14.clearCurrentToken();
        boolean boolean19 = readerBasedJsonParser14.canReadObjectId();
        java.lang.String str20 = readerBasedJsonParser14.getText();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1675144494) + "'", int13 == (-1675144494));
        org.junit.Assert.assertNotNull(byteArrayBuilder15);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        java.lang.String str15 = readerBasedJsonParser14.nextTextValue();
        long long16 = readerBasedJsonParser14.getTokenCharacterOffset();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = readerBasedJsonParser14.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-619969946) + "'", int13 == (-619969946));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = readerBasedJsonParser14.nextToken();
        boolean boolean16 = readerBasedJsonParser14.isClosed();
        int int18 = readerBasedJsonParser14.nextIntValue(0);
        com.fasterxml.jackson.core.JsonToken jsonToken19 = readerBasedJsonParser14.getCurrentToken();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext20 = readerBasedJsonParser14.getParsingContext();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-978807914) + "'", int13 == (-978807914));
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(jsonToken19);
        org.junit.Assert.assertNotNull(jsonReadContext20);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        int int16 = readerBasedJsonParser14.getTextLength();
        boolean boolean17 = readerBasedJsonParser14.hasCurrentToken();
        readerBasedJsonParser14.clearCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken19 = readerBasedJsonParser14.nextToken();
        long long21 = readerBasedJsonParser14.nextLongValue((long) 1894908524);
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 401264570 + "'", int13 == 401264570);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(jsonToken19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1894908524L + "'", long21 == 1894908524L);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        int int85 = uTF8StreamJsonParser84.getTextOffset();
        com.fasterxml.jackson.core.JsonLocation jsonLocation86 = uTF8StreamJsonParser84.getCurrentLocation();
        com.fasterxml.jackson.core.ObjectCodec objectCodec87 = uTF8StreamJsonParser84.getCodec();
        java.lang.String str89 = uTF8StreamJsonParser84.getValueAsString("");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(jsonLocation86);
        org.junit.Assert.assertNull(objectCodec87);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        int int17 = readerBasedJsonParser14.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = readerBasedJsonParser14.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-161247302) + "'", int13 == (-161247302));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        boolean boolean16 = readerBasedJsonParser14.hasTextCharacters();
        boolean boolean17 = readerBasedJsonParser14.canReadTypeId();
        boolean boolean18 = readerBasedJsonParser14.hasTextCharacters();
        int int19 = readerBasedJsonParser14.getTextLength();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1734011344) + "'", int13 == (-1734011344));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        boolean boolean87 = uTF8StreamJsonParser84.isClosed();
        com.fasterxml.jackson.core.JsonParser jsonParser89 = uTF8StreamJsonParser84.setFeatureMask(24);
        java.lang.String str90 = uTF8StreamJsonParser84.getCurrentName();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(jsonParser89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "[Source: hi!; line: 52, column: 1]" + "'", str90, "[Source: hi!; line: 52, column: 1]");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        int int88 = uTF8StreamJsonParser84.getTokenColumnNr();
        java.lang.String str89 = uTF8StreamJsonParser84.getCurrentName();
        com.fasterxml.jackson.core.JsonToken jsonToken90 = uTF8StreamJsonParser84.getLastClearedToken();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "[Source: hi!; line: 52, column: 1]" + "'", str89, "[Source: hi!; line: 52, column: 1]");
        org.junit.Assert.assertNull(jsonToken90);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder15 = readerBasedJsonParser14._getByteArrayBuilder();
        long long16 = readerBasedJsonParser14.getTokenCharacterOffset();
        boolean boolean18 = readerBasedJsonParser14.getValueAsBoolean(false);
        com.fasterxml.jackson.core.JsonLocation jsonLocation19 = readerBasedJsonParser14.getTokenLocation();
        long long20 = readerBasedJsonParser14.getValueAsLong();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 78208930 + "'", int13 == 78208930);
        org.junit.Assert.assertNotNull(byteArrayBuilder15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonLocation19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        // The following exception was thrown during execution in test generation
        try {
            float float87 = uTF8StreamJsonParser84.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: com.fasterxml.jackson.core.JsonParseException: ; line: 1, column: 0]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        java.lang.Object obj15 = readerBasedJsonParser14.getEmbeddedObject();
        readerBasedJsonParser14.close();
        java.lang.Object obj17 = readerBasedJsonParser14.getEmbeddedObject();
        boolean boolean18 = readerBasedJsonParser14.hasCurrentToken();
        readerBasedJsonParser14.overrideCurrentName("false");
        com.fasterxml.jackson.core.JsonLocation jsonLocation21 = readerBasedJsonParser14.getCurrentLocation();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1281741158) + "'", int13 == (-1281741158));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonLocation21);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        java.lang.String str15 = readerBasedJsonParser14.nextTextValue();
        int int16 = readerBasedJsonParser14.getTextLength();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = readerBasedJsonParser14.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1430984094 + "'", int13 == 1430984094);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder15 = readerBasedJsonParser14._getByteArrayBuilder();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = readerBasedJsonParser14.nextToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        readerBasedJsonParser14.setCodec(objectCodec17);
        int int20 = readerBasedJsonParser14.nextIntValue((-1958881319));
        com.fasterxml.jackson.core.JsonToken jsonToken21 = readerBasedJsonParser14.getLastClearedToken();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1203984846 + "'", int13 == 1203984846);
        org.junit.Assert.assertNotNull(byteArrayBuilder15);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1958881319) + "'", int20 == (-1958881319));
        org.junit.Assert.assertNull(jsonToken21);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken88 = uTF8StreamJsonParser84.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str89 = uTF8StreamJsonParser84.nextTextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(jsonToken88);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        java.lang.Object obj15 = readerBasedJsonParser14.getEmbeddedObject();
        int int16 = readerBasedJsonParser14.getTextLength();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = readerBasedJsonParser14.getIntValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-89652940) + "'", int13 == (-89652940));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation7 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) "hi!", 0L, (long) (-1), (int) '4', (int) (byte) 1);
        com.fasterxml.jackson.core.JsonParseException jsonParseException8 = new com.fasterxml.jackson.core.JsonParseException("com.fasterxml.jackson.core.JsonParseException: ", jsonLocation7);
        com.fasterxml.jackson.core.io.IOContext iOContext10 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) "com.fasterxml.jackson.core.JsonParseException: ", true);
        java.io.Reader reader12 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext10, (int) '4', reader12, objectCodec13, charsToNameCanonicalizer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder15 = readerBasedJsonParser14._getByteArrayBuilder();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = readerBasedJsonParser14.nextToken();
        com.fasterxml.jackson.core.JsonToken jsonToken17 = readerBasedJsonParser14.nextValue();
        readerBasedJsonParser14.overrideCurrentName("");
        double double21 = readerBasedJsonParser14.getValueAsDouble((double) (-1954899026));
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1945642050) + "'", int13 == (-1945642050));
        org.junit.Assert.assertNotNull(byteArrayBuilder15);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.954899026E9d) + "'", double21 == (-1.954899026E9d));
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        int int85 = uTF8StreamJsonParser84.getTextOffset();
        com.fasterxml.jackson.core.ObjectCodec objectCodec86 = uTF8StreamJsonParser84.getCodec();
        uTF8StreamJsonParser84.overrideCurrentName("com.fasterxml.jackson.core.JsonParseException: \n at [Source: hi!; line: 52, column: 1]");
        com.fasterxml.jackson.core.ObjectCodec objectCodec89 = uTF8StreamJsonParser84.getCodec();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNull(objectCodec86);
        org.junit.Assert.assertNull(objectCodec89);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        java.lang.Object obj15 = readerBasedJsonParser14.getEmbeddedObject();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = readerBasedJsonParser14.getIntValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2084350572 + "'", int13 == 2084350572);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        com.fasterxml.jackson.core.JsonParser jsonParser90 = uTF8StreamJsonParser84.skipChildren();
        com.fasterxml.jackson.core.Version version91 = uTF8StreamJsonParser84.version();
        char[] charArray92 = uTF8StreamJsonParser84.getTextCharacters();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNotNull(jsonParser90);
        org.junit.Assert.assertNotNull(version91);
        org.junit.Assert.assertNull(charArray92);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        java.lang.String str15 = readerBasedJsonParser14.nextTextValue();
        com.fasterxml.jackson.core.JsonLocation jsonLocation16 = readerBasedJsonParser14.getTokenLocation();
        int int17 = readerBasedJsonParser14.getTextOffset();
        long long19 = readerBasedJsonParser14.nextLongValue((long) 426013984);
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1441598782 + "'", int13 == 1441598782);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(jsonLocation16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 426013984L + "'", long19 == 426013984L);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        java.lang.String str15 = readerBasedJsonParser14.nextTextValue();
        int int16 = readerBasedJsonParser14.getTextLength();
        java.lang.Object obj17 = readerBasedJsonParser14.getObjectId();
        int int18 = readerBasedJsonParser14.getTextLength();
        long long20 = readerBasedJsonParser14.nextLongValue((long) 836852124);
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-814165848) + "'", int13 == (-814165848));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 836852124L + "'", long20 == 836852124L);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder15 = readerBasedJsonParser14._getByteArrayBuilder();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = readerBasedJsonParser14.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1366079888) + "'", int13 == (-1366079888));
        org.junit.Assert.assertNotNull(byteArrayBuilder15);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder15 = readerBasedJsonParser14._getByteArrayBuilder();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = readerBasedJsonParser14.nextToken();
        long long18 = readerBasedJsonParser14.getValueAsLong((long) (-2067060342));
        com.fasterxml.jackson.core.Version version19 = readerBasedJsonParser14.version();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1239316118) + "'", int13 == (-1239316118));
        org.junit.Assert.assertNotNull(byteArrayBuilder15);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-2067060342L) + "'", long18 == (-2067060342L));
        org.junit.Assert.assertNotNull(version19);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        boolean boolean15 = readerBasedJsonParser14.isClosed();
        com.fasterxml.jackson.core.JsonLocation jsonLocation16 = readerBasedJsonParser14.getTokenLocation();
        com.fasterxml.jackson.core.FormatSchema formatSchema17 = readerBasedJsonParser14.getSchema();
        boolean boolean18 = readerBasedJsonParser14.hasTextCharacters();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-34787772) + "'", int13 == (-34787772));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonLocation16);
        org.junit.Assert.assertNull(formatSchema17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        boolean boolean15 = readerBasedJsonParser14.isClosed();
        com.fasterxml.jackson.core.JsonLocation jsonLocation16 = readerBasedJsonParser14.getTokenLocation();
        com.fasterxml.jackson.core.FormatSchema formatSchema17 = readerBasedJsonParser14.getSchema();
        java.lang.String str18 = readerBasedJsonParser14.getValueAsString();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 747920088 + "'", int13 == 747920088);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonLocation16);
        org.junit.Assert.assertNull(formatSchema17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        boolean boolean16 = readerBasedJsonParser14.hasTextCharacters();
        long long18 = readerBasedJsonParser14.nextLongValue((long) 2000);
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        readerBasedJsonParser14.setCodec(objectCodec19);
        com.fasterxml.jackson.core.JsonToken jsonToken21 = readerBasedJsonParser14.nextToken();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 965682156 + "'", int13 == 965682156);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2000L + "'", long18 == 2000L);
        org.junit.Assert.assertNull(jsonToken21);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        com.fasterxml.jackson.core.JsonToken jsonToken87 = uTF8StreamJsonParser84.getCurrentToken();
        int int88 = uTF8StreamJsonParser84.getTokenColumnNr();
        java.lang.String str89 = uTF8StreamJsonParser84.getCurrentName();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(jsonToken87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "[Source: hi!; line: 52, column: 1]" + "'", str89, "[Source: hi!; line: 52, column: 1]");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec88 = uTF8StreamJsonParser84.getCodec();
        // The following exception was thrown during execution in test generation
        try {
            long long90 = uTF8StreamJsonParser84.nextLongValue(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(objectCodec88);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec88 = uTF8StreamJsonParser84.getCodec();
        // The following exception was thrown during execution in test generation
        try {
            long long90 = uTF8StreamJsonParser84.nextLongValue(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(objectCodec88);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        char[] charArray88 = uTF8StreamJsonParser84.getTextCharacters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean89 = uTF8StreamJsonParser84.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(charArray88);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString28 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray33 = new char[] { 'a', ' ', '#', '4' };
        int int35 = serializedString28.appendUnquoted(charArray33, 0);
        java.lang.String str36 = serializedString28.getValue();
        char[] charArray37 = serializedString28.asQuotedChars();
        // The following exception was thrown during execution in test generation
        try {
            iOContext12.releaseConcatBuffer(charArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str36, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[c, o, m, ., f, a, s, t, e, r, x, m, l, ., j, a, c, k, s, o, n, ., c, o, r, e, ., J, s, o, n, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  ]");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        readerBasedJsonParser14.close();
        readerBasedJsonParser14.close();
        long long19 = readerBasedJsonParser14.nextLongValue(0L);
        readerBasedJsonParser14.overrideCurrentName("com.fasterxml.jackson.core.JsonParseException: \n\n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
        int int22 = readerBasedJsonParser14.getTokenColumnNr();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1666933138 + "'", int13 == 1666933138);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding15 = iOContext12.getEncoding();
        boolean boolean16 = iOContext12.isResourceManaged();
        com.fasterxml.jackson.core.io.SerializedString serializedString18 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray19 = serializedString18.asQuotedChars();
        byte[] byteArray20 = serializedString18.asQuotedUTF8();
        // The following exception was thrown during execution in test generation
        try {
            iOContext12.releaseBase64Buffer(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNull(jsonEncoding15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[c, o, m, ., f, a, s, t, e, r, x, m, l, ., j, a, c, k, s, o, n, ., c, o, r, e, ., J, s, o, n, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  ]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation88 = uTF8StreamJsonParser84.getTokenLocation();
        double double90 = uTF8StreamJsonParser84.getValueAsDouble((double) (short) -1);
        boolean boolean91 = uTF8StreamJsonParser84.hasTextCharacters();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNotNull(jsonLocation88);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + (-1.0d) + "'", double90 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        boolean boolean16 = readerBasedJsonParser14.hasTextCharacters();
        long long18 = readerBasedJsonParser14.nextLongValue((long) 2000);
        int int20 = readerBasedJsonParser14.nextIntValue(1805431426);
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1858805982) + "'", int13 == (-1858805982));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2000L + "'", long18 == 2000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1805431426 + "'", int20 == 1805431426);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        java.lang.String str15 = readerBasedJsonParser14.nextTextValue();
        com.fasterxml.jackson.core.Version version16 = readerBasedJsonParser14.version();
        int int18 = readerBasedJsonParser14.getValueAsInt(96184790);
        boolean boolean19 = readerBasedJsonParser14.hasCurrentToken();
        readerBasedJsonParser14.close();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 697905904 + "'", int13 == 697905904);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96184790 + "'", int18 == 96184790);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        readerBasedJsonParser14.close();
        java.lang.String str17 = readerBasedJsonParser14.nextTextValue();
        com.fasterxml.jackson.core.JsonLocation jsonLocation18 = readerBasedJsonParser14.getCurrentLocation();
        java.lang.String str19 = jsonLocation18.toString();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-782769716) + "'", int13 == (-782769716));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(jsonLocation18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[Source: -1; line: 1, column: 1]" + "'", str19, "[Source: -1; line: 1, column: 1]");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        int int85 = uTF8StreamJsonParser84.getTextOffset();
        java.io.OutputStream outputStream86 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int87 = uTF8StreamJsonParser84.releaseBuffered(outputStream86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        int int16 = readerBasedJsonParser14.getTextLength();
        com.fasterxml.jackson.core.JsonToken jsonToken17 = readerBasedJsonParser14.nextToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema18 = null;
        boolean boolean19 = readerBasedJsonParser14.canUseSchema(formatSchema18);
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1318245070 + "'", int13 == 1318245070);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        readerBasedJsonParser14.close();
        java.lang.Object obj17 = readerBasedJsonParser14.getInputSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean18 = readerBasedJsonParser14.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2097382324 + "'", int13 == 2097382324);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        com.fasterxml.jackson.core.JsonLocation jsonLocation17 = readerBasedJsonParser14.getTokenLocation();
        int int19 = readerBasedJsonParser14.getValueAsInt((-1108791488));
        char[] charArray20 = readerBasedJsonParser14.getTextCharacters();
        readerBasedJsonParser14.clearCurrentToken();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-651556332) + "'", int13 == (-651556332));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(jsonLocation17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1108791488) + "'", int19 == (-1108791488));
        org.junit.Assert.assertNull(charArray20);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        int int85 = uTF8StreamJsonParser84.getTextOffset();
        com.fasterxml.jackson.core.JsonLocation jsonLocation86 = uTF8StreamJsonParser84.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParser jsonParser87 = uTF8StreamJsonParser84.skipChildren();
        java.lang.String str88 = uTF8StreamJsonParser84.getValueAsString();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(jsonLocation86);
        org.junit.Assert.assertNotNull(jsonParser87);
        org.junit.Assert.assertNull(str88);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        java.lang.Object obj88 = uTF8StreamJsonParser84.getEmbeddedObject();
        // The following exception was thrown during execution in test generation
        try {
            long long90 = uTF8StreamJsonParser84.nextLongValue((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.Version version15 = readerBasedJsonParser14.version();
        boolean boolean16 = readerBasedJsonParser14.hasTextCharacters();
        boolean boolean17 = readerBasedJsonParser14.hasTextCharacters();
        java.lang.Object obj18 = readerBasedJsonParser14.getEmbeddedObject();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 352467346 + "'", int13 == 352467346);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder15 = readerBasedJsonParser14._getByteArrayBuilder();
        readerBasedJsonParser14.clearCurrentToken();
        char[] charArray17 = readerBasedJsonParser14.getTextCharacters();
        com.fasterxml.jackson.core.FormatSchema formatSchema18 = readerBasedJsonParser14.getSchema();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 721776310 + "'", int13 == 721776310);
        org.junit.Assert.assertNotNull(byteArrayBuilder15);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNull(formatSchema18);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec88 = uTF8StreamJsonParser84.getCodec();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext89 = uTF8StreamJsonParser84.getParsingContext();
        boolean boolean90 = uTF8StreamJsonParser84.hasTextCharacters();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(objectCodec88);
        org.junit.Assert.assertNotNull(jsonStreamContext89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        int int88 = uTF8StreamJsonParser84.getTokenColumnNr();
        boolean boolean89 = uTF8StreamJsonParser84.hasTextCharacters();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext90 = uTF8StreamJsonParser84.getParsingContext();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext90);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        boolean boolean16 = readerBasedJsonParser14.hasTextCharacters();
        long long18 = readerBasedJsonParser14.nextLongValue((long) 2000);
        boolean boolean20 = readerBasedJsonParser14.getValueAsBoolean(false);
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1820368892 + "'", int13 == 1820368892);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2000L + "'", long18 == 2000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder15 = readerBasedJsonParser14._getByteArrayBuilder();
        readerBasedJsonParser14.clearCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken17 = readerBasedJsonParser14.nextValue();
        java.lang.String str18 = readerBasedJsonParser14.getCurrentName();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1057285810) + "'", int13 == (-1057285810));
        org.junit.Assert.assertNotNull(byteArrayBuilder15);
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.Version version15 = readerBasedJsonParser14.version();
        boolean boolean16 = readerBasedJsonParser14.hasTextCharacters();
        boolean boolean17 = readerBasedJsonParser14.hasTextCharacters();
        readerBasedJsonParser14.close();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1570121450) + "'", int13 == (-1570121450));
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        char[] charArray88 = uTF8StreamJsonParser84.getTextCharacters();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext89 = uTF8StreamJsonParser84.getParsingContext();
        java.io.Writer writer90 = null;
        int int91 = uTF8StreamJsonParser84.releaseBuffered(writer90);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(charArray88);
        org.junit.Assert.assertNotNull(jsonReadContext89);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.Version version15 = readerBasedJsonParser14.version();
        boolean boolean16 = readerBasedJsonParser14.getValueAsBoolean();
        readerBasedJsonParser14.close();
        com.fasterxml.jackson.core.Version version18 = readerBasedJsonParser14.version();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1415853250) + "'", int13 == (-1415853250));
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(version18);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        java.lang.Object obj15 = readerBasedJsonParser14.getEmbeddedObject();
        readerBasedJsonParser14.close();
        readerBasedJsonParser14.overrideCurrentName("[0]");
        java.io.Writer writer19 = null;
        int int20 = readerBasedJsonParser14.releaseBuffered(writer19);
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 315949702 + "'", int13 == 315949702);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        java.lang.Object obj88 = uTF8StreamJsonParser84.getEmbeddedObject();
        // The following exception was thrown during execution in test generation
        try {
            int int90 = uTF8StreamJsonParser84.nextIntValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        char[] charArray17 = readerBasedJsonParser14.getTextCharacters();
        boolean boolean18 = readerBasedJsonParser14.canReadObjectId();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2033838770) + "'", int13 == (-2033838770));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken88 = uTF8StreamJsonParser84.getCurrentToken();
        uTF8StreamJsonParser84.clearCurrentToken();
        int int90 = uTF8StreamJsonParser84.getTextOffset();
        uTF8StreamJsonParser84.clearCurrentToken();
        uTF8StreamJsonParser84.overrideCurrentName("[Source: true; line: 0, column: 100]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(jsonToken88);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        // The following exception was thrown during execution in test generation
        try {
            double double85 = uTF8StreamJsonParser84.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: com.fasterxml.jackson.core.JsonParseException: ; line: 1, column: 0]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation88 = uTF8StreamJsonParser84.getTokenLocation();
        // The following exception was thrown during execution in test generation
        try {
            uTF8StreamJsonParser84.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNotNull(jsonLocation88);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec88 = uTF8StreamJsonParser84.getCodec();
        // The following exception was thrown during execution in test generation
        try {
            uTF8StreamJsonParser84.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(objectCodec88);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        readerBasedJsonParser14.clearCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser18 = readerBasedJsonParser14.skipChildren();
        java.lang.String str19 = readerBasedJsonParser14.getText();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1464171954 + "'", int13 == 1464171954);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        java.lang.String str15 = readerBasedJsonParser14.nextTextValue();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder16 = readerBasedJsonParser14._getByteArrayBuilder();
        com.fasterxml.jackson.core.FormatSchema formatSchema17 = readerBasedJsonParser14.getSchema();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1207842836 + "'", int13 == 1207842836);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(byteArrayBuilder16);
        org.junit.Assert.assertNull(formatSchema17);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        readerBasedJsonParser14.close();
        java.lang.String str17 = readerBasedJsonParser14.nextTextValue();
        java.lang.String str18 = readerBasedJsonParser14.getValueAsString();
        int int19 = readerBasedJsonParser14.getTextOffset();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 44763392 + "'", int13 == 44763392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        com.fasterxml.jackson.core.JsonParser jsonParser16 = readerBasedJsonParser14.skipChildren();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext17 = readerBasedJsonParser14.getParsingContext();
        boolean boolean18 = jsonReadContext17.expectComma();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 154861386 + "'", int13 == 154861386);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertNotNull(jsonReadContext17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        // The following exception was thrown during execution in test generation
        try {
            float float85 = uTF8StreamJsonParser84.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: com.fasterxml.jackson.core.JsonParseException: ; line: 1, column: 0]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.Version version15 = readerBasedJsonParser14.version();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        com.fasterxml.jackson.core.Version version17 = readerBasedJsonParser14.version();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 764137932 + "'", int13 == 764137932);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(version17);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        readerBasedJsonParser14.close();
        com.fasterxml.jackson.core.JsonToken jsonToken17 = readerBasedJsonParser14.nextToken();
        int int18 = readerBasedJsonParser14.getTextOffset();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26736964 + "'", int13 == 26736964);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = readerBasedJsonParser14.nextToken();
        boolean boolean16 = readerBasedJsonParser14.isClosed();
        readerBasedJsonParser14.clearCurrentToken();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1402727492 + "'", int13 == 1402727492);
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        int int85 = uTF8StreamJsonParser84.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken86 = uTF8StreamJsonParser84.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        java.lang.Object obj15 = readerBasedJsonParser14.getEmbeddedObject();
        readerBasedJsonParser14.close();
        java.lang.Object obj17 = readerBasedJsonParser14.getEmbeddedObject();
        int int18 = readerBasedJsonParser14.getTextOffset();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1050867064) + "'", int13 == (-1050867064));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        readerBasedJsonParser14.clearCurrentToken();
        boolean boolean18 = readerBasedJsonParser14.hasTextCharacters();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 208125080 + "'", int13 == 208125080);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation88 = uTF8StreamJsonParser84.getTokenLocation();
        long long90 = uTF8StreamJsonParser84.getValueAsLong(0L);
        com.fasterxml.jackson.core.JsonParser jsonParser91 = uTF8StreamJsonParser84.skipChildren();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNotNull(jsonLocation88);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 0L + "'", long90 == 0L);
        org.junit.Assert.assertNotNull(jsonParser91);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        byte[] byteArray57 = null;
        iOContext12.releaseBase64Buffer(byteArray57);
        java.lang.Object obj59 = iOContext12.getSourceReference();
        boolean boolean60 = iOContext12.isResourceManaged();
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding61 = iOContext12.getEncoding();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer62 = iOContext12.constructTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray63 = textBuffer62.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertEquals(obj59.toString(), "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj59), "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj59), "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(jsonEncoding61);
        org.junit.Assert.assertNotNull(textBuffer62);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        byte[] byteArray57 = null;
        iOContext12.releaseBase64Buffer(byteArray57);
        java.lang.Object obj59 = iOContext12.getSourceReference();
        boolean boolean60 = iOContext12.isResourceManaged();
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding61 = iOContext12.getEncoding();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer62 = iOContext12.constructTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray63 = iOContext12.allocReadIOBuffer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertEquals(obj59.toString(), "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj59), "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj59), "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(jsonEncoding61);
        org.junit.Assert.assertNotNull(textBuffer62);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        int int85 = uTF8StreamJsonParser84.getValueAsInt();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean86 = uTF8StreamJsonParser84.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        char[] charArray13 = serializedString2.asQuotedChars();
        char[] charArray14 = serializedString2.asQuotedChars();
        byte[] byteArray15 = serializedString2.asQuotedUTF8();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[c, o, m, ., f, a, s, t, e, r, x, m, l, ., j, a, c, k, s, o, n, ., c, o, r, e, ., J, s, o, n, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  ]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[c, o, m, ., f, a, s, t, e, r, x, m, l, ., j, a, c, k, s, o, n, ., c, o, r, e, ., J, s, o, n, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  ]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1954973613), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        readerBasedJsonParser14.setCodec(objectCodec17);
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1986178232) + "'", int13 == (-1986178232));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        int int88 = uTF8StreamJsonParser84.getTokenColumnNr();
        com.fasterxml.jackson.core.JsonToken jsonToken89 = uTF8StreamJsonParser84.getLastClearedToken();
        int int90 = uTF8StreamJsonParser84.getFeatureMask();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertNull(jsonToken89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        char[] charArray87 = uTF8StreamJsonParser84.getTextCharacters();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext88 = uTF8StreamJsonParser84.getParsingContext();
        long long89 = uTF8StreamJsonParser84.getTokenCharacterOffset();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(charArray87);
        org.junit.Assert.assertNotNull(jsonReadContext88);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 0L + "'", long89 == 0L);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken88 = uTF8StreamJsonParser84.getCurrentToken();
        uTF8StreamJsonParser84.clearCurrentToken();
        uTF8StreamJsonParser84.overrideCurrentName("[Source: #; line: 1, column: 1]");
        com.fasterxml.jackson.core.JsonToken jsonToken92 = uTF8StreamJsonParser84.getCurrentToken();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(jsonToken88);
        org.junit.Assert.assertNull(jsonToken92);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        boolean boolean85 = uTF8StreamJsonParser84.hasTextCharacters();
        boolean boolean86 = uTF8StreamJsonParser84.canReadObjectId();
        boolean boolean87 = uTF8StreamJsonParser84.isClosed();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation88 = uTF8StreamJsonParser84.getTokenLocation();
        int int89 = uTF8StreamJsonParser84.getTextOffset();
        uTF8StreamJsonParser84.overrideCurrentName("com.fasterxml.jackson.core.JsonParseException: \n at [Source: hi!; line: 52, column: 1]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNotNull(jsonLocation88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation88 = uTF8StreamJsonParser84.getTokenLocation();
        java.lang.String str89 = uTF8StreamJsonParser84.getText();
        boolean boolean90 = uTF8StreamJsonParser84.canReadObjectId();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNotNull(jsonLocation88);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema88 = null;
        // The following exception was thrown during execution in test generation
        try {
            uTF8StreamJsonParser84.setSchema(formatSchema88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        int int88 = uTF8StreamJsonParser84.getTokenColumnNr();
        java.lang.Object obj89 = uTF8StreamJsonParser84.getObjectId();
        boolean boolean90 = uTF8StreamJsonParser84.hasCurrentToken();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation88 = uTF8StreamJsonParser84.getTokenLocation();
        char[] charArray89 = uTF8StreamJsonParser84.getTextCharacters();
        int int90 = uTF8StreamJsonParser84.getTextLength();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNotNull(jsonLocation88);
        org.junit.Assert.assertNull(charArray89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        int int85 = uTF8StreamJsonParser84.getFeatureMask();
        java.lang.String str87 = uTF8StreamJsonParser84.getValueAsString("?");
        com.fasterxml.jackson.core.JsonLocation jsonLocation88 = uTF8StreamJsonParser84.getTokenLocation();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "?" + "'", str87, "?");
        org.junit.Assert.assertNotNull(jsonLocation88);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken88 = uTF8StreamJsonParser84.getCurrentToken();
        int int89 = uTF8StreamJsonParser84.getTextOffset();
        java.lang.Object obj90 = uTF8StreamJsonParser84.getInputSource();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(jsonToken88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNull(obj90);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        char[] charArray87 = uTF8StreamJsonParser84.getTextCharacters();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext88 = uTF8StreamJsonParser84.getParsingContext();
        char[] charArray89 = uTF8StreamJsonParser84.getTextCharacters();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(charArray87);
        org.junit.Assert.assertNotNull(jsonReadContext88);
        org.junit.Assert.assertNull(charArray89);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        com.fasterxml.jackson.core.JsonToken jsonToken87 = uTF8StreamJsonParser84.getCurrentToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema88 = uTF8StreamJsonParser84.getSchema();
        java.lang.Object obj89 = uTF8StreamJsonParser84.getInputSource();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(jsonToken87);
        org.junit.Assert.assertNull(formatSchema88);
        org.junit.Assert.assertNull(obj89);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation88 = uTF8StreamJsonParser84.getTokenLocation();
        java.lang.String str89 = uTF8StreamJsonParser84.getText();
        com.fasterxml.jackson.core.Version version90 = uTF8StreamJsonParser84.version();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNotNull(jsonLocation88);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertNotNull(version90);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken88 = uTF8StreamJsonParser84.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        com.fasterxml.jackson.core.JsonParser jsonParser90 = uTF8StreamJsonParser84.skipChildren();
        int int91 = uTF8StreamJsonParser84.getTextOffset();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNotNull(jsonParser90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        byte[] byteArray57 = null;
        iOContext12.releaseBase64Buffer(byteArray57);
        java.lang.Object obj59 = iOContext12.getSourceReference();
        java.io.Reader reader61 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec62 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer63 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser64 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext12, (int) 'a', reader61, objectCodec62, charsToNameCanonicalizer63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertEquals(obj59.toString(), "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj59), "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj59), "com.fasterxml.jackson.core.JsonParseException: ");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken88 = uTF8StreamJsonParser84.getCurrentToken();
        uTF8StreamJsonParser84.clearCurrentToken();
        uTF8StreamJsonParser84.overrideCurrentName("[Source: #; line: 1, column: 1]");
        uTF8StreamJsonParser84.overrideCurrentName("com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(jsonToken88);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        int int85 = uTF8StreamJsonParser84.getTextOffset();
        com.fasterxml.jackson.core.JsonLocation jsonLocation86 = uTF8StreamJsonParser84.getCurrentLocation();
        int int87 = uTF8StreamJsonParser84.getTextOffset();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(jsonLocation86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation88 = uTF8StreamJsonParser84.getTokenLocation();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext89 = uTF8StreamJsonParser84.getParsingContext();
        jsonReadContext89.setCurrentName("");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNotNull(jsonLocation88);
        org.junit.Assert.assertNotNull(jsonReadContext89);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        char[] charArray13 = serializedString2.asQuotedChars();
        java.lang.String str14 = serializedString2.toString();
        byte[] byteArray15 = serializedString2.asUnquotedUTF8();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[c, o, m, ., f, a, s, t, e, r, x, m, l, ., j, a, c, k, s, o, n, ., c, o, r, e, ., J, s, o, n, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str14, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        // The following exception was thrown during execution in test generation
        try {
            long long88 = uTF8StreamJsonParser84.nextLongValue((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        int int85 = uTF8StreamJsonParser84.getTextOffset();
        com.fasterxml.jackson.core.ObjectCodec objectCodec86 = uTF8StreamJsonParser84.getCodec();
        char[] charArray87 = uTF8StreamJsonParser84.getTextCharacters();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNull(objectCodec86);
        org.junit.Assert.assertNull(charArray87);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation88 = uTF8StreamJsonParser84.getTokenLocation();
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.Version version90 = uTF8StreamJsonParser84.version();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNotNull(jsonLocation88);
        org.junit.Assert.assertNotNull(version90);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            uTF8StreamJsonParser84.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            uTF8StreamJsonParser84.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray86 = iOContext12.allocNameCopyBuffer((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation88 = uTF8StreamJsonParser84.getTokenLocation();
        com.fasterxml.jackson.core.JsonLocation jsonLocation92 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) jsonLocation88, (long) 35, 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNotNull(jsonLocation88);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        com.fasterxml.jackson.core.JsonToken jsonToken87 = uTF8StreamJsonParser84.getCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext88 = uTF8StreamJsonParser84.getParsingContext();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(jsonToken87);
        org.junit.Assert.assertNotNull(jsonStreamContext88);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken88 = uTF8StreamJsonParser84.getCurrentToken();
        long long90 = uTF8StreamJsonParser84.getValueAsLong((long) 'a');
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(jsonToken88);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 97L + "'", long90 == 97L);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray85 = iOContext12.allocBase64Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        int int88 = uTF8StreamJsonParser84.getTokenColumnNr();
        com.fasterxml.jackson.core.JsonParser jsonParser89 = uTF8StreamJsonParser84.skipChildren();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertNotNull(jsonParser89);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation88 = uTF8StreamJsonParser84.getTokenLocation();
        com.fasterxml.jackson.core.ObjectCodec objectCodec89 = uTF8StreamJsonParser84.getCodec();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNotNull(jsonLocation88);
        org.junit.Assert.assertNull(objectCodec89);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        char[] charArray13 = serializedString2.asQuotedChars();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray13, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[c, o, m, ., f, a, s, t, e, r, x, m, l, ., j, a, c, k, s, o, n, ., c, o, r, e, ., J, s, o, n, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  ]");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString28 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int35 = serializedString28.appendQuotedUTF8(byteArray33, 0);
        char[] charArray36 = serializedString28.asQuotedChars();
        // The following exception was thrown during execution in test generation
        try {
            iOContext12.releaseTokenBuffer(charArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[c, o, m, ., f, a, s, t, e, r, x, m, l, ., j, a, c, k, s, o, n, ., c, o, r, e, ., J, s, o, n, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  ]");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        char[] charArray87 = uTF8StreamJsonParser84.getTextCharacters();
        boolean boolean88 = uTF8StreamJsonParser84.canReadObjectId();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(charArray87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        long long88 = uTF8StreamJsonParser84.getValueAsLong();
        java.lang.String str89 = uTF8StreamJsonParser84.getText();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 0L + "'", long88 == 0L);
        org.junit.Assert.assertNull(str89);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        char[] charArray13 = serializedString2.asQuotedChars();
        boolean boolean17 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray13, (int) (short) 0, (int) (short) 10, true);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[c, o, m, ., f, a, s, t, e, r, x, m, l, ., j, a, c, k, s, o, n, ., c, o, r, e, ., J, s, o, n, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        boolean boolean90 = uTF8StreamJsonParser84.hasCurrentToken();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        char[] charArray88 = uTF8StreamJsonParser84.getTextCharacters();
        int int89 = uTF8StreamJsonParser84.getValueAsInt();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(charArray88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        char[] charArray88 = uTF8StreamJsonParser84.getTextCharacters();
        com.fasterxml.jackson.core.Version version89 = uTF8StreamJsonParser84.version();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(charArray88);
        org.junit.Assert.assertNotNull(version89);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema88 = null;
        boolean boolean89 = uTF8StreamJsonParser84.canUseSchema(formatSchema88);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        int int85 = uTF8StreamJsonParser84.getTextLength();
        double double86 = uTF8StreamJsonParser84.getValueAsDouble();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        int int85 = uTF8StreamJsonParser84.getTextLength();
        boolean boolean86 = uTF8StreamJsonParser84.isClosed();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        uTF8StreamJsonParser84.clearCurrentToken();
        uTF8StreamJsonParser84.overrideCurrentName("[Source: hi!; line: 52, column: 1]");
        com.fasterxml.jackson.core.Version version90 = uTF8StreamJsonParser84.version();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNotNull(version90);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        int int85 = uTF8StreamJsonParser84.getValueAsInt();
        int int86 = uTF8StreamJsonParser84.getTokenLineNr();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        int int85 = uTF8StreamJsonParser84.getTextLength();
        java.lang.String str86 = uTF8StreamJsonParser84.getValueAsString();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNull(str86);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        int int85 = uTF8StreamJsonParser84.getValueAsInt();
        java.lang.Object obj86 = uTF8StreamJsonParser84.getObjectId();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNull(obj86);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray7 = new char[] { 'a', ' ', '#', '4' };
        int int9 = serializedString2.appendUnquoted(charArray7, 0);
        java.lang.String str10 = serializedString2.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) serializedString2, false);
        byte[] byteArray13 = null;
        iOContext12.releaseReadIOBuffer(byteArray13);
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int23 = serializedString16.appendQuotedUTF8(byteArray21, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray21, 1, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        char[] charArray34 = new char[] { 'a', ' ', '#', '4' };
        int int36 = serializedString29.appendUnquoted(charArray34, 0);
        java.lang.String str37 = serializedString29.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) serializedString29, false);
        byte[] byteArray40 = null;
        iOContext39.releaseReadIOBuffer(byteArray40);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        int int50 = serializedString43.appendQuotedUTF8(byteArray48, 0);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper53 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray48, 1, (int) (short) 1);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper56 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext12, byteArray48, 47, (int) (byte) 0);
        com.fasterxml.jackson.core.io.IOContext iOContext57 = null;
        java.io.InputStream inputStream58 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 0 };
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext57, inputStream58, byteArray61, 0, (int) '#');
        long long66 = mergedStream64.skip((long) (short) 1);
        int int67 = mergedStream64.available();
        mergedStream64.mark((int) (short) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString71 = new com.fasterxml.jackson.core.io.SerializedString("com.fasterxml.jackson.core.JsonParseException: ");
        byte[] byteArray72 = serializedString71.asUnquotedUTF8();
        com.fasterxml.jackson.core.io.MergedStream mergedStream75 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, (java.io.InputStream) mergedStream64, byteArray72, (int) (short) 100, (int) (short) -1);
        java.io.InputStream inputStream77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer79 = null;
        byte[] byteArray80 = null;
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser84 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, (int) (short) 1, inputStream77, objectCodec78, bytesToNameCanonicalizer79, byteArray80, (int) (byte) -1, (int) (short) 10, false);
        char[] charArray85 = uTF8StreamJsonParser84.getTextCharacters();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str10, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: " + "'", str37, "com.fasterxml.jackson.core.JsonParseException: ");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 34 + "'", int67 == 34);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 46, 74, 115, 111, 110, 80, 97, 114, 115, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32]");
        org.junit.Assert.assertNull(charArray85);
    }
}
