namespace DesignPattern.DecoratorPattern
{
    public class Suzuki : ICar
    {
        public string Make
        {
            get
            {
                return "Suzuki";
            }
        }

        public double Price { get; set; }

        public double GetPrice()
        {
            return Price;
        }
    }
}
