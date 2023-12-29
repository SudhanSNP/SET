package com.app.BDDTests.LoginPageTests.hooks;

import com.app.helpers.drivers.DriverFactory;
import com.app.helpers.drivers.DriverType;
import com.app.helpers.drivers.IDriver;
import com.app.helpers.properties.PropertiesReader;
import com.app.pages.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class LoginTestsHook {
    protected WebDriver driver;
    protected IDriver WebDriver;

    @Before("@LoginTests")
    public void BeforeScenario() throws Exception {
        LaunchBrowser();
        NavigateToApp();
    }

    @After
    public void AfterScenario() {
        WebDriver.CloseDriver();
        WebDriver.QuitDriver();
    }

    private void LaunchBrowser() throws Exception {
        WebDriver = GetBrowser();
        WebDriver.SetDriver();
        driver = WebDriver.GetDriver();
        WebDriver.MaximizeDriver();
    }

    private void NavigateToApp()
    {
        String host = GetProperty("host");
        WebDriver.NavigateURL(host);
        BasePage.GetBasePage()
                .SetWebDriver(driver);
    }

    private IDriver GetBrowser() throws Exception {
        DriverType browser = DriverType.valueOf(GetProperty("browser"));
        return new DriverFactory(browser)
                .GetDriverType();
    }

    protected String GetProperty(String key) {
        String path = System.getProperty("user.dir") + "\\src\\com\\app\\UITests\\app.properties";
        PropertiesReader propertiesReader = new PropertiesReader(path);
        return propertiesReader.GetValue(key);
    }
}
