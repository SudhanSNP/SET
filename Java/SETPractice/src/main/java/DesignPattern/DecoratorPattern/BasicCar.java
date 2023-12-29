package DesignPattern.DecoratorPattern;

public class BasicCar extends CarDecorator{
    public BasicCar(ICar car) {
        super(car);
    }

    public void SetCarType() {
        String carType = super.GetCarType();
        carType += " " + "Basic";
        super.SetCarType(carType);
    }

    @Override
    public void Assemble() {
        System.out.println("The car " + super.GetMake() + " of type " + super.GetCarType() +  " cost " + super.GetPrice());
        System.out.println("The basic car assembled successfully!");
    }
}
