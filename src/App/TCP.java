package App;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import App.Models.TestCase;
import org.apache.commons.lang3.StringUtils;
import java.lang.reflect.Method;
import java.util.Map;

public class TCP {
    public static void main(String[] args) throws IOException {
        List<String> file = Utils.readFile("./src/Test/FileHandlerTest/Data/parseTests/testSuiteTestData.txt");
        Map<Integer, TestCase> parsedFile = Utils.parseTests(file);
    }

    //############### STRING DISTANCES ######################

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

    public static double NCDistance(String string1, String string2) throws Exception {
        String concactString = string1 + string1;

        //Retrieve Compressed String
        String compressedString1 = Utils.compressString(string1);
        String compressedString2 = Utils.compressString(string2);
        String compressedConcatString = Utils.compressString(concactString);

        //Get Lengths
        int compressedString1Length = compressedString1.length();
        int compressedString2Length = compressedString2.length();
        int compressedConcatStringLength = compressedConcatString.length();

        double NCD_numerator = compressedConcatStringLength - Integer.min(compressedString1Length,compressedString2Length);
        double NCD_denominator = Integer.max(compressedString1Length,compressedString2Length);
        return (NCD_numerator / NCD_denominator);
    }

    //############### FITNESS FUNCTIONS ######################
    //Polymorphic for double and int
    public static ArrayList<ArrayList<Object>> createSimilarityMatrix(Object tcpObject, Map<Integer, TestCase> testCases, Method distanceMethod) throws InvocationTargetException, IllegalAccessException {
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
        int testCaseCount = testCases.size();
        ArrayList<ArrayList<Object>> similarityMatrix = new ArrayList<>();
        for (int i = 0; i < testCaseCount; i++) {
            ArrayList<Object> testCaseDiffList = new ArrayList<>();
            for (int j = 0; j < testCaseCount; j++){
                String testCase1 = testCases.get(i).getTestData();
                String testCase2 = testCases.get(j).getTestData();
                Object stringDistance = distanceMethod.invoke(tcpObject, testCase1 , testCase2 );
                testCaseDiffList.add(stringDistance);
            }
            similarityMatrix.add(testCaseDiffList);
        }
        return similarityMatrix;
    }

    public static Map<Integer, TestCase> averageFitnessFunction(ArrayList<ArrayList<Object>> similarityMatrix){
        /*
        For every entry in the list, calculate the average and then save that as a key in a dictionary. Maybe create a
        test case class to store the data in??
         */
        Map<Integer, TestCase> testSet = new HashMap<>();

        for (ArrayList<Object> testCase : similarityMatrix) {
            Double sum = 0.0;
            for (Object distance : testCase){
                sum += (Double) distance;
            }

            Double average = sum / (testCase.size() - 1) ;
            //testSet.put(similarityMatrix.indexOf(testCase));
        }
        return null;
    }
    private void generateRandomOrdering(){

    }

    private void evaluateTestSuite(){

    }
}
