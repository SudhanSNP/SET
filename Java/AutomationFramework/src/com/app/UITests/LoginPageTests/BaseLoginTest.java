package com.app.UITests.LoginPageTests;

import com.app.helpers.drivers.DriverFactory;
import com.app.helpers.drivers.DriverType;
import com.app.helpers.drivers.IDriver;
import com.app.helpers.properties.PropertiesReader;
import com.app.helpers.reports.UITestsListeners;
import com.app.pages.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Listeners(UITestsListeners.class)
public class BaseLoginTest {
    protected WebDriver driver;
    protected IDriver WebDriver;

    @BeforeClass
    void OneTimeSetUp() throws Exception {
        LaunchBrowser();
        NavigateToApp();
    }

    @AfterMethod
    void TakeScreenshot(ITestResult result) throws IOException {
        if(!result.isSuccess()) {
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Path source = Paths.get(file.getPath());
            Path destination = Paths.get(System.getProperty("user.dir")+"//screenshots//"+ result.getName() + ".png");
            Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);
        }
    }

    @AfterClass
    void OneTimeTearDown() {
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
