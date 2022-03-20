package Test.FileHandlingTest;

import App.FileHandler;
import Test.FileHandlingTest.Data.FileHandlingTestData;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static Test.FileHandlingTest.Data.FileHandlingTestData.*;
import static org.junit.jupiter.api.Assertions.*;

class FileHandlingTest {

   // TESTS FOR readFile()
    @Test
    void testReadFileCorrectFirstLine(){
        List<String> result = FileHandler.readFile(testReadFilePath);
        assertTrue(result.get(0).equals(testReadFileFirstLine));
    }

    @Test
    void testReadFileCorrectLineCount(){
        List<String> result = FileHandler.readFile(testReadFilePath);
        assertTrue(result.size() == testReadFileLineCount);
    }

    //TESTS FOR parseTests()
    @Test
    void testParseTestFirstTest(){

    }




}