package com.app.helpers.logging;

public interface ILogger {
    String LogMessage(String message);
    static void PrintLog(String message) {
        System.out.println(message);
    }
}
