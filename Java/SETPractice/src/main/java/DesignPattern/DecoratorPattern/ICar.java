package DesignPattern.DecoratorPattern;

public interface ICar {
    public void SetMake(String make);
    public void SetPrice(double price);
    public String GetMake();
    public double GetPrice();
    public String GetCarType();
    public void SetCarType(String carType);
    public void Assemble();
}
