package DesignPatternTests;

import DesignPattern.DecoratorPattern.*;
import org.testng.annotations.Test;

public class DecoratorPatternTests extends TestBase {
    ICar car;
    BasicCar basicCar;
    LuxuryCar luxuryCar;

    @Test(priority = 1, groups = {"DesignPattern"})
    public void SetUp() {
        car = new Car();
        basicCar = new BasicCar(car);
        luxuryCar = new LuxuryCar(new BasicCar(new Car()));
        System.out.println("SetUp executed.");
    }

    @Test(priority = 2, groups = {"DesignPattern"})
    public void BasicCarDecorator() {
        basicCar.SetMake("Kia");
        basicCar.SetPrice(800000);
        basicCar.SetCarType();
        basicCar.Assemble();
    }

    @Test(priority = 3, groups = {"DesignPattern"})
    public void LuxuryCarDecorator() {
        luxuryCar.SetMake("Ferrari");
        luxuryCar.SetPrice(8000000);
        luxuryCar.SetCarType();
        luxuryCar.Assemble();
    }
}
