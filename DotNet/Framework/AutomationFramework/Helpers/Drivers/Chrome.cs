using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Remote;

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
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.AddArgument("--disable-dev-shm-usage");
            chromeOptions.AddArgument("--no-sandbox");
//            chromeOptions.AddArgument("--headless");
            chromeOptions.AddArgument("ignore-certificate-errors");
            chromeOptions.PlatformName = "linux";
            this.driver = new RemoteWebDriver(new Uri("http://localhost:4444/wd/hub"), chromeOptions);
        }
    }
}
