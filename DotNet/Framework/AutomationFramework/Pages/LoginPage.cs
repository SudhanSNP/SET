using Helpers.Actions;
using OpenQA.Selenium;

namespace Pages
{
    public sealed class LoginPage
    {
        private static Lazy<LoginPage> GetLoginPage = new Lazy<LoginPage>(() => new LoginPage());
        private static BasePage Base_Page;
        private static DriverActions driverActions;
        public static LoginPage Login_Page { get 
            {
                Base_Page = BasePage.Base_Page;
                driverActions = Base_Page.driverActions;
                return GetLoginPage.Value;  
            } 
        }

        private LoginPage() 
        {
        }

        #region Locators

        private By Logo = By.CssSelector(".orangehrm-login-branding img");
        private By UserName = By.Name("username");
        private By Password = By.Name("password");
        private By Login = By.XPath("//button[@type='submit']");

        #endregion

        
        #region Actions

        public LoginPage IsLogoPresent(out bool isPresent)
        {
            isPresent = driverActions.GetPresenceOfElement(Logo);
            return this;
        }

        public LoginPage WaitForPageLoad()
        {
            driverActions.WaitUntilElementClickable(Logo);
            return this;
        }

        public LoginPage EnterUsername(string username)
        {
            driverActions.WaitUntilElementDisplayed(UserName);
            driverActions.keyBoardActions.SendText(UserName, username);
            return this;
        }

        public LoginPage EnterPassword(string password)
        {
            driverActions.WaitUntilElementDisplayed(Password);
            driverActions.keyBoardActions.SendText(Password, password);
            return this;
        }

        public DashboardPage ClickLogin()
        {
            driverActions.WaitUntilElementClickable(Login);
            driverActions.mouseActions.ClickElement(Login);
            return DashboardPage.Dashboard_Page;
        }

        #endregion
    }
}
