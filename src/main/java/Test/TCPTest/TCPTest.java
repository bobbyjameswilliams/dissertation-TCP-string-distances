package Test.TCPTest;

import App.TCP.DistanceMethods.Hamming;
import App.TCP.DistanceMethods.NCD;
import App.Models.TestCase;
import Test.TCPTest.Data.TCPTestData;
import org.junit.jupiter.api.Test;
import App.Tool;
import Test.UtilsTest.Data.UtilsTestData;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

import static App.TCP.PrioritisationMethods.LedruFitness.ledruFitnessFunctionPrioritisation;
import static org.junit.jupiter.api.Assertions.*;

class TCPTest {

    @Test
    void hammingDistanceSimilarityMatrixFromLedru() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<ArrayList<Double>> expectedResult = TCPTestData.getCeaserCipherExampleSimilarityMatrix();
        Map<Integer,TestCase> exampleSuite = TCPTestData.getCeasarCipherExampleSuiteLedru();
        Method fitnessFunctionToPass = Hamming.class.getMethod("hammingDistance", String.class, String.class);
        Tool tcp = new Tool();
        ArrayList<ArrayList<Double>> actualResult = Tool.createSimilarityMatrix(tcp, exampleSuite, fitnessFunctionToPass);

        assertEquals(expectedResult,actualResult);

    }

    @Test
    void createSimilarityMatrixCorrectLength() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Map<Integer, TestCase> testData = UtilsTestData.getCorrectlyParsedExampleTestSuite();

        Method fitnessFunctionToPass = NCD.class.getMethod("NCDistance", String.class, String.class);
        Tool tcp = new Tool();
        ArrayList<ArrayList<Double>> table = Tool.createSimilarityMatrix(tcp, testData, fitnessFunctionToPass);

        int expectedResult = 12;
        int actualResult = table.size();
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Tests that when converting the ordering to an ordered test suite, order is preserved.
     */
    @Test
    void testOrderingToSuitePreservesOrdering(){
        ArrayList<ArrayList<Double>> ceaserSimilarityMatrix = TCPTestData.getCeaserCipherExampleSimilarityMatrix();
        Map<Integer, TestCase> ceasarTestSuite = TCPTestData.getCeasarCipherExampleSuiteLedru();

        Set<Integer> expectedResult = ledruFitnessFunctionPrioritisation(ceaserSimilarityMatrix);

        Map<Integer, TestCase> prioritisedTestSuite = Tool.orderingToSuite(expectedResult,ceasarTestSuite);
        Set<Integer> actualResult = new LinkedHashSet<>();

        for (Map.Entry<Integer, TestCase> entry : prioritisedTestSuite.entrySet()) {
            Integer order = entry.getValue().getOrder();
            actualResult.add(order);
        }

        assertEquals(expectedResult, actualResult);
    }
}