package DesignPatternTests;

import DesignPattern.BuilderPattern.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Assert;

//@Listeners(TestListeners.class)
public class BuilderPatternTests extends TestBase {
    ICarBuilder petrolCarBuilder = new CarBuilder();
    ICarBuilder dieselCarBuilder = new CarBuilder();
    Car petrolCar;
    Car dieselCar;

    @Test(priority = 1, groups = {"DesignPattern"})
    public void CarBuilder() {
        petrolCar = new PetrolCar(petrolCarBuilder)
                .AssembleCar();

        dieselCar = new DieselCar(dieselCarBuilder)
                .AssembleCar();
        Assert.assertEquals(petrolCar.Seats, 5);
        Assert.assertEquals(dieselCar.Seats, 7);
    }
}
