package Test.TCPTest;

import App.Models.TestCase;
import App.Utils;
import org.junit.jupiter.api.Test;
import App.TCP;
import Test.UtilsTest.Data.UtilsTestData;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TCPTest {
    @Test
    void main() {
    }

    //################ TESTS FOR hammingDistance() ##########################
    @Test
    void hammingDistanceSameString(){
        String string1 = "bobby";
        String string2 = "bobby";
        int expectedScore = 0;
        int actualScore = TCP.hammingDistance(string1, string2);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void hammingDistanceKName(){
        String string1 = "KAROLIN";
        String string2 = "KATHRIN";
        int expectedScore = 3;
        int actualScore = TCP.hammingDistance(string1, string2);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void hammingDistanceBinary(){
        String string1 = "0000";
        String string2 = "1111";
        int expectedScore = 4;
        int actualScore = TCP.hammingDistance(string1, string2);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    /*
    Hamming distance using an example in `prioritising test cases with string distances`
     */
    void hammingDistanceExample1(){
        String string1 = "ab";
        String string2 = "abcde";
        int expectedScore = 3;
        int actualScore = TCP.hammingDistance(string1, string2);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    /*
    Hamming distance using an example in `prioritising test cases with string distances`
     */
    void hammingDistanceExample2(){
        String string1 = "abcd";
        String string2 = "abab";
        int expectedScore = 2;
        int actualScore = TCP.hammingDistance(string1, string2);
        assertEquals(expectedScore, actualScore);
    };

    //###################### TESTS FOR NCDistance() #######################

    @Test
    void NCDistanceSameString() throws Exception {
        // KNOWN FAILING
        //TODO: Try it with two test cases, play around with the data.
        List<String> testSuiteData = UtilsTestData.getTestSuiteDataInLines();
        Map<Integer, TestCase> listOfTestCases = Utils.parseTests(testSuiteData);

        String testCase1 =  listOfTestCases.get(0).getTestData();
        String testCase2 = listOfTestCases.get(1).getTestData();
        double expectedScore = 0;
        double actualScore = TCP.NCDistance(testCase1, testCase2);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void NCDistanceDifferentString() throws Exception {
        // KNOWN FAILING
        String string1 = "b";
        String string2 = "abcdefghijklmnopqrstuvwxyz";
        double expectedScore = 0;
        double actualScore = TCP.NCDistance(string1, string2);
        assertEquals(expectedScore, actualScore);
    }
    @Test
    void calculateStringDistance(){
    }

    @Test
    void prioritiseTestCases(){

    }

    @Test
    void createSimilarityMatrixCorrectLength() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Map<Integer, TestCase> testData = UtilsTestData.getCorrectlyParsedExampleTestSuite();

        Method fitnessFunctionToPass = TCP.class.getMethod("NCDistance", String.class, String.class);
        TCP tcp = new TCP();
        ArrayList<ArrayList<Object>> table = TCP.createSimilarityMatrix(tcp, testData, fitnessFunctionToPass);

        int expectedResult = 13;
        int actualResult = table.size();
        assertEquals(expectedResult, actualResult);
    }

    //################  TESTS FOR manhattanDistance() ###########
    @Test
    void manhattanDistance(){
    }

    //############### TESTS FOR averageFitnessfunction() ############
    @Test
    void testAverageFitnessFunction() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Map<Integer, TestCase> testData = UtilsTestData.getCorrectlyParsedExampleTestSuite();

        Method fitnessFunctionToPass = TCP.class.getMethod("NCDistance", String.class, String.class);
        TCP tcp = new TCP();
        ArrayList<ArrayList<Object>> table = TCP.createSimilarityMatrix(tcp, testData, fitnessFunctionToPass);
        TCP.averageFitnessFunction(table);
    }
}