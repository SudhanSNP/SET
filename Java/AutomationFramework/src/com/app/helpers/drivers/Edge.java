package com.app.helpers.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge implements IDriver{
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
        System.setProperty("webdriver.edge.driver", path + "\\drivers\\msedgedriver.exe");

        this.driver = new EdgeDriver();
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
    public void CloseDriver() { driver.close(); }

    @Override
    public void QuitDriver() { driver.quit(); }
}
