using DesignPattern.FacadePattern;
using NUnit.Framework;

namespace SETPractice.DesignPatternTests
{
    [TestFixture]
    public class FacadePatternTest
    {
        HotelOrder hotelOrder;
        
        [SetUp] 
        public void SetUp() 
        {
            hotelOrder = new HotelOrder();
        }

        [Test]
        public void FacadePattern()
        {
            string vegMenu = "Roti";
            string nonVegMenu = "Chicken";

            Assert.That(hotelOrder.CheckMenuAvailable(vegMenu), Is.EqualTo(false));
            Assert.That(hotelOrder.CheckMenuAvailable(nonVegMenu), Is.EqualTo(true));
        }
    }
}
