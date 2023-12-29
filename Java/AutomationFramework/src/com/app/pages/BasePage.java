package com.app.pages;

import com.app.helpers.actions.DriverActions;
import org.openqa.selenium.WebDriver;

public class BasePage {
    private static BasePage Base_Page;
    public DriverActions driverActions;
    public WebDriver driver;

    private BasePage() {}

    public static BasePage GetBasePage() {
        if(Base_Page == null) {
            synchronized (BasePage.class) {
                if(Base_Page == null)
                    Base_Page = new BasePage();
            }
        }
        return Base_Page;
    }

    public void SetWebDriver(WebDriver _driver)
    {
        this.driver = _driver;
        this.driverActions = new DriverActions(driver);
    }
}
