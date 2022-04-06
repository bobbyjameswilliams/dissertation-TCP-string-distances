package Test;

import org.junit.jupiter.api.Test;
import App.TCP;

import static org.junit.jupiter.api.Assertions.*;

class TCPTest {
    @Test
    void main() {
    }

    //################ TESTS FOR hammingDistance() ##########################
    @Test
    void hammingDistanceSameString(){
        String string1 = "bobby";
        String string2 = "bobby";
        int expectedScore = 0;
        int actualScore = TCP.hammingDistance(string1, string2);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void hammingDistanceKName(){
        String string1 = "KAROLIN";
        String string2 = "KATHRIN";
        int expectedScore = 3;
        int actualScore = TCP.hammingDistance(string1, string2);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void hammingDistanceBinary(){
        String string1 = "0000";
        String string2 = "1111";
        int expectedScore = 4;
        int actualScore = TCP.hammingDistance(string1, string2);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    /*
    Hamming distance using an example in `prioritising test cases with string distances`
     */
    void hammingDistanceExample1(){
        String string1 = "ab";
        String string2 = "abcde";
        int expectedScore = 3;
        int actualScore = TCP.hammingDistance(string1, string2);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    /*
    Hamming distance using an example in `prioritising test cases with string distances`
     */
    void hammingDistanceExample2(){
        String string1 = "abcd";
        String string2 = "abab";
        int expectedScore = 2;
        int actualScore = TCP.hammingDistance(string1, string2);
        assertEquals(expectedScore, actualScore);
    };

    //###################### TESTS FOR NCDistance() #######################

    @Test
    void NCDistanceSameString(){
        String string1 = "bobby";
        String string2 = "bobby";
        int expectedScore = 0;
        int actualScore = TCP.NCDistance(string1, string2);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void calculateStringDistance(){
    }

    @Test
    void prioritiseTestCases(){
    }


    //################  TESTS FOR manhattanDistance() ###########
    @Test
    void manhattanDistance(){
    }
}