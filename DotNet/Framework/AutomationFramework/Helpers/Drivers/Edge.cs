using OpenQA.Selenium;
using OpenQA.Selenium.Edge;

namespace Helpers.Drivers
{
    public class Edge : IDriver
    {
        IWebDriver driver;

        public Edge()
        {
        }
        public void CloseDriver()
        {
            driver.Close();
            driver.Quit();
        }

        public IWebDriver GetDriver()
        {
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
            this.driver = new EdgeDriver();
        }
    }
}
