package Test;

import App.FileHandler;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileHandlingTest {
    FileHandler fileHandlerObject = new FileHandler();

    // TESTS FOR READFILE
    final String testFileName = "./src/Test/test.txt";
    final int testFileLineCount = 9;
    final String testFileFirstLine = "package Test.Data;";

    @Test
    void testReadFileCorrectFirstLine(){
        List<String> result = fileHandlerObject.readFile(testFileName);
        assertTrue(result.get(0).equals(testFileFirstLine));
    }

    @Test
    void testReadFileCorrectLineCount(){
        List<String> result = fileHandlerObject.readFile(testFileName);
        assertTrue(result.size() == testFileLineCount);
    }
    


}