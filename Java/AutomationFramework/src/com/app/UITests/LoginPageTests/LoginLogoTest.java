package com.app.UITests.LoginPageTests;

import com.app.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginLogoTest extends BaseLoginTest {
    LoginPage Login_Page;

    @BeforeMethod
    public void SetUp() {
        Login_Page = LoginPage.GetLoginPage()
                .Init_Elements();
    }

    @Test
    public void LogoTest()
    {
        boolean isLogoPresent = Login_Page.IsLogoPresent();
        Assert.assertEquals(isLogoPresent, true);
    }

}
