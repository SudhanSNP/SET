namespace DesignPattern.FacadePattern
{
    public class Restaurant : IRestaurant
    {
        public void PrepareMenu(string menu)
        {
            Console.WriteLine($"Preparing the Menu {menu}");
        }

        public void ServeMenu(string menu)
        {
            Console.WriteLine($"Serving the Menu {menu}");
        }
    }
}
