package com.app.helpers.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ApiTestsListeners implements ITestListener {
    private ExtentReports Report;
    private ExtentTest Test;

    public ApiTestsListeners() {
        Report = new ExtendReportManager()
                .ExtendReportProvider(System.getProperty("user.dir")+"\\Reports\\ExtentReportResults.html");
    }

    public void onTestStart(ITestResult result) {
        Test = Report.createTest(result.getTestClass().getName());
    }

    public void onTestSuccess(ITestResult result) {
        Test.log(Status.PASS, result.getName());
        Report.flush();
    }

    public void onTestFailure(ITestResult result) {
        Test.fail(result.getName());
        Report.flush();
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("On Test Skipped: " + result.getName());
    }
}
