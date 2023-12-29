package com.app.UITests.DashboardPageTests;

import com.app.pages.DashboardPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashboardHeaderTest extends BaseDashboardTest{
    DashboardPage Dashboard_Page;

    @BeforeMethod
    public void SetUp()
    {
        Dashboard_Page = LoginUser();
    }

    @Test
    public void HeaderTest()
    {
        String header = Dashboard_Page.GetHeaderText();

        Assert.assertEquals(header, "Dashboard");
    }
}
