package com.app.helpers.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportManager {
    private String ReportPath;
    private ExtentReports ExtentReport;
    private ExtentSparkReporter ReportHelper;
    private ExtentTest Test;

    public ExtendReportManager() {
         ExtentReport= new ExtentReports();
    }

    public String GetReportPath()
    {
        return ReportPath;
    }

    private void SetReportPath(String path)
    {
        ReportPath = path;
    }

    private void SetReportHelper() {
        ReportHelper = new ExtentSparkReporter(ReportPath);
        ReportHelper.config().setTheme(Theme.DARK);
        ReportHelper.config().setDocumentTitle("Automation Report");
    }

    public ExtentSparkReporter GetReportHelper()
    {
        return ReportHelper;
    }

    private void AttachReport()
    {
        ExtentReport.attachReporter(ReportHelper);
    }

    public ExtentReports ExtendReportProvider(String url)
    {
        SetReportPath(url);
        SetReportHelper();
        AttachReport();

        return ExtentReport;
    }
}
