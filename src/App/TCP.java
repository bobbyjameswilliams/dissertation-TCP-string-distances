package App;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

import App.Models.TestCase;
import org.apache.commons.lang3.StringUtils;
import java.lang.reflect.Method;

public class TCP {
    public static void main(String[] args) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println("Reading File...");
        List<String> file = Utils.readFile("./test_suites/600 second budget/Cli/randoop/10/Cli-1b-randoop.10/org/apache/commons/cli/RegressionTest0.java");
        //List<String> file = Utils.readFile("./src/test.txt");

        System.out.println("Parsing File...");
        Map<Integer, TestCase> parsedFile = Utils.parseTests(file);

        System.out.println("Generating Similarity Matrix...");
        Method fitnessFunctionToPass = TCP.class.getMethod("hammingDistance", String.class, String.class);
        ArrayList<ArrayList<Double>> similarityMatrix = createSimilarityMatrix(new TCP(), parsedFile, fitnessFunctionToPass);

        System.out.println("Applying Fitness Function...");
        Map<Integer, TestCase> prioritisedTestSuite = averageMethodPrioritisation(similarityMatrix, parsedFile);
        int temp = smallestNeighbor(similarityMatrix);
        Utils.outputResultsToCSV(prioritisedTestSuite);
    }

    //############### STRING DISTANCES ######################

    public static double hammingDistance(String string1, String string2){
        if (string1.length() < string2.length()){
            return performHammingDistance(string1, string2);
        }
        else{
            return performHammingDistance(string2, string1);
        }
    }

    /*
    Performs hamming distance. Main method for this prepares the strings and sends it to here.
     */
    private static double performHammingDistance(String shortString, String longString){
        double distance = 0;
        int shortStringLength = shortString.length();
        int longStringLength = longString.length();
        //Pad the shorter string with chr(0)
        char pad = (char)0;
        String shortStringPadded = StringUtils.rightPad(shortString, longStringLength, pad);
        for (int i=0; i<longStringLength ;i++){
            if (shortStringPadded.charAt(i) != longString.charAt(i)){
                distance += 1;
            }
        }
        return distance;
    }

    public static double NCDistance(String string1, String string2) throws Exception {
        String concactString = string1 + string1;

        //Retrieve Compressed String
        String compressedString1 = Utils.compressString(string1);
        String compressedString2 = Utils.compressString(string2);
        String compressedConcatString = Utils.compressString(concactString);

        //Get Lengths
        int compressedString1Length = compressedString1.length();
        int compressedString2Length = compressedString2.length();
        int compressedConcatStringLength = compressedConcatString.length();

        double NCD_numerator = compressedConcatStringLength - Integer.min(compressedString1Length,compressedString2Length);
        double NCD_denominator = Integer.max(compressedString1Length,compressedString2Length);
        return (NCD_numerator / NCD_denominator);
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

    public static Map<Integer, TestCase> ledruFitnessFunctionPrioritisation(ArrayList<ArrayList<Double>> similarityMatrix, Map<Integer, TestCase> testSet){
        /*
        Compute the distances for each pair of test cases in T
        Remove duplicates from T
        Find an element t ∈ T with the maximum distance dd(t,T ),
            T := T \{t}, P := t
        While T is not empty
            Find an element t ∈ T with the maximum distance dd(t,P),
                T := T \{t}, P := P.t (t is appended to the sequence)
        Append duplicates to P
        return P
         */


        return null;
    }

    private static int smallestNeighbor (ArrayList<ArrayList<Double>> similarityMatrix){
        Map<Integer, Double> smallestDistances =  new HashMap<>();
        for(int i = 0; i < similarityMatrix.size(); i++){
            List<Double> testCaseNeighbors = similarityMatrix.get(i);
            //Shallow copy of testCaseNeighbors
            List<Double> sortedNeighbors = new ArrayList<>(testCaseNeighbors);
            sortedNeighbors.removeAll(Collections.singleton(null));
            Collections.sort(sortedNeighbors);
            Double smallestDistance = sortedNeighbors.get(0);
            smallestDistances.put(i, smallestDistance );
        }
        Map.Entry<Integer, Double> max = null;
        for (Map.Entry<Integer, Double> entry : smallestDistances.entrySet()) {
            if (max == null || max.getValue() < entry.getValue()) {
                max = entry;
            }
        }

        //System.out.println(min.getKey()); // 0.1
        return max.getKey();
    }

    //### AVERAGE PRIORITISATION METHOD ###
    /**
     * Averages the set of test cases distances from the subject test case and ranks in
     * descending order
     * @param similarityMatrix calculated similarity matrix
     * @param testSet parsed test set
     * @return priority order
     */
    public static Map<Integer, TestCase> averageMethodPrioritisation(ArrayList<ArrayList<Double>> similarityMatrix, Map<Integer, TestCase> testSet){
        /*
        For every entry in the list, calculate the average and then save that as a key in a dictionary. Maybe create a
        test case class to store the data in??
         */
        Map<TestCase,Double> testCaseAverages = calculateAndPopulateAverages(similarityMatrix, testSet);
        return generateOrdering(testCaseAverages);
    }

    private static Map<TestCase, Double> calculateAndPopulateAverages(ArrayList<ArrayList<Double>> similarityMatrix, Map<Integer, TestCase> testSet){
        //Calculate average score
        Map<TestCase, Double> testCaseAverages = new HashMap<>();
        for (int i = 0; i < similarityMatrix.size(); i++) {
            double sum = 0.0;
            ArrayList<Double> testCase = similarityMatrix.get(i);
            for (Object distance : testCase){
                if (distance != null){
                    sum += (Double) distance;
                }
//                if ( String.valueOf(distance).equals("0")){
//                    System.out.print("distance is " + distance);
//                }
            }
            double average = sum / (testCase.size() - 2) ;
            testCaseAverages.put(testSet.get(i), average);
        }
        return testCaseAverages;
    }

    private static Map<Integer, TestCase> generateOrdering(Map<TestCase, Double> testCaseAverages) {
        Map<Integer, TestCase> prioritisedTestSuite = new HashMap<>();
        Map<TestCase, Double> sortedAverages = Utils.sortMapByValue(testCaseAverages);
        int counter = testCaseAverages.size() - 1;
        for (Map.Entry<TestCase, Double> entry : sortedAverages.entrySet()) {
            entry.getKey().setOrder(counter);
            prioritisedTestSuite.put(counter, entry.getKey());
            counter -= 1;
        }
        return prioritisedTestSuite;
    }
    //### RANDOM ORDERING ####
    private void generateRandomOrdering(Map<Integer, TestCase> testSet)
    {
        //Generate a list of size of the test set with numbers from 0 to n-1 ascending
        //Pick a random entry from 0 to n, pop that entry and repeat.
    }

    private void evaluateTestSuite(){

    }
}
