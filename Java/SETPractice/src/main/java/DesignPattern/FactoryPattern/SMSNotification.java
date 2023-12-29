package DesignPattern.FactoryPattern;

public class SMSNotification implements INotification{
    public void SendNotification() {
        System.out.println("SMS notification send.");
    }
}
