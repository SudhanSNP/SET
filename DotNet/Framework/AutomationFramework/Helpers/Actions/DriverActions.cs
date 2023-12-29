using OpenQA.Selenium;
using OpenQA.Selenium.Support.UI;
using Helpers.Logging;
using SeleniumExtras.WaitHelpers;

namespace Helpers.Actions
{
    public class DriverActions
    {
        public IWebDriver driver { get; set; }
        public MouseActions mouseActions;
        public KeyBoardActions keyBoardActions;
        public WindowActions windowActions;

        public DriverActions(IWebDriver driver)
        {
            this.driver = driver;
            mouseActions = new MouseActions(driver);
            keyBoardActions = new KeyBoardActions(driver);
            windowActions = new WindowActions(driver);
        }

        public string GetText(By selector)
        {
            return WaitUntilElementDisplayed(selector).Text;
        }

        public string GetAttributes(By selector, string attribute)
        {
            return WaitUntilElementDisplayed(selector).GetAttribute(attribute);
        }

        public bool GetPresenceOfElement(By selector)
        {
            bool result = WaitUntilElementDisplayed(selector).Displayed;
            Logger.PrintLog(new InfoLogger().LogMessage($"Element '{selector}' is present"));
            return result;
        }

        public bool GetVisibilityOfElement(By selector)
        {
            bool result = false;
            try
            {
                result = WaitUntilElementDisplayed(selector).Displayed;
                Logger.PrintLog(new InfoLogger().LogMessage($"Element '{selector}' is present"));
            }
            catch(WebDriverTimeoutException exp)
            {
                Logger.PrintLog(new ErrorLogger().LogMessage($"Element '{selector}' is not present"));
            }
            return result;
        }

        public void GetText(By selector, out List<string> list)
        {
            WaitUntilElementDisplayed(selector);
            list = driver.FindElements(selector)
                .Select(e => e.Text).ToList();
        }

        public void GetAttributes(By selector, string attribute, out List<string> list)
        {
            WaitUntilElementDisplayed(selector);
            list = driver.FindElements(selector)
                .Select(e => e.GetAttribute(attribute)).ToList();
        }

        public virtual IWebElement WaitUntilElementDisplayed(By selector)
        {
            WebDriverWait wait = new(driver, new TimeSpan(0, 0, 15));
            IWebElement element = wait.Until(ExpectedConditions.ElementIsVisible(selector));
            Logger.PrintLog(new InfoLogger().LogMessage($"Element '{selector}' displayed"));
            return element;
        }

        public virtual IWebElement WaitUntilElementClickable(By selector)
        {
            WebDriverWait wait = new(driver, new TimeSpan(0, 0, 15));
            IWebElement element = wait.Until(ExpectedConditions.ElementToBeClickable(selector));
            Logger.PrintLog(new InfoLogger().LogMessage($"Element '{selector}' displayed"));
            return element;
        }
    }
}
