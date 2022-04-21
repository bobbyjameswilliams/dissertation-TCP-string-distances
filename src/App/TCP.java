package App;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

import App.Models.TestCase;
import org.apache.commons.lang3.StringUtils;
import java.lang.reflect.Method;

public class TCP {
    public static void main(String[] args) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //args[0] is the test suite location
        //args[1] is the output method [csv, console]
        //args[2] is output path
        //args[3] is the prioritisation method
        //args[4] is the string distance method

//        String testSuiteLocation = args[0];
//        String outputMethod = args[1].toUpperCase();
//        String outputPath = args[2].toUpperCase(Locale.ROOT);
//        String prioritisationMethod = args[3].toUpperCase();
//        String stringDistanceMethod = args[4].toUpperCase();

        System.out.println("Reading File...");
        String[] fileNames = {
                "./test_suites/600 second budget/Cli/randoop/10/Cli-1b-randoop.10/org/apache/commons/cli/RegressionTest0.java",
                "./test_suites/600 second budget/Cli/randoop/10/Cli-1b-randoop.10/org/apache/commons/cli/RegressionTest1.java",
                "./test_suites/600 second budget/Cli/randoop/10/Cli-1b-randoop.10/org/apache/commons/cli/RegressionTest2.java",
                "./test_suites/600 second budget/Cli/randoop/10/Cli-1b-randoop.10/org/apache/commons/cli/RegressionTest3.java"
        };
        ArrayList<List<String>> files = Utils.readFiles(fileNames);
        //List<String> file = Utils.readFile("./src/test.txt");


        System.out.println("Parsing File...");
        Map<Integer, TestCase> parsedFile = Utils.parseTests(files);

        Set<Integer> priorityOrder = generateRandomOrdering(parsedFile);
        Map<Integer, TestCase> prioritisedTestSuite = orderingToSuite(priorityOrder, parsedFile);

        System.out.println("Generating Similarity Matrix...");
        Method distanceMethodToPass = TCP.class.getMethod("hammingDistance", String.class, String.class);
        ArrayList<ArrayList<Double>> similarityMatrix = createSimilarityMatrix(new TCP(), parsedFile, distanceMethodToPass);
//
//        System.out.println("Applying Fitness Function...");
//
//        //Set<Integer> priorityOrder = ledruFitnessFunctionPrioritisation(similarityMatrix);
//        Set<Integer> priorityOrder = averageMethodPrioritisation(similarityMatrix, parsedFile);
//        Map<Integer, TestCase> prioritisedTestSuite = orderingToSuite(priorityOrder, parsedFile);
//
//        Utils.outputResultsToCSV(prioritisedTestSuite, "avgFitnessFuncTest1");

    }

    //############### FITNESS FUNCTIONS ######################
    //Polymorphic for double and int
    public static ArrayList<ArrayList<Double>> createSimilarityMatrix(Object tcpObject, Map<Integer, TestCase> testCases, Method distanceMethod) throws InvocationTargetException, IllegalAccessException {

        int testCaseCount = testCases.size();
        ArrayList<ArrayList<Double>> similarityMatrix = new ArrayList<>();
        for (int i = 0; i < testCaseCount; i++) {
            ArrayList<Double> testCaseDiffList = new ArrayList<>();
            for (int j = 0; j < testCaseCount; j++){
                String testCase1 = testCases.get(i).getTestData();
                String testCase2 = testCases.get(j).getTestData();
                if (i == j){
                    testCaseDiffList.add(null);
                }
                else {
                    Object stringDistance = distanceMethod.invoke(tcpObject, testCase1 , testCase2 );
                    testCaseDiffList.add((Double) stringDistance);
                }
                //System.out.println("String distance " + i + " against " + j);

            }
            similarityMatrix.add(testCaseDiffList);
        }
        return similarityMatrix;
    }

    public static HashMap<Integer, TestCase> orderingToSuite(Set<Integer> ordering, Map<Integer, TestCase> testSuite){
        HashMap<Integer, TestCase> prioritisedSuite = new LinkedHashMap<>();
        int newID = 0;
        for (Integer testID : ordering){
            TestCase testCase = testSuite.get(testID);
            testCase.setOrder(newID);
            prioritisedSuite.put(newID, testCase);
            newID += 1;
        }
        return prioritisedSuite;
    }

    //### RANDOM ORDERING ####
    private static Set<Integer> generateRandomOrdering(Map<Integer, TestCase> testSet) {
        List<Integer> randomOrderList = new ArrayList<>();
        for (int i = 0; i < testSet.size(); i++){
            randomOrderList.add(i);
        }
        Collections.shuffle(randomOrderList);
        Set<Integer> randomOrderSet = new LinkedHashSet<>(randomOrderList);
        assert randomOrderSet.size() == randomOrderList.size();
        return randomOrderSet;
    }

    private void evaluateTestSuite(){

    }
}
