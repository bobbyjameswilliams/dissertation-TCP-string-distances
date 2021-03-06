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
        boolean boolean2 = commandLine0.hasOption("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption("hi!");
        java.util.List list3 = commandLine0.getArgList();
        commandLine0.addArg("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", true, "");
        option4.setDescription("");
        boolean boolean7 = option4.hasLongOpt();
        commandLine0.addOption(option4);
        java.lang.String str9 = option4.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ option:  +ARG ::  ]" + "'", str9, "[ option:  +ARG ::  ]");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        boolean boolean7 = commandLine0.hasOption('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "");
        boolean boolean4 = option3.hasValueSeparator();
        option3.setRequired(true);
        org.apache.commons.cli.CommandLine commandLine7 = new org.apache.commons.cli.CommandLine();
        boolean boolean9 = commandLine7.hasOption(' ');
        org.apache.commons.cli.Option[] optionArray10 = commandLine7.getOptions();
        option3.setType((java.lang.Object) commandLine7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionArray10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", true, "");
        option4.setDescription("");
        boolean boolean7 = option4.hasLongOpt();
        commandLine0.addOption(option4);
        org.apache.commons.cli.CommandLine commandLine9 = new org.apache.commons.cli.CommandLine();
        boolean boolean11 = commandLine9.hasOption("hi!");
        java.util.List list12 = commandLine9.getArgList();
        boolean boolean13 = option4.equals((java.lang.Object) commandLine9);
        boolean boolean14 = option4.isRequired();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", true, "");
        option4.setDescription("");
        boolean boolean7 = option4.hasLongOpt();
        commandLine0.addOption(option4);
        org.apache.commons.cli.CommandLine commandLine9 = new org.apache.commons.cli.CommandLine();
        boolean boolean11 = commandLine9.hasOption("hi!");
        java.util.List list12 = commandLine9.getArgList();
        boolean boolean13 = option4.equals((java.lang.Object) commandLine9);
        java.lang.Object obj14 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", true, "");
        option4.setDescription("");
        boolean boolean7 = option4.hasLongOpt();
        commandLine0.addOption(option4);
        org.apache.commons.cli.CommandLine commandLine9 = new org.apache.commons.cli.CommandLine();
        boolean boolean11 = commandLine9.hasOption("hi!");
        java.util.List list12 = commandLine9.getArgList();
        boolean boolean13 = option4.equals((java.lang.Object) commandLine9);
        java.lang.Object obj15 = commandLine9.getOptionObject("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        org.apache.commons.cli.Option[] optionArray1 = commandLine0.getOptions();
        java.util.Iterator iterator2 = commandLine0.iterator();
        boolean boolean4 = commandLine0.hasOption("[ option:  +ARG ::  ]");
        org.junit.Assert.assertNotNull(optionArray1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("[ option:  +ARG ::  ]");
        java.util.List list8 = commandLine0.getArgList();
        boolean boolean10 = commandLine0.hasOption("[ option:  +ARG ::  ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption("hi!");
        java.util.List list3 = commandLine0.getArgList();
        java.lang.String[] strArray5 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption("hi!");
        java.util.List list3 = commandLine0.getArgList();
        java.lang.String str6 = commandLine0.getOptionValue('a', "[ option:  +ARG ::  ]");
        java.lang.String str9 = commandLine0.getOptionValue('a', "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ option:  +ARG ::  ]" + "'", str6, "[ option:  +ARG ::  ]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }
}

