package DesignPatternTests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test execution started from -> " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test execution finished from -> " + context.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test execution passed -> " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test execution failed -> " + result.getName());
    }
}
