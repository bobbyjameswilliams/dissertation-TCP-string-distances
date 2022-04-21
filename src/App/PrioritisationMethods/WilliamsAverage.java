package App.PrioritisationMethods;

import App.Models.TestCase;
import App.Utils;

import java.util.*;

public class WilliamsAverage {
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
}
