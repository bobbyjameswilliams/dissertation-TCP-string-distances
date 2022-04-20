package Test.TCPTest.Data;

import java.util.ArrayList;
import java.util.Arrays;

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
    }

