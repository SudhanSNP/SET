package com.app.pages;

import com.app.helpers.actions.DriverActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage{
    private static BasePage Base_Page;
    private static DashboardPage Dashboard_Page;
    public static DriverActions driverActions;
    public static WebDriver driver;

    private DashboardPage() {
    }

    public static DashboardPage GetDashboardPage() {
        if(Dashboard_Page == null) {
            synchronized (LoginPage.class) {
                if(Dashboard_Page == null)
                    Dashboard_Page = new DashboardPage();
            }
        }
        Base_Page = BasePage.GetBasePage();
        driverActions = Base_Page.driverActions;
        return Dashboard_Page;
    }

    public DashboardPage Init_Elements() {

        PageFactory.initElements(Base_Page.driver, this);
        return this;
    }

    @FindBy(css = ".oxd-brand-banner img")
    private WebElement Logo;
    @FindBy(css = ".oxd-topbar h6")
    private WebElement Header;
    @FindBy(css = ".oxd-main-menu-item span")
    private List<WebElement> MenuList;
    @FindBy(xpath = "//a[@class='oxd-main-menu-item active']/span")
    private WebElement ActiveMenu;
    @FindBy(xpath = "//span[text()='Leave']")
    private WebElement LeaveMenu;

    public boolean IsLogoPresent()
    {
        boolean isPresent = driverActions.GetPresenceOfElement(Logo);
        return isPresent;
    }

    public DashboardPage WaitForPageLoad()
    {
        driverActions.WaitUntilElementVisibleAndClickable(Logo);
        return this;
    }

    public String GetHeaderText()
    {
        String header = driverActions.GetText(Header);
        return header;
    }

    public String  GetActiveMenuText()
    {
        String activeMenu = driverActions.GetText(ActiveMenu);
        return activeMenu;
    }

    public List<String> GetMenuList()
    {
        List<String> menuList = driverActions.GetText(MenuList);
        return menuList;
    }

    public boolean GetPresenceMenu(String menu)
    {
        List<String> menuList = driverActions.GetText(MenuList);
        boolean isPresent = menuList.contains(menu);
        return isPresent;
    }

    public LeavePage GoToLeavePage()
    {
        driverActions.WaitUntilElementVisibleAndClickable(LeaveMenu);
        driverActions.mouseActions.ClickElement(LeaveMenu);
        return LeavePage.GetLeavePage()
                .Init_Elements();
    }
}
