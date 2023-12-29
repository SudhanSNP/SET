package com.app.helpers.properties;

import com.app.helpers.logging.ErrorLogger;
import com.app.helpers.logging.ILogger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    FileReader reader;
    String filePath;
    Properties props;

    public PropertiesReader(String path) {
        filePath = path;

    }

    public String GetValue(String key) {
        GetProperties();
        return props.getProperty(key);
    }

    private void GetProperties() {
        try {
            reader = new FileReader(filePath);
            props = new Properties();
            props.load(reader);
        } catch (FileNotFoundException e) {
            ILogger.PrintLog(new ErrorLogger().LogMessage(("Please provide valid file path")));
        } catch (IOException e) {
            ILogger.PrintLog(new ErrorLogger().LogMessage(("Problem loading the file")));
        }
    }
}
