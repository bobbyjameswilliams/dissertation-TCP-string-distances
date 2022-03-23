package Test;

import org.junit.jupiter.api.Test;
import App.TCP;

import static org.junit.jupiter.api.Assertions.*;

class TCPTest {
    @Test
    void main() {
    }

    //TESTS FOR hammingDistance()

    @Test
    void hammingDistanceNumbers(){
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
    void calculateStringDistance(){
    }

    @Test
    void prioritiseTestCases(){
    }

    @Test
    void manhattanDistance(){
    }
}