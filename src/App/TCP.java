package App;
import java.io.*;
import java.util.List;
import Test.FileHandlerTest.Data.FileHandlerTestData;
import org.apache.commons.lang3.StringUtils;
import java.util.zip.*;

public class TCP {
    public static void main(String[] args) throws IOException {
        List<String> file = FileHandler.readFile("./src/Test/FileHandlerTest/Data/parseTests/testSuiteTestData.txt");
        List<String> parsedFile = FileHandler.parseTests(file);
        int hammingDistanceTests = hammingDistance(parsedFile.get(0), parsedFile.get(0));
        System.out.print(hammingDistanceTests);
    }


    private void prioritiseTestCases(){

    }

    private void manhattanDistance(){

    }

    private void euclideanDistance(){

    }

    public static int hammingDistance(String string1, String string2){
        //TODO: Fix hamming distance of different lengths.
        if (string1.length() < string2.length()){
            return performHammingDistance(string1, string2);
        }
        else{
            return performHammingDistance(string2, string1);
        }
    }

    /*
    Performs hamming distance. Main method for this prepares the strings and sends it to here.
     */
    private static int performHammingDistance(String shortString, String longString){
        int distance = 0;
        int shortStringLength = shortString.length();
        int longStringLength = longString.length();
        //Pad the shorter string with chr(0)
        char pad = (char)0;
        String shortStringPadded = StringUtils.rightPad(shortString, longStringLength, pad);
        for (int i=0; i<longStringLength ;i++){
            if (shortStringPadded.charAt(i) != longString.charAt(i)){
                distance += 1;
            }
        }
        return distance;
    }

    public static int NCDistance(String string1, String string2){
        String concactString = string1 + string1;

        String compressedString1;
        String compressedString2;
        String compressedConcatString;
        return 100;
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
