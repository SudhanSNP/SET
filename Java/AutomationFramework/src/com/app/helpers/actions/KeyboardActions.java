package com.app.helpers.actions;

import com.app.helpers.logging.ILogger;
import com.app.helpers.logging.InfoLogger;
import com.aventstack.extentreports.model.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyboardActions {
    WebDriver driver;

    KeyboardActions(WebDriver driver) {
        this.driver = driver;
    }

    public void SendText(WebElement element, String text) {
        element.sendKeys(text);
        ILogger.PrintLog(new InfoLogger().LogMessage("Entered the '"+text+ "' to '" + element + "'"));
    }

    public void ClearText(WebElement element) {
        element.clear();
        ILogger.PrintLog(new InfoLogger().LogMessage("Cleared the value from '" + element + "'"));
    }
}
