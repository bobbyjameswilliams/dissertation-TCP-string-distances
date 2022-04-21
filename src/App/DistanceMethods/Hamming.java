package App.DistanceMethods;

import org.apache.commons.lang3.StringUtils;

public class Hamming {
    public static double hammingDistance(String string1, String string2){
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
    private static double performHammingDistance(String shortString, String longString){
        double distance = 0;
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

}
