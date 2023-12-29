package com.app.pages;

import com.app.helpers.actions.DriverActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private static BasePage Base_Page;
    private static LoginPage Login_Page;
    public static DriverActions driverActions;
    public static WebDriver driver;

    private LoginPage() {
    }

    public static LoginPage GetLoginPage() {
        if(Login_Page == null) {
            synchronized (LoginPage.class) {
                if(Login_Page == null)
                    Login_Page = new LoginPage();
            }
        }
        Base_Page = BasePage.GetBasePage();
        driverActions = Base_Page.driverActions;
        return Login_Page;
    }

    public LoginPage Init_Elements() {
        PageFactory.initElements(Base_Page.driver, this);
        return this;
    }

    @FindBy(css = ".orangehrm-login-branding img")
    private WebElement Logo;
    @FindBy(name = "username")
    private WebElement UserName;
    @FindBy(name = "password")
    private WebElement Password;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement Login;

    public boolean IsLogoPresent()
    {
        boolean isPresent = driverActions.GetPresenceOfElement(Logo);
        return isPresent;
    }

    public LoginPage WaitForPageLoad()
    {
        driverActions.WaitUntilElementVisibleAndClickable(Logo);
        return this;
    }

    public LoginPage EnterUsername(String username)
    {
        driverActions.WaitUntilElementVisibleAndClickable(UserName);
        driverActions.keyBoardActions.SendText(UserName, username);
        return this;
    }

    public LoginPage EnterPassword(String password)
    {
        driverActions.WaitUntilElementVisibleAndClickable(Password);
        driverActions.keyBoardActions.SendText(Password, password);
        return this;
    }

    public DashboardPage ClickLogin()
    {
        driverActions.WaitUntilElementVisibleAndClickable(Login);
        driverActions.mouseActions.ClickElement(Login);
        return DashboardPage.GetDashboardPage()
                .Init_Elements();
    }
}
