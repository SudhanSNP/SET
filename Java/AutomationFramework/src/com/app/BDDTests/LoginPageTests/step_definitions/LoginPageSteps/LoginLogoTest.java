package com.app.BDDTests.LoginPageTests.step_definitions.LoginPageSteps;

import com.app.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginLogoTest {
    LoginPage Login_Page;
    boolean isLogoPresent;
    @Given("I navigated to OrangeHRM portal")
    public void iNavigatedToOrangeHRMPortal() {
        Login_Page = LoginPage.GetLoginPage()
                .Init_Elements();
    }

    @When("Check for the logo image")
    public void checkForTheLogoImage() {
        isLogoPresent = Login_Page.IsLogoPresent();
    }

    @Then("The logo should be present")
    public void theLogoShouldBePresent() {
        Assert.assertEquals(isLogoPresent, true);
    }
}
