package Test.PrioritisationMethods;

import Test.TCPTest.Data.TCPTestData;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import static App.TCP.PrioritisationMethods.LedruFitness.ledruFitnessFunctionPrioritisation;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LedruFitness {
    /**
     * Tests the ledru fitness function against the test data available in \"Prioritizing test cases with string distances
     * ledru et al\"
     */
    @Test
    void testLedrufitnessfunctionEditTestData() {
        ArrayList<ArrayList<Double>> ledruEditSimilarityMatrix = TCPTestData.getEditDistanceLedruExampleSimilarityMatrix();

        Set<Integer> expectedResult = new LinkedHashSet<>();
        expectedResult.add(6);
        expectedResult.add(1);
        expectedResult.add(5);
        expectedResult.add(2);
        expectedResult.add(3);
        expectedResult.add(0);
        expectedResult.add(4);
        Set<Integer> actualResult = ledruFitnessFunctionPrioritisation(ledruEditSimilarityMatrix);
        assertEquals(expectedResult,actualResult);
    }

    //    @Test
//    void testClosestDistance() {
//        // Test Data
//        ArrayList<ArrayList<Double>> ledruEditSimilarityMatrix = TCPTestData.getEditDistanceLedruExampleSimilarityMatrix();
//        ArrayList<Double> ajacencyListTC2 = ledruEditSimilarityMatrix.get(2);
//
//        Integer[] pData = {6,1};
//        Set<Integer> p = new HashSet<>(Arrays.asList(pData));
//        Double expectedResult = 7.0;
//        Double actualResult = TCP.closestDistance(ajacencyListTC2, p);
//        assertEquals(expectedResult, actualResult);
//    }
//
//
//    @Test
//    void testSmallestNeighbor() {
//        ArrayList<ArrayList<Double>> ledruEditSimilarityMatrix = TCPTestData.getEditDistanceLedruExampleSimilarityMatrix();
//        Integer expectedResult = 6;
//        Integer actualResult = TCP.smallestNeighbor(ledruEditSimilarityMatrix);
//
//        assertEquals(expectedResult,actualResult);
//    }

}
