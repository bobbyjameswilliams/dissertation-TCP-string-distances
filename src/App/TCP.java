package App;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import Test.FileHandlerTest.Data.FileHandlerTestData;
import org.apache.commons.lang3.StringUtils;
import java.lang.reflect.Method;
import java.util.zip.*;

public class TCP {
    public static void main(String[] args) throws IOException {
        List<String> file = FileHandler.readFile("./src/Test/FileHandlerTest/Data/parseTests/testSuiteTestData.txt");
        List<String> parsedFile = FileHandler.parseTests(file);
        int hammingDistanceTests = hammingDistance(parsedFile.get(0), parsedFile.get(0));
        System.out.print(hammingDistanceTests);
    }

    //############### STRING DISTANCES ######################

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

    public static float NCDistance(String string1, String string2) throws Exception {
        String concactString = string1 + string1;

        //Retrieve Compressed String
        String compressedString1 = FileHandler.compressString(string1);
        String compressedString2 = FileHandler.compressString(string2);
        String compressedConcatString = FileHandler.compressString(concactString);

        //Get Lengths
        int compressedString1Length = compressedString1.length();
        int compressedString2Length = compressedString2.length();
        int compressedConcatStringLength = compressedConcatString.length();

        float NCD_numerator = compressedConcatStringLength - Integer.min(compressedString1Length,compressedString2Length);
        float NCD_denominator = Integer.max(compressedString1Length,compressedString2Length);
        return (NCD_numerator / NCD_denominator);
    }

    private void levDistance(){

    }

    //############### STRING DISTANCES ######################

    public static ArrayList<ArrayList<Double>> createSimilarityMatrix(Object object, List<String> testCases, Method distanceMethod) throws InvocationTargetException, IllegalAccessException {
        /*
        PSEUDOCODO
        m=n=testsuite.length
        create main_list
        Foreach test case(0..n):
            create list
            Foreach test case(0..m):
                list.add(fitnessFunction(testsuite(m),testSuite(n))
            mainList.add(list)
         */
        ArrayList<ArrayList<Double>> similarityMatrix = null;
        for (int i = 0; i < testCases.size(); i++) {
            ArrayList<Double> testCaseDiffList = null;
            for (int j = 0; i < testCases.size(); i++){
                Double stringDistance = (Double) distanceMethod.invoke(object, testCases.get(i), testCases.get(j));
                testCaseDiffList.add(stringDistance);
            }
            similarityMatrix.add(testCaseDiffList);
        }
        return similarityMatrix;
    }

    private void generateRandomOrdering(){

    }

    private void evaluateTestSuite(){

    }
}
