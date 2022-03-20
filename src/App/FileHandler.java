package App;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileHandler {
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

    public static List<String> parseTests(List<String> file){
//        Map<String, String> dictionary = new HashMap<String, String>();
//        List<String> testCase = new ArrayList<String>();
//        Integer counter = 0;
//        //Condition Booleans
//        Boolean atTestFound = false;
//        Boolean recordLinesToList = false;
//
//        for (String item : file) {
//
//        }
        String listString = "";
        List<String> x = Arrays.asList("bruh","bruh");
        for (String s : file)
        {
            listString += s + "\n";
        }

        List<String> allMatches = new ArrayList<String>();
        Matcher m = Pattern.compile("[^{\\}]+(?=})")
                .matcher(listString);
        while (m.find()) {
            allMatches.add(m.group().trim());
        }
        System.out.print(allMatches.get(0));

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
}
