namespace DesignPattern.DecoratorPattern
{
    public abstract class PriceDecorator : ICar
    {
        private ICar car;
        public PriceDecorator(ICar car)
        {
            this.car = car;
        }

        public string Make
        {
            get
            {
                return car.Make;
            }
        }

        public double Price
        {
            get
            {
                return car.Price;
            }
            set 
            { 
                car.Price = value; 
            }
        }

        public double GetPrice()
        {
            return car.GetPrice();
        }

        public abstract double GetDiscountPrice();

        public abstract double GetCorporateDiscount();
    }
}
