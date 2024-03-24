package App;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.sql.Time;
import java.util.*;

import App.Models.TestCase;
import App.SuiteInfo.ChartInfo;
import App.SuiteInfo.CliInfo;
import App.SuiteInfo.MathInfo;
import App.SuiteInfo.TimeInfo;
import App.TCP.DistanceMethods.DistanceProxy;
import App.Utilities.ConsoleColors;
import App.Utilities.Utils;
import org.apache.commons.lang3.EnumUtils;

import java.lang.reflect.Method;

import static App.Evaluation.Reconstruct.*;
import static App.TCP.PrioritisationMethods.LedruFitness.ledruFitnessFunctionPrioritisation;
import static App.TCP.PrioritisationMethods.WilliamsAverage.averageMethodPrioritisation;
import static App.Utilities.Utils.printProgress;

public class Tool {

    enum TestSubject {
        CLI,
        CHART,
        MATH
    }
    enum StringDistance{
        HAMMING,
        NCD
    }
    enum PrioritisationMethod{
        LEDRU,
        AVG
    }
    public static void main(String[] args) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Scanner mainScanner = new Scanner(System.in);
        System.out.println("TCP tool using string distances.");

        // Pick if evaluate or order
        while (true) {
            System.out.println("\"Evaluate\" or \"Order\"");
            String topMenuInput = mainScanner.nextLine();
            if (topMenuInput.equalsIgnoreCase("evaluate")){
                evaluateSuite();
                break;
            }
            else if (topMenuInput.equalsIgnoreCase("order")){
                orderSuite();
                break;
            }
            else {
                System.out.println("Incorrect Input.");
            }
        }
    }

    public static void orderSuite() throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Scanner scanner = new Scanner(System.in);
        //Config variables
        TestSubject subjectProgram;
        StringDistance distanceMethod;
        PrioritisationMethod prioritisationMethod;
        int numOfFiles;
        boolean random = false;

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
                scanner.next();
            }
        }


        //User input for files
        ArrayList<List<String>> files;
        Scanner fileScanner = new Scanner(System.in);
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
                    scanner.next();
                }
            }

            // Path of files.
            String filePath;
            while(true){
                System.out.println("What is the path to the file?" + ConsoleColors.YELLOW +
                        " MAKE SURE IT IS OF THE SUBJECT TYPE SPECIFIED. Failure to do so will cause errors." +
                        ConsoleColors.RESET);
                filePath = fileScanner.nextLine();
                List<String> fileNames = generateFileNames(numOfFiles, filePath, subjectProgram);
                files = Utils.readFiles(fileNames);
                if (!files.contains(null)) {
                    break fileInputOuter;
                }
                System.out.println(ConsoleColors.RED + "Something went wrong. Check file path and number of files to read." + ConsoleColors.RESET);
                break;
            }
        }

        //User input for random
        String randomUserInput;
        Scanner randomInputScanner = new Scanner(System.in);
        while(true){
            System.out.println("Would you like to generate a random ordering? [Y/N]");
            randomUserInput = randomInputScanner.nextLine().toUpperCase();
            if (randomUserInput.equals("Y")){
                random = true;
                break;
            }
            else if (randomUserInput.equals("N")){
                break;
            }
            else{
                System.out.println(ConsoleColors.YELLOW + "Please enter Y or N" + ConsoleColors.RESET);
            }
        }

        if (random){
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
            if(subjectProgram.equals(TestSubject.CLI)){
                long startTimeReconstruction = System.nanoTime();
                //500 is the default number of tests per file
                List<String> x = reconstructCli(prioritisedTestSuite, 500);
                saveTestFilesCli(x);
                long endTimeReconstruction = System.nanoTime();
                long totalReconstructionTime = (endTimeReconstruction -  startTimeReconstruction) / 1000000  ;
                System.out.println(ConsoleColors.BLACK + ConsoleColors.CYAN_BACKGROUND  + "Completed in " + totalReconstructionTime + "ms" + ConsoleColors.RESET);
            }
            else if(subjectProgram.equals(TestSubject.CHART)){
                long startTimeReconstruction = System.nanoTime();
                //500 is the default number of tests per file
                List<String> x = reconstructChart(prioritisedTestSuite, 500);
                saveTestFilesChart(x);
                long endTimeReconstruction = System.nanoTime();
                long totalReconstructionTime = (endTimeReconstruction -  startTimeReconstruction) / 1000000  ;
                System.out.println(ConsoleColors.BLACK + ConsoleColors.CYAN_BACKGROUND  + "Completed in " + totalReconstructionTime + "ms" + ConsoleColors.RESET);
            }
            else if(subjectProgram.equals(TestSubject.MATH)){
                long startTimeReconstruction = System.nanoTime();
                //500 is the default number of tests per file
                List<String> x = reconstructMath(prioritisedTestSuite, 500);
                saveTestFilesMath(x);
                long endTimeReconstruction = System.nanoTime();
                long totalReconstructionTime = (endTimeReconstruction -  startTimeReconstruction) / 1000000  ;
                System.out.println(ConsoleColors.BLACK + ConsoleColors.CYAN_BACKGROUND  + "Completed in " + totalReconstructionTime + "ms" + ConsoleColors.RESET);
            }

            Utils.outputResultsToCSV(prioritisedTestSuite, (subjectProgram.name() + "_random"));
        }
        else {
            //Get string distance selection from user
            distanceMethod = chooseStringDistance();

            //Get prioritisation method from user
            prioritisationMethod = choosePrioritisationMethod();

            //## Parse Loaded File
            long startTimeFileParse = System.nanoTime();
            Map<Integer, TestCase> parsedFile = Utils.parseTests(files);
            long endTimeFileParse = System.nanoTime();
            long totalFileParseTime = (endTimeFileParse -  startTimeFileParse) / 1000000  ;
            System.out.println(ConsoleColors.BLACK + ConsoleColors.CYAN_BACKGROUND  + "Completed in " + totalFileParseTime + "ms" + ConsoleColors.RESET);


            //## Generate Similarity Matrix ##
            long startTimeSimilarityMatrix = System.nanoTime();

            ArrayList<ArrayList<Double>> similarityMatrix = null;
            if (distanceMethod.equals(StringDistance.HAMMING)){
                Method distanceMethodToPass = DistanceProxy.class.getMethod("hammingDistance", String.class, String.class);
                similarityMatrix = createSimilarityMatrix(new Tool(), parsedFile, distanceMethodToPass);
            }
            else if (distanceMethod.equals(StringDistance.NCD)){
                Method distanceMethodToPass = DistanceProxy.class.getMethod("NCDistance", String.class, String.class);
                similarityMatrix = createSimilarityMatrix(new Tool(), parsedFile, distanceMethodToPass);
            }

            long endTimeSimilarityMatrix = System.nanoTime();
            long totalSimilarityMatrixTime = (endTimeSimilarityMatrix -  startTimeSimilarityMatrix) / 1000000  ;
            System.out.println(ConsoleColors.BLACK + ConsoleColors.CYAN_BACKGROUND  + "Completed in " + totalSimilarityMatrixTime + "ms" + ConsoleColors.RESET);


            //## Generate Priority Ordering ##
            long startTimePriorityOrdering = System.nanoTime();
            //Set<Integer> priorityOrder;
            Set<Integer> priorityOrder = null;

            if(prioritisationMethod.equals(PrioritisationMethod.AVG)){
                priorityOrder = averageMethodPrioritisation(similarityMatrix, parsedFile);
            }
            else if (prioritisationMethod.equals(PrioritisationMethod.LEDRU)){
                priorityOrder = ledruFitnessFunctionPrioritisation(similarityMatrix);
            }
            Map<Integer, TestCase> prioritisedTestSuite = orderingToSuite(priorityOrder, parsedFile);

            long endTimePriorityOrdering = System.nanoTime();
            long totalPriorityOrderingTime = (endTimePriorityOrdering -  startTimePriorityOrdering) / 1000000  ;
            System.out.println(ConsoleColors.BLACK + ConsoleColors.CYAN_BACKGROUND  + "Completed in " + totalPriorityOrderingTime + "ms" + ConsoleColors.RESET);

            //## Reconstruct Test Suite ##
            if(subjectProgram.equals(TestSubject.CLI)){
                long startTimeReconstruction = System.nanoTime();
                //500 is the default number of tests per file
                List<String> x = reconstructCli(prioritisedTestSuite, 500);
                saveTestFilesCli(x);
                long endTimeReconstruction = System.nanoTime();
                long totalReconstructionTime = (endTimeReconstruction -  startTimeReconstruction) / 1000000  ;
                System.out.println(ConsoleColors.BLACK + ConsoleColors.CYAN_BACKGROUND  + "Completed in " + totalReconstructionTime + "ms" + ConsoleColors.RESET);
            }
            else if(subjectProgram.equals(TestSubject.CHART)){
                long startTimeReconstruction = System.nanoTime();
                //500 is the default number of tests per file
                List<String> x = reconstructChart(prioritisedTestSuite, 500);
                saveTestFilesChart(x);
                long endTimeReconstruction = System.nanoTime();
                long totalReconstructionTime = (endTimeReconstruction -  startTimeReconstruction) / 1000000  ;
                System.out.println(ConsoleColors.BLACK + ConsoleColors.CYAN_BACKGROUND  + "Completed in " + totalReconstructionTime + "ms" + ConsoleColors.RESET);
            }
            else if(subjectProgram.equals(TestSubject.MATH)){
                long startTimeReconstruction = System.nanoTime();
                //500 is the default number of tests per file
                List<String> x = reconstructMath(prioritisedTestSuite, 500);
                saveTestFilesMath(x);
                long endTimeReconstruction = System.nanoTime();
                long totalReconstructionTime = (endTimeReconstruction -  startTimeReconstruction) / 1000000  ;
                System.out.println(ConsoleColors.BLACK + ConsoleColors.CYAN_BACKGROUND  + "Completed in " + totalReconstructionTime + "ms" + ConsoleColors.RESET);
            }



            Utils.outputResultsToCSV(prioritisedTestSuite, (subjectProgram.name()+"_"+distanceMethod.name()+"_"+prioritisationMethod.name()));

        }
    }

    public static void evaluateSuite() {
        /**
         * Evaluates and calculates APFD from a CSV file containing the faults and those detected by test case numbers.
         * The ordering created during prioritisation is evaluated against the known faults detected and APFD can be
         * calculated.
         *
         */

        // Number of tests
        // Number of faults
        //
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

    private static List<String> generateFileNames(int numOfFiles, String filePath, TestSubject program){
        List<String> fileNames = new ArrayList<>();
        if (program == TestSubject.CLI){
            for (int i = 0; i < numOfFiles; i++){
                fileNames.add(filePath + CliInfo.getRootName() + CliInfo.getFileStructure() + "RegressionTest" + i + ".java");
            }
        }
        else if (program == TestSubject.CHART){
            for (int i = 0; i < numOfFiles; i++){
                fileNames.add(filePath + ChartInfo.getRootName() + ChartInfo.getFileStructure() + "RegressionTest" + i + ".java");
            }
        }
        //TODO: This is temporarily changed to time, change back to math!
        else if (program == TestSubject.MATH){
            for (int i = 0; i < numOfFiles; i++){
                fileNames.add(filePath + TimeInfo.getRootName() + TimeInfo.getFileStructure() + "RegressionTest" + i + ".java");
            }
        }
        return fileNames;
    }

    private static TestSubject chooseTestSubject(){
        return null;
    }

    private static StringDistance chooseStringDistance(){
        System.out.println("What string distance method would you like to use?");

        Scanner scanner = new Scanner(System.in);
        StringDistance stringDistance;
        while (true) {
            System.out.println("Options:");
            for (StringDistance item : StringDistance.values()) {
                System.out.print(ConsoleColors.PURPLE + item + " " + ConsoleColors.RESET);
            }
            try {
                String selectionFromUser = scanner.nextLine().toUpperCase();
                if (EnumUtils.isValidEnum(StringDistance.class, selectionFromUser)) {
                    stringDistance = StringDistance.valueOf(selectionFromUser);
                    break;
                } else {
                    System.out.println(ConsoleColors.RED + "Incorrect entry. Please try again." + ConsoleColors.RESET);
                }
            } catch (Exception e) {
                System.out.println(ConsoleColors.RED + "Something went wrong. Please try again." + ConsoleColors.RESET);
                scanner.next();
            }
        }
        return stringDistance;
    }

    private static PrioritisationMethod choosePrioritisationMethod(){
        System.out.println("What string distance method would you like to use?");

        Scanner scanner = new Scanner(System.in);
        PrioritisationMethod prioritisationMethod;
        while (true) {
            System.out.println("Options:");
            for (PrioritisationMethod item : PrioritisationMethod.values()) {
                System.out.print(ConsoleColors.PURPLE + item + " " + ConsoleColors.RESET);
            }
            try {
                String selectionFromUser = scanner.nextLine().toUpperCase();
                if (EnumUtils.isValidEnum(PrioritisationMethod.class, selectionFromUser)) {
                    prioritisationMethod = PrioritisationMethod.valueOf(selectionFromUser);
                    break;
                } else {
                    System.out.println(ConsoleColors.RED + "Incorrect entry. Please try again." + ConsoleColors.RESET);
                }
            } catch (Exception e) {
                System.out.println(ConsoleColors.RED + "Something went wrong. Please try again." + ConsoleColors.RESET);
                scanner.next();
            }
        }
        return prioritisationMethod;
    }


}
   