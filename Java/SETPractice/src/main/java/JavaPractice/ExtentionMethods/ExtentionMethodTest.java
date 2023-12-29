package JavaPractice.ExtentionMethods;

public class ExtentionMethodTest {
    public static void main(String[] args) {
        Logging log = new Logging();
        InfoLogging.InfoLog(log)
                .PrintLog("This is my info log");

        InfoLogging.InfoLog(log)
                .PrintLog("This is my another info log");

        ErrorLogging.ErrorLog(log)
                .PrintLog("This is error log");

    }
}
