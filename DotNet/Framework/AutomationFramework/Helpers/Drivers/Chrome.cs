using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;

namespace Helpers.Drivers
{
    public class Chrome : IDriver
    {
        IWebDriver driver;

        public void CloseDriver()
        {
            driver.Quit();
        }

        public IWebDriver GetDriver()
        {
            if (driver == null)
                SetDriver();

            return driver;
        }

        public void MaximizeDriver()
        {
            driver.Manage().Window.Maximize();
        }

        public void MinimizeDriver()
        {
            driver.Manage().Window.Minimize();
        }

        public void NavigateURL(string url)
        {
            driver.Navigate().GoToUrl(url);
        }

        public void SetDriver()
        {
            this.driver = new ChromeDriver();
        }
    }
}
