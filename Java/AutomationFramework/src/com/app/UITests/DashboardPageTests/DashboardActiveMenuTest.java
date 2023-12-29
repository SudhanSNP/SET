package com.app.UITests.DashboardPageTests;

import com.app.pages.DashboardPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashboardActiveMenuTest extends BaseDashboardTest{
    DashboardPage Dashboard_Page;

    @BeforeMethod
    public void SetUp()
    {
        Dashboard_Page = LoginUser();
    }

    @Test
    public void MenuTest()
    {
        String activeMenu = Dashboard_Page.GetActiveMenuText();

        Assert.assertEquals(activeMenu, "Dashboard");
    }
}
