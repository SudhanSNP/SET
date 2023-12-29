package JavaPractice.ExtentionMethods;

public class Logging {
    public String LogMessage;

    public void PrintLog(String message) {
        LogMessage += message;
        System.out.println(LogMessage);
    }
}
