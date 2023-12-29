using Helpers.Actions;
using OpenQA.Selenium;

namespace Pages
{
    public sealed class DashboardPage
    {
        private static Lazy<DashboardPage> GetDashboardPage = new Lazy<DashboardPage>(() => new DashboardPage());
        private static BasePage Base_Page;
        private static DriverActions driverActions;
        public static DashboardPage Dashboard_Page { get 
            {
                Base_Page = BasePage.Base_Page;
                driverActions = Base_Page.driverActions;
                return GetDashboardPage.Value; 
            } 
        }

        public DashboardPage()
        {
        }

        #region Locators

        private By Logo = By.CssSelector(".oxd-brand-banner img");
        private By Header = By.CssSelector(".oxd-topbar h6");
        private By MenuList = By.CssSelector(".oxd-main-menu-item span");
        private By ActiveMenu = By.XPath("//a[@class='oxd-main-menu-item active']/span");
        private By LeaveMenu = By.XPath("//span[text()='Leave']");

        #endregion

        #region Actions

        public DashboardPage IsLogoPresent(out bool isPresent)
        {
            isPresent = driverActions.GetPresenceOfElement(Logo);
            return this;
        }

        public DashboardPage WaitForPageLoad()
        {
            driverActions.WaitUntilElementClickable(Logo);
            return this;
        }

        public DashboardPage GetHeaderText(out string header)
        {
            header = driverActions.GetText(Header);
            return this;
        }

        public DashboardPage GetActiveMenuText(out string activeMenu)
        {
            activeMenu = driverActions.GetText(ActiveMenu);
            return this;
        }

        public DashboardPage GetMenuList(out List<string> menuList)
        {
            driverActions.GetText(MenuList, out menuList);
            return this;
        }

        public DashboardPage GetPresenceMenu(string menu, out bool isPresent)
        {
            driverActions.GetText(MenuList, out List<string> menuList);
            isPresent = menuList.Contains(menu);
            return this;
        }

        public LeavePage GoToLeavePage()
        {
            driverActions.WaitUntilElementClickable(LeaveMenu);
            driverActions.mouseActions.ClickElement(LeaveMenu);
            return LeavePage.Leave_Page;
        }

        #endregion
    }
}
