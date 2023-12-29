package com.app.helpers.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements IDriver{
    WebDriver driver;

    @Override
    public WebDriver GetDriver() {
        if(driver == null)
            SetDriver();

        return driver;
    }

    @Override
    public void SetDriver() {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        this.driver = new ChromeDriver(options);
    }

    @Override
    public void MaximizeDriver() {
        driver.manage().window().maximize();
    }

    @Override
    public void MinimizeDriver() {
        driver.manage().window().minimize();
    }

    @Override
    public void NavigateURL(String url) {
        driver.get(url);
    }

    @Override
    public void CloseDriver() {
        driver.close();
    }

    @Override
    public void QuitDriver() {
        if (driver != null)
            driver.quit();
    }
}
