package JavaPractice.ExtentionMethods;

public class ErrorLogging {
    public static Logging ErrorLog(Logging log) {
        log.LogMessage = "ERROR: ";
        return log;
    }
}
