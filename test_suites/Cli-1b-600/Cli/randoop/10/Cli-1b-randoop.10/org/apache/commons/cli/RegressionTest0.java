package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options4 = null;
        org.apache.commons.cli.CommandLine commandLine5 = new org.apache.commons.cli.CommandLine();
        java.util.List list6 = commandLine5.getArgList();
        java.lang.String[] strArray7 = commandLine5.getArgs();
        java.util.Properties properties8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = posixParser0.parse(options4, strArray7, properties8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str9 = commandLine0.getOptionValue('\000', "org.apache.commons.cli.MissingArgumentException: hi!");
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", false, "hi!");
        option13.setArgs(1);
        option13.setArgName("");
        boolean boolean18 = option13.hasLongOpt();
        option13.addValue("hi!");
        option13.setArgName("");
        commandLine0.addOption(option13);
        java.lang.Class<?> wildcardClass24 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.cli.MissingArgumentException: hi!" + "'", str9, "org.apache.commons.cli.MissingArgumentException: hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.Object obj3 = commandLine0.getOptionObject("arg");
        org.apache.commons.cli.Option option5 = org.apache.commons.cli.OptionBuilder.create("arg");
        commandLine0.addOption(option5);
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(option5);
        org.junit.Assert.assertNotNull(optionArray7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", false, "hi!");
        option22.setArgs(1);
        option22.setArgName("");
        boolean boolean27 = option22.hasLongOpt();
        option22.addValue("hi!");
        java.lang.String[] strArray30 = option22.getValues();
        java.lang.String[] strArray32 = posixParser17.flatten(options18, strArray30, true);
        java.lang.String[] strArray34 = posixParser0.flatten(options16, strArray30, true);
        org.apache.commons.cli.Options options35 = null;
        org.apache.commons.cli.PosixParser posixParser36 = new org.apache.commons.cli.PosixParser();
        posixParser36.burstToken("", false);
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.CommandLine commandLine41 = new org.apache.commons.cli.CommandLine();
        java.util.List list42 = commandLine41.getArgList();
        java.lang.String[] strArray43 = commandLine41.getArgs();
        java.lang.String[] strArray45 = posixParser36.flatten(options40, strArray43, true);
        java.util.Properties properties46 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine48 = posixParser0.parse(options35, strArray43, properties46, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray45);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str9 = commandLine0.getOptionValue('\000', "org.apache.commons.cli.MissingArgumentException: hi!");
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", false, "hi!");
        option13.setArgs(1);
        option13.setArgName("");
        boolean boolean18 = option13.hasLongOpt();
        option13.addValue("hi!");
        option13.setArgName("");
        commandLine0.addOption(option13);
        java.lang.Object obj25 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.cli.MissingArgumentException: hi!" + "'", str9, "org.apache.commons.cli.MissingArgumentException: hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", false, "hi!");
        option22.setArgs(1);
        option22.setArgName("");
        boolean boolean27 = option22.hasLongOpt();
        option22.addValue("hi!");
        java.lang.String[] strArray30 = option22.getValues();
        java.lang.String[] strArray32 = posixParser17.flatten(options18, strArray30, true);
        java.lang.String[] strArray34 = posixParser0.flatten(options16, strArray30, false);
        org.apache.commons.cli.Options options35 = null;
        org.apache.commons.cli.CommandLine commandLine36 = new org.apache.commons.cli.CommandLine();
        java.util.List list37 = commandLine36.getArgList();
        java.lang.String[] strArray38 = commandLine36.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine39 = posixParser0.parse(options35, strArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(strArray38);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('\000');
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "[ option:   :: hi! ]");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:   :: hi! ]" + "'", str12, "[ option:   :: hi! ]");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("arg");
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray12 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) posixParser0);
        org.apache.commons.cli.Options options5 = null;
        org.apache.commons.cli.CommandLine commandLine6 = new org.apache.commons.cli.CommandLine();
        java.util.List list7 = commandLine6.getArgList();
        java.lang.String[] strArray8 = commandLine6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = posixParser0.parse(options5, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) posixParser0);
        org.apache.commons.cli.Options options5 = null;
        org.apache.commons.cli.PosixParser posixParser6 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options7 = null;
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", false, "hi!");
        option11.setArgs(1);
        option11.setArgName("");
        boolean boolean16 = option11.hasLongOpt();
        option11.addValue("hi!");
        java.lang.String[] strArray19 = option11.getValues();
        java.lang.String[] strArray21 = posixParser6.flatten(options7, strArray19, true);
        org.apache.commons.cli.Options options22 = null;
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", false, "hi!");
        option28.setArgs(1);
        option28.setArgName("");
        boolean boolean33 = option28.hasLongOpt();
        option28.addValue("hi!");
        java.lang.String[] strArray36 = option28.getValues();
        java.lang.String[] strArray38 = posixParser23.flatten(options24, strArray36, true);
        java.lang.String[] strArray40 = posixParser6.flatten(options22, strArray36, true);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.Option option47 = new org.apache.commons.cli.Option("", false, "hi!");
        option47.setArgs(1);
        option47.setArgName("");
        boolean boolean52 = option47.hasLongOpt();
        option47.addValue("hi!");
        java.lang.String[] strArray55 = option47.getValues();
        java.lang.String[] strArray57 = posixParser42.flatten(options43, strArray55, true);
        java.lang.String[] strArray59 = posixParser6.flatten(options41, strArray57, true);
        java.lang.String[] strArray61 = posixParser0.flatten(options5, strArray59, false);
        org.apache.commons.cli.Options options62 = null;
        org.apache.commons.cli.CommandLine commandLine63 = new org.apache.commons.cli.CommandLine();
        java.util.List list64 = commandLine63.getArgList();
        java.lang.String[] strArray66 = commandLine63.getOptionValues(' ');
        java.lang.String[] strArray68 = commandLine63.getOptionValues("arg");
        java.lang.Object obj70 = commandLine63.getOptionObject('a');
        boolean boolean72 = commandLine63.hasOption('\000');
        java.lang.String str75 = commandLine63.getOptionValue("", "org.apache.commons.cli.UnrecognizedOptionException: ");
        java.lang.String[] strArray76 = commandLine63.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine78 = posixParser0.parse(options62, strArray76, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNull(strArray66);
        org.junit.Assert.assertNull(strArray68);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: " + "'", str75, "org.apache.commons.cli.UnrecognizedOptionException: ");
        org.junit.Assert.assertNotNull(strArray76);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('\000');
        java.lang.String str12 = commandLine0.getOptionValue("", "org.apache.commons.cli.UnrecognizedOptionException: ");
        java.lang.String[] strArray13 = commandLine0.getArgs();
        commandLine0.addArg("arg");
        java.lang.Object obj17 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: " + "'", str12, "org.apache.commons.cli.UnrecognizedOptionException: ");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(optionArray18);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", false, "hi!");
        option22.setArgs(1);
        option22.setArgName("");
        boolean boolean27 = option22.hasLongOpt();
        option22.addValue("hi!");
        java.lang.String[] strArray30 = option22.getValues();
        java.lang.String[] strArray32 = posixParser17.flatten(options18, strArray30, true);
        java.lang.String[] strArray34 = posixParser0.flatten(options16, strArray30, true);
        org.apache.commons.cli.Options options35 = null;
        org.apache.commons.cli.PosixParser posixParser36 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options37 = null;
        org.apache.commons.cli.Option option41 = new org.apache.commons.cli.Option("", false, "hi!");
        option41.setArgs(1);
        option41.setArgName("");
        boolean boolean46 = option41.hasLongOpt();
        option41.addValue("hi!");
        java.lang.String[] strArray49 = option41.getValues();
        java.lang.String[] strArray51 = posixParser36.flatten(options37, strArray49, true);
        java.lang.String[] strArray53 = posixParser0.flatten(options35, strArray51, true);
        org.apache.commons.cli.Options options54 = null;
        org.apache.commons.cli.CommandLine commandLine55 = new org.apache.commons.cli.CommandLine();
        java.util.List list56 = commandLine55.getArgList();
        java.lang.String[] strArray58 = commandLine55.getOptionValues(' ');
        java.lang.String[] strArray60 = commandLine55.getOptionValues("arg");
        java.lang.Object obj62 = commandLine55.getOptionObject('a');
        java.lang.String[] strArray63 = commandLine55.getArgs();
        java.lang.String[] strArray65 = posixParser0.flatten(options54, strArray63, true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNull(strArray58);
        org.junit.Assert.assertNull(strArray60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray65);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str9 = commandLine0.getOptionValue('\000', "org.apache.commons.cli.MissingArgumentException: hi!");
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", false, "hi!");
        option13.setArgs(1);
        option13.setArgName("");
        boolean boolean18 = option13.hasLongOpt();
        option13.addValue("hi!");
        option13.setArgName("");
        commandLine0.addOption(option13);
        java.lang.String str25 = option13.getValue(0);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.cli.MissingArgumentException: hi!" + "'", str9, "org.apache.commons.cli.MissingArgumentException: hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str9 = commandLine0.getOptionValue('\000', "org.apache.commons.cli.MissingArgumentException: hi!");
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", false, "hi!");
        option13.setArgs(1);
        option13.setArgName("");
        boolean boolean18 = option13.hasLongOpt();
        option13.addValue("hi!");
        option13.setArgName("");
        commandLine0.addOption(option13);
        java.lang.String str25 = option13.getValue("");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.cli.MissingArgumentException: hi!" + "'", str9, "org.apache.commons.cli.MissingArgumentException: hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.Object obj3 = commandLine0.getOptionObject("arg");
        org.apache.commons.cli.Option option5 = org.apache.commons.cli.OptionBuilder.create("arg");
        commandLine0.addOption(option5);
        java.util.List list7 = commandLine0.getArgList();
        java.util.List list8 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(option5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.Object obj3 = commandLine0.getOptionObject("arg");
        org.apache.commons.cli.Option option5 = org.apache.commons.cli.OptionBuilder.create("arg");
        commandLine0.addOption(option5);
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(option5);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.Object obj3 = commandLine0.getOptionObject("arg");
        org.apache.commons.cli.Option option5 = org.apache.commons.cli.OptionBuilder.create("");
        org.apache.commons.cli.PosixParser posixParser6 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options7 = null;
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", false, "hi!");
        option11.setArgs(1);
        option11.setArgName("");
        boolean boolean16 = option11.hasLongOpt();
        option11.addValue("hi!");
        java.lang.String[] strArray19 = option11.getValues();
        java.lang.String[] strArray21 = posixParser6.flatten(options7, strArray19, true);
        org.apache.commons.cli.Options options22 = null;
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", false, "hi!");
        option28.setArgs(1);
        option28.setArgName("");
        boolean boolean33 = option28.hasLongOpt();
        option28.addValue("hi!");
        java.lang.String[] strArray36 = option28.getValues();
        java.lang.String[] strArray38 = posixParser23.flatten(options24, strArray36, true);
        java.lang.String[] strArray40 = posixParser6.flatten(options22, strArray36, true);
        option5.setType((java.lang.Object) strArray36);
        commandLine0.addOption(option5);
        java.lang.String str44 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(option5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('\000');
        commandLine0.addArg("");
        java.lang.String str14 = commandLine0.getOptionValue('\000', "hi!");
        java.util.List list15 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options4 = null;
        org.apache.commons.cli.CommandLine commandLine5 = new org.apache.commons.cli.CommandLine();
        java.util.List list6 = commandLine5.getArgList();
        java.lang.String[] strArray7 = commandLine5.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = posixParser0.parse(options4, strArray7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.String str8 = commandLine0.getOptionValue("", "org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.cli.MissingArgumentException: " + "'", str8, "org.apache.commons.cli.MissingArgumentException: ");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("org.apache.commons.cli.UnrecognizedOptionException: ");
        java.util.Iterator iterator6 = commandLine0.iterator();
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(optionArray9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("org.apache.commons.cli.UnrecognizedOptionException: ");
        java.util.Iterator iterator6 = commandLine0.iterator();
        java.lang.String[] strArray8 = commandLine0.getOptionValues("org.apache.commons.cli.MissingArgumentException: ");
        java.lang.String str10 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("org.apache.commons.cli.UnrecognizedOptionException: ");
        java.util.Iterator iterator6 = commandLine0.iterator();
        java.util.Iterator iterator7 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str9 = commandLine0.getOptionValue('\000', "org.apache.commons.cli.MissingArgumentException: hi!");
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", false, "hi!");
        option13.setArgs(1);
        option13.setArgName("");
        boolean boolean18 = option13.hasLongOpt();
        option13.addValue("hi!");
        option13.setArgName("");
        commandLine0.addOption(option13);
        java.lang.Object obj25 = commandLine0.getOptionObject("org.apache.commons.cli.UnrecognizedOptionException: ");
        java.lang.String str27 = commandLine0.getOptionValue("arg");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.cli.MissingArgumentException: hi!" + "'", str9, "org.apache.commons.cli.MissingArgumentException: hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str9 = commandLine0.getOptionValue('\000', "org.apache.commons.cli.MissingArgumentException: hi!");
        java.lang.String str12 = commandLine0.getOptionValue("org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.UnrecognizedOptionException: ", "org.apache.commons.cli.UnrecognizedOptionException: ");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.cli.MissingArgumentException: hi!" + "'", str9, "org.apache.commons.cli.MissingArgumentException: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: " + "'", str12, "org.apache.commons.cli.UnrecognizedOptionException: ");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("arg");
        java.lang.String str11 = commandLine0.getOptionValue('a', "org.apache.commons.cli.UnrecognizedOptionException: ");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: " + "'", str11, "org.apache.commons.cli.UnrecognizedOptionException: ");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('\000');
        java.lang.String str12 = commandLine0.getOptionValue("", "org.apache.commons.cli.UnrecognizedOptionException: ");
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.Object obj15 = commandLine0.getOptionObject("org.apache.commons.cli.MissingOptionException: hi!");
        boolean boolean17 = commandLine0.hasOption("org.apache.commons.cli.MissingArgumentException: [ option:   :: hi! ]");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: " + "'", str12, "org.apache.commons.cli.UnrecognizedOptionException: ");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("org.apache.commons.cli.MissingOptionException: hi!");
        boolean boolean4 = commandLine0.hasOption("[ option:   :: hi! ]");
        java.lang.String[] strArray6 = commandLine0.getOptionValues('\000');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        commandLine0.addArg("org.apache.commons.cli.MissingArgumentException: [ option:   :: hi! ]");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('\000');
        commandLine0.addArg("");
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.String str14 = commandLine0.getOptionValue("org.apache.commons.cli.MissingArgumentException: hi!");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('\000');
        commandLine0.addArg("");
        java.lang.String str14 = commandLine0.getOptionValue('\000', "hi!");
        java.lang.String str16 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str9 = commandLine0.getOptionValue('\000', "org.apache.commons.cli.MissingArgumentException: hi!");
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String str15 = commandLine0.getOptionValue("org.apache.commons.cli.MissingArgumentException: ", "org.apache.commons.cli.MissingArgumentException: ");
        java.lang.String str18 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.cli.MissingArgumentException: hi!" + "'", str9, "org.apache.commons.cli.MissingArgumentException: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.cli.MissingOptionException: hi!" + "'", str12, "org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.cli.MissingArgumentException: " + "'", str15, "org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray5 = null;
        org.apache.commons.cli.CommandLine commandLine7 = posixParser0.parse(options4, strArray5, false);
        boolean boolean9 = options4.hasOption("");
        org.junit.Assert.assertNotNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("org.apache.commons.cli.MissingArgumentException: hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject('#');
        java.lang.String str17 = commandLine0.getOptionValue("org.apache.commons.cli.MissingArgumentException: hi!", "");
        commandLine0.addArg("org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("org.apache.commons.cli.MissingArgumentException: hi!");
        java.lang.String[] strArray14 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray16 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.util.List list7 = commandLine0.getArgList();
        boolean boolean9 = commandLine0.hasOption("[ option:   :: hi! ]");
        java.lang.String[] strArray10 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("arg");
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        boolean boolean12 = commandLine0.hasOption("org.apache.commons.cli.MissingOptionException: ");
        java.util.List list13 = commandLine0.getArgList();
        commandLine0.addArg("org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        java.util.List list9 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", false, "hi!");
        option22.setArgs(1);
        option22.setArgName("");
        boolean boolean27 = option22.hasLongOpt();
        option22.addValue("hi!");
        java.lang.String[] strArray30 = option22.getValues();
        java.lang.String[] strArray32 = posixParser17.flatten(options18, strArray30, true);
        java.lang.String[] strArray34 = posixParser0.flatten(options16, strArray30, false);
        org.apache.commons.cli.Options options35 = null;
        org.apache.commons.cli.PosixParser posixParser36 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options37 = null;
        org.apache.commons.cli.Option option41 = new org.apache.commons.cli.Option("", false, "hi!");
        option41.setArgs(1);
        option41.setArgName("");
        boolean boolean46 = option41.hasLongOpt();
        option41.addValue("hi!");
        java.lang.String[] strArray49 = option41.getValues();
        java.lang.String[] strArray51 = posixParser36.flatten(options37, strArray49, true);
        java.lang.String[] strArray53 = posixParser0.flatten(options35, strArray51, true);
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        java.util.Collection collection55 = options54.getOptionGroups();
        org.apache.commons.cli.PosixParser posixParser56 = new org.apache.commons.cli.PosixParser();
        posixParser56.burstToken("", false);
        org.apache.commons.cli.Options options60 = null;
        org.apache.commons.cli.CommandLine commandLine61 = new org.apache.commons.cli.CommandLine();
        java.util.List list62 = commandLine61.getArgList();
        java.lang.String[] strArray63 = commandLine61.getArgs();
        java.lang.String[] strArray65 = posixParser56.flatten(options60, strArray63, true);
        java.lang.String[] strArray67 = posixParser0.flatten(options54, strArray65, false);
        org.apache.commons.cli.Option option71 = new org.apache.commons.cli.Option("", false, "hi!");
        option71.setArgs(1);
        option71.setArgName("");
        option71.setLongOpt("");
        boolean boolean78 = option71.isRequired();
        java.lang.String str79 = option71.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup80 = options54.getOptionGroup(option71);
        java.util.Collection collection81 = options54.getOptionGroups();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNull(optionGroup80);
        org.junit.Assert.assertNotNull(collection81);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String str10 = commandLine0.getOptionValue('#', "arg");
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("", false, "hi!");
        option14.setArgs(1);
        int int17 = option14.getArgs();
        commandLine0.addOption(option14);
        java.lang.String[] strArray20 = commandLine0.getOptionValues('\000');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(strArray20);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.Object obj3 = commandLine0.getOptionObject("arg");
        org.apache.commons.cli.Option option5 = org.apache.commons.cli.OptionBuilder.create("arg");
        commandLine0.addOption(option5);
        java.lang.Object obj8 = commandLine0.getOptionObject("org.apache.commons.cli.ParseException: ");
        java.lang.Object obj10 = commandLine0.getOptionObject('4');
        java.util.Iterator iterator11 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(option5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        commandLine0.addArg("org.apache.commons.cli.MissingOptionException: ");
        java.lang.String str12 = commandLine0.getOptionValue('4', "hi!");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("arg");
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        boolean boolean12 = commandLine0.hasOption("org.apache.commons.cli.MissingOptionException: ");
        java.lang.String[] strArray13 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.util.List list7 = commandLine0.getArgList();
        boolean boolean9 = commandLine0.hasOption("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues('\000');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String str10 = commandLine0.getOptionValue('#', "arg");
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("", false, "hi!");
        option14.setArgs(1);
        int int17 = option14.getArgs();
        commandLine0.addOption(option14);
        java.lang.String str20 = commandLine0.getOptionValue("org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.UnrecognizedOptionException: ");
        java.util.Iterator iterator21 = commandLine0.iterator();
        java.util.List list22 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("[ option:   :: hi! ]");
        java.lang.String str11 = commandLine0.getOptionValue('4', "org.apache.commons.cli.UnrecognizedOptionException: ");
        java.lang.String str13 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: " + "'", str11, "org.apache.commons.cli.UnrecognizedOptionException: ");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.List list17 = options16.helpOptions();
        java.util.List list18 = options16.getRequiredOptions();
        boolean boolean20 = options16.hasOption("");
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = null;
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", false, "hi!");
        option26.setArgs(1);
        option26.setArgName("");
        boolean boolean31 = option26.hasLongOpt();
        option26.addValue("hi!");
        java.lang.String[] strArray34 = option26.getValues();
        java.lang.String[] strArray36 = posixParser21.flatten(options22, strArray34, true);
        org.apache.commons.cli.Options options37 = null;
        org.apache.commons.cli.PosixParser posixParser38 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options39 = null;
        org.apache.commons.cli.Option option43 = new org.apache.commons.cli.Option("", false, "hi!");
        option43.setArgs(1);
        option43.setArgName("");
        boolean boolean48 = option43.hasLongOpt();
        option43.addValue("hi!");
        java.lang.String[] strArray51 = option43.getValues();
        java.lang.String[] strArray53 = posixParser38.flatten(options39, strArray51, true);
        java.lang.String[] strArray55 = posixParser21.flatten(options37, strArray51, false);
        org.apache.commons.cli.CommandLine commandLine57 = posixParser0.parse(options16, strArray55, true);
        org.apache.commons.cli.Option option61 = new org.apache.commons.cli.Option("", true, "hi!");
        java.lang.String str62 = option61.getOpt();
        java.util.ListIterator listIterator63 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option61, listIterator63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(commandLine57);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", false, "hi!");
        option11.setArgs(1);
        option11.setArgName("");
        boolean boolean16 = option11.hasLongOpt();
        option11.addValue("hi!");
        java.lang.String str19 = option11.getOpt();
        commandLine0.addOption(option11);
        option11.setLongOpt("org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", false, "hi!");
        option22.setArgs(1);
        option22.setArgName("");
        boolean boolean27 = option22.hasLongOpt();
        option22.addValue("hi!");
        java.lang.String[] strArray30 = option22.getValues();
        java.lang.String[] strArray32 = posixParser17.flatten(options18, strArray30, true);
        java.lang.String[] strArray34 = posixParser0.flatten(options16, strArray30, false);
        org.apache.commons.cli.Options options35 = null;
        org.apache.commons.cli.PosixParser posixParser36 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options37 = null;
        org.apache.commons.cli.Option option41 = new org.apache.commons.cli.Option("", false, "hi!");
        option41.setArgs(1);
        option41.setArgName("");
        boolean boolean46 = option41.hasLongOpt();
        option41.addValue("hi!");
        java.lang.String[] strArray49 = option41.getValues();
        java.lang.String[] strArray51 = posixParser36.flatten(options37, strArray49, true);
        java.lang.String[] strArray53 = posixParser0.flatten(options35, strArray51, true);
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        java.util.Collection collection55 = options54.getOptionGroups();
        org.apache.commons.cli.PosixParser posixParser56 = new org.apache.commons.cli.PosixParser();
        posixParser56.burstToken("", false);
        org.apache.commons.cli.Options options60 = null;
        org.apache.commons.cli.CommandLine commandLine61 = new org.apache.commons.cli.CommandLine();
        java.util.List list62 = commandLine61.getArgList();
        java.lang.String[] strArray63 = commandLine61.getArgs();
        java.lang.String[] strArray65 = posixParser56.flatten(options60, strArray63, true);
        java.lang.String[] strArray67 = posixParser0.flatten(options54, strArray65, false);
        org.apache.commons.cli.Option option71 = new org.apache.commons.cli.Option("", false, "hi!");
        option71.setArgs(1);
        option71.setArgName("");
        option71.setLongOpt("");
        boolean boolean78 = option71.isRequired();
        java.lang.String str79 = option71.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup80 = options54.getOptionGroup(option71);
        boolean boolean82 = options54.hasOption("org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.UnrecognizedOptionException: ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNull(optionGroup80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        commandLine0.addArg("org.apache.commons.cli.MissingOptionException: ");
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        java.lang.String str14 = commandLine0.getOptionValue('a', "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str14, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("arg");
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        boolean boolean12 = commandLine0.hasOption("org.apache.commons.cli.MissingOptionException: ");
        java.lang.Object obj14 = commandLine0.getOptionObject("org.apache.commons.cli.MissingArgumentException: hi!");
        java.lang.Object obj16 = commandLine0.getOptionObject('#');
        org.apache.commons.cli.Option option17 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.Object obj4 = commandLine0.getOptionObject("");
        java.lang.Object obj6 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.Object obj3 = commandLine0.getOptionObject("arg");
        org.apache.commons.cli.Option option5 = org.apache.commons.cli.OptionBuilder.create("");
        org.apache.commons.cli.PosixParser posixParser6 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options7 = null;
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", false, "hi!");
        option11.setArgs(1);
        option11.setArgName("");
        boolean boolean16 = option11.hasLongOpt();
        option11.addValue("hi!");
        java.lang.String[] strArray19 = option11.getValues();
        java.lang.String[] strArray21 = posixParser6.flatten(options7, strArray19, true);
        org.apache.commons.cli.Options options22 = null;
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", false, "hi!");
        option28.setArgs(1);
        option28.setArgName("");
        boolean boolean33 = option28.hasLongOpt();
        option28.addValue("hi!");
        java.lang.String[] strArray36 = option28.getValues();
        java.lang.String[] strArray38 = posixParser23.flatten(options24, strArray36, true);
        java.lang.String[] strArray40 = posixParser6.flatten(options22, strArray36, true);
        option5.setType((java.lang.Object) strArray36);
        commandLine0.addOption(option5);
        java.util.Iterator iterator43 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(option5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(iterator43);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("arg");
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        boolean boolean12 = commandLine0.hasOption("org.apache.commons.cli.MissingOptionException: ");
        java.lang.Object obj14 = commandLine0.getOptionObject("org.apache.commons.cli.MissingArgumentException: hi!");
        boolean boolean16 = commandLine0.hasOption("org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("arg");
        java.lang.String str11 = commandLine0.getOptionValue('a', "org.apache.commons.cli.MissingOptionException: ");
        commandLine0.addArg("org.apache.commons.cli.MissingArgumentException: ");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.cli.MissingOptionException: " + "'", str11, "org.apache.commons.cli.MissingOptionException: ");
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", false, "hi!");
        option22.setArgs(1);
        option22.setArgName("");
        boolean boolean27 = option22.hasLongOpt();
        option22.addValue("hi!");
        java.lang.String[] strArray30 = option22.getValues();
        java.lang.String[] strArray32 = posixParser17.flatten(options18, strArray30, true);
        java.lang.String[] strArray34 = posixParser0.flatten(options16, strArray30, true);
        org.apache.commons.cli.Options options35 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option39 = new org.apache.commons.cli.Option("", false, "hi!");
        option39.setArgs(1);
        option39.setArgName("");
        boolean boolean44 = option39.hasLongOpt();
        option39.addValue("hi!");
        java.lang.String str47 = option39.getOpt();
        int int48 = option39.getArgs();
        char char49 = option39.getValueSeparator();
        boolean boolean50 = option39.hasValueSeparator();
        boolean boolean51 = option39.hasArgs();
        option39.setArgName("hi!");
        int int54 = option39.getArgs();
        org.apache.commons.cli.Options options55 = options35.addOption(option39);
        java.lang.String str56 = options55.toString();
        org.apache.commons.cli.PosixParser posixParser57 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options58 = null;
        org.apache.commons.cli.Option option62 = new org.apache.commons.cli.Option("", false, "hi!");
        option62.setArgs(1);
        option62.setArgName("");
        boolean boolean67 = option62.hasLongOpt();
        option62.addValue("hi!");
        java.lang.String[] strArray70 = option62.getValues();
        java.lang.String[] strArray72 = posixParser57.flatten(options58, strArray70, true);
        org.apache.commons.cli.Options options73 = null;
        java.lang.String[] strArray78 = new java.lang.String[] { "[ option:   :: hi! ]", "org.apache.commons.cli.UnrecognizedOptionException: ", "org.apache.commons.cli.UnrecognizedOptionException: ", "org.apache.commons.cli.ParseException: " };
        java.lang.String[] strArray80 = posixParser57.flatten(options73, strArray78, false);
        java.lang.String[] strArray82 = posixParser0.flatten(options55, strArray78, false);
        org.apache.commons.cli.Options options83 = null;
        org.apache.commons.cli.PosixParser posixParser84 = new org.apache.commons.cli.PosixParser();
        posixParser84.burstToken("", false);
        org.apache.commons.cli.Options options88 = null;
        org.apache.commons.cli.CommandLine commandLine89 = new org.apache.commons.cli.CommandLine();
        java.util.List list90 = commandLine89.getArgList();
        java.lang.String[] strArray91 = commandLine89.getArgs();
        java.lang.String[] strArray93 = posixParser84.flatten(options88, strArray91, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine95 = posixParser0.parse(options83, strArray91, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + char49 + "' != '" + '\000' + "'", char49 == '\000');
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(options55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]" + "'", str56, "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(list90);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertNotNull(strArray93);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.util.List list7 = commandLine0.getArgList();
        boolean boolean9 = commandLine0.hasOption("[ option:   :: hi! ]");
        java.lang.Object obj11 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass3 = optionArray2.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.List list17 = options16.helpOptions();
        java.util.List list18 = options16.getRequiredOptions();
        boolean boolean20 = options16.hasOption("");
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = null;
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", false, "hi!");
        option26.setArgs(1);
        option26.setArgName("");
        boolean boolean31 = option26.hasLongOpt();
        option26.addValue("hi!");
        java.lang.String[] strArray34 = option26.getValues();
        java.lang.String[] strArray36 = posixParser21.flatten(options22, strArray34, true);
        org.apache.commons.cli.Options options37 = null;
        org.apache.commons.cli.PosixParser posixParser38 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options39 = null;
        org.apache.commons.cli.Option option43 = new org.apache.commons.cli.Option("", false, "hi!");
        option43.setArgs(1);
        option43.setArgName("");
        boolean boolean48 = option43.hasLongOpt();
        option43.addValue("hi!");
        java.lang.String[] strArray51 = option43.getValues();
        java.lang.String[] strArray53 = posixParser38.flatten(options39, strArray51, true);
        java.lang.String[] strArray55 = posixParser21.flatten(options37, strArray51, false);
        org.apache.commons.cli.CommandLine commandLine57 = posixParser0.parse(options16, strArray55, true);
        org.apache.commons.cli.Options options58 = null;
        org.apache.commons.cli.CommandLine commandLine59 = new org.apache.commons.cli.CommandLine();
        java.util.List list60 = commandLine59.getArgList();
        java.lang.String[] strArray62 = commandLine59.getOptionValues(' ');
        java.lang.String[] strArray64 = commandLine59.getOptionValues("arg");
        java.lang.Object obj66 = commandLine59.getOptionObject('a');
        boolean boolean68 = commandLine59.hasOption('\000');
        commandLine59.addArg("");
        java.lang.String str73 = commandLine59.getOptionValue('\000', "hi!");
        java.lang.String[] strArray74 = commandLine59.getArgs();
        java.util.Properties properties75 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine77 = posixParser0.parse(options58, strArray74, properties75, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(commandLine57);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNull(strArray62);
        org.junit.Assert.assertNull(strArray64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertNotNull(strArray74);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.String str10 = commandLine0.getOptionValue("org.apache.commons.cli.ParseException: arg");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("arg");
        java.lang.String str14 = commandLine0.getOptionValue('\000');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("org.apache.commons.cli.MissingArgumentException: hi!");
        java.lang.String[] strArray14 = commandLine0.getOptionValues('a');
        boolean boolean16 = commandLine0.hasOption("org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.UnrecognizedOptionException: ");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.util.List list7 = commandLine0.getArgList();
        java.lang.String[] strArray9 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("arg");
        java.lang.String str10 = commandLine0.getOptionValue("org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.UnrecognizedOptionException: ");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("", "org.apache.commons.cli.UnrecognizedOptionException: ");
        org.apache.commons.cli.CommandLine commandLine3 = new org.apache.commons.cli.CommandLine();
        java.util.List list4 = commandLine3.getArgList();
        java.lang.String[] strArray6 = commandLine3.getOptionValues(' ');
        java.lang.String str9 = commandLine3.getOptionValue('#', "");
        java.lang.String str12 = commandLine3.getOptionValue('\000', "org.apache.commons.cli.MissingArgumentException: hi!");
        org.apache.commons.cli.Option option16 = new org.apache.commons.cli.Option("", false, "hi!");
        option16.setArgs(1);
        option16.setArgName("");
        boolean boolean21 = option16.hasLongOpt();
        option16.addValue("hi!");
        option16.setArgName("");
        commandLine3.addOption(option16);
        commandLine3.addArg("org.apache.commons.cli.MissingOptionException: ");
        org.apache.commons.cli.Option[] optionArray29 = commandLine3.getOptions();
        boolean boolean30 = option2.equals((java.lang.Object) commandLine3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.cli.MissingArgumentException: hi!" + "'", str12, "org.apache.commons.cli.MissingArgumentException: hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(optionArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray9 = commandLine0.getArgs();
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", false, "hi!");
        option13.setArgs(1);
        option13.setArgName("");
        boolean boolean18 = option13.hasLongOpt();
        option13.addValue("hi!");
        option13.setArgName("");
        java.lang.String str23 = option13.toString();
        option13.setArgName("hi!");
        commandLine0.addOption(option13);
        java.lang.Object obj28 = commandLine0.getOptionObject("[ option:    :: hi! ]");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[ option:   :: hi! ]" + "'", str23, "[ option:   :: hi! ]");
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", false, "hi!");
        option20.setArgs(1);
        option20.setArgName("");
        boolean boolean25 = option20.hasLongOpt();
        option20.addValue("hi!");
        java.lang.String str28 = option20.getOpt();
        int int29 = option20.getArgs();
        char char30 = option20.getValueSeparator();
        boolean boolean31 = option20.hasValueSeparator();
        boolean boolean32 = option20.hasArgs();
        option20.setArgName("hi!");
        int int35 = option20.getArgs();
        org.apache.commons.cli.Options options36 = options16.addOption(option20);
        java.util.Collection collection37 = options36.getOptionGroups();
        java.util.List list38 = options36.helpOptions();
        org.apache.commons.cli.Option option42 = new org.apache.commons.cli.Option("", false, "hi!");
        option42.setArgs(1);
        option42.setArgName("");
        boolean boolean47 = option42.hasLongOpt();
        option42.addValue("hi!");
        java.lang.String str50 = option42.getOpt();
        int int51 = option42.getArgs();
        java.lang.String str52 = option42.getArgName();
        char char53 = option42.getValueSeparator();
        org.apache.commons.cli.Options options54 = options36.addOption(option42);
        org.apache.commons.cli.PosixParser posixParser55 = new org.apache.commons.cli.PosixParser();
        posixParser55.burstToken("", false);
        org.apache.commons.cli.Options options59 = null;
        org.apache.commons.cli.CommandLine commandLine60 = new org.apache.commons.cli.CommandLine();
        java.util.List list61 = commandLine60.getArgList();
        java.lang.String[] strArray62 = commandLine60.getArgs();
        java.lang.String[] strArray64 = posixParser55.flatten(options59, strArray62, true);
        java.util.Properties properties65 = null;
        org.apache.commons.cli.CommandLine commandLine66 = posixParser0.parse(options36, strArray62, properties65);
        java.util.List list67 = options36.helpOptions();
        java.util.List list68 = options36.getRequiredOptions();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\000' + "'", char30 == '\000');
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + char53 + "' != '" + '\000' + "'", char53 == '\000');
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(commandLine66);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertNotNull(list68);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("arg");
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        boolean boolean12 = commandLine0.hasOption("org.apache.commons.cli.MissingOptionException: ");
        java.lang.Object obj14 = commandLine0.getOptionObject("org.apache.commons.cli.MissingArgumentException: [ option:   :: hi! ]");
        java.lang.Object obj16 = commandLine0.getOptionObject("org.apache.commons.cli.ParseException: arg");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.Object obj3 = commandLine0.getOptionObject("arg");
        org.apache.commons.cli.Option option5 = org.apache.commons.cli.OptionBuilder.create("arg");
        commandLine0.addOption(option5);
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(option5);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('\000');
        java.lang.String str12 = commandLine0.getOptionValue("", "org.apache.commons.cli.UnrecognizedOptionException: ");
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.Object obj15 = commandLine0.getOptionObject("org.apache.commons.cli.MissingOptionException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = obj15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: " + "'", str12, "org.apache.commons.cli.UnrecognizedOptionException: ");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('\000');
        commandLine0.addArg("");
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.String str15 = commandLine0.getOptionValue('\000', "");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", false, "hi!");
        option8.setArgs(1);
        option8.setArgName("");
        boolean boolean13 = option8.hasLongOpt();
        option8.addValue("hi!");
        java.lang.String str16 = option8.getOpt();
        int int17 = option8.getArgs();
        char char18 = option8.getValueSeparator();
        boolean boolean19 = option8.hasValueSeparator();
        boolean boolean20 = option8.hasArgs();
        option8.setArgName("hi!");
        int int23 = option8.getArgs();
        org.apache.commons.cli.Options options24 = options4.addOption(option8);
        java.lang.String str25 = options24.toString();
        org.apache.commons.cli.Option option29 = new org.apache.commons.cli.Option("", false, "hi!");
        option29.setArgs(1);
        option29.setArgName("");
        int int34 = option29.getArgs();
        option29.setArgs((int) (byte) 10);
        java.lang.String str38 = option29.getValue("hi!");
        option29.setArgName("org.apache.commons.cli.MissingArgumentException: hi!");
        org.apache.commons.cli.Options options41 = options24.addOption(option29);
        org.apache.commons.cli.Option option45 = new org.apache.commons.cli.Option("", false, "hi!");
        option45.setArgs(1);
        option45.setArgName("");
        boolean boolean50 = option45.hasLongOpt();
        option45.addValue("hi!");
        java.lang.String str53 = option45.getOpt();
        int int54 = option45.getArgs();
        java.lang.Object obj55 = option45.getType();
        org.apache.commons.cli.OptionGroup optionGroup56 = options41.getOptionGroup(option45);
        org.apache.commons.cli.Option option58 = options41.getOption("[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]");
        org.apache.commons.cli.CommandLine commandLine59 = new org.apache.commons.cli.CommandLine();
        java.util.List list60 = commandLine59.getArgList();
        java.lang.String[] strArray62 = commandLine59.getOptionValues(' ');
        java.lang.String[] strArray64 = commandLine59.getOptionValues("arg");
        java.lang.Object obj66 = commandLine59.getOptionObject('a');
        java.lang.String[] strArray67 = commandLine59.getArgs();
        org.apache.commons.cli.CommandLine commandLine69 = posixParser0.parse(options41, strArray67, true);
        java.util.List list70 = commandLine69.getArgList();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]" + "'", str25, "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(optionGroup56);
        org.junit.Assert.assertNull(option58);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNull(strArray62);
        org.junit.Assert.assertNull(strArray64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(commandLine69);
        org.junit.Assert.assertNotNull(list70);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str9 = commandLine0.getOptionValue('\000', "org.apache.commons.cli.MissingArgumentException: hi!");
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", false, "hi!");
        option13.setArgs(1);
        option13.setArgName("");
        boolean boolean18 = option13.hasLongOpt();
        option13.addValue("hi!");
        option13.setArgName("");
        commandLine0.addOption(option13);
        commandLine0.addArg("org.apache.commons.cli.MissingOptionException: ");
        java.lang.String[] strArray27 = commandLine0.getOptionValues("org.apache.commons.cli.ParseException: arg");
        java.util.Iterator iterator28 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.cli.MissingArgumentException: hi!" + "'", str9, "org.apache.commons.cli.MissingArgumentException: hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(iterator28);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("org.apache.commons.cli.MissingArgumentException: hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject('#');
        java.lang.String str17 = commandLine0.getOptionValue("org.apache.commons.cli.ParseException: ", "[ option:   :: hi! ]");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option:   :: hi! ]" + "'", str17, "[ option:   :: hi! ]");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", false, "hi!");
        option22.setArgs(1);
        option22.setArgName("");
        boolean boolean27 = option22.hasLongOpt();
        option22.addValue("hi!");
        java.lang.String[] strArray30 = option22.getValues();
        java.lang.String[] strArray32 = posixParser17.flatten(options18, strArray30, true);
        java.lang.String[] strArray34 = posixParser0.flatten(options16, strArray30, true);
        org.apache.commons.cli.Options options35 = null;
        org.apache.commons.cli.PosixParser posixParser36 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options37 = null;
        org.apache.commons.cli.Option option41 = new org.apache.commons.cli.Option("", false, "hi!");
        option41.setArgs(1);
        option41.setArgName("");
        boolean boolean46 = option41.hasLongOpt();
        option41.addValue("hi!");
        java.lang.String[] strArray49 = option41.getValues();
        java.lang.String[] strArray51 = posixParser36.flatten(options37, strArray49, true);
        java.lang.String[] strArray53 = posixParser0.flatten(options35, strArray51, true);
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        java.util.List list55 = options54.helpOptions();
        java.util.Collection collection56 = options54.getOptions();
        org.apache.commons.cli.CommandLine commandLine57 = new org.apache.commons.cli.CommandLine();
        java.util.List list58 = commandLine57.getArgList();
        java.lang.String[] strArray60 = commandLine57.getOptionValues(' ');
        java.lang.String[] strArray62 = commandLine57.getOptionValues("arg");
        java.lang.String[] strArray63 = commandLine57.getArgs();
        org.apache.commons.cli.CommandLine commandLine64 = posixParser0.parse(options54, strArray63);
        org.apache.commons.cli.Option option65 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup66 = options54.getOptionGroup(option65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNull(strArray60);
        org.junit.Assert.assertNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(commandLine64);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray5 = null;
        org.apache.commons.cli.CommandLine commandLine7 = posixParser0.parse(options4, strArray5, false);
        java.util.List list8 = options4.helpOptions();
        org.apache.commons.cli.Option option10 = options4.getOption("org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(commandLine7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(option10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", false, "hi!");
        option20.setArgs(1);
        option20.setArgName("");
        boolean boolean25 = option20.hasLongOpt();
        option20.addValue("hi!");
        java.lang.String str28 = option20.getOpt();
        int int29 = option20.getArgs();
        char char30 = option20.getValueSeparator();
        boolean boolean31 = option20.hasValueSeparator();
        boolean boolean32 = option20.hasArgs();
        option20.setArgName("hi!");
        int int35 = option20.getArgs();
        org.apache.commons.cli.Options options36 = options16.addOption(option20);
        java.lang.String str37 = options36.toString();
        org.apache.commons.cli.Option option39 = options36.getOption("org.apache.commons.cli.MissingArgumentException: ");
        java.util.List list40 = options36.getRequiredOptions();
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        posixParser41.burstToken("", false);
        org.apache.commons.cli.Options options45 = null;
        org.apache.commons.cli.CommandLine commandLine46 = new org.apache.commons.cli.CommandLine();
        java.util.List list47 = commandLine46.getArgList();
        java.lang.String[] strArray48 = commandLine46.getArgs();
        java.lang.String[] strArray50 = posixParser41.flatten(options45, strArray48, true);
        org.apache.commons.cli.CommandLine commandLine51 = posixParser0.parse(options36, strArray50);
        java.lang.Class<?> wildcardClass52 = options36.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\000' + "'", char30 == '\000');
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]" + "'", str37, "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]");
        org.junit.Assert.assertNull(option39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(commandLine51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("org.apache.commons.cli.MissingArgumentException: hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray16 = commandLine0.getOptionValues(' ');
        java.lang.String str18 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("org.apache.commons.cli.MissingArgumentException: hi!");
        java.util.Iterator iterator13 = commandLine0.iterator();
        boolean boolean15 = commandLine0.hasOption('\000');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str9 = commandLine0.getOptionValue('\000', "org.apache.commons.cli.MissingArgumentException: hi!");
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", false, "hi!");
        option13.setArgs(1);
        option13.setArgName("");
        boolean boolean18 = option13.hasLongOpt();
        option13.addValue("hi!");
        option13.setArgName("");
        commandLine0.addOption(option13);
        commandLine0.addArg("org.apache.commons.cli.MissingOptionException: ");
        java.util.List list26 = commandLine0.getArgList();
        java.util.Iterator iterator27 = commandLine0.iterator();
        java.lang.String[] strArray28 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.cli.MissingArgumentException: hi!" + "'", str9, "org.apache.commons.cli.MissingArgumentException: hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.util.List list7 = commandLine0.getArgList();
        boolean boolean9 = commandLine0.hasOption("");
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.String[] strArray13 = commandLine0.getOptionValues("org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('\000');
        commandLine0.addArg("");
        java.lang.String str14 = commandLine0.getOptionValue('\000', "hi!");
        java.lang.String[] strArray15 = commandLine0.getArgs();
        boolean boolean17 = commandLine0.hasOption('4');
        java.lang.String[] strArray19 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String str10 = commandLine0.getOptionValue('#', "arg");
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("", false, "hi!");
        option14.setArgs(1);
        int int17 = option14.getArgs();
        commandLine0.addOption(option14);
        java.lang.String str20 = commandLine0.getOptionValue('#');
        java.lang.Object obj22 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("arg");
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        commandLine0.addArg("arg");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("[ option:   :: hi! ]");
        java.lang.String str11 = commandLine0.getOptionValue('4', "org.apache.commons.cli.ParseException: arg");
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.String str15 = commandLine0.getOptionValue("org.apache.commons.cli.MissingArgumentException: ", "[ option:   :: hi! ]");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.cli.ParseException: arg" + "'", str11, "org.apache.commons.cli.ParseException: arg");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:   :: hi! ]" + "'", str15, "[ option:   :: hi! ]");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String str10 = commandLine0.getOptionValue('#', "arg");
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("", false, "hi!");
        option14.setArgs(1);
        int int17 = option14.getArgs();
        commandLine0.addOption(option14);
        java.lang.String str20 = commandLine0.getOptionValue('#');
        boolean boolean22 = commandLine0.hasOption("org.apache.commons.cli.MissingArgumentException: ");
        boolean boolean24 = commandLine0.hasOption("org.apache.commons.cli.MissingArgumentException: ");
        org.apache.commons.cli.Option[] optionArray25 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(optionArray25);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("[ option:   :: hi! ]");
        java.lang.String str11 = commandLine0.getOptionValue('4', "org.apache.commons.cli.UnrecognizedOptionException: ");
        java.util.List list12 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: " + "'", str11, "org.apache.commons.cli.UnrecognizedOptionException: ");
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", false, "hi!");
        option20.setArgs(1);
        option20.setArgName("");
        boolean boolean25 = option20.hasLongOpt();
        option20.addValue("hi!");
        java.lang.String str28 = option20.getOpt();
        int int29 = option20.getArgs();
        char char30 = option20.getValueSeparator();
        boolean boolean31 = option20.hasValueSeparator();
        boolean boolean32 = option20.hasArgs();
        option20.setArgName("hi!");
        int int35 = option20.getArgs();
        org.apache.commons.cli.Options options36 = options16.addOption(option20);
        java.util.Collection collection37 = options36.getOptionGroups();
        java.util.List list38 = options36.helpOptions();
        org.apache.commons.cli.Option option42 = new org.apache.commons.cli.Option("", false, "hi!");
        option42.setArgs(1);
        option42.setArgName("");
        boolean boolean47 = option42.hasLongOpt();
        option42.addValue("hi!");
        java.lang.String str50 = option42.getOpt();
        int int51 = option42.getArgs();
        java.lang.String str52 = option42.getArgName();
        char char53 = option42.getValueSeparator();
        org.apache.commons.cli.Options options54 = options36.addOption(option42);
        org.apache.commons.cli.PosixParser posixParser55 = new org.apache.commons.cli.PosixParser();
        posixParser55.burstToken("", false);
        org.apache.commons.cli.Options options59 = null;
        org.apache.commons.cli.CommandLine commandLine60 = new org.apache.commons.cli.CommandLine();
        java.util.List list61 = commandLine60.getArgList();
        java.lang.String[] strArray62 = commandLine60.getArgs();
        java.lang.String[] strArray64 = posixParser55.flatten(options59, strArray62, true);
        java.util.Properties properties65 = null;
        org.apache.commons.cli.CommandLine commandLine66 = posixParser0.parse(options36, strArray62, properties65);
        org.apache.commons.cli.Option option70 = new org.apache.commons.cli.Option("", false, "hi!");
        option70.setArgs(1);
        option70.setArgName("");
        boolean boolean75 = option70.hasLongOpt();
        option70.addValue("hi!");
        java.lang.String str78 = option70.getOpt();
        int int79 = option70.getArgs();
        java.lang.String str80 = option70.getArgName();
        java.util.List list81 = option70.getValuesList();
        option70.setOptionalArg(false);
        boolean boolean84 = option70.isRequired();
        java.util.ListIterator listIterator85 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option70, listIterator85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\000' + "'", char30 == '\000');
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + char53 + "' != '" + '\000' + "'", char53 == '\000');
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(commandLine66);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(list81);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        commandLine0.addArg("org.apache.commons.cli.MissingOptionException: ");
        java.lang.Object obj11 = commandLine0.getOptionObject("org.apache.commons.cli.MissingArgumentException: hi!");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", false, "hi!");
        option8.setArgs(1);
        option8.setArgName("");
        boolean boolean13 = option8.hasLongOpt();
        option8.addValue("hi!");
        java.lang.String str16 = option8.getOpt();
        int int17 = option8.getArgs();
        char char18 = option8.getValueSeparator();
        boolean boolean19 = option8.hasValueSeparator();
        boolean boolean20 = option8.hasArgs();
        option8.setArgName("hi!");
        int int23 = option8.getArgs();
        org.apache.commons.cli.Options options24 = options4.addOption(option8);
        java.lang.String str25 = options24.toString();
        org.apache.commons.cli.Option option29 = new org.apache.commons.cli.Option("", false, "hi!");
        option29.setArgs(1);
        option29.setArgName("");
        int int34 = option29.getArgs();
        option29.setArgs((int) (byte) 10);
        java.lang.String str38 = option29.getValue("hi!");
        option29.setArgName("org.apache.commons.cli.MissingArgumentException: hi!");
        org.apache.commons.cli.Options options41 = options24.addOption(option29);
        org.apache.commons.cli.Option option45 = new org.apache.commons.cli.Option("", false, "hi!");
        option45.setArgs(1);
        option45.setArgName("");
        boolean boolean50 = option45.hasLongOpt();
        option45.addValue("hi!");
        java.lang.String str53 = option45.getOpt();
        int int54 = option45.getArgs();
        java.lang.Object obj55 = option45.getType();
        org.apache.commons.cli.OptionGroup optionGroup56 = options41.getOptionGroup(option45);
        org.apache.commons.cli.Option option58 = options41.getOption("[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]");
        org.apache.commons.cli.CommandLine commandLine59 = new org.apache.commons.cli.CommandLine();
        java.util.List list60 = commandLine59.getArgList();
        java.lang.String[] strArray62 = commandLine59.getOptionValues(' ');
        java.lang.String[] strArray64 = commandLine59.getOptionValues("arg");
        java.lang.Object obj66 = commandLine59.getOptionObject('a');
        java.lang.String[] strArray67 = commandLine59.getArgs();
        org.apache.commons.cli.CommandLine commandLine69 = posixParser0.parse(options41, strArray67, true);
        java.lang.String str70 = options41.toString();
        org.apache.commons.cli.Options options74 = options41.addOption("", true, "arg");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options78 = options41.addOption("[ option:   :: hi! ]", true, "org.apache.commons.cli.UnrecognizedOptionException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '['");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]" + "'", str25, "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(optionGroup56);
        org.junit.Assert.assertNull(option58);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNull(strArray62);
        org.junit.Assert.assertNull(strArray64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(commandLine69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]" + "'", str70, "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(options74);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String str9 = commandLine0.getOptionValue("org.apache.commons.cli.UnrecognizedOptionException: ");
        java.util.List list10 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String str4 = commandLine0.getOptionValue('4');
        java.lang.String str6 = commandLine0.getOptionValue('a');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray7);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String str9 = commandLine0.getOptionValue("org.apache.commons.cli.UnrecognizedOptionException: ");
        java.lang.String[] strArray11 = commandLine0.getOptionValues('4');
        java.lang.String str13 = commandLine0.getOptionValue("org.apache.commons.cli.MissingArgumentException: hi!");
        java.util.List list14 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", false, "hi!");
        option8.setArgs(1);
        option8.setArgName("");
        boolean boolean13 = option8.hasLongOpt();
        option8.addValue("hi!");
        java.lang.String str16 = option8.getOpt();
        int int17 = option8.getArgs();
        char char18 = option8.getValueSeparator();
        boolean boolean19 = option8.hasValueSeparator();
        boolean boolean20 = option8.hasArgs();
        option8.setArgName("hi!");
        int int23 = option8.getArgs();
        org.apache.commons.cli.Options options24 = options4.addOption(option8);
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.Option option30 = new org.apache.commons.cli.Option("", false, "hi!");
        option30.setArgs(1);
        option30.setArgName("");
        boolean boolean35 = option30.hasLongOpt();
        option30.addValue("hi!");
        java.lang.String[] strArray38 = option30.getValues();
        java.lang.String[] strArray40 = posixParser25.flatten(options26, strArray38, true);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.Option option47 = new org.apache.commons.cli.Option("", false, "hi!");
        option47.setArgs(1);
        option47.setArgName("");
        boolean boolean52 = option47.hasLongOpt();
        option47.addValue("hi!");
        java.lang.String[] strArray55 = option47.getValues();
        java.lang.String[] strArray57 = posixParser42.flatten(options43, strArray55, true);
        java.lang.String[] strArray59 = posixParser25.flatten(options41, strArray55, true);
        org.apache.commons.cli.Options options60 = null;
        org.apache.commons.cli.PosixParser posixParser61 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options62 = null;
        org.apache.commons.cli.Option option66 = new org.apache.commons.cli.Option("", false, "hi!");
        option66.setArgs(1);
        option66.setArgName("");
        boolean boolean71 = option66.hasLongOpt();
        option66.addValue("hi!");
        java.lang.String[] strArray74 = option66.getValues();
        java.lang.String[] strArray76 = posixParser61.flatten(options62, strArray74, true);
        java.lang.String[] strArray78 = posixParser25.flatten(options60, strArray76, true);
        java.util.Properties properties79 = null;
        org.apache.commons.cli.CommandLine commandLine81 = posixParser0.parse(options24, strArray76, properties79, true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(commandLine81);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String str9 = commandLine0.getOptionValue("org.apache.commons.cli.UnrecognizedOptionException: ");
        java.lang.String str12 = commandLine0.getOptionValue("", "org.apache.commons.cli.ParseException: arg");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.cli.ParseException: arg" + "'", str12, "org.apache.commons.cli.ParseException: arg");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String str10 = commandLine0.getOptionValue('#', "arg");
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("", false, "hi!");
        option14.setArgs(1);
        int int17 = option14.getArgs();
        commandLine0.addOption(option14);
        java.lang.String str20 = commandLine0.getOptionValue('#');
        boolean boolean22 = commandLine0.hasOption("org.apache.commons.cli.MissingArgumentException: ");
        boolean boolean24 = commandLine0.hasOption("org.apache.commons.cli.MissingArgumentException: ");
        boolean boolean26 = commandLine0.hasOption('a');
        java.util.Iterator iterator27 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator27);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("arg");
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        boolean boolean12 = commandLine0.hasOption("org.apache.commons.cli.MissingOptionException: ");
        java.lang.String[] strArray14 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.Object obj3 = commandLine0.getOptionObject("arg");
        org.apache.commons.cli.Option option5 = org.apache.commons.cli.OptionBuilder.create("arg");
        commandLine0.addOption(option5);
        java.util.List list7 = commandLine0.getArgList();
        java.lang.String str10 = commandLine0.getOptionValue("[ option:   :: hi! ]", "org.apache.commons.cli.MissingArgumentException: ");
        boolean boolean12 = commandLine0.hasOption('4');
        java.util.List list13 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(option5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.cli.MissingArgumentException: " + "'", str10, "org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('\000');
        java.lang.String str12 = commandLine0.getOptionValue("", "org.apache.commons.cli.UnrecognizedOptionException: ");
        java.lang.String str14 = commandLine0.getOptionValue("[ option:   :: hi! ]");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: " + "'", str12, "org.apache.commons.cli.UnrecognizedOptionException: ");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray5 = null;
        org.apache.commons.cli.CommandLine commandLine7 = posixParser0.parse(options4, strArray5, false);
        org.apache.commons.cli.Options options8 = null;
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        posixParser9.burstToken("", false);
        org.apache.commons.cli.Options options13 = null;
        org.apache.commons.cli.CommandLine commandLine14 = new org.apache.commons.cli.CommandLine();
        java.util.List list15 = commandLine14.getArgList();
        java.lang.String[] strArray16 = commandLine14.getArgs();
        java.lang.String[] strArray18 = posixParser9.flatten(options13, strArray16, true);
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = posixParser0.parse(options8, strArray16, properties19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(commandLine7);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.util.List list7 = commandLine0.getArgList();
        boolean boolean9 = commandLine0.hasOption("org.apache.commons.cli.MissingArgumentException: [ option:   :: hi! ]");
        commandLine0.addArg("");
        commandLine0.addArg("org.apache.commons.cli.MissingArgumentException: [ option:   :: hi! ]");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", false, "hi!");
        option22.setArgs(1);
        option22.setArgName("");
        boolean boolean27 = option22.hasLongOpt();
        option22.addValue("hi!");
        java.lang.String[] strArray30 = option22.getValues();
        java.lang.String[] strArray32 = posixParser17.flatten(options18, strArray30, true);
        java.lang.String[] strArray34 = posixParser0.flatten(options16, strArray30, false);
        org.apache.commons.cli.Options options35 = null;
        org.apache.commons.cli.PosixParser posixParser36 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options37 = null;
        org.apache.commons.cli.Option option41 = new org.apache.commons.cli.Option("", false, "hi!");
        option41.setArgs(1);
        option41.setArgName("");
        boolean boolean46 = option41.hasLongOpt();
        option41.addValue("hi!");
        java.lang.String[] strArray49 = option41.getValues();
        java.lang.String[] strArray51 = posixParser36.flatten(options37, strArray49, true);
        java.lang.String[] strArray53 = posixParser0.flatten(options35, strArray51, true);
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        java.util.Collection collection55 = options54.getOptionGroups();
        org.apache.commons.cli.PosixParser posixParser56 = new org.apache.commons.cli.PosixParser();
        posixParser56.burstToken("", false);
        org.apache.commons.cli.Options options60 = null;
        org.apache.commons.cli.CommandLine commandLine61 = new org.apache.commons.cli.CommandLine();
        java.util.List list62 = commandLine61.getArgList();
        java.lang.String[] strArray63 = commandLine61.getArgs();
        java.lang.String[] strArray65 = posixParser56.flatten(options60, strArray63, true);
        java.lang.String[] strArray67 = posixParser0.flatten(options54, strArray65, false);
        java.util.Collection collection68 = options54.getOptionGroups();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(collection68);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('\000');
        commandLine0.addArg("");
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.util.List list13 = commandLine0.getArgList();
        java.lang.String[] strArray14 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", false, "hi!");
        option20.setArgs(1);
        option20.setArgName("");
        boolean boolean25 = option20.hasLongOpt();
        option20.addValue("hi!");
        java.lang.String str28 = option20.getOpt();
        int int29 = option20.getArgs();
        char char30 = option20.getValueSeparator();
        boolean boolean31 = option20.hasValueSeparator();
        boolean boolean32 = option20.hasArgs();
        option20.setArgName("hi!");
        int int35 = option20.getArgs();
        org.apache.commons.cli.Options options36 = options16.addOption(option20);
        java.lang.String str37 = options36.toString();
        org.apache.commons.cli.Option option39 = options36.getOption("org.apache.commons.cli.MissingArgumentException: ");
        java.util.List list40 = options36.getRequiredOptions();
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        posixParser41.burstToken("", false);
        org.apache.commons.cli.Options options45 = null;
        org.apache.commons.cli.CommandLine commandLine46 = new org.apache.commons.cli.CommandLine();
        java.util.List list47 = commandLine46.getArgList();
        java.lang.String[] strArray48 = commandLine46.getArgs();
        java.lang.String[] strArray50 = posixParser41.flatten(options45, strArray48, true);
        org.apache.commons.cli.CommandLine commandLine51 = posixParser0.parse(options36, strArray50);
        org.apache.commons.cli.OptionGroup optionGroup52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options53 = options36.addOptionGroup(optionGroup52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\000' + "'", char30 == '\000');
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]" + "'", str37, "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]");
        org.junit.Assert.assertNull(option39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(commandLine51);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray5 = null;
        org.apache.commons.cli.CommandLine commandLine7 = posixParser0.parse(options4, strArray5, false);
        org.apache.commons.cli.PosixParser posixParser8 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options9 = null;
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", false, "hi!");
        option13.setArgs(1);
        option13.setArgName("");
        boolean boolean18 = option13.hasLongOpt();
        option13.addValue("hi!");
        java.lang.String[] strArray21 = option13.getValues();
        java.lang.String[] strArray23 = posixParser8.flatten(options9, strArray21, true);
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.Option option30 = new org.apache.commons.cli.Option("", false, "hi!");
        option30.setArgs(1);
        option30.setArgName("");
        boolean boolean35 = option30.hasLongOpt();
        option30.addValue("hi!");
        java.lang.String[] strArray38 = option30.getValues();
        java.lang.String[] strArray40 = posixParser25.flatten(options26, strArray38, true);
        java.lang.String[] strArray42 = posixParser8.flatten(options24, strArray38, false);
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        org.apache.commons.cli.Option option49 = new org.apache.commons.cli.Option("", false, "hi!");
        option49.setArgs(1);
        option49.setArgName("");
        boolean boolean54 = option49.hasLongOpt();
        option49.addValue("hi!");
        java.lang.String[] strArray57 = option49.getValues();
        java.lang.String[] strArray59 = posixParser44.flatten(options45, strArray57, true);
        java.lang.String[] strArray61 = posixParser8.flatten(options43, strArray59, true);
        org.apache.commons.cli.Options options62 = new org.apache.commons.cli.Options();
        java.util.Collection collection63 = options62.getOptionGroups();
        org.apache.commons.cli.PosixParser posixParser64 = new org.apache.commons.cli.PosixParser();
        posixParser64.burstToken("", false);
        org.apache.commons.cli.Options options68 = null;
        org.apache.commons.cli.CommandLine commandLine69 = new org.apache.commons.cli.CommandLine();
        java.util.List list70 = commandLine69.getArgList();
        java.lang.String[] strArray71 = commandLine69.getArgs();
        java.lang.String[] strArray73 = posixParser64.flatten(options68, strArray71, true);
        java.lang.String[] strArray75 = posixParser8.flatten(options62, strArray73, false);
        org.apache.commons.cli.PosixParser posixParser76 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options77 = null;
        org.apache.commons.cli.Option option81 = new org.apache.commons.cli.Option("", false, "hi!");
        option81.setArgs(1);
        option81.setArgName("");
        boolean boolean86 = option81.hasLongOpt();
        option81.addValue("hi!");
        java.lang.String[] strArray89 = option81.getValues();
        java.lang.String[] strArray91 = posixParser76.flatten(options77, strArray89, true);
        java.util.Properties properties92 = null;
        org.apache.commons.cli.CommandLine commandLine93 = posixParser0.parse(options62, strArray89, properties92);
        java.lang.String[] strArray95 = commandLine93.getOptionValues('4');
        org.junit.Assert.assertNotNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertNotNull(commandLine93);
        org.junit.Assert.assertNull(strArray95);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("arg");
        java.lang.String str11 = commandLine0.getOptionValue('a', "org.apache.commons.cli.MissingOptionException: ");
        org.apache.commons.cli.Option option15 = new org.apache.commons.cli.Option("", false, "hi!");
        int int16 = option15.getArgs();
        java.lang.String str18 = option15.getValue(10);
        java.lang.String str19 = option15.getOpt();
        option15.setArgName("arg");
        commandLine0.addOption(option15);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = option15.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.cli.MissingOptionException: " + "'", str11, "org.apache.commons.cli.MissingOptionException: ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", false, "hi!");
        option22.setArgs(1);
        option22.setArgName("");
        boolean boolean27 = option22.hasLongOpt();
        option22.addValue("hi!");
        java.lang.String[] strArray30 = option22.getValues();
        java.lang.String[] strArray32 = posixParser17.flatten(options18, strArray30, true);
        java.lang.String[] strArray34 = posixParser0.flatten(options16, strArray30, true);
        org.apache.commons.cli.PosixParser posixParser35 = new org.apache.commons.cli.PosixParser();
        posixParser35.burstToken("", false);
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray40 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser35.parse(options39, strArray40, false);
        java.util.List list43 = options39.helpOptions();
        java.util.Collection collection44 = options39.getOptions();
        org.apache.commons.cli.Option option46 = options39.getOption("org.apache.commons.cli.MissingOptionException: ");
        org.apache.commons.cli.PosixParser posixParser47 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options48 = null;
        org.apache.commons.cli.Option option52 = new org.apache.commons.cli.Option("", false, "hi!");
        option52.setArgs(1);
        option52.setArgName("");
        boolean boolean57 = option52.hasLongOpt();
        option52.addValue("hi!");
        java.lang.String[] strArray60 = option52.getValues();
        java.lang.String[] strArray62 = posixParser47.flatten(options48, strArray60, true);
        org.apache.commons.cli.Options options63 = null;
        org.apache.commons.cli.PosixParser posixParser64 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options65 = null;
        org.apache.commons.cli.Option option69 = new org.apache.commons.cli.Option("", false, "hi!");
        option69.setArgs(1);
        option69.setArgName("");
        boolean boolean74 = option69.hasLongOpt();
        option69.addValue("hi!");
        java.lang.String[] strArray77 = option69.getValues();
        java.lang.String[] strArray79 = posixParser64.flatten(options65, strArray77, true);
        java.lang.String[] strArray81 = posixParser47.flatten(options63, strArray77, false);
        org.apache.commons.cli.CommandLine commandLine83 = posixParser0.parse(options39, strArray81, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(option46);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(commandLine83);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('\000');
        commandLine0.addArg("");
        java.lang.String str14 = commandLine0.getOptionValue('\000', "hi!");
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.lang.Object obj17 = commandLine0.getOptionObject('\000');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.Object obj3 = commandLine0.getOptionObject("arg");
        org.apache.commons.cli.Option option5 = org.apache.commons.cli.OptionBuilder.create("arg");
        commandLine0.addOption(option5);
        java.lang.String str8 = option5.getValue((int) (byte) 100);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(option5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.Object obj3 = commandLine0.getOptionObject("arg");
        org.apache.commons.cli.Option option5 = org.apache.commons.cli.OptionBuilder.create("arg");
        commandLine0.addOption(option5);
        java.lang.String[] strArray7 = commandLine0.getArgs();
        java.lang.String str9 = commandLine0.getOptionValue("org.apache.commons.cli.MissingArgumentException: hi!");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(option5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        java.util.List list4 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('\000');
        commandLine0.addArg("");
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.util.List list7 = commandLine0.getArgList();
        java.util.List list8 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("org.apache.commons.cli.MissingArgumentException: hi!");
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.String str15 = commandLine0.getOptionValue("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String str18 = commandLine0.getOptionValue("org.apache.commons.cli.MissingArgumentException: hi!", "org.apache.commons.cli.MissingOptionException: hi!");
        commandLine0.addArg("org.apache.commons.cli.ParseException: ");
        java.lang.String str23 = commandLine0.getOptionValue("[ Options: [ short {=[ option:   :: org.apache.commons.cli.MissingOptionException:  ]} ] [ long {} ]", "");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.cli.MissingOptionException: hi!" + "'", str18, "org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray9 = commandLine0.getArgs();
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", false, "hi!");
        option13.setArgs(1);
        option13.setArgName("");
        boolean boolean18 = option13.hasLongOpt();
        option13.addValue("hi!");
        option13.setArgName("");
        java.lang.String str23 = option13.toString();
        option13.setArgName("hi!");
        commandLine0.addOption(option13);
        boolean boolean28 = commandLine0.hasOption('\000');
        java.lang.Object obj30 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[ option:   :: hi! ]" + "'", str23, "[ option:   :: hi! ]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String str4 = commandLine0.getOptionValue('4');
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.util.List list8 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.util.List list7 = commandLine0.getArgList();
        boolean boolean9 = commandLine0.hasOption("");
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.String str13 = commandLine0.getOptionValue("org.apache.commons.cli.MissingOptionException: ");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("arg");
        java.lang.String str11 = commandLine0.getOptionValue('a', "org.apache.commons.cli.MissingOptionException: ");
        org.apache.commons.cli.Option option15 = new org.apache.commons.cli.Option("", false, "hi!");
        int int16 = option15.getArgs();
        java.lang.String str18 = option15.getValue(10);
        java.lang.String str19 = option15.getOpt();
        option15.setArgName("arg");
        commandLine0.addOption(option15);
        java.lang.String str23 = option15.getArgName();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.cli.MissingOptionException: " + "'", str11, "org.apache.commons.cli.MissingOptionException: ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "arg" + "'", str23, "arg");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("arg");
        boolean boolean10 = commandLine0.hasOption('#');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) posixParser0);
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", false, "hi!");
        option9.setArgs(1);
        option9.setArgName("");
        boolean boolean14 = option9.hasLongOpt();
        option9.addValue("hi!");
        java.lang.String str17 = option9.getOpt();
        int int18 = option9.getArgs();
        char char19 = option9.getValueSeparator();
        boolean boolean20 = option9.hasValueSeparator();
        boolean boolean21 = option9.hasArgs();
        option9.setArgName("hi!");
        int int24 = option9.getArgs();
        org.apache.commons.cli.Options options25 = options5.addOption(option9);
        java.util.Collection collection26 = options25.getOptionGroups();
        java.util.List list27 = options25.helpOptions();
        org.apache.commons.cli.Option option31 = new org.apache.commons.cli.Option("", false, "hi!");
        option31.setArgs(1);
        option31.setArgName("");
        boolean boolean36 = option31.hasLongOpt();
        option31.addValue("hi!");
        java.lang.String str39 = option31.getOpt();
        int int40 = option31.getArgs();
        java.lang.String str41 = option31.getArgName();
        char char42 = option31.getValueSeparator();
        org.apache.commons.cli.Options options43 = options25.addOption(option31);
        org.apache.commons.cli.CommandLine commandLine44 = new org.apache.commons.cli.CommandLine();
        java.util.List list45 = commandLine44.getArgList();
        java.lang.String[] strArray47 = commandLine44.getOptionValues(' ');
        java.lang.String[] strArray49 = commandLine44.getOptionValues("arg");
        java.lang.Object obj51 = commandLine44.getOptionObject('a');
        java.lang.String[] strArray52 = commandLine44.getArgs();
        java.lang.String[] strArray53 = commandLine44.getArgs();
        java.lang.String[] strArray55 = posixParser0.flatten(options25, strArray53, true);
        org.apache.commons.cli.Option option56 = null;
        java.util.ListIterator listIterator57 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option56, listIterator57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + char42 + "' != '" + '\000' + "'", char42 == '\000');
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNull(strArray47);
        org.junit.Assert.assertNull(strArray49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray55);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", false, "hi!");
        option4.setArgs(1);
        option4.setArgName("");
        boolean boolean9 = option4.hasLongOpt();
        option4.addValue("hi!");
        java.lang.String str12 = option4.getOpt();
        int int13 = option4.getArgs();
        char char14 = option4.getValueSeparator();
        boolean boolean15 = option4.hasValueSeparator();
        boolean boolean16 = option4.hasArgs();
        option4.setArgName("hi!");
        int int19 = option4.getArgs();
        org.apache.commons.cli.Options options20 = options0.addOption(option4);
        java.util.Collection collection21 = options20.getOptions();
        org.apache.commons.cli.Option option25 = new org.apache.commons.cli.Option("", false, "hi!");
        option25.setArgs(1);
        option25.setArgName("");
        boolean boolean30 = option25.hasLongOpt();
        option25.addValue("hi!");
        option25.setArgName("");
        java.lang.String str35 = option25.toString();
        option25.setArgName("hi!");
        java.lang.String str38 = option25.getArgName();
        org.apache.commons.cli.CommandLine commandLine39 = new org.apache.commons.cli.CommandLine();
        java.util.List list40 = commandLine39.getArgList();
        java.lang.String[] strArray41 = commandLine39.getArgs();
        org.apache.commons.cli.Option[] optionArray42 = commandLine39.getOptions();
        org.apache.commons.cli.Option[] optionArray43 = commandLine39.getOptions();
        boolean boolean44 = option25.equals((java.lang.Object) optionArray43);
        org.apache.commons.cli.Options options45 = options20.addOption(option25);
        java.lang.String str46 = option25.getValue();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[ option:   :: hi! ]" + "'", str35, "[ option:   :: hi! ]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(optionArray42);
        org.junit.Assert.assertNotNull(optionArray43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", false, "hi!");
        option22.setArgs(1);
        option22.setArgName("");
        boolean boolean27 = option22.hasLongOpt();
        option22.addValue("hi!");
        java.lang.String[] strArray30 = option22.getValues();
        java.lang.String[] strArray32 = posixParser17.flatten(options18, strArray30, true);
        java.lang.String[] strArray34 = posixParser0.flatten(options16, strArray30, true);
        org.apache.commons.cli.Options options35 = null;
        org.apache.commons.cli.PosixParser posixParser36 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options37 = null;
        org.apache.commons.cli.Option option41 = new org.apache.commons.cli.Option("", false, "hi!");
        option41.setArgs(1);
        option41.setArgName("");
        boolean boolean46 = option41.hasLongOpt();
        option41.addValue("hi!");
        java.lang.String[] strArray49 = option41.getValues();
        java.lang.String[] strArray51 = posixParser36.flatten(options37, strArray49, true);
        java.lang.String[] strArray53 = posixParser0.flatten(options35, strArray51, true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.CommandLine commandLine57 = new org.apache.commons.cli.CommandLine();
        java.util.List list58 = commandLine57.getArgList();
        java.lang.String[] strArray60 = commandLine57.getOptionValues(' ');
        java.lang.String[] strArray62 = commandLine57.getOptionValues("arg");
        java.lang.Object obj64 = commandLine57.getOptionObject('a');
        java.lang.String[] strArray65 = commandLine57.getArgs();
        java.lang.String[] strArray66 = commandLine57.getArgs();
        org.apache.commons.cli.Option option70 = new org.apache.commons.cli.Option("", false, "hi!");
        option70.setArgs(1);
        option70.setArgName("");
        boolean boolean75 = option70.hasLongOpt();
        option70.addValue("hi!");
        option70.setArgName("");
        java.lang.String str80 = option70.toString();
        option70.setArgName("hi!");
        commandLine57.addOption(option70);
        java.util.ListIterator listIterator84 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option70, listIterator84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNull(strArray60);
        org.junit.Assert.assertNull(strArray62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "[ option:   :: hi! ]" + "'", str80, "[ option:   :: hi! ]");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.util.List list7 = commandLine0.getArgList();
        boolean boolean9 = commandLine0.hasOption("org.apache.commons.cli.MissingArgumentException: [ option:   :: hi! ]");
        java.lang.String str12 = commandLine0.getOptionValue('a', "[ option:   :: hi! ]");
        boolean boolean14 = commandLine0.hasOption("[ option:   :: hi! ]");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:   :: hi! ]" + "'", str12, "[ option:   :: hi! ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str9 = commandLine0.getOptionValue('\000', "org.apache.commons.cli.MissingArgumentException: hi!");
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String[] strArray14 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.cli.MissingArgumentException: hi!" + "'", str9, "org.apache.commons.cli.MissingArgumentException: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.cli.MissingOptionException: hi!" + "'", str12, "org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('\000');
        java.lang.String str12 = commandLine0.getOptionValue("", "org.apache.commons.cli.UnrecognizedOptionException: ");
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.String[] strArray15 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: " + "'", str12, "org.apache.commons.cli.UnrecognizedOptionException: ");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", false, "hi!");
        option22.setArgs(1);
        option22.setArgName("");
        boolean boolean27 = option22.hasLongOpt();
        option22.addValue("hi!");
        java.lang.String[] strArray30 = option22.getValues();
        java.lang.String[] strArray32 = posixParser17.flatten(options18, strArray30, true);
        java.lang.String[] strArray34 = posixParser0.flatten(options16, strArray30, false);
        org.apache.commons.cli.Options options35 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option39 = new org.apache.commons.cli.Option("", false, "hi!");
        option39.setArgs(1);
        option39.setArgName("");
        boolean boolean44 = option39.hasLongOpt();
        option39.addValue("hi!");
        java.lang.String str47 = option39.getOpt();
        int int48 = option39.getArgs();
        char char49 = option39.getValueSeparator();
        boolean boolean50 = option39.hasValueSeparator();
        boolean boolean51 = option39.hasArgs();
        option39.setArgName("hi!");
        int int54 = option39.getArgs();
        org.apache.commons.cli.Options options55 = options35.addOption(option39);
        java.util.List list56 = options35.helpOptions();
        org.apache.commons.cli.CommandLine commandLine57 = new org.apache.commons.cli.CommandLine();
        java.util.List list58 = commandLine57.getArgList();
        java.lang.String[] strArray60 = commandLine57.getOptionValues(' ');
        java.lang.String str63 = commandLine57.getOptionValue('#', "");
        java.lang.String str65 = commandLine57.getOptionValue("arg");
        java.lang.Object obj67 = commandLine57.getOptionObject('a');
        boolean boolean69 = commandLine57.hasOption("org.apache.commons.cli.MissingOptionException: ");
        java.lang.Object obj71 = commandLine57.getOptionObject("org.apache.commons.cli.MissingArgumentException: hi!");
        java.lang.String[] strArray72 = commandLine57.getArgs();
        java.lang.String[] strArray74 = posixParser0.flatten(options35, strArray72, true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + char49 + "' != '" + '\000' + "'", char49 == '\000');
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(options55);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNull(strArray60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(strArray74);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("arg");
        java.lang.String str11 = commandLine0.getOptionValue('a', "org.apache.commons.cli.MissingOptionException: ");
        commandLine0.addArg("org.apache.commons.cli.MissingArgumentException: ");
        org.apache.commons.cli.Option option17 = new org.apache.commons.cli.Option("", false, "hi!");
        option17.setArgs(1);
        option17.setArgName("");
        boolean boolean22 = option17.hasLongOpt();
        java.lang.Object obj23 = null;
        org.apache.commons.cli.OptionBuilder optionBuilder24 = org.apache.commons.cli.OptionBuilder.withType(obj23);
        option17.setType(obj23);
        boolean boolean26 = option17.hasArgName();
        option17.setOptionalArg(true);
        char char29 = option17.getValueSeparator();
        commandLine0.addOption(option17);
        org.apache.commons.cli.OptionBuilder optionBuilder31 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) option17);
        java.lang.String[] strArray32 = option17.getValues();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.cli.MissingOptionException: " + "'", str11, "org.apache.commons.cli.MissingOptionException: ");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(optionBuilder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
        org.junit.Assert.assertNotNull(optionBuilder31);
        org.junit.Assert.assertNull(strArray32);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) posixParser0);
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", false, "hi!");
        option9.setArgs(1);
        option9.setArgName("");
        boolean boolean14 = option9.hasLongOpt();
        option9.addValue("hi!");
        java.lang.String str17 = option9.getOpt();
        int int18 = option9.getArgs();
        char char19 = option9.getValueSeparator();
        boolean boolean20 = option9.hasValueSeparator();
        boolean boolean21 = option9.hasArgs();
        option9.setArgName("hi!");
        int int24 = option9.getArgs();
        org.apache.commons.cli.Options options25 = options5.addOption(option9);
        java.util.Collection collection26 = options25.getOptionGroups();
        java.util.List list27 = options25.helpOptions();
        org.apache.commons.cli.Option option31 = new org.apache.commons.cli.Option("", false, "hi!");
        option31.setArgs(1);
        option31.setArgName("");
        boolean boolean36 = option31.hasLongOpt();
        option31.addValue("hi!");
        java.lang.String str39 = option31.getOpt();
        int int40 = option31.getArgs();
        java.lang.String str41 = option31.getArgName();
        char char42 = option31.getValueSeparator();
        org.apache.commons.cli.Options options43 = options25.addOption(option31);
        org.apache.commons.cli.CommandLine commandLine44 = new org.apache.commons.cli.CommandLine();
        java.util.List list45 = commandLine44.getArgList();
        java.lang.String[] strArray47 = commandLine44.getOptionValues(' ');
        java.lang.String[] strArray49 = commandLine44.getOptionValues("arg");
        java.lang.Object obj51 = commandLine44.getOptionObject('a');
        java.lang.String[] strArray52 = commandLine44.getArgs();
        java.lang.String[] strArray53 = commandLine44.getArgs();
        java.lang.String[] strArray55 = posixParser0.flatten(options25, strArray53, true);
        org.apache.commons.cli.Options options56 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option60 = new org.apache.commons.cli.Option("", false, "hi!");
        option60.setArgs(1);
        option60.setArgName("");
        boolean boolean65 = option60.hasLongOpt();
        option60.addValue("hi!");
        java.lang.String str68 = option60.getOpt();
        int int69 = option60.getArgs();
        char char70 = option60.getValueSeparator();
        boolean boolean71 = option60.hasValueSeparator();
        boolean boolean72 = option60.hasArgs();
        option60.setArgName("hi!");
        int int75 = option60.getArgs();
        org.apache.commons.cli.Options options76 = options56.addOption(option60);
        org.apache.commons.cli.Options options81 = options56.addOption("", "org.apache.commons.cli.MissingArgumentException: [ option:   :: hi! ]", false, "[ option:    :: hi! ]");
        org.apache.commons.cli.PosixParser posixParser82 = new org.apache.commons.cli.PosixParser();
        posixParser82.burstToken("", false);
        org.apache.commons.cli.Options options86 = null;
        org.apache.commons.cli.CommandLine commandLine87 = new org.apache.commons.cli.CommandLine();
        java.util.List list88 = commandLine87.getArgList();
        java.lang.String[] strArray89 = commandLine87.getArgs();
        java.lang.String[] strArray91 = posixParser82.flatten(options86, strArray89, true);
        org.apache.commons.cli.CommandLine commandLine93 = posixParser0.parse(options56, strArray91, true);
        java.lang.Class<?> wildcardClass94 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + char42 + "' != '" + '\000' + "'", char42 == '\000');
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNull(strArray47);
        org.junit.Assert.assertNull(strArray49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + char70 + "' != '" + '\000' + "'", char70 == '\000');
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(options76);
        org.junit.Assert.assertNotNull(options81);
        org.junit.Assert.assertNotNull(list88);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertNotNull(commandLine93);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.Object obj3 = commandLine0.getOptionObject("arg");
        org.apache.commons.cli.Option option5 = org.apache.commons.cli.OptionBuilder.create("arg");
        commandLine0.addOption(option5);
        java.util.List list7 = commandLine0.getArgList();
        java.lang.String str10 = commandLine0.getOptionValue("[ option:   :: hi! ]", "org.apache.commons.cli.MissingArgumentException: ");
        boolean boolean12 = commandLine0.hasOption('4');
        commandLine0.addArg("org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(option5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.cli.MissingArgumentException: " + "'", str10, "org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String str10 = commandLine0.getOptionValue('#', "arg");
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("", false, "hi!");
        option14.setArgs(1);
        int int17 = option14.getArgs();
        commandLine0.addOption(option14);
        java.lang.String str20 = commandLine0.getOptionValue('#');
        boolean boolean22 = commandLine0.hasOption("org.apache.commons.cli.MissingArgumentException: ");
        java.lang.String[] strArray24 = commandLine0.getOptionValues('\000');
        java.lang.String str26 = commandLine0.getOptionValue('\000');
        java.lang.String str29 = commandLine0.getOptionValue(' ', "org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.MissingOptionException: hi!" + "'", str29, "org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.MissingOptionException: hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.List list17 = options16.helpOptions();
        java.util.List list18 = options16.getRequiredOptions();
        boolean boolean20 = options16.hasOption("");
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = null;
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", false, "hi!");
        option26.setArgs(1);
        option26.setArgName("");
        boolean boolean31 = option26.hasLongOpt();
        option26.addValue("hi!");
        java.lang.String[] strArray34 = option26.getValues();
        java.lang.String[] strArray36 = posixParser21.flatten(options22, strArray34, true);
        org.apache.commons.cli.Options options37 = null;
        org.apache.commons.cli.PosixParser posixParser38 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options39 = null;
        org.apache.commons.cli.Option option43 = new org.apache.commons.cli.Option("", false, "hi!");
        option43.setArgs(1);
        option43.setArgName("");
        boolean boolean48 = option43.hasLongOpt();
        option43.addValue("hi!");
        java.lang.String[] strArray51 = option43.getValues();
        java.lang.String[] strArray53 = posixParser38.flatten(options39, strArray51, true);
        java.lang.String[] strArray55 = posixParser21.flatten(options37, strArray51, false);
        org.apache.commons.cli.CommandLine commandLine57 = posixParser0.parse(options16, strArray55, true);
        org.apache.commons.cli.Option option61 = new org.apache.commons.cli.Option("", false, "hi!");
        option61.setArgs(1);
        java.lang.Object obj64 = option61.getType();
        option61.setLongOpt("");
        java.lang.String str68 = option61.getValue((int) (short) 1);
        option61.setRequired(false);
        commandLine57.addOption(option61);
        // The following exception was thrown during execution in test generation
        try {
            int int72 = option61.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(commandLine57);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(str68);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String str13 = commandLine0.getOptionValue('a', "org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String[] strArray14 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.cli.MissingOptionException: hi!" + "'", str13, "org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str9 = commandLine0.getOptionValue('\000', "org.apache.commons.cli.MissingArgumentException: hi!");
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", false, "hi!");
        option13.setArgs(1);
        option13.setArgName("");
        boolean boolean18 = option13.hasLongOpt();
        option13.addValue("hi!");
        option13.setArgName("");
        commandLine0.addOption(option13);
        java.lang.Object obj25 = commandLine0.getOptionObject("org.apache.commons.cli.UnrecognizedOptionException: ");
        java.util.List list26 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.cli.MissingArgumentException: hi!" + "'", str9, "org.apache.commons.cli.MissingArgumentException: hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('\000');
        java.lang.String str12 = commandLine0.getOptionValue("", "org.apache.commons.cli.UnrecognizedOptionException: ");
        java.lang.String[] strArray13 = commandLine0.getArgs();
        commandLine0.addArg("arg");
        java.lang.Object obj17 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray19 = commandLine0.getOptionValues('a');
        java.lang.Object obj21 = commandLine0.getOptionObject('\000');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: " + "'", str12, "org.apache.commons.cli.UnrecognizedOptionException: ");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('4');
        java.util.Iterator iterator8 = commandLine0.iterator();
        java.lang.String str11 = commandLine0.getOptionValue('4', "org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.cli.MissingArgumentException: " + "'", str11, "org.apache.commons.cli.MissingArgumentException: ");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.Object obj10 = commandLine0.getOptionObject('4');
        java.lang.String str13 = commandLine0.getOptionValue("arg", "org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String str16 = commandLine0.getOptionValue('a', "org.apache.commons.cli.ParseException: arg");
        java.lang.String str19 = commandLine0.getOptionValue("org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.UnrecognizedOptionException: ", "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.cli.MissingOptionException: hi!" + "'", str13, "org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.cli.ParseException: arg" + "'", str16, "org.apache.commons.cli.ParseException: arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]" + "'", str19, "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("org.apache.commons.cli.MissingArgumentException: hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject('#');
        java.lang.String str17 = commandLine0.getOptionValue("org.apache.commons.cli.MissingArgumentException: hi!", "");
        commandLine0.addArg("org.apache.commons.cli.MissingOptionException: ");
        java.util.List list20 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("org.apache.commons.cli.MissingArgumentException: hi!");
        java.util.Iterator iterator13 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(optionArray14);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("org.apache.commons.cli.MissingArgumentException: hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject('#');
        java.lang.String str17 = commandLine0.getOptionValue('\000', "org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.UnrecognizedOptionException: ");
        java.lang.String str19 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.UnrecognizedOptionException: " + "'", str17, "org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.UnrecognizedOptionException: ");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("arg");
        java.lang.String str11 = commandLine0.getOptionValue('a', "org.apache.commons.cli.MissingOptionException: ");
        commandLine0.addArg("org.apache.commons.cli.MissingArgumentException: ");
        org.apache.commons.cli.Option option17 = new org.apache.commons.cli.Option("", false, "hi!");
        option17.setArgs(1);
        option17.setArgName("");
        boolean boolean22 = option17.hasLongOpt();
        java.lang.Object obj23 = null;
        org.apache.commons.cli.OptionBuilder optionBuilder24 = org.apache.commons.cli.OptionBuilder.withType(obj23);
        option17.setType(obj23);
        boolean boolean26 = option17.hasArgName();
        option17.setOptionalArg(true);
        char char29 = option17.getValueSeparator();
        commandLine0.addOption(option17);
        java.lang.String str31 = option17.getArgName();
        int int32 = option17.getArgs();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.cli.MissingOptionException: " + "'", str11, "org.apache.commons.cli.MissingOptionException: ");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(optionBuilder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("org.apache.commons.cli.MissingArgumentException: hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray16 = commandLine0.getOptionValues(' ');
        commandLine0.addArg("org.apache.commons.cli.ParseException: ");
        org.apache.commons.cli.Option[] optionArray19 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(optionArray19);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.util.List list7 = commandLine0.getArgList();
        boolean boolean9 = commandLine0.hasOption("[ option:   :: hi! ]");
        boolean boolean11 = commandLine0.hasOption('a');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("arg");
        java.lang.String str11 = commandLine0.getOptionValue('a', "org.apache.commons.cli.MissingOptionException: ");
        org.apache.commons.cli.Option option15 = new org.apache.commons.cli.Option("", false, "hi!");
        int int16 = option15.getArgs();
        java.lang.String str18 = option15.getValue(10);
        java.lang.String str19 = option15.getOpt();
        option15.setArgName("arg");
        commandLine0.addOption(option15);
        java.lang.String str23 = option15.getDescription();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.cli.MissingOptionException: " + "'", str11, "org.apache.commons.cli.MissingOptionException: ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str11 = commandLine0.getOptionValue('a');
        org.apache.commons.cli.CommandLine commandLine12 = new org.apache.commons.cli.CommandLine();
        java.util.List list13 = commandLine12.getArgList();
        java.lang.String[] strArray15 = commandLine12.getOptionValues(' ');
        java.lang.String str18 = commandLine12.getOptionValue('#', "");
        java.lang.String str20 = commandLine12.getOptionValue("arg");
        java.lang.String str23 = commandLine12.getOptionValue('a', "org.apache.commons.cli.MissingOptionException: ");
        commandLine12.addArg("org.apache.commons.cli.MissingArgumentException: ");
        org.apache.commons.cli.Option option29 = new org.apache.commons.cli.Option("", false, "hi!");
        option29.setArgs(1);
        option29.setArgName("");
        boolean boolean34 = option29.hasLongOpt();
        java.lang.Object obj35 = null;
        org.apache.commons.cli.OptionBuilder optionBuilder36 = org.apache.commons.cli.OptionBuilder.withType(obj35);
        option29.setType(obj35);
        boolean boolean38 = option29.hasArgName();
        option29.setOptionalArg(true);
        char char41 = option29.getValueSeparator();
        commandLine12.addOption(option29);
        commandLine0.addOption(option29);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.apache.commons.cli.MissingOptionException: " + "'", str23, "org.apache.commons.cli.MissingOptionException: ");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(optionBuilder36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '\000' + "'", char41 == '\000');
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.Object obj3 = commandLine0.getOptionObject("arg");
        org.apache.commons.cli.Option option5 = org.apache.commons.cli.OptionBuilder.create("arg");
        commandLine0.addOption(option5);
        java.util.List list7 = commandLine0.getArgList();
        java.lang.String str10 = commandLine0.getOptionValue("[ option:   :: hi! ]", "org.apache.commons.cli.MissingArgumentException: ");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('#');
        java.lang.String str15 = commandLine0.getOptionValue("[ option:    :: hi! ]", "org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.UnrecognizedOptionException: ");
        org.apache.commons.cli.Option option19 = new org.apache.commons.cli.Option("", false, "hi!");
        option19.setArgs(1);
        option19.setArgName("");
        boolean boolean24 = option19.hasLongOpt();
        option19.addValue("hi!");
        java.lang.String str27 = option19.getOpt();
        int int28 = option19.getArgs();
        java.lang.String str29 = option19.getArgName();
        java.lang.String str30 = option19.getArgName();
        java.util.List list31 = option19.getValuesList();
        commandLine0.addOption(option19);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(option5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.cli.MissingArgumentException: " + "'", str10, "org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.UnrecognizedOptionException: " + "'", str15, "org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.UnrecognizedOptionException: ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("org.apache.commons.cli.MissingArgumentException: hi!");
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.String str15 = commandLine0.getOptionValue("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String str18 = commandLine0.getOptionValue("org.apache.commons.cli.MissingArgumentException: hi!", "org.apache.commons.cli.MissingOptionException: hi!");
        commandLine0.addArg("org.apache.commons.cli.ParseException: ");
        java.lang.Object obj22 = commandLine0.getOptionObject(' ');
        java.lang.String str25 = commandLine0.getOptionValue("org.apache.commons.cli.UnrecognizedOptionException: ", "org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.cli.MissingOptionException: hi!" + "'", str18, "org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.apache.commons.cli.MissingArgumentException: " + "'", str25, "org.apache.commons.cli.MissingArgumentException: ");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("arg");
        java.lang.String str11 = commandLine0.getOptionValue('a', "org.apache.commons.cli.MissingOptionException: ");
        java.util.Iterator iterator12 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.cli.MissingOptionException: " + "'", str11, "org.apache.commons.cli.MissingOptionException: ");
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", false, "hi!");
        option8.setArgs(1);
        option8.setArgName("");
        boolean boolean13 = option8.hasLongOpt();
        option8.addValue("hi!");
        java.lang.String str16 = option8.getOpt();
        int int17 = option8.getArgs();
        char char18 = option8.getValueSeparator();
        boolean boolean19 = option8.hasValueSeparator();
        boolean boolean20 = option8.hasArgs();
        option8.setArgName("hi!");
        int int23 = option8.getArgs();
        org.apache.commons.cli.Options options24 = options4.addOption(option8);
        java.lang.String str25 = options24.toString();
        org.apache.commons.cli.Option option29 = new org.apache.commons.cli.Option("", false, "hi!");
        option29.setArgs(1);
        option29.setArgName("");
        int int34 = option29.getArgs();
        option29.setArgs((int) (byte) 10);
        java.lang.String str38 = option29.getValue("hi!");
        option29.setArgName("org.apache.commons.cli.MissingArgumentException: hi!");
        org.apache.commons.cli.Options options41 = options24.addOption(option29);
        org.apache.commons.cli.Option option45 = new org.apache.commons.cli.Option("", false, "hi!");
        option45.setArgs(1);
        option45.setArgName("");
        boolean boolean50 = option45.hasLongOpt();
        option45.addValue("hi!");
        java.lang.String str53 = option45.getOpt();
        int int54 = option45.getArgs();
        java.lang.Object obj55 = option45.getType();
        org.apache.commons.cli.OptionGroup optionGroup56 = options41.getOptionGroup(option45);
        org.apache.commons.cli.Option option58 = options41.getOption("[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]");
        org.apache.commons.cli.CommandLine commandLine59 = new org.apache.commons.cli.CommandLine();
        java.util.List list60 = commandLine59.getArgList();
        java.lang.String[] strArray62 = commandLine59.getOptionValues(' ');
        java.lang.String[] strArray64 = commandLine59.getOptionValues("arg");
        java.lang.Object obj66 = commandLine59.getOptionObject('a');
        java.lang.String[] strArray67 = commandLine59.getArgs();
        org.apache.commons.cli.CommandLine commandLine69 = posixParser0.parse(options41, strArray67, true);
        java.lang.String str70 = options41.toString();
        java.util.List list71 = options41.getRequiredOptions();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]" + "'", str25, "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(optionGroup56);
        org.junit.Assert.assertNull(option58);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNull(strArray62);
        org.junit.Assert.assertNull(strArray64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(commandLine69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]" + "'", str70, "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(list71);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", false, "hi!");
        option8.setArgs(1);
        option8.setArgName("");
        boolean boolean13 = option8.hasLongOpt();
        option8.addValue("hi!");
        java.lang.String str16 = option8.getOpt();
        int int17 = option8.getArgs();
        char char18 = option8.getValueSeparator();
        boolean boolean19 = option8.hasValueSeparator();
        boolean boolean20 = option8.hasArgs();
        option8.setArgName("hi!");
        int int23 = option8.getArgs();
        org.apache.commons.cli.Options options24 = options4.addOption(option8);
        java.lang.String str25 = options24.toString();
        org.apache.commons.cli.Option option29 = new org.apache.commons.cli.Option("", false, "hi!");
        option29.setArgs(1);
        option29.setArgName("");
        int int34 = option29.getArgs();
        option29.setArgs((int) (byte) 10);
        java.lang.String str38 = option29.getValue("hi!");
        option29.setArgName("org.apache.commons.cli.MissingArgumentException: hi!");
        org.apache.commons.cli.Options options41 = options24.addOption(option29);
        org.apache.commons.cli.Option option45 = new org.apache.commons.cli.Option("", false, "hi!");
        option45.setArgs(1);
        option45.setArgName("");
        boolean boolean50 = option45.hasLongOpt();
        option45.addValue("hi!");
        java.lang.String str53 = option45.getOpt();
        int int54 = option45.getArgs();
        java.lang.Object obj55 = option45.getType();
        org.apache.commons.cli.OptionGroup optionGroup56 = options41.getOptionGroup(option45);
        org.apache.commons.cli.Option option58 = options41.getOption("[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]");
        org.apache.commons.cli.CommandLine commandLine59 = new org.apache.commons.cli.CommandLine();
        java.util.List list60 = commandLine59.getArgList();
        java.lang.String[] strArray62 = commandLine59.getOptionValues(' ');
        java.lang.String[] strArray64 = commandLine59.getOptionValues("arg");
        java.lang.Object obj66 = commandLine59.getOptionObject('a');
        java.lang.String[] strArray67 = commandLine59.getArgs();
        org.apache.commons.cli.CommandLine commandLine69 = posixParser0.parse(options41, strArray67, true);
        java.lang.String str70 = options41.toString();
        org.apache.commons.cli.Options options74 = options41.addOption("", true, "arg");
        java.util.List list75 = options41.getRequiredOptions();
        org.apache.commons.cli.Option option79 = new org.apache.commons.cli.Option("", false, "hi!");
        option79.setArgs(1);
        option79.setArgName("");
        boolean boolean84 = option79.hasLongOpt();
        option79.addValue("hi!");
        option79.setArgName("");
        char char89 = option79.getValueSeparator();
        org.apache.commons.cli.OptionGroup optionGroup90 = options41.getOptionGroup(option79);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]" + "'", str25, "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(optionGroup56);
        org.junit.Assert.assertNull(option58);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNull(strArray62);
        org.junit.Assert.assertNull(strArray64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(commandLine69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]" + "'", str70, "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertNotNull(list75);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + char89 + "' != '" + '\000' + "'", char89 == '\000');
        org.junit.Assert.assertNull(optionGroup90);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('\000');
        commandLine0.addArg("");
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.Object obj14 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray15 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str9 = commandLine0.getOptionValue('\000', "org.apache.commons.cli.MissingArgumentException: hi!");
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", false, "hi!");
        option13.setArgs(1);
        option13.setArgName("");
        boolean boolean18 = option13.hasLongOpt();
        option13.addValue("hi!");
        option13.setArgName("");
        commandLine0.addOption(option13);
        java.lang.Object obj25 = commandLine0.getOptionObject("org.apache.commons.cli.UnrecognizedOptionException: ");
        org.apache.commons.cli.Option[] optionArray26 = commandLine0.getOptions();
        java.util.Iterator iterator27 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.cli.MissingArgumentException: hi!" + "'", str9, "org.apache.commons.cli.MissingArgumentException: hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(optionArray26);
        org.junit.Assert.assertNotNull(iterator27);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        org.apache.commons.cli.Option[] optionArray1 = commandLine0.getOptions();
        java.lang.String str4 = commandLine0.getOptionValue('a', "org.apache.commons.cli.UnrecognizedOptionException: ");
        org.apache.commons.cli.CommandLine commandLine5 = new org.apache.commons.cli.CommandLine();
        java.util.List list6 = commandLine5.getArgList();
        java.lang.String[] strArray8 = commandLine5.getOptionValues(' ');
        java.lang.String str11 = commandLine5.getOptionValue('#', "");
        java.lang.String str13 = commandLine5.getOptionValue("arg");
        java.lang.String str16 = commandLine5.getOptionValue('a', "org.apache.commons.cli.MissingOptionException: ");
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", false, "hi!");
        int int21 = option20.getArgs();
        java.lang.String str23 = option20.getValue(10);
        java.lang.String str24 = option20.getOpt();
        option20.setArgName("arg");
        commandLine5.addOption(option20);
        commandLine0.addOption(option20);
        java.lang.String str29 = option20.toString();
        org.junit.Assert.assertNotNull(optionArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: " + "'", str4, "org.apache.commons.cli.UnrecognizedOptionException: ");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.cli.MissingOptionException: " + "'", str16, "org.apache.commons.cli.MissingOptionException: ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[ option:   :: hi! ]" + "'", str29, "[ option:   :: hi! ]");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.Object obj10 = commandLine0.getOptionObject('4');
        java.lang.String str13 = commandLine0.getOptionValue("arg", "org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String str16 = commandLine0.getOptionValue('a', "org.apache.commons.cli.ParseException: arg");
        java.lang.String str19 = commandLine0.getOptionValue(' ', "org.apache.commons.cli.ParseException: arg");
        java.lang.String[] strArray20 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.cli.MissingOptionException: hi!" + "'", str13, "org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.cli.ParseException: arg" + "'", str16, "org.apache.commons.cli.ParseException: arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.cli.ParseException: arg" + "'", str19, "org.apache.commons.cli.ParseException: arg");
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", false, "hi!");
        option22.setArgs(1);
        option22.setArgName("");
        boolean boolean27 = option22.hasLongOpt();
        option22.addValue("hi!");
        java.lang.String[] strArray30 = option22.getValues();
        java.lang.String[] strArray32 = posixParser17.flatten(options18, strArray30, true);
        org.apache.commons.cli.Options options33 = null;
        org.apache.commons.cli.PosixParser posixParser34 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options35 = null;
        org.apache.commons.cli.Option option39 = new org.apache.commons.cli.Option("", false, "hi!");
        option39.setArgs(1);
        option39.setArgName("");
        boolean boolean44 = option39.hasLongOpt();
        option39.addValue("hi!");
        java.lang.String[] strArray47 = option39.getValues();
        java.lang.String[] strArray49 = posixParser34.flatten(options35, strArray47, true);
        java.lang.String[] strArray51 = posixParser17.flatten(options33, strArray47, false);
        java.lang.String[] strArray53 = posixParser0.flatten(options16, strArray51, false);
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        java.util.List list55 = options54.helpOptions();
        java.util.Collection collection56 = options54.getOptions();
        org.apache.commons.cli.Option option60 = new org.apache.commons.cli.Option("", false, "hi!");
        option60.setArgs(1);
        option60.setArgName("");
        boolean boolean65 = option60.hasLongOpt();
        option60.addValue("hi!");
        java.lang.String[] strArray68 = option60.getValues();
        org.apache.commons.cli.CommandLine commandLine70 = posixParser0.parse(options54, strArray68, false);
        org.apache.commons.cli.Option option75 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str76 = option75.getLongOpt();
        java.lang.String str77 = option75.getOpt();
        option75.setArgName("");
        java.lang.String str80 = option75.getDescription();
        option75.setValueSeparator('\000');
        java.util.List list83 = option75.getValuesList();
        java.util.ListIterator listIterator84 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option75, listIterator84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(commandLine70);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(list83);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.util.List list9 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        boolean boolean7 = commandLine0.hasOption('a');
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", false, "hi!");
        option11.setArgs(1);
        option11.setOptionalArg(true);
        java.lang.String str16 = option11.toString();
        boolean boolean17 = option11.hasArgName();
        option11.setArgs((int) '\000');
        commandLine0.addOption(option11);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option:   :: hi! ]" + "'", str16, "[ option:   :: hi! ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray5 = null;
        org.apache.commons.cli.CommandLine commandLine7 = posixParser0.parse(options4, strArray5, false);
        java.util.List list8 = options4.helpOptions();
        java.util.Collection collection9 = options4.getOptions();
        org.apache.commons.cli.Option option11 = options4.getOption("org.apache.commons.cli.MissingOptionException: ");
        org.apache.commons.cli.Option option15 = new org.apache.commons.cli.Option("", false, "hi!");
        option15.setArgs(1);
        option15.setArgName("");
        int int20 = option15.getArgs();
        option15.setArgs((int) (byte) 10);
        java.lang.String str24 = option15.getValue("hi!");
        option15.setArgName("org.apache.commons.cli.MissingArgumentException: hi!");
        org.apache.commons.cli.OptionGroup optionGroup27 = options4.getOptionGroup(option15);
        java.util.Collection collection28 = options4.getOptionGroups();
        org.junit.Assert.assertNotNull(commandLine7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(optionGroup27);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.List list17 = options16.helpOptions();
        java.util.List list18 = options16.getRequiredOptions();
        boolean boolean20 = options16.hasOption("");
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = null;
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", false, "hi!");
        option26.setArgs(1);
        option26.setArgName("");
        boolean boolean31 = option26.hasLongOpt();
        option26.addValue("hi!");
        java.lang.String[] strArray34 = option26.getValues();
        java.lang.String[] strArray36 = posixParser21.flatten(options22, strArray34, true);
        org.apache.commons.cli.Options options37 = null;
        org.apache.commons.cli.PosixParser posixParser38 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options39 = null;
        org.apache.commons.cli.Option option43 = new org.apache.commons.cli.Option("", false, "hi!");
        option43.setArgs(1);
        option43.setArgName("");
        boolean boolean48 = option43.hasLongOpt();
        option43.addValue("hi!");
        java.lang.String[] strArray51 = option43.getValues();
        java.lang.String[] strArray53 = posixParser38.flatten(options39, strArray51, true);
        java.lang.String[] strArray55 = posixParser21.flatten(options37, strArray51, false);
        org.apache.commons.cli.CommandLine commandLine57 = posixParser0.parse(options16, strArray55, true);
        org.apache.commons.cli.Options options58 = new org.apache.commons.cli.Options();
        java.util.List list59 = options58.helpOptions();
        java.util.List list60 = options58.getRequiredOptions();
        boolean boolean62 = options58.hasOption("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.apache.commons.cli.CommandLine commandLine63 = new org.apache.commons.cli.CommandLine();
        java.util.List list64 = commandLine63.getArgList();
        java.lang.String[] strArray66 = commandLine63.getOptionValues(' ');
        java.lang.String str69 = commandLine63.getOptionValue('#', "");
        java.lang.String str71 = commandLine63.getOptionValue("arg");
        java.lang.Object obj73 = commandLine63.getOptionObject('a');
        boolean boolean75 = commandLine63.hasOption("org.apache.commons.cli.MissingOptionException: ");
        java.lang.Object obj77 = commandLine63.getOptionObject("org.apache.commons.cli.MissingArgumentException: hi!");
        java.lang.String[] strArray78 = commandLine63.getArgs();
        java.lang.String[] strArray80 = posixParser0.flatten(options58, strArray78, true);
        posixParser0.burstToken("[ Options: [ short {=[ option:   :: org.apache.commons.cli.MissingOptionException:  ]} ] [ long {} ]", false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(commandLine57);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNull(strArray66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray80);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String str10 = commandLine0.getOptionValue('#', "arg");
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("", false, "hi!");
        option14.setArgs(1);
        int int17 = option14.getArgs();
        commandLine0.addOption(option14);
        java.lang.String str20 = commandLine0.getOptionValue('#');
        java.lang.String str23 = commandLine0.getOptionValue(' ', "org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: hi!" + "'", str23, "org.apache.commons.cli.UnrecognizedOptionException: hi!");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", false, "hi!");
        option22.setArgs(1);
        option22.setArgName("");
        boolean boolean27 = option22.hasLongOpt();
        option22.addValue("hi!");
        java.lang.String[] strArray30 = option22.getValues();
        java.lang.String[] strArray32 = posixParser17.flatten(options18, strArray30, true);
        java.lang.String[] strArray34 = posixParser0.flatten(options16, strArray30, false);
        org.apache.commons.cli.Options options35 = null;
        org.apache.commons.cli.PosixParser posixParser36 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options37 = null;
        org.apache.commons.cli.Option option41 = new org.apache.commons.cli.Option("", false, "hi!");
        option41.setArgs(1);
        option41.setArgName("");
        boolean boolean46 = option41.hasLongOpt();
        option41.addValue("hi!");
        java.lang.String[] strArray49 = option41.getValues();
        java.lang.String[] strArray51 = posixParser36.flatten(options37, strArray49, true);
        java.lang.String[] strArray53 = posixParser0.flatten(options35, strArray51, true);
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option58 = new org.apache.commons.cli.Option("", false, "hi!");
        option58.setArgs(1);
        option58.setArgName("");
        boolean boolean63 = option58.hasLongOpt();
        option58.addValue("hi!");
        java.lang.String str66 = option58.getOpt();
        int int67 = option58.getArgs();
        char char68 = option58.getValueSeparator();
        boolean boolean69 = option58.hasValueSeparator();
        boolean boolean70 = option58.hasArgs();
        option58.setArgName("hi!");
        int int73 = option58.getArgs();
        org.apache.commons.cli.Options options74 = options54.addOption(option58);
        java.lang.String str75 = options74.toString();
        org.apache.commons.cli.Option option77 = options74.getOption("org.apache.commons.cli.MissingArgumentException: ");
        java.util.List list78 = options74.getRequiredOptions();
        java.util.Collection collection79 = options74.getOptionGroups();
        org.apache.commons.cli.CommandLine commandLine80 = new org.apache.commons.cli.CommandLine();
        java.util.List list81 = commandLine80.getArgList();
        java.lang.String[] strArray83 = commandLine80.getOptionValues(' ');
        java.lang.String[] strArray85 = commandLine80.getOptionValues("arg");
        java.lang.Object obj87 = commandLine80.getOptionObject('a');
        java.lang.String[] strArray88 = commandLine80.getArgs();
        java.lang.String[] strArray89 = commandLine80.getArgs();
        java.util.Properties properties90 = null;
        org.apache.commons.cli.CommandLine commandLine92 = posixParser0.parse(options74, strArray89, properties90, true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + char68 + "' != '" + '\000' + "'", char68 == '\000');
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]" + "'", str75, "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]");
        org.junit.Assert.assertNull(option77);
        org.junit.Assert.assertNotNull(list78);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNotNull(list81);
        org.junit.Assert.assertNull(strArray83);
        org.junit.Assert.assertNull(strArray85);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(commandLine92);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("arg");
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        boolean boolean12 = commandLine0.hasOption("org.apache.commons.cli.MissingOptionException: ");
        java.lang.Object obj14 = commandLine0.getOptionObject("org.apache.commons.cli.MissingArgumentException: hi!");
        java.lang.Object obj16 = commandLine0.getOptionObject('#');
        java.util.List list17 = commandLine0.getArgList();
        commandLine0.addArg("a");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options4 = null;
        org.apache.commons.cli.CommandLine commandLine5 = new org.apache.commons.cli.CommandLine();
        java.util.List list6 = commandLine5.getArgList();
        java.lang.String[] strArray7 = commandLine5.getArgs();
        java.lang.String[] strArray9 = posixParser0.flatten(options4, strArray7, true);
        org.apache.commons.cli.Options options10 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("", false, "hi!");
        option14.setArgs(1);
        option14.setArgName("");
        boolean boolean19 = option14.hasLongOpt();
        option14.addValue("hi!");
        java.lang.String str22 = option14.getOpt();
        int int23 = option14.getArgs();
        char char24 = option14.getValueSeparator();
        boolean boolean25 = option14.hasValueSeparator();
        boolean boolean26 = option14.hasArgs();
        option14.setArgName("hi!");
        int int29 = option14.getArgs();
        org.apache.commons.cli.Options options30 = options10.addOption(option14);
        java.lang.String str31 = options30.toString();
        java.util.List list32 = options30.helpOptions();
        org.apache.commons.cli.Option option36 = new org.apache.commons.cli.Option("", false, "hi!");
        option36.setArgs(1);
        option36.setArgName("");
        boolean boolean41 = option36.hasLongOpt();
        boolean boolean42 = option36.hasArgs();
        org.apache.commons.cli.Options options43 = options30.addOption(option36);
        java.util.List list44 = options43.getRequiredOptions();
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        posixParser45.burstToken("", false);
        org.apache.commons.cli.Options options49 = null;
        org.apache.commons.cli.CommandLine commandLine50 = new org.apache.commons.cli.CommandLine();
        java.util.List list51 = commandLine50.getArgList();
        java.lang.String[] strArray52 = commandLine50.getArgs();
        java.lang.String[] strArray54 = posixParser45.flatten(options49, strArray52, true);
        org.apache.commons.cli.CommandLine commandLine55 = posixParser0.parse(options43, strArray52);
        java.lang.String[] strArray56 = commandLine55.getArgs();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]" + "'", str31, "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(commandLine55);
        org.junit.Assert.assertNotNull(strArray56);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String str4 = commandLine0.getOptionValue('4');
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.String str8 = commandLine0.getOptionValue("hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: hi!" + "'", str8, "org.apache.commons.cli.UnrecognizedOptionException: hi!");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("arg");
        java.lang.String str11 = commandLine0.getOptionValue('a', "org.apache.commons.cli.MissingOptionException: ");
        commandLine0.addArg("org.apache.commons.cli.MissingArgumentException: ");
        org.apache.commons.cli.Option option17 = new org.apache.commons.cli.Option("", false, "hi!");
        option17.setArgs(1);
        option17.setArgName("");
        boolean boolean22 = option17.hasLongOpt();
        java.lang.Object obj23 = null;
        org.apache.commons.cli.OptionBuilder optionBuilder24 = org.apache.commons.cli.OptionBuilder.withType(obj23);
        option17.setType(obj23);
        boolean boolean26 = option17.hasArgName();
        option17.setOptionalArg(true);
        char char29 = option17.getValueSeparator();
        commandLine0.addOption(option17);
        option17.setDescription("hi!");
        java.lang.String str33 = option17.getKey();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.cli.MissingOptionException: " + "'", str11, "org.apache.commons.cli.MissingOptionException: ");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(optionBuilder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String str4 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray6 = commandLine0.getOptionValues('\000');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.String str10 = commandLine0.getOptionValue("org.apache.commons.cli.ParseException: arg");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("arg");
        java.lang.String str14 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", false, "hi!");
        option22.setArgs(1);
        option22.setArgName("");
        boolean boolean27 = option22.hasLongOpt();
        option22.addValue("hi!");
        java.lang.String[] strArray30 = option22.getValues();
        java.lang.String[] strArray32 = posixParser17.flatten(options18, strArray30, true);
        java.lang.String[] strArray34 = posixParser0.flatten(options16, strArray30, false);
        org.apache.commons.cli.Options options35 = null;
        org.apache.commons.cli.PosixParser posixParser36 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options37 = null;
        org.apache.commons.cli.Option option41 = new org.apache.commons.cli.Option("", false, "hi!");
        option41.setArgs(1);
        option41.setArgName("");
        boolean boolean46 = option41.hasLongOpt();
        option41.addValue("hi!");
        java.lang.String[] strArray49 = option41.getValues();
        java.lang.String[] strArray51 = posixParser36.flatten(options37, strArray49, true);
        java.lang.String[] strArray53 = posixParser0.flatten(options35, strArray51, true);
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        java.util.Collection collection55 = options54.getOptionGroups();
        org.apache.commons.cli.PosixParser posixParser56 = new org.apache.commons.cli.PosixParser();
        posixParser56.burstToken("", false);
        org.apache.commons.cli.Options options60 = null;
        org.apache.commons.cli.CommandLine commandLine61 = new org.apache.commons.cli.CommandLine();
        java.util.List list62 = commandLine61.getArgList();
        java.lang.String[] strArray63 = commandLine61.getArgs();
        java.lang.String[] strArray65 = posixParser56.flatten(options60, strArray63, true);
        java.lang.String[] strArray67 = posixParser0.flatten(options54, strArray65, false);
        org.apache.commons.cli.OptionBuilder optionBuilder68 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) strArray67);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(optionBuilder68);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray5 = null;
        org.apache.commons.cli.CommandLine commandLine7 = posixParser0.parse(options4, strArray5, false);
        java.util.List list8 = options4.helpOptions();
        java.util.Collection collection9 = options4.getOptions();
        org.apache.commons.cli.Option option11 = options4.getOption("org.apache.commons.cli.MissingOptionException: ");
        org.apache.commons.cli.Option option15 = new org.apache.commons.cli.Option("", false, "hi!");
        option15.setArgs(1);
        option15.setArgName("");
        int int20 = option15.getArgs();
        option15.setArgs((int) (byte) 10);
        java.lang.String str24 = option15.getValue("hi!");
        option15.setArgName("org.apache.commons.cli.MissingArgumentException: hi!");
        org.apache.commons.cli.OptionGroup optionGroup27 = options4.getOptionGroup(option15);
        boolean boolean29 = options4.hasOption("org.apache.commons.cli.ParseException: arg");
        org.apache.commons.cli.Option option33 = new org.apache.commons.cli.Option("", false, "hi!");
        option33.setArgs(1);
        java.lang.Object obj36 = option33.getType();
        option33.setLongOpt("");
        org.apache.commons.cli.Option option42 = new org.apache.commons.cli.Option("", false, "hi!");
        option42.setArgs(1);
        option42.setArgName("");
        boolean boolean47 = option42.hasLongOpt();
        option42.addValue("hi!");
        java.lang.String str50 = option42.getOpt();
        int int51 = option42.getArgs();
        char char52 = option42.getValueSeparator();
        boolean boolean53 = option42.hasValueSeparator();
        option33.setType((java.lang.Object) option42);
        java.util.List list55 = option33.getValuesList();
        org.apache.commons.cli.Options options56 = options4.addOption(option33);
        org.junit.Assert.assertNotNull(commandLine7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(optionGroup27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + char52 + "' != '" + '\000' + "'", char52 == '\000');
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(options56);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("org.apache.commons.cli.MissingArgumentException: hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray16 = commandLine0.getOptionValues(' ');
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(optionArray17);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("arg");
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        boolean boolean12 = commandLine0.hasOption("org.apache.commons.cli.MissingOptionException: ");
        java.lang.Object obj14 = commandLine0.getOptionObject("org.apache.commons.cli.MissingArgumentException: hi!");
        java.lang.String[] strArray15 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(optionArray16);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str9 = commandLine0.getOptionValue('\000', "org.apache.commons.cli.MissingArgumentException: hi!");
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String str15 = commandLine0.getOptionValue("org.apache.commons.cli.MissingArgumentException: ", "org.apache.commons.cli.MissingArgumentException: ");
        java.lang.String str18 = commandLine0.getOptionValue("[ Options: [ short {=[ option:   :: org.apache.commons.cli.MissingOptionException:  ]} ] [ long {} ]", "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.cli.MissingArgumentException: hi!" + "'", str9, "org.apache.commons.cli.MissingArgumentException: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.cli.MissingOptionException: hi!" + "'", str12, "org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.cli.MissingArgumentException: " + "'", str15, "org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]" + "'", str18, "[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        java.lang.Object obj5 = commandLine0.getOptionObject("org.apache.commons.cli.MissingOptionException: ");
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(optionArray6);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("arg");
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        boolean boolean12 = commandLine0.hasOption("org.apache.commons.cli.MissingOptionException: ");
        java.util.List list13 = commandLine0.getArgList();
        java.lang.String str15 = commandLine0.getOptionValue(' ');
        java.lang.String str18 = commandLine0.getOptionValue('a', "org.apache.commons.cli.MissingArgumentException: hi!");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.cli.MissingArgumentException: hi!" + "'", str18, "org.apache.commons.cli.MissingArgumentException: hi!");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str9 = commandLine0.getOptionValue('\000', "org.apache.commons.cli.MissingArgumentException: hi!");
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", false, "hi!");
        option13.setArgs(1);
        option13.setArgName("");
        boolean boolean18 = option13.hasLongOpt();
        option13.addValue("hi!");
        option13.setArgName("");
        commandLine0.addOption(option13);
        commandLine0.addArg("org.apache.commons.cli.MissingOptionException: ");
        java.util.List list26 = commandLine0.getArgList();
        java.util.Iterator iterator27 = commandLine0.iterator();
        java.lang.String[] strArray29 = commandLine0.getOptionValues("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.cli.MissingArgumentException: hi!" + "'", str9, "org.apache.commons.cli.MissingArgumentException: hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNull(strArray29);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray5 = null;
        org.apache.commons.cli.CommandLine commandLine7 = posixParser0.parse(options4, strArray5, false);
        java.util.List list8 = options4.helpOptions();
        java.util.Collection collection9 = options4.getOptions();
        org.apache.commons.cli.Option option11 = options4.getOption("org.apache.commons.cli.MissingOptionException: ");
        org.apache.commons.cli.Option option15 = new org.apache.commons.cli.Option("", false, "hi!");
        option15.setArgs(1);
        option15.setArgName("");
        int int20 = option15.getArgs();
        option15.setArgs((int) (byte) 10);
        java.lang.String str24 = option15.getValue("hi!");
        option15.setArgName("org.apache.commons.cli.MissingArgumentException: hi!");
        org.apache.commons.cli.OptionGroup optionGroup27 = options4.getOptionGroup(option15);
        boolean boolean29 = options4.hasOption("org.apache.commons.cli.ParseException: arg");
        java.util.Collection collection30 = options4.getOptions();
        org.junit.Assert.assertNotNull(commandLine7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(optionGroup27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collection30);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options4 = null;
        org.apache.commons.cli.CommandLine commandLine5 = new org.apache.commons.cli.CommandLine();
        java.util.List list6 = commandLine5.getArgList();
        java.lang.String[] strArray7 = commandLine5.getArgs();
        java.lang.String[] strArray9 = posixParser0.flatten(options4, strArray7, true);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("org.apache.commons.cli.UnrecognizedOptionException: hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("[ option:   :: hi! ]");
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('\000');
        java.lang.String str12 = commandLine0.getOptionValue("", "org.apache.commons.cli.UnrecognizedOptionException: ");
        java.lang.String[] strArray13 = commandLine0.getArgs();
        commandLine0.addArg("arg");
        java.lang.Object obj17 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray19 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray21 = commandLine0.getOptionValues("org.apache.commons.cli.ParseException: org.apache.commons.cli.UnrecognizedOptionException: ");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: " + "'", str12, "org.apache.commons.cli.UnrecognizedOptionException: ");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(strArray21);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", false, "hi!");
        option20.setArgs(1);
        option20.setArgName("");
        boolean boolean25 = option20.hasLongOpt();
        option20.addValue("hi!");
        java.lang.String str28 = option20.getOpt();
        int int29 = option20.getArgs();
        char char30 = option20.getValueSeparator();
        boolean boolean31 = option20.hasValueSeparator();
        boolean boolean32 = option20.hasArgs();
        option20.setArgName("hi!");
        int int35 = option20.getArgs();
        org.apache.commons.cli.Options options36 = options16.addOption(option20);
        java.util.Collection collection37 = options36.getOptionGroups();
        java.util.List list38 = options36.helpOptions();
        org.apache.commons.cli.Option option42 = new org.apache.commons.cli.Option("", false, "hi!");
        option42.setArgs(1);
        option42.setArgName("");
        boolean boolean47 = option42.hasLongOpt();
        option42.addValue("hi!");
        java.lang.String str50 = option42.getOpt();
        int int51 = option42.getArgs();
        java.lang.String str52 = option42.getArgName();
        char char53 = option42.getValueSeparator();
        org.apache.commons.cli.Options options54 = options36.addOption(option42);
        org.apache.commons.cli.PosixParser posixParser55 = new org.apache.commons.cli.PosixParser();
        posixParser55.burstToken("", false);
        org.apache.commons.cli.Options options59 = null;
        org.apache.commons.cli.CommandLine commandLine60 = new org.apache.commons.cli.CommandLine();
        java.util.List list61 = commandLine60.getArgList();
        java.lang.String[] strArray62 = commandLine60.getArgs();
        java.lang.String[] strArray64 = posixParser55.flatten(options59, strArray62, true);
        java.util.Properties properties65 = null;
        org.apache.commons.cli.CommandLine commandLine66 = posixParser0.parse(options36, strArray62, properties65);
        boolean boolean68 = commandLine66.hasOption("org.apache.commons.cli.ParseException: ");
        java.util.List list69 = commandLine66.getArgList();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\000' + "'", char30 == '\000');
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + char53 + "' != '" + '\000' + "'", char53 == '\000');
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(commandLine66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(list69);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", false, "hi!");
        option20.setArgs(1);
        option20.setArgName("");
        boolean boolean25 = option20.hasLongOpt();
        option20.addValue("hi!");
        java.lang.String str28 = option20.getOpt();
        int int29 = option20.getArgs();
        char char30 = option20.getValueSeparator();
        boolean boolean31 = option20.hasValueSeparator();
        boolean boolean32 = option20.hasArgs();
        option20.setArgName("hi!");
        int int35 = option20.getArgs();
        org.apache.commons.cli.Options options36 = options16.addOption(option20);
        java.util.Collection collection37 = options36.getOptionGroups();
        java.util.List list38 = options36.helpOptions();
        org.apache.commons.cli.Option option42 = new org.apache.commons.cli.Option("", false, "hi!");
        option42.setArgs(1);
        option42.setArgName("");
        boolean boolean47 = option42.hasLongOpt();
        option42.addValue("hi!");
        java.lang.String str50 = option42.getOpt();
        int int51 = option42.getArgs();
        java.lang.String str52 = option42.getArgName();
        char char53 = option42.getValueSeparator();
        org.apache.commons.cli.Options options54 = options36.addOption(option42);
        org.apache.commons.cli.PosixParser posixParser55 = new org.apache.commons.cli.PosixParser();
        posixParser55.burstToken("", false);
        org.apache.commons.cli.Options options59 = null;
        org.apache.commons.cli.CommandLine commandLine60 = new org.apache.commons.cli.CommandLine();
        java.util.List list61 = commandLine60.getArgList();
        java.lang.String[] strArray62 = commandLine60.getArgs();
        java.lang.String[] strArray64 = posixParser55.flatten(options59, strArray62, true);
        java.util.Properties properties65 = null;
        org.apache.commons.cli.CommandLine commandLine66 = posixParser0.parse(options36, strArray62, properties65);
        java.lang.String str68 = commandLine66.getOptionValue('#');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\000' + "'", char30 == '\000');
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + char53 + "' != '" + '\000' + "'", char53 == '\000');
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(commandLine66);
        org.junit.Assert.assertNull(str68);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String str4 = commandLine0.getOptionValue('4');
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.util.Iterator iterator7 = commandLine0.iterator();
        boolean boolean9 = commandLine0.hasOption("org.apache.commons.cli.ParseException: arg");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.String str8 = commandLine0.getOptionValue(' ', "");
        java.lang.Object obj10 = commandLine0.getOptionObject('\000');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "hi!");
        option5.setArgs(1);
        option5.setArgName("");
        boolean boolean10 = option5.hasLongOpt();
        option5.addValue("hi!");
        java.lang.String[] strArray13 = option5.getValues();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.List list17 = options16.helpOptions();
        java.util.List list18 = options16.getRequiredOptions();
        boolean boolean20 = options16.hasOption("");
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = null;
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", false, "hi!");
        option26.setArgs(1);
        option26.setArgName("");
        boolean boolean31 = option26.hasLongOpt();
        option26.addValue("hi!");
        java.lang.String[] strArray34 = option26.getValues();
        java.lang.String[] strArray36 = posixParser21.flatten(options22, strArray34, true);
        org.apache.commons.cli.Options options37 = null;
        org.apache.commons.cli.PosixParser posixParser38 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options39 = null;
        org.apache.commons.cli.Option option43 = new org.apache.commons.cli.Option("", false, "hi!");
        option43.setArgs(1);
        option43.setArgName("");
        boolean boolean48 = option43.hasLongOpt();
        option43.addValue("hi!");
        java.lang.String[] strArray51 = option43.getValues();
        java.lang.String[] strArray53 = posixParser38.flatten(options39, strArray51, true);
        java.lang.String[] strArray55 = posixParser21.flatten(options37, strArray51, false);
        org.apache.commons.cli.CommandLine commandLine57 = posixParser0.parse(options16, strArray55, true);
        org.apache.commons.cli.Option option61 = new org.apache.commons.cli.Option("", false, "hi!");
        option61.setArgs(1);
        java.lang.Object obj64 = option61.getType();
        option61.setLongOpt("");
        java.lang.String str68 = option61.getValue((int) (short) 1);
        option61.setRequired(false);
        commandLine57.addOption(option61);
        boolean boolean72 = option61.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(commandLine57);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('\000');
        java.lang.String str12 = commandLine0.getOptionValue("", "org.apache.commons.cli.UnrecognizedOptionException: ");
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.Object obj15 = commandLine0.getOptionObject("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.Object obj17 = commandLine0.getOptionObject("org.apache.commons.cli.MissingOptionException: ");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: " + "'", str12, "org.apache.commons.cli.UnrecognizedOptionException: ");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("org.apache.commons.cli.MissingArgumentException: hi!");
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.String str15 = commandLine0.getOptionValue("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String str18 = commandLine0.getOptionValue("org.apache.commons.cli.MissingArgumentException: hi!", "org.apache.commons.cli.MissingOptionException: hi!");
        commandLine0.addArg("org.apache.commons.cli.ParseException: ");
        boolean boolean22 = commandLine0.hasOption('a');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.cli.MissingOptionException: hi!" + "'", str18, "org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "hi!");
        option3.setArgs(1);
        option3.setArgName("");
        boolean boolean8 = option3.hasLongOpt();
        option3.addValue("hi!");
        java.lang.String str11 = option3.getOpt();
        int int12 = option3.getArgs();
        char char13 = option3.getValueSeparator();
        boolean boolean14 = option3.hasValueSeparator();
        boolean boolean15 = option3.hasArgs();
        option3.setArgName("hi!");
        int int18 = option3.getArgs();
        boolean boolean19 = option3.hasArgs();
        org.apache.commons.cli.CommandLine commandLine20 = new org.apache.commons.cli.CommandLine();
        java.util.List list21 = commandLine20.getArgList();
        java.lang.String[] strArray23 = commandLine20.getOptionValues(' ');
        java.lang.String[] strArray25 = commandLine20.getOptionValues("arg");
        java.lang.Object obj27 = commandLine20.getOptionObject('a');
        java.lang.String[] strArray28 = commandLine20.getArgs();
        java.lang.String[] strArray29 = commandLine20.getArgs();
        java.lang.String[] strArray30 = commandLine20.getArgs();
        boolean boolean31 = option3.equals((java.lang.Object) strArray30);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        boolean boolean5 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue('\000');
        commandLine0.addArg("a");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        commandLine0.addArg("org.apache.commons.cli.MissingOptionException: ");
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        java.util.List list12 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String str10 = commandLine0.getOptionValue('#', "arg");
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("", false, "hi!");
        option14.setArgs(1);
        int int17 = option14.getArgs();
        commandLine0.addOption(option14);
        java.lang.String str20 = commandLine0.getOptionValue('#');
        boolean boolean22 = commandLine0.hasOption("org.apache.commons.cli.MissingArgumentException: ");
        java.lang.String[] strArray24 = commandLine0.getOptionValues("org.apache.commons.cli.MissingArgumentException: hi!");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(strArray24);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray5 = null;
        org.apache.commons.cli.CommandLine commandLine7 = posixParser0.parse(options4, strArray5, false);
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", false, "hi!");
        option11.setArgs(1);
        option11.setArgName("");
        boolean boolean16 = option11.hasLongOpt();
        option11.addValue("hi!");
        option11.setArgName("");
        char char21 = option11.getValueSeparator();
        option11.setLongOpt("arg");
        java.util.ListIterator listIterator24 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option11, listIterator24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options4 = null;
        org.apache.commons.cli.CommandLine commandLine5 = new org.apache.commons.cli.CommandLine();
        java.util.List list6 = commandLine5.getArgList();
        java.lang.String[] strArray7 = commandLine5.getArgs();
        java.lang.String[] strArray9 = posixParser0.flatten(options4, strArray7, true);
        org.apache.commons.cli.PosixParser posixParser10 = new org.apache.commons.cli.PosixParser();
        posixParser10.burstToken("", false);
        org.apache.commons.cli.Options options14 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray15 = null;
        org.apache.commons.cli.CommandLine commandLine17 = posixParser10.parse(options14, strArray15, false);
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options19 = null;
        org.apache.commons.cli.Option option23 = new org.apache.commons.cli.Option("", false, "hi!");
        option23.setArgs(1);
        option23.setArgName("");
        boolean boolean28 = option23.hasLongOpt();
        option23.addValue("hi!");
        java.lang.String[] strArray31 = option23.getValues();
        java.lang.String[] strArray33 = posixParser18.flatten(options19, strArray31, true);
        org.apache.commons.cli.Options options34 = null;
        org.apache.commons.cli.PosixParser posixParser35 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options36 = null;
        org.apache.commons.cli.Option option40 = new org.apache.commons.cli.Option("", false, "hi!");
        option40.setArgs(1);
        option40.setArgName("");
        boolean boolean45 = option40.hasLongOpt();
        option40.addValue("hi!");
        java.lang.String[] strArray48 = option40.getValues();
        java.lang.String[] strArray50 = posixParser35.flatten(options36, strArray48, true);
        java.lang.String[] strArray52 = posixParser18.flatten(options34, strArray48, false);
        java.util.Properties properties53 = null;
        org.apache.commons.cli.CommandLine commandLine54 = posixParser0.parse(options14, strArray52, properties53);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(commandLine17);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(commandLine54);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue("arg");
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        boolean boolean12 = commandLine0.hasOption("org.apache.commons.cli.MissingOptionException: ");
        java.util.List list13 = commandLine0.getArgList();
        java.lang.String str15 = commandLine0.getOptionValue("org.apache.commons.cli.ParseException: arg");
        java.lang.Object obj17 = commandLine0.getOptionObject(' ');
        java.lang.String str19 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray5 = null;
        org.apache.commons.cli.CommandLine commandLine7 = posixParser0.parse(options4, strArray5, false);
        java.util.List list8 = options4.helpOptions();
        org.apache.commons.cli.Option option10 = options4.getOption("org.apache.commons.cli.UnrecognizedOptionException: ");
        org.junit.Assert.assertNotNull(commandLine7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(option10);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.lang.String[] strArray3 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("arg");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('\000');
        java.lang.String str12 = commandLine0.getOptionValue("", "org.apache.commons.cli.UnrecognizedOptionException: ");
        java.lang.String[] strArray13 = commandLine0.getArgs();
        commandLine0.addArg("arg");
        java.lang.Object obj17 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray19 = commandLine0.getOptionValues('a');
        org.apache.commons.cli.Option[] optionArray20 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: " + "'", str12, "org.apache.commons.cli.UnrecognizedOptionException: ");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(optionArray20);
    }
}

