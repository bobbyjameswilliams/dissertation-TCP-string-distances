package App;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

import App.Models.TestCase;
import App.TCP.DistanceMethods.DistanceProxy;
import App.Utilities.Utils;
import App.Evaluation.Reconstruct;

import java.lang.reflect.Method;

import static App.Evaluation.Reconstruct.*;
import static App.TCP.PrioritisationMethods.WilliamsAverage.averageMethodPrioritisation;
import static App.Utilities.Utils.printProgress;

public class Tool {
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
        Map<Integer, TestCase> parsedFile = Utils.parseTests(files);

        //Set<Integer> priorityOrder = generateRandomOrdering(parsedFile);
        //Map<Integer, TestCase> prioritisedTestSuite = orderingToSuite(priorityOrder, parsedFile);


        Method distanceMethodToPass = DistanceProxy.class.getMethod("hammingDistance", String.class, String.class);
        ArrayList<ArrayList<Double>> similarityMatrix = createSimilarityMatrix(new Tool(), parsedFile, distanceMethodToPass);

        //Set<Integer> priorityOrder = ledruFitnessFunctionPrioritisation(similarityMatrix);
        Set<Integer> priorityOrder = averageMethodPrioritisation(similarityMatrix, parsedFile);
        Map<Integer, TestCase> prioritisedTestSuite = orderingToSuite(priorityOrder, parsedFile);

        List<String> x = reconstruct(prioritisedTestSuite, Reconstruct.generateClassDefintion(0), 500);
        saveTestFiles(x);

        Utils.outputResultsToCSV(prioritisedTestSuite, "CLI600_All_AVG_Hamming");

    }

    //############### FITNESS FUNCTIONS ######################
    //Polymorphic for double and int
    public static ArrayList<ArrayList<Double>> createSimilarityMatrix(Object tcpObject, Map<Integer, TestCase> testCases, Method distanceMethod) throws InvocationTargetException, IllegalAccessException {
        System.out.println("Generating Similarity Matrix...");
        int testCaseCount = testCases.size();
        ArrayList<ArrayList<Double>> similarityMatrix = new ArrayList<>();
        for (int i = 0; i < testCaseCount; i++) {
            printProgress(i, testCaseCount);
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

            }
            similarityMatrix.add(testCaseDiffList);
        }
        return similarityMatrix;
    }

    /**
     * Takes an ordering of test ID's paired with test data and creates a prioritised suite with data in TestCase
     * object.
     * @param ordering Integer list of ID's
     * @param testSuite HashMap of TestCase objects that the ID's associate to
     * @return Ordered test suite.
     */
    public static HashMap<Integer, TestCase> orderingToSuite(Set<Integer> ordering, Map<Integer, TestCase> testSuite){
        System.out.println("Converting ordering to test suite...");
        HashMap<Integer, TestCase> prioritisedSuite = new LinkedHashMap<>();
        int newID = 0;
        int orderingSize = ordering.size();
        for (Integer testID : ordering){
            printProgress(newID, orderingSize);
            TestCase testCase = testSuite.get(testID);
            testCase.setOrder(newID);
            prioritisedSuite.put(newID, testCase);
            newID += 1;
        }
        return prioritisedSuite;
    }

    /**
     * Given a test suite, it orders them randomly for evaluation.
     * @param testSet
     * @return
     */
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
