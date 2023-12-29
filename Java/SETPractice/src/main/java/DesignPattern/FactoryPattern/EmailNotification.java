package DesignPattern.FactoryPattern;

public class EmailNotification implements INotification{
    @Override
    public void SendNotification() {
        System.out.println("Email notification send.");
    }
}
