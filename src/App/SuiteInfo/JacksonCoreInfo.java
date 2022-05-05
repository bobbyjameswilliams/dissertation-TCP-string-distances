package App.SuiteInfo;

public class JacksonCoreInfo{
    //private static String rootName = "JacksonCore-1b-600";
    private static String rootName = "Chart-1b-600";
    //private static String fileStructure = "/JacksonCore/randoop/1/JacksonCore-1b-randoop.1/com/fasterxml/jackson/core/util/";
    private static String fileStructure = "/Chart/randoop/1/Chart-1b-randoop.1/org/jfree/chart/renderer/category/";

    public static String getRootName(){
        return rootName;
    }

    public static String getFileStructure(){
        return fileStructure;
    }
}
