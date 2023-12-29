using Helpers.Configuration;
using Helpers.Drivers;
using Helpers.Reports;
using NUnit.Framework;
using OpenQA.Selenium;
using Pages;
using System.Reflection;
using TechTalk.SpecFlow;

namespace Tests.BDD.Hooks
{
    [Binding]
    public sealed class UITestsHook : SpecflowReport
    {
        protected IWebDriver driver;
        protected IDriver WebDriver;

        [BeforeScenario("@LoginTests")]
        public void BeforeScenarioLoginTests()
        {
            LaunchBrowser();
            NavigateToApp();
        }

        [BeforeScenario("@DashboardTests")]
        public void BeforeScenario()
        {
            LaunchBrowser();
            NavigateToApp();
        }

        [AfterScenario]
        public void AfterScenario()
        {
            WebDriver.CloseDriver();
            string path = $"{Directory.GetCurrentDirectory()}\\Reports\\Screenshots\\{TestContext.CurrentContext.Test.Name}.png";
            Console.WriteLine("Screenshot: " + path);
            ((ITakesScreenshot)driver).GetScreenshot()
                .SaveAsFile(path);
        }


        #region UtilityMethods

        private void LaunchBrowser()
        {
            WebDriver = GetBrowser();
            WebDriver.SetDriver();
            driver = WebDriver.GetDriver();
            WebDriver.MaximizeDriver();
        }

        private void NavigateToApp()
        {
            string host = GetHost();
            WebDriver.NavigateURL(host);
            BasePage.Base_Page.SetWebDriver(driver);
        }

        private IDriver GetBrowser()
        {

            Enum.TryParse(GetConfigurationValue("Browser"), out DriverType browser);
            return new DriverFactory(browser)
                .GetDriverType();
        }

        private string GetHost()
        {
            return GetConfigurationValue("Host");
        }

        protected string GetConfigurationValue(string key)
        {
            ConfigurationSetting.AssemblyPath = new Uri(Assembly.GetExecutingAssembly().CodeBase).AbsolutePath;
            return ConfigurationSetting.GetValue(key);
        }

        protected DashboardPage LoginUser()
        {
            LoginPage Login_Page = LoginPage.Login_Page;
            string Username = GetConfigurationValue("Username");
            string Password = GetConfigurationValue("Password");

            return Login_Page.EnterUsername(Username)
                .EnterPassword(Password)
                .ClickLogin()
                .WaitForPageLoad();
        }

        #endregion
    }
}