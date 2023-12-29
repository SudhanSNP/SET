using AventStack.ExtentReports;
using NUnit.Framework;
using TechTalk.SpecFlow;

namespace Helpers.Reports
{
    [Binding]
    public class SpecflowReport
    {
        private static ExtentReports Report = ExtentReportManager.ExtendReportProvider($"{Directory.GetCurrentDirectory()}\\Reports\\{ScenarioContext.Current.ScenarioInfo.Title.Replace(" ", "_")}");
        private ExtentTest Test;

        [BeforeScenario]
        public void TestReport()
        {
            var Info = FeatureContext.Current.FeatureInfo;
            Test = Report.CreateTest(ScenarioContext.Current.ScenarioInfo.Title);
            Test.Log(Status.Info, "Starting the Reporting");
        }

        [AfterScenario]
        public void ReportTearDown()
        {
            if (ScenarioContext.Current.ScenarioExecutionStatus == ScenarioExecutionStatus.TestError)
                Test.Fail(ScenarioContext.Current.TestError.Message);
            else if (ScenarioContext.Current.ScenarioExecutionStatus == ScenarioExecutionStatus.OK)
                Test.Pass("Test Passed!");
            else
                Test.Skip("Test Case Skipped!");

            string path = $"{Directory.GetCurrentDirectory()}\\Reports\\Screenshots\\{TestContext.CurrentContext.Test.Name}.png";
            Test.Info("Screenshot: ", MediaEntityBuilder.CreateScreenCaptureFromPath(path).Build());
            Report.Flush();
        }
    }
}
