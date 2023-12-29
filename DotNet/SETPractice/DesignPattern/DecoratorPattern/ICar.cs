namespace DesignPattern.DecoratorPattern
{
    public interface ICar
    {
        public string Make { get; }
        public double Price { get; set; }
        public double GetPrice();
    }
}
