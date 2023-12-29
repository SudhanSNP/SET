package DesignPatternTests;

import DesignPattern.FacadePattern.HotelOrder;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacadePatternTests extends TestBase {
    HotelOrder hotelOrder;

    @BeforeMethod(groups = {"DesignPattern"})
    public void SetUp() {
        hotelOrder = new HotelOrder();
    }

    @Test(groups = {"DesignPattern"})
    public void FacadePattern() {
        String vegMenu = "Roti";
        String nonVegMenu = "Chicken";

        Assert.assertEquals(hotelOrder.CheckMenuAvailable(vegMenu), true);
        Assert.assertEquals(hotelOrder.CheckMenuAvailable(nonVegMenu), true);
    }
}
