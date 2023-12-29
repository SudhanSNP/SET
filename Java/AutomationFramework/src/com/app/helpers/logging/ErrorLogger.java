package com.app.helpers.logging;

public class ErrorLogger implements ILogger{
    @Override
    public String LogMessage(String message) {
        return "Error: " + message;
    }
}
