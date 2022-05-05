package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        org.apache.commons.cli.Option[] optionArray1 = commandLine0.getOptions();
        boolean boolean3 = commandLine0.hasOption("[ option: 4  :: null :: [ option: 4  :: null ] ]");
        org.junit.Assert.assertNotNull(optionArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1502() throws Throwable {
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
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        java.lang.String str7 = commandLine0.getOptionValue("[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]", "arg");
        boolean boolean9 = commandLine0.hasOption("[ option: 4  :: null ]");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.Object obj13 = commandLine0.getOptionObject('a');
        java.lang.String str16 = commandLine0.getOptionValue("[ option:  +ARG ::  :: [] ]", "[ option: 4  :: null ::  ]");
        java.util.List list17 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option: 4  :: null ::  ]" + "'", str16, "[ option: 4  :: null ::  ]");
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('a');
        boolean boolean6 = commandLine0.hasOption('a');
        commandLine0.addArg("org.apache.commons.cli.ParseException: [ option: 4  :: null ::  ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        boolean boolean3 = commandLine0.hasOption('=');
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        boolean boolean6 = commandLine0.hasOption("[ option: 4  ::  :: [] ]");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String str10 = commandLine0.getOptionValue("[ option: 4  :: null ]", "org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('4');
        boolean boolean14 = commandLine0.hasOption('4');
        java.lang.Object obj16 = commandLine0.getOptionObject("4");
        java.lang.Object obj18 = commandLine0.getOptionObject("[ option: 4 hi!  ::  ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.cli.MissingOptionException: hi!" + "'", str10, "org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        java.util.List list33 = option24.getValuesList();
        java.lang.String str35 = option24.getValue("[ option:    :: null ]");
        int int36 = option24.getArgs();
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
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[ option:    :: null ]" + "'", str35, "[ option:    :: null ]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        boolean boolean3 = commandLine0.hasOption("[ option: 4  :: [ Options: [ short {4=[ option: 4  :: null ]} ] [ long {} ] ::  ]");
        java.lang.String[] strArray5 = commandLine0.getOptionValues(' ');
        boolean boolean7 = commandLine0.hasOption('4');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        boolean boolean4 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        java.lang.String str7 = commandLine0.getOptionValue("[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]", "arg");
        boolean boolean9 = commandLine0.hasOption('#');
        java.lang.String str11 = commandLine0.getOptionValue('a');
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String[] strArray13 = commandLine0.getArgs();
        commandLine0.addArg("org.apache.commons.cli.UnrecognizedOptionException: [ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        boolean boolean7 = commandLine0.hasOption("");
        commandLine0.addArg("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        boolean boolean11 = commandLine0.hasOption("[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str13 = commandLine0.getOptionValue("[ option: 4  :: null ::  ]");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.Object obj16 = commandLine0.getOptionObject(' ');
        boolean boolean18 = commandLine0.hasOption('\000');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('a');
        java.lang.String str7 = commandLine0.getOptionValue("org.apache.commons.cli.MissingOptionException: [ option: 4  :: null ]", "hi!");
        java.lang.String str10 = commandLine0.getOptionValue("[ Options: [ short { =[ option:   +ARG :: [ Options: [ short {} ] [ long {} ] ], 4=[ option: 4  ::  ]} ] [ long {} ]", "org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.UnrecognizedOptionException: hi!" + "'", str10, "org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.UnrecognizedOptionException: hi!");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('4');
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('#', "[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str9 = commandLine0.getOptionValue("org.apache.commons.cli.MissingArgumentException: [ option: 4  ::  ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str7, "[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        boolean boolean3 = commandLine0.hasOption("[ option: 4  :: [ Options: [ short {4=[ option: 4  :: null ]} ] [ long {} ] ::  ]");
        java.lang.String str5 = commandLine0.getOptionValue("org.apache.commons.cli.MissingArgumentException: [ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        java.lang.String str7 = commandLine0.getOptionValue("[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]", "arg");
        boolean boolean9 = commandLine0.hasOption("[ option: 4  :: null ]");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String str14 = commandLine0.getOptionValue('=', "[ option: 4  :: null ::  ]");
        java.util.Iterator iterator15 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass16 = iterator15.getClass();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option: 4  :: null ::  ]" + "'", str14, "[ option: 4  :: null ::  ]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        commandLine0.addArg("[ option: 4  :: hi! ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str7 = commandLine0.getOptionValue("arg");
        java.lang.String str9 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("org.apache.commons.cli.MissingOptionException: [ option: 4  :: null ]");
        boolean boolean13 = commandLine0.hasOption('a');
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(optionArray14);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        boolean boolean6 = commandLine0.hasOption("[ option: 4  :: null ]");
        java.lang.String str9 = commandLine0.getOptionValue("[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]", "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!");
        commandLine0.addArg("[ option: 4  ::  ]");
        java.util.Iterator iterator12 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!" + "'", str9, "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str7 = commandLine0.getOptionValue("arg");
        java.lang.String str9 = commandLine0.getOptionValue('a');
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.lang.Object obj14 = commandLine0.getOptionObject('\000');
        java.lang.String str16 = commandLine0.getOptionValue('\000');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        boolean boolean3 = commandLine0.hasOption('=');
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.String str8 = commandLine0.getOptionValue('a', "[ option: 4  :: [ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ] ]");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option: 4  :: [ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ] ]" + "'", str8, "[ option: 4  :: [ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ] ]");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        org.apache.commons.cli.Option option7 = org.apache.commons.cli.OptionBuilder.create(' ');
        commandLine0.addOption(option7);
        java.lang.String[] strArray10 = commandLine0.getOptionValues("[ option: 4  :: null ]");
        java.lang.Object obj12 = commandLine0.getOptionObject("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.Object obj14 = commandLine0.getOptionObject("[ Options: [ short {4=[ option: 4  :: null ::  ]} ] [ long {} ]");
        java.lang.String[] strArray16 = commandLine0.getOptionValues("org.apache.commons.cli.ParseException: [ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ], arg=[ option: arg  :: null ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(option7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        org.apache.commons.cli.Option option7 = org.apache.commons.cli.OptionBuilder.create(' ');
        commandLine0.addOption(option7);
        java.lang.String[] strArray10 = commandLine0.getOptionValues("[ option: 4  :: null ]");
        java.lang.String str13 = commandLine0.getOptionValue("org.apache.commons.cli.MissingArgumentException: [ option:    :: null ]", "[ option:    :: null ]");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("org.apache.commons.cli.MissingOptionException: hi!");
        commandLine0.addArg("[ option: 4  :: null :: [ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ] ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(option7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option:    :: null ]" + "'", str13, "[ option:    :: null ]");
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str7 = commandLine0.getOptionValue("arg");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('4');
        boolean boolean12 = commandLine0.hasOption("[ option: 4  :: null :: [ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ] ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        commandLine0.addArg("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('4');
        boolean boolean11 = commandLine0.hasOption(' ');
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.util.List list13 = commandLine0.getArgList();
        java.lang.String str15 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        boolean boolean5 = commandLine0.hasOption("hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.Object obj8 = commandLine0.getOptionObject("[ option:   [ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]  :: null ]");
        java.lang.Object obj10 = commandLine0.getOptionObject(' ');
        boolean boolean12 = commandLine0.hasOption("");
        java.util.List list13 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        boolean boolean5 = commandLine0.hasOption('#');
        java.lang.String[] strArray7 = commandLine0.getOptionValues("org.apache.commons.cli.ParseException: [ option: 4  :: null ::  ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        boolean boolean7 = commandLine0.hasOption("");
        commandLine0.addArg("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        boolean boolean11 = commandLine0.hasOption("[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str13 = commandLine0.getOptionValue("[ option: 4  :: null ::  ]");
        commandLine0.addArg("[ option:   [ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]  :: null ]");
        boolean boolean17 = commandLine0.hasOption("[ option: 4 arg  :: null ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str7 = commandLine0.getOptionValue("arg");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        boolean boolean11 = commandLine0.hasOption(' ');
        java.util.Iterator iterator12 = commandLine0.iterator();
        boolean boolean14 = commandLine0.hasOption("[ option: 4 [ option: 4 hi!  ::  :: [ Options: [ short {} ] [ long {} ] ]  :: null ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('a');
        java.lang.String str7 = commandLine0.getOptionValue("org.apache.commons.cli.MissingOptionException: [ option: 4  :: null ]", "hi!");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(optionArray8);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.Object obj9 = commandLine0.getOptionObject("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String str12 = commandLine0.getOptionValue('a', "org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder13 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) "org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.cli.MissingOptionException: hi!" + "'", str12, "org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertNotNull(optionBuilder13);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray6 = commandLine0.getOptionValues('\000');
        commandLine0.addArg("[ option:    :: null ]");
        java.lang.Object obj10 = commandLine0.getOptionObject('=');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        boolean boolean7 = commandLine0.hasOption("");
        commandLine0.addArg("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        boolean boolean11 = commandLine0.hasOption("[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]");
        org.apache.commons.cli.Option option13 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str15 = option13.getValue("");
        commandLine0.addOption(option13);
        boolean boolean17 = option13.hasOptionalArg();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(option13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String str10 = commandLine0.getOptionValue("[ option: 4  :: null ]", "org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String[] strArray14 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.cli.MissingOptionException: hi!" + "'", str10, "org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        posixParser0.burstToken("[ option: 4  :: [ Options: [ short {4=[ option: 4  :: null ]} ] [ long {} ] ::  ]", true);
        org.apache.commons.cli.Option option17 = org.apache.commons.cli.OptionBuilder.create('4');
        char char18 = option17.getValueSeparator();
        boolean boolean19 = option17.hasArg();
        java.lang.String str20 = option17.getArgName();
        java.lang.String str21 = option17.getDescription();
        java.lang.String str22 = option17.toString();
        java.util.ListIterator listIterator23 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option17, listIterator23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(option17);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[ option: 4  :: null ]" + "'", str22, "[ option: 4  :: null ]");
    }

    @Test
    public void test1536() throws Throwable {
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
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue('\000');
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('\000');
        java.lang.String str11 = commandLine0.getOptionValue('\000');
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.lang.String str16 = commandLine0.getOptionValue(" ");
        java.lang.String str18 = commandLine0.getOptionValue('\000');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        commandLine0.addArg("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('4');
        java.lang.String[] strArray10 = commandLine0.getArgs();
        java.lang.String str13 = commandLine0.getOptionValue("[ option: 4  :: null :: [ option: 4  :: null ] ]", "[ option: arg [ option: 4  :: null ] +ARG :: 4 ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option: arg [ option: 4  :: null ] +ARG :: 4 ]" + "'", str13, "[ option: arg [ option: 4  :: null ] +ARG :: 4 ]");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('a');
        java.lang.String str7 = commandLine0.getOptionValue('\000', "");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        commandLine0.addArg("[ option: 4  :: null ::  ]");
        java.lang.String str12 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.String str16 = commandLine0.getOptionValue('a', "org.apache.commons.cli.UnrecognizedOptionException: arg");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: arg" + "'", str16, "org.apache.commons.cli.UnrecognizedOptionException: arg");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.String str7 = commandLine0.getOptionValue('a');
        java.lang.String str9 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        commandLine0.addArg("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('4');
        boolean boolean11 = commandLine0.hasOption(' ');
        java.lang.Object obj13 = commandLine0.getOptionObject('=');
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(optionArray14);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String str10 = commandLine0.getOptionValue("[ option: 4  :: null ]", "org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.util.List list13 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.cli.MissingOptionException: hi!" + "'", str10, "org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setDescription("");
        option9.setLongOpt("hi!");
        commandLine0.addOption(option9);
        java.lang.String str17 = commandLine0.getOptionValue('#', "[ option: 4 hi!  ::  ]");
        boolean boolean19 = commandLine0.hasOption('\000');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option: 4 hi!  ::  ]" + "'", str17, "[ option: 4 hi!  ::  ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
            org.apache.commons.cli.Options options22 = options1.addOption("[ option: 4  :: null :: [ option:   [ option: 4  ::  ]  :: null ] ]", false, "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!");
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
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        java.lang.String str7 = commandLine0.getOptionValue("[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]", "arg");
        boolean boolean9 = commandLine0.hasOption('#');
        java.lang.String str11 = commandLine0.getOptionValue('a');
        java.lang.Object obj13 = commandLine0.getOptionObject("org.apache.commons.cli.UnrecognizedOptionException: arg");
        java.lang.String str15 = commandLine0.getOptionValue("org.apache.commons.cli.MissingOptionException: [ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        commandLine0.addArg("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('4');
        boolean boolean11 = commandLine0.hasOption(' ');
        java.lang.String str13 = commandLine0.getOptionValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        java.lang.String str6 = commandLine0.getOptionValue("[ option:    :: null ]");
        boolean boolean8 = commandLine0.hasOption("hi!");
        boolean boolean10 = commandLine0.hasOption("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        boolean boolean12 = commandLine0.hasOption("org.apache.commons.cli.ParseException: org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue('\000');
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('\000');
        java.lang.String str11 = commandLine0.getOptionValue('\000');
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String str16 = commandLine0.getOptionValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.UnrecognizedOptionException: [ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.lang.String str9 = commandLine0.getOptionValue('a', "[ option: 4 hi!  ::  ]");
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String[] strArray11 = commandLine0.getArgs();
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) strArray11);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ option: 4 hi!  ::  ]" + "'", str9, "[ option: 4 hi!  ::  ]");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(optionBuilder12);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setDescription("");
        option9.setLongOpt("hi!");
        option9.setArgName("arg");
        java.lang.String str16 = option9.toString();
        commandLine0.addOption(option9);
        commandLine0.addArg("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ], arg=[ option: arg  :: null ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option: 4 hi!  ::  ]" + "'", str16, "[ option: 4 hi!  ::  ]");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue('\000');
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('\000');
        java.lang.String str11 = commandLine0.getOptionValue('\000');
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.lang.String str16 = commandLine0.getOptionValue(" ");
        java.lang.String[] strArray17 = commandLine0.getArgs();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.util.Iterator iterator6 = commandLine0.iterator();
        java.lang.Object obj8 = commandLine0.getOptionObject("[ option:    :: null ]");
        java.lang.String str11 = commandLine0.getOptionValue('\000', "org.apache.commons.cli.MissingOptionException: [ option: 4  :: null ]");
        java.lang.String str13 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.cli.MissingOptionException: [ option: 4  :: null ]" + "'", str11, "org.apache.commons.cli.MissingOptionException: [ option: 4  :: null ]");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1553() throws Throwable {
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
    public void test1554() throws Throwable {
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
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        boolean boolean6 = commandLine0.hasOption("[ option: 4  :: null ]");
        boolean boolean8 = commandLine0.hasOption('=');
        java.lang.String str11 = commandLine0.getOptionValue("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ::  ]} ] [ long {} ]", "[ option: 4 [ option: 4 hi!  ::  :: [ Options: [ short {} ] [ long {} ] ]  :: null ]");
        java.lang.String str13 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option: 4 [ option: 4 hi!  ::  :: [ Options: [ short {} ] [ long {} ] ]  :: null ]" + "'", str11, "[ option: 4 [ option: 4 hi!  ::  :: [ Options: [ short {} ] [ long {} ] ]  :: null ]");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String str10 = commandLine0.getOptionValue("[ option: 4  :: null ]", "org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        commandLine0.addArg("org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.UnrecognizedOptionException: hi!");
        java.lang.Object obj15 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.cli.MissingOptionException: hi!" + "'", str10, "org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.util.Iterator iterator6 = commandLine0.iterator();
        java.lang.Object obj8 = commandLine0.getOptionObject("[ option:    :: null ]");
        java.lang.String str11 = commandLine0.getOptionValue('\000', "org.apache.commons.cli.MissingOptionException: [ option: 4  :: null ]");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.cli.MissingOptionException: [ option: 4  :: null ]" + "'", str11, "org.apache.commons.cli.MissingOptionException: [ option: 4  :: null ]");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        boolean boolean7 = commandLine0.hasOption("");
        commandLine0.addArg("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        boolean boolean11 = commandLine0.hasOption("[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str13 = commandLine0.getOptionValue("[ option: 4  :: null ::  ]");
        java.util.Iterator iterator14 = commandLine0.iterator();
        boolean boolean16 = commandLine0.hasOption('=');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.String str7 = commandLine0.getOptionValue('a');
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(optionArray8);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.Object obj5 = commandLine0.getOptionObject('\000');
        java.lang.String[] strArray7 = commandLine0.getOptionValues('a');
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String str10 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setDescription("");
        option9.setLongOpt("hi!");
        option9.setArgName("arg");
        java.lang.String str16 = option9.toString();
        commandLine0.addOption(option9);
        java.lang.String str19 = commandLine0.getOptionValue('4');
        java.util.List list20 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option: 4 hi!  ::  ]" + "'", str16, "[ option: 4 hi!  ::  ]");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        boolean boolean5 = commandLine0.hasOption("hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.Object obj8 = commandLine0.getOptionObject("[ option:   [ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]  :: null ]");
        java.lang.Object obj10 = commandLine0.getOptionObject(' ');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.util.Iterator iterator12 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        org.apache.commons.cli.Option option7 = org.apache.commons.cli.OptionBuilder.create(' ');
        commandLine0.addOption(option7);
        java.lang.String[] strArray10 = commandLine0.getOptionValues("[ option: 4  :: null ]");
        java.lang.Object obj12 = commandLine0.getOptionObject("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.Object obj14 = commandLine0.getOptionObject("[ Options: [ short {4=[ option: 4  :: null ::  ]} ] [ long {} ]");
        java.lang.String[] strArray16 = commandLine0.getOptionValues("[ option: 4  :: null ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(option7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('a');
        java.lang.String str7 = commandLine0.getOptionValue('\000', "");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        commandLine0.addArg("[ option: 4  :: null ::  ]");
        java.lang.String str12 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray14 = commandLine0.getOptionValues("[ option: 4 arg  :: null ]");
        java.lang.String[] strArray16 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('a');
        java.lang.String str7 = commandLine0.getOptionValue('\000', "");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        commandLine0.addArg("[ option: 4  :: null ::  ]");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('a');
        java.lang.String str7 = commandLine0.getOptionValue('\000', "");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        commandLine0.addArg("[ option: 4  :: null ::  ]");
        java.lang.String str12 = commandLine0.getOptionValue('#');
        java.util.Iterator iterator13 = commandLine0.iterator();
        boolean boolean15 = commandLine0.hasOption('4');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setDescription("");
        option9.setLongOpt("hi!");
        commandLine0.addOption(option9);
        java.lang.Object obj15 = option9.getType();
        int int16 = option9.getArgs();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        java.lang.String str7 = commandLine0.getOptionValue("[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]", "arg");
        boolean boolean9 = commandLine0.hasOption('#');
        java.lang.String str11 = commandLine0.getOptionValue('a');
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.util.List list14 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.Object obj9 = commandLine0.getOptionObject("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String str12 = commandLine0.getOptionValue("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]", "[ option: 4  :: null ]");
        java.lang.String[] strArray14 = commandLine0.getOptionValues('=');
        commandLine0.addArg("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option: 4  :: null ]" + "'", str12, "[ option: 4  :: null ]");
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.lang.String str9 = commandLine0.getOptionValue('\000', "");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        boolean boolean5 = commandLine0.hasOption("hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.util.List list7 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        java.lang.String str6 = commandLine0.getOptionValue("[ option:    :: null ]");
        java.lang.Object obj8 = commandLine0.getOptionObject("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4 org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!  ::  ]} ] [ long {org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!=[ option: 4 org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!  ::  ]} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setDescription("");
        option9.setLongOpt("hi!");
        option9.setArgName("arg");
        java.lang.String str16 = option9.toString();
        commandLine0.addOption(option9);
        java.lang.String[] strArray19 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option: 4 hi!  ::  ]" + "'", str16, "[ option: 4 hi!  ::  ]");
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str7 = commandLine0.getOptionValue("arg");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.String[] strArray10 = commandLine0.getOptionValues(' ');
        java.util.List list11 = commandLine0.getArgList();
        java.lang.Object obj13 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setDescription("");
        option9.setLongOpt("hi!");
        commandLine0.addOption(option9);
        java.lang.Class<?> wildcardClass15 = commandLine0.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder16 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) commandLine0);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(optionBuilder16);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str7 = commandLine0.getOptionValue("arg");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        boolean boolean11 = commandLine0.hasOption(' ');
        org.apache.commons.cli.Option option13 = org.apache.commons.cli.OptionBuilder.create('\000');
        option13.setRequired(true);
        commandLine0.addOption(option13);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(option13);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('a');
        java.lang.String str7 = commandLine0.getOptionValue('\000', "");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        commandLine0.addArg("[ option: 4  :: null ::  ]");
        java.lang.String str12 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray14 = commandLine0.getOptionValues("[ option: 4 arg  :: null ]");
        commandLine0.addArg("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  :: false ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.Object obj9 = commandLine0.getOptionObject("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String str12 = commandLine0.getOptionValue("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]", "[ option: 4  :: null ]");
        java.lang.String[] strArray14 = commandLine0.getOptionValues('=');
        java.lang.String str16 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option: 4  :: null ]" + "'", str12, "[ option: 4  :: null ]");
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        java.lang.String str7 = commandLine0.getOptionValue("[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]", "arg");
        java.lang.Object obj9 = commandLine0.getOptionObject("[ option: 4  :: null ]");
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.lang.Object obj13 = commandLine0.getOptionObject("[ option:  +ARG :: org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi! ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.util.Iterator iterator6 = commandLine0.iterator();
        boolean boolean8 = commandLine0.hasOption("");
        boolean boolean10 = commandLine0.hasOption('4');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.util.Iterator iterator12 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str7 = commandLine0.getOptionValue("arg");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String str11 = commandLine0.getOptionValue('=');
        java.lang.Object obj13 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray14 = commandLine0.getArgs();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray7 = commandLine0.getOptionValues('a');
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(optionArray8);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setDescription("");
        option9.setLongOpt("hi!");
        commandLine0.addOption(option9);
        boolean boolean15 = option9.hasOptionalArg();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        java.lang.String str7 = commandLine0.getOptionValue("[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]", "arg");
        boolean boolean9 = commandLine0.hasOption("[ option: 4  :: null ]");
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String str13 = commandLine0.getOptionValue("org.apache.commons.cli.ParseException: [ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ], arg=[ option: arg  :: null ]} ] [ long {} ]", "");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setDescription("");
        option9.setLongOpt("hi!");
        commandLine0.addOption(option9);
        java.lang.Object obj15 = option9.getType();
        option9.setRequired(false);
        boolean boolean18 = option9.hasArg();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        boolean boolean5 = commandLine0.hasOption("hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.Object obj8 = commandLine0.getOptionObject("[ option:   [ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]  :: null ]");
        java.lang.Object obj10 = commandLine0.getOptionObject(' ');
        java.util.Iterator iterator11 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        commandLine0.addArg("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        boolean boolean9 = commandLine0.hasOption("[ option: 4  :: null :: [ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ] ]");
        java.lang.String[] strArray10 = commandLine0.getArgs();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        commandLine0.addArg("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        boolean boolean9 = commandLine0.hasOption("[ option: 4  :: null :: [ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ] ]");
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.Object obj5 = commandLine0.getOptionObject('\000');
        java.lang.String[] strArray7 = commandLine0.getOptionValues('a');
        java.util.List list8 = commandLine0.getArgList();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) list8);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        java.lang.Object obj6 = commandLine0.getOptionObject('#');
        java.lang.String str9 = commandLine0.getOptionValue('a', "[ Options: [ short {} ] [ long {} ]");
        java.lang.String[] strArray10 = commandLine0.getArgs();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) strArray10);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str9, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(optionBuilder11);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        org.apache.commons.cli.Option option7 = org.apache.commons.cli.OptionBuilder.create(' ');
        commandLine0.addOption(option7);
        java.lang.String[] strArray10 = commandLine0.getOptionValues("[ option: 4  :: null ]");
        java.lang.Object obj12 = commandLine0.getOptionObject("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.String str16 = commandLine0.getOptionValue('4', "");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(option7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1592() throws Throwable {
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
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.lang.String str9 = commandLine0.getOptionValue('a', "[ option: 4 hi!  ::  ]");
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String[] strArray11 = commandLine0.getArgs();
        commandLine0.addArg("[ option: 4   :: null ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ option: 4 hi!  ::  ]" + "'", str9, "[ option: 4 hi!  ::  ]");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        boolean boolean5 = commandLine0.hasOption("hi!");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        commandLine0.addArg("org.apache.commons.cli.UnrecognizedOptionException: [ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        boolean boolean13 = commandLine0.hasOption("org.apache.commons.cli.MissingArgumentException:  ");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        boolean boolean6 = commandLine0.hasOption("[ option: 4  :: null ]");
        boolean boolean8 = commandLine0.hasOption('=');
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String str12 = commandLine0.getOptionValue("[ option: 4  :: hi! ]", "org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: hi!" + "'", str12, "org.apache.commons.cli.UnrecognizedOptionException: hi!");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        boolean boolean5 = commandLine0.hasOption("hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.Object obj8 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('a');
        java.lang.String str7 = commandLine0.getOptionValue('\000', "");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        commandLine0.addArg("[ option: 4  :: null ::  ]");
        java.lang.String str12 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.Class<?> wildcardClass14 = commandLine0.getClass();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1598() throws Throwable {
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
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue('\000');
        boolean boolean7 = commandLine0.hasOption('#');
        java.lang.String[] strArray9 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('a');
        java.lang.String str7 = commandLine0.getOptionValue('\000', "");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        commandLine0.addArg("[ option: 4  :: null ::  ]");
        java.lang.String str12 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray14 = commandLine0.getOptionValues("[ option: 4 arg  :: null ]");
        java.util.Iterator iterator15 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.util.Iterator iterator6 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(optionArray7);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        boolean boolean7 = commandLine0.hasOption("");
        commandLine0.addArg("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        boolean boolean11 = commandLine0.hasOption("[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("[ option: 4 arg  :: null ]");
        java.lang.Object obj15 = commandLine0.getOptionObject("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String str9 = commandLine0.getOptionValue(" ");
        java.lang.String[] strArray11 = commandLine0.getOptionValues('#');
        commandLine0.addArg("[ Options: [ short {=[ option:  +ARG ::  ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('a');
        java.lang.String str7 = commandLine0.getOptionValue('\000', "");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.String str10 = commandLine0.getOptionValue("org.apache.commons.cli.ParseException: arg");
        boolean boolean12 = commandLine0.hasOption('\000');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue('\000');
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('\000');
        java.lang.String str11 = commandLine0.getOptionValue('\000');
        java.lang.Object obj13 = commandLine0.getOptionObject("[ option:    :: null ]");
        commandLine0.addArg("org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.UnrecognizedOptionException: [ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str7 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setDescription("");
        option9.setLongOpt("hi!");
        commandLine0.addOption(option9);
        commandLine0.addArg("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str19 = commandLine0.getOptionValue("[ option: 4  :: null :: [ option:   [ option: 4  ::  ]  :: null ] ]", "[ option: 4   :: null ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ option: 4   :: null ]" + "'", str19, "[ option: 4   :: null ]");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setDescription("");
        option9.setLongOpt("hi!");
        commandLine0.addOption(option9);
        java.lang.String str15 = option9.getValue();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.util.List list6 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test1610() throws Throwable {
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
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        boolean boolean6 = commandLine0.hasOption("[ option: 4  :: null ]");
        java.lang.String[] strArray8 = commandLine0.getOptionValues("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str11 = commandLine0.getOptionValue('a', "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]" + "'", str11, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        commandLine0.addArg("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('4');
        java.lang.String[] strArray10 = commandLine0.getArgs();
        java.lang.Object obj12 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        commandLine0.addArg("org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String str7 = commandLine0.getOptionValue('4');
        java.lang.String str9 = commandLine0.getOptionValue('4');
        java.util.List list10 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.util.Iterator iterator6 = commandLine0.iterator();
        java.lang.Object obj8 = commandLine0.getOptionObject("[ option:    :: null ]");
        java.lang.String str10 = commandLine0.getOptionValue('#');
        java.lang.String str12 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.lang.String str9 = commandLine0.getOptionValue('a', "[ option: 4 hi!  ::  ]");
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ option: 4 hi!  ::  ]" + "'", str9, "[ option: 4 hi!  ::  ]");
        org.junit.Assert.assertNotNull(optionArray10);
    }

    @Test
    public void test1616() throws Throwable {
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
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        boolean boolean6 = commandLine0.hasOption("[ option: 4  :: null ]");
        java.lang.String[] strArray8 = commandLine0.getOptionValues("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        boolean boolean10 = commandLine0.hasOption('a');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.util.Iterator iterator12 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue('\000');
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.lang.String[] strArray9 = commandLine0.getOptionValues("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String str11 = commandLine0.getOptionValue('\000');
        java.lang.String[] strArray13 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray15 = commandLine0.getOptionValues("[ Options: [ short {4=[ option: 4  :: null ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        boolean boolean6 = commandLine0.hasOption("[ option: 4  :: null ]");
        boolean boolean8 = commandLine0.hasOption('=');
        java.util.List list9 = commandLine0.getArgList();
        java.util.List list10 = commandLine0.getArgList();
        java.util.Iterator iterator11 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue('\000');
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.util.List list8 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        boolean boolean5 = commandLine0.hasOption("hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.Object obj8 = commandLine0.getOptionObject("[ option:   [ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]  :: null ]");
        java.lang.String[] strArray10 = commandLine0.getOptionValues('\000');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        boolean boolean6 = commandLine0.hasOption("[ option: 4  :: null ]");
        java.lang.String[] strArray8 = commandLine0.getOptionValues("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str11 = commandLine0.getOptionValue('#', " ");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertNotNull(optionArray12);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.util.Iterator iterator6 = commandLine0.iterator();
        boolean boolean8 = commandLine0.hasOption("");
        boolean boolean10 = commandLine0.hasOption('4');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String str13 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        java.lang.String str7 = commandLine0.getOptionValue('4', "org.apache.commons.cli.MissingArgumentException: arg");
        java.lang.String str9 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.cli.MissingArgumentException: arg" + "'", str7, "org.apache.commons.cli.MissingArgumentException: arg");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        boolean boolean5 = commandLine0.hasOption("hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.Object obj8 = commandLine0.getOptionObject("[ option:   [ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]  :: null ]");
        java.util.List list9 = commandLine0.getArgList();
        java.util.Iterator iterator10 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        java.lang.String str23 = commandLine21.getOptionValue("[ option:  +ARG ::  ]");
        java.lang.Object obj25 = commandLine21.getOptionObject("");
        java.util.Iterator iterator26 = commandLine21.iterator();
        java.lang.Object obj28 = commandLine21.getOptionObject("[ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]");
        boolean boolean30 = commandLine21.hasOption("[ option: arg [ option: 4  :: null ] +ARG :: 4 ]");
        java.lang.String[] strArray31 = commandLine21.getArgs();
        org.apache.commons.cli.Option[] optionArray32 = commandLine21.getOptions();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(optionArray32);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        boolean boolean5 = commandLine0.hasOption("hi!");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        commandLine0.addArg("org.apache.commons.cli.UnrecognizedOptionException: [ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.util.Iterator iterator12 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        java.lang.String str6 = commandLine0.getOptionValue("[ option:    :: null ]");
        boolean boolean8 = commandLine0.hasOption("hi!");
        boolean boolean10 = commandLine0.hasOption("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        boolean boolean12 = commandLine0.hasOption('=');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        commandLine0.addArg("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('4');
        java.lang.Object obj11 = commandLine0.getOptionObject("[ option: 4 arg  :: null ]");
        boolean boolean13 = commandLine0.hasOption("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray7 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray9 = commandLine0.getOptionValues("arg");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test1631() throws Throwable {
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
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String str10 = commandLine0.getOptionValue("[ option: 4  :: null ]", "org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.Object obj13 = commandLine0.getOptionObject("org.apache.commons.cli.MissingArgumentException: [ option:    :: null ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.cli.MissingOptionException: hi!" + "'", str10, "org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue('\000');
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.lang.String str9 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue('\000');
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.lang.String[] strArray9 = commandLine0.getOptionValues("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String str11 = commandLine0.getOptionValue('\000');
        java.lang.Object obj13 = commandLine0.getOptionObject("[ Options: [ short { =[ option:    +ARG :: org.apache.commons.cli.UnrecognizedOptionException: hi! ], 4=[ option: 4  ::  ]} ] [ long {=[ option:    +ARG :: org.apache.commons.cli.UnrecognizedOptionException: hi! ]} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        boolean boolean7 = commandLine0.hasOption("");
        commandLine0.addArg("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        boolean boolean11 = commandLine0.hasOption("[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.Object obj13 = commandLine0.getOptionObject("[ option: 4 [ option: 4 hi!  ::  :: [ Options: [ short {} ] [ long {} ] ]  :: null ]");
        commandLine0.addArg("[ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str7 = commandLine0.getOptionValue("arg");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('4');
        java.util.List list11 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.util.Iterator iterator6 = commandLine0.iterator();
        java.lang.Object obj8 = commandLine0.getOptionObject("[ option:    :: null ]");
        java.lang.String str10 = commandLine0.getOptionValue(' ');
        java.lang.String[] strArray12 = commandLine0.getOptionValues('=');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test1638() throws Throwable {
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
    public void test1639() throws Throwable {
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
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue('\000');
        java.lang.String str7 = commandLine0.getOptionValue("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        java.lang.Object obj9 = commandLine0.getOptionObject("org.apache.commons.cli.UnrecognizedOptionException: [ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  :: [ option: arg [ option: 4  :: null ] +ARG :: org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi! ] ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.lang.String str9 = commandLine0.getOptionValue('a', "[ option: 4 hi!  ::  ]");
        java.lang.String str12 = commandLine0.getOptionValue('\000', "[ option:   :: null ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ option: 4 hi!  ::  ]" + "'", str9, "[ option: 4 hi!  ::  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:   :: null ]" + "'", str12, "[ option:   :: null ]");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str7 = commandLine0.getOptionValue("arg");
        java.lang.String str9 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("org.apache.commons.cli.MissingOptionException: [ option: 4  :: null ]");
        commandLine0.addArg("[ option: 4  :: hi! ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.lang.String str9 = commandLine0.getOptionValue('a', "[ option: 4 hi!  ::  ]");
        java.util.List list10 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray13 = commandLine0.getOptionValues('\000');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ option: 4 hi!  ::  ]" + "'", str9, "[ option: 4 hi!  ::  ]");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        commandLine0.addArg("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('4');
        java.lang.String[] strArray10 = commandLine0.getArgs();
        java.util.List list11 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option option9 = org.apache.commons.cli.OptionBuilder.create('4');
        option9.setDescription("");
        option9.setLongOpt("hi!");
        commandLine0.addOption(option9);
        java.util.Iterator iterator15 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(option9);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        boolean boolean7 = commandLine0.hasOption("[ option: 4 hi!  ::  ]");
        java.lang.String str9 = commandLine0.getOptionValue("org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!");
        commandLine0.addArg("[ option: 4   :: null ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        boolean boolean5 = commandLine0.hasOption("hi!");
        java.util.List list6 = commandLine0.getArgList();
        boolean boolean8 = commandLine0.hasOption('#');
        java.lang.String[] strArray10 = commandLine0.getOptionValues("org.apache.commons.cli.MissingArgumentException: [ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String str10 = commandLine0.getOptionValue("[ option: 4  :: null ]", "org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.Object obj12 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.cli.MissingOptionException: hi!" + "'", str10, "org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        java.lang.Object obj6 = commandLine0.getOptionObject('#');
        java.lang.String str8 = commandLine0.getOptionValue("4");
        java.lang.String str11 = commandLine0.getOptionValue('\000', "");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue('\000');
        boolean boolean7 = commandLine0.hasOption('#');
        java.lang.String str9 = commandLine0.getOptionValue("[ Options: [ short {} ] [ long {} ]");
        java.lang.String str11 = commandLine0.getOptionValue("org.apache.commons.cli.MissingOptionException: [ option: 4  :: hi! ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray7 = commandLine0.getOptionValues('a');
        java.lang.Object obj9 = commandLine0.getOptionObject('\000');
        java.lang.String str11 = commandLine0.getOptionValue("org.apache.commons.cli.UnrecognizedOptionException: ");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        boolean boolean5 = commandLine0.hasOption("hi!");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String str11 = commandLine0.getOptionValue('a', "[ option: 4  :: null ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ option: 4  :: null ]" + "'", str11, "[ option: 4  :: null ]");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        boolean boolean6 = commandLine0.hasOption("[ option: 4  :: null ]");
        boolean boolean8 = commandLine0.hasOption('=');
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String str12 = commandLine0.getOptionValue(' ', "[ option:    :: null :: arg ]");
        java.util.Iterator iterator13 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option:    :: null :: arg ]" + "'", str12, "[ option:    :: null :: arg ]");
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.Object obj5 = commandLine0.getOptionObject('\000');
        java.lang.String[] strArray7 = commandLine0.getOptionValues('a');
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String str10 = commandLine0.getOptionValue("[ option: 4 [ option: 4 hi!  ::  :: [ Options: [ short {} ] [ long {} ] ]  :: null ]");
        java.lang.Object obj12 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String str10 = commandLine0.getOptionValue("[ option: 4  :: null ]", "org.apache.commons.cli.MissingOptionException: hi!");
        commandLine0.addArg("org.apache.commons.cli.MissingArgumentException: [ option:    :: null ]");
        commandLine0.addArg("org.apache.commons.cli.UnrecognizedOptionException: arg");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.cli.MissingOptionException: hi!" + "'", str10, "org.apache.commons.cli.MissingOptionException: hi!");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue('\000');
        java.lang.String str7 = commandLine0.getOptionValue("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        boolean boolean9 = commandLine0.hasOption('\000');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str7 = commandLine0.getOptionValue("arg");
        java.util.Iterator iterator8 = commandLine0.iterator();
        java.lang.String str10 = commandLine0.getOptionValue("[ Options: [ short {4=[ option: 4  :: null ::  ]} ] [ long {} ]");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(optionArray11);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue('\000');
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.lang.Object obj9 = commandLine0.getOptionObject("[ Options: [ short {4=[ option: 4  :: null ]} ] [ long {} ]");
        java.lang.String[] strArray11 = commandLine0.getOptionValues('#');
        java.util.Iterator iterator12 = commandLine0.iterator();
        boolean boolean14 = commandLine0.hasOption('a');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        org.apache.commons.cli.Option option7 = org.apache.commons.cli.OptionBuilder.create(' ');
        commandLine0.addOption(option7);
        java.lang.String[] strArray10 = commandLine0.getOptionValues("[ option: 4  :: null ]");
        java.lang.Object obj12 = commandLine0.getOptionObject("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.Object obj14 = commandLine0.getOptionObject("[ Options: [ short {4=[ option: 4  :: null ::  ]} ] [ long {} ]");
        commandLine0.addArg("org.apache.commons.cli.MissingOptionException: [ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(option7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String str10 = commandLine0.getOptionValue("[ option: 4  :: null ]", "org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('4');
        commandLine0.addArg("org.apache.commons.cli.MissingOptionException: [ option: 4  :: null ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.cli.MissingOptionException: hi!" + "'", str10, "org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue('\000');
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.lang.Object obj9 = commandLine0.getOptionObject("[ Options: [ short {4=[ option: 4  :: null ]} ] [ long {} ]");
        java.lang.String[] strArray11 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test1662() throws Throwable {
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
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.Object obj6 = commandLine0.getOptionObject("org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!");
        java.util.Iterator iterator7 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        org.apache.commons.cli.Option option7 = org.apache.commons.cli.OptionBuilder.create(' ');
        commandLine0.addOption(option7);
        java.lang.String str9 = option7.getDescription();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(option7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1665() throws Throwable {
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
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        java.lang.String str7 = commandLine0.getOptionValue("[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]", "arg");
        boolean boolean9 = commandLine0.hasOption('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("[ option:  +ARG ::  ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test1667() throws Throwable {
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
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        boolean boolean7 = commandLine0.hasOption("");
        commandLine0.addArg("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        java.util.Iterator iterator10 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(optionArray11);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String str9 = commandLine0.getOptionValue(" ");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test1670() throws Throwable {
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
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue('\000');
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('\000');
        java.lang.String str11 = commandLine0.getOptionValue('\000');
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.util.Iterator iterator15 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        boolean boolean7 = commandLine0.hasOption("");
        boolean boolean9 = commandLine0.hasOption(' ');
        boolean boolean11 = commandLine0.hasOption("arg");
        java.lang.String str13 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray7 = commandLine0.getOptionValues('a');
        java.lang.Object obj9 = commandLine0.getOptionObject('\000');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(optionArray10);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        org.apache.commons.cli.Option option7 = org.apache.commons.cli.OptionBuilder.create(' ');
        commandLine0.addOption(option7);
        java.lang.String[] strArray10 = commandLine0.getOptionValues("[ option: arg [ option: 4  :: null ] +ARG :: 4 ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(option7);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str7 = commandLine0.getOptionValue("arg");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        boolean boolean10 = commandLine0.hasOption("org.apache.commons.cli.UnrecognizedOptionException: [ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue('\000');
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('\000');
        java.lang.String str11 = commandLine0.getOptionValue("[ option:    :: null :: arg ]");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        boolean boolean6 = commandLine0.hasOption("[ option: 4  :: null ]");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String[] strArray9 = commandLine0.getOptionValues("org.apache.commons.cli.ParseException: [ option: 4  :: null ::  ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        boolean boolean7 = commandLine0.hasOption("[ option: 4 hi!  ::  ]");
        java.util.Iterator iterator8 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        java.lang.String str7 = commandLine0.getOptionValue("[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]", "arg");
        boolean boolean9 = commandLine0.hasOption('#');
        java.lang.String str11 = commandLine0.getOptionValue('a');
        commandLine0.addArg("[ option: 4  :: hi! ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1680() throws Throwable {
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
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue('\000');
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.lang.Object obj9 = commandLine0.getOptionObject("[ Options: [ short {4=[ option: 4  :: null ]} ] [ long {} ]");
        java.util.Iterator iterator10 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        boolean boolean6 = commandLine0.hasOption("[ option: 4  :: null ]");
        boolean boolean8 = commandLine0.hasOption('=');
        java.lang.String str11 = commandLine0.getOptionValue('4', "");
        boolean boolean13 = commandLine0.hasOption('=');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        boolean boolean6 = commandLine0.hasOption("[ option: 4  :: null ]");
        boolean boolean8 = commandLine0.hasOption('=');
        java.util.List list9 = commandLine0.getArgList();
        java.lang.Object obj11 = commandLine0.getOptionObject("[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str7 = commandLine0.getOptionValue("arg");
        java.lang.String str9 = commandLine0.getOptionValue('a');
        commandLine0.addArg("[ option:    :: null ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str5, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.Object obj8 = commandLine0.getOptionObject("[ option:   [ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]  :: null ]");
        boolean boolean10 = commandLine0.hasOption('#');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        boolean boolean6 = commandLine0.hasOption("[ option: 4  :: null ]");
        boolean boolean8 = commandLine0.hasOption('=');
        boolean boolean10 = commandLine0.hasOption("[ option: 4  :: null :: [ option: 4  :: null ] ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.Object obj6 = commandLine0.getOptionObject("org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject(' ');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        org.apache.commons.cli.Option option7 = org.apache.commons.cli.OptionBuilder.create(' ');
        commandLine0.addOption(option7);
        java.lang.String[] strArray10 = commandLine0.getOptionValues("[ option: 4  :: null ]");
        java.util.List list11 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(option7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        java.lang.Object obj6 = commandLine0.getOptionObject('#');
        java.lang.String str8 = commandLine0.getOptionValue("4");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        java.lang.String str6 = commandLine0.getOptionValue("[ option:    :: null ]");
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        boolean boolean7 = commandLine0.hasOption("");
        commandLine0.addArg("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        boolean boolean11 = commandLine0.hasOption("[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]");
        java.util.List list12 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        java.lang.String str7 = commandLine0.getOptionValue("[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]", "arg");
        java.lang.String str9 = commandLine0.getOptionValue("[ option:  +ARG ::  ]");
        boolean boolean11 = commandLine0.hasOption('=');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue('\000');
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.lang.String[] strArray9 = commandLine0.getOptionValues("org.apache.commons.cli.MissingOptionException: hi!");
        java.lang.String str12 = commandLine0.getOptionValue('a', "[ option: 4 arg  :: null ]");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ option: 4 arg  :: null ]" + "'", str12, "[ option: 4 arg  :: null ]");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!");
        boolean boolean7 = commandLine0.hasOption("");
        commandLine0.addArg("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        boolean boolean11 = commandLine0.hasOption("[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String str13 = commandLine0.getOptionValue("[ option: 4  :: null ::  ]");
        java.util.List list14 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue('\000');
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        boolean boolean6 = commandLine0.hasOption("[ option: 4  :: null ]");
        boolean boolean8 = commandLine0.hasOption('=');
        java.lang.String str11 = commandLine0.getOptionValue('4', "");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("a");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue('\000');
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('\000');
        java.lang.String str11 = commandLine0.getOptionValue('\000');
        java.lang.Object obj13 = commandLine0.getOptionObject("[ option:    :: null ]");
        java.lang.String[] strArray14 = commandLine0.getArgs();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        java.lang.String str23 = commandLine21.getOptionValue("[ option:  +ARG ::  ]");
        java.lang.Object obj25 = commandLine21.getOptionObject("");
        java.util.Iterator iterator26 = commandLine21.iterator();
        java.lang.Object obj28 = commandLine21.getOptionObject("[ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]");
        boolean boolean30 = commandLine21.hasOption("[ option: arg [ option: 4  :: null ] +ARG :: 4 ]");
        java.lang.String[] strArray31 = commandLine21.getArgs();
        java.util.Iterator iterator32 = commandLine21.iterator();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(iterator32);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        java.lang.String str7 = commandLine0.getOptionValue("[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]", "arg");
        java.lang.String str9 = commandLine0.getOptionValue("[ option:  +ARG ::  ]");
        java.util.List list10 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1700() throws Throwable {
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
    public void test1701() throws Throwable {
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
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue('\000');
        java.lang.Object obj7 = commandLine0.getOptionObject("[ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]");
        java.util.Iterator iterator8 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        boolean boolean6 = commandLine0.hasOption("[ option: 4  :: null ]");
        boolean boolean8 = commandLine0.hasOption('=');
        java.lang.String[] strArray10 = commandLine0.getOptionValues("4");
        java.lang.String str12 = commandLine0.getOptionValue('=');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        boolean boolean6 = commandLine0.hasOption("[ option: 4  :: null ]");
        boolean boolean8 = commandLine0.hasOption('=');
        java.util.List list9 = commandLine0.getArgList();
        java.util.Iterator iterator10 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.util.Iterator iterator4 = commandLine0.iterator();
        boolean boolean6 = commandLine0.hasOption("[ option: 4  :: null ]");
        boolean boolean8 = commandLine0.hasOption('=');
        java.lang.String[] strArray9 = commandLine0.getArgs();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
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
        option15.setArgs((int) '\000');
        option15.addValue("");
        org.apache.commons.cli.Options options23 = options1.addOption(option15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options28 = options1.addOption("[ option: 4  :: [ Options: [ short {4=[ option: 4  :: null ]} ] [ long {} ] ::  ]", "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!", true, "org.apache.commons.cli.ParseException: org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.UnrecognizedOptionException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '['");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(option15);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(options23);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        java.lang.String str23 = commandLine21.getOptionValue("[ option:  +ARG ::  ]");
        java.lang.Object obj25 = commandLine21.getOptionObject("");
        java.util.Iterator iterator26 = commandLine21.iterator();
        java.lang.Object obj28 = commandLine21.getOptionObject("[ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]");
        java.lang.Object obj30 = commandLine21.getOptionObject('=');
        java.util.Iterator iterator31 = commandLine21.iterator();
        org.apache.commons.cli.OptionBuilder optionBuilder32 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) iterator31);
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(optionBuilder32);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        java.util.Collection collection7 = options1.getOptions();
        boolean boolean9 = options1.hasOption("arg");
        java.lang.String[] strArray12 = new java.lang.String[] { "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]", "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!" };
        org.apache.commons.cli.CommandLine commandLine13 = posixParser0.parse(options1, strArray12);
        commandLine13.addArg("[ option: 4  :: null ::  ]");
        java.util.Iterator iterator16 = commandLine13.iterator();
        java.lang.Object obj18 = commandLine13.getOptionObject("[ Options: [ short {4=[ option: 4  ::  :: [ option: arg [ option: 4  :: null ] +ARG :: 4 ] ]} ] [ long {} ]");
        java.lang.String str21 = commandLine13.getOptionValue(' ', "org.apache.commons.cli.MissingOptionException: [ option: 4  :: null ]");
        boolean boolean23 = commandLine13.hasOption('#');
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(commandLine13);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.cli.MissingOptionException: [ option: 4  :: null ]" + "'", str21, "org.apache.commons.cli.MissingOptionException: [ option: 4  :: null ]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        java.util.Collection collection7 = options1.getOptions();
        boolean boolean9 = options1.hasOption("arg");
        java.lang.String[] strArray12 = new java.lang.String[] { "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]", "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!" };
        org.apache.commons.cli.CommandLine commandLine13 = posixParser0.parse(options1, strArray12);
        commandLine13.addArg("[ option: 4  :: null ::  ]");
        java.util.Iterator iterator16 = commandLine13.iterator();
        java.lang.Object obj18 = commandLine13.getOptionObject("[ Options: [ short {4=[ option: 4  ::  :: [ option: arg [ option: 4  :: null ] +ARG :: 4 ] ]} ] [ long {} ]");
        java.lang.String str21 = commandLine13.getOptionValue(' ', "org.apache.commons.cli.MissingOptionException: [ option: 4  :: null ]");
        java.lang.String str23 = commandLine13.getOptionValue("[ option: 4  :: null :: [ option:   [ option: 4  ::  ]  :: null ] ]");
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(commandLine13);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.cli.MissingOptionException: [ option: 4  :: null ]" + "'", str21, "org.apache.commons.cli.MissingOptionException: [ option: 4  :: null ]");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        java.util.Collection collection23 = options6.getOptionGroups();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options28 = options6.addOption("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ::  ]} ] [ long {} ]", "[ option:   [ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]  :: null ]", true, "[ option: 4  ::  :: [] ]");
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
        org.junit.Assert.assertNotNull(optionBuilder22);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        boolean boolean14 = options1.hasOption(" ");
        org.apache.commons.cli.Option option16 = org.apache.commons.cli.OptionBuilder.create('4');
        java.lang.String str18 = option16.getValue("arg");
        org.apache.commons.cli.MissingOptionException missingOptionException20 = new org.apache.commons.cli.MissingOptionException("hi!");
        boolean boolean21 = option16.equals((java.lang.Object) "hi!");
        option16.setValueSeparator('=');
        option16.setLongOpt("[ option: 4 hi!  ::  :: [ Options: [ short {} ] [ long {} ] ]");
        java.lang.String str26 = option16.getDescription();
        java.util.List list27 = option16.getValuesList();
        org.apache.commons.cli.OptionGroup optionGroup28 = options1.getOptionGroup(option16);
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNull(optionGroup28);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
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
        org.apache.commons.cli.Option option25 = options1.getOption("org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str13, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNull(option25);
    }

    @Test
    public void test1713() throws Throwable {
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
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        boolean boolean23 = options6.hasOption("hi!");
        org.apache.commons.cli.Option option25 = org.apache.commons.cli.OptionBuilder.create('4');
        char char26 = option25.getValueSeparator();
        boolean boolean27 = option25.hasArg();
        option25.setValueSeparator('a');
        option25.setArgs(52);
        boolean boolean32 = option25.isRequired();
        org.apache.commons.cli.OptionGroup optionGroup33 = options6.getOptionGroup(option25);
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(option25);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(optionGroup33);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
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
        char char25 = option24.getValueSeparator();
        org.apache.commons.cli.Options options26 = options6.addOption(option24);
        org.apache.commons.cli.Option option28 = options26.getOption("[ option:   [ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]  :: null ]");
        java.util.Collection collection29 = options26.getOptionGroups();
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
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNull(option28);
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        java.util.Collection collection21 = options6.getOptionGroups();
        java.util.List list22 = options6.helpOptions();
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
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
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
        commandLine18.addArg("org.apache.commons.cli.UnrecognizedOptionException: [ option: 4 hi!  ::  :: [ Options: [ short {} ] [ long {} ] ]");
        java.lang.String[] strArray22 = commandLine18.getOptionValues('a');
        java.util.Iterator iterator23 = commandLine18.iterator();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str13, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(iterator23);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        org.apache.commons.cli.OptionBuilder optionBuilder33 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) options6);
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
        org.junit.Assert.assertNotNull(optionBuilder33);
    }

    @Test
    public void test1719() throws Throwable {
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
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
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
        java.lang.String str33 = option24.getLongOpt();
        option24.setArgName("org.apache.commons.cli.MissingOptionException: ");
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
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        boolean boolean20 = options1.hasOption("org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.UnrecognizedOptionException: hi!");
        java.util.List list21 = options1.getRequiredOptions();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str13, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
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
        java.util.Collection collection23 = options6.getOptionGroups();
        org.apache.commons.cli.Option option25 = options6.getOption("[ option: 4  :: org.apache.commons.cli.ParseException: arg ]");
        org.apache.commons.cli.OptionGroup optionGroup26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options27 = options6.addOptionGroup(optionGroup26);
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
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(option25);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        java.lang.String[] strArray13 = commandLine12.getArgs();
        java.lang.String str15 = commandLine12.getOptionValue('4');
        java.lang.String str18 = commandLine12.getOptionValue("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]", "[ option:   [ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]  :: null ]");
        java.lang.String str21 = commandLine12.getOptionValue("org.apache.commons.cli.UnrecognizedOptionException: arg", "arg");
        java.lang.Class<?> wildcardClass22 = commandLine12.getClass();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:   [ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]  :: null ]" + "'", str18, "[ option:   [ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]  :: null ]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
        java.lang.String[] strArray13 = commandLine12.getArgs();
        java.lang.String str15 = commandLine12.getOptionValue('4');
        java.lang.String str18 = commandLine12.getOptionValue("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]", "[ option:   [ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]  :: null ]");
        java.lang.String str21 = commandLine12.getOptionValue("org.apache.commons.cli.UnrecognizedOptionException: arg", "arg");
        java.lang.String[] strArray23 = commandLine12.getOptionValues(' ');
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:   [ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]  :: null ]" + "'", str18, "[ option:   [ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]  :: null ]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertNull(strArray23);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        java.lang.String[] strArray13 = commandLine12.getArgs();
        java.lang.String str15 = commandLine12.getOptionValue('4');
        java.lang.String str18 = commandLine12.getOptionValue("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]", "[ option:   [ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]  :: null ]");
        java.lang.String str21 = commandLine12.getOptionValue("org.apache.commons.cli.UnrecognizedOptionException: arg", "arg");
        java.util.Iterator iterator22 = commandLine12.iterator();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:   [ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]  :: null ]" + "'", str18, "[ option:   [ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]  :: null ]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertNotNull(iterator22);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
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
        boolean boolean33 = option24.hasOptionalArg();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        java.util.Collection collection24 = options1.getOptions();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str13, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
        java.util.List list24 = options23.helpOptions();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str13, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        char char24 = option23.getValueSeparator();
        org.apache.commons.cli.Option option26 = org.apache.commons.cli.OptionBuilder.create('4');
        option26.setDescription("");
        option23.setType((java.lang.Object) "");
        java.lang.String str30 = option23.getKey();
        org.apache.commons.cli.Options options31 = options6.addOption(option23);
        option23.setValueSeparator(' ');
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(option23);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "4" + "'", str30, "4");
        org.junit.Assert.assertNotNull(options31);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
        posixParser0.burstToken("[ Options: [ short {4=[ option: 4  :: null ]} ] [ long {} ]", false);
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option(" ", "", false, "org.apache.commons.cli.MissingOptionException: hi!");
        org.apache.commons.cli.UnrecognizedOptionException unrecognizedOptionException22 = new org.apache.commons.cli.UnrecognizedOptionException("[ Options: [ short {} ] [ long {} ]");
        boolean boolean23 = option20.equals((java.lang.Object) unrecognizedOptionException22);
        java.util.ListIterator listIterator24 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option20, listIterator24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        java.util.Collection collection7 = options1.getOptions();
        boolean boolean9 = options1.hasOption("arg");
        java.lang.String[] strArray12 = new java.lang.String[] { "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]", "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!" };
        org.apache.commons.cli.CommandLine commandLine13 = posixParser0.parse(options1, strArray12);
        commandLine13.addArg("[ option: 4  :: null ::  ]");
        java.util.Iterator iterator16 = commandLine13.iterator();
        java.lang.Object obj18 = commandLine13.getOptionObject("[ Options: [ short {4=[ option: 4  ::  :: [ option: arg [ option: 4  :: null ] +ARG :: 4 ] ]} ] [ long {} ]");
        java.lang.Object obj20 = commandLine13.getOptionObject('4');
        commandLine13.addArg("org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(commandLine13);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        java.util.List list33 = options6.getRequiredOptions();
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
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        java.lang.String str20 = commandLine18.getOptionValue('#');
        org.apache.commons.cli.Option[] optionArray21 = commandLine18.getOptions();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str13, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(optionArray21);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        java.util.Collection collection7 = options1.getOptions();
        boolean boolean9 = options1.hasOption("arg");
        java.lang.String[] strArray12 = new java.lang.String[] { "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]", "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!" };
        org.apache.commons.cli.CommandLine commandLine13 = posixParser0.parse(options1, strArray12);
        commandLine13.addArg("[ option: 4  :: null ::  ]");
        java.util.Iterator iterator16 = commandLine13.iterator();
        java.lang.Object obj18 = commandLine13.getOptionObject("[ Options: [ short {4=[ option: 4  ::  :: [ option: arg [ option: 4  :: null ] +ARG :: 4 ] ]} ] [ long {} ]");
        java.lang.Object obj20 = commandLine13.getOptionObject('4');
        java.lang.Object obj22 = commandLine13.getOptionObject('a');
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(commandLine13);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
        java.lang.String str20 = commandLine18.getOptionValue('#');
        java.lang.Object obj22 = commandLine18.getOptionObject("");
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str13, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        option15.setArgs((int) '\000');
        option15.addValue("");
        org.apache.commons.cli.Options options23 = options1.addOption(option15);
        org.apache.commons.cli.OptionGroup optionGroup24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options25 = options23.addOptionGroup(optionGroup24);
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
        org.junit.Assert.assertNotNull(options23);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        java.lang.String[] strArray20 = commandLine18.getOptionValues("[ option: 4  :: null :: [ option:   [ option: 4  ::  ]  :: null ] ]");
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str13, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNull(strArray20);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        java.util.Collection collection7 = options1.getOptions();
        boolean boolean9 = options1.hasOption("arg");
        java.lang.String[] strArray12 = new java.lang.String[] { "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]", "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!" };
        org.apache.commons.cli.CommandLine commandLine13 = posixParser0.parse(options1, strArray12);
        org.apache.commons.cli.Option option17 = new org.apache.commons.cli.Option("", true, "");
        option17.setRequired(true);
        boolean boolean20 = option17.hasArgs();
        org.apache.commons.cli.OptionGroup optionGroup21 = options1.getOptionGroup(option17);
        int int22 = option17.getArgs();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(commandLine13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(optionGroup21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        boolean boolean20 = commandLine18.hasOption(' ');
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str13, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        java.util.Collection collection7 = options1.getOptions();
        boolean boolean9 = options1.hasOption("arg");
        java.lang.String[] strArray12 = new java.lang.String[] { "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]", "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!" };
        org.apache.commons.cli.CommandLine commandLine13 = posixParser0.parse(options1, strArray12);
        commandLine13.addArg("[ option: 4  :: null ::  ]");
        java.util.Iterator iterator16 = commandLine13.iterator();
        java.lang.Object obj18 = commandLine13.getOptionObject("[ Options: [ short {4=[ option: 4  ::  :: [ option: arg [ option: 4  :: null ] +ARG :: 4 ] ]} ] [ long {} ]");
        java.util.Iterator iterator19 = commandLine13.iterator();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(commandLine13);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        java.lang.String str23 = commandLine21.getOptionValue("[ option:  +ARG ::  ]");
        java.lang.Object obj25 = commandLine21.getOptionObject("");
        java.util.Iterator iterator26 = commandLine21.iterator();
        java.lang.Object obj28 = commandLine21.getOptionObject("[ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]");
        java.lang.String[] strArray30 = commandLine21.getOptionValues('4');
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(strArray30);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        java.util.Collection collection7 = options1.getOptions();
        boolean boolean9 = options1.hasOption("arg");
        java.lang.String[] strArray12 = new java.lang.String[] { "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]", "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!" };
        org.apache.commons.cli.CommandLine commandLine13 = posixParser0.parse(options1, strArray12);
        commandLine13.addArg("[ option: 4  :: null ::  ]");
        java.util.Iterator iterator16 = commandLine13.iterator();
        java.lang.Object obj18 = commandLine13.getOptionObject("[ Options: [ short {4=[ option: 4  ::  :: [ option: arg [ option: 4  :: null ] +ARG :: 4 ] ]} ] [ long {} ]");
        java.lang.Object obj20 = commandLine13.getOptionObject('#');
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(commandLine13);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        boolean boolean14 = options1.hasOption(" ");
        java.util.Collection collection15 = options1.getOptionGroups();
        boolean boolean17 = options1.hasOption("org.apache.commons.cli.MissingArgumentException:  ");
        org.apache.commons.cli.OptionGroup optionGroup18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options19 = options1.addOptionGroup(optionGroup18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        java.lang.String str23 = commandLine21.getOptionValue("[ option:  +ARG ::  ]");
        java.lang.Object obj25 = commandLine21.getOptionObject("");
        java.util.Iterator iterator26 = commandLine21.iterator();
        java.lang.Object obj28 = commandLine21.getOptionObject("[ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]");
        java.util.Iterator iterator29 = commandLine21.iterator();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(iterator29);
    }

    @Test
    public void test1745() throws Throwable {
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
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        java.lang.String[] strArray13 = commandLine12.getArgs();
        java.lang.String str15 = commandLine12.getOptionValue('4');
        java.lang.String str18 = commandLine12.getOptionValue("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]", "[ option:   [ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]  :: null ]");
        java.lang.Object obj20 = commandLine12.getOptionObject("[ option: arg [ option: 4  :: null ] +ARG :: 4 ]");
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ option:   [ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]  :: null ]" + "'", str18, "[ option:   [ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]  :: null ]");
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        java.util.Collection collection7 = options1.getOptions();
        boolean boolean9 = options1.hasOption("arg");
        java.lang.String[] strArray12 = new java.lang.String[] { "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]", "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!" };
        org.apache.commons.cli.CommandLine commandLine13 = posixParser0.parse(options1, strArray12);
        commandLine13.addArg("[ option: 4  :: null ::  ]");
        java.util.Iterator iterator16 = commandLine13.iterator();
        java.util.List list17 = commandLine13.getArgList();
        java.lang.String str19 = commandLine13.getOptionValue("[ Options: [ short {4=[ option: 4  :: null ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(commandLine13);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        java.lang.Object obj14 = commandLine12.getOptionObject('=');
        java.lang.String str17 = commandLine12.getOptionValue("[ option: 4  :: null :: [ option: arg [ option: 4  :: null ] +ARG :: org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi! ] ]", "[ option:  +ARG :: org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi! ]");
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option:  +ARG :: org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi! ]" + "'", str17, "[ option:  +ARG :: org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi! ]");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        java.util.Collection collection7 = options1.getOptions();
        boolean boolean9 = options1.hasOption("arg");
        java.lang.String[] strArray12 = new java.lang.String[] { "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]", "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!" };
        org.apache.commons.cli.CommandLine commandLine13 = posixParser0.parse(options1, strArray12);
        org.apache.commons.cli.Option option14 = null;
        java.util.ListIterator listIterator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option14, listIterator15);
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
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        org.apache.commons.cli.Option option21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup22 = options6.getOptionGroup(option21);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
        java.util.Collection collection23 = options6.getOptionGroups();
        org.apache.commons.cli.OptionGroup optionGroup24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options25 = options6.addOptionGroup(optionGroup24);
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
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        char char25 = option24.getValueSeparator();
        org.apache.commons.cli.Options options26 = options6.addOption(option24);
        boolean boolean27 = option24.hasArgs();
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
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        boolean boolean14 = commandLine12.hasOption("");
        boolean boolean16 = commandLine12.hasOption("[ Options: [ short {=[ option:   :: arg ],  =[ option:    :: [ option: 4  ::  ] ], 4=[ option: 4  :: null ], arg=[ option: arg  :: null ]} ] [ long {} ]");
        org.apache.commons.cli.Option option17 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine12.addOption(option17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        java.util.Collection collection7 = options1.getOptions();
        boolean boolean9 = options1.hasOption("arg");
        java.lang.String[] strArray12 = new java.lang.String[] { "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]", "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!" };
        org.apache.commons.cli.CommandLine commandLine13 = posixParser0.parse(options1, strArray12);
        commandLine13.addArg("[ option: 4  :: null ::  ]");
        java.lang.String str17 = commandLine13.getOptionValue("[ option: 4 arg  :: null ]");
        java.lang.String[] strArray19 = commandLine13.getOptionValues("org.apache.commons.cli.MissingArgumentException: [ option:    :: null ]");
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(commandLine13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options23 = options6.addOption("org.apache.commons.cli.MissingOptionException: [ option: 4  :: null ]", true, "[ option:  +ARG ::  ]");
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
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        java.util.Collection collection23 = options6.getOptions();
        org.apache.commons.cli.Option option25 = options6.getOption("org.apache.commons.cli.ParseException: org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.apache.commons.cli.Option option27 = options6.getOption("[ option:    :: null :: arg ]");
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(option25);
        org.junit.Assert.assertNull(option27);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        boolean boolean14 = options1.hasOption(" ");
        java.util.Collection collection15 = options1.getOptionGroups();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options20 = options1.addOption("[ option: 4  ::  :: false ]", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]", true, "4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '['");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        char char25 = option24.getValueSeparator();
        org.apache.commons.cli.Options options26 = options6.addOption(option24);
        java.lang.String str27 = option24.getValue();
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
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1759() throws Throwable {
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
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        org.apache.commons.cli.OptionGroup optionGroup20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options21 = options6.addOptionGroup(optionGroup20);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        java.util.Collection collection21 = options6.getOptionGroups();
        java.util.List list22 = options6.helpOptions();
        java.util.List list23 = options6.getRequiredOptions();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options26 = options6.addOption("[ Options: [ short {=[ option:  +ARG ::  ]} ] [ long {} ]", false, "");
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
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        java.lang.String str16 = commandLine12.getOptionValue("", "[ option: 4 hi!  ::  :: [ Options: [ short {} ] [ long {} ] ]");
        boolean boolean18 = commandLine12.hasOption("[ option: 4 hi!  ::  :: [ Options: [ short {} ] [ long {} ] ]");
        java.util.List list19 = commandLine12.getArgList();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option: 4 hi!  ::  :: [ Options: [ short {} ] [ long {} ] ]" + "'", str16, "[ option: 4 hi!  ::  :: [ Options: [ short {} ] [ long {} ] ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        java.lang.String[] strArray15 = commandLine12.getOptionValues("4");
        boolean boolean17 = commandLine12.hasOption("[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]");
        java.lang.String[] strArray19 = commandLine12.getOptionValues('a');
        org.apache.commons.cli.Option[] optionArray20 = commandLine12.getOptions();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(optionArray20);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
        java.lang.String str16 = commandLine12.getOptionValue("", "[ option: 4 hi!  ::  :: [ Options: [ short {} ] [ long {} ] ]");
        java.util.List list17 = commandLine12.getArgList();
        java.lang.String str20 = commandLine12.getOptionValue("[ option: 4   :: null ]", "");
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option: 4 hi!  ::  :: [ Options: [ short {} ] [ long {} ] ]" + "'", str16, "[ option: 4 hi!  ::  :: [ Options: [ short {} ] [ long {} ] ]");
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        java.lang.String str24 = commandLine21.getOptionValue("[ option: 4  :: null ]", "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str26 = commandLine21.getOptionValue("");
        boolean boolean28 = commandLine21.hasOption(' ');
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str24, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options17 = options1.addOption("org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!", "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  :: false ]} ] [ long {} ]", true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '.'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
    }

    @Test
    public void test1768() throws Throwable {
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
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        java.util.Collection collection7 = options1.getOptions();
        boolean boolean9 = options1.hasOption("arg");
        java.lang.String[] strArray12 = new java.lang.String[] { "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]", "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!" };
        org.apache.commons.cli.CommandLine commandLine13 = posixParser0.parse(options1, strArray12);
        posixParser0.burstToken("org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.UnrecognizedOptionException: hi!", true);
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(commandLine13);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option3 = org.apache.commons.cli.OptionBuilder.create('4');
        option3.setDescription("");
        org.apache.commons.cli.Options options6 = options1.addOption(option3);
        java.util.Collection collection7 = options1.getOptions();
        boolean boolean9 = options1.hasOption("arg");
        java.lang.String[] strArray12 = new java.lang.String[] { "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  :: null ]} ] [ long {} ]", "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!" };
        org.apache.commons.cli.CommandLine commandLine13 = posixParser0.parse(options1, strArray12);
        java.lang.Class<?> wildcardClass14 = options1.getClass();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(commandLine13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
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
        option15.setArgs((int) '\000');
        option15.addValue("");
        org.apache.commons.cli.Options options23 = options1.addOption(option15);
        java.lang.Class<?> wildcardClass24 = option15.getClass();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(option15);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        java.lang.String str16 = commandLine12.getOptionValue("", "[ option: 4 hi!  ::  :: [ Options: [ short {} ] [ long {} ] ]");
        java.util.List list17 = commandLine12.getArgList();
        java.lang.String[] strArray19 = commandLine12.getOptionValues('a');
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option: 4 hi!  ::  :: [ Options: [ short {} ] [ long {} ] ]" + "'", str16, "[ option: 4 hi!  ::  :: [ Options: [ short {} ] [ long {} ] ]");
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test1773() throws Throwable {
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
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        java.lang.String str23 = commandLine21.getOptionValue("[ option:  +ARG ::  ]");
        java.lang.Object obj25 = commandLine21.getOptionObject("");
        java.util.Iterator iterator26 = commandLine21.iterator();
        java.lang.Class<?> wildcardClass27 = commandLine21.getClass();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        java.lang.String str23 = commandLine21.getOptionValue("[ option:  +ARG ::  ]");
        java.lang.Object obj25 = commandLine21.getOptionObject("");
        java.lang.Object obj27 = commandLine21.getOptionObject('=');
        java.lang.String[] strArray29 = commandLine21.getOptionValues("");
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(strArray29);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
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
        java.lang.String[] strArray15 = commandLine12.getOptionValues("4");
        boolean boolean17 = commandLine12.hasOption("[ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ]");
        java.util.Iterator iterator18 = commandLine12.iterator();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
        java.lang.String str23 = commandLine21.getOptionValue("[ option:  +ARG ::  ]");
        java.lang.Object obj25 = commandLine21.getOptionObject("");
        java.util.Iterator iterator26 = commandLine21.iterator();
        commandLine21.addArg("[ option: 4 arg +ARG :: [ Options: [ short {4=[ option: 4  ::  ]} ] [ long {} ] ]");
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(iterator26);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        boolean boolean15 = commandLine12.hasOption('#');
        java.lang.String str17 = commandLine12.getOptionValue("org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingOptionException: hi!");
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        java.lang.String str16 = commandLine12.getOptionValue("", "[ option: 4 hi!  ::  :: [ Options: [ short {} ] [ long {} ] ]");
        java.util.Iterator iterator17 = commandLine12.iterator();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ option: 4 hi!  ::  :: [ Options: [ short {} ] [ long {} ] ]" + "'", str16, "[ option: 4 hi!  ::  :: [ Options: [ short {} ] [ long {} ] ]");
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
        java.util.Collection collection23 = options6.getOptions();
        org.apache.commons.cli.OptionBuilder optionBuilder24 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) collection23);
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(optionBuilder24);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        org.apache.commons.cli.OptionBuilder optionBuilder20 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) options6);
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(optionBuilder20);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        boolean boolean14 = options1.hasOption(" ");
        java.util.Collection collection15 = options1.getOptionGroups();
        org.apache.commons.cli.Option option17 = options1.getOption("org.apache.commons.cli.ParseException: arg");
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(option17);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
        java.lang.String[] strArray15 = commandLine12.getOptionValues("4");
        org.apache.commons.cli.Option[] optionArray16 = commandLine12.getOptions();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(optionArray16);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        java.util.List list13 = options1.getRequiredOptions();
        java.util.Collection collection14 = options1.getOptionGroups();
        java.util.List list15 = options1.getRequiredOptions();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
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
        boolean boolean23 = options6.hasOption("hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder24 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(optionBuilder24);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        boolean boolean14 = options1.hasOption(" ");
        java.util.List list15 = options1.getRequiredOptions();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        java.util.Collection collection13 = options1.getOptionGroups();
        java.util.Collection collection14 = options1.getOptions();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
        java.util.Collection collection23 = options6.getOptionGroups();
        java.util.List list24 = options6.helpOptions();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        java.util.List list22 = commandLine21.getArgList();
        java.lang.String[] strArray24 = commandLine21.getOptionValues("[ Options: [ short {4=[ option: 4  ::  :: [ option: 4  ::  :: false ] ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(strArray24);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        java.lang.String[] strArray13 = commandLine12.getArgs();
        org.apache.commons.cli.Option[] optionArray14 = commandLine12.getOptions();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(optionArray14);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        java.lang.Class<?> wildcardClass23 = optionBuilder22.getClass();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(optionBuilder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1792() throws Throwable {
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
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        boolean boolean23 = options6.hasOption("hi!");
        java.util.Collection collection24 = options6.getOptions();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        posixParser0.burstToken("", false);
        posixParser0.burstToken("[ Options: [ short {=[ option:   :: arg ], 4=[ option: 4  ::  ], arg=[ option: arg  :: null ]} ] [ long {} ]", false);
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        posixParser0.burstToken("", false);
        java.lang.Class<?> wildcardClass25 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(option3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }
}
