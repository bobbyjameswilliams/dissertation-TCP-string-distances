package Test.UtilsTest;

import App.Models.TestCase;
import App.Utils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static Test.UtilsTest.Data.UtilsTestData.*;
import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

   // TESTS FOR readFile()
    @Test
    void testReadFileCorrectFirstLine(){
        /**
         * Tests that the first line is read correct
         */
        List<String> result = Utils.readFile(testReadFilePath);
        assertEquals(testReadFileFirstLine, result.get(0));
    }

    @Test
    void testReadFileCorrectLineCount(){
        /**
         * Tests that the correct line count is present for expected
         */
        List<String> result = Utils.readFile(testReadFilePath);
        assertEquals(testReadFileLineCount, result.size());
    }

    //TESTS FOR parseTests()
    @Test
    void testParseTestFirstTest(){
        List<String> testSuiteData = getTestSuiteDataInLines();
        String correctlyParsedFirstTest = getCorrectlyParsedFirstTest();
        Map<Integer, TestCase> listOfTestContents = Utils.parseTests(testSuiteData);
        assertEquals(correctlyParsedFirstTest, listOfTestContents.get(0).getTestData());
    }

    //TESTS FOR linesToString()

    @Test
    void testLinesToStringReturnDelimted(){
        String firstString = "first";
        String secondString = "second";
        List<String> testList = Arrays.asList(firstString,secondString);
        String expectedResult ="first\nsecond";
        String actualResult = Utils.linesToString(testList);
        assertEquals(expectedResult,actualResult);
    }

    //############## TESTS FOR compressString() #####################

    @Test
    void testCompressStringCompressionRepeatCharacters() throws Exception {
        String uncompressedString = "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh";
        String compressedString = Utils.compressString(uncompressedString);

        int expectedResult = 24;
        int actualResult = compressedString.length();
        assertEquals(expectedResult,actualResult);
    }


}