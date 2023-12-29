package DesignPattern.DecoratorPattern;

public class CarDecorator implements ICar{
    protected ICar car;
    public CarDecorator(ICar car) {
        this.car = car;
    }
    @Override
    public void SetMake(String make) {
        this.car.SetMake(make);
    }

    @Override
    public void SetPrice(double price) {
        this.car.SetPrice(price);
    }

    @Override
    public String GetMake() {
        return this.car.GetMake();
    }

    @Override
    public double GetPrice() {
        return this.car.GetPrice();
    }

    @Override
    public String GetCarType() {
        return this.car.GetCarType();
    }

    @Override
    public void SetCarType(String carType) {
        this.car.SetCarType(carType);
    }

    @Override
    public void Assemble() {
        this.car.Assemble();
    }
}
