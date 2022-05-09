package App;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

import App.Models.TestCase;
import App.SuiteInfo.ChartInfo;
import App.TCP.DistanceMethods.DistanceProxy;
import App.Utilities.ConsoleColors;
import App.Utilities.Utils;
import org.apache.commons.lang3.EnumUtils;

import java.lang.reflect.Method;

import static App.Evaluation.Reconstruct.*;
import static App.TCP.PrioritisationMethods.LedruFitness.ledruFitnessFunctionPrioritisation;
import static App.Utilities.Utils.printProgress;

public class Tool {

    enum TestSubject {
        CLI,
        CHART,
    }
    enum StringDistance{
        HAMMING,
        NCD
    }
    enum PrioritisationMethod{
        LEDRU,
        AVG,
        RANDOM
    }
    public static void main(String[] args) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        //Config variables
        TestSubject subjectProgram;
        StringDistance distanceMethod;
        PrioritisationMethod prioritisationMethod;
        int numOfFiles;
        Boolean random = false;

        System.out.println("TCP tool using string distances.");


        //User input for target program
        System.out.println("What is your target program?");


            //Inner loop 1 for choosing number of files to read in.
            while (true) {
                System.out.println("Options:");
                for (TestSubject item : TestSubject.values()) {
                    System.out.print(ConsoleColors.PURPLE + item + " " + ConsoleColors.RESET);
                }
                try {
                    String subjectProgramFromUser = scanner.nextLine().toUpperCase();
                    if (EnumUtils.isValidEnum(TestSubject.class, subjectProgramFromUser)) {
                        subjectProgram = TestSubject.valueOf(subjectProgramFromUser);
                        break;
                    } else {
                        System.out.println(ConsoleColors.RED + "Incorrect entry. Please try again." + ConsoleColors.RESET);
                    }
                } catch (Exception e) {
                    System.out.println(ConsoleColors.RED + "Something went wrong. Please try again." + ConsoleColors.RESET);
                }
            }


        //TODO: Finish This
        fileInputOuter:
        while(true) {
            // Number of files to read in
            System.out.println("How many files would you like to read in?\n" +
                    ConsoleColors.YELLOW + "Note: they need to be called \"RegressionTest<num>\" with the header being called just \"RegressionTest\""
                    + ConsoleColors.RESET);
            while (true) {
                try {
                    numOfFiles = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println(ConsoleColors.RED + "Something went wrong. Please input an integer." + ConsoleColors.RESET);
                }
            }

            // Path of files.
            while(true){

            }
        }

        System.out.println("Reading File...");

        String[] fileNames = {
                ("./test_suites/" + ChartInfo.getRootName() + ChartInfo.getFileStructure() + "/RegressionTest0.java"),
                ("./test_suites/" + ChartInfo.getRootName() + ChartInfo.getFileStructure() + "/RegressionTest1.java"),
                ("./test_suites/" + ChartInfo.getRootName() + ChartInfo.getFileStructure() + "/RegressionTest2.java"),
                ("./test_suites/" + ChartInfo.getRootName() + ChartInfo.getFileStructure() + "/RegressionTest3.java"),
                ("./test_suites/" + ChartInfo.getRootName() + ChartInfo.getFileStructure() + "/RegressionTest4.java"),
                ("./test_suites/" + ChartInfo.getRootName() + ChartInfo.getFileStructure() + "/RegressionTest5.java"),
                ("./test_suites/" + ChartInfo.getRootName() + ChartInfo.getFileStructure() + "/RegressionTest6.java"),
                ("./test_suites/" + ChartInfo.getRootName() + ChartInfo.getFileStructure() + "/RegressionTest7.java"),
                ("./test_suites/" + ChartInfo.getRootName() + ChartInfo.getFileStructure() + "/RegressionTest8.java"),
                ("./test_suites/" + ChartInfo.getRootName() + ChartInfo.getFileStructure() + "/RegressionTest9.java"),
                ("./test_suites/" + ChartInfo.getRootName() + ChartInfo.getFileStructure() + "/RegressionTest10.java"),
                ("./test_suites/" + ChartInfo.getRootName() + ChartInfo.getFileStructure() + "/RegressionTest11.java"),
                ("./test_suites/" + ChartInfo.getRootName() + ChartInfo.getFileStructure() + "/RegressionTest12.java"),
        };


        Boolean random = true;
        //True for ledru, false for avg
        Boolean ledru = true;
        //True for hamming, false for NCD
        Boolean hamming = true;

        //TODO: tidy this up its horrendous.
        if (random){

            //## Read Test Suite
            long startTimeFileRead = System.nanoTime();
            ArrayList<List<String>> files = Utils.readFiles(fileNames);
            long endTimeFileRead = System.nanoTime();
            long totalFileReadTime = (endTimeFileRead -  startTimeFileRead) / 1000000  ;
            System.out.println(ConsoleColors.BLACK + ConsoleColors.CYAN_BACKGROUND + "Completed in " + totalFileReadTime + "ms" + ConsoleColors.RESET);

            //## Parse Loaded File
            long startTimeFileParse = System.nanoTime();
            Map<Integer, TestCase> parsedFile = Utils.parseTests(files);
            long endTimeFileParse = System.nanoTime();
            long totalFileParseTime = (endTimeFileParse -  startTimeFileParse) / 1000000  ;
            System.out.println(ConsoleColors.BLACK + ConsoleColors.CYAN_BACKGROUND  + "Completed in " + totalFileParseTime + "ms" + ConsoleColors.RESET);

            //## Generate Priority Ordering ##
            long startTimePriorityOrdering = System.nanoTime();
            Set<Integer> priorityOrder = generateRandomOrdering(parsedFile);
            Map<Integer, TestCase> prioritisedTestSuite = orderingToSuite(priorityOrder, parsedFile);
            long endTimePriorityOrdering = System.nanoTime();
            long totalPriorityOrderingTime = (endTimePriorityOrdering -  startTimePriorityOrdering) / 1000000  ;
            System.out.println(ConsoleColors.BLACK + ConsoleColors.CYAN_BACKGROUND  + "Completed in " + totalPriorityOrderingTime + "ms" + ConsoleColors.RESET);

            //## Reconstruct Test Suite ##
            long startTimeReconstruction = System.nanoTime();
            List<String> x = reconstruct(prioritisedTestSuite, 500);
            saveTestFiles(x);
            long endTimeReconstruction = System.nanoTime();
            long totalReconstructionTime = (endTimeReconstruction -  startTimeReconstruction) / 1000000  ;
            System.out.println(ConsoleColors.BLACK + ConsoleColors.CYAN_BACKGROUND  + "Completed in " + totalReconstructionTime + "ms" + ConsoleColors.RESET);

            Utils.outputResultsToCSV(prioritisedTestSuite, "Chart-1b-600-ledru-ham");
        }
        else{
            //## Read Test Suite
            long startTimeFileRead = System.nanoTime();
            ArrayList<List<String>> files = Utils.readFiles(fileNames);
            long endTimeFileRead = System.nanoTime();
            long totalFileReadTime = (endTimeFileRead -  startTimeFileRead) / 1000000  ;
            System.out.println(ConsoleColors.BLACK + ConsoleColors.CYAN_BACKGROUND + "Completed in " + totalFileReadTime + "ms" + ConsoleColors.RESET);

            //## Parse Loaded File
            long startTimeFileParse = System.nanoTime();
            Map<Integer, TestCase> parsedFile = Utils.parseTests(files);
            long endTimeFileParse = System.nanoTime();
            long totalFileParseTime = (endTimeFileParse -  startTimeFileParse) / 1000000  ;
            System.out.println(ConsoleColors.BLACK + ConsoleColors.CYAN_BACKGROUND  + "Completed in " + totalFileParseTime + "ms" + ConsoleColors.RESET);


            //## Generate Similarity Matrix ##
            long startTimeSimilarityMatrix = System.nanoTime();
            Method distanceMethodToPass = DistanceProxy.class.getMethod("hammingDistance", String.class, String.class);
            ArrayList<ArrayList<Double>> similarityMatrix = createSimilarityMatrix(new Tool(), parsedFile, distanceMethodToPass);
            long endTimeSimilarityMatrix = System.nanoTime();
            long totalSimilarityMatrixTime = (endTimeSimilarityMatrix -  startTimeSimilarityMatrix) / 1000000  ;
            System.out.println(ConsoleColors.BLACK + ConsoleColors.CYAN_BACKGROUND  + "Completed in " + totalSimilarityMatrixTime + "ms" + ConsoleColors.RESET);

            //## Generate Priority Ordering ##
            long startTimePriorityOrdering = System.nanoTime();

            //Set<Integer> priorityOrder;

            Set<Integer> ledPriorityOrder = ledruFitnessFunctionPrioritisation(similarityMatrix);


            //Set<Integer> avgPriorityOrder = averageMethodPrioritisation(similarityMatrix, parsedFile);


            Map<Integer, TestCase> ledPrioritisedTestSuite = orderingToSuite(ledPriorityOrder, parsedFile);
           // Map<Integer, TestCase> avgPrioritisedTestSuite = orderingToSuite(avgPriorityOrder, parsedFile);

            long endTimePriorityOrdering = System.nanoTime();
            long totalPriorityOrderingTime = (endTimePriorityOrdering -  startTimePriorityOrdering) / 1000000  ;
            System.out.println(ConsoleColors.BLACK + ConsoleColors.CYAN_BACKGROUND  + "Completed in " + totalPriorityOrderingTime + "ms" + ConsoleColors.RESET);

            //## Reconstruct Test Suite led ##
            long startTimeReconstruction = System.nanoTime();
            List<String> x = reconstruct(ledPrioritisedTestSuite, 500);
            saveTestFiles(x);
            long endTimeReconstruction = System.nanoTime();
            long totalReconstructionTime = (endTimeReconstruction -  startTimeReconstruction) / 1000000  ;
            System.out.println(ConsoleColors.BLACK + ConsoleColors.CYAN_BACKGROUND  + "Completed in " + totalReconstructionTime + "ms" + ConsoleColors.RESET);

//            //## Reconstruct Test Suite avg ##
//            long startTimeReconstruction1 = System.nanoTime();
//            List<String> y = reconstruct(avgPrioritisedTestSuite, 500);
//            saveTestFiles2(y);
//            long endTimeReconstruction1 = System.nanoTime();
//            long totalReconstructionTime1 = (endTimeReconstruction1 -  startTimeReconstruction1) / 1000000  ;
//            System.out.println(ConsoleColors.BLACK + ConsoleColors.CYAN_BACKGROUND  + "Completed in " + totalReconstructionTime1 + "ms" + ConsoleColors.RESET);

            Utils.outputResultsToCSV(ledPrioritisedTestSuite, "CLI600_All_AVG_Hamming");
        }
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
