package Test.PrioritisationMethods;

import App.DistanceMethods.NCD;
import App.Models.TestCase;
import App.TCP;
import Test.UtilsTest.Data.UtilsTestData;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;

public class WilliamsAverage {
    @Test
    void testAverageFitnessFunction() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Map<Integer, TestCase> testData = UtilsTestData.getCorrectlyParsedExampleTestSuite();

        Method fitnessFunctionToPass = NCD.class.getMethod("NCDistance", String.class, String.class);
        TCP tcp = new TCP();
        ArrayList<ArrayList<Double>> table = TCP.createSimilarityMatrix(tcp, testData, fitnessFunctionToPass);
        App.PrioritisationMethods.WilliamsAverage.averageMethodPrioritisation(table, testData);
    }
}
