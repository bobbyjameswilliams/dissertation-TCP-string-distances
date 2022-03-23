package App;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner; // Import the Scanner class to read text files
import App.FileHandler;
import Test.FileHandlerTest.Data.FileHandlerTestData;

public class TCP {
    public static void main(String[] args) throws IOException {
        List<String> file = FileHandler.readFile("./src/Test/FileHandlerTest/Data/parseTests/testSuiteTestData.txt");
        List<String> parsedFile = FileHandler.parseTests(file);
        int hammingDistanceTests = hammingDistance(parsedFile.get(0), parsedFile.get(0));
        System.out.print(hammingDistanceTests);



        System.out.print("Wibble");
    }


    private void prioritiseTestCases(){

    }

    private void manhattanDistance(){

    }

    private void euclideanDistance(){

    }

    public static int hammingDistance(String string1, String string2){
        if (string1.length() < string2.length()){
            return performHammingDistance(string1, string2);
        }
        else{
            return performHammingDistance(string2, string1);
        }
    }

    private static int performHammingDistance(String shortString, String longString){
        int distance = 0;
        int shortStringLength = shortString.length();
        for (int i=0; i<shortStringLength ;i++){
            if (shortString.charAt(i) != longString.charAt(i)){
                distance += 1;
            }
        }
        return distance;


    }




    private void levDistance(){

    }

    private void applyFitnessFunction(){

    }

    private void generateRandomOrdering(){

    }

    private void evaluateTestSuite(){

    }
}
