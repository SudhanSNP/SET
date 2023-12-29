using Helpers.Actions;
using OpenQA.Selenium;
using Pages.LeaveFormPages;

namespace Pages
{
    public sealed class LeavePage
    {
        private static Lazy<LeavePage> GetLeavePage = new Lazy<LeavePage>(() => new LeavePage());
        private static BasePage Base_Page;
        private static DriverActions driverActions;
        public static LeavePage Leave_Page { get 
            {
                Base_Page = BasePage.Base_Page;
                driverActions = Base_Page.driverActions;
                return GetLeavePage.Value; 
            }
        }

        private LeavePage()
        {
        }

        #region Locators

        private By Header = By.CssSelector(".oxd-topbar h6");
        private By AssignLeave = By.XPath("//a[text()='Assign Leave']");

        #endregion

        #region Actions

        public LeavePage WaitForPageLoad()
        {
            driverActions.WaitUntilElementClickable(Header);
            return this;
        }

        public LeavePage GetHeaderText(out string header)
        {
            header = driverActions.GetText(Header);
            return this;
        }

        public AssignLeavePage GoToAssignLeave()
        {
            driverActions.WaitUntilElementClickable(AssignLeave); 
            driverActions.mouseActions.ClickElement(AssignLeave);
            return AssignLeavePage.AssignLeave_Page;
        }

        #endregion
    }
}
