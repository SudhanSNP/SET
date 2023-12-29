namespace CSharpPractice.ExtentionMethods
{
    public sealed class Logging
    {
        public string LogMessage;

        public void PrintLog(string message)
        {
            LogMessage += message;
            Console.WriteLine(LogMessage);
        }
    }
}
