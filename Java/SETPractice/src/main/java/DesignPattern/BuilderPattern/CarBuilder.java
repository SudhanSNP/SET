package DesignPattern.BuilderPattern;

public class CarBuilder implements ICarBuilder{
    public Car car = new Car();

    @Override
    public void SetPetrolEngine() {
        System.out.println("Petrol Engine assembled");
    }

    @Override
    public void SetDieselEngine() {
        System.out.println("Diesel Engine assembled");
    }

    @Override
    public void SetBody() {
        System.out.println("Car body assembled");
    }

    @Override
    public void SetSeats(int seats) {
        car.Seats = seats;
        System.out.println("Car seats assembled");
    }

    @Override
    public void SetHeadLights(int headLights) {
        car.HeadLights = headLights;
        System.out.println("Car Head lights assembled");
    }

    @Override
    public Car GetCar() {
        return car;
    }
}
