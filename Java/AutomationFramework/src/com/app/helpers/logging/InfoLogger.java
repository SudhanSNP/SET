package com.app.helpers.logging;

public class InfoLogger implements ILogger{
    @Override
    public String LogMessage(String message) {
        return "Info: " + message;
    }
}
