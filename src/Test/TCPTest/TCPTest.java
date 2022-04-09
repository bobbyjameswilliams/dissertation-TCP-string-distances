package Test.TCPTest;

import App.FileHandler;
import org.junit.jupiter.api.Test;
import App.TCP;
import Test.FileHandlerTest.Data.FileHandlerTestData;
import Test.TCPTest.Data.TCPTestData;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

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
        //TODO: Try it with two test cases, play around with the data.
        List<String> testSuiteData = FileHandlerTestData.getTestSuiteDataInLines();
        List<String> listOfTestCases = FileHandler.parseTests(testSuiteData);

        String testCase1 =  listOfTestCases.get(0);
        String testCase2 = listOfTestCases.get(1);
        float expectedScore = 0;
        float actualScore = TCP.NCDistance(testCase1, testCase2);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void NCDistanceDifferentString() throws Exception {
        String string1 = "b";
        String string2 = "abcdefghijklmnopqrstuvwxyz";
        float expectedScore = 0;
        float actualScore = TCP.NCDistance(string1, string2);
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
        List<String> testData = FileHandlerTestData.getCorrectlyParsedExampleTestSuite();
        //Class[] parameterTypes = new Class[2];
        //parameterTypes[0] = String.class;
        //parameterTypes[1] = String.class;
        Method fitnessFunctionToPass = TCP.class.getMethod("hammingDistance", String.class, String.class);
        TCP tcp = new TCP();
        ArrayList<ArrayList<Double>> table = TCP.createSimilarityMatrix(tcp, testData, fitnessFunctionToPass);

        int expectedResult = 12;
        assert table != null;
        int actualResult = table.size();
        assertEquals(expectedResult, actualResult);
    }

    //################  TESTS FOR manhattanDistance() ###########
    @Test
    void manhattanDistance(){
    }
}