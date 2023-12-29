package com.app.helpers.actions;

import com.app.helpers.logging.ErrorLogger;
import com.app.helpers.logging.ILogger;
import com.app.helpers.logging.InfoLogger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class DriverActions {
    public WebDriver driver;
    public MouseActions mouseActions;
    public KeyboardActions keyBoardActions;
    public WindowActions windowActions;

    public DriverActions(WebDriver driver)
    {
        this.driver = driver;
        mouseActions = new MouseActions(driver);
        keyBoardActions = new KeyboardActions(driver);
        windowActions = new WindowActions(driver);
    }

    public DriverActions() {

    }

    public String GetText(WebElement element)
    {
        return WaitUntilElementVisibleAndClickable(element).getText();
    }

    public String GetAttributes(WebElement element, String attribute)
    {
        return WaitUntilElementVisibleAndClickable(element).getAttribute(attribute);
    }

    public boolean GetPresenceOfElement(WebElement element)
    {
        boolean result = WaitUntilElementVisibleAndClickable(element).isDisplayed();
        ILogger.PrintLog(new InfoLogger().LogMessage("Element '"+ element + "' is present"));
        return result;
    }

    public boolean GetVisibilityOfElement(WebElement element)
    {
        boolean result = false;
        try
        {
            result = WaitUntilElementVisibleAndClickable(element).isDisplayed();
        }
        catch(WebDriverException exp)
        {
            ILogger.PrintLog(new ErrorLogger().LogMessage("Element '"+ element + "' is not present"));
        }
        return result;
    }

    public List<String> GetText(List<WebElement> elements)
    {
        List<String> list = elements.stream().map(elt -> elt.getText()).toList();
        return list;
    }

    public WebElement WaitUntilElementVisibleAndClickable(WebElement element)
    {
        try {
            element = new WebDriverWait(driver, Duration.ofSeconds(15))
                    .until(ExpectedConditions.elementToBeClickable(element));
            ILogger.PrintLog(new InfoLogger().LogMessage("Element '"+ element + "' displayed"));
        }
        catch (TimeoutException exp) {
            ILogger.PrintLog(new ErrorLogger().LogMessage("Element '"+ element + "' not displayed"));
        }
        return element;
    }
}
