package App.TCP.DistanceMethods;

public class DistanceProxy {
    public static Double hammingDistance(String string1, String string2){
        return Hamming.hammingDistance(string1,string2);
    }

    public static Double NCDistance(String string1, String string2) throws Exception {
        return NCD.NCDistance(string1,string2);
    }
}
