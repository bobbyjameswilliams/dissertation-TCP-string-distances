package Test.FileHandlerTest;

import App.FileHandler;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static Test.FileHandlerTest.Data.FileHandlerTestData.*;
import static org.junit.jupiter.api.Assertions.*;

class FileHandlerTest {

   // TESTS FOR readFile()
    @Test
    void testReadFileCorrectFirstLine(){
        /**
         * Tests that the first line is read correct
         */
        List<String> result = FileHandler.readFile(testReadFilePath);
        assertEquals(testReadFileFirstLine, result.get(0));
    }

    @Test
    void testReadFileCorrectLineCount(){
        /**
         * Tests that the correct line count is present for expected
         */
        List<String> result = FileHandler.readFile(testReadFilePath);
        assertEquals(testReadFileLineCount, result.size());
    }

    //TESTS FOR parseTests()
    @Test
    void testParseTestFirstTest(){
        List<String> testSuiteData = getTestSuiteDataInLines();
        String correctlyParsedFirstTest = getCorrectlyParsedFirstTest();
        List<String> listOfTestContents = FileHandler.parseTests(testSuiteData);
        assertEquals(correctlyParsedFirstTest, listOfTestContents.get(0));
    }

    //TESTS FOR linesToString()

    @Test
    void testLinesToStringReturnDelimted(){
        String firstString = "first";
        String secondString = "second";
        List<String> testList = Arrays.asList(firstString,secondString);
        String expectedResult ="first\nsecond";
        String actualResult = FileHandler.linesToString(testList);
        assertEquals(expectedResult,actualResult);
    }

}