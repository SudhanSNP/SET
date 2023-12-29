using OpenQA.Selenium;
using Helpers.Logging;

namespace Helpers.Actions
{
    public class MouseActions
    {
        OpenQA.Selenium.Interactions.Actions Action;
        IWebDriver driver;

        public MouseActions(IWebDriver driver)
        {
            this.driver = driver;
        }

        public void ClickElement(By selector)
        {
            MoveToElement(selector);
            driver.FindElement(selector).Click();
            Logger.PrintLog(new InfoLogger().LogMessage($"Clicked on the element '{selector}'"));
        }

        protected void MoveToElement(By selector)
        {
            Action = new OpenQA.Selenium.Interactions.Actions(driver);
            Action.MoveToElement(driver.FindElement(selector))
                .Perform();
            Logger.PrintLog(new InfoLogger().LogMessage($"Moved to the element '{selector}'"));
        }

        public void MouseHover(By selector)
        {
            MoveToElement(selector);
            Logger.PrintLog(new InfoLogger().LogMessage($"Mouse hovered on the element '{selector}'"));
        }

        public void RightClick(By selector)
        {
            MoveToElement(selector);
            Action = new OpenQA.Selenium.Interactions.Actions(driver);
            Action.ContextClick(driver.FindElement(selector))
                .Perform();
            Logger.PrintLog(new InfoLogger().LogMessage($"Right clicked on the element '{selector}'"));
        }
    }
}
