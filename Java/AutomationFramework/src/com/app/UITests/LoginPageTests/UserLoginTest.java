package com.app.UITests.LoginPageTests;

import com.app.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserLoginTest extends BaseLoginTest{
    LoginPage Login_Page;

    @BeforeMethod
    public void SetUp() {
        Login_Page = LoginPage.GetLoginPage()
                .Init_Elements();
    }

    @Test
    public void UserTest()
    {
        String username = GetProperty("username");
        String password = GetProperty("password");
        boolean isLogoPresent = Login_Page.EnterUsername(username)
            .EnterPassword(password)
            .ClickLogin()
            .IsLogoPresent();

        Assert.assertEquals(isLogoPresent, true);
    }
}
