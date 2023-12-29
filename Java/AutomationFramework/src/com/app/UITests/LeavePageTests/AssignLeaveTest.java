package com.app.UITests.LeavePageTests;

import com.app.pages.DashboardPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AssignLeaveTest extends BaseLeaveTest{
    DashboardPage Dashboard_Page;

    @BeforeMethod
    public void Setup()
    {
        Dashboard_Page = LoginUser();
    }

    @Test
    public void AssignLeave()
    {
        int rowCount = Dashboard_Page.WaitForPageLoad()
                .GoToLeavePage()
                .GoToAssignLeave()
                .EnterEmployeeName("Peter Mac")
                .EnterLeaveType("US - Personal")
                .SetFromDate(LocalDateTime.now().format(DateTimeFormatter.ofPattern(("yyyy-MM-dd"))))
                .ClickAssign()
                .ClickLeaveList()
                .EnterEmployeeName("Peter Mac")
                .SelectLeaveStatus("Scheduled")
                .ClickSearch()
                .GetSearchRowCount();

        Assert.assertTrue(rowCount > 1);
    }
}
