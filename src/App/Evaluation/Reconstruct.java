package App.Evaluation;

import App.Models.TestCase;
import App.Utilities.ConsoleColors;
import App.Utilities.Utils;

import java.io.FileNotFoundException;
import java.util.*;


public class Reconstruct {

    public static HashMap<Integer, TestCase> resultsFileToTestSuite(List<List<String>> file){
        //List<String>
        return null;
    }

    public static List<String> reconstruct(Map<Integer, TestCase> suite, int testsPerFile) {

        int classNum = 0;
        int suiteSize = suite.size();
        List<String> files = new ArrayList<>();
        Map<Integer, TestCase> apportionedSuite = new LinkedHashMap<>();
        for (Map.Entry<Integer, TestCase> testCase : suite.entrySet()) {


            TestCase testObject = testCase.getValue();
            apportionedSuite.put(testCase.getKey(), testObject);
            if ((testObject.getOrder() + 1) % testsPerFile == 0){
                String classDef = generateClassDefinitionJacksonCore(classNum);
                classNum += 1;
                files.add(generateFile(apportionedSuite, classDef, suiteSize));
                apportionedSuite.clear();
            }
        }
        //Above code zips only when multiple of 500. This does the rest.
        String classDef = generateClassDefinitionJacksonCore(classNum);
        files.add(generateFile(apportionedSuite, classDef, suiteSize));
        return files;
    }

    public static String generateFile(Map<Integer, TestCase> data,
                                    String header, int suiteSize) {
        StringBuilder document = new StringBuilder();
        //Add header
        document.append(header);
        for (Map.Entry<Integer, TestCase> testCase : data.entrySet()) {
            TestCase testCaseObject = testCase.getValue();
            String methodDefinition = generateMethodDefinition(suiteSize, (testCaseObject.getOrder() + 1));
            document.append(methodDefinition);
            document.append("\n");
            document.append("        ").append(testCaseObject.getTestData());
            document.append("\n    }\n");
        }
        document.append("}\n");
        return String.valueOf(document);
    }

    /**
     * This is a temporary method which will be deleted come this tool being agnostic. It prepares the header so it
     * can be passed into the generateFile() method.
     * @param suiteSize
     * @param testNum
     * @return
     */
    public static String generateMethodDefinition(int suiteSize, int testNum){
        //Calculates to how many decimal places the method name must be
        int numberRepresentationLength = String.valueOf(suiteSize).length();
        String formattedTestNumber = String.format("%0"+numberRepresentationLength+"d", testNum);

        final String definition = "\n    @Test\n"
                + "    public void test" + formattedTestNumber + "() throws Throwable {";
        return definition;
    }


    /**
     * This is a temporary method which will be deleted come this tool being agnostic. It prepares the header so it
     * can be passed into the generateFile() method.
     * @param version
     * @return
     */
    public static String generateClassDefintionCli(int version){
        String className = "RegressionTest" + version;
        final String header = "package org.apache.commons.cli;\n\n"
                + "import org.junit.FixMethodOrder;\n"
                + "import org.junit.Test;\n"
                + "import org.junit.runners.MethodSorters;\n\n"
                + "@FixMethodOrder(MethodSorters.NAME_ASCENDING)\n"
                + "public class " + className + " {\n\n"
                + "    public static boolean debug = false;\n";
        return header;
    }

    public static String generateClassDefinitionJacksonCore(int version){
        String className = "RegressionTest" + version;
        final String header = "package com.fasterxml.jackson.core.util;\n\n"
                + "import org.junit.FixMethodOrder;\n"
                + "import org.junit.Test;\n"
                + "import org.junit.runners.MethodSorters;\n\n"
                + "@FixMethodOrder(MethodSorters.NAME_ASCENDING)\n"
                + "public class " + className + " {\n\n"
                + "    public static boolean debug = false;\n";
        return header;
    }

    public static void saveTestFiles(List<String> files) throws FileNotFoundException {
        String headerFile = generateHeaderFileJacksonCore(files.size());
        String directory = "./ExportedTestSuites/";
        String headerFilePath = directory + "RegressionTest.java";
        Utils.printSaveString(headerFilePath, headerFile);
        //Output to console
        System.out.println(ConsoleColors.BLACK + ConsoleColors.YELLOW_BACKGROUND + "Saving generated test suite to " + directory + ConsoleColors.RESET);

        for (int i = 0; i < files.size(); i++){
            String fileName = "RegressionTest" + (i) + ".java";
            String filePath = directory + fileName;
            Utils.printSaveString(filePath, files.get(i));
        }
    }

    public static String generateHeaderFileCli(int fileCount){

        StringBuilder parameters = new StringBuilder();
        for (int i = 0; i < fileCount; i++){
            String stringToAdd = "";
            if (i != fileCount - 1) {
                parameters.append("RegressionTest").append(i).append(".class, ");
            }
            else {
                parameters.append("RegressionTest").append(i).append(".class");
            }
        }

        final String headerFileContent = "package org.apache.commons.cli;\n\n"
                + "import org.junit.runner.RunWith;\n"
                + "import org.junit.runners.Suite;\n\n"
                + "@RunWith(Suite.class)\n"
                + "@Suite.SuiteClasses({ " + parameters + " })\n"
                + "public class RegressionTest {\n"
                + "}\n\n";
        return headerFileContent;
    }

    public static String generateHeaderFileJacksonCore(int fileCount){

        StringBuilder parameters = new StringBuilder();
        for (int i = 0; i < fileCount; i++){
            String stringToAdd = "";
            if (i != fileCount - 1) {
                parameters.append("RegressionTest").append(i).append(".class, ");
            }
            else {
                parameters.append("RegressionTest").append(i).append(".class");
            }
        }

        final String headerFileContent = "package com.fasterxml.jackson.core.util;\n\n"
                + "import org.junit.runner.RunWith;\n"
                + "import org.junit.runners.Suite;\n\n"
                + "@RunWith(Suite.class)\n"
                + "@Suite.SuiteClasses({ " + parameters + " })\n"
                + "public class RegressionTest {\n"
                + "}\n\n";
        return headerFileContent;
    }

}
