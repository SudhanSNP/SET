using OpenQA.Selenium;
using Helpers.Logging;

namespace Helpers.Actions
{
    public class KeyBoardActions
    {
        IWebDriver driver;

        public KeyBoardActions(IWebDriver driver)
        {
            this.driver = driver;
        }

        public void SendText(By selector, string text)
        {
            ClearText(selector);
            driver.FindElement(selector).SendKeys(text);
            Logger.PrintLog(new InfoLogger().LogMessage($"Entered the '{text}' to the element '{selector}'"));
        }

        public void ClearText(By selector)
        {
            driver.FindElement(selector).Clear();
            Logger.PrintLog(new InfoLogger().LogMessage($"Cleared the values inside the element '{selector}'"));
        }
    }
}
