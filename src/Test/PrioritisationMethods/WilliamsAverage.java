package Test.PrioritisationMethods;

import App.TCP.DistanceMethods.NCD;
import App.Models.TestCase;
import App.Tool;
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
        Tool tcp = new Tool();
        ArrayList<ArrayList<Double>> table = Tool.createSimilarityMatrix(tcp, testData, fitnessFunctionToPass);
        App.TCP.PrioritisationMethods.WilliamsAverage.averageMethodPrioritisation(table, testData);
    }
}
