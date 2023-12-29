package DesignPattern.FacadePattern;

public class Restaurant implements IRestaurant{
    @Override
    public void PrepareMenu(String menu) {
        System.out.println("Preparing the Menu " + menu);
    }

    @Override
    public void ServeMenu(String menu) {
        System.out.println("Serving the Menu " + menu);
    }
}
