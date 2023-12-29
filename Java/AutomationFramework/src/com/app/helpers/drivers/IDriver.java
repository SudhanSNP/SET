package com.app.helpers.drivers;

import org.openqa.selenium.WebDriver;

public interface IDriver {
    WebDriver GetDriver();
    void SetDriver();
    void MaximizeDriver();
    void MinimizeDriver();
    void NavigateURL(String url);
    void CloseDriver();

    void QuitDriver();
}
