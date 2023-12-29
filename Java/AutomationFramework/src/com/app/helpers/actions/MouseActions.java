package com.app.helpers.actions;

import com.app.helpers.logging.ILogger;
import com.app.helpers.logging.InfoLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
    Actions actions;
    WebDriver driver;

    MouseActions(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
    }

    public void ClickElement(WebElement element) {
        MoveToElement(element);
        element.click();
        ILogger.PrintLog(new InfoLogger().LogMessage("Clicked on the element '" + element + "'"));
    }

    public void MoveToElement(WebElement element) {
        actions.moveToElement(element)
                .perform();
        ILogger.PrintLog(new InfoLogger().LogMessage("Moved to the element '" + element + "'"));
    }

    public void MouseHover(WebElement element) {
        MoveToElement(element);
        ILogger.PrintLog(new InfoLogger().LogMessage("Mouse hovered on the element '" + element + "'"));
    }

    public void RightClickElement(WebElement element) {
        MoveToElement(element);
        actions.contextClick()
                .perform();
        ILogger.PrintLog(new InfoLogger().LogMessage("Right clicked on the element '" + element + "'"));
    }
}
