package App.Models;


public class TestCase {

    private final int testID;
    private final String testData;
    private int order;

    public TestCase(int testID, String testData) {
        this.testID = testID;
        this.testData = testData;
        this.order = testID;
    }

    public int getTestID() {
        return testID;
    }

    public String getTestData() {
        return testData;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
