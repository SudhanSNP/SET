package com.app.UITests.DashboardPageTests;

import com.app.pages.DashboardPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class DashboardMenuListTest extends BaseDashboardTest{
    DashboardPage Dashboard_Page;

    @BeforeMethod
    public void SetUp()
    {
        Dashboard_Page = LoginUser();
    }

    @Test
    public void MenuListTest()
    {
        List<String> list = Arrays.asList( "Admin", "PIM", "Leave", "Time", "Recruitment", "My Info", "Performance", "Dashboard", "Directory", "Maintenance", "Claim", "Buzz" );

        List<String> menuList = Dashboard_Page.GetMenuList();

        Assert.assertEquals(menuList, list);
    }
}
