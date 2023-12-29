using Helpers.Actions;
using OpenQA.Selenium;

namespace Pages
{
    public sealed class BasePage
    {
        public DriverActions driverActions;
        private static Lazy<BasePage> GetBasePage = new Lazy<BasePage>(() => new BasePage());
        public static BasePage Base_Page 
        {
            get
            {
                return GetBasePage.Value;
            }
        }
        public IWebDriver driver;

        private BasePage() 
        {
        }

        public void SetWebDriver(IWebDriver _driver)
        {
            this.driver = _driver;
            driverActions = new DriverActions(driver);
        }

    }
}
