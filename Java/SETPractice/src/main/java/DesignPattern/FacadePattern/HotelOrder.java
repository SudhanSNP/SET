package DesignPattern.FacadePattern;

import java.util.List;

public class HotelOrder {
    public IMenu menu;
    public IRestaurant restaurant;
    public List<String> MenuItems;

    public HotelOrder()
    {
        menu = new Menu();
        restaurant = new Restaurant();
    }

    public List<String> GetMenuList()
    {
        return menu.GetAllMenu();
    }

    public boolean CheckMenuAvailable(String menuItem)
    {
        MenuItems = menu.GetAllMenu();
        return MenuItems.contains(menuItem);
    }

    public void PlaceOrder(String menuItem)
    {
        if (CheckMenuAvailable(menuItem))
            restaurant.PrepareMenu(menuItem);
        else
            System.out.println("Menu item not available.");
    }

}
