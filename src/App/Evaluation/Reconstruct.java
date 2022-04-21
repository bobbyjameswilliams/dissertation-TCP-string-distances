package App.Evaluation;

import App.Models.TestCase;
import org.junit.jupiter.api.Test;

import java.util.*;


public class Reconstruct {

    public static HashMap<Integer, TestCase> parseResults(List<List<String>> file){
        //List<String>
        return null;
    }

    public static List<String> reconstruct(Map<Integer, TestCase> suite, String header, int testsPerFile) {

        int suiteSize = suite.size();
        List<String> files = new ArrayList<>();
        Map<Integer, TestCase> apportionedSuite = new LinkedHashMap<>();
        for (Map.Entry<Integer, TestCase> testCase : suite.entrySet()) {
            TestCase testObject = testCase.getValue();
            apportionedSuite.put(testCase.getKey(), testObject);
            if ((testObject.getOrder() + 1) % testsPerFile == 0){
                files.add(generateFile(null, null, apportionedSuite, header, suiteSize));
                apportionedSuite.clear();
            }
        }
        files.add(generateFile(null, null, apportionedSuite, header, suiteSize));
        return files;
    }

    public static String generateFile(String fileName,
                                    Integer fileNumber,
                                    Map<Integer, TestCase> data,
                                    String header, int suiteSize) {
        StringBuilder document = new StringBuilder();
        //Add header
        document.append(header);
        for (Map.Entry<Integer, TestCase> testCase : data.entrySet()) {
            TestCase testCaseObject = testCase.getValue();
            String methodDefinition = generateMethodDefinition(suiteSize, (testCaseObject.getOrder() + 1));
            document.append(methodDefinition);
            document.append("\n");
            document.append("\t").append(testCaseObject.getTestData());
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
    public static String generateClassDefintion(int version){
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

    public static void saveFiles(String file){

    }

}
