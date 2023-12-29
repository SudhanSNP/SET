package com.app.BDDTests.LoginPageTests.step_definitions.LoginPageSteps;

import com.app.pages.DashboardPage;
import com.app.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class UserLoginTest {
    LoginPage Login_Page;
    DashboardPage Dashboard_Page;
    boolean isLogoPresent;
    @Given("I navigated to OrangeHRM login")
    public void iNavigatedToOrangeHRMLogin() {
        Login_Page = LoginPage.GetLoginPage()
                .Init_Elements();
    }

    @When("Enter the Username and Password in the login form {string} and {string}")
    public void enterTheUsernameAndPasswordInTheLoginFormUsernameAndPassword(String username, String password) {
        Dashboard_Page = Login_Page.EnterUsername(username)
                .EnterPassword(password)
                .ClickLogin();
    }

    @Then("The logo should be present in the Dashboard page")
    public void theLogoShouldBePresentInTheDashboardPage() {
        isLogoPresent = Dashboard_Page.IsLogoPresent();

        Assert.assertEquals(isLogoPresent, true);
    }
}
