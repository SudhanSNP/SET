using DesignPattern.DecoratorPattern;
using NUnit.Framework;

namespace SETPractice.DesignPatternTests
{
    [TestFixture]
    public class DecoratorPatternTest
    {
        ICar car;
        PriceDecorator decorator { get; set; }

        [Test]
        public void DecoratorPattern()
        {
            car = new Hyundai();
            car.Price = 730000;
            decorator = new OfferPrice(car);
            Console.WriteLine($"Offer Price for Hyundai is {decorator.GetDiscountPrice()}");
            Console.WriteLine($"Corporate Offer Price for Hyundai is {decorator.GetCorporateDiscount()}");

            car = new Suzuki();
            car.Price = 1172000;
            decorator = new OfferPrice(car);
            Console.WriteLine($"Offer Price for Suzuki is {decorator.GetDiscountPrice()}");
            Console.WriteLine($"Corporate Offer Price for Suzuki is {decorator.GetCorporateDiscount()}");
        }
    }
}
