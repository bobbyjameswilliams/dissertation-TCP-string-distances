package Test.TCPTest.Data;

public class TCPTestData {
    public static int basicStringDistance(String string1, String string2){
        int distance = string1.length() - string2.length();
        return Math.abs(distance);
    }
}
