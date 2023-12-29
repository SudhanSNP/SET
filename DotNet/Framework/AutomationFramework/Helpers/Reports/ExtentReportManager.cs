﻿using AventStack.ExtentReports;
using AventStack.ExtentReports.Reporter;
using AventStack.ExtentReports.Reporter.Configuration;

namespace Helpers.Reports
{
    public class ExtentReportManager
    {
        private static string ReportPath;
        private static ExtentHtmlReporter ReportHelper;
        private static ExtentReports ExtentReport = new ExtentReports();
        private ExtentTest Test;

        public string GetReportPath()
        {
            return ReportPath;
        }

        private static void SetReportPath(string path)
        {
            ReportPath = path;
        }

        private static void SetReportHelper()
        {
            ReportHelper = new ExtentHtmlReporter(ReportPath);
            ReportHelper.Config.Theme = Theme.Dark;
            ReportHelper.Config.DocumentTitle = "Automation Report";
        }

        public ExtentHtmlReporter GetReportHelper()
        {
            return ReportHelper;
        }

        private static void AttachReport()
        {
            ExtentReport.AttachReporter(ReportHelper);
        }

        public static ExtentReports ExtendReportProvider(string url)
        {
            SetReportPath(url);
            SetReportHelper();
            AttachReport();

            return ExtentReport;
        }
    }
}
