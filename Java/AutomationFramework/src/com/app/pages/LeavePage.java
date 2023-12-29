package com.app.pages;

import com.app.helpers.actions.DriverActions;
import com.app.pages.LeaveForm.AssignLeavePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {
    private static BasePage Base_Page;
    private static LeavePage Leave_Page;
    public static DriverActions driverActions;
    public static WebDriver driver;

    private LeavePage() {
    }

    public static LeavePage GetLeavePage() {
        if(Leave_Page == null) {
            synchronized (LoginPage.class) {
                if(Leave_Page == null)
                    Leave_Page = new LeavePage();
            }
        }
        Base_Page = BasePage.GetBasePage();
        driverActions = Base_Page.driverActions;
        return Leave_Page;
    }

    public LeavePage Init_Elements() {
        PageFactory.initElements(Base_Page.driver, this);
        return this;
    }

    @FindBy(css = ".oxd-topbar h6")
    private WebElement Header;
    @FindBy(xpath = "//a[text()='Assign Leave']")
    private WebElement AssignLeave;

    public LeavePage WaitForPageLoad()
    {
        driverActions.WaitUntilElementVisibleAndClickable(Header);
        return this;
    }

    public String GetHeaderText()
    {
        String header = driverActions.GetText(Header);
        return header;
    }

    public AssignLeavePage GoToAssignLeave()
    {
        driverActions.WaitUntilElementVisibleAndClickable(AssignLeave);
        driverActions.mouseActions.ClickElement(AssignLeave);
        return AssignLeavePage.GetAssignLeavePage().Init_Elements();
    }

}
