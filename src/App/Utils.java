package App;


import App.Models.TestCase;

import java.io.*;
import java.util.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.GZIPOutputStream;
import com.florianingerl.util.regex.*;

import static org.junit.Assert.assertTrue;

public class Utils {
    public static List<String> readFile(String fileName){
        List<String> fileLines = new ArrayList<String>();
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                fileLines.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return fileLines;
    }

    public static Map<Integer, TestCase> parseTests(List<String> file){
        StringBuilder listString = new StringBuilder();

        for (String s : file)
        {
            listString.append(s).append("\n");
        }

        List<String> classBody = extractClassBody(listString.toString());
        return extractMethodBody(classBody);
    };

    /**
     * Extracts the body of a class from a java file.
     * @param listString
     * @return
     */
    private static List<String> extractClassBody(String listString){
        //Parsing class body
        Matcher cb = Pattern.compile("\\{.*\\}",Pattern.DOTALL)
                .matcher(listString.toString());
        List<String> classBody = new ArrayList<>();
        while (cb.find()) {
            String testCase = cb.group().trim();
            classBody.add(testCase);
        }
        return classBody;
    }

    public static Map<Integer, TestCase> extractMethodBody(List<String> classBody){
        Map<Integer, TestCase> allMatches = new HashMap<>();
        //Parsing function body
        if (classBody.size() == 1){
            String classBodyString = classBody.get(0);
            //trimming off the curly braces.
            classBodyString = classBodyString.substring(1, classBodyString.length() - 1);

            Matcher m = Pattern.compile("(?<recurse>\\{(([^{}]++|(?'recurse'))*)\\})")
                    .matcher(classBodyString);

            int caseNo = 0;
            while (m.find()) {
                String testCase = m.group().trim();
                //Remove curly brace from beginning and end of test case.
                testCase = testCase.substring(1, testCase.length() - 1).trim();
                if (testCase.length() > 0){
                    allMatches.put(caseNo , new TestCase(caseNo, testCase));
                    caseNo += 1;
                }
            }
            return allMatches;
        }
        else{
            System.out.println("Something went wrong while parsing the class body.");
            return null;
        }

    }
    public static void extractMethodName(){
        //TODO implement
    };

    /**
     * Takes in a list of strings and returns a single string delimited with \n
     */
    public static String linesToString(List<String> list){

        String listString = "";
        for (String s : list)
        {
            listString += s + "\n";
        }
        return listString.trim();
    }

    /**
     * Takes in a string delimited with \n and separates them out into lines in a list.
     * TODO implement
     */

    public static List<String> stringToLines(String string){
        return null;
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortMapByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }

    /*
    Compresses string using GZip, returns compressed string.
     */
    public static String compressString(String string) throws Exception {
        //TODO:
        if (string.length() == 0) {
            return string;
        }
        ByteArrayOutputStream object = new ByteArrayOutputStream();
        GZIPOutputStream gzip = new GZIPOutputStream(object);
        gzip.write(string.getBytes());
        gzip.close();

        return object.toString("ISO-8859-1");
    }

    /**
     * Outputs information about the prioritised test cases.
     * @param prioritisedResults Map of prioritised results.
     */
    public static void outputResultsToConsole(Map<Integer, TestCase> prioritisedResults){
        for (Map.Entry<Integer, TestCase> entry : prioritisedResults.entrySet()) {
            int order = entry.getValue().getOrder();
            String testData = entry.getValue().getTestData();
            String trimmedTestData =  testData.substring(0, Math.min(testData.length(), 30));
            int originalOrder = entry.getValue().getTestID();
            int testDataLength = testData.length();

            System.out.println(
                    "Order: " + order  + "," +
                    "Original Order: " + originalOrder + "," +
                    "Length: " + testDataLength);
                    //"Sample: " + trimmedTestData);
        }
    }


    public static void outputResultsToCSV(Map<Integer,TestCase> prioritisedResults) throws IOException {
        List<String[]> dataLines = new ArrayList<>();
        dataLines.add(new String[]
                { "Order","Original Order", "Case Length", "Data" });
        for (Map.Entry<Integer, TestCase> entry : prioritisedResults.entrySet()) {
            String order = String.valueOf(entry.getValue().getOrder());
            String testData = entry.getValue().getTestData();
            String originalOrder = String.valueOf(entry.getValue().getTestID());
            String testDataLength = String.valueOf(testData.length());
            //Add to output array
            dataLines.add(new String[]
                    { order ,originalOrder, testDataLength, testData});
        }
        //CSV output
        CSV csv = new CSV();
        String fileName = "./Results/" + "hello.csv";
        csv.givenDataArray_whenConvertToCSV_thenOutputCreated(dataLines, fileName);
    }

    // CSV Utils


}
