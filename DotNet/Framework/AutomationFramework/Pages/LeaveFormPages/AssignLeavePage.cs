using Helpers.Actions;
using OpenQA.Selenium;

namespace Pages.LeaveFormPages
{
    public sealed class AssignLeavePage
    {
        private static Lazy<AssignLeavePage> GetAssignLeavePage = new Lazy<AssignLeavePage>(() => new AssignLeavePage());
        private static BasePage Base_Page;
        public static AssignLeavePage AssignLeave_Page { get 
            {
                Base_Page = BasePage.Base_Page;
                driverActions = Base_Page.driverActions;
                return GetAssignLeavePage.Value; 
            } 
        }
        private static DriverActions driverActions;

        private AssignLeavePage() 
        {
            Base_Page = BasePage.Base_Page;
            driverActions = Base_Page.driverActions;
        }

        #region Locators

        private By EmployeeName = By.CssSelector("input[placeholder='Type for hints...']");
        private By LeaveType = By.CssSelector(".oxd-select-text-input");
        private By LeaveOption = By.XPath("//*[text()='US - Personal']");
        private By From = By.XPath("//label[text()='From Date']/following::input[1]");
        private By To = By.XPath("//label[text()='To Date']/following::input[1]");
        private By Assign = By.CssSelector("button[type='submit']");
        private By LeaveList = By.XPath("//a[text()='Leave List']");

        #endregion

        #region Actions

        public AssignLeavePage EnterEmployeeName(string employeeName)
        {
            driverActions.WaitUntilElementClickable(EmployeeName);
            driverActions.keyBoardActions.SendText(EmployeeName, employeeName);
            driverActions.WaitUntilElementClickable(By.XPath($"//*[contains(text(), '{employeeName}')]"));
            driverActions.mouseActions.ClickElement(By.XPath($"//*[contains(text(), '{employeeName}')]"));
            return this;
        }

        public AssignLeavePage EnterLeaveType(string leaveType) 
        {
            driverActions.WaitUntilElementClickable(LeaveType);
            driverActions.mouseActions.ClickElement(LeaveType);
            driverActions.WaitUntilElementClickable(By.XPath($"//*[contains(text(), '{leaveType}')]"));
            driverActions.mouseActions.ClickElement(By.XPath($"//*[contains(text(), '{leaveType}')]"));
            return this;
        }

        public AssignLeavePage SetFromDate(string fromDate) 
        {
            driverActions.WaitUntilElementClickable(From);
            driverActions.keyBoardActions.SendText(From, fromDate);
            return this;
        }

        public AssignLeavePage SetToDate(string toDate)
        {
            driverActions.WaitUntilElementClickable(To);
            driverActions.keyBoardActions.SendText(To, toDate);
            return this;
        }

        public AssignLeavePage ClickAssign()
        {
            driverActions.WaitUntilElementClickable(Assign);
            driverActions.mouseActions.ClickElement(Assign);
            return this;
        }

        public LeaveListPage ClickLeaveList()
        {
            driverActions.WaitUntilElementClickable(LeaveList);
            driverActions.mouseActions.ClickElement(LeaveList);
            return LeaveListPage.LeaveList_Page;
        }

        #endregion
    }
}
