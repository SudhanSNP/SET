package DesignPattern.DecoratorPattern;

public class LuxuryCar extends CarDecorator{
    public LuxuryCar(ICar car) {
        super(car);
    }

    public void SetCarType() {
        String carType = super.GetCarType();
        carType += " " + "Luxury";
        super.SetCarType(carType);
    }

    @Override
    public void Assemble() {
        System.out.println("The car " + super.GetMake() + " of type " + super.GetCarType() +  " cost " + super.GetPrice());
        System.out.println("The luxury car assembled successfully!");
    }
}
