package com.app.pages.LeaveForm;

import com.app.helpers.actions.DriverActions;
import com.app.pages.BasePage;
import com.app.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeaveListPage {
    private static BasePage Base_Page;
    private static LeaveListPage LeaveList_Page;
    public static DriverActions driverActions;
    public static WebDriver driver;

    private LeaveListPage() {
    }

    public static LeaveListPage GetLeaveListPage() {
        if(LeaveList_Page == null) {
            synchronized (LoginPage.class) {
                if(LeaveList_Page == null)
                    LeaveList_Page = new LeaveListPage();
            }
        }
        Base_Page = BasePage.GetBasePage();
        driverActions = Base_Page.driverActions;
        return LeaveList_Page;
    }

    public LeaveListPage Init_Elements() {
        PageFactory.initElements(Base_Page.driver, this);
        return this;
    }

    @FindBy(css = "input[placeholder='Type for hints...']")
    private WebElement EmployeeName;
    @FindBy(css = "button[type='submit']")
    private WebElement Search;
    @FindBy(xpath = "//label[text() = 'Show Leave with Status']/following::div[contains(@class,'oxd-select-text')][1]")
    private WebElement LeaveStatus;

    public LeaveListPage EnterEmployeeName(String employeeName)
    {
        driverActions.WaitUntilElementVisibleAndClickable(EmployeeName);
        driverActions.keyBoardActions.SendText(EmployeeName, employeeName);
        WebElement element = driverActions.driver.findElement(By.xpath("//*[contains(text(), '" + employeeName + "')]"));
        driverActions.WaitUntilElementVisibleAndClickable(element);
        driverActions.mouseActions.ClickElement(element);
        return this;
    }

    public LeaveListPage SelectLeaveStatus(String leaveStatus)
    {
        if(!driverActions.GetVisibilityOfElement(driverActions.driver.findElement(By.xpath("//span[contains(@class, 'oxd-chip') and contains(text(),'"+leaveStatus+"')]"))))
        {
            driverActions.WaitUntilElementVisibleAndClickable(LeaveStatus);
            driverActions.mouseActions.ClickElement(LeaveStatus);
            driverActions.WaitUntilElementVisibleAndClickable(driverActions.driver.findElement(By.xpath("//*[contains(text(), '"+leaveStatus+"')]")));
            driverActions.mouseActions.ClickElement(driverActions.driver.findElement(By.xpath("//*[contains(text(), '"+leaveStatus+"')]")));
        }
        return this;
    }

    public LeaveListPage ClickSearch()
    {
        driverActions.WaitUntilElementVisibleAndClickable(Search);
        driverActions.mouseActions.ClickElement(Search);
        return this;
    }

    public int GetSearchRowCount()
    {
        WebElement row = driverActions.driver.findElement(By.cssSelector(".oxd-table-row"));
        driverActions.WaitUntilElementVisibleAndClickable(row);
        int rowCount = driverActions.driver.findElements(By.cssSelector(".oxd-table-row")).size();
        return rowCount;
    }

}
