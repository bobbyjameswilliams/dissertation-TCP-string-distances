package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup4 = options1.getOptionGroup(option3);
        org.apache.commons.cli.Option option6 = org.apache.commons.cli.OptionBuilder.create('4');
        char char7 = option6.getValueSeparator();
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setDescription("");
        option6.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup13 = options1.getOptionGroup(option6);
        boolean boolean15 = options1.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option19 = org.apache.commons.cli.OptionBuilder.create('4');
        option19.setDescription("");
        org.apache.commons.cli.Options options22 = options17.addOption(option19);
        org.apache.commons.cli.CommandLine commandLine23 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray25 = commandLine23.getOptionValues("hi!");
        java.lang.String str28 = commandLine23.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str30 = commandLine23.getOptionValue("arg");
        java.lang.String[] strArray31 = commandLine23.getArgs();
        java.lang.String[] strArray33 = posixParser16.flatten(options22, strArray31, false);
        java.util.Properties properties34 = null;
        org.apache.commons.cli.CommandLine commandLine35 = posixParser0.parse(options1, strArray33, properties34);
        java.lang.String[] strArray37 = commandLine35.getOptionValues('\000');
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNull(optionGroup4);
        org.junit.Assert.assertNotNull(option6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertNull(optionGroup13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(option19);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str28, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNull(strArray37);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        java.util.Collection collection7 = options1.getOptionGroups();
        org.apache.commons.cli.CommandLine commandLine8 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray10 = commandLine8.getOptionValues("hi!");
        java.lang.String str13 = commandLine8.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str15 = commandLine8.getOptionValue("arg");
        java.lang.String[] strArray16 = commandLine8.getArgs();
        java.util.Properties properties17 = null;
        org.apache.commons.cli.CommandLine commandLine18 = posixParser0.parse(options1, strArray16, properties17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options23 = options1.addOption("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]", false, "[ option: 4  :: null ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '['");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str13, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(commandLine18);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = org.apache.commons.cli.OptionBuilder.create('4');
        option20.setDescription("");
        org.apache.commons.cli.Options options23 = options18.addOption(option20);
        java.util.Collection collection24 = options18.getOptionGroups();
        org.apache.commons.cli.Option option26 = org.apache.commons.cli.OptionBuilder.create('4');
        option26.setDescription("");
        option26.setLongOpt("hi!");
        boolean boolean31 = option26.hasArgName();
        org.apache.commons.cli.Options options32 = options18.addOption(option26);
        org.apache.commons.cli.CommandLine commandLine33 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray35 = commandLine33.getOptionValues("hi!");
        java.lang.String[] strArray36 = commandLine33.getArgs();
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser0.parse(options18, strArray36, properties37, true);
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option42 = org.apache.commons.cli.OptionBuilder.create('4');
        option42.setDescription("");
        org.apache.commons.cli.Options options45 = options40.addOption(option42);
        java.util.Collection collection46 = options40.getOptionGroups();
        org.apache.commons.cli.Options options50 = options40.addOption("", false, "arg");
        org.apache.commons.cli.Options options51 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option53 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup54 = options51.getOptionGroup(option53);
        org.apache.commons.cli.Option option56 = org.apache.commons.cli.OptionBuilder.create('4');
        char char57 = option56.getValueSeparator();
        org.apache.commons.cli.Option option59 = org.apache.commons.cli.OptionBuilder.create('4');
        option59.setDescription("");
        option56.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup63 = options51.getOptionGroup(option56);
        boolean boolean64 = option56.hasArgName();
        org.apache.commons.cli.Options options65 = options40.addOption(option56);
        org.apache.commons.cli.CommandLine commandLine66 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray68 = commandLine66.getOptionValues("hi!");
        java.lang.String str71 = commandLine66.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str73 = commandLine66.getOptionValue("arg");
        java.lang.String[] strArray74 = commandLine66.getArgs();
        java.util.Properties properties75 = null;
        org.apache.commons.cli.CommandLine commandLine76 = posixParser0.parse(options40, strArray74, properties75);
        org.apache.commons.cli.OptionGroup optionGroup77 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options78 = options40.addOptionGroup(optionGroup77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option20);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNotNull(option42);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(option53);
        org.junit.Assert.assertNull(optionGroup54);
        org.junit.Assert.assertNotNull(option56);
        org.junit.Assert.assertTrue("'" + char57 + "' != '" + '\000' + "'", char57 == '\000');
        org.junit.Assert.assertNotNull(option59);
        org.junit.Assert.assertNull(optionGroup63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(options65);
        org.junit.Assert.assertNull(strArray68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str71, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(commandLine76);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        boolean boolean4 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = org.apache.commons.cli.OptionBuilder.create('4');
        option20.setDescription("");
        org.apache.commons.cli.Options options23 = options18.addOption(option20);
        java.util.Collection collection24 = options18.getOptionGroups();
        org.apache.commons.cli.Option option26 = org.apache.commons.cli.OptionBuilder.create('4');
        option26.setDescription("");
        option26.setLongOpt("hi!");
        boolean boolean31 = option26.hasArgName();
        org.apache.commons.cli.Options options32 = options18.addOption(option26);
        org.apache.commons.cli.CommandLine commandLine33 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray35 = commandLine33.getOptionValues("hi!");
        java.lang.String[] strArray36 = commandLine33.getArgs();
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser0.parse(options18, strArray36, properties37, true);
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option42 = org.apache.commons.cli.OptionBuilder.create('4');
        option42.setDescription("");
        org.apache.commons.cli.Options options45 = options40.addOption(option42);
        java.util.Collection collection46 = options40.getOptionGroups();
        org.apache.commons.cli.Options options50 = options40.addOption("", false, "arg");
        org.apache.commons.cli.Options options51 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option53 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup54 = options51.getOptionGroup(option53);
        org.apache.commons.cli.Option option56 = org.apache.commons.cli.OptionBuilder.create('4');
        char char57 = option56.getValueSeparator();
        org.apache.commons.cli.Option option59 = org.apache.commons.cli.OptionBuilder.create('4');
        option59.setDescription("");
        option56.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup63 = options51.getOptionGroup(option56);
        boolean boolean64 = option56.hasArgName();
        org.apache.commons.cli.Options options65 = options40.addOption(option56);
        org.apache.commons.cli.CommandLine commandLine66 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray68 = commandLine66.getOptionValues("hi!");
        java.lang.String str71 = commandLine66.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str73 = commandLine66.getOptionValue("arg");
        java.lang.String[] strArray74 = commandLine66.getArgs();
        java.util.Properties properties75 = null;
        org.apache.commons.cli.CommandLine commandLine76 = posixParser0.parse(options40, strArray74, properties75);
        posixParser0.burstToken("[ option: 4  :: null ]", true);
        org.apache.commons.cli.Options options80 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option82 = org.apache.commons.cli.OptionBuilder.create('4');
        char char83 = option82.getValueSeparator();
        org.apache.commons.cli.Option option85 = org.apache.commons.cli.OptionBuilder.create('4');
        option85.setDescription("");
        option82.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup89 = options80.getOptionGroup(option82);
        java.util.ListIterator listIterator90 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option82, listIterator90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option20);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNotNull(option42);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(option53);
        org.junit.Assert.assertNull(optionGroup54);
        org.junit.Assert.assertNotNull(option56);
        org.junit.Assert.assertTrue("'" + char57 + "' != '" + '\000' + "'", char57 == '\000');
        org.junit.Assert.assertNotNull(option59);
        org.junit.Assert.assertNull(optionGroup63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(options65);
        org.junit.Assert.assertNull(strArray68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str71, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(commandLine76);
        org.junit.Assert.assertNotNull(option82);
        org.junit.Assert.assertTrue("'" + char83 + "' != '" + '\000' + "'", char83 == '\000');
        org.junit.Assert.assertNotNull(option85);
        org.junit.Assert.assertNull(optionGroup89);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create('4');
        option10.setDescription("");
        org.apache.commons.cli.Options options13 = options8.addOption(option10);
        org.apache.commons.cli.CommandLine commandLine14 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser7.parse(options8, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.parse(options6, strArray17, false);
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option24 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup25 = options22.getOptionGroup(option24);
        org.apache.commons.cli.Option option27 = org.apache.commons.cli.OptionBuilder.create('4');
        char char28 = option27.getValueSeparator();
        org.apache.commons.cli.Option option30 = org.apache.commons.cli.OptionBuilder.create('4');
        option30.setDescription("");
        option27.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup34 = options22.getOptionGroup(option27);
        boolean boolean36 = options22.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option40 = org.apache.commons.cli.OptionBuilder.create('4');
        option40.setDescription("");
        org.apache.commons.cli.Options options43 = options38.addOption(option40);
        org.apache.commons.cli.CommandLine commandLine44 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray46 = commandLine44.getOptionValues("hi!");
        java.lang.String[] strArray47 = commandLine44.getArgs();
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine49 = posixParser37.parse(options38, strArray47, properties48);
        java.util.Properties properties50 = null;
        org.apache.commons.cli.CommandLine commandLine52 = posixParser0.parse(options22, strArray47, properties50, true);
        org.apache.commons.cli.Options options53 = null;
        org.apache.commons.cli.PosixParser posixParser54 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options55 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option57 = org.apache.commons.cli.OptionBuilder.create('4');
        option57.setDescription("");
        org.apache.commons.cli.Options options60 = options55.addOption(option57);
        org.apache.commons.cli.CommandLine commandLine61 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray63 = commandLine61.getOptionValues("hi!");
        java.lang.String str66 = commandLine61.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str68 = commandLine61.getOptionValue("arg");
        java.lang.String[] strArray69 = commandLine61.getArgs();
        java.lang.String[] strArray71 = posixParser54.flatten(options60, strArray69, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine72 = posixParser0.parse(options53, strArray69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNull(optionGroup25);
        org.junit.Assert.assertNotNull(option27);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertNotNull(option30);
        org.junit.Assert.assertNull(optionGroup34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNotNull(option57);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNull(strArray63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str66, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray71);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass4 = commandLine0.getClass();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = org.apache.commons.cli.OptionBuilder.create('4');
        option20.setDescription("");
        org.apache.commons.cli.Options options23 = options18.addOption(option20);
        java.util.Collection collection24 = options18.getOptionGroups();
        org.apache.commons.cli.Options options28 = options18.addOption("", false, "arg");
        java.lang.String[] strArray29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray31 = posixParser0.flatten(options28, strArray29, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option20);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(options28);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup4 = options1.getOptionGroup(option3);
        org.apache.commons.cli.Option option6 = org.apache.commons.cli.OptionBuilder.create('4');
        char char7 = option6.getValueSeparator();
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setDescription("");
        option6.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup13 = options1.getOptionGroup(option6);
        boolean boolean15 = options1.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option19 = org.apache.commons.cli.OptionBuilder.create('4');
        option19.setDescription("");
        org.apache.commons.cli.Options options22 = options17.addOption(option19);
        org.apache.commons.cli.CommandLine commandLine23 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray25 = commandLine23.getOptionValues("hi!");
        java.lang.String str28 = commandLine23.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str30 = commandLine23.getOptionValue("arg");
        java.lang.String[] strArray31 = commandLine23.getArgs();
        java.lang.String[] strArray33 = posixParser16.flatten(options22, strArray31, false);
        java.util.Properties properties34 = null;
        org.apache.commons.cli.CommandLine commandLine35 = posixParser0.parse(options1, strArray33, properties34);
        java.util.List list36 = commandLine35.getArgList();
        org.apache.commons.cli.Option[] optionArray37 = commandLine35.getOptions();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNull(optionGroup4);
        org.junit.Assert.assertNotNull(option6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertNull(optionGroup13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(option19);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str28, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(optionArray37);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create('4');
        option10.setDescription("");
        org.apache.commons.cli.Options options13 = options8.addOption(option10);
        org.apache.commons.cli.CommandLine commandLine14 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser7.parse(options8, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.parse(options6, strArray17, false);
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option24 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup25 = options22.getOptionGroup(option24);
        org.apache.commons.cli.Option option27 = org.apache.commons.cli.OptionBuilder.create('4');
        char char28 = option27.getValueSeparator();
        org.apache.commons.cli.Option option30 = org.apache.commons.cli.OptionBuilder.create('4');
        option30.setDescription("");
        option27.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup34 = options22.getOptionGroup(option27);
        boolean boolean36 = options22.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option40 = org.apache.commons.cli.OptionBuilder.create('4');
        option40.setDescription("");
        org.apache.commons.cli.Options options43 = options38.addOption(option40);
        org.apache.commons.cli.CommandLine commandLine44 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray46 = commandLine44.getOptionValues("hi!");
        java.lang.String[] strArray47 = commandLine44.getArgs();
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine49 = posixParser37.parse(options38, strArray47, properties48);
        java.util.Properties properties50 = null;
        org.apache.commons.cli.CommandLine commandLine52 = posixParser0.parse(options22, strArray47, properties50, true);
        org.apache.commons.cli.Options options53 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option55 = org.apache.commons.cli.OptionBuilder.create('4');
        option55.setDescription("");
        org.apache.commons.cli.Options options58 = options53.addOption(option55);
        java.util.Collection collection59 = options53.getOptions();
        java.lang.String[] strArray60 = null;
        org.apache.commons.cli.CommandLine commandLine62 = posixParser0.parse(options53, strArray60, true);
        org.apache.commons.cli.Option option64 = org.apache.commons.cli.OptionBuilder.create('4');
        boolean boolean65 = option64.hasArgs();
        java.lang.Object obj66 = option64.getType();
        java.util.ListIterator listIterator67 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option64, listIterator67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNull(optionGroup25);
        org.junit.Assert.assertNotNull(option27);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertNotNull(option30);
        org.junit.Assert.assertNull(optionGroup34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNotNull(option55);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(commandLine62);
        org.junit.Assert.assertNotNull(option64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(obj66);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create('4');
        option10.setDescription("");
        org.apache.commons.cli.Options options13 = options8.addOption(option10);
        org.apache.commons.cli.CommandLine commandLine14 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser7.parse(options8, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.parse(options6, strArray17, false);
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option24 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup25 = options22.getOptionGroup(option24);
        org.apache.commons.cli.Option option27 = org.apache.commons.cli.OptionBuilder.create('4');
        char char28 = option27.getValueSeparator();
        org.apache.commons.cli.Option option30 = org.apache.commons.cli.OptionBuilder.create('4');
        option30.setDescription("");
        option27.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup34 = options22.getOptionGroup(option27);
        boolean boolean36 = options22.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option40 = org.apache.commons.cli.OptionBuilder.create('4');
        option40.setDescription("");
        org.apache.commons.cli.Options options43 = options38.addOption(option40);
        org.apache.commons.cli.CommandLine commandLine44 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray46 = commandLine44.getOptionValues("hi!");
        java.lang.String[] strArray47 = commandLine44.getArgs();
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine49 = posixParser37.parse(options38, strArray47, properties48);
        java.util.Properties properties50 = null;
        org.apache.commons.cli.CommandLine commandLine52 = posixParser0.parse(options22, strArray47, properties50, true);
        org.apache.commons.cli.Options options53 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option55 = org.apache.commons.cli.OptionBuilder.create('4');
        option55.setDescription("");
        org.apache.commons.cli.Options options58 = options53.addOption(option55);
        java.util.Collection collection59 = options53.getOptions();
        org.apache.commons.cli.Options options60 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option62 = org.apache.commons.cli.OptionBuilder.create('4');
        char char63 = option62.getValueSeparator();
        org.apache.commons.cli.Option option65 = org.apache.commons.cli.OptionBuilder.create('4');
        option65.setDescription("");
        option62.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup69 = options60.getOptionGroup(option62);
        option62.setOptionalArg(true);
        int int72 = option62.getId();
        org.apache.commons.cli.Options options73 = options53.addOption(option62);
        boolean boolean75 = options73.hasOption("");
        org.apache.commons.cli.PosixParser posixParser76 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options77 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option79 = org.apache.commons.cli.OptionBuilder.create('4');
        option79.setDescription("");
        org.apache.commons.cli.Options options82 = options77.addOption(option79);
        org.apache.commons.cli.PosixParser posixParser83 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options84 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option86 = org.apache.commons.cli.OptionBuilder.create('4');
        option86.setDescription("");
        org.apache.commons.cli.Options options89 = options84.addOption(option86);
        org.apache.commons.cli.CommandLine commandLine90 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray92 = commandLine90.getOptionValues("hi!");
        java.lang.String[] strArray93 = commandLine90.getArgs();
        java.util.Properties properties94 = null;
        org.apache.commons.cli.CommandLine commandLine95 = posixParser83.parse(options84, strArray93, properties94);
        org.apache.commons.cli.CommandLine commandLine97 = posixParser76.parse(options82, strArray93, false);
        org.apache.commons.cli.CommandLine commandLine98 = posixParser0.parse(options73, strArray93);
        org.apache.commons.cli.Option[] optionArray99 = commandLine98.getOptions();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNull(optionGroup25);
        org.junit.Assert.assertNotNull(option27);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertNotNull(option30);
        org.junit.Assert.assertNull(optionGroup34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNotNull(option55);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(option62);
        org.junit.Assert.assertTrue("'" + char63 + "' != '" + '\000' + "'", char63 == '\000');
        org.junit.Assert.assertNotNull(option65);
        org.junit.Assert.assertNull(optionGroup69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 52 + "'", int72 == 52);
        org.junit.Assert.assertNotNull(options73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(option79);
        org.junit.Assert.assertNotNull(options82);
        org.junit.Assert.assertNotNull(option86);
        org.junit.Assert.assertNotNull(options89);
        org.junit.Assert.assertNull(strArray92);
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertNotNull(commandLine95);
        org.junit.Assert.assertNotNull(commandLine97);
        org.junit.Assert.assertNotNull(commandLine98);
        org.junit.Assert.assertNotNull(optionArray99);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue('\000');
        boolean boolean7 = commandLine0.hasOption('#');
        java.lang.String str9 = commandLine0.getOptionValue("[ option: 4  ::  ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        boolean boolean5 = commandLine0.hasOption("hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.Object obj8 = commandLine0.getOptionObject("[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create('4');
        option10.setDescription("");
        org.apache.commons.cli.Options options13 = options8.addOption(option10);
        org.apache.commons.cli.CommandLine commandLine14 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser7.parse(options8, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.parse(options6, strArray17, false);
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option24 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup25 = options22.getOptionGroup(option24);
        org.apache.commons.cli.Option option27 = org.apache.commons.cli.OptionBuilder.create('4');
        char char28 = option27.getValueSeparator();
        org.apache.commons.cli.Option option30 = org.apache.commons.cli.OptionBuilder.create('4');
        option30.setDescription("");
        option27.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup34 = options22.getOptionGroup(option27);
        boolean boolean36 = options22.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option40 = org.apache.commons.cli.OptionBuilder.create('4');
        option40.setDescription("");
        org.apache.commons.cli.Options options43 = options38.addOption(option40);
        org.apache.commons.cli.CommandLine commandLine44 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray46 = commandLine44.getOptionValues("hi!");
        java.lang.String[] strArray47 = commandLine44.getArgs();
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine49 = posixParser37.parse(options38, strArray47, properties48);
        java.util.Properties properties50 = null;
        org.apache.commons.cli.CommandLine commandLine52 = posixParser0.parse(options22, strArray47, properties50, true);
        org.apache.commons.cli.Options options53 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option55 = org.apache.commons.cli.OptionBuilder.create('4');
        option55.setDescription("");
        org.apache.commons.cli.Options options58 = options53.addOption(option55);
        java.util.Collection collection59 = options53.getOptions();
        org.apache.commons.cli.Options options60 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option62 = org.apache.commons.cli.OptionBuilder.create('4');
        char char63 = option62.getValueSeparator();
        org.apache.commons.cli.Option option65 = org.apache.commons.cli.OptionBuilder.create('4');
        option65.setDescription("");
        option62.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup69 = options60.getOptionGroup(option62);
        option62.setOptionalArg(true);
        int int72 = option62.getId();
        org.apache.commons.cli.Options options73 = options53.addOption(option62);
        boolean boolean75 = options73.hasOption("");
        org.apache.commons.cli.PosixParser posixParser76 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options77 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option79 = org.apache.commons.cli.OptionBuilder.create('4');
        option79.setDescription("");
        org.apache.commons.cli.Options options82 = options77.addOption(option79);
        org.apache.commons.cli.PosixParser posixParser83 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options84 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option86 = org.apache.commons.cli.OptionBuilder.create('4');
        option86.setDescription("");
        org.apache.commons.cli.Options options89 = options84.addOption(option86);
        org.apache.commons.cli.CommandLine commandLine90 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray92 = commandLine90.getOptionValues("hi!");
        java.lang.String[] strArray93 = commandLine90.getArgs();
        java.util.Properties properties94 = null;
        org.apache.commons.cli.CommandLine commandLine95 = posixParser83.parse(options84, strArray93, properties94);
        org.apache.commons.cli.CommandLine commandLine97 = posixParser76.parse(options82, strArray93, false);
        org.apache.commons.cli.CommandLine commandLine98 = posixParser0.parse(options73, strArray93);
        java.util.Collection collection99 = options73.getOptions();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNull(optionGroup25);
        org.junit.Assert.assertNotNull(option27);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertNotNull(option30);
        org.junit.Assert.assertNull(optionGroup34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNotNull(option55);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(option62);
        org.junit.Assert.assertTrue("'" + char63 + "' != '" + '\000' + "'", char63 == '\000');
        org.junit.Assert.assertNotNull(option65);
        org.junit.Assert.assertNull(optionGroup69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 52 + "'", int72 == 52);
        org.junit.Assert.assertNotNull(options73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(option79);
        org.junit.Assert.assertNotNull(options82);
        org.junit.Assert.assertNotNull(option86);
        org.junit.Assert.assertNotNull(options89);
        org.junit.Assert.assertNull(strArray92);
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertNotNull(commandLine95);
        org.junit.Assert.assertNotNull(commandLine97);
        org.junit.Assert.assertNotNull(commandLine98);
        org.junit.Assert.assertNotNull(collection99);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        posixParser0.burstToken("hi!", true);
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option23 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup24 = options21.getOptionGroup(option23);
        org.apache.commons.cli.Option option26 = org.apache.commons.cli.OptionBuilder.create('4');
        char char27 = option26.getValueSeparator();
        org.apache.commons.cli.Option option29 = org.apache.commons.cli.OptionBuilder.create('4');
        option29.setDescription("");
        option26.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup33 = options21.getOptionGroup(option26);
        java.lang.String[] strArray34 = null;
        java.util.Properties properties35 = null;
        org.apache.commons.cli.CommandLine commandLine36 = posixParser0.parse(options21, strArray34, properties35);
        org.apache.commons.cli.Option option38 = options21.getOption("[ option:    :: null ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options42 = options21.addOption("org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!", false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '.'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option23);
        org.junit.Assert.assertNull(optionGroup24);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\000' + "'", char27 == '\000');
        org.junit.Assert.assertNotNull(option29);
        org.junit.Assert.assertNull(optionGroup33);
        org.junit.Assert.assertNotNull(commandLine36);
        org.junit.Assert.assertNull(option38);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create('4');
        option10.setDescription("");
        org.apache.commons.cli.Options options13 = options8.addOption(option10);
        org.apache.commons.cli.CommandLine commandLine14 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser7.parse(options8, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.parse(options6, strArray17, false);
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option24 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup25 = options22.getOptionGroup(option24);
        org.apache.commons.cli.Option option27 = org.apache.commons.cli.OptionBuilder.create('4');
        char char28 = option27.getValueSeparator();
        org.apache.commons.cli.Option option30 = org.apache.commons.cli.OptionBuilder.create('4');
        option30.setDescription("");
        option27.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup34 = options22.getOptionGroup(option27);
        boolean boolean36 = options22.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option40 = org.apache.commons.cli.OptionBuilder.create('4');
        option40.setDescription("");
        org.apache.commons.cli.Options options43 = options38.addOption(option40);
        org.apache.commons.cli.CommandLine commandLine44 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray46 = commandLine44.getOptionValues("hi!");
        java.lang.String[] strArray47 = commandLine44.getArgs();
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine49 = posixParser37.parse(options38, strArray47, properties48);
        java.util.Properties properties50 = null;
        org.apache.commons.cli.CommandLine commandLine52 = posixParser0.parse(options22, strArray47, properties50, true);
        java.util.Collection collection53 = options22.getOptionGroups();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options57 = options22.addOption("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]", false, "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '['");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNull(optionGroup25);
        org.junit.Assert.assertNotNull(option27);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertNotNull(option30);
        org.junit.Assert.assertNull(optionGroup34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNotNull(collection53);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]", "[ option:    :: null ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ option:    :: null ]" + "'", str6, "[ option:    :: null ]");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option4 = org.apache.commons.cli.OptionBuilder.create('4');
        option4.setDescription("");
        org.apache.commons.cli.Options options7 = options2.addOption(option4);
        java.util.Collection collection8 = options2.getOptionGroups();
        org.apache.commons.cli.Options options12 = options2.addOption("", false, "arg");
        java.util.List list13 = options12.getRequiredOptions();
        org.apache.commons.cli.Option option15 = org.apache.commons.cli.OptionBuilder.create("arg");
        org.apache.commons.cli.Options options16 = options12.addOption(option15);
        boolean boolean18 = options12.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option22 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup23 = options20.getOptionGroup(option22);
        org.apache.commons.cli.Option option25 = org.apache.commons.cli.OptionBuilder.create('4');
        char char26 = option25.getValueSeparator();
        org.apache.commons.cli.Option option28 = org.apache.commons.cli.OptionBuilder.create('4');
        option28.setDescription("");
        option25.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup32 = options20.getOptionGroup(option25);
        boolean boolean34 = options20.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser35 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options36 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option38 = org.apache.commons.cli.OptionBuilder.create('4');
        option38.setDescription("");
        org.apache.commons.cli.Options options41 = options36.addOption(option38);
        org.apache.commons.cli.CommandLine commandLine42 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray44 = commandLine42.getOptionValues("hi!");
        java.lang.String str47 = commandLine42.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str49 = commandLine42.getOptionValue("arg");
        java.lang.String[] strArray50 = commandLine42.getArgs();
        java.lang.String[] strArray52 = posixParser35.flatten(options41, strArray50, false);
        java.util.Properties properties53 = null;
        org.apache.commons.cli.CommandLine commandLine54 = posixParser19.parse(options20, strArray52, properties53);
        org.apache.commons.cli.Options options55 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option57 = org.apache.commons.cli.OptionBuilder.create('4');
        option57.setDescription("");
        org.apache.commons.cli.Options options60 = options55.addOption(option57);
        java.util.Collection collection61 = options55.getOptionGroups();
        org.apache.commons.cli.Options options65 = options55.addOption("", false, "arg");
        org.apache.commons.cli.Options options66 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option68 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup69 = options66.getOptionGroup(option68);
        org.apache.commons.cli.Option option71 = org.apache.commons.cli.OptionBuilder.create('4');
        char char72 = option71.getValueSeparator();
        org.apache.commons.cli.Option option74 = org.apache.commons.cli.OptionBuilder.create('4');
        option74.setDescription("");
        option71.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup78 = options66.getOptionGroup(option71);
        boolean boolean79 = option71.hasArgName();
        org.apache.commons.cli.Options options80 = options55.addOption(option71);
        java.util.List list81 = options55.helpOptions();
        org.apache.commons.cli.CommandLine commandLine82 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray84 = commandLine82.getOptionValues("hi!");
        java.lang.String str87 = commandLine82.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str89 = commandLine82.getOptionValue("arg");
        java.lang.String[] strArray90 = commandLine82.getArgs();
        java.lang.String[] strArray92 = posixParser19.flatten(options55, strArray90, false);
        java.util.Properties properties93 = null;
        org.apache.commons.cli.CommandLine commandLine94 = posixParser1.parse(options12, strArray92, properties93);
        java.lang.String[] strArray95 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray97 = posixParser0.flatten(options12, strArray95, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option4);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(option15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(option22);
        org.junit.Assert.assertNull(optionGroup23);
        org.junit.Assert.assertNotNull(option25);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
        org.junit.Assert.assertNotNull(option28);
        org.junit.Assert.assertNull(optionGroup32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(option38);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str47, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(commandLine54);
        org.junit.Assert.assertNotNull(option57);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNotNull(options65);
        org.junit.Assert.assertNotNull(option68);
        org.junit.Assert.assertNull(optionGroup69);
        org.junit.Assert.assertNotNull(option71);
        org.junit.Assert.assertTrue("'" + char72 + "' != '" + '\000' + "'", char72 == '\000');
        org.junit.Assert.assertNotNull(option74);
        org.junit.Assert.assertNull(optionGroup78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(options80);
        org.junit.Assert.assertNotNull(list81);
        org.junit.Assert.assertNull(strArray84);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str87, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertNotNull(commandLine94);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = org.apache.commons.cli.OptionBuilder.create('4');
        option20.setDescription("");
        org.apache.commons.cli.Options options23 = options18.addOption(option20);
        java.util.Collection collection24 = options18.getOptionGroups();
        org.apache.commons.cli.Option option26 = org.apache.commons.cli.OptionBuilder.create('4');
        option26.setDescription("");
        option26.setLongOpt("hi!");
        boolean boolean31 = option26.hasArgName();
        org.apache.commons.cli.Options options32 = options18.addOption(option26);
        org.apache.commons.cli.CommandLine commandLine33 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray35 = commandLine33.getOptionValues("hi!");
        java.lang.String[] strArray36 = commandLine33.getArgs();
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser0.parse(options18, strArray36, properties37, true);
        org.apache.commons.cli.Option[] optionArray40 = commandLine39.getOptions();
        java.util.Iterator iterator41 = commandLine39.iterator();
        java.lang.String str43 = commandLine39.getOptionValue('a');
        java.util.Iterator iterator44 = commandLine39.iterator();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option20);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNotNull(optionArray40);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(iterator44);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup4 = options1.getOptionGroup(option3);
        org.apache.commons.cli.Option option6 = org.apache.commons.cli.OptionBuilder.create('4');
        char char7 = option6.getValueSeparator();
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setDescription("");
        option6.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup13 = options1.getOptionGroup(option6);
        boolean boolean15 = options1.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option19 = org.apache.commons.cli.OptionBuilder.create('4');
        option19.setDescription("");
        org.apache.commons.cli.Options options22 = options17.addOption(option19);
        org.apache.commons.cli.CommandLine commandLine23 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray25 = commandLine23.getOptionValues("hi!");
        java.lang.String str28 = commandLine23.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str30 = commandLine23.getOptionValue("arg");
        java.lang.String[] strArray31 = commandLine23.getArgs();
        java.lang.String[] strArray33 = posixParser16.flatten(options22, strArray31, false);
        java.util.Properties properties34 = null;
        org.apache.commons.cli.CommandLine commandLine35 = posixParser0.parse(options1, strArray33, properties34);
        posixParser0.burstToken("4", false);
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option41 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup42 = options39.getOptionGroup(option41);
        org.apache.commons.cli.Option option44 = org.apache.commons.cli.OptionBuilder.create('4');
        char char45 = option44.getValueSeparator();
        org.apache.commons.cli.Option option47 = org.apache.commons.cli.OptionBuilder.create('4');
        option47.setDescription("");
        option44.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup51 = options39.getOptionGroup(option44);
        java.util.Collection collection52 = options39.getOptions();
        java.lang.String[] strArray53 = null;
        org.apache.commons.cli.CommandLine commandLine54 = posixParser0.parse(options39, strArray53);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options59 = options39.addOption("[ option: 4  ::  ]", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]", false, "[ option: 4  ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '['");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNull(optionGroup4);
        org.junit.Assert.assertNotNull(option6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertNull(optionGroup13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(option19);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str28, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNotNull(option41);
        org.junit.Assert.assertNull(optionGroup42);
        org.junit.Assert.assertNotNull(option44);
        org.junit.Assert.assertTrue("'" + char45 + "' != '" + '\000' + "'", char45 == '\000');
        org.junit.Assert.assertNotNull(option47);
        org.junit.Assert.assertNull(optionGroup51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(commandLine54);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup4 = options1.getOptionGroup(option3);
        org.apache.commons.cli.CommandLine commandLine5 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray7 = commandLine5.getOptionValues("hi!");
        java.lang.String str10 = commandLine5.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str12 = commandLine5.getOptionValue("arg");
        java.lang.String[] strArray13 = commandLine5.getArgs();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = org.apache.commons.cli.OptionBuilder.create('4');
        option20.setDescription("");
        org.apache.commons.cli.Options options23 = options18.addOption(option20);
        org.apache.commons.cli.CommandLine commandLine24 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray26 = commandLine24.getOptionValues("hi!");
        java.lang.String str29 = commandLine24.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str31 = commandLine24.getOptionValue("arg");
        java.lang.String[] strArray32 = commandLine24.getArgs();
        java.lang.String[] strArray34 = posixParser17.flatten(options23, strArray32, false);
        org.apache.commons.cli.Options options35 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option37 = org.apache.commons.cli.OptionBuilder.create('4');
        option37.setDescription("");
        org.apache.commons.cli.Options options40 = options35.addOption(option37);
        java.util.Collection collection41 = options35.getOptionGroups();
        org.apache.commons.cli.Option option43 = org.apache.commons.cli.OptionBuilder.create('4');
        option43.setDescription("");
        option43.setLongOpt("hi!");
        boolean boolean48 = option43.hasArgName();
        org.apache.commons.cli.Options options49 = options35.addOption(option43);
        org.apache.commons.cli.CommandLine commandLine50 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray52 = commandLine50.getOptionValues("hi!");
        java.lang.String[] strArray53 = commandLine50.getArgs();
        java.util.Properties properties54 = null;
        org.apache.commons.cli.CommandLine commandLine56 = posixParser17.parse(options35, strArray53, properties54, true);
        org.apache.commons.cli.Options options57 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option59 = org.apache.commons.cli.OptionBuilder.create('4');
        option59.setDescription("");
        org.apache.commons.cli.Options options62 = options57.addOption(option59);
        java.util.Collection collection63 = options57.getOptionGroups();
        org.apache.commons.cli.Options options67 = options57.addOption("", false, "arg");
        org.apache.commons.cli.Options options68 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option70 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup71 = options68.getOptionGroup(option70);
        org.apache.commons.cli.Option option73 = org.apache.commons.cli.OptionBuilder.create('4');
        char char74 = option73.getValueSeparator();
        org.apache.commons.cli.Option option76 = org.apache.commons.cli.OptionBuilder.create('4');
        option76.setDescription("");
        option73.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup80 = options68.getOptionGroup(option73);
        boolean boolean81 = option73.hasArgName();
        org.apache.commons.cli.Options options82 = options57.addOption(option73);
        org.apache.commons.cli.CommandLine commandLine83 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray85 = commandLine83.getOptionValues("hi!");
        java.lang.String str88 = commandLine83.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str90 = commandLine83.getOptionValue("arg");
        java.lang.String[] strArray91 = commandLine83.getArgs();
        java.util.Properties properties92 = null;
        org.apache.commons.cli.CommandLine commandLine93 = posixParser17.parse(options57, strArray91, properties92);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine95 = posixParser0.parse(options16, strArray91, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNull(optionGroup4);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str10, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(option20);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str29, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(option37);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(option43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(commandLine56);
        org.junit.Assert.assertNotNull(option59);
        org.junit.Assert.assertNotNull(options62);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(options67);
        org.junit.Assert.assertNotNull(option70);
        org.junit.Assert.assertNull(optionGroup71);
        org.junit.Assert.assertNotNull(option73);
        org.junit.Assert.assertTrue("'" + char74 + "' != '" + '\000' + "'", char74 == '\000');
        org.junit.Assert.assertNotNull(option76);
        org.junit.Assert.assertNull(optionGroup80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(options82);
        org.junit.Assert.assertNull(strArray85);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str88, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertNotNull(commandLine93);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup4 = options1.getOptionGroup(option3);
        org.apache.commons.cli.Option option6 = org.apache.commons.cli.OptionBuilder.create('4');
        char char7 = option6.getValueSeparator();
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setDescription("");
        option6.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup13 = options1.getOptionGroup(option6);
        boolean boolean15 = options1.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option19 = org.apache.commons.cli.OptionBuilder.create('4');
        option19.setDescription("");
        org.apache.commons.cli.Options options22 = options17.addOption(option19);
        org.apache.commons.cli.CommandLine commandLine23 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray25 = commandLine23.getOptionValues("hi!");
        java.lang.String str28 = commandLine23.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str30 = commandLine23.getOptionValue("arg");
        java.lang.String[] strArray31 = commandLine23.getArgs();
        java.lang.String[] strArray33 = posixParser16.flatten(options22, strArray31, false);
        java.util.Properties properties34 = null;
        org.apache.commons.cli.CommandLine commandLine35 = posixParser0.parse(options1, strArray33, properties34);
        posixParser0.burstToken("org.apache.commons.cli.MissingOptionException: hi!", false);
        org.apache.commons.cli.Option option40 = org.apache.commons.cli.OptionBuilder.create('4');
        boolean boolean41 = option40.hasOptionalArg();
        java.lang.String str43 = option40.getValue("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        option40.setDescription("[ option: 4  ::  ]");
        java.util.ListIterator listIterator46 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option40, listIterator46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNull(optionGroup4);
        org.junit.Assert.assertNotNull(option6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertNull(optionGroup13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(option19);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str28, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str43, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str7 = commandLine0.getOptionValue("arg");
        java.util.Iterator iterator8 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass9 = commandLine0.getClass();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create('4');
        option10.setDescription("");
        org.apache.commons.cli.Options options13 = options8.addOption(option10);
        org.apache.commons.cli.CommandLine commandLine14 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser7.parse(options8, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.parse(options6, strArray17, false);
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option24 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup25 = options22.getOptionGroup(option24);
        org.apache.commons.cli.Option option27 = org.apache.commons.cli.OptionBuilder.create('4');
        char char28 = option27.getValueSeparator();
        org.apache.commons.cli.Option option30 = org.apache.commons.cli.OptionBuilder.create('4');
        option30.setDescription("");
        option27.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup34 = options22.getOptionGroup(option27);
        boolean boolean36 = options22.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option40 = org.apache.commons.cli.OptionBuilder.create('4');
        option40.setDescription("");
        org.apache.commons.cli.Options options43 = options38.addOption(option40);
        org.apache.commons.cli.CommandLine commandLine44 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray46 = commandLine44.getOptionValues("hi!");
        java.lang.String[] strArray47 = commandLine44.getArgs();
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine49 = posixParser37.parse(options38, strArray47, properties48);
        java.util.Properties properties50 = null;
        org.apache.commons.cli.CommandLine commandLine52 = posixParser0.parse(options22, strArray47, properties50, true);
        java.util.Collection collection53 = options22.getOptionGroups();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options58 = options22.addOption("[ option:    :: null ]", "hi!", false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '['");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNull(optionGroup25);
        org.junit.Assert.assertNotNull(option27);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertNotNull(option30);
        org.junit.Assert.assertNull(optionGroup34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNotNull(collection53);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        boolean boolean19 = options6.hasOption("arg");
        java.util.Collection collection20 = options6.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options24 = options6.addOption("org.apache.commons.cli.UnrecognizedOptionException: hi!", false, "[ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '.'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create('4');
        option10.setDescription("");
        org.apache.commons.cli.Options options13 = options8.addOption(option10);
        org.apache.commons.cli.CommandLine commandLine14 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser7.parse(options8, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.parse(options6, strArray17, false);
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option24 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup25 = options22.getOptionGroup(option24);
        org.apache.commons.cli.Option option27 = org.apache.commons.cli.OptionBuilder.create('4');
        char char28 = option27.getValueSeparator();
        org.apache.commons.cli.Option option30 = org.apache.commons.cli.OptionBuilder.create('4');
        option30.setDescription("");
        option27.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup34 = options22.getOptionGroup(option27);
        boolean boolean36 = options22.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option40 = org.apache.commons.cli.OptionBuilder.create('4');
        option40.setDescription("");
        org.apache.commons.cli.Options options43 = options38.addOption(option40);
        org.apache.commons.cli.CommandLine commandLine44 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray46 = commandLine44.getOptionValues("hi!");
        java.lang.String[] strArray47 = commandLine44.getArgs();
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine49 = posixParser37.parse(options38, strArray47, properties48);
        java.util.Properties properties50 = null;
        org.apache.commons.cli.CommandLine commandLine52 = posixParser0.parse(options22, strArray47, properties50, true);
        org.apache.commons.cli.Options options53 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option55 = org.apache.commons.cli.OptionBuilder.create('4');
        option55.setDescription("");
        org.apache.commons.cli.Options options58 = options53.addOption(option55);
        java.util.Collection collection59 = options53.getOptions();
        java.lang.String[] strArray60 = null;
        org.apache.commons.cli.CommandLine commandLine62 = posixParser0.parse(options53, strArray60, true);
        org.apache.commons.cli.Options options63 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option65 = org.apache.commons.cli.OptionBuilder.create('4');
        option65.setDescription("");
        org.apache.commons.cli.Options options68 = options63.addOption(option65);
        java.util.Collection collection69 = options63.getOptionGroups();
        org.apache.commons.cli.Options options73 = options63.addOption("", false, "arg");
        java.util.List list74 = options73.getRequiredOptions();
        org.apache.commons.cli.Option option76 = org.apache.commons.cli.OptionBuilder.create("arg");
        org.apache.commons.cli.Options options77 = options73.addOption(option76);
        org.apache.commons.cli.Option option79 = org.apache.commons.cli.OptionBuilder.create('4');
        option79.setArgs((int) (short) 100);
        option79.setArgName("[ option: 4  :: null ]");
        java.lang.String str84 = option79.getLongOpt();
        java.lang.String str86 = option79.getValue((int) (short) -1);
        org.apache.commons.cli.Options options87 = options77.addOption(option79);
        org.apache.commons.cli.CommandLine commandLine88 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray90 = commandLine88.getOptionValues("hi!");
        java.lang.String str93 = commandLine88.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str95 = commandLine88.getOptionValue("arg");
        java.lang.String[] strArray96 = commandLine88.getArgs();
        org.apache.commons.cli.CommandLine commandLine98 = posixParser0.parse(options87, strArray96, false);
        java.util.Collection collection99 = options87.getOptionGroups();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNull(optionGroup25);
        org.junit.Assert.assertNotNull(option27);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertNotNull(option30);
        org.junit.Assert.assertNull(optionGroup34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNotNull(option55);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(commandLine62);
        org.junit.Assert.assertNotNull(option65);
        org.junit.Assert.assertNotNull(options68);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNotNull(options73);
        org.junit.Assert.assertNotNull(list74);
        org.junit.Assert.assertNotNull(option76);
        org.junit.Assert.assertNotNull(options77);
        org.junit.Assert.assertNotNull(option79);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNotNull(options87);
        org.junit.Assert.assertNull(strArray90);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str93, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str95);
        org.junit.Assert.assertNotNull(strArray96);
        org.junit.Assert.assertNotNull(commandLine98);
        org.junit.Assert.assertNotNull(collection99);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        java.util.Collection collection7 = options1.getOptions();
        boolean boolean9 = options1.hasOption("arg");
        java.lang.String[] strArray12 = new java.lang.String[] { "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]", "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!" };
        org.apache.commons.cli.CommandLine commandLine13 = posixParser0.parse(options1, strArray12);
        org.apache.commons.cli.Options options14 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option16 = org.apache.commons.cli.OptionBuilder.create('4');
        option16.setDescription("");
        org.apache.commons.cli.Options options19 = options14.addOption(option16);
        java.util.Collection collection20 = options14.getOptionGroups();
        org.apache.commons.cli.Options options24 = options14.addOption("", false, "arg");
        java.util.List list25 = options24.getRequiredOptions();
        org.apache.commons.cli.Option option27 = org.apache.commons.cli.OptionBuilder.create("arg");
        org.apache.commons.cli.Options options28 = options24.addOption(option27);
        org.apache.commons.cli.Option option30 = org.apache.commons.cli.OptionBuilder.create('4');
        option30.setArgs((int) (short) 100);
        option30.setArgName("[ option: 4  :: null ]");
        java.lang.String str35 = option30.getLongOpt();
        java.lang.String str37 = option30.getValue((int) (short) -1);
        org.apache.commons.cli.Options options38 = options28.addOption(option30);
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option41 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup42 = options39.getOptionGroup(option41);
        boolean boolean43 = option41.hasLongOpt();
        boolean boolean44 = option41.isRequired();
        java.util.List list45 = option41.getValuesList();
        option41.setDescription("[ option: 4  ::  ]");
        org.apache.commons.cli.Options options48 = options38.addOption(option41);
        org.apache.commons.cli.PosixParser posixParser49 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options50 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option52 = org.apache.commons.cli.OptionBuilder.create('4');
        option52.setDescription("");
        org.apache.commons.cli.Options options55 = options50.addOption(option52);
        org.apache.commons.cli.CommandLine commandLine56 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray58 = commandLine56.getOptionValues("hi!");
        java.lang.String str61 = commandLine56.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str63 = commandLine56.getOptionValue("arg");
        java.lang.String[] strArray64 = commandLine56.getArgs();
        java.lang.String[] strArray66 = posixParser49.flatten(options55, strArray64, false);
        org.apache.commons.cli.CommandLine commandLine68 = posixParser0.parse(options38, strArray64, true);
        org.apache.commons.cli.OptionGroup optionGroup69 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options70 = options38.addOptionGroup(optionGroup69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(commandLine13);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(option27);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(option30);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(option41);
        org.junit.Assert.assertNull(optionGroup42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(options48);
        org.junit.Assert.assertNotNull(option52);
        org.junit.Assert.assertNotNull(options55);
        org.junit.Assert.assertNull(strArray58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str61, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(commandLine68);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = org.apache.commons.cli.OptionBuilder.create('4');
        option20.setDescription("");
        org.apache.commons.cli.Options options23 = options18.addOption(option20);
        java.util.Collection collection24 = options18.getOptionGroups();
        org.apache.commons.cli.Option option26 = org.apache.commons.cli.OptionBuilder.create('4');
        option26.setDescription("");
        option26.setLongOpt("hi!");
        boolean boolean31 = option26.hasArgName();
        org.apache.commons.cli.Options options32 = options18.addOption(option26);
        org.apache.commons.cli.CommandLine commandLine33 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray35 = commandLine33.getOptionValues("hi!");
        java.lang.String[] strArray36 = commandLine33.getArgs();
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser0.parse(options18, strArray36, properties37, true);
        org.apache.commons.cli.OptionGroup optionGroup40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options41 = options18.addOptionGroup(optionGroup40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option20);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine39);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup4 = options1.getOptionGroup(option3);
        org.apache.commons.cli.Option option6 = org.apache.commons.cli.OptionBuilder.create('4');
        char char7 = option6.getValueSeparator();
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setDescription("");
        option6.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup13 = options1.getOptionGroup(option6);
        boolean boolean15 = options1.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option19 = org.apache.commons.cli.OptionBuilder.create('4');
        option19.setDescription("");
        org.apache.commons.cli.Options options22 = options17.addOption(option19);
        org.apache.commons.cli.CommandLine commandLine23 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray25 = commandLine23.getOptionValues("hi!");
        java.lang.String str28 = commandLine23.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str30 = commandLine23.getOptionValue("arg");
        java.lang.String[] strArray31 = commandLine23.getArgs();
        java.lang.String[] strArray33 = posixParser16.flatten(options22, strArray31, false);
        java.util.Properties properties34 = null;
        org.apache.commons.cli.CommandLine commandLine35 = posixParser0.parse(options1, strArray33, properties34);
        org.apache.commons.cli.Options options36 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option38 = org.apache.commons.cli.OptionBuilder.create('4');
        option38.setDescription("");
        org.apache.commons.cli.Options options41 = options36.addOption(option38);
        java.util.Collection collection42 = options36.getOptionGroups();
        org.apache.commons.cli.Options options46 = options36.addOption("", false, "arg");
        org.apache.commons.cli.Options options47 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option49 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup50 = options47.getOptionGroup(option49);
        org.apache.commons.cli.Option option52 = org.apache.commons.cli.OptionBuilder.create('4');
        char char53 = option52.getValueSeparator();
        org.apache.commons.cli.Option option55 = org.apache.commons.cli.OptionBuilder.create('4');
        option55.setDescription("");
        option52.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup59 = options47.getOptionGroup(option52);
        boolean boolean60 = option52.hasArgName();
        org.apache.commons.cli.Options options61 = options36.addOption(option52);
        java.util.List list62 = options36.helpOptions();
        org.apache.commons.cli.CommandLine commandLine63 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray65 = commandLine63.getOptionValues("hi!");
        java.lang.String str68 = commandLine63.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str70 = commandLine63.getOptionValue("arg");
        java.lang.String[] strArray71 = commandLine63.getArgs();
        java.lang.String[] strArray73 = posixParser0.flatten(options36, strArray71, false);
        org.apache.commons.cli.PosixParser posixParser74 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options75 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option77 = org.apache.commons.cli.OptionBuilder.create('4');
        option77.setDescription("");
        org.apache.commons.cli.Options options80 = options75.addOption(option77);
        java.util.Collection collection81 = options75.getOptionGroups();
        org.apache.commons.cli.CommandLine commandLine82 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray84 = commandLine82.getOptionValues("hi!");
        java.lang.String str87 = commandLine82.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str89 = commandLine82.getOptionValue("arg");
        java.lang.String[] strArray90 = commandLine82.getArgs();
        java.util.Properties properties91 = null;
        org.apache.commons.cli.CommandLine commandLine92 = posixParser74.parse(options75, strArray90, properties91);
        java.lang.String[] strArray93 = null;
        org.apache.commons.cli.CommandLine commandLine94 = posixParser0.parse(options75, strArray93);
        java.util.List list95 = options75.getRequiredOptions();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNull(optionGroup4);
        org.junit.Assert.assertNotNull(option6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertNull(optionGroup13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(option19);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str28, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNotNull(option38);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertNotNull(option49);
        org.junit.Assert.assertNull(optionGroup50);
        org.junit.Assert.assertNotNull(option52);
        org.junit.Assert.assertTrue("'" + char53 + "' != '" + '\000' + "'", char53 == '\000');
        org.junit.Assert.assertNotNull(option55);
        org.junit.Assert.assertNull(optionGroup59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(options61);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNull(strArray65);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str68, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(option77);
        org.junit.Assert.assertNotNull(options80);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNull(strArray84);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str87, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertNotNull(commandLine92);
        org.junit.Assert.assertNotNull(commandLine94);
        org.junit.Assert.assertNotNull(list95);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = org.apache.commons.cli.OptionBuilder.create('4');
        option20.setDescription("");
        org.apache.commons.cli.Options options23 = options18.addOption(option20);
        java.util.Collection collection24 = options18.getOptionGroups();
        org.apache.commons.cli.Option option26 = org.apache.commons.cli.OptionBuilder.create('4');
        option26.setDescription("");
        option26.setLongOpt("hi!");
        boolean boolean31 = option26.hasArgName();
        org.apache.commons.cli.Options options32 = options18.addOption(option26);
        org.apache.commons.cli.CommandLine commandLine33 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray35 = commandLine33.getOptionValues("hi!");
        java.lang.String[] strArray36 = commandLine33.getArgs();
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser0.parse(options18, strArray36, properties37, true);
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option42 = org.apache.commons.cli.OptionBuilder.create('4');
        option42.setDescription("");
        org.apache.commons.cli.Options options45 = options40.addOption(option42);
        java.util.Collection collection46 = options40.getOptionGroups();
        java.lang.String[] strArray47 = null;
        org.apache.commons.cli.CommandLine commandLine48 = posixParser0.parse(options40, strArray47);
        java.lang.Class<?> wildcardClass49 = commandLine48.getClass();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option20);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNotNull(option42);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        posixParser0.burstToken("hi!", true);
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option24 = org.apache.commons.cli.OptionBuilder.create('4');
        option24.setDescription("");
        org.apache.commons.cli.Options options27 = options22.addOption(option24);
        org.apache.commons.cli.CommandLine commandLine28 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray30 = commandLine28.getOptionValues("hi!");
        java.lang.String str33 = commandLine28.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str35 = commandLine28.getOptionValue("arg");
        java.lang.String[] strArray36 = commandLine28.getArgs();
        java.lang.String[] strArray38 = posixParser21.flatten(options27, strArray36, false);
        posixParser21.burstToken("hi!", true);
        org.apache.commons.cli.Options options42 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option44 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup45 = options42.getOptionGroup(option44);
        org.apache.commons.cli.Option option47 = org.apache.commons.cli.OptionBuilder.create('4');
        char char48 = option47.getValueSeparator();
        org.apache.commons.cli.Option option50 = org.apache.commons.cli.OptionBuilder.create('4');
        option50.setDescription("");
        option47.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup54 = options42.getOptionGroup(option47);
        java.lang.String[] strArray55 = null;
        java.util.Properties properties56 = null;
        org.apache.commons.cli.CommandLine commandLine57 = posixParser21.parse(options42, strArray55, properties56);
        org.apache.commons.cli.Option option59 = options42.getOption("[ option:    :: null ]");
        java.lang.String[] strArray60 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray62 = posixParser0.flatten(options42, strArray60, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str33, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(option44);
        org.junit.Assert.assertNull(optionGroup45);
        org.junit.Assert.assertNotNull(option47);
        org.junit.Assert.assertTrue("'" + char48 + "' != '" + '\000' + "'", char48 == '\000');
        org.junit.Assert.assertNotNull(option50);
        org.junit.Assert.assertNull(optionGroup54);
        org.junit.Assert.assertNotNull(commandLine57);
        org.junit.Assert.assertNull(option59);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        posixParser0.burstToken("hi!", true);
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option23 = org.apache.commons.cli.OptionBuilder.create('4');
        option23.setDescription("");
        org.apache.commons.cli.Options options26 = options21.addOption(option23);
        java.util.Collection collection27 = options21.getOptionGroups();
        org.apache.commons.cli.Options options31 = options21.addOption("", false, "arg");
        java.util.List list32 = options31.getRequiredOptions();
        org.apache.commons.cli.Option option34 = org.apache.commons.cli.OptionBuilder.create("arg");
        org.apache.commons.cli.Options options35 = options31.addOption(option34);
        boolean boolean37 = options31.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        java.util.Collection collection38 = options31.getOptionGroups();
        org.apache.commons.cli.CommandLine commandLine39 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray41 = commandLine39.getOptionValues("hi!");
        java.lang.String str44 = commandLine39.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str46 = commandLine39.getOptionValue("arg");
        java.lang.String[] strArray47 = commandLine39.getArgs();
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine50 = posixParser0.parse(options31, strArray47, properties48, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options54 = options31.addOption("[ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]", false, "[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '['");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option23);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(option34);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(strArray41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str44, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine50);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create('4');
        option10.setDescription("");
        org.apache.commons.cli.Options options13 = options8.addOption(option10);
        org.apache.commons.cli.CommandLine commandLine14 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser7.parse(options8, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.parse(options6, strArray17, false);
        org.apache.commons.cli.OptionBuilder optionBuilder22 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) options6);
        org.apache.commons.cli.OptionGroup optionGroup23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options24 = options6.addOptionGroup(optionGroup23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(optionBuilder22);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        java.lang.Object obj6 = commandLine0.getOptionObject('#');
        boolean boolean8 = commandLine0.hasOption("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup4 = options1.getOptionGroup(option3);
        org.apache.commons.cli.Option option6 = org.apache.commons.cli.OptionBuilder.create('4');
        char char7 = option6.getValueSeparator();
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setDescription("");
        option6.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup13 = options1.getOptionGroup(option6);
        boolean boolean15 = options1.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option19 = org.apache.commons.cli.OptionBuilder.create('4');
        option19.setDescription("");
        org.apache.commons.cli.Options options22 = options17.addOption(option19);
        org.apache.commons.cli.CommandLine commandLine23 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray25 = commandLine23.getOptionValues("hi!");
        java.lang.String str28 = commandLine23.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str30 = commandLine23.getOptionValue("arg");
        java.lang.String[] strArray31 = commandLine23.getArgs();
        java.lang.String[] strArray33 = posixParser16.flatten(options22, strArray31, false);
        java.util.Properties properties34 = null;
        org.apache.commons.cli.CommandLine commandLine35 = posixParser0.parse(options1, strArray33, properties34);
        java.util.List list36 = commandLine35.getArgList();
        java.lang.String[] strArray37 = commandLine35.getArgs();
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option40 = org.apache.commons.cli.OptionBuilder.create('4');
        char char41 = option40.getValueSeparator();
        org.apache.commons.cli.Option option43 = org.apache.commons.cli.OptionBuilder.create('4');
        option43.setDescription("");
        option40.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup47 = options38.getOptionGroup(option40);
        boolean boolean48 = option40.hasValueSeparator();
        commandLine35.addOption(option40);
        option40.setOptionalArg(true);
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNull(optionGroup4);
        org.junit.Assert.assertNotNull(option6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertNull(optionGroup13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(option19);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str28, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '\000' + "'", char41 == '\000');
        org.junit.Assert.assertNotNull(option43);
        org.junit.Assert.assertNull(optionGroup47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        java.util.Collection collection7 = options1.getOptionGroups();
        org.apache.commons.cli.CommandLine commandLine8 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray10 = commandLine8.getOptionValues("hi!");
        java.lang.String str13 = commandLine8.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str15 = commandLine8.getOptionValue("arg");
        java.lang.String[] strArray16 = commandLine8.getArgs();
        java.util.Properties properties17 = null;
        org.apache.commons.cli.CommandLine commandLine18 = posixParser0.parse(options1, strArray16, properties17);
        org.apache.commons.cli.Options options23 = options1.addOption(" ", "", true, "org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.apache.commons.cli.OptionGroup optionGroup24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options25 = options1.addOptionGroup(optionGroup24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str13, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNotNull(options23);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create('4');
        option10.setDescription("");
        org.apache.commons.cli.Options options13 = options8.addOption(option10);
        org.apache.commons.cli.CommandLine commandLine14 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser7.parse(options8, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.parse(options6, strArray17, false);
        org.apache.commons.cli.Options options22 = null;
        org.apache.commons.cli.Option option24 = org.apache.commons.cli.OptionBuilder.create('4');
        option24.setArgs((int) (short) 100);
        option24.setArgName("[ option: 4  :: null ]");
        java.lang.String str29 = option24.getLongOpt();
        java.lang.String str31 = option24.getValue((int) (short) -1);
        org.apache.commons.cli.CommandLine commandLine32 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray34 = commandLine32.getOptionValues("hi!");
        java.lang.String str37 = commandLine32.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str39 = commandLine32.getOptionValue("arg");
        java.lang.String[] strArray40 = commandLine32.getArgs();
        option24.setType((java.lang.Object) strArray40);
        java.util.Properties properties42 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine44 = posixParser0.parse(options22, strArray40, properties42, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(strArray34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str37, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(strArray40);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = org.apache.commons.cli.OptionBuilder.create('4');
        option20.setDescription("");
        org.apache.commons.cli.Options options23 = options18.addOption(option20);
        java.util.Collection collection24 = options18.getOptionGroups();
        org.apache.commons.cli.Option option26 = org.apache.commons.cli.OptionBuilder.create('4');
        option26.setDescription("");
        option26.setLongOpt("hi!");
        boolean boolean31 = option26.hasArgName();
        org.apache.commons.cli.Options options32 = options18.addOption(option26);
        org.apache.commons.cli.CommandLine commandLine33 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray35 = commandLine33.getOptionValues("hi!");
        java.lang.String[] strArray36 = commandLine33.getArgs();
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser0.parse(options18, strArray36, properties37, true);
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option42 = org.apache.commons.cli.OptionBuilder.create('4');
        option42.setDescription("");
        org.apache.commons.cli.Options options45 = options40.addOption(option42);
        java.util.Collection collection46 = options40.getOptionGroups();
        org.apache.commons.cli.Options options50 = options40.addOption("", false, "arg");
        org.apache.commons.cli.Options options51 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option53 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup54 = options51.getOptionGroup(option53);
        org.apache.commons.cli.Option option56 = org.apache.commons.cli.OptionBuilder.create('4');
        char char57 = option56.getValueSeparator();
        org.apache.commons.cli.Option option59 = org.apache.commons.cli.OptionBuilder.create('4');
        option59.setDescription("");
        option56.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup63 = options51.getOptionGroup(option56);
        boolean boolean64 = option56.hasArgName();
        org.apache.commons.cli.Options options65 = options40.addOption(option56);
        org.apache.commons.cli.CommandLine commandLine66 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray68 = commandLine66.getOptionValues("hi!");
        java.lang.String str71 = commandLine66.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str73 = commandLine66.getOptionValue("arg");
        java.lang.String[] strArray74 = commandLine66.getArgs();
        java.util.Properties properties75 = null;
        org.apache.commons.cli.CommandLine commandLine76 = posixParser0.parse(options40, strArray74, properties75);
        org.apache.commons.cli.Options options77 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option79 = org.apache.commons.cli.OptionBuilder.create('4');
        char char80 = option79.getValueSeparator();
        org.apache.commons.cli.Option option82 = org.apache.commons.cli.OptionBuilder.create('4');
        option82.setDescription("");
        option79.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup86 = options77.getOptionGroup(option79);
        java.lang.String[] strArray89 = new java.lang.String[] { "4", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" };
        java.util.Properties properties90 = null;
        org.apache.commons.cli.CommandLine commandLine91 = posixParser0.parse(options77, strArray89, properties90);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option20);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNotNull(option42);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(option53);
        org.junit.Assert.assertNull(optionGroup54);
        org.junit.Assert.assertNotNull(option56);
        org.junit.Assert.assertTrue("'" + char57 + "' != '" + '\000' + "'", char57 == '\000');
        org.junit.Assert.assertNotNull(option59);
        org.junit.Assert.assertNull(optionGroup63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(options65);
        org.junit.Assert.assertNull(strArray68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str71, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(commandLine76);
        org.junit.Assert.assertNotNull(option79);
        org.junit.Assert.assertTrue("'" + char80 + "' != '" + '\000' + "'", char80 == '\000');
        org.junit.Assert.assertNotNull(option82);
        org.junit.Assert.assertNull(optionGroup86);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(commandLine91);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create('4');
        option10.setDescription("");
        org.apache.commons.cli.Options options13 = options8.addOption(option10);
        org.apache.commons.cli.CommandLine commandLine14 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser7.parse(options8, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.parse(options6, strArray17, false);
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option24 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup25 = options22.getOptionGroup(option24);
        org.apache.commons.cli.Option option27 = org.apache.commons.cli.OptionBuilder.create('4');
        char char28 = option27.getValueSeparator();
        org.apache.commons.cli.Option option30 = org.apache.commons.cli.OptionBuilder.create('4');
        option30.setDescription("");
        option27.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup34 = options22.getOptionGroup(option27);
        boolean boolean36 = options22.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option40 = org.apache.commons.cli.OptionBuilder.create('4');
        option40.setDescription("");
        org.apache.commons.cli.Options options43 = options38.addOption(option40);
        org.apache.commons.cli.CommandLine commandLine44 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray46 = commandLine44.getOptionValues("hi!");
        java.lang.String[] strArray47 = commandLine44.getArgs();
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine49 = posixParser37.parse(options38, strArray47, properties48);
        java.util.Properties properties50 = null;
        org.apache.commons.cli.CommandLine commandLine52 = posixParser0.parse(options22, strArray47, properties50, true);
        org.apache.commons.cli.Options options53 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option55 = org.apache.commons.cli.OptionBuilder.create('4');
        option55.setDescription("");
        org.apache.commons.cli.Options options58 = options53.addOption(option55);
        java.util.Collection collection59 = options53.getOptionGroups();
        org.apache.commons.cli.Option option61 = org.apache.commons.cli.OptionBuilder.create('4');
        option61.setDescription("");
        option61.setLongOpt("hi!");
        boolean boolean66 = option61.hasArgName();
        org.apache.commons.cli.Options options67 = options53.addOption(option61);
        org.apache.commons.cli.PosixParser posixParser68 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options69 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option71 = org.apache.commons.cli.OptionBuilder.create('4');
        option71.setDescription("");
        org.apache.commons.cli.Options options74 = options69.addOption(option71);
        org.apache.commons.cli.CommandLine commandLine75 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray77 = commandLine75.getOptionValues("hi!");
        java.lang.String str80 = commandLine75.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str82 = commandLine75.getOptionValue("arg");
        java.lang.String[] strArray83 = commandLine75.getArgs();
        java.lang.String[] strArray85 = posixParser68.flatten(options74, strArray83, false);
        org.apache.commons.cli.CommandLine commandLine86 = posixParser0.parse(options53, strArray85);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options91 = options53.addOption("org.apache.commons.cli.UnrecognizedOptionException: hi!", "[ option: 4  ::  ]", true, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '.'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNull(optionGroup25);
        org.junit.Assert.assertNotNull(option27);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertNotNull(option30);
        org.junit.Assert.assertNull(optionGroup34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNotNull(option55);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(option61);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(options67);
        org.junit.Assert.assertNotNull(option71);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertNull(strArray77);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str80, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(commandLine86);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        posixParser0.burstToken("hi!", true);
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option23 = org.apache.commons.cli.OptionBuilder.create('4');
        option23.setDescription("");
        org.apache.commons.cli.Options options26 = options21.addOption(option23);
        java.util.Collection collection27 = options21.getOptionGroups();
        org.apache.commons.cli.Options options31 = options21.addOption("", false, "arg");
        java.util.List list32 = options31.getRequiredOptions();
        org.apache.commons.cli.Option option34 = org.apache.commons.cli.OptionBuilder.create("arg");
        org.apache.commons.cli.Options options35 = options31.addOption(option34);
        boolean boolean37 = options31.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        java.util.Collection collection38 = options31.getOptionGroups();
        org.apache.commons.cli.CommandLine commandLine39 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray41 = commandLine39.getOptionValues("hi!");
        java.lang.String str44 = commandLine39.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str46 = commandLine39.getOptionValue("arg");
        java.lang.String[] strArray47 = commandLine39.getArgs();
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine50 = posixParser0.parse(options31, strArray47, properties48, true);
        org.apache.commons.cli.Options options51 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option53 = org.apache.commons.cli.OptionBuilder.create('4');
        option53.setDescription("");
        org.apache.commons.cli.Options options56 = options51.addOption(option53);
        java.util.Collection collection57 = options51.getOptionGroups();
        java.util.Collection collection58 = options51.getOptionGroups();
        java.util.Collection collection59 = options51.getOptionGroups();
        org.apache.commons.cli.PosixParser posixParser60 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options61 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option63 = org.apache.commons.cli.OptionBuilder.create('4');
        option63.setDescription("");
        org.apache.commons.cli.Options options66 = options61.addOption(option63);
        org.apache.commons.cli.CommandLine commandLine67 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray69 = commandLine67.getOptionValues("hi!");
        java.lang.String str72 = commandLine67.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str74 = commandLine67.getOptionValue("arg");
        java.lang.String[] strArray75 = commandLine67.getArgs();
        java.lang.String[] strArray77 = posixParser60.flatten(options66, strArray75, false);
        java.util.Properties properties78 = null;
        org.apache.commons.cli.CommandLine commandLine79 = posixParser0.parse(options51, strArray77, properties78);
        org.apache.commons.cli.Option option81 = org.apache.commons.cli.OptionBuilder.create('4');
        char char82 = option81.getValueSeparator();
        boolean boolean83 = option81.hasArg();
        java.lang.String str84 = option81.getArgName();
        java.util.ListIterator listIterator85 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option81, listIterator85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option23);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(option34);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(strArray41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str44, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine50);
        org.junit.Assert.assertNotNull(option53);
        org.junit.Assert.assertNotNull(options56);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(option63);
        org.junit.Assert.assertNotNull(options66);
        org.junit.Assert.assertNull(strArray69);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str72, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(commandLine79);
        org.junit.Assert.assertNotNull(option81);
        org.junit.Assert.assertTrue("'" + char82 + "' != '" + '\000' + "'", char82 == '\000');
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "arg" + "'", str84, "arg");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        boolean boolean19 = options6.hasOption("arg");
        java.util.Collection collection20 = options6.getOptions();
        java.lang.String str21 = options6.toString();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str21, "[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = org.apache.commons.cli.OptionBuilder.create('4');
        option20.setDescription("");
        org.apache.commons.cli.Options options23 = options18.addOption(option20);
        java.util.Collection collection24 = options18.getOptionGroups();
        org.apache.commons.cli.Option option26 = org.apache.commons.cli.OptionBuilder.create('4');
        option26.setDescription("");
        option26.setLongOpt("hi!");
        boolean boolean31 = option26.hasArgName();
        org.apache.commons.cli.Options options32 = options18.addOption(option26);
        org.apache.commons.cli.CommandLine commandLine33 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray35 = commandLine33.getOptionValues("hi!");
        java.lang.String[] strArray36 = commandLine33.getArgs();
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser0.parse(options18, strArray36, properties37, true);
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option42 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup43 = options40.getOptionGroup(option42);
        org.apache.commons.cli.Option option45 = org.apache.commons.cli.OptionBuilder.create('4');
        org.apache.commons.cli.OptionGroup optionGroup46 = options40.getOptionGroup(option45);
        java.util.List list47 = options40.getRequiredOptions();
        java.util.Collection collection48 = options40.getOptions();
        org.apache.commons.cli.PosixParser posixParser49 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options50 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option52 = org.apache.commons.cli.OptionBuilder.create('4');
        option52.setDescription("");
        org.apache.commons.cli.Options options55 = options50.addOption(option52);
        org.apache.commons.cli.CommandLine commandLine56 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray58 = commandLine56.getOptionValues("hi!");
        java.lang.String str61 = commandLine56.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str63 = commandLine56.getOptionValue("arg");
        java.lang.String[] strArray64 = commandLine56.getArgs();
        java.lang.String[] strArray66 = posixParser49.flatten(options55, strArray64, false);
        java.util.Properties properties67 = null;
        org.apache.commons.cli.CommandLine commandLine69 = posixParser0.parse(options40, strArray64, properties67, true);
        posixParser0.burstToken("org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!", false);
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option20);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNotNull(option42);
        org.junit.Assert.assertNull(optionGroup43);
        org.junit.Assert.assertNotNull(option45);
        org.junit.Assert.assertNull(optionGroup46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(option52);
        org.junit.Assert.assertNotNull(options55);
        org.junit.Assert.assertNull(strArray58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str61, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(commandLine69);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = org.apache.commons.cli.OptionBuilder.create('4');
        option20.setDescription("");
        org.apache.commons.cli.Options options23 = options18.addOption(option20);
        java.util.Collection collection24 = options18.getOptionGroups();
        org.apache.commons.cli.Option option26 = org.apache.commons.cli.OptionBuilder.create('4');
        option26.setDescription("");
        option26.setLongOpt("hi!");
        boolean boolean31 = option26.hasArgName();
        org.apache.commons.cli.Options options32 = options18.addOption(option26);
        org.apache.commons.cli.CommandLine commandLine33 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray35 = commandLine33.getOptionValues("hi!");
        java.lang.String[] strArray36 = commandLine33.getArgs();
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser0.parse(options18, strArray36, properties37, true);
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option42 = org.apache.commons.cli.OptionBuilder.create('4');
        option42.setDescription("");
        org.apache.commons.cli.Options options45 = options40.addOption(option42);
        java.util.Collection collection46 = options40.getOptionGroups();
        org.apache.commons.cli.Options options50 = options40.addOption("", false, "arg");
        org.apache.commons.cli.Options options51 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option53 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup54 = options51.getOptionGroup(option53);
        org.apache.commons.cli.Option option56 = org.apache.commons.cli.OptionBuilder.create('4');
        char char57 = option56.getValueSeparator();
        org.apache.commons.cli.Option option59 = org.apache.commons.cli.OptionBuilder.create('4');
        option59.setDescription("");
        option56.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup63 = options51.getOptionGroup(option56);
        boolean boolean64 = option56.hasArgName();
        org.apache.commons.cli.Options options65 = options40.addOption(option56);
        org.apache.commons.cli.CommandLine commandLine66 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray68 = commandLine66.getOptionValues("hi!");
        java.lang.String str71 = commandLine66.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str73 = commandLine66.getOptionValue("arg");
        java.lang.String[] strArray74 = commandLine66.getArgs();
        java.util.Properties properties75 = null;
        org.apache.commons.cli.CommandLine commandLine76 = posixParser0.parse(options40, strArray74, properties75);
        org.apache.commons.cli.Options options77 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option79 = org.apache.commons.cli.OptionBuilder.create('4');
        char char80 = option79.getValueSeparator();
        org.apache.commons.cli.Option option82 = org.apache.commons.cli.OptionBuilder.create('4');
        option82.setDescription("");
        option79.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup86 = options77.getOptionGroup(option79);
        java.lang.String[] strArray89 = new java.lang.String[] { "4", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" };
        java.util.Properties properties90 = null;
        org.apache.commons.cli.CommandLine commandLine91 = posixParser0.parse(options77, strArray89, properties90);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]", true);
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option20);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNotNull(option42);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(option53);
        org.junit.Assert.assertNull(optionGroup54);
        org.junit.Assert.assertNotNull(option56);
        org.junit.Assert.assertTrue("'" + char57 + "' != '" + '\000' + "'", char57 == '\000');
        org.junit.Assert.assertNotNull(option59);
        org.junit.Assert.assertNull(optionGroup63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(options65);
        org.junit.Assert.assertNull(strArray68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str71, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(commandLine76);
        org.junit.Assert.assertNotNull(option79);
        org.junit.Assert.assertTrue("'" + char80 + "' != '" + '\000' + "'", char80 == '\000');
        org.junit.Assert.assertNotNull(option82);
        org.junit.Assert.assertNull(optionGroup86);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(commandLine91);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = org.apache.commons.cli.OptionBuilder.create('4');
        option20.setDescription("");
        org.apache.commons.cli.Options options23 = options18.addOption(option20);
        java.util.Collection collection24 = options18.getOptionGroups();
        org.apache.commons.cli.Option option26 = org.apache.commons.cli.OptionBuilder.create('4');
        option26.setDescription("");
        option26.setLongOpt("hi!");
        boolean boolean31 = option26.hasArgName();
        org.apache.commons.cli.Options options32 = options18.addOption(option26);
        org.apache.commons.cli.CommandLine commandLine33 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray35 = commandLine33.getOptionValues("hi!");
        java.lang.String[] strArray36 = commandLine33.getArgs();
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser0.parse(options18, strArray36, properties37, true);
        java.util.Collection collection40 = options18.getOptionGroups();
        java.util.List list41 = options18.getRequiredOptions();
        java.lang.Class<?> wildcardClass42 = list41.getClass();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option20);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String str10 = commandLine0.getOptionValue("[ option: 4  :: null ]", "org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String str13 = commandLine0.getOptionValue("[ option:    :: null ]", "[ option: 4  :: null ]");
        org.apache.commons.cli.OptionBuilder optionBuilder14 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) "[ option: 4  :: null ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.cli.MissingOptionException: hi!" + "'", str10, "org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option: 4  :: null ]" + "'", str13, "[ option: 4  :: null ]");
        org.junit.Assert.assertNotNull(optionBuilder14);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create('4');
        option10.setDescription("");
        org.apache.commons.cli.Options options13 = options8.addOption(option10);
        org.apache.commons.cli.CommandLine commandLine14 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser7.parse(options8, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.parse(options6, strArray17, false);
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option24 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup25 = options22.getOptionGroup(option24);
        org.apache.commons.cli.Option option27 = org.apache.commons.cli.OptionBuilder.create('4');
        char char28 = option27.getValueSeparator();
        org.apache.commons.cli.Option option30 = org.apache.commons.cli.OptionBuilder.create('4');
        option30.setDescription("");
        option27.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup34 = options22.getOptionGroup(option27);
        org.apache.commons.cli.Option option36 = org.apache.commons.cli.OptionBuilder.create('4');
        boolean boolean37 = option36.isRequired();
        org.apache.commons.cli.Options options38 = options22.addOption(option36);
        java.util.List list39 = options38.getRequiredOptions();
        org.apache.commons.cli.PosixParser posixParser40 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options41 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option43 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup44 = options41.getOptionGroup(option43);
        org.apache.commons.cli.Option option46 = org.apache.commons.cli.OptionBuilder.create('4');
        char char47 = option46.getValueSeparator();
        org.apache.commons.cli.Option option49 = org.apache.commons.cli.OptionBuilder.create('4');
        option49.setDescription("");
        option46.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup53 = options41.getOptionGroup(option46);
        boolean boolean55 = options41.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser56 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options57 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option59 = org.apache.commons.cli.OptionBuilder.create('4');
        option59.setDescription("");
        org.apache.commons.cli.Options options62 = options57.addOption(option59);
        org.apache.commons.cli.CommandLine commandLine63 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray65 = commandLine63.getOptionValues("hi!");
        java.lang.String str68 = commandLine63.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str70 = commandLine63.getOptionValue("arg");
        java.lang.String[] strArray71 = commandLine63.getArgs();
        java.lang.String[] strArray73 = posixParser56.flatten(options62, strArray71, false);
        java.util.Properties properties74 = null;
        org.apache.commons.cli.CommandLine commandLine75 = posixParser40.parse(options41, strArray73, properties74);
        java.util.List list76 = commandLine75.getArgList();
        java.lang.String[] strArray77 = commandLine75.getArgs();
        java.util.Properties properties78 = null;
        org.apache.commons.cli.CommandLine commandLine80 = posixParser0.parse(options38, strArray77, properties78, false);
        org.apache.commons.cli.OptionBuilder optionBuilder81 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) strArray77);
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNull(optionGroup25);
        org.junit.Assert.assertNotNull(option27);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertNotNull(option30);
        org.junit.Assert.assertNull(optionGroup34);
        org.junit.Assert.assertNotNull(option36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(option43);
        org.junit.Assert.assertNull(optionGroup44);
        org.junit.Assert.assertNotNull(option46);
        org.junit.Assert.assertTrue("'" + char47 + "' != '" + '\000' + "'", char47 == '\000');
        org.junit.Assert.assertNotNull(option49);
        org.junit.Assert.assertNull(optionGroup53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(option59);
        org.junit.Assert.assertNotNull(options62);
        org.junit.Assert.assertNull(strArray65);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str68, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(commandLine75);
        org.junit.Assert.assertNotNull(list76);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(commandLine80);
        org.junit.Assert.assertNotNull(optionBuilder81);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup4 = options1.getOptionGroup(option3);
        org.apache.commons.cli.Option option6 = org.apache.commons.cli.OptionBuilder.create('4');
        char char7 = option6.getValueSeparator();
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setDescription("");
        option6.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup13 = options1.getOptionGroup(option6);
        boolean boolean15 = options1.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option19 = org.apache.commons.cli.OptionBuilder.create('4');
        option19.setDescription("");
        org.apache.commons.cli.Options options22 = options17.addOption(option19);
        org.apache.commons.cli.CommandLine commandLine23 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray25 = commandLine23.getOptionValues("hi!");
        java.lang.String str28 = commandLine23.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str30 = commandLine23.getOptionValue("arg");
        java.lang.String[] strArray31 = commandLine23.getArgs();
        java.lang.String[] strArray33 = posixParser16.flatten(options22, strArray31, false);
        java.util.Properties properties34 = null;
        org.apache.commons.cli.CommandLine commandLine35 = posixParser0.parse(options1, strArray33, properties34);
        java.util.List list36 = commandLine35.getArgList();
        java.lang.String[] strArray37 = commandLine35.getArgs();
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option40 = org.apache.commons.cli.OptionBuilder.create('4');
        char char41 = option40.getValueSeparator();
        org.apache.commons.cli.Option option43 = org.apache.commons.cli.OptionBuilder.create('4');
        option43.setDescription("");
        option40.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup47 = options38.getOptionGroup(option40);
        boolean boolean48 = option40.hasValueSeparator();
        commandLine35.addOption(option40);
        java.lang.String str50 = option40.getLongOpt();
        java.lang.String str51 = option40.getLongOpt();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNull(optionGroup4);
        org.junit.Assert.assertNotNull(option6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertNull(optionGroup13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(option19);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str28, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '\000' + "'", char41 == '\000');
        org.junit.Assert.assertNotNull(option43);
        org.junit.Assert.assertNull(optionGroup47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('4');
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        java.util.List list4 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass5 = list4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.Object obj9 = commandLine0.getOptionObject("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(optionArray10);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String[] strArray10 = commandLine7.getArgs();
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = posixParser0.parse(options1, strArray10, properties11);
        org.apache.commons.cli.Option[] optionArray13 = commandLine12.getOptions();
        java.util.List list14 = commandLine12.getArgList();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        commandLine0.addArg("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = strArray9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option4 = org.apache.commons.cli.OptionBuilder.create('4');
        option4.setDescription("");
        org.apache.commons.cli.Options options7 = options2.addOption(option4);
        org.apache.commons.cli.PosixParser posixParser8 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option11 = org.apache.commons.cli.OptionBuilder.create('4');
        option11.setDescription("");
        org.apache.commons.cli.Options options14 = options9.addOption(option11);
        org.apache.commons.cli.CommandLine commandLine15 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray17 = commandLine15.getOptionValues("hi!");
        java.lang.String[] strArray18 = commandLine15.getArgs();
        java.util.Properties properties19 = null;
        org.apache.commons.cli.CommandLine commandLine20 = posixParser8.parse(options9, strArray18, properties19);
        org.apache.commons.cli.CommandLine commandLine22 = posixParser1.parse(options7, strArray18, false);
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option25 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup26 = options23.getOptionGroup(option25);
        org.apache.commons.cli.Option option28 = org.apache.commons.cli.OptionBuilder.create('4');
        char char29 = option28.getValueSeparator();
        org.apache.commons.cli.Option option31 = org.apache.commons.cli.OptionBuilder.create('4');
        option31.setDescription("");
        option28.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup35 = options23.getOptionGroup(option28);
        boolean boolean37 = options23.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser38 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option41 = org.apache.commons.cli.OptionBuilder.create('4');
        option41.setDescription("");
        org.apache.commons.cli.Options options44 = options39.addOption(option41);
        org.apache.commons.cli.CommandLine commandLine45 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray47 = commandLine45.getOptionValues("hi!");
        java.lang.String[] strArray48 = commandLine45.getArgs();
        java.util.Properties properties49 = null;
        org.apache.commons.cli.CommandLine commandLine50 = posixParser38.parse(options39, strArray48, properties49);
        java.util.Properties properties51 = null;
        org.apache.commons.cli.CommandLine commandLine53 = posixParser1.parse(options23, strArray48, properties51, true);
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option56 = org.apache.commons.cli.OptionBuilder.create('4');
        option56.setDescription("");
        org.apache.commons.cli.Options options59 = options54.addOption(option56);
        java.util.Collection collection60 = options54.getOptionGroups();
        org.apache.commons.cli.Option option62 = org.apache.commons.cli.OptionBuilder.create('4');
        option62.setDescription("");
        option62.setLongOpt("hi!");
        boolean boolean67 = option62.hasArgName();
        org.apache.commons.cli.Options options68 = options54.addOption(option62);
        org.apache.commons.cli.PosixParser posixParser69 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options70 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option72 = org.apache.commons.cli.OptionBuilder.create('4');
        option72.setDescription("");
        org.apache.commons.cli.Options options75 = options70.addOption(option72);
        org.apache.commons.cli.CommandLine commandLine76 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray78 = commandLine76.getOptionValues("hi!");
        java.lang.String str81 = commandLine76.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str83 = commandLine76.getOptionValue("arg");
        java.lang.String[] strArray84 = commandLine76.getArgs();
        java.lang.String[] strArray86 = posixParser69.flatten(options75, strArray84, false);
        org.apache.commons.cli.CommandLine commandLine87 = posixParser1.parse(options54, strArray86);
        java.lang.String[] strArray93 = new java.lang.String[] { "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]", "[ option:  +ARG ::  ]", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!", "[ option:    :: null ]" };
        java.util.Properties properties94 = null;
        org.apache.commons.cli.CommandLine commandLine96 = posixParser0.parse(options54, strArray93, properties94, false);
        java.lang.String[] strArray98 = commandLine96.getOptionValues("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(option4);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertNotNull(option25);
        org.junit.Assert.assertNull(optionGroup26);
        org.junit.Assert.assertNotNull(option28);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
        org.junit.Assert.assertNotNull(option31);
        org.junit.Assert.assertNull(optionGroup35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(option41);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(commandLine50);
        org.junit.Assert.assertNotNull(commandLine53);
        org.junit.Assert.assertNotNull(option56);
        org.junit.Assert.assertNotNull(options59);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(option62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(options68);
        org.junit.Assert.assertNotNull(option72);
        org.junit.Assert.assertNotNull(options75);
        org.junit.Assert.assertNull(strArray78);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str81, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(commandLine87);
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertNotNull(commandLine96);
        org.junit.Assert.assertNull(strArray98);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create('4');
        option10.setDescription("");
        org.apache.commons.cli.Options options13 = options8.addOption(option10);
        org.apache.commons.cli.CommandLine commandLine14 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser7.parse(options8, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.parse(options6, strArray17, false);
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option24 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup25 = options22.getOptionGroup(option24);
        org.apache.commons.cli.Option option27 = org.apache.commons.cli.OptionBuilder.create('4');
        char char28 = option27.getValueSeparator();
        org.apache.commons.cli.Option option30 = org.apache.commons.cli.OptionBuilder.create('4');
        option30.setDescription("");
        option27.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup34 = options22.getOptionGroup(option27);
        boolean boolean36 = options22.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option40 = org.apache.commons.cli.OptionBuilder.create('4');
        option40.setDescription("");
        org.apache.commons.cli.Options options43 = options38.addOption(option40);
        org.apache.commons.cli.CommandLine commandLine44 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray46 = commandLine44.getOptionValues("hi!");
        java.lang.String[] strArray47 = commandLine44.getArgs();
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine49 = posixParser37.parse(options38, strArray47, properties48);
        java.util.Properties properties50 = null;
        org.apache.commons.cli.CommandLine commandLine52 = posixParser0.parse(options22, strArray47, properties50, true);
        org.apache.commons.cli.Options options53 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option55 = org.apache.commons.cli.OptionBuilder.create('4');
        option55.setDescription("");
        org.apache.commons.cli.Options options58 = options53.addOption(option55);
        java.util.Collection collection59 = options53.getOptions();
        java.lang.String[] strArray60 = null;
        org.apache.commons.cli.CommandLine commandLine62 = posixParser0.parse(options53, strArray60, true);
        java.lang.String str64 = commandLine62.getOptionValue('\000');
        java.lang.Object obj66 = commandLine62.getOptionObject("[ option:    :: null ]");
        org.apache.commons.cli.Option[] optionArray67 = commandLine62.getOptions();
        java.lang.String[] strArray68 = commandLine62.getArgs();
        java.util.Iterator iterator69 = commandLine62.iterator();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNull(optionGroup25);
        org.junit.Assert.assertNotNull(option27);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertNotNull(option30);
        org.junit.Assert.assertNull(optionGroup34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNotNull(option55);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(commandLine62);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(optionArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(iterator69);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str7 = commandLine0.getOptionValue("arg");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        boolean boolean11 = commandLine0.hasOption(' ');
        java.lang.Object obj13 = commandLine0.getOptionObject("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup4 = options1.getOptionGroup(option3);
        org.apache.commons.cli.Option option6 = org.apache.commons.cli.OptionBuilder.create('4');
        char char7 = option6.getValueSeparator();
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setDescription("");
        option6.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup13 = options1.getOptionGroup(option6);
        boolean boolean15 = options1.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option19 = org.apache.commons.cli.OptionBuilder.create('4');
        option19.setDescription("");
        org.apache.commons.cli.Options options22 = options17.addOption(option19);
        org.apache.commons.cli.CommandLine commandLine23 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray25 = commandLine23.getOptionValues("hi!");
        java.lang.String str28 = commandLine23.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str30 = commandLine23.getOptionValue("arg");
        java.lang.String[] strArray31 = commandLine23.getArgs();
        java.lang.String[] strArray33 = posixParser16.flatten(options22, strArray31, false);
        java.util.Properties properties34 = null;
        org.apache.commons.cli.CommandLine commandLine35 = posixParser0.parse(options1, strArray33, properties34);
        boolean boolean37 = commandLine35.hasOption("arg");
        java.util.List list38 = commandLine35.getArgList();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNull(optionGroup4);
        org.junit.Assert.assertNotNull(option6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertNull(optionGroup13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(option19);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str28, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = org.apache.commons.cli.OptionBuilder.create('4');
        option20.setDescription("");
        org.apache.commons.cli.Options options23 = options18.addOption(option20);
        java.util.Collection collection24 = options18.getOptionGroups();
        org.apache.commons.cli.Option option26 = org.apache.commons.cli.OptionBuilder.create('4');
        option26.setDescription("");
        option26.setLongOpt("hi!");
        boolean boolean31 = option26.hasArgName();
        org.apache.commons.cli.Options options32 = options18.addOption(option26);
        org.apache.commons.cli.CommandLine commandLine33 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray35 = commandLine33.getOptionValues("hi!");
        java.lang.String[] strArray36 = commandLine33.getArgs();
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser0.parse(options18, strArray36, properties37, true);
        org.apache.commons.cli.Option[] optionArray40 = commandLine39.getOptions();
        java.lang.Class<?> wildcardClass41 = commandLine39.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder42 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) commandLine39);
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option20);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNotNull(optionArray40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(optionBuilder42);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        java.util.Collection collection7 = options1.getOptionGroups();
        org.apache.commons.cli.CommandLine commandLine8 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray10 = commandLine8.getOptionValues("hi!");
        java.lang.String str13 = commandLine8.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str15 = commandLine8.getOptionValue("arg");
        java.lang.String[] strArray16 = commandLine8.getArgs();
        java.util.Properties properties17 = null;
        org.apache.commons.cli.CommandLine commandLine18 = posixParser0.parse(options1, strArray16, properties17);
        org.apache.commons.cli.Options options23 = options1.addOption(" ", "", true, "org.apache.commons.cli.UnrecognizedOptionException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options27 = options1.addOption("[ Options: [ short {4=[ option: 4  :: null ]} ] [ long {} ]", false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '['");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str13, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNotNull(options23);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.String str8 = commandLine0.getOptionValue("", "[ Options: [ short {4=[ option: 4  :: null ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ Options: [ short {4=[ option: 4  :: null ::  ]} ] [ long {} ]" + "'", str8, "[ Options: [ short {4=[ option: 4  :: null ::  ]} ] [ long {} ]");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option4 = org.apache.commons.cli.OptionBuilder.create('4');
        option4.setDescription("");
        org.apache.commons.cli.Options options7 = options2.addOption(option4);
        org.apache.commons.cli.PosixParser posixParser8 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option11 = org.apache.commons.cli.OptionBuilder.create('4');
        option11.setDescription("");
        org.apache.commons.cli.Options options14 = options9.addOption(option11);
        org.apache.commons.cli.CommandLine commandLine15 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray17 = commandLine15.getOptionValues("hi!");
        java.lang.String[] strArray18 = commandLine15.getArgs();
        java.util.Properties properties19 = null;
        org.apache.commons.cli.CommandLine commandLine20 = posixParser8.parse(options9, strArray18, properties19);
        org.apache.commons.cli.CommandLine commandLine22 = posixParser1.parse(options7, strArray18, false);
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option25 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup26 = options23.getOptionGroup(option25);
        org.apache.commons.cli.Option option28 = org.apache.commons.cli.OptionBuilder.create('4');
        char char29 = option28.getValueSeparator();
        org.apache.commons.cli.Option option31 = org.apache.commons.cli.OptionBuilder.create('4');
        option31.setDescription("");
        option28.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup35 = options23.getOptionGroup(option28);
        boolean boolean37 = options23.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser38 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option41 = org.apache.commons.cli.OptionBuilder.create('4');
        option41.setDescription("");
        org.apache.commons.cli.Options options44 = options39.addOption(option41);
        org.apache.commons.cli.CommandLine commandLine45 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray47 = commandLine45.getOptionValues("hi!");
        java.lang.String[] strArray48 = commandLine45.getArgs();
        java.util.Properties properties49 = null;
        org.apache.commons.cli.CommandLine commandLine50 = posixParser38.parse(options39, strArray48, properties49);
        java.util.Properties properties51 = null;
        org.apache.commons.cli.CommandLine commandLine53 = posixParser1.parse(options23, strArray48, properties51, true);
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option56 = org.apache.commons.cli.OptionBuilder.create('4');
        option56.setDescription("");
        org.apache.commons.cli.Options options59 = options54.addOption(option56);
        java.util.Collection collection60 = options54.getOptionGroups();
        org.apache.commons.cli.Option option62 = org.apache.commons.cli.OptionBuilder.create('4');
        option62.setDescription("");
        option62.setLongOpt("hi!");
        boolean boolean67 = option62.hasArgName();
        org.apache.commons.cli.Options options68 = options54.addOption(option62);
        org.apache.commons.cli.PosixParser posixParser69 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options70 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option72 = org.apache.commons.cli.OptionBuilder.create('4');
        option72.setDescription("");
        org.apache.commons.cli.Options options75 = options70.addOption(option72);
        org.apache.commons.cli.CommandLine commandLine76 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray78 = commandLine76.getOptionValues("hi!");
        java.lang.String str81 = commandLine76.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str83 = commandLine76.getOptionValue("arg");
        java.lang.String[] strArray84 = commandLine76.getArgs();
        java.lang.String[] strArray86 = posixParser69.flatten(options75, strArray84, false);
        org.apache.commons.cli.CommandLine commandLine87 = posixParser1.parse(options54, strArray86);
        java.lang.String[] strArray93 = new java.lang.String[] { "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]", "[ option:  +ARG ::  ]", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!", "[ option:    :: null ]" };
        java.util.Properties properties94 = null;
        org.apache.commons.cli.CommandLine commandLine96 = posixParser0.parse(options54, strArray93, properties94, false);
        java.util.Collection collection97 = options54.getOptionGroups();
        org.apache.commons.cli.Option option99 = options54.getOption("[ Options: [ short {4=[ option: 4  :: null ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(option4);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertNotNull(option25);
        org.junit.Assert.assertNull(optionGroup26);
        org.junit.Assert.assertNotNull(option28);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
        org.junit.Assert.assertNotNull(option31);
        org.junit.Assert.assertNull(optionGroup35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(option41);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(commandLine50);
        org.junit.Assert.assertNotNull(commandLine53);
        org.junit.Assert.assertNotNull(option56);
        org.junit.Assert.assertNotNull(options59);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(option62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(options68);
        org.junit.Assert.assertNotNull(option72);
        org.junit.Assert.assertNotNull(options75);
        org.junit.Assert.assertNull(strArray78);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str81, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(commandLine87);
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertNotNull(commandLine96);
        org.junit.Assert.assertNotNull(collection97);
        org.junit.Assert.assertNull(option99);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup4 = options1.getOptionGroup(option3);
        org.apache.commons.cli.Option option6 = org.apache.commons.cli.OptionBuilder.create('4');
        char char7 = option6.getValueSeparator();
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setDescription("");
        option6.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup13 = options1.getOptionGroup(option6);
        boolean boolean15 = options1.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option19 = org.apache.commons.cli.OptionBuilder.create('4');
        option19.setDescription("");
        org.apache.commons.cli.Options options22 = options17.addOption(option19);
        org.apache.commons.cli.CommandLine commandLine23 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray25 = commandLine23.getOptionValues("hi!");
        java.lang.String str28 = commandLine23.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str30 = commandLine23.getOptionValue("arg");
        java.lang.String[] strArray31 = commandLine23.getArgs();
        java.lang.String[] strArray33 = posixParser16.flatten(options22, strArray31, false);
        java.util.Properties properties34 = null;
        org.apache.commons.cli.CommandLine commandLine35 = posixParser0.parse(options1, strArray33, properties34);
        org.apache.commons.cli.Option option37 = org.apache.commons.cli.OptionBuilder.create('4');
        option37.setDescription("");
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option42 = org.apache.commons.cli.OptionBuilder.create('4');
        option42.setDescription("");
        org.apache.commons.cli.Options options45 = options40.addOption(option42);
        boolean boolean46 = option42.hasOptionalArg();
        option37.setType((java.lang.Object) boolean46);
        java.lang.String str48 = option37.getArgName();
        java.lang.String str49 = option37.getValue();
        org.apache.commons.cli.Options options50 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option52 = org.apache.commons.cli.OptionBuilder.create('4');
        char char53 = option52.getValueSeparator();
        org.apache.commons.cli.Option option55 = org.apache.commons.cli.OptionBuilder.create('4');
        option55.setDescription("");
        option52.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup59 = options50.getOptionGroup(option52);
        boolean boolean60 = option52.hasValueSeparator();
        option52.setDescription("");
        option52.setLongOpt("org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!");
        boolean boolean65 = option37.equals((java.lang.Object) option52);
        java.util.ListIterator listIterator66 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option37, listIterator66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNull(optionGroup4);
        org.junit.Assert.assertNotNull(option6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertNull(optionGroup13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(option19);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str28, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNotNull(option37);
        org.junit.Assert.assertNotNull(option42);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "arg" + "'", str48, "arg");
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(option52);
        org.junit.Assert.assertTrue("'" + char53 + "' != '" + '\000' + "'", char53 == '\000');
        org.junit.Assert.assertNotNull(option55);
        org.junit.Assert.assertNull(optionGroup59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create('4');
        option10.setDescription("");
        org.apache.commons.cli.Options options13 = options8.addOption(option10);
        org.apache.commons.cli.CommandLine commandLine14 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser7.parse(options8, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.parse(options6, strArray17, false);
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option24 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup25 = options22.getOptionGroup(option24);
        org.apache.commons.cli.Option option27 = org.apache.commons.cli.OptionBuilder.create('4');
        char char28 = option27.getValueSeparator();
        org.apache.commons.cli.Option option30 = org.apache.commons.cli.OptionBuilder.create('4');
        option30.setDescription("");
        option27.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup34 = options22.getOptionGroup(option27);
        boolean boolean36 = options22.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option40 = org.apache.commons.cli.OptionBuilder.create('4');
        option40.setDescription("");
        org.apache.commons.cli.Options options43 = options38.addOption(option40);
        org.apache.commons.cli.CommandLine commandLine44 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray46 = commandLine44.getOptionValues("hi!");
        java.lang.String[] strArray47 = commandLine44.getArgs();
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine49 = posixParser37.parse(options38, strArray47, properties48);
        java.util.Properties properties50 = null;
        org.apache.commons.cli.CommandLine commandLine52 = posixParser0.parse(options22, strArray47, properties50, true);
        java.util.Collection collection53 = options22.getOptionGroups();
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option56 = org.apache.commons.cli.OptionBuilder.create('4');
        option56.setDescription("");
        org.apache.commons.cli.Options options59 = options54.addOption(option56);
        java.util.Collection collection60 = options54.getOptionGroups();
        org.apache.commons.cli.Options options64 = options54.addOption("", false, "arg");
        org.apache.commons.cli.Options options65 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option67 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup68 = options65.getOptionGroup(option67);
        org.apache.commons.cli.Option option70 = org.apache.commons.cli.OptionBuilder.create('4');
        char char71 = option70.getValueSeparator();
        org.apache.commons.cli.Option option73 = org.apache.commons.cli.OptionBuilder.create('4');
        option73.setDescription("");
        option70.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup77 = options65.getOptionGroup(option70);
        boolean boolean78 = option70.hasArgName();
        org.apache.commons.cli.Options options79 = options54.addOption(option70);
        org.apache.commons.cli.Options options80 = options22.addOption(option70);
        org.apache.commons.cli.Option option82 = org.apache.commons.cli.OptionBuilder.create('4');
        char char83 = option82.getValueSeparator();
        boolean boolean84 = option82.hasArg();
        boolean boolean85 = option82.hasOptionalArg();
        org.apache.commons.cli.OptionGroup optionGroup86 = options22.getOptionGroup(option82);
        org.apache.commons.cli.Option option88 = options22.getOption("arg");
        org.apache.commons.cli.Option option89 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup90 = options22.getOptionGroup(option89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNull(optionGroup25);
        org.junit.Assert.assertNotNull(option27);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertNotNull(option30);
        org.junit.Assert.assertNull(optionGroup34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(option56);
        org.junit.Assert.assertNotNull(options59);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(options64);
        org.junit.Assert.assertNotNull(option67);
        org.junit.Assert.assertNull(optionGroup68);
        org.junit.Assert.assertNotNull(option70);
        org.junit.Assert.assertTrue("'" + char71 + "' != '" + '\000' + "'", char71 == '\000');
        org.junit.Assert.assertNotNull(option73);
        org.junit.Assert.assertNull(optionGroup77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(options79);
        org.junit.Assert.assertNotNull(options80);
        org.junit.Assert.assertNotNull(option82);
        org.junit.Assert.assertTrue("'" + char83 + "' != '" + '\000' + "'", char83 == '\000');
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(optionGroup86);
        org.junit.Assert.assertNull(option88);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup4 = options1.getOptionGroup(option3);
        org.apache.commons.cli.Option option6 = org.apache.commons.cli.OptionBuilder.create('4');
        char char7 = option6.getValueSeparator();
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setDescription("");
        option6.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup13 = options1.getOptionGroup(option6);
        boolean boolean15 = options1.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option19 = org.apache.commons.cli.OptionBuilder.create('4');
        option19.setDescription("");
        org.apache.commons.cli.Options options22 = options17.addOption(option19);
        org.apache.commons.cli.CommandLine commandLine23 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray25 = commandLine23.getOptionValues("hi!");
        java.lang.String str28 = commandLine23.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str30 = commandLine23.getOptionValue("arg");
        java.lang.String[] strArray31 = commandLine23.getArgs();
        java.lang.String[] strArray33 = posixParser16.flatten(options22, strArray31, false);
        java.util.Properties properties34 = null;
        org.apache.commons.cli.CommandLine commandLine35 = posixParser0.parse(options1, strArray33, properties34);
        java.util.List list36 = commandLine35.getArgList();
        java.lang.String[] strArray37 = commandLine35.getArgs();
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option40 = org.apache.commons.cli.OptionBuilder.create('4');
        char char41 = option40.getValueSeparator();
        org.apache.commons.cli.Option option43 = org.apache.commons.cli.OptionBuilder.create('4');
        option43.setDescription("");
        option40.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup47 = options38.getOptionGroup(option40);
        boolean boolean48 = option40.hasValueSeparator();
        commandLine35.addOption(option40);
        option40.setArgName("org.apache.commons.cli.MissingOptionException: hi!");
        boolean boolean52 = option40.hasArgs();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNull(optionGroup4);
        org.junit.Assert.assertNotNull(option6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertNull(optionGroup13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(option19);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str28, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '\000' + "'", char41 == '\000');
        org.junit.Assert.assertNotNull(option43);
        org.junit.Assert.assertNull(optionGroup47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create('4');
        option10.setDescription("");
        org.apache.commons.cli.Options options13 = options8.addOption(option10);
        org.apache.commons.cli.CommandLine commandLine14 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser7.parse(options8, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.parse(options6, strArray17, false);
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option24 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup25 = options22.getOptionGroup(option24);
        org.apache.commons.cli.Option option27 = org.apache.commons.cli.OptionBuilder.create('4');
        char char28 = option27.getValueSeparator();
        org.apache.commons.cli.Option option30 = org.apache.commons.cli.OptionBuilder.create('4');
        option30.setDescription("");
        option27.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup34 = options22.getOptionGroup(option27);
        boolean boolean36 = options22.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option40 = org.apache.commons.cli.OptionBuilder.create('4');
        option40.setDescription("");
        org.apache.commons.cli.Options options43 = options38.addOption(option40);
        org.apache.commons.cli.CommandLine commandLine44 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray46 = commandLine44.getOptionValues("hi!");
        java.lang.String[] strArray47 = commandLine44.getArgs();
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine49 = posixParser37.parse(options38, strArray47, properties48);
        java.util.Properties properties50 = null;
        org.apache.commons.cli.CommandLine commandLine52 = posixParser0.parse(options22, strArray47, properties50, true);
        java.util.Collection collection53 = options22.getOptionGroups();
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option56 = org.apache.commons.cli.OptionBuilder.create('4');
        option56.setDescription("");
        org.apache.commons.cli.Options options59 = options54.addOption(option56);
        java.util.Collection collection60 = options54.getOptionGroups();
        org.apache.commons.cli.Options options64 = options54.addOption("", false, "arg");
        org.apache.commons.cli.Options options65 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option67 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup68 = options65.getOptionGroup(option67);
        org.apache.commons.cli.Option option70 = org.apache.commons.cli.OptionBuilder.create('4');
        char char71 = option70.getValueSeparator();
        org.apache.commons.cli.Option option73 = org.apache.commons.cli.OptionBuilder.create('4');
        option73.setDescription("");
        option70.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup77 = options65.getOptionGroup(option70);
        boolean boolean78 = option70.hasArgName();
        org.apache.commons.cli.Options options79 = options54.addOption(option70);
        org.apache.commons.cli.Options options80 = options22.addOption(option70);
        org.apache.commons.cli.OptionGroup optionGroup81 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options82 = options22.addOptionGroup(optionGroup81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNull(optionGroup25);
        org.junit.Assert.assertNotNull(option27);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertNotNull(option30);
        org.junit.Assert.assertNull(optionGroup34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(option56);
        org.junit.Assert.assertNotNull(options59);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(options64);
        org.junit.Assert.assertNotNull(option67);
        org.junit.Assert.assertNull(optionGroup68);
        org.junit.Assert.assertNotNull(option70);
        org.junit.Assert.assertTrue("'" + char71 + "' != '" + '\000' + "'", char71 == '\000');
        org.junit.Assert.assertNotNull(option73);
        org.junit.Assert.assertNull(optionGroup77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(options79);
        org.junit.Assert.assertNotNull(options80);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create('4');
        option10.setDescription("");
        org.apache.commons.cli.Options options13 = options8.addOption(option10);
        org.apache.commons.cli.CommandLine commandLine14 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser7.parse(options8, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.parse(options6, strArray17, false);
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option24 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup25 = options22.getOptionGroup(option24);
        org.apache.commons.cli.Option option27 = org.apache.commons.cli.OptionBuilder.create('4');
        char char28 = option27.getValueSeparator();
        org.apache.commons.cli.Option option30 = org.apache.commons.cli.OptionBuilder.create('4');
        option30.setDescription("");
        option27.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup34 = options22.getOptionGroup(option27);
        boolean boolean36 = options22.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option40 = org.apache.commons.cli.OptionBuilder.create('4');
        option40.setDescription("");
        org.apache.commons.cli.Options options43 = options38.addOption(option40);
        org.apache.commons.cli.CommandLine commandLine44 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray46 = commandLine44.getOptionValues("hi!");
        java.lang.String[] strArray47 = commandLine44.getArgs();
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine49 = posixParser37.parse(options38, strArray47, properties48);
        java.util.Properties properties50 = null;
        org.apache.commons.cli.CommandLine commandLine52 = posixParser0.parse(options22, strArray47, properties50, true);
        org.apache.commons.cli.PosixParser posixParser53 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option56 = org.apache.commons.cli.OptionBuilder.create('4');
        option56.setDescription("");
        org.apache.commons.cli.Options options59 = options54.addOption(option56);
        org.apache.commons.cli.CommandLine commandLine60 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray62 = commandLine60.getOptionValues("hi!");
        java.lang.String str65 = commandLine60.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str67 = commandLine60.getOptionValue("arg");
        java.lang.String[] strArray68 = commandLine60.getArgs();
        java.lang.String[] strArray70 = posixParser53.flatten(options59, strArray68, false);
        org.apache.commons.cli.PosixParser posixParser71 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options72 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option74 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup75 = options72.getOptionGroup(option74);
        org.apache.commons.cli.CommandLine commandLine76 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray78 = commandLine76.getOptionValues("hi!");
        java.lang.String str81 = commandLine76.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str83 = commandLine76.getOptionValue("arg");
        java.lang.String[] strArray84 = commandLine76.getArgs();
        java.lang.String[] strArray86 = posixParser71.flatten(options72, strArray84, true);
        org.apache.commons.cli.CommandLine commandLine88 = posixParser0.parse(options59, strArray84, false);
        java.lang.String[] strArray90 = commandLine88.getOptionValues('a');
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNull(optionGroup25);
        org.junit.Assert.assertNotNull(option27);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertNotNull(option30);
        org.junit.Assert.assertNull(optionGroup34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNotNull(option56);
        org.junit.Assert.assertNotNull(options59);
        org.junit.Assert.assertNull(strArray62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str65, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(option74);
        org.junit.Assert.assertNull(optionGroup75);
        org.junit.Assert.assertNull(strArray78);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str81, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(commandLine88);
        org.junit.Assert.assertNull(strArray90);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.util.Iterator iterator6 = commandLine0.iterator();
        commandLine0.addArg("org.apache.commons.cli.UnrecognizedOptionException: [ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup4 = options1.getOptionGroup(option3);
        org.apache.commons.cli.Option option6 = org.apache.commons.cli.OptionBuilder.create('4');
        char char7 = option6.getValueSeparator();
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setDescription("");
        option6.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup13 = options1.getOptionGroup(option6);
        boolean boolean15 = options1.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option19 = org.apache.commons.cli.OptionBuilder.create('4');
        option19.setDescription("");
        org.apache.commons.cli.Options options22 = options17.addOption(option19);
        org.apache.commons.cli.CommandLine commandLine23 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray25 = commandLine23.getOptionValues("hi!");
        java.lang.String str28 = commandLine23.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str30 = commandLine23.getOptionValue("arg");
        java.lang.String[] strArray31 = commandLine23.getArgs();
        java.lang.String[] strArray33 = posixParser16.flatten(options22, strArray31, false);
        java.util.Properties properties34 = null;
        org.apache.commons.cli.CommandLine commandLine35 = posixParser0.parse(options1, strArray33, properties34);
        posixParser0.burstToken("4", false);
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option41 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup42 = options39.getOptionGroup(option41);
        org.apache.commons.cli.Option option44 = org.apache.commons.cli.OptionBuilder.create('4');
        char char45 = option44.getValueSeparator();
        org.apache.commons.cli.Option option47 = org.apache.commons.cli.OptionBuilder.create('4');
        option47.setDescription("");
        option44.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup51 = options39.getOptionGroup(option44);
        java.util.Collection collection52 = options39.getOptions();
        java.lang.String[] strArray53 = null;
        org.apache.commons.cli.CommandLine commandLine54 = posixParser0.parse(options39, strArray53);
        org.apache.commons.cli.OptionGroup optionGroup55 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options56 = options39.addOptionGroup(optionGroup55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNull(optionGroup4);
        org.junit.Assert.assertNotNull(option6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertNull(optionGroup13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(option19);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str28, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNotNull(option41);
        org.junit.Assert.assertNull(optionGroup42);
        org.junit.Assert.assertNotNull(option44);
        org.junit.Assert.assertTrue("'" + char45 + "' != '" + '\000' + "'", char45 == '\000');
        org.junit.Assert.assertNotNull(option47);
        org.junit.Assert.assertNull(optionGroup51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(commandLine54);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = org.apache.commons.cli.OptionBuilder.create('4');
        option20.setDescription("");
        org.apache.commons.cli.Options options23 = options18.addOption(option20);
        java.util.Collection collection24 = options18.getOptionGroups();
        org.apache.commons.cli.Option option26 = org.apache.commons.cli.OptionBuilder.create('4');
        option26.setDescription("");
        option26.setLongOpt("hi!");
        boolean boolean31 = option26.hasArgName();
        org.apache.commons.cli.Options options32 = options18.addOption(option26);
        org.apache.commons.cli.CommandLine commandLine33 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray35 = commandLine33.getOptionValues("hi!");
        java.lang.String[] strArray36 = commandLine33.getArgs();
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser0.parse(options18, strArray36, properties37, true);
        org.apache.commons.cli.Option[] optionArray40 = commandLine39.getOptions();
        java.util.Iterator iterator41 = commandLine39.iterator();
        java.lang.String str43 = commandLine39.getOptionValue('a');
        commandLine39.addArg("[ option: 4  :: null ]");
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option20);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNotNull(optionArray40);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create('4');
        option10.setDescription("");
        org.apache.commons.cli.Options options13 = options8.addOption(option10);
        org.apache.commons.cli.CommandLine commandLine14 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser7.parse(options8, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.parse(options6, strArray17, false);
        org.apache.commons.cli.Option option23 = org.apache.commons.cli.OptionBuilder.create('4');
        option23.setArgs((int) (short) 100);
        java.lang.String str26 = option23.getKey();
        java.util.ListIterator listIterator27 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option23, listIterator27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(option23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4" + "'", str26, "4");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup4 = options1.getOptionGroup(option3);
        org.apache.commons.cli.Option option6 = org.apache.commons.cli.OptionBuilder.create('4');
        char char7 = option6.getValueSeparator();
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setDescription("");
        option6.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup13 = options1.getOptionGroup(option6);
        boolean boolean15 = options1.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option19 = org.apache.commons.cli.OptionBuilder.create('4');
        option19.setDescription("");
        org.apache.commons.cli.Options options22 = options17.addOption(option19);
        org.apache.commons.cli.CommandLine commandLine23 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray25 = commandLine23.getOptionValues("hi!");
        java.lang.String str28 = commandLine23.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str30 = commandLine23.getOptionValue("arg");
        java.lang.String[] strArray31 = commandLine23.getArgs();
        java.lang.String[] strArray33 = posixParser16.flatten(options22, strArray31, false);
        java.util.Properties properties34 = null;
        org.apache.commons.cli.CommandLine commandLine35 = posixParser0.parse(options1, strArray33, properties34);
        posixParser0.burstToken("[ option: 4  :: null ::  ]", true);
        org.apache.commons.cli.Option option40 = org.apache.commons.cli.OptionBuilder.create('4');
        option40.setDescription("");
        option40.setLongOpt("hi!");
        option40.setArgName("arg");
        org.apache.commons.cli.Options options47 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option49 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup50 = options47.getOptionGroup(option49);
        option40.setType((java.lang.Object) options47);
        java.util.List list52 = options47.getRequiredOptions();
        java.lang.String[] strArray53 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray55 = posixParser0.flatten(options47, strArray53, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNull(optionGroup4);
        org.junit.Assert.assertNotNull(option6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertNull(optionGroup13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(option19);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str28, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertNotNull(option49);
        org.junit.Assert.assertNull(optionGroup50);
        org.junit.Assert.assertNotNull(list52);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        boolean boolean6 = commandLine0.hasOption("[ option: 4  :: null ]");
        boolean boolean8 = commandLine0.hasOption('=');
        java.lang.String str11 = commandLine0.getOptionValue('4', "[ option: 4  ::  ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option: 4  ::  ]" + "'", str11, "[ option: 4  ::  ]");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create('4');
        option10.setDescription("");
        org.apache.commons.cli.Options options13 = options8.addOption(option10);
        org.apache.commons.cli.CommandLine commandLine14 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser7.parse(options8, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.parse(options6, strArray17, false);
        java.util.Collection collection22 = options6.getOptions();
        org.apache.commons.cli.Option option24 = org.apache.commons.cli.OptionBuilder.create('4');
        option24.setArgs((int) (short) 100);
        option24.setArgName("[ option: 4  :: null ]");
        java.lang.String str29 = option24.getLongOpt();
        java.lang.String str31 = option24.getValue((int) (short) -1);
        org.apache.commons.cli.Options options32 = options6.addOption(option24);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options37 = options32.addOption("org.apache.commons.cli.MissingArgumentException: [ option:    :: null ]", "[ option: 4  :: null ::  ]", false, "org.apache.commons.cli.MissingOptionException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '.'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(options32);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup4 = options1.getOptionGroup(option3);
        org.apache.commons.cli.Option option6 = org.apache.commons.cli.OptionBuilder.create('4');
        char char7 = option6.getValueSeparator();
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setDescription("");
        option6.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup13 = options1.getOptionGroup(option6);
        boolean boolean15 = options1.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option19 = org.apache.commons.cli.OptionBuilder.create('4');
        option19.setDescription("");
        org.apache.commons.cli.Options options22 = options17.addOption(option19);
        org.apache.commons.cli.CommandLine commandLine23 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray25 = commandLine23.getOptionValues("hi!");
        java.lang.String str28 = commandLine23.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str30 = commandLine23.getOptionValue("arg");
        java.lang.String[] strArray31 = commandLine23.getArgs();
        java.lang.String[] strArray33 = posixParser16.flatten(options22, strArray31, false);
        java.util.Properties properties34 = null;
        org.apache.commons.cli.CommandLine commandLine35 = posixParser0.parse(options1, strArray33, properties34);
        posixParser0.burstToken("[ option: 4  :: null ::  ]", true);
        posixParser0.burstToken("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]", false);
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option45 = org.apache.commons.cli.OptionBuilder.create('4');
        option45.setDescription("");
        org.apache.commons.cli.Options options48 = options43.addOption(option45);
        org.apache.commons.cli.PosixParser posixParser49 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options50 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option52 = org.apache.commons.cli.OptionBuilder.create('4');
        option52.setDescription("");
        org.apache.commons.cli.Options options55 = options50.addOption(option52);
        org.apache.commons.cli.CommandLine commandLine56 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray58 = commandLine56.getOptionValues("hi!");
        java.lang.String[] strArray59 = commandLine56.getArgs();
        java.util.Properties properties60 = null;
        org.apache.commons.cli.CommandLine commandLine61 = posixParser49.parse(options50, strArray59, properties60);
        org.apache.commons.cli.CommandLine commandLine63 = posixParser42.parse(options48, strArray59, false);
        java.util.Collection collection64 = options48.getOptionGroups();
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options66 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option68 = org.apache.commons.cli.OptionBuilder.create('4');
        option68.setDescription("");
        org.apache.commons.cli.Options options71 = options66.addOption(option68);
        org.apache.commons.cli.CommandLine commandLine72 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray74 = commandLine72.getOptionValues("hi!");
        java.lang.String str77 = commandLine72.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str79 = commandLine72.getOptionValue("arg");
        java.lang.String[] strArray80 = commandLine72.getArgs();
        java.lang.String[] strArray82 = posixParser65.flatten(options71, strArray80, false);
        org.apache.commons.cli.CommandLine commandLine84 = posixParser0.parse(options48, strArray80, false);
        java.lang.Object obj86 = commandLine84.getOptionObject('\000');
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNull(optionGroup4);
        org.junit.Assert.assertNotNull(option6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertNull(optionGroup13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(option19);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str28, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNotNull(option45);
        org.junit.Assert.assertNotNull(options48);
        org.junit.Assert.assertNotNull(option52);
        org.junit.Assert.assertNotNull(options55);
        org.junit.Assert.assertNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(commandLine61);
        org.junit.Assert.assertNotNull(commandLine63);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNotNull(option68);
        org.junit.Assert.assertNotNull(options71);
        org.junit.Assert.assertNull(strArray74);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str77, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertNull(obj86);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue('\000');
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.lang.String[] strArray9 = commandLine0.getOptionValues("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String str11 = commandLine0.getOptionValue('\000');
        java.lang.Class<?> wildcardClass12 = commandLine0.getClass();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup4 = options1.getOptionGroup(option3);
        org.apache.commons.cli.CommandLine commandLine5 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray7 = commandLine5.getOptionValues("hi!");
        java.lang.String str10 = commandLine5.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str12 = commandLine5.getOptionValue("arg");
        java.lang.String[] strArray13 = commandLine5.getArgs();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option18 = org.apache.commons.cli.OptionBuilder.create('4');
        option18.setDescription("");
        org.apache.commons.cli.Options options21 = options16.addOption(option18);
        java.util.Collection collection22 = options16.getOptionGroups();
        org.apache.commons.cli.CommandLine commandLine23 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray25 = commandLine23.getOptionValues("hi!");
        java.lang.String str28 = commandLine23.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str30 = commandLine23.getOptionValue("arg");
        java.lang.String[] strArray31 = commandLine23.getArgs();
        java.util.Properties properties32 = null;
        org.apache.commons.cli.CommandLine commandLine34 = posixParser0.parse(options16, strArray31, properties32, false);
        org.apache.commons.cli.Option option35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup36 = options16.getOptionGroup(option35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNull(optionGroup4);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str10, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(option18);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str28, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(commandLine34);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = org.apache.commons.cli.OptionBuilder.create('4');
        option20.setDescription("");
        org.apache.commons.cli.Options options23 = options18.addOption(option20);
        java.util.Collection collection24 = options18.getOptionGroups();
        org.apache.commons.cli.Option option26 = org.apache.commons.cli.OptionBuilder.create('4');
        option26.setDescription("");
        option26.setLongOpt("hi!");
        boolean boolean31 = option26.hasArgName();
        org.apache.commons.cli.Options options32 = options18.addOption(option26);
        org.apache.commons.cli.CommandLine commandLine33 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray35 = commandLine33.getOptionValues("hi!");
        java.lang.String[] strArray36 = commandLine33.getArgs();
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser0.parse(options18, strArray36, properties37, true);
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option42 = org.apache.commons.cli.OptionBuilder.create('4');
        option42.setDescription("");
        org.apache.commons.cli.Options options45 = options40.addOption(option42);
        java.util.Collection collection46 = options40.getOptionGroups();
        java.lang.String[] strArray47 = null;
        org.apache.commons.cli.CommandLine commandLine48 = posixParser0.parse(options40, strArray47);
        java.lang.String str51 = commandLine48.getOptionValue("[ option:    :: null ]", "[ option:   [ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]  :: null ]");
        org.apache.commons.cli.Options options52 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option54 = org.apache.commons.cli.OptionBuilder.create('4');
        option54.setDescription("");
        org.apache.commons.cli.Options options57 = options52.addOption(option54);
        java.util.Collection collection58 = options52.getOptions();
        org.apache.commons.cli.Options options59 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option61 = org.apache.commons.cli.OptionBuilder.create('4');
        char char62 = option61.getValueSeparator();
        org.apache.commons.cli.Option option64 = org.apache.commons.cli.OptionBuilder.create('4');
        option64.setDescription("");
        option61.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup68 = options59.getOptionGroup(option61);
        option61.setOptionalArg(true);
        int int71 = option61.getId();
        org.apache.commons.cli.Options options72 = options52.addOption(option61);
        option61.setOptionalArg(false);
        java.lang.String str76 = option61.getValue("[ option: 4  :: null ::  ]");
        commandLine48.addOption(option61);
        option61.setOptionalArg(true);
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option20);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNotNull(option42);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[ option:   [ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]  :: null ]" + "'", str51, "[ option:   [ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]  :: null ]");
        org.junit.Assert.assertNotNull(option54);
        org.junit.Assert.assertNotNull(options57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(option61);
        org.junit.Assert.assertTrue("'" + char62 + "' != '" + '\000' + "'", char62 == '\000');
        org.junit.Assert.assertNotNull(option64);
        org.junit.Assert.assertNull(optionGroup68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 52 + "'", int71 == 52);
        org.junit.Assert.assertNotNull(options72);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "[ option: 4  :: null ::  ]" + "'", str76, "[ option: 4  :: null ::  ]");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = org.apache.commons.cli.OptionBuilder.create('4');
        option20.setDescription("");
        org.apache.commons.cli.Options options23 = options18.addOption(option20);
        java.util.Collection collection24 = options18.getOptionGroups();
        org.apache.commons.cli.Option option26 = org.apache.commons.cli.OptionBuilder.create('4');
        option26.setDescription("");
        option26.setLongOpt("hi!");
        boolean boolean31 = option26.hasArgName();
        org.apache.commons.cli.Options options32 = options18.addOption(option26);
        org.apache.commons.cli.CommandLine commandLine33 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray35 = commandLine33.getOptionValues("hi!");
        java.lang.String[] strArray36 = commandLine33.getArgs();
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser0.parse(options18, strArray36, properties37, true);
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option42 = org.apache.commons.cli.OptionBuilder.create('4');
        option42.setDescription("");
        org.apache.commons.cli.Options options45 = options40.addOption(option42);
        java.util.Collection collection46 = options40.getOptionGroups();
        org.apache.commons.cli.Options options50 = options40.addOption("", false, "arg");
        org.apache.commons.cli.Options options51 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option53 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup54 = options51.getOptionGroup(option53);
        org.apache.commons.cli.Option option56 = org.apache.commons.cli.OptionBuilder.create('4');
        char char57 = option56.getValueSeparator();
        org.apache.commons.cli.Option option59 = org.apache.commons.cli.OptionBuilder.create('4');
        option59.setDescription("");
        option56.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup63 = options51.getOptionGroup(option56);
        boolean boolean64 = option56.hasArgName();
        org.apache.commons.cli.Options options65 = options40.addOption(option56);
        org.apache.commons.cli.CommandLine commandLine66 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray68 = commandLine66.getOptionValues("hi!");
        java.lang.String str71 = commandLine66.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str73 = commandLine66.getOptionValue("arg");
        java.lang.String[] strArray74 = commandLine66.getArgs();
        java.util.Properties properties75 = null;
        org.apache.commons.cli.CommandLine commandLine76 = posixParser0.parse(options40, strArray74, properties75);
        java.util.List list77 = options40.helpOptions();
        java.util.Collection collection78 = options40.getOptionGroups();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options83 = options40.addOption("org.apache.commons.cli.UnrecognizedOptionException: hi!", "", true, "org.apache.commons.cli.MissingArgumentException: [ option:    :: null ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '.'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option20);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNotNull(option42);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(option53);
        org.junit.Assert.assertNull(optionGroup54);
        org.junit.Assert.assertNotNull(option56);
        org.junit.Assert.assertTrue("'" + char57 + "' != '" + '\000' + "'", char57 == '\000');
        org.junit.Assert.assertNotNull(option59);
        org.junit.Assert.assertNull(optionGroup63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(options65);
        org.junit.Assert.assertNull(strArray68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str71, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(commandLine76);
        org.junit.Assert.assertNotNull(list77);
        org.junit.Assert.assertNotNull(collection78);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.lang.String[] strArray8 = commandLine0.getOptionValues("[ option:    :: null ]");
        boolean boolean10 = commandLine0.hasOption("arg");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        boolean boolean7 = commandLine0.hasOption("");
        commandLine0.addArg("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        java.util.List list10 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup4 = options1.getOptionGroup(option3);
        org.apache.commons.cli.CommandLine commandLine5 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray7 = commandLine5.getOptionValues("hi!");
        java.lang.String str10 = commandLine5.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str12 = commandLine5.getOptionValue("arg");
        java.lang.String[] strArray13 = commandLine5.getArgs();
        java.lang.String[] strArray15 = posixParser0.flatten(options1, strArray13, true);
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option18 = org.apache.commons.cli.OptionBuilder.create('4');
        option18.setDescription("");
        org.apache.commons.cli.Options options21 = options16.addOption(option18);
        java.util.Collection collection22 = options16.getOptionGroups();
        org.apache.commons.cli.CommandLine commandLine23 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray25 = commandLine23.getOptionValues("hi!");
        java.lang.String str28 = commandLine23.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str30 = commandLine23.getOptionValue("arg");
        java.lang.String[] strArray31 = commandLine23.getArgs();
        java.util.Properties properties32 = null;
        org.apache.commons.cli.CommandLine commandLine34 = posixParser0.parse(options16, strArray31, properties32, false);
        org.apache.commons.cli.Option option36 = org.apache.commons.cli.OptionBuilder.create('4');
        java.lang.String str38 = option36.getValue("arg");
        org.apache.commons.cli.MissingOptionException missingOptionException40 = new org.apache.commons.cli.MissingOptionException("hi!");
        boolean boolean41 = option36.equals((java.lang.Object) "hi!");
        option36.setValueSeparator('=');
        boolean boolean44 = option36.hasLongOpt();
        boolean boolean45 = option36.hasArgName();
        java.util.ListIterator listIterator46 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option36, listIterator46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNull(optionGroup4);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str10, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(option18);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str28, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(commandLine34);
        org.junit.Assert.assertNotNull(option36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "arg" + "'", str38, "arg");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup21 = options18.getOptionGroup(option20);
        org.apache.commons.cli.Option option23 = org.apache.commons.cli.OptionBuilder.create('4');
        org.apache.commons.cli.OptionGroup optionGroup24 = options18.getOptionGroup(option23);
        java.util.List list25 = options18.getRequiredOptions();
        java.util.Collection collection26 = options18.getOptionGroups();
        java.lang.String[] strArray27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray29 = posixParser0.flatten(options18, strArray27, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option20);
        org.junit.Assert.assertNull(optionGroup21);
        org.junit.Assert.assertNotNull(option23);
        org.junit.Assert.assertNull(optionGroup24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        posixParser0.burstToken("hi!", true);
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option23 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup24 = options21.getOptionGroup(option23);
        org.apache.commons.cli.Option option26 = org.apache.commons.cli.OptionBuilder.create('4');
        char char27 = option26.getValueSeparator();
        org.apache.commons.cli.Option option29 = org.apache.commons.cli.OptionBuilder.create('4');
        option29.setDescription("");
        option26.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup33 = options21.getOptionGroup(option26);
        java.lang.String[] strArray34 = null;
        java.util.Properties properties35 = null;
        org.apache.commons.cli.CommandLine commandLine36 = posixParser0.parse(options21, strArray34, properties35);
        org.apache.commons.cli.Option option38 = options21.getOption("[ option:    :: null ]");
        java.util.Collection collection39 = options21.getOptions();
        java.lang.String str40 = options21.toString();
        org.apache.commons.cli.OptionGroup optionGroup41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options42 = options21.addOptionGroup(optionGroup41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option23);
        org.junit.Assert.assertNull(optionGroup24);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\000' + "'", char27 == '\000');
        org.junit.Assert.assertNotNull(option29);
        org.junit.Assert.assertNull(optionGroup33);
        org.junit.Assert.assertNotNull(commandLine36);
        org.junit.Assert.assertNull(option38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str40, "[ Options: [ short {} ] [ long {} ]");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = org.apache.commons.cli.OptionBuilder.create('4');
        option20.setDescription("");
        org.apache.commons.cli.Options options23 = options18.addOption(option20);
        java.util.Collection collection24 = options18.getOptionGroups();
        org.apache.commons.cli.Option option26 = org.apache.commons.cli.OptionBuilder.create('4');
        option26.setDescription("");
        option26.setLongOpt("hi!");
        boolean boolean31 = option26.hasArgName();
        org.apache.commons.cli.Options options32 = options18.addOption(option26);
        org.apache.commons.cli.CommandLine commandLine33 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray35 = commandLine33.getOptionValues("hi!");
        java.lang.String[] strArray36 = commandLine33.getArgs();
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser0.parse(options18, strArray36, properties37, true);
        org.apache.commons.cli.Option[] optionArray40 = commandLine39.getOptions();
        java.util.Iterator iterator41 = commandLine39.iterator();
        java.lang.String str43 = commandLine39.getOptionValue('a');
        java.lang.String[] strArray45 = commandLine39.getOptionValues("org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String[] strArray47 = commandLine39.getOptionValues("");
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option20);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNotNull(optionArray40);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(strArray45);
        org.junit.Assert.assertNull(strArray47);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        posixParser0.burstToken("hi!", true);
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option23 = org.apache.commons.cli.OptionBuilder.create('4');
        option23.setDescription("");
        org.apache.commons.cli.Options options26 = options21.addOption(option23);
        java.util.Collection collection27 = options21.getOptions();
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option30 = org.apache.commons.cli.OptionBuilder.create('4');
        char char31 = option30.getValueSeparator();
        org.apache.commons.cli.Option option33 = org.apache.commons.cli.OptionBuilder.create('4');
        option33.setDescription("");
        option30.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup37 = options28.getOptionGroup(option30);
        option30.setOptionalArg(true);
        int int40 = option30.getId();
        org.apache.commons.cli.Options options41 = options21.addOption(option30);
        boolean boolean43 = options41.hasOption("");
        org.apache.commons.cli.Option option45 = org.apache.commons.cli.OptionBuilder.create('4');
        option45.setArgs((int) (short) 100);
        option45.setArgName("[ option: 4  :: null ]");
        java.lang.String str50 = option45.getLongOpt();
        boolean boolean51 = option45.hasLongOpt();
        org.apache.commons.cli.Options options52 = options41.addOption(option45);
        java.util.Collection collection53 = options41.getOptions();
        org.apache.commons.cli.PosixParser posixParser54 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options55 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option57 = org.apache.commons.cli.OptionBuilder.create('4');
        option57.setDescription("");
        org.apache.commons.cli.Options options60 = options55.addOption(option57);
        java.util.Collection collection61 = options55.getOptions();
        boolean boolean63 = options55.hasOption("arg");
        java.lang.String[] strArray66 = new java.lang.String[] { "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]", "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!" };
        org.apache.commons.cli.CommandLine commandLine67 = posixParser54.parse(options55, strArray66);
        java.lang.String[] strArray69 = posixParser0.flatten(options41, strArray66, false);
        org.apache.commons.cli.Options options70 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.CommandLine commandLine71 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray73 = commandLine71.getOptionValues("hi!");
        java.lang.String[] strArray74 = commandLine71.getArgs();
        java.util.Properties properties75 = null;
        org.apache.commons.cli.CommandLine commandLine77 = posixParser0.parse(options70, strArray74, properties75, true);
        org.apache.commons.cli.Option[] optionArray78 = commandLine77.getOptions();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option23);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(option30);
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '\000' + "'", char31 == '\000');
        org.junit.Assert.assertNotNull(option33);
        org.junit.Assert.assertNull(optionGroup37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(option45);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(options52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(option57);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(commandLine67);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNull(strArray73);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(commandLine77);
        org.junit.Assert.assertNotNull(optionArray78);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        posixParser0.burstToken("hi!", true);
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option23 = org.apache.commons.cli.OptionBuilder.create('4');
        option23.setDescription("");
        org.apache.commons.cli.Options options26 = options21.addOption(option23);
        java.util.Collection collection27 = options21.getOptionGroups();
        org.apache.commons.cli.Options options31 = options21.addOption("", false, "arg");
        java.util.List list32 = options31.getRequiredOptions();
        org.apache.commons.cli.Option option34 = org.apache.commons.cli.OptionBuilder.create("arg");
        org.apache.commons.cli.Options options35 = options31.addOption(option34);
        boolean boolean37 = options31.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        java.util.Collection collection38 = options31.getOptionGroups();
        org.apache.commons.cli.CommandLine commandLine39 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray41 = commandLine39.getOptionValues("hi!");
        java.lang.String str44 = commandLine39.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str46 = commandLine39.getOptionValue("arg");
        java.lang.String[] strArray47 = commandLine39.getArgs();
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine50 = posixParser0.parse(options31, strArray47, properties48, true);
        java.util.List list51 = options31.getRequiredOptions();
        org.apache.commons.cli.Option option52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup53 = options31.getOptionGroup(option52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option23);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(option34);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(strArray41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str44, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine50);
        org.junit.Assert.assertNotNull(list51);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = org.apache.commons.cli.OptionBuilder.create('4');
        option20.setDescription("");
        org.apache.commons.cli.Options options23 = options18.addOption(option20);
        java.util.Collection collection24 = options18.getOptionGroups();
        org.apache.commons.cli.Option option26 = org.apache.commons.cli.OptionBuilder.create('4');
        option26.setDescription("");
        option26.setLongOpt("hi!");
        boolean boolean31 = option26.hasArgName();
        org.apache.commons.cli.Options options32 = options18.addOption(option26);
        org.apache.commons.cli.CommandLine commandLine33 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray35 = commandLine33.getOptionValues("hi!");
        java.lang.String[] strArray36 = commandLine33.getArgs();
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser0.parse(options18, strArray36, properties37, true);
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option42 = org.apache.commons.cli.OptionBuilder.create('4');
        option42.setDescription("");
        org.apache.commons.cli.Options options45 = options40.addOption(option42);
        java.util.Collection collection46 = options40.getOptionGroups();
        java.lang.String[] strArray47 = null;
        org.apache.commons.cli.CommandLine commandLine48 = posixParser0.parse(options40, strArray47);
        java.lang.String str51 = commandLine48.getOptionValue("[ option:    :: null ]", "[ option:   [ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]  :: null ]");
        org.apache.commons.cli.Options options52 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option54 = org.apache.commons.cli.OptionBuilder.create('4');
        option54.setDescription("");
        org.apache.commons.cli.Options options57 = options52.addOption(option54);
        java.util.Collection collection58 = options52.getOptions();
        org.apache.commons.cli.Options options59 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option61 = org.apache.commons.cli.OptionBuilder.create('4');
        char char62 = option61.getValueSeparator();
        org.apache.commons.cli.Option option64 = org.apache.commons.cli.OptionBuilder.create('4');
        option64.setDescription("");
        option61.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup68 = options59.getOptionGroup(option61);
        option61.setOptionalArg(true);
        int int71 = option61.getId();
        org.apache.commons.cli.Options options72 = options52.addOption(option61);
        option61.setOptionalArg(false);
        java.lang.String str76 = option61.getValue("[ option: 4  :: null ::  ]");
        commandLine48.addOption(option61);
        java.lang.Object obj79 = commandLine48.getOptionObject('#');
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option20);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNotNull(option42);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[ option:   [ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]  :: null ]" + "'", str51, "[ option:   [ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]  :: null ]");
        org.junit.Assert.assertNotNull(option54);
        org.junit.Assert.assertNotNull(options57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(option61);
        org.junit.Assert.assertTrue("'" + char62 + "' != '" + '\000' + "'", char62 == '\000');
        org.junit.Assert.assertNotNull(option64);
        org.junit.Assert.assertNull(optionGroup68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 52 + "'", int71 == 52);
        org.junit.Assert.assertNotNull(options72);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "[ option: 4  :: null ::  ]" + "'", str76, "[ option: 4  :: null ::  ]");
        org.junit.Assert.assertNull(obj79);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create('4');
        option10.setDescription("");
        org.apache.commons.cli.Options options13 = options8.addOption(option10);
        org.apache.commons.cli.CommandLine commandLine14 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser7.parse(options8, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.parse(options6, strArray17, false);
        java.util.Collection collection22 = options6.getOptionGroups();
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option25 = org.apache.commons.cli.OptionBuilder.create('4');
        option25.setDescription("");
        org.apache.commons.cli.Options options28 = options23.addOption(option25);
        java.util.Collection collection29 = options23.getOptionGroups();
        org.apache.commons.cli.Options options33 = options23.addOption("", false, "arg");
        java.util.Collection collection34 = options23.getOptionGroups();
        org.apache.commons.cli.Options options35 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option37 = org.apache.commons.cli.OptionBuilder.create('4');
        option37.setDescription("");
        org.apache.commons.cli.Options options40 = options35.addOption(option37);
        option37.setValueSeparator(' ');
        org.apache.commons.cli.OptionGroup optionGroup43 = options23.getOptionGroup(option37);
        option37.setRequired(false);
        org.apache.commons.cli.CommandLine commandLine46 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray48 = commandLine46.getOptionValues("hi!");
        java.lang.String[] strArray49 = commandLine46.getArgs();
        boolean boolean50 = option37.equals((java.lang.Object) strArray49);
        org.apache.commons.cli.OptionGroup optionGroup51 = options6.getOptionGroup(option37);
        org.apache.commons.cli.Options options56 = options6.addOption("arg", "org.apache.commons.cli.UnrecognizedOptionException: hi!", false, "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.Options options60 = options6.addOption(" ", false, "hi!");
        java.util.Collection collection61 = options6.getOptionGroups();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options66 = options6.addOption("org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]", false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '.'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(option25);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(option37);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNull(optionGroup43);
        org.junit.Assert.assertNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(optionGroup51);
        org.junit.Assert.assertNotNull(options56);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(collection61);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        posixParser0.burstToken("hi!", true);
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option23 = org.apache.commons.cli.OptionBuilder.create('4');
        option23.setDescription("");
        org.apache.commons.cli.Options options26 = options21.addOption(option23);
        java.util.Collection collection27 = options21.getOptionGroups();
        org.apache.commons.cli.Options options31 = options21.addOption("", false, "arg");
        java.util.List list32 = options31.getRequiredOptions();
        org.apache.commons.cli.Option option34 = org.apache.commons.cli.OptionBuilder.create("arg");
        org.apache.commons.cli.Options options35 = options31.addOption(option34);
        boolean boolean37 = options31.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        java.util.Collection collection38 = options31.getOptionGroups();
        org.apache.commons.cli.CommandLine commandLine39 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray41 = commandLine39.getOptionValues("hi!");
        java.lang.String str44 = commandLine39.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str46 = commandLine39.getOptionValue("arg");
        java.lang.String[] strArray47 = commandLine39.getArgs();
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine50 = posixParser0.parse(options31, strArray47, properties48, true);
        org.apache.commons.cli.Options options51 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option53 = org.apache.commons.cli.OptionBuilder.create('4');
        option53.setDescription("");
        org.apache.commons.cli.Options options56 = options51.addOption(option53);
        java.util.Collection collection57 = options51.getOptionGroups();
        java.util.Collection collection58 = options51.getOptionGroups();
        java.util.Collection collection59 = options51.getOptionGroups();
        org.apache.commons.cli.PosixParser posixParser60 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options61 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option63 = org.apache.commons.cli.OptionBuilder.create('4');
        option63.setDescription("");
        org.apache.commons.cli.Options options66 = options61.addOption(option63);
        org.apache.commons.cli.CommandLine commandLine67 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray69 = commandLine67.getOptionValues("hi!");
        java.lang.String str72 = commandLine67.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str74 = commandLine67.getOptionValue("arg");
        java.lang.String[] strArray75 = commandLine67.getArgs();
        java.lang.String[] strArray77 = posixParser60.flatten(options66, strArray75, false);
        java.util.Properties properties78 = null;
        org.apache.commons.cli.CommandLine commandLine79 = posixParser0.parse(options51, strArray77, properties78);
        java.lang.Object obj81 = commandLine79.getOptionObject("4");
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option23);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(option34);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(strArray41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str44, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine50);
        org.junit.Assert.assertNotNull(option53);
        org.junit.Assert.assertNotNull(options56);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(option63);
        org.junit.Assert.assertNotNull(options66);
        org.junit.Assert.assertNull(strArray69);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str72, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(commandLine79);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create('4');
        option10.setDescription("");
        org.apache.commons.cli.Options options13 = options8.addOption(option10);
        org.apache.commons.cli.CommandLine commandLine14 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser7.parse(options8, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.parse(options6, strArray17, false);
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option24 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup25 = options22.getOptionGroup(option24);
        org.apache.commons.cli.Option option27 = org.apache.commons.cli.OptionBuilder.create('4');
        char char28 = option27.getValueSeparator();
        org.apache.commons.cli.Option option30 = org.apache.commons.cli.OptionBuilder.create('4');
        option30.setDescription("");
        option27.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup34 = options22.getOptionGroup(option27);
        boolean boolean36 = options22.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option40 = org.apache.commons.cli.OptionBuilder.create('4');
        option40.setDescription("");
        org.apache.commons.cli.Options options43 = options38.addOption(option40);
        org.apache.commons.cli.CommandLine commandLine44 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray46 = commandLine44.getOptionValues("hi!");
        java.lang.String[] strArray47 = commandLine44.getArgs();
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine49 = posixParser37.parse(options38, strArray47, properties48);
        java.util.Properties properties50 = null;
        org.apache.commons.cli.CommandLine commandLine52 = posixParser0.parse(options22, strArray47, properties50, true);
        org.apache.commons.cli.Options options53 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option55 = org.apache.commons.cli.OptionBuilder.create('4');
        option55.setDescription("");
        org.apache.commons.cli.Options options58 = options53.addOption(option55);
        java.util.Collection collection59 = options53.getOptions();
        java.lang.String[] strArray60 = null;
        org.apache.commons.cli.CommandLine commandLine62 = posixParser0.parse(options53, strArray60, true);
        org.apache.commons.cli.PosixParser posixParser63 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options64 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option66 = org.apache.commons.cli.OptionBuilder.create('4');
        option66.setDescription("");
        org.apache.commons.cli.Options options69 = options64.addOption(option66);
        org.apache.commons.cli.CommandLine commandLine70 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray72 = commandLine70.getOptionValues("hi!");
        java.lang.String[] strArray73 = commandLine70.getArgs();
        java.util.Properties properties74 = null;
        org.apache.commons.cli.CommandLine commandLine75 = posixParser63.parse(options64, strArray73, properties74);
        java.lang.String[] strArray78 = new java.lang.String[] { "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]", "hi!" };
        java.util.Properties properties79 = null;
        org.apache.commons.cli.CommandLine commandLine81 = posixParser0.parse(options64, strArray78, properties79, true);
        java.util.List list82 = commandLine81.getArgList();
        java.lang.String str85 = commandLine81.getOptionValue('#', "[ option: 4  :: null ]");
        java.lang.String[] strArray87 = commandLine81.getOptionValues("");
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNull(optionGroup25);
        org.junit.Assert.assertNotNull(option27);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertNotNull(option30);
        org.junit.Assert.assertNull(optionGroup34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNotNull(option55);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(commandLine62);
        org.junit.Assert.assertNotNull(option66);
        org.junit.Assert.assertNotNull(options69);
        org.junit.Assert.assertNull(strArray72);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(commandLine75);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(commandLine81);
        org.junit.Assert.assertNotNull(list82);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "[ option: 4  :: null ]" + "'", str85, "[ option: 4  :: null ]");
        org.junit.Assert.assertNull(strArray87);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = org.apache.commons.cli.OptionBuilder.create('4');
        option20.setDescription("");
        org.apache.commons.cli.Options options23 = options18.addOption(option20);
        java.util.Collection collection24 = options18.getOptionGroups();
        org.apache.commons.cli.Option option26 = org.apache.commons.cli.OptionBuilder.create('4');
        option26.setDescription("");
        option26.setLongOpt("hi!");
        boolean boolean31 = option26.hasArgName();
        org.apache.commons.cli.Options options32 = options18.addOption(option26);
        org.apache.commons.cli.CommandLine commandLine33 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray35 = commandLine33.getOptionValues("hi!");
        java.lang.String[] strArray36 = commandLine33.getArgs();
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser0.parse(options18, strArray36, properties37, true);
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option42 = org.apache.commons.cli.OptionBuilder.create('4');
        option42.setDescription("");
        org.apache.commons.cli.Options options45 = options40.addOption(option42);
        java.util.Collection collection46 = options40.getOptionGroups();
        java.lang.String[] strArray47 = null;
        org.apache.commons.cli.CommandLine commandLine48 = posixParser0.parse(options40, strArray47);
        java.lang.String str50 = commandLine48.getOptionValue("[ option:   [ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]  :: null ]");
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option20);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNotNull(option42);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String[] strArray10 = commandLine7.getArgs();
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = posixParser0.parse(options1, strArray10, properties11);
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option15 = org.apache.commons.cli.OptionBuilder.create('4');
        option15.setDescription("");
        org.apache.commons.cli.Options options18 = options13.addOption(option15);
        java.util.Collection collection19 = options13.getOptionGroups();
        org.apache.commons.cli.Options options23 = options13.addOption("", false, "arg");
        org.apache.commons.cli.Option option27 = new org.apache.commons.cli.Option("", true, "");
        boolean boolean28 = option27.hasOptionalArg();
        option27.setOptionalArg(false);
        org.apache.commons.cli.OptionGroup optionGroup31 = options23.getOptionGroup(option27);
        java.util.Collection collection32 = options23.getOptionGroups();
        org.apache.commons.cli.PosixParser posixParser33 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option36 = org.apache.commons.cli.OptionBuilder.create('4');
        option36.setDescription("");
        org.apache.commons.cli.Options options39 = options34.addOption(option36);
        java.util.Collection collection40 = options34.getOptionGroups();
        org.apache.commons.cli.CommandLine commandLine41 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray43 = commandLine41.getOptionValues("hi!");
        java.lang.String str46 = commandLine41.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str48 = commandLine41.getOptionValue("arg");
        java.lang.String[] strArray49 = commandLine41.getArgs();
        java.util.Properties properties50 = null;
        org.apache.commons.cli.CommandLine commandLine51 = posixParser33.parse(options34, strArray49, properties50);
        java.lang.String[] strArray53 = posixParser0.flatten(options23, strArray49, true);
        org.apache.commons.cli.OptionGroup optionGroup54 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options55 = options23.addOptionGroup(optionGroup54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(option15);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(optionGroup31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(option36);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str46, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(commandLine51);
        org.junit.Assert.assertNotNull(strArray53);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create('4');
        option10.setDescription("");
        org.apache.commons.cli.Options options13 = options8.addOption(option10);
        org.apache.commons.cli.CommandLine commandLine14 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser7.parse(options8, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.parse(options6, strArray17, false);
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option24 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup25 = options22.getOptionGroup(option24);
        org.apache.commons.cli.Option option27 = org.apache.commons.cli.OptionBuilder.create('4');
        char char28 = option27.getValueSeparator();
        org.apache.commons.cli.Option option30 = org.apache.commons.cli.OptionBuilder.create('4');
        option30.setDescription("");
        option27.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup34 = options22.getOptionGroup(option27);
        boolean boolean36 = options22.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option40 = org.apache.commons.cli.OptionBuilder.create('4');
        option40.setDescription("");
        org.apache.commons.cli.Options options43 = options38.addOption(option40);
        org.apache.commons.cli.CommandLine commandLine44 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray46 = commandLine44.getOptionValues("hi!");
        java.lang.String[] strArray47 = commandLine44.getArgs();
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine49 = posixParser37.parse(options38, strArray47, properties48);
        java.util.Properties properties50 = null;
        org.apache.commons.cli.CommandLine commandLine52 = posixParser0.parse(options22, strArray47, properties50, true);
        java.util.Collection collection53 = options22.getOptionGroups();
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option56 = org.apache.commons.cli.OptionBuilder.create('4');
        option56.setDescription("");
        org.apache.commons.cli.Options options59 = options54.addOption(option56);
        java.util.Collection collection60 = options54.getOptionGroups();
        org.apache.commons.cli.Options options64 = options54.addOption("", false, "arg");
        org.apache.commons.cli.Options options65 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option67 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup68 = options65.getOptionGroup(option67);
        org.apache.commons.cli.Option option70 = org.apache.commons.cli.OptionBuilder.create('4');
        char char71 = option70.getValueSeparator();
        org.apache.commons.cli.Option option73 = org.apache.commons.cli.OptionBuilder.create('4');
        option73.setDescription("");
        option70.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup77 = options65.getOptionGroup(option70);
        boolean boolean78 = option70.hasArgName();
        org.apache.commons.cli.Options options79 = options54.addOption(option70);
        org.apache.commons.cli.Options options80 = options22.addOption(option70);
        java.lang.String str81 = option70.getKey();
        option70.setArgs(0);
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNull(optionGroup25);
        org.junit.Assert.assertNotNull(option27);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertNotNull(option30);
        org.junit.Assert.assertNull(optionGroup34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(option56);
        org.junit.Assert.assertNotNull(options59);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(options64);
        org.junit.Assert.assertNotNull(option67);
        org.junit.Assert.assertNull(optionGroup68);
        org.junit.Assert.assertNotNull(option70);
        org.junit.Assert.assertTrue("'" + char71 + "' != '" + '\000' + "'", char71 == '\000');
        org.junit.Assert.assertNotNull(option73);
        org.junit.Assert.assertNull(optionGroup77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(options79);
        org.junit.Assert.assertNotNull(options80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "4" + "'", str81, "4");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = org.apache.commons.cli.OptionBuilder.create('4');
        option20.setDescription("");
        org.apache.commons.cli.Options options23 = options18.addOption(option20);
        java.util.Collection collection24 = options18.getOptionGroups();
        org.apache.commons.cli.Option option26 = org.apache.commons.cli.OptionBuilder.create('4');
        option26.setDescription("");
        option26.setLongOpt("hi!");
        boolean boolean31 = option26.hasArgName();
        org.apache.commons.cli.Options options32 = options18.addOption(option26);
        org.apache.commons.cli.CommandLine commandLine33 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray35 = commandLine33.getOptionValues("hi!");
        java.lang.String[] strArray36 = commandLine33.getArgs();
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser0.parse(options18, strArray36, properties37, true);
        java.util.List list40 = commandLine39.getArgList();
        org.apache.commons.cli.OptionBuilder optionBuilder41 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) commandLine39);
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option20);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(optionBuilder41);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        posixParser0.burstToken("hi!", true);
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option24 = org.apache.commons.cli.OptionBuilder.create('4');
        option24.setDescription("");
        org.apache.commons.cli.Options options27 = options22.addOption(option24);
        org.apache.commons.cli.PosixParser posixParser28 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option31 = org.apache.commons.cli.OptionBuilder.create('4');
        option31.setDescription("");
        org.apache.commons.cli.Options options34 = options29.addOption(option31);
        org.apache.commons.cli.CommandLine commandLine35 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray37 = commandLine35.getOptionValues("hi!");
        java.lang.String[] strArray38 = commandLine35.getArgs();
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser28.parse(options29, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser21.parse(options27, strArray38, false);
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option45 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup46 = options43.getOptionGroup(option45);
        org.apache.commons.cli.Option option48 = org.apache.commons.cli.OptionBuilder.create('4');
        char char49 = option48.getValueSeparator();
        org.apache.commons.cli.Option option51 = org.apache.commons.cli.OptionBuilder.create('4');
        option51.setDescription("");
        option48.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup55 = options43.getOptionGroup(option48);
        boolean boolean57 = options43.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser58 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options59 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option61 = org.apache.commons.cli.OptionBuilder.create('4');
        option61.setDescription("");
        org.apache.commons.cli.Options options64 = options59.addOption(option61);
        org.apache.commons.cli.CommandLine commandLine65 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray67 = commandLine65.getOptionValues("hi!");
        java.lang.String[] strArray68 = commandLine65.getArgs();
        java.util.Properties properties69 = null;
        org.apache.commons.cli.CommandLine commandLine70 = posixParser58.parse(options59, strArray68, properties69);
        java.util.Properties properties71 = null;
        org.apache.commons.cli.CommandLine commandLine73 = posixParser21.parse(options43, strArray68, properties71, true);
        java.lang.String str74 = options43.toString();
        org.apache.commons.cli.PosixParser posixParser75 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options76 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option78 = org.apache.commons.cli.OptionBuilder.create('4');
        option78.setDescription("");
        org.apache.commons.cli.Options options81 = options76.addOption(option78);
        java.util.Collection collection82 = options76.getOptions();
        boolean boolean84 = options76.hasOption("arg");
        java.lang.String[] strArray87 = new java.lang.String[] { "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]", "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!" };
        org.apache.commons.cli.CommandLine commandLine88 = posixParser75.parse(options76, strArray87);
        org.apache.commons.cli.CommandLine commandLine90 = posixParser0.parse(options43, strArray87, false);
        java.lang.Class<?> wildcardClass91 = commandLine90.getClass();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(option31);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(option45);
        org.junit.Assert.assertNull(optionGroup46);
        org.junit.Assert.assertNotNull(option48);
        org.junit.Assert.assertTrue("'" + char49 + "' != '" + '\000' + "'", char49 == '\000');
        org.junit.Assert.assertNotNull(option51);
        org.junit.Assert.assertNull(optionGroup55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(option61);
        org.junit.Assert.assertNotNull(options64);
        org.junit.Assert.assertNull(strArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(commandLine70);
        org.junit.Assert.assertNotNull(commandLine73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str74, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(option78);
        org.junit.Assert.assertNotNull(options81);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertNotNull(commandLine88);
        org.junit.Assert.assertNotNull(commandLine90);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        posixParser0.burstToken("hi!", true);
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option23 = org.apache.commons.cli.OptionBuilder.create('4');
        option23.setDescription("");
        org.apache.commons.cli.Options options26 = options21.addOption(option23);
        java.util.Collection collection27 = options21.getOptionGroups();
        org.apache.commons.cli.Options options31 = options21.addOption("", false, "arg");
        java.util.List list32 = options31.getRequiredOptions();
        org.apache.commons.cli.Option option34 = org.apache.commons.cli.OptionBuilder.create("arg");
        org.apache.commons.cli.Options options35 = options31.addOption(option34);
        boolean boolean37 = options31.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        java.util.Collection collection38 = options31.getOptionGroups();
        org.apache.commons.cli.CommandLine commandLine39 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray41 = commandLine39.getOptionValues("hi!");
        java.lang.String str44 = commandLine39.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str46 = commandLine39.getOptionValue("arg");
        java.lang.String[] strArray47 = commandLine39.getArgs();
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine50 = posixParser0.parse(options31, strArray47, properties48, true);
        org.apache.commons.cli.Options options51 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option53 = org.apache.commons.cli.OptionBuilder.create('4');
        option53.setDescription("");
        org.apache.commons.cli.Options options56 = options51.addOption(option53);
        java.util.Collection collection57 = options51.getOptionGroups();
        java.util.Collection collection58 = options51.getOptionGroups();
        java.util.Collection collection59 = options51.getOptionGroups();
        org.apache.commons.cli.PosixParser posixParser60 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options61 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option63 = org.apache.commons.cli.OptionBuilder.create('4');
        option63.setDescription("");
        org.apache.commons.cli.Options options66 = options61.addOption(option63);
        org.apache.commons.cli.CommandLine commandLine67 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray69 = commandLine67.getOptionValues("hi!");
        java.lang.String str72 = commandLine67.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str74 = commandLine67.getOptionValue("arg");
        java.lang.String[] strArray75 = commandLine67.getArgs();
        java.lang.String[] strArray77 = posixParser60.flatten(options66, strArray75, false);
        java.util.Properties properties78 = null;
        org.apache.commons.cli.CommandLine commandLine79 = posixParser0.parse(options51, strArray77, properties78);
        posixParser0.burstToken("[ option:   [ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]  :: null ]", false);
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option23);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(option34);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(strArray41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str44, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine50);
        org.junit.Assert.assertNotNull(option53);
        org.junit.Assert.assertNotNull(options56);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(option63);
        org.junit.Assert.assertNotNull(options66);
        org.junit.Assert.assertNull(strArray69);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str72, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(commandLine79);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str9 = commandLine0.getOptionValue("", "[ option: 4 hi!  ::  ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ option: 4 hi!  ::  ]" + "'", str9, "[ option: 4 hi!  ::  ]");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create('4');
        option10.setDescription("");
        org.apache.commons.cli.Options options13 = options8.addOption(option10);
        org.apache.commons.cli.CommandLine commandLine14 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser7.parse(options8, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.parse(options6, strArray17, false);
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option24 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup25 = options22.getOptionGroup(option24);
        org.apache.commons.cli.Option option27 = org.apache.commons.cli.OptionBuilder.create('4');
        char char28 = option27.getValueSeparator();
        org.apache.commons.cli.Option option30 = org.apache.commons.cli.OptionBuilder.create('4');
        option30.setDescription("");
        option27.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup34 = options22.getOptionGroup(option27);
        boolean boolean36 = options22.hasOption("org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option40 = org.apache.commons.cli.OptionBuilder.create('4');
        option40.setDescription("");
        org.apache.commons.cli.Options options43 = options38.addOption(option40);
        org.apache.commons.cli.CommandLine commandLine44 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray46 = commandLine44.getOptionValues("hi!");
        java.lang.String[] strArray47 = commandLine44.getArgs();
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine49 = posixParser37.parse(options38, strArray47, properties48);
        java.util.Properties properties50 = null;
        org.apache.commons.cli.CommandLine commandLine52 = posixParser0.parse(options22, strArray47, properties50, true);
        org.apache.commons.cli.Options options53 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option55 = org.apache.commons.cli.OptionBuilder.create('4');
        option55.setDescription("");
        org.apache.commons.cli.Options options58 = options53.addOption(option55);
        java.util.Collection collection59 = options53.getOptionGroups();
        org.apache.commons.cli.Option option61 = org.apache.commons.cli.OptionBuilder.create('4');
        option61.setDescription("");
        option61.setLongOpt("hi!");
        boolean boolean66 = option61.hasArgName();
        org.apache.commons.cli.Options options67 = options53.addOption(option61);
        org.apache.commons.cli.PosixParser posixParser68 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options69 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option71 = org.apache.commons.cli.OptionBuilder.create('4');
        option71.setDescription("");
        org.apache.commons.cli.Options options74 = options69.addOption(option71);
        org.apache.commons.cli.CommandLine commandLine75 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray77 = commandLine75.getOptionValues("hi!");
        java.lang.String str80 = commandLine75.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str82 = commandLine75.getOptionValue("arg");
        java.lang.String[] strArray83 = commandLine75.getArgs();
        java.lang.String[] strArray85 = posixParser68.flatten(options74, strArray83, false);
        org.apache.commons.cli.CommandLine commandLine86 = posixParser0.parse(options53, strArray85);
        posixParser0.burstToken("hi!", true);
        posixParser0.burstToken("[ option:    :: null ]", true);
        posixParser0.burstToken("org.apache.commons.cli.MissingArgumentException: [ option:    :: null ]", true);
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNull(optionGroup25);
        org.junit.Assert.assertNotNull(option27);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertNotNull(option30);
        org.junit.Assert.assertNull(optionGroup34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNotNull(option55);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(option61);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(options67);
        org.junit.Assert.assertNotNull(option71);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertNull(strArray77);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str80, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(commandLine86);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        posixParser0.burstToken("hi!", true);
        org.apache.commons.cli.Option option22 = org.apache.commons.cli.OptionBuilder.create('4');
        boolean boolean23 = option22.hasArgs();
        java.lang.Object obj24 = option22.getType();
        java.lang.String str25 = option22.getLongOpt();
        boolean boolean26 = option22.hasArg();
        org.apache.commons.cli.Option option30 = new org.apache.commons.cli.Option("", true, "");
        boolean boolean31 = option30.hasOptionalArg();
        java.lang.String str33 = option30.getValue("");
        java.lang.String str34 = option30.getValue();
        java.util.List list35 = option30.getValuesList();
        option22.setType((java.lang.Object) option30);
        int int37 = option30.getArgs();
        java.util.ListIterator listIterator38 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option30, listIterator38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option10 = org.apache.commons.cli.OptionBuilder.create('4');
        option10.setDescription("");
        org.apache.commons.cli.Options options13 = options8.addOption(option10);
        org.apache.commons.cli.CommandLine commandLine14 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser7.parse(options8, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.parse(options6, strArray17, false);
        java.util.Collection collection22 = options6.getOptions();
        org.apache.commons.cli.OptionGroup optionGroup23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options24 = options6.addOptionGroup(optionGroup23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = org.apache.commons.cli.OptionBuilder.create('4');
        option20.setDescription("");
        org.apache.commons.cli.Options options23 = options18.addOption(option20);
        java.util.Collection collection24 = options18.getOptionGroups();
        org.apache.commons.cli.Option option26 = org.apache.commons.cli.OptionBuilder.create('4');
        option26.setDescription("");
        option26.setLongOpt("hi!");
        boolean boolean31 = option26.hasArgName();
        org.apache.commons.cli.Options options32 = options18.addOption(option26);
        org.apache.commons.cli.CommandLine commandLine33 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray35 = commandLine33.getOptionValues("hi!");
        java.lang.String[] strArray36 = commandLine33.getArgs();
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser0.parse(options18, strArray36, properties37, true);
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option42 = org.apache.commons.cli.OptionBuilder.create('4');
        option42.setDescription("");
        org.apache.commons.cli.Options options45 = options40.addOption(option42);
        java.util.Collection collection46 = options40.getOptionGroups();
        java.lang.String[] strArray47 = null;
        org.apache.commons.cli.CommandLine commandLine48 = posixParser0.parse(options40, strArray47);
        java.lang.String str50 = commandLine48.getOptionValue(' ');
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option20);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNotNull(option42);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray9 = commandLine7.getOptionValues("hi!");
        java.lang.String str12 = commandLine7.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str14 = commandLine7.getOptionValue("arg");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        java.lang.String[] strArray17 = posixParser0.flatten(options6, strArray15, false);
        posixParser0.burstToken("hi!", true);
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option23 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionGroup optionGroup24 = options21.getOptionGroup(option23);
        org.apache.commons.cli.Option option26 = org.apache.commons.cli.OptionBuilder.create('4');
        char char27 = option26.getValueSeparator();
        org.apache.commons.cli.Option option29 = org.apache.commons.cli.OptionBuilder.create('4');
        option29.setDescription("");
        option26.setType((java.lang.Object) "");
        org.apache.commons.cli.OptionGroup optionGroup33 = options21.getOptionGroup(option26);
        java.lang.String[] strArray34 = null;
        java.util.Properties properties35 = null;
        org.apache.commons.cli.CommandLine commandLine36 = posixParser0.parse(options21, strArray34, properties35);
        org.apache.commons.cli.Option option38 = options21.getOption("[ option:    :: null ]");
        java.util.Collection collection39 = options21.getOptions();
        org.apache.commons.cli.OptionGroup optionGroup40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options41 = options21.addOptionGroup(optionGroup40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option23);
        org.junit.Assert.assertNull(optionGroup24);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\000' + "'", char27 == '\000');
        org.junit.Assert.assertNotNull(option29);
        org.junit.Assert.assertNull(optionGroup33);
        org.junit.Assert.assertNotNull(commandLine36);
        org.junit.Assert.assertNull(option38);
        org.junit.Assert.assertNotNull(collection39);
    }

}