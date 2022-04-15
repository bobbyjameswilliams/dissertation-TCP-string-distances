package App.Models;


public class TestCase {

    private final int testID;
    private final String testData;
    private int order;
    private double averageScore;

    public TestCase(int testID, String testData){
        this.testID = testID;
        this.testData = testData;
        this.order = testID;
    }

    public TestCase(int testID, String testData, double averageScore){
        this.testID = testID;
        this.testData = testData;
        this.order = testID;
        this.averageScore = averageScore;
    }

    public int getTestID(){
        return  testID;
    }

    public String getTestData(){
        return testData;
    }

    public int getOrder(){
        return order;
    }

    public double getAverageScore(){
        return averageScore;
    }

    public void setOrder(int order){
        this.order = order;
    }

    public void setAverageScore(int averageScore){
        this.averageScore = averageScore;
    }
}
