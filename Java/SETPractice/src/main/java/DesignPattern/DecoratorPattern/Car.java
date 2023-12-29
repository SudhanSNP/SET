package DesignPattern.DecoratorPattern;

public class Car implements ICar {
    public double Price;
    public String Make = "";
    public String CarType;

    public Car() {
    }

    @Override
    public void SetMake(String make) {
        this.Make = make;
    }

    @Override
    public void SetPrice(double price) {
        this.Price = price;
    }

    @Override
    public String GetMake() {
        return this.Make;
    }

    @Override
    public double GetPrice() {
        return this.Price;
    }

    @Override
    public String GetCarType() {
        return this.CarType;
    }

    @Override
    public void SetCarType(String carType) {
        this.CarType = carType;
    }

    @Override
    public void Assemble() {
        System.out.println("The car " + Make + " of type " + CarType +  " cost " + Price);
        System.out.println("The car assembled successfully!");
    }
}
