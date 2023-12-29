package DesignPatternTests;

import DesignPattern.FactoryPattern.INotification;
import DesignPattern.FactoryPattern.NotificationFactory;
import DesignPattern.FactoryPattern.NotificationType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.InvalidObjectException;

public class FactoryPatternTests extends TestBase {
    INotification notification;
    NotificationFactory notificationFactory;

    @DataProvider(name = "NotificationTypeProvider")
    public Object[][] GetNotificationTypeData() {
        Object[][] data = { {NotificationType.SMS}, {NotificationType.PUSH}, {NotificationType.EMAIL} };
        return data;
    }

    @BeforeMethod(groups = {"DesignPattern", "design-pattern"})
    public void SetUp() {
        notificationFactory = new NotificationFactory();
    }

    @Test(dataProvider = "NotificationTypeProvider", groups = {"design-pattern"})
    public void SmsNotificationTest(NotificationType type) throws InvalidObjectException {
        notification = notificationFactory.GetNotification(type);
        notification.SendNotification();
    }
//
//    @Test(priority = 3, groups = {"DesignPattern"})
//    public void PushNotificationTest() throws InvalidObjectException {
//        notification = notificationFactory.GetNotification(NotificationType.PUSH);
//        notification.SendNotification();
//    }
//
//    @Test(priority = 4, groups = {"design-pattern"})
//    public void EmailNotificationTest() throws InvalidObjectException {
//        notification = notificationFactory.GetNotification(NotificationType.EMAIL);
//        notification.SendNotification();
//    }
}
