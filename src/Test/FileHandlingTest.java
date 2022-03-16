package Test;

import App.FileHandling;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FileHandlingTest {
    FileHandling fileHandlerObject{}

    // TESTS FOR READFILE
    final String testFileName = "test.java";
    final int testFileLineCount = 9;
    final String testFileFirstLine = "package Test.Data;";

    @Test
    void testReadFileNoError(){

    }

    @Test
    void testReadFileCorrectFirstLine(){

    }

    @Test
    void testReadFileCorrectLineCount(){

    }

}