package Test.TCPTest.Data;

import App.Models.TestCase;
import App.TCP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TCPTestData {
    public static int basicStringDistance(String string1, String string2){
        int distance = string1.length() - string2.length();
        return Math.abs(distance);
    }

    public static ArrayList<ArrayList<Double>> getEditDistanceLedruExampleSimilarityMatrix(){
        Double[] tc0 = {null, 5.0, 4.0, 4.0, 3.0, 4.0, 14.0};
        Double[] tc1 = {5.0, null, 7.0, 8.0, 5.0, 9.0, 15.0};
        Double[] tc2 = {4.0, 7.0, null, 5.0, 5.0, 5.0, 11.0};
        Double[] tc3 = {4.0, 8.0, 5.0, null, 4.0, 5.0, 15.0};
        Double[] tc4 = {3.0, 5.0, 5.0, 4.0, null, 4.0, 14.0};
        Double[] tc5 = {4.0, 9.0, 5.0, 5.0, 4.0, null, 15.0};
        Double[] tc6 = {14.0, 15.0, 11.0, 15.0, 14.0, 15.0, null};

        ArrayList<ArrayList<Double>> similarityMatrix = new ArrayList<>();

        ArrayList<Double> tc0AR = new ArrayList<>(Arrays.asList(tc0));
        similarityMatrix.add(tc0AR);
        ArrayList<Double> tc1AR = new ArrayList<>(Arrays.asList(tc1));
        similarityMatrix.add(tc1AR);
        ArrayList<Double> tc2AR = new ArrayList<>(Arrays.asList(tc2));
        similarityMatrix.add(tc2AR);
        ArrayList<Double> tc3AR = new ArrayList<>(Arrays.asList(tc3));
        similarityMatrix.add(tc3AR);
        ArrayList<Double> tc4AR = new ArrayList<>(Arrays.asList(tc4));
        similarityMatrix.add(tc4AR);
        ArrayList<Double> tc5AR = new ArrayList<>(Arrays.asList(tc5));
        similarityMatrix.add(tc5AR);
        ArrayList<Double> tc6AR = new ArrayList<>(Arrays.asList(tc6));
        similarityMatrix.add(tc6AR);

        return similarityMatrix;
        }

    public static Map<Integer, TestCase> getCeasarCipherExampleSuiteLedru(){
        Map<Integer, TestCase> suite = new HashMap<>();
        suite.put(0, new TestCase(0,"abc 1"));
        suite.put(1, new TestCase(1,"abc.xyz −1"));
        suite.put(2, new TestCase(2,"a.Z 27"));
        suite.put(3, new TestCase(3,"AaZz 0"));
        suite.put(4, new TestCase(4,"xyz 1"));
        suite.put(5, new TestCase(5,"ééé 4"));
        suite.put(6, new TestCase(6,"a..z:A..Z 1234567"));
        return suite;
    }

    public static ArrayList<ArrayList<Double>> getCeaserCipherExampleSimilarityMatrix(){
        Double[] tc0 = {null, 7.0, 4.0, 6.0, 3.0, 4.0, 16.0};
        Double[] tc1 = {7.0, null, 9.0, 10.0, 10.0, 10.0, 16.0};
        Double[] tc2 = {4.0, 9.0, null, 5.0, 5.0, 5.0, 15.0};
        Double[] tc3 = {6.0, 10.0, 5.0, null, 6.0, 6.0, 16.0};
        Double[] tc4 = {3.0, 10.0, 5.0, 6.0, null, 4.0, 17.0};
        Double[] tc5 = {4.0, 10.0, 5.0, 6.0, 4.0, null, 17.0};
        Double[] tc6 = {16.0, 16.0, 15.0, 16.0, 17.0, 17.0, null};

        ArrayList<ArrayList<Double>> similarityMatrix = new ArrayList<>();

        ArrayList<Double> tc0AR = new ArrayList<>(Arrays.asList(tc0));
        similarityMatrix.add(tc0AR);
        ArrayList<Double> tc1AR = new ArrayList<>(Arrays.asList(tc1));
        similarityMatrix.add(tc1AR);
        ArrayList<Double> tc2AR = new ArrayList<>(Arrays.asList(tc2));
        similarityMatrix.add(tc2AR);
        ArrayList<Double> tc3AR = new ArrayList<>(Arrays.asList(tc3));
        similarityMatrix.add(tc3AR);
        ArrayList<Double> tc4AR = new ArrayList<>(Arrays.asList(tc4));
        similarityMatrix.add(tc4AR);
        ArrayList<Double> tc5AR = new ArrayList<>(Arrays.asList(tc5));
        similarityMatrix.add(tc5AR);
        ArrayList<Double> tc6AR = new ArrayList<>(Arrays.asList(tc6));
        similarityMatrix.add(tc6AR);

        return similarityMatrix;
    }
    }

