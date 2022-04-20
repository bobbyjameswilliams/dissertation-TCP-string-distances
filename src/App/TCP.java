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

        //Set<Integer> priorityOrder = ledruFitnessFunctionPrioritisation(similarityMatrix);
        Set<Integer> priorityOrder = averageMethodPrioritisation(similarityMatrix, parsedFile);
        Map<Integer, TestCase> prioritisedTestSuite = orderingToSuite(priorityOrder, parsedFile);

        Utils.outputResultsToCSV(prioritisedTestSuite, "avgFitnessFuncTest1");
        System.out.println("wibble");
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

    //######### LEDRU FITNESS FUNCTION #############

    public static Set<Integer> ledruFitnessFunctionPrioritisation(ArrayList<ArrayList<Double>> similarityMatrix){
        /*
        Compute the distances for each pair of test cases in T
        Remove duplicates from T (These being duplicate test cases, store them elsewhere tho)
        Find an element t ∈ T with the maximum distance dd(t,T ),
            T := T \{t}, P := t
        While T is not empty
            Find an element t ∈ T with the maximum distance dd(t,P),
                T := T \{t}, P := P.t (t is appended to the sequence)
        Append duplicates to P
        return P
         */
        Set<Integer> p = new LinkedHashSet<>();
        Set<Integer> t = new LinkedHashSet<>();

        //adding all the test cases to set t
        for (int i = 0; i < similarityMatrix.size(); i++){
            t.add(i);
        }

        Integer firstEntry = smallestNeighbor(similarityMatrix);
        p.add(firstEntry);
        t.remove(firstEntry);

        while (t.size() > 0){
            Integer tToPop = dd(similarityMatrix,t,p);
            p.add(tToPop);
            t.remove(tToPop);
        }
        return p;
    }

    private static int smallestNeighbor (ArrayList<ArrayList<Double>> similarityMatrix){
        Map<Integer, Double> smallestDistances =  new HashMap<>();
        for(int i = 0; i < similarityMatrix.size(); i++){
            List<Double> testCaseNeighbors = similarityMatrix.get(i);
            //Shallow copy of testCaseNeighbors
            List<Double> sortedNeighbors = new ArrayList<>(testCaseNeighbors);

            /*By this point, order is not affected by removing null, as we only
            want to find the smallest item in the list. */
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

        assert max != null;
        return max.getKey();
    }

    /**
     * Given a test cases adjacency list and the permutation p, returns the closest distance from the test case to the
     * permutation p
     *
     * @param adjacencyList adjacency list of test case t
     * @param p permutation
     * @return distance as double
     */
    private static Double closestDistance(ArrayList<Double> adjacencyList, Set<Integer> p){
        List<Double> distancesToP = new ArrayList<>();
        for (int pIndex : p) {
            double distanceToP = adjacencyList.get(pIndex);
            distancesToP.add(distanceToP);
        }
        Collections.sort(distancesToP);
        return distancesToP.get(0);
    }

    private static Integer dd(ArrayList<ArrayList<Double>> similarityMatrix, Set<Integer> t, Set<Integer> p ){
        HashMap<Integer,Double> distances = new HashMap<>();
        for (Integer index : t) {
            ArrayList<Double> adjacencyList = similarityMatrix.get(index);
            Double distance = closestDistance(adjacencyList, p);
            distances.put(index,distance);
        }
        //return the index with the largest distance.

        Map.Entry<Integer, Double> max = null;
        for (Map.Entry<Integer, Double> entry : distances.entrySet()) {
            if (max == null || max.getValue() < entry.getValue() ) {
                max = entry;
            }
        }
        assert max != null;
        return max.getKey();
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


    //### AVERAGE PRIORITISATION METHOD ###
    /**
     * Averages the set of test cases distances from the subject test case and ranks in
     * descending order
     * @param similarityMatrix calculated similarity matrix
     * @param testSet parsed test set
     * @return priority order
     */
    public static Set<Integer> averageMethodPrioritisation(ArrayList<ArrayList<Double>> similarityMatrix, Map<Integer, TestCase> testSet){
        /*
        For every entry in the list, calculate the average and then save that as a key in a dictionary. Maybe create a
        test case class to store the data in??
         */
        Map<TestCase,Double> testCaseAverages = calculateAndPopulateAverages(similarityMatrix, testSet);
        return generateAverageOrdering(testCaseAverages);
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

    private static Set<Integer> generateAverageOrdering(Map<TestCase, Double> testCaseAverages) {
        List<Integer> listOfPriorityOrdering = new ArrayList<>();
        Map<TestCase, Double> sortedAverages = Utils.sortMapByValue(testCaseAverages);
        for (Map.Entry<TestCase, Double> entry : sortedAverages.entrySet()) {
            listOfPriorityOrdering.add(entry.getKey().getTestID());
        }
        Collections.reverse(listOfPriorityOrdering);
        return new LinkedHashSet<>(listOfPriorityOrdering);
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
