package DesignPattern.BuilderPattern;

public class PetrolCar {
    public ICarBuilder carBuilder;

    public PetrolCar(ICarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car AssembleCar() {
        carBuilder.SetBody();
        carBuilder.SetDieselEngine();
        carBuilder.SetHeadLights(4);
        carBuilder.SetSeats(5);
        return carBuilder.GetCar();
    }
}
