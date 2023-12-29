package DesignPattern.FactoryPattern;

import java.io.InvalidObjectException;

public class NotificationFactory {

    public INotification GetNotification(NotificationType type) throws InvalidObjectException {
        switch (type) {
            case SMS: return new SMSNotification();
            case PUSH: return new PUSHNotification();
            case EMAIL: return new EmailNotification();
            default: throw new InvalidObjectException("Provide a valid notification type");
        }
    }
}
