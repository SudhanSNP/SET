package com.app.helpers.actions;

import org.openqa.selenium.WebDriver;

public class WindowActions {
    WebDriver driver;

    WindowActions(WebDriver driver)
    {
        this.driver = driver;
    }

    public String CurrentWindow()
    {
        return driver.getWindowHandle();
    }

    public void SwitchWindow()
    {
        for(String win: driver.getWindowHandles())
        {
            driver.switchTo().window(win);
        }
    }

    public void SwitchWindowByName(String window)
    {
        driver.switchTo().window(window);
    }
}
