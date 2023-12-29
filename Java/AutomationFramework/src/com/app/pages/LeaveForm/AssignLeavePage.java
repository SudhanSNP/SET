package com.app.pages.LeaveForm;

import com.app.helpers.actions.DriverActions;
import com.app.pages.BasePage;
import com.app.pages.DashboardPage;
import com.app.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignLeavePage {
    private static BasePage Base_Page;
    private static AssignLeavePage AssignLeave_Page;
    public static DriverActions driverActions;
    public static WebDriver driver;

    private AssignLeavePage() {
    }

    public static AssignLeavePage GetAssignLeavePage() {
        if(AssignLeave_Page == null) {
            synchronized (LoginPage.class) {
                if(AssignLeave_Page == null)
                    AssignLeave_Page = new AssignLeavePage();
            }
        }
        Base_Page = BasePage.GetBasePage();
        driverActions = Base_Page.driverActions;
        return AssignLeave_Page;
    }

    public AssignLeavePage Init_Elements() {
        PageFactory.initElements(Base_Page.driver, this);
        return this;
    }

    @FindBy(css = "input[placeholder='Type for hints...']")
    private WebElement EmployeeName;
    @FindBy(css = ".oxd-select-text-input")
    private WebElement LeaveType;
    @FindBy(xpath = "//*[text()='US - Personal']")
    private WebElement LeaveOption;
    @FindBy(xpath = "//label[text()='From Date']/following::input[1]")
    private WebElement From;
    @FindBy(xpath = "//label[text()='To Date']/following::input[1]")
    private WebElement To;
    @FindBy(css = "button[type='submit']")
    private WebElement Assign;
    @FindBy(xpath = "//a[text()='Leave List']")
    private WebElement LeaveList;
    @FindBy(xpath = "//*[contains(@role, 'listbox')]")
    private WebElement Options;

    public AssignLeavePage EnterEmployeeName(String employeeName)
    {
        driverActions.WaitUntilElementVisibleAndClickable(EmployeeName);
        driverActions.keyBoardActions.SendText(EmployeeName, employeeName);
        driverActions.WaitUntilElementVisibleAndClickable(Options);
        driverActions.WaitUntilElementVisibleAndClickable(driverActions.driver.findElement(By.xpath("//*[contains(text(), '" + employeeName + "')]")));
        driverActions.mouseActions.ClickElement(driverActions.driver.findElement(By.xpath("//*[contains(text(), '" + employeeName + "')]")));
        return this;
    }

    public AssignLeavePage EnterLeaveType(String leaveType)
    {
        driverActions.WaitUntilElementVisibleAndClickable(LeaveType);
        driverActions.mouseActions.ClickElement(LeaveType);
        driverActions.WaitUntilElementVisibleAndClickable(driverActions.driver.findElement(By.xpath("//*[contains(text(), '" + leaveType + "')]")));
        driverActions.mouseActions.ClickElement(driverActions.driver.findElement(By.xpath("//*[contains(text(), '" + leaveType + "')]")));
        return this;
    }

    public AssignLeavePage SetFromDate(String fromDate)
    {
        driverActions.WaitUntilElementVisibleAndClickable(From);
        driverActions.keyBoardActions.SendText(From, fromDate);
        return this;
    }

    public AssignLeavePage SetToDate(String toDate)
    {
        driverActions.WaitUntilElementVisibleAndClickable(To);
        driverActions.keyBoardActions.SendText(To, toDate);
        return this;
    }

    public AssignLeavePage ClickAssign()
    {
        driverActions.WaitUntilElementVisibleAndClickable(Assign);
        driverActions.mouseActions.ClickElement(Assign);
        return this;
    }

    public LeaveListPage ClickLeaveList()
    {
        driverActions.WaitUntilElementVisibleAndClickable(LeaveList);
        driverActions.mouseActions.ClickElement(LeaveList);
        return LeaveListPage.GetLeaveListPage().Init_Elements();
    }
}
