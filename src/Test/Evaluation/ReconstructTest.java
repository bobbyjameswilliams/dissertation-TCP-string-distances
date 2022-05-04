package Test.Evaluation;

import org.junit.jupiter.api.Test;
import App.Evaluation.Reconstruct;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReconstructTest {
    @Test
    void testGenerateHeaderFile(){
        String expectedResult = "package org.apache.commons.cli;\n\n"
                + "import org.junit.runner.RunWith;\n"
                + "import org.junit.runners.Suite;\n\n"
                + "@RunWith(Suite.class)\n"
                + "@Suite.SuiteClasses({ RegressionTest0.class, RegressionTest1.class, RegressionTest2.class, RegressionTest3.class })\n"
                + "public class RegressionTest {\n"
                + "}\n\n";
        String actualResult = Reconstruct.generateHeaderFileJacksonCore(4);
        assertEquals(expectedResult,actualResult);
    }
}
