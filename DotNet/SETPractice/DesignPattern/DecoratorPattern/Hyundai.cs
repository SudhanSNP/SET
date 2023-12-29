namespace DesignPattern.DecoratorPattern
{
    public class Hyundai : ICar
    {

        public string Make { get 
            { 
                return "Hyundai"; 
            } 
        }

        public double Price { get; set; }

        public double GetPrice()
        {
            return Price;
        }
    }
}
