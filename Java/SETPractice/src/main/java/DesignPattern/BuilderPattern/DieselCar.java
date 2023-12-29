package DesignPattern.BuilderPattern;

public class DieselCar {
    public ICarBuilder carBuilder;

    public DieselCar(ICarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car AssembleCar() {
        carBuilder.SetBody();
        carBuilder.SetDieselEngine();
        carBuilder.SetHeadLights(4);
        carBuilder.SetSeats(7);
        return carBuilder.GetCar();
    }
}
