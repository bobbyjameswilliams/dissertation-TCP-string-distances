package Test.DistanceMethods;

import org.junit.jupiter.api.Test;

import static App.DistanceMethods.Hamming.hammingDistance;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Hamming {
    @Test
    void hammingDistanceSameString() {
        String string1 = "bobby";
        String string2 = "bobby";
        double expectedScore = 0;
        double actualScore = hammingDistance(string1, string2);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void hammingDistanceKName() {
        String string1 = "KAROLIN";
        String string2 = "KATHRIN";
        double expectedScore = 3;
        double actualScore = hammingDistance(string1, string2);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void hammingDistanceBinary() {
        String string1 = "0000";
        String string2 = "1111";
        double expectedScore = 4;
        double actualScore = hammingDistance(string1, string2);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    /*
    Hamming distance using an example in `prioritising test cases with string distances`
     */
    void hammingDistanceExample1() {
        String string1 = "ab";
        String string2 = "abcde";
        double expectedScore = 3;
        double actualScore = hammingDistance(string1, string2);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    /*
    Hamming distance using an example in `prioritising test cases with string distances`
     */
    void hammingDistanceExample2() {
        String string1 = "abcd";
        String string2 = "abab";
        double expectedScore = 2;
        double actualScore = hammingDistance(string1, string2);
        assertEquals(expectedScore, actualScore);
    }
}
