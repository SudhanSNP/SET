
namespace CSharpPractice.ExtentionMethods
{
    public static class InfoLogging
    {
        public static void InfoLog(this Logging log)
        {
            log.LogMessage = "INFO: ";
        }
    }
}
