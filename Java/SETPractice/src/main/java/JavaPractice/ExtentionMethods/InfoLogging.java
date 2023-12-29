package JavaPractice.ExtentionMethods;

public class InfoLogging {
    public static Logging InfoLog(Logging log) {
        log.LogMessage = "INFO: ";
        return log;
    }
}
