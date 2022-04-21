package App.DistanceMethods;

import App.Utils;

public class NCD {
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
}
