namespace DesignPattern.FacadePattern
{
    public class HotelOrder
    {
        public IMenu menu;
        public IRestaurant restaurant;
        public List<string> MenuItems;

        public HotelOrder()
        {
            menu = new Menu();
            restaurant = new Restaurant();
            MenuItems = new List<string>();
        }

        public List<string> GetMenuList()
        {
            return menu.GetAllMenu();
        }

        public bool CheckMenuAvailable(string menuItem)
        {
            MenuItems = menu.GetAllMenu();
            return MenuItems.Contains(menuItem);
        }

        public void PlaceOrder(string menuItem)
        {
            if (CheckMenuAvailable(menuItem))
                restaurant.PrepareMenu(menuItem);
            else
                Console.WriteLine("Menu item not available.");
        }
    }
}
