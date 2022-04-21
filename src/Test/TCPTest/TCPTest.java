package Test.TCPTest;

import App.Models.TestCase;
import App.Utils;
import Test.TCPTest.Data.TCPTestData;
import org.junit.jupiter.api.Test;
import App.TCP;
import Test.UtilsTest.Data.UtilsTestData;

import javax.print.attribute.standard.PDLOverrideSupported;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TCPTest {
    @Test
    void main() {
    }

    //################ TESTS FOR hammingDistance() ##########################
    @Test
    void hammingDistanceSameString() {
        String string1 = "bobby";
        String string2 = "bobby";
        double expectedScore = 0;
        double actualScore = TCP.hammingDistance(string1, string2);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void hammingDistanceKName() {
        String string1 = "KAROLIN";
        String string2 = "KATHRIN";
        double expectedScore = 3;
        double actualScore = TCP.hammingDistance(string1, string2);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void hammingDistanceBinary() {
        String string1 = "0000";
        String string2 = "1111";
        double expectedScore = 4;
        double actualScore = TCP.hammingDistance(string1, string2);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    /*
    Hamming distance using an example in `prioritising test cases with string distances`
     */
    void hammingDistanceExample1() {
        String string1 = "ab";
        String string2 = "abcde";
        double expectedScore = 3;
        double actualScore = TCP.hammingDistance(string1, string2);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    /*
    Hamming distance using an example in `prioritising test cases with string distances`
     */
    void hammingDistanceExample2() {
        String string1 = "abcd";
        String string2 = "abab";
        double expectedScore = 2;
        double actualScore = TCP.hammingDistance(string1, string2);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void hammingDistanceSimilarityMatrixFromLedru() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<ArrayList<Double>> expectedResult = TCPTestData.getCeaserCipherExampleSimilarityMatrix();
        Map<Integer,TestCase> exampleSuite = TCPTestData.getCeasarCipherExampleSuiteLedru();
        Method fitnessFunctionToPass = TCP.class.getMethod("hammingDistance", String.class, String.class);
        TCP tcp = new TCP();
        ArrayList<ArrayList<Double>> actualResult = TCP.createSimilarityMatrix(tcp, exampleSuite, fitnessFunctionToPass);

        assertEquals(expectedResult,actualResult);

    }



    //###################### TESTS FOR NCDistance() #######################

//    @Test
//    void NCDistanceSameString() throws Exception {
//        // KNOWN FAILING
//        //TODO: Try it with two test cases, play around with the data.
//        List<String> testSuiteData = UtilsTestData.getTestSuiteDataInLines();
//        Map<Integer, TestCase> listOfTestCases = Utils.parseTests(testSuiteData);
//
//        String testCase1 = listOfTestCases.get(0).getTestData();
//        String testCase2 = listOfTestCases.get(1).getTestData();
//        double expectedScore = 0;
//        double actualScore = TCP.NCDistance(testCase1, testCase2);
//        assertEquals(expectedScore, actualScore);
//    }
//
//    @Test
//    void NCDistanceDifferentString() throws Exception {
//        // KNOWN FAILING
//        String string1 = "b";
//        String string2 = "abcdefghijklmnopqrstuvwxyz";
//        double expectedScore = 0;
//        double actualScore = TCP.NCDistance(string1, string2);
//        assertEquals(expectedScore, actualScore);
//    }

    @Test
    void calculateStringDistance() {
    }

    @Test
    void prioritiseTestCases() {

    }

    @Test
    void createSimilarityMatrixCorrectLength() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Map<Integer, TestCase> testData = UtilsTestData.getCorrectlyParsedExampleTestSuite();

        Method fitnessFunctionToPass = TCP.class.getMethod("NCDistance", String.class, String.class);
        TCP tcp = new TCP();
        ArrayList<ArrayList<Double>> table = TCP.createSimilarityMatrix(tcp, testData, fitnessFunctionToPass);

        int expectedResult = 12;
        int actualResult = table.size();
        assertEquals(expectedResult, actualResult);
    }

    //############### TESTS FOR averageFitnessfunction() ############
    @Test
    void testAverageFitnessFunction() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Map<Integer, TestCase> testData = UtilsTestData.getCorrectlyParsedExampleTestSuite();

        Method fitnessFunctionToPass = TCP.class.getMethod("NCDistance", String.class, String.class);
        TCP tcp = new TCP();
        ArrayList<ArrayList<Double>> table = TCP.createSimilarityMatrix(tcp, testData, fitnessFunctionToPass);
        TCP.averageMethodPrioritisation(table, testData);
    }

    //############## TESTS FOR closestDistance()

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
        Set<Integer> actualResult = TCP.ledruFitnessFunctionPrioritisation(ledruEditSimilarityMatrix);
        assertEquals(expectedResult,actualResult);
    }

    /**
     * Tests that when converting the ordering to an ordered test suite, order is preserved.
     */
    @Test
    void testOrderingToSuitePreservesOrdering(){
        ArrayList<ArrayList<Double>> ceaserSimilarityMatrix = TCPTestData.getCeaserCipherExampleSimilarityMatrix();
        Map<Integer, TestCase> ceasarTestSuite = TCPTestData.getCeasarCipherExampleSuiteLedru();

        Set<Integer> expectedResult = TCP.ledruFitnessFunctionPrioritisation(ceaserSimilarityMatrix);

        Map<Integer, TestCase> prioritisedTestSuite = TCP.orderingToSuite(expectedResult,ceasarTestSuite);
        Set<Integer> actualResult = new LinkedHashSet<>();

        for (Map.Entry<Integer, TestCase> entry : prioritisedTestSuite.entrySet()) {
            Integer order = entry.getValue().getOrder();
            actualResult.add(order);
        }

        assertEquals(expectedResult, actualResult);
    }
}