package DesignPattern.FactoryPattern;

public class PUSHNotification implements INotification{
    @Override
    public void SendNotification() {
        System.out.println("Push notification send.");
    }
}
