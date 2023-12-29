using Helpers.Actions;
using OpenQA.Selenium;

namespace Pages.LeaveFormPages
{
    public sealed class LeaveListPage
    {
        private static Lazy<LeaveListPage> GetLeaveListPage = new Lazy<LeaveListPage>(() => new LeaveListPage());
        private static BasePage Base_Page;
        private static DriverActions driverActions;
        public static LeaveListPage LeaveList_Page { get 
            {
                Base_Page = BasePage.Base_Page;
                driverActions = Base_Page.driverActions;
                return GetLeaveListPage.Value; 
            } 
        }

        private LeaveListPage() 
        {
        }

        #region Locators

        private By EmployeeName = By.CssSelector("input[placeholder='Type for hints...']");
        private By Search = By.CssSelector("button[type='submit']");
        private By LeaveStatus = By.XPath("//label[text() = 'Show Leave with Status']/following::div[contains(@class,'oxd-select-text')][1]");

        #endregion

        #region Actions

        public LeaveListPage EnterEmployeeName(string employeeName)
        {
            driverActions.WaitUntilElementClickable(EmployeeName);
            driverActions.keyBoardActions.SendText(EmployeeName, employeeName);
            driverActions.WaitUntilElementClickable(By.XPath($"//*[contains(text(), '{employeeName}')]"));
            driverActions.mouseActions.ClickElement(By.XPath($"//*[contains(text(), '{employeeName}')]"));
            return this;
        }

        public LeaveListPage SelectLeaveStatus(string leaveStatus)
        {
            
            if(!driverActions.GetVisibilityOfElement(By.XPath($"//span[contains(@class, 'oxd-chip') and contains(text(),'{leaveStatus}')]")))
            {
                driverActions.WaitUntilElementClickable(LeaveStatus);
                driverActions.mouseActions.ClickElement(LeaveStatus);
                driverActions.WaitUntilElementClickable(By.XPath($"//*[contains(text(), '{leaveStatus}')]"));
                driverActions.mouseActions.ClickElement(By.XPath($"//*[contains(text(), '{leaveStatus}')]"));
            }
            return this;
        }

        public LeaveListPage ClickSearch()
        {
            driverActions.WaitUntilElementClickable(Search);
            driverActions.mouseActions.ClickElement(Search);
            return this;
        }

        public LeaveListPage GetSearchRowCount(out int rowCount)
        {
            driverActions.WaitUntilElementClickable(By.CssSelector(".oxd-table-row"));
            rowCount = driverActions.driver.FindElements(By.CssSelector(".oxd-table-row")).Count();
            return this;
        }

        #endregion
    }
}
