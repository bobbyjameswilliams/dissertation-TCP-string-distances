package App;


import App.Models.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import com.florianingerl.util.regex.*;

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
        String listString = "";

        for (String s : file)
        {
            listString += s + "\n";
        }

        Map<Integer, TestCase> allMatches = new HashMap<Integer, TestCase>() {

        };
        Matcher m = Pattern.compile("[^{\\}]+(?=})")
                .matcher(listString);
        int caseNo = 0;
        while (m.find()) {
            String testCase = m.group().trim();

            if (testCase.length() > 0){
                allMatches.put(caseNo , new TestCase(caseNo, testCase));
                caseNo += 1;
            }
        }
    return allMatches;
    };

    public static void extractMethodName(){
        //TODO implement
    };

    public static String linesToString(List<String> list){
        /**
         * Takes in a list of strings and returns a single string delimited with \n
         */
        String listString = "";
        for (String s : list)
        {
            listString += s + "\n";
        }
        return listString.trim();
    }

    public static List<String> stringToLines(String string){
        /**
         * Takes in a string delimited with \n and separates them out into lines in a list.
         * TODO implement
         */

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
        if (string.length() == 0 || string == null) {
            return string;
        }
        ByteArrayOutputStream object = new ByteArrayOutputStream();
        GZIPOutputStream gzip = new GZIPOutputStream(object);
        gzip.write(string.getBytes());
        gzip.close();

        return object.toString("ISO-8859-1");
    }
}
