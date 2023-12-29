namespace DesignPattern.DecoratorPattern
{
    public class OfferPrice : PriceDecorator
    {
        public OfferPrice(ICar car) : base(car)
        {
        }

        public override double GetCorporateDiscount()
        {
            base.Price = 0.9 * base.GetPrice();
            return base.Price;
        }

        public override double GetDiscountPrice()
        {
            base.Price = 0.8 * base.GetPrice();
            return base.Price;
        }
    }
}
