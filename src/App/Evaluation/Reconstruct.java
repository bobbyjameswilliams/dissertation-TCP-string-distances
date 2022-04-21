package App.Evaluation;

import App.Models.TestCase;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Reconstruct {

    public static HashMap<Integer, TestCase> parseResults(List<List<String>> file){
        //List<String>
        return null;
    }

    public static void reconstruct(HashMap<Integer, TestCase> suite, String header, String methodDefinition) {

        while (suite.size() > 0){
            //Split it out into groups of 500 and send off the batches to generateFile
        }
    }

    public static String generateFile(String fileName,
                                    Integer fileNumber,
                                    Map<Integer, TestCase> data,
                                    String header) {
        StringBuilder document = new StringBuilder();
        //Add header
        document.append(header);
        int suiteSize = data.size();
        for (Map.Entry<Integer, TestCase> testCase : data.entrySet()) {
            TestCase testCaseObject = testCase.getValue();
            String methodDefinition = generateMethodDefinition(suiteSize, (testCaseObject.getOrder() + 1));
            document.append(methodDefinition);
            document.append("\n");
            document.append("\t").append(testCaseObject.getTestData());
            document.append("\n    }\n");
        }
        document.append("\n}\n");
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
