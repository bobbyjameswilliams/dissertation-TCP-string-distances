package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str2 = commandLine0.getOptionValue("org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String str3 = commandLine0.getOptionValue("org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        boolean boolean4 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option option6 = org.apache.commons.cli.OptionBuilder.create(' ');
        java.lang.Object obj7 = option6.getType();
        boolean boolean8 = option6.hasValueSeparator();
        commandLine0.addOption(option6);
        java.lang.String[] strArray11 = commandLine0.getOptionValues('4');
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(option6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        boolean boolean4 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option option6 = org.apache.commons.cli.OptionBuilder.create(' ');
        java.lang.Object obj7 = option6.getType();
        boolean boolean8 = option6.hasValueSeparator();
        commandLine0.addOption(option6);
        option6.setArgName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(option6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('a');
        java.lang.String str7 = commandLine0.getOptionValue('4', "[ option:   org.apache.commons.cli.ParseException: hi!  :: null ]");
        java.lang.Object obj9 = commandLine0.getOptionObject("[ option:    :: null ]");
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:   org.apache.commons.cli.ParseException: hi!  :: null ]" + "'", str7, "[ option:   org.apache.commons.cli.ParseException: hi!  :: null ]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.CommandLine commandLine2 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray3 = commandLine2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine5 = posixParser0.parse(options1, strArray3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.util.List list2 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.CommandLine commandLine2 = new org.apache.commons.cli.CommandLine();
        commandLine2.addArg("hi!");
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.String[] strArray6 = commandLine2.getArgs();
        java.lang.String[] strArray8 = posixParser0.flatten(options1, strArray6, false);
        org.apache.commons.cli.Options options9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = new org.apache.commons.cli.CommandLine();
        commandLine10.addArg("hi!");
        java.lang.String[] strArray13 = commandLine10.getArgs();
        java.lang.String[] strArray14 = commandLine10.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = posixParser0.parse(options9, strArray14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        boolean boolean4 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option option6 = org.apache.commons.cli.OptionBuilder.create(' ');
        java.lang.Object obj7 = option6.getType();
        boolean boolean8 = option6.hasValueSeparator();
        commandLine0.addOption(option6);
        boolean boolean10 = option6.hasArgName();
        java.lang.String str12 = option6.getValue((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(option6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.CommandLine commandLine2 = new org.apache.commons.cli.CommandLine();
        commandLine2.addArg("hi!");
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.String[] strArray6 = commandLine2.getArgs();
        java.lang.String[] strArray8 = posixParser0.flatten(options1, strArray6, false);
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str11 = option10.toString();
        java.util.ListIterator listIterator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option10, listIterator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option:   :: null ]" + "'", str11, "[ option:   :: null ]");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option option4 = org.apache.commons.cli.OptionBuilder.create(' ');
        commandLine0.addOption(option4);
        boolean boolean7 = commandLine0.hasOption('a');
        commandLine0.addArg("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(option4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option option4 = org.apache.commons.cli.OptionBuilder.create(' ');
        commandLine0.addOption(option4);
        java.lang.String[] strArray6 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(option4);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('a');
        java.lang.String str7 = commandLine0.getOptionValue('4', "[ option:   org.apache.commons.cli.ParseException: hi!  :: null ]");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:   org.apache.commons.cli.ParseException: hi!  :: null ]" + "'", str7, "[ option:   org.apache.commons.cli.ParseException: hi!  :: null ]");
        org.junit.Assert.assertNotNull(optionArray8);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.CommandLine commandLine2 = new org.apache.commons.cli.CommandLine();
        commandLine2.addArg("hi!");
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.String[] strArray6 = commandLine2.getArgs();
        java.lang.String[] strArray8 = posixParser0.flatten(options1, strArray6, false);
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str11 = option10.getDescription();
        java.lang.Object obj12 = null;
        boolean boolean13 = option10.equals(obj12);
        java.util.ListIterator listIterator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option10, listIterator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        org.apache.commons.cli.CommandLine commandLine4 = new org.apache.commons.cli.CommandLine();
        commandLine4.addArg("hi!");
        java.lang.String[] strArray7 = commandLine4.getArgs();
        java.lang.String[] strArray8 = commandLine4.getArgs();
        java.lang.String[] strArray10 = posixParser2.flatten(options3, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray13 = commandLine12.getArgs();
        java.lang.String[] strArray15 = posixParser2.flatten(options11, strArray13, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = posixParser0.parse(options1, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.CommandLine commandLine2 = new org.apache.commons.cli.CommandLine();
        commandLine2.addArg("hi!");
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.String[] strArray6 = commandLine2.getArgs();
        java.lang.String[] strArray8 = posixParser0.flatten(options1, strArray6, false);
        org.apache.commons.cli.Options options9 = null;
        org.apache.commons.cli.PosixParser posixParser10 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = new org.apache.commons.cli.CommandLine();
        commandLine12.addArg("hi!");
        java.lang.String[] strArray15 = commandLine12.getArgs();
        java.lang.String[] strArray16 = commandLine12.getArgs();
        java.lang.String[] strArray18 = posixParser10.flatten(options11, strArray16, false);
        org.apache.commons.cli.Options options19 = null;
        org.apache.commons.cli.CommandLine commandLine20 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray21 = commandLine20.getArgs();
        java.lang.String[] strArray23 = posixParser10.flatten(options19, strArray21, false);
        java.util.Properties properties24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = posixParser0.parse(options9, strArray21, properties24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.CommandLine commandLine2 = new org.apache.commons.cli.CommandLine();
        commandLine2.addArg("hi!");
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.String[] strArray6 = commandLine2.getArgs();
        java.lang.String[] strArray8 = posixParser0.flatten(options1, strArray6, false);
        org.apache.commons.cli.Options options9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray11 = commandLine10.getArgs();
        java.lang.String[] strArray13 = posixParser0.flatten(options9, strArray11, false);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.CommandLine commandLine17 = new org.apache.commons.cli.CommandLine();
        commandLine17.addArg("hi!");
        java.lang.String[] strArray20 = commandLine17.getArgs();
        java.lang.String[] strArray21 = commandLine17.getArgs();
        java.lang.String[] strArray23 = posixParser15.flatten(options16, strArray21, false);
        java.util.Properties properties24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = posixParser0.parse(options14, strArray21, properties24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        boolean boolean3 = commandLine0.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        boolean boolean7 = commandLine0.hasOption('a');
        java.lang.String str10 = commandLine0.getOptionValue("", "arg");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.lang.String str5 = commandLine0.getOptionValue('#', "org.apache.commons.cli.ParseException: hi!");
        java.lang.String str7 = commandLine0.getOptionValue("arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.cli.ParseException: hi!" + "'", str5, "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.CommandLine commandLine2 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray3 = commandLine2.getArgs();
        java.util.Properties properties4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine5 = posixParser0.parse(options1, strArray3, properties4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        boolean boolean3 = commandLine0.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String[] strArray5 = commandLine0.getOptionValues('\000');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String str6 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        boolean boolean3 = commandLine0.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        boolean boolean7 = commandLine0.hasOption('a');
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.CommandLine commandLine2 = new org.apache.commons.cli.CommandLine();
        commandLine2.addArg("hi!");
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.String[] strArray6 = commandLine2.getArgs();
        java.lang.String[] strArray8 = posixParser0.flatten(options1, strArray6, false);
        org.apache.commons.cli.Options options9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray11 = commandLine10.getArgs();
        java.lang.String[] strArray13 = posixParser0.flatten(options9, strArray11, false);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.CommandLine commandLine17 = new org.apache.commons.cli.CommandLine();
        commandLine17.addArg("hi!");
        java.lang.String[] strArray20 = commandLine17.getArgs();
        java.lang.String[] strArray21 = commandLine17.getArgs();
        java.lang.String[] strArray23 = posixParser15.flatten(options16, strArray21, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = posixParser0.parse(options14, strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.CommandLine commandLine2 = new org.apache.commons.cli.CommandLine();
        commandLine2.addArg("hi!");
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.String[] strArray6 = commandLine2.getArgs();
        java.lang.String[] strArray8 = posixParser0.flatten(options1, strArray6, false);
        org.apache.commons.cli.Options options9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray11 = commandLine10.getArgs();
        java.lang.String[] strArray13 = posixParser0.flatten(options9, strArray11, false);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.CommandLine commandLine15 = new org.apache.commons.cli.CommandLine();
        commandLine15.addArg("hi!");
        boolean boolean19 = commandLine15.hasOption("hi!");
        org.apache.commons.cli.Option option21 = org.apache.commons.cli.OptionBuilder.create(' ');
        java.lang.Object obj22 = option21.getType();
        boolean boolean23 = option21.hasValueSeparator();
        commandLine15.addOption(option21);
        java.lang.String[] strArray26 = commandLine15.getOptionValues('4');
        java.lang.String[] strArray27 = commandLine15.getArgs();
        java.util.Properties properties28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine29 = posixParser0.parse(options14, strArray27, properties28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(option21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        boolean boolean4 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option option6 = org.apache.commons.cli.OptionBuilder.create(' ');
        java.lang.Object obj7 = option6.getType();
        boolean boolean8 = option6.hasValueSeparator();
        commandLine0.addOption(option6);
        java.lang.String[] strArray11 = commandLine0.getOptionValues('4');
        java.lang.String[] strArray12 = commandLine0.getArgs();
        boolean boolean14 = commandLine0.hasOption('#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(option6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.lang.String str5 = commandLine0.getOptionValue('#', "org.apache.commons.cli.ParseException: hi!");
        boolean boolean7 = commandLine0.hasOption("hi!");
        java.lang.String str10 = commandLine0.getOptionValue(' ', "org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.CommandLine commandLine11 = new org.apache.commons.cli.CommandLine();
        commandLine11.addArg("hi!");
        org.apache.commons.cli.Option option15 = org.apache.commons.cli.OptionBuilder.create(' ');
        commandLine11.addOption(option15);
        java.lang.String str17 = option15.getValue();
        java.lang.String str18 = option15.toString();
        java.lang.String str19 = option15.getDescription();
        commandLine0.addOption(option15);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.cli.ParseException: hi!" + "'", str5, "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.ParseException: hi!" + "'", str10, "org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(option15);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:   [ option: 4  :: null ]  :: null ]" + "'", str18, "[ option:   [ option: 4  :: null ]  :: null ]");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        org.apache.commons.cli.CommandLine commandLine4 = new org.apache.commons.cli.CommandLine();
        commandLine4.addArg("hi!");
        java.lang.String[] strArray7 = commandLine4.getArgs();
        java.lang.String[] strArray8 = commandLine4.getArgs();
        java.lang.String[] strArray10 = posixParser2.flatten(options3, strArray8, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = posixParser0.parse(options1, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        boolean boolean3 = commandLine0.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        java.lang.String[] strArray7 = commandLine0.getOptionValues("[ option:    :: null ]");
        java.lang.String str10 = commandLine0.getOptionValue(" ", "org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.ParseException: hi!");
        java.util.Iterator iterator11 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.ParseException: hi!" + "'", str10, "org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        org.apache.commons.cli.Option option2 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str3 = option2.getDescription();
        int int4 = option2.getArgs();
        option2.setOptionalArg(true);
        java.lang.String[] strArray7 = option2.getValues();
        commandLine0.addOption(option2);
        java.lang.String[] strArray9 = option2.getValues();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = strArray9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        boolean boolean3 = commandLine0.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        boolean boolean7 = commandLine0.hasOption('a');
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionArray8);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.CommandLine commandLine2 = new org.apache.commons.cli.CommandLine();
        commandLine2.addArg("hi!");
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.String[] strArray6 = commandLine2.getArgs();
        java.lang.String[] strArray8 = posixParser0.flatten(options1, strArray6, false);
        org.apache.commons.cli.Options options9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray11 = commandLine10.getArgs();
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = posixParser0.parse(options9, strArray11, properties12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        boolean boolean3 = commandLine0.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.Object obj5 = commandLine0.getOptionObject(" ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        boolean boolean4 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option option6 = org.apache.commons.cli.OptionBuilder.create(' ');
        java.lang.Object obj7 = option6.getType();
        boolean boolean8 = option6.hasValueSeparator();
        commandLine0.addOption(option6);
        java.lang.String[] strArray11 = commandLine0.getOptionValues('4');
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.String str15 = commandLine0.getOptionValue('4', "org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(option6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.cli.MissingOptionException: hi!" + "'", str15, "org.apache.commons.cli.MissingOptionException: hi!");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option option4 = org.apache.commons.cli.OptionBuilder.create(' ');
        commandLine0.addOption(option4);
        java.lang.String str6 = option4.getValue();
        java.lang.String str7 = option4.toString();
        java.lang.String str8 = option4.getDescription();
        boolean boolean9 = option4.hasOptionalArg();
        org.apache.commons.cli.CommandLine commandLine10 = new org.apache.commons.cli.CommandLine();
        commandLine10.addArg("hi!");
        org.apache.commons.cli.Option option14 = org.apache.commons.cli.OptionBuilder.create(' ');
        commandLine10.addOption(option14);
        commandLine10.addArg("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.Object obj19 = commandLine10.getOptionObject('4');
        java.lang.String str22 = commandLine10.getOptionValue("[ option:   :: org.apache.commons.cli.MissingOptionException: hi! ]", "org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.ParseException: hi!");
        boolean boolean23 = option4.equals((java.lang.Object) "[ option:   :: org.apache.commons.cli.MissingOptionException: hi! ]");
        org.junit.Assert.assertNotNull(option4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:    :: null ]" + "'", str7, "[ option:    :: null ]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(option14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.ParseException: hi!" + "'", str22, "org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        boolean boolean4 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option option6 = org.apache.commons.cli.OptionBuilder.create(' ');
        java.lang.Object obj7 = option6.getType();
        boolean boolean8 = option6.hasValueSeparator();
        commandLine0.addOption(option6);
        java.lang.String[] strArray11 = commandLine0.getOptionValues('4');
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.String str14 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(option6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.cli.ParseException: hi!" + "'", str6, "org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.lang.String str5 = commandLine0.getOptionValue('#', "org.apache.commons.cli.ParseException: hi!");
        boolean boolean7 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('a');
        java.lang.String str11 = commandLine0.getOptionValue("[ option:   :: org.apache.commons.cli.MissingOptionException: hi! ]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.cli.ParseException: hi!" + "'", str5, "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        boolean boolean4 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option option6 = org.apache.commons.cli.OptionBuilder.create(' ');
        java.lang.Object obj7 = option6.getType();
        boolean boolean8 = option6.hasValueSeparator();
        commandLine0.addOption(option6);
        java.lang.String[] strArray11 = commandLine0.getOptionValues('4');
        java.lang.String str13 = commandLine0.getOptionValue("arg");
        java.lang.String str15 = commandLine0.getOptionValue("arg");
        java.lang.String str18 = commandLine0.getOptionValue("[ option:    :: null ]", "[ option: 4  :: null ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(option6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option: 4  :: null ]" + "'", str18, "[ option: 4  :: null ]");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.CommandLine commandLine2 = new org.apache.commons.cli.CommandLine();
        commandLine2.addArg("hi!");
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.String[] strArray6 = commandLine2.getArgs();
        java.lang.String[] strArray8 = posixParser0.flatten(options1, strArray6, false);
        org.apache.commons.cli.Options options9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray11 = commandLine10.getArgs();
        java.lang.String[] strArray13 = posixParser0.flatten(options9, strArray11, false);
        org.apache.commons.cli.Options options14 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.CommandLine commandLine17 = new org.apache.commons.cli.CommandLine();
        commandLine17.addArg("hi!");
        java.lang.String[] strArray20 = commandLine17.getArgs();
        java.lang.String[] strArray21 = commandLine17.getArgs();
        java.lang.String[] strArray23 = posixParser15.flatten(options16, strArray21, false);
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray26 = commandLine25.getArgs();
        java.lang.String[] strArray28 = posixParser15.flatten(options24, strArray26, false);
        org.apache.commons.cli.CommandLine commandLine30 = posixParser0.parse(options14, strArray28, true);
        org.apache.commons.cli.Option option32 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str33 = option32.getDescription();
        boolean boolean34 = option32.hasLongOpt();
        boolean boolean35 = option32.hasArgs();
        char char36 = option32.getValueSeparator();
        java.util.ListIterator listIterator37 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option32, listIterator37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(commandLine30);
        org.junit.Assert.assertNotNull(option32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + char36 + "' != '" + '\000' + "'", char36 == '\000');
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        boolean boolean3 = commandLine0.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String[] strArray4 = commandLine0.getArgs();
        java.lang.Object obj6 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option option4 = org.apache.commons.cli.OptionBuilder.create(' ');
        commandLine0.addOption(option4);
        commandLine0.addArg("org.apache.commons.cli.MissingOptionException: hi!");
        boolean boolean9 = commandLine0.hasOption("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        commandLine0.addArg("org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(option4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        org.apache.commons.cli.Option option2 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str3 = option2.getDescription();
        int int4 = option2.getArgs();
        option2.setOptionalArg(true);
        java.lang.String[] strArray7 = option2.getValues();
        commandLine0.addOption(option2);
        option2.setRequired(false);
        org.apache.commons.cli.CommandLine commandLine11 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray13 = commandLine11.getOptionValues('4');
        option2.setType((java.lang.Object) '4');
        org.junit.Assert.assertNotNull(option2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        boolean boolean3 = commandLine0.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        boolean boolean7 = commandLine0.hasOption("[ option:   :: null ]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        boolean boolean4 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option option6 = org.apache.commons.cli.OptionBuilder.create(' ');
        java.lang.Object obj7 = option6.getType();
        boolean boolean8 = option6.hasValueSeparator();
        commandLine0.addOption(option6);
        java.lang.String[] strArray11 = commandLine0.getOptionValues('4');
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.String str14 = commandLine0.getOptionValue('#');
        java.lang.String str16 = commandLine0.getOptionValue("org.apache.commons.cli.MissingOptionException:  ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(option6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.CommandLine commandLine2 = new org.apache.commons.cli.CommandLine();
        commandLine2.addArg("hi!");
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.String[] strArray6 = commandLine2.getArgs();
        java.lang.String[] strArray8 = posixParser0.flatten(options1, strArray6, false);
        org.apache.commons.cli.Options options9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray11 = commandLine10.getArgs();
        java.lang.String[] strArray13 = posixParser0.flatten(options9, strArray11, false);
        org.apache.commons.cli.Options options14 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options18 = options14.addOption("", false, " ");
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = null;
        org.apache.commons.cli.CommandLine commandLine21 = new org.apache.commons.cli.CommandLine();
        commandLine21.addArg("hi!");
        java.lang.String[] strArray24 = commandLine21.getArgs();
        java.lang.String[] strArray25 = commandLine21.getArgs();
        java.lang.String[] strArray27 = posixParser19.flatten(options20, strArray25, false);
        org.apache.commons.cli.CommandLine commandLine28 = posixParser0.parse(options18, strArray25);
        org.apache.commons.cli.Options options29 = null;
        java.lang.String[] strArray35 = new java.lang.String[] { "[ option:   org.apache.commons.cli.ParseException: hi!  :: null ]", "org.apache.commons.cli.ParseException: ", "", "org.apache.commons.cli.MissingOptionException: hi!", "[ option: 4  :: null ]" };
        java.util.Properties properties36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine38 = posixParser0.parse(options29, strArray35, properties36, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(commandLine28);
        org.junit.Assert.assertNotNull(strArray35);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.CommandLine commandLine2 = new org.apache.commons.cli.CommandLine();
        commandLine2.addArg("hi!");
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.String[] strArray6 = commandLine2.getArgs();
        java.lang.String[] strArray8 = posixParser0.flatten(options1, strArray6, false);
        org.apache.commons.cli.Options options9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray11 = commandLine10.getArgs();
        java.lang.String[] strArray13 = posixParser0.flatten(options9, strArray11, false);
        posixParser0.burstToken(" ", true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option option4 = org.apache.commons.cli.OptionBuilder.create(' ');
        commandLine0.addOption(option4);
        boolean boolean7 = commandLine0.hasOption('a');
        java.lang.String str9 = commandLine0.getOptionValue("a");
        boolean boolean11 = commandLine0.hasOption('a');
        org.junit.Assert.assertNotNull(option4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option option4 = org.apache.commons.cli.OptionBuilder.create(' ');
        commandLine0.addOption(option4);
        java.lang.String str6 = option4.getValue();
        java.lang.String str8 = option4.getValue((int) (short) 100);
        int int9 = option4.getArgs();
        boolean boolean10 = option4.hasOptionalArg();
        java.lang.String[] strArray11 = option4.getValues();
        org.junit.Assert.assertNotNull(option4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.CommandLine commandLine2 = new org.apache.commons.cli.CommandLine();
        commandLine2.addArg("hi!");
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.String[] strArray6 = commandLine2.getArgs();
        java.lang.String[] strArray8 = posixParser0.flatten(options1, strArray6, false);
        org.apache.commons.cli.Options options9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray11 = commandLine10.getArgs();
        java.lang.String[] strArray13 = posixParser0.flatten(options9, strArray11, false);
        org.apache.commons.cli.Options options14 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options18 = options14.addOption("", false, " ");
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = null;
        org.apache.commons.cli.CommandLine commandLine21 = new org.apache.commons.cli.CommandLine();
        commandLine21.addArg("hi!");
        java.lang.String[] strArray24 = commandLine21.getArgs();
        java.lang.String[] strArray25 = commandLine21.getArgs();
        java.lang.String[] strArray27 = posixParser19.flatten(options20, strArray25, false);
        org.apache.commons.cli.CommandLine commandLine28 = posixParser0.parse(options18, strArray25);
        org.apache.commons.cli.PosixParser posixParser29 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options30 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.util.Properties properties32 = null;
        org.apache.commons.cli.CommandLine commandLine33 = posixParser29.parse(options30, strArray31, properties32);
        java.lang.String[] strArray34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray36 = posixParser0.flatten(options30, strArray34, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(commandLine28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(commandLine33);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option option4 = org.apache.commons.cli.OptionBuilder.create(' ');
        commandLine0.addOption(option4);
        java.util.Iterator iterator6 = commandLine0.iterator();
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str10 = commandLine0.getOptionValue('\000', "a");
        org.junit.Assert.assertNotNull(option4);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a" + "'", str10, "a");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        boolean boolean3 = commandLine0.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        java.lang.String str8 = commandLine0.getOptionValue('4', "arg");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        boolean boolean3 = commandLine0.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        boolean boolean7 = commandLine0.hasOption('a');
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create(' ');
        java.lang.Object obj10 = option9.getType();
        boolean boolean11 = option9.hasValueSeparator();
        option9.setValueSeparator('4');
        java.lang.String str14 = option9.getArgName();
        java.lang.String str15 = option9.getLongOpt();
        commandLine0.addOption(option9);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        boolean boolean4 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option option6 = org.apache.commons.cli.OptionBuilder.create(' ');
        java.lang.Object obj7 = option6.getType();
        boolean boolean8 = option6.hasValueSeparator();
        commandLine0.addOption(option6);
        java.lang.String[] strArray11 = commandLine0.getOptionValues('4');
        java.lang.String str14 = commandLine0.getOptionValue('#', "[ option:    :: null ]");
        java.lang.Object obj16 = commandLine0.getOptionObject("[ option:   org.apache.commons.cli.ParseException: hi!  :: null ]");
        commandLine0.addArg("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(option6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:    :: null ]" + "'", str14, "[ option:    :: null ]");
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('a');
        java.lang.String str7 = commandLine0.getOptionValue('4', "[ option:   org.apache.commons.cli.ParseException: hi!  :: null ]");
        java.lang.Object obj9 = commandLine0.getOptionObject("[ option:    :: null ]");
        java.util.Iterator iterator10 = commandLine0.iterator();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:   org.apache.commons.cli.ParseException: hi!  :: null ]" + "'", str7, "[ option:   org.apache.commons.cli.ParseException: hi!  :: null ]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        boolean boolean4 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option option6 = org.apache.commons.cli.OptionBuilder.create(' ');
        java.lang.Object obj7 = option6.getType();
        boolean boolean8 = option6.hasValueSeparator();
        commandLine0.addOption(option6);
        org.apache.commons.cli.Options options10 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options14 = options10.addOption("", false, " ");
        option6.setType((java.lang.Object) " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(option6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options14);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        org.apache.commons.cli.CommandLine commandLine4 = new org.apache.commons.cli.CommandLine();
        commandLine4.addArg("hi!");
        java.lang.String[] strArray7 = commandLine4.getArgs();
        java.lang.String[] strArray8 = commandLine4.getArgs();
        java.lang.String[] strArray10 = posixParser2.flatten(options3, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray13 = commandLine12.getArgs();
        java.lang.String[] strArray15 = posixParser2.flatten(options11, strArray13, false);
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options20 = options16.addOption("", false, " ");
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = null;
        org.apache.commons.cli.CommandLine commandLine23 = new org.apache.commons.cli.CommandLine();
        commandLine23.addArg("hi!");
        java.lang.String[] strArray26 = commandLine23.getArgs();
        java.lang.String[] strArray27 = commandLine23.getArgs();
        java.lang.String[] strArray29 = posixParser21.flatten(options22, strArray27, false);
        org.apache.commons.cli.CommandLine commandLine30 = posixParser2.parse(options20, strArray27);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine31 = posixParser0.parse(options1, strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(commandLine30);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        boolean boolean3 = commandLine0.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        boolean boolean3 = commandLine0.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String[] strArray4 = commandLine0.getArgs();
        java.lang.Object obj6 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('a');
        java.lang.String str7 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.util.Properties properties3 = null;
        org.apache.commons.cli.CommandLine commandLine4 = posixParser0.parse(options1, strArray2, properties3);
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options9 = options5.addOption("", false, " ");
        java.util.List list10 = options9.getRequiredOptions();
        java.util.Collection collection11 = options9.getOptions();
        org.apache.commons.cli.PosixParser posixParser12 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray14 = new java.lang.String[] {};
        java.util.Properties properties15 = null;
        org.apache.commons.cli.CommandLine commandLine16 = posixParser12.parse(options13, strArray14, properties15);
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options21 = options17.addOption("", false, " ");
        org.apache.commons.cli.CommandLine commandLine22 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray23 = commandLine22.getArgs();
        boolean boolean25 = commandLine22.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String[] strArray26 = commandLine22.getArgs();
        org.apache.commons.cli.CommandLine commandLine28 = posixParser12.parse(options21, strArray26, false);
        org.apache.commons.cli.CommandLine commandLine29 = posixParser0.parse(options9, strArray26);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(commandLine4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(commandLine28);
        org.junit.Assert.assertNotNull(commandLine29);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.lang.String str5 = commandLine0.getOptionValue('#', "org.apache.commons.cli.ParseException: hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String[] strArray8 = commandLine0.getOptionValues('#');
        java.lang.Class<?> wildcardClass9 = commandLine0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.cli.ParseException: hi!" + "'", str5, "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.CommandLine commandLine2 = new org.apache.commons.cli.CommandLine();
        commandLine2.addArg("hi!");
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.String[] strArray6 = commandLine2.getArgs();
        java.lang.String[] strArray8 = posixParser0.flatten(options1, strArray6, false);
        org.apache.commons.cli.Options options9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray11 = commandLine10.getArgs();
        java.lang.String[] strArray13 = posixParser0.flatten(options9, strArray11, false);
        org.apache.commons.cli.Options options14 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options18 = options14.addOption("", false, " ");
        org.apache.commons.cli.CommandLine commandLine19 = new org.apache.commons.cli.CommandLine();
        commandLine19.addArg("hi!");
        java.lang.String[] strArray22 = commandLine19.getArgs();
        java.lang.String[] strArray23 = commandLine19.getArgs();
        java.util.Properties properties24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = posixParser0.parse(options14, strArray23, properties24);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(commandLine25);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        boolean boolean4 = commandLine0.hasOption("hi!");
        boolean boolean6 = commandLine0.hasOption('a');
        java.lang.String str8 = commandLine0.getOptionValue("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.CommandLine commandLine2 = new org.apache.commons.cli.CommandLine();
        commandLine2.addArg("hi!");
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.String[] strArray6 = commandLine2.getArgs();
        java.lang.String[] strArray8 = posixParser0.flatten(options1, strArray6, false);
        org.apache.commons.cli.Options options9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray11 = commandLine10.getArgs();
        java.lang.String[] strArray13 = posixParser0.flatten(options9, strArray11, false);
        org.apache.commons.cli.Options options14 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.CommandLine commandLine17 = new org.apache.commons.cli.CommandLine();
        commandLine17.addArg("hi!");
        java.lang.String[] strArray20 = commandLine17.getArgs();
        java.lang.String[] strArray21 = commandLine17.getArgs();
        java.lang.String[] strArray23 = posixParser15.flatten(options16, strArray21, false);
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray26 = commandLine25.getArgs();
        java.lang.String[] strArray28 = posixParser15.flatten(options24, strArray26, false);
        org.apache.commons.cli.CommandLine commandLine30 = posixParser0.parse(options14, strArray28, true);
        boolean boolean32 = options14.hasOption("[ option:   [ option: 4  :: null ]  :: null ]");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(commandLine30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('a');
        java.lang.String str7 = commandLine0.getOptionValue('4', "[ option:   org.apache.commons.cli.ParseException: hi!  :: null ]");
        java.lang.Object obj9 = commandLine0.getOptionObject("[ option:    :: null ]");
        java.lang.String[] strArray10 = commandLine0.getArgs();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:   org.apache.commons.cli.ParseException: hi!  :: null ]" + "'", str7, "[ option:   org.apache.commons.cli.ParseException: hi!  :: null ]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        org.apache.commons.cli.Option option2 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str3 = option2.getDescription();
        int int4 = option2.getArgs();
        option2.setOptionalArg(true);
        java.lang.String[] strArray7 = option2.getValues();
        commandLine0.addOption(option2);
        java.lang.String str10 = commandLine0.getOptionValue("org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertNotNull(option2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option option4 = org.apache.commons.cli.OptionBuilder.create(' ');
        commandLine0.addOption(option4);
        commandLine0.addArg("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(option4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray9);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option option4 = org.apache.commons.cli.OptionBuilder.create(' ');
        commandLine0.addOption(option4);
        java.util.Iterator iterator6 = commandLine0.iterator();
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String[] strArray9 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg(" ");
        org.junit.Assert.assertNotNull(option4);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option option4 = org.apache.commons.cli.OptionBuilder.create(' ');
        commandLine0.addOption(option4);
        java.lang.Object obj7 = commandLine0.getOptionObject("[ option:   :: null ]");
        org.junit.Assert.assertNotNull(option4);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.CommandLine commandLine2 = new org.apache.commons.cli.CommandLine();
        commandLine2.addArg("hi!");
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.String[] strArray6 = commandLine2.getArgs();
        java.lang.String[] strArray8 = posixParser0.flatten(options1, strArray6, false);
        org.apache.commons.cli.Options options9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray11 = commandLine10.getArgs();
        java.lang.String[] strArray13 = posixParser0.flatten(options9, strArray11, false);
        org.apache.commons.cli.Options options14 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.CommandLine commandLine17 = new org.apache.commons.cli.CommandLine();
        commandLine17.addArg("hi!");
        java.lang.String[] strArray20 = commandLine17.getArgs();
        java.lang.String[] strArray21 = commandLine17.getArgs();
        java.lang.String[] strArray23 = posixParser15.flatten(options16, strArray21, false);
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray26 = commandLine25.getArgs();
        java.lang.String[] strArray28 = posixParser15.flatten(options24, strArray26, false);
        org.apache.commons.cli.CommandLine commandLine30 = posixParser0.parse(options14, strArray28, true);
        org.apache.commons.cli.Options options31 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options35 = options31.addOption("", false, " ");
        java.util.List list36 = options35.getRequiredOptions();
        org.apache.commons.cli.CommandLine commandLine37 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray38 = commandLine37.getArgs();
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser0.parse(options35, strArray38, properties39);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(commandLine30);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option option4 = org.apache.commons.cli.OptionBuilder.create(' ');
        commandLine0.addOption(option4);
        java.lang.String str6 = option4.getValue();
        java.lang.String str8 = option4.getValue((int) (short) 100);
        int int9 = option4.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            option4.addValue("org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: NO_ARGS_ALLOWED");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.CommandLine commandLine2 = new org.apache.commons.cli.CommandLine();
        commandLine2.addArg("hi!");
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.String[] strArray6 = commandLine2.getArgs();
        java.lang.String[] strArray8 = posixParser0.flatten(options1, strArray6, false);
        org.apache.commons.cli.Options options9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray11 = commandLine10.getArgs();
        java.lang.String[] strArray13 = posixParser0.flatten(options9, strArray11, false);
        org.apache.commons.cli.Options options14 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option16 = org.apache.commons.cli.OptionBuilder.create(' ');
        option16.setArgName("");
        java.lang.String str19 = option16.getLongOpt();
        option16.setLongOpt("[ option:    :: null ]");
        org.apache.commons.cli.OptionGroup optionGroup22 = options14.getOptionGroup(option16);
        java.util.List list23 = options14.helpOptions();
        java.lang.String[] strArray24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = posixParser0.parse(options14, strArray24);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(optionGroup22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(commandLine25);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option option4 = org.apache.commons.cli.OptionBuilder.create(' ');
        commandLine0.addOption(option4);
        java.lang.String str6 = option4.toString();
        option4.setValueSeparator('#');
        java.lang.String str9 = option4.getArgName();
        org.junit.Assert.assertNotNull(option4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ option:    :: null ]" + "'", str6, "[ option:    :: null ]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.CommandLine commandLine2 = new org.apache.commons.cli.CommandLine();
        commandLine2.addArg("hi!");
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.String[] strArray6 = commandLine2.getArgs();
        java.lang.String[] strArray8 = posixParser0.flatten(options1, strArray6, false);
        org.apache.commons.cli.Options options9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray11 = commandLine10.getArgs();
        java.lang.String[] strArray13 = posixParser0.flatten(options9, strArray11, false);
        org.apache.commons.cli.Options options14 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options18 = options14.addOption("", false, " ");
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = null;
        org.apache.commons.cli.CommandLine commandLine21 = new org.apache.commons.cli.CommandLine();
        commandLine21.addArg("hi!");
        java.lang.String[] strArray24 = commandLine21.getArgs();
        java.lang.String[] strArray25 = commandLine21.getArgs();
        java.lang.String[] strArray27 = posixParser19.flatten(options20, strArray25, false);
        org.apache.commons.cli.CommandLine commandLine28 = posixParser0.parse(options18, strArray25);
        java.util.Collection collection29 = options18.getOptionGroups();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(commandLine28);
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str2 = option1.getDescription();
        boolean boolean3 = option1.hasArgName();
        java.lang.String str4 = option1.toString();
        org.apache.commons.cli.CommandLine commandLine5 = new org.apache.commons.cli.CommandLine();
        commandLine5.addArg("hi!");
        boolean boolean9 = commandLine5.hasOption("hi!");
        org.apache.commons.cli.Option option11 = org.apache.commons.cli.OptionBuilder.create(' ');
        java.lang.Object obj12 = option11.getType();
        boolean boolean13 = option11.hasValueSeparator();
        commandLine5.addOption(option11);
        option1.setType((java.lang.Object) commandLine5);
        org.apache.commons.cli.CommandLine commandLine16 = new org.apache.commons.cli.CommandLine();
        commandLine16.addArg("hi!");
        org.apache.commons.cli.Option option20 = org.apache.commons.cli.OptionBuilder.create(' ');
        commandLine16.addOption(option20);
        boolean boolean22 = option20.isRequired();
        commandLine5.addOption(option20);
        boolean boolean25 = commandLine5.hasOption("org.apache.commons.cli.ParseException: ");
        java.lang.Object obj27 = commandLine5.getOptionObject("org.apache.commons.cli.MissingOptionException:  ");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ option:   :: null ]" + "'", str4, "[ option:   :: null ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(option20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str2 = option1.getDescription();
        int int3 = option1.getArgs();
        option1.setOptionalArg(true);
        org.apache.commons.cli.CommandLine commandLine6 = new org.apache.commons.cli.CommandLine();
        commandLine6.addArg("hi!");
        java.lang.String[] strArray9 = commandLine6.getArgs();
        java.lang.String[] strArray10 = commandLine6.getArgs();
        option1.setType((java.lang.Object) commandLine6);
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        option1.setType((java.lang.Object) "");
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option option4 = org.apache.commons.cli.OptionBuilder.create(' ');
        commandLine0.addOption(option4);
        java.lang.String str6 = option4.toString();
        option4.setValueSeparator('#');
        java.lang.Object obj9 = option4.getType();
        org.junit.Assert.assertNotNull(option4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ option:    :: null ]" + "'", str6, "[ option:    :: null ]");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.CommandLine commandLine2 = new org.apache.commons.cli.CommandLine();
        commandLine2.addArg("hi!");
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.String[] strArray6 = commandLine2.getArgs();
        java.lang.String[] strArray8 = posixParser0.flatten(options1, strArray6, false);
        org.apache.commons.cli.Options options9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray11 = commandLine10.getArgs();
        java.lang.String[] strArray13 = posixParser0.flatten(options9, strArray11, false);
        org.apache.commons.cli.PosixParser posixParser14 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.CommandLine commandLine16 = new org.apache.commons.cli.CommandLine();
        commandLine16.addArg("hi!");
        java.lang.String[] strArray19 = commandLine16.getArgs();
        java.lang.String[] strArray20 = commandLine16.getArgs();
        java.lang.String[] strArray22 = posixParser14.flatten(options15, strArray20, false);
        org.apache.commons.cli.Options options23 = null;
        org.apache.commons.cli.CommandLine commandLine24 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray25 = commandLine24.getArgs();
        java.lang.String[] strArray27 = posixParser14.flatten(options23, strArray25, false);
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options32 = options28.addOption("", false, " ");
        org.apache.commons.cli.PosixParser posixParser33 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options34 = null;
        org.apache.commons.cli.CommandLine commandLine35 = new org.apache.commons.cli.CommandLine();
        commandLine35.addArg("hi!");
        java.lang.String[] strArray38 = commandLine35.getArgs();
        java.lang.String[] strArray39 = commandLine35.getArgs();
        java.lang.String[] strArray41 = posixParser33.flatten(options34, strArray39, false);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser14.parse(options32, strArray39);
        org.apache.commons.cli.Option option44 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str45 = option44.getDescription();
        int int46 = option44.getArgs();
        option44.setOptionalArg(true);
        org.apache.commons.cli.CommandLine commandLine49 = new org.apache.commons.cli.CommandLine();
        commandLine49.addArg("hi!");
        java.lang.String[] strArray52 = commandLine49.getArgs();
        java.lang.String[] strArray53 = commandLine49.getArgs();
        option44.setType((java.lang.Object) commandLine49);
        java.lang.String[] strArray55 = commandLine49.getArgs();
        java.lang.Object obj57 = commandLine49.getOptionObject(" ");
        java.lang.String[] strArray58 = commandLine49.getArgs();
        java.util.Properties properties59 = null;
        org.apache.commons.cli.CommandLine commandLine61 = posixParser0.parse(options32, strArray58, properties59, true);
        org.apache.commons.cli.Options options62 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray65 = new java.lang.String[] { "[ option:   [ option: 4  :: null ]  :: null ]", "[ option:   :: null ]" };
        java.util.Properties properties66 = null;
        org.apache.commons.cli.CommandLine commandLine67 = posixParser0.parse(options62, strArray65, properties66);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(option44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(commandLine61);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(commandLine67);
    }
}
