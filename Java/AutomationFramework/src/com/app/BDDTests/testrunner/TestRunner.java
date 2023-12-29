package com.app.BDDTests.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {
        "src/com/app/BDDTests/LoginPageTests/features/UserLoginTest.feature"
},
        dryRun = true,
        glue = {
        "com.app.BDDTests.LoginPageTests.step_definitions.LoginPageSteps", "com.app.BDDTests.LoginPageTests.hooks"
}, plugin = {"pretty", "html:CucumberReports"},
        tags = "@LoginTests")
public class TestRunner extends AbstractTestNGCucumberTests {
}
