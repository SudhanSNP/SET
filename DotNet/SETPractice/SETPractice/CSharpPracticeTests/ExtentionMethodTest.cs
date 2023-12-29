using CSharpPractice.ExtentionMethods;
using NUnit.Framework;

namespace SETPractice.CSharpPracticeTests
{
    [TestFixture]
    public class ExtentionMethodTest
    {
        [Test]
        public void ExtentionMtdTest()
        {
            Logging log = new Logging();
            log.InfoLog();
            log.PrintLog("This is info log");
            log.InfoLog();
            log.PrintLog("This is another info log");

            InfoLogging.InfoLog(log);
            log.PrintLog("");
        }
    }
}
