package com.app.ApiTests;

import com.app.helpers.properties.PropertiesReader;
import com.app.helpers.reports.ApiTestsListeners;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners(ApiTestsListeners.class)
public class BaseApiTest {
    protected String BaseUrl;

    @BeforeClass
    public void BaseUrlSetUp() {
        BaseUrl = GetProperty("baseUrl");
    }

    protected String GetProperty(String key) {
        String path = System.getProperty("user.dir") + "\\src\\com\\app\\ApiTests\\app.properties";
        PropertiesReader propertiesReader = new PropertiesReader(path);
        return propertiesReader.GetValue(key);
    }
}
