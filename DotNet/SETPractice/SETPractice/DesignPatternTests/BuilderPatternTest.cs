using DesignPattern.BuilderPattern;
using NUnit.Framework;

namespace SETPractice.DesignPatternTests
{
    [TestFixture]
    public class BuilderPatternTest
    {
        ICarBuilder petrolCarBuilder;
        ICarBuilder dieselCarBuilder;
        Car petrolCar;
        Car dieselCar;

        [SetUp]
        public void SetUp()
        {
            petrolCarBuilder = new CarBuilder();
            dieselCarBuilder = new CarBuilder();
        }

        [Test]
        public void BuilderPattern()
        {
            petrolCar = new PetrolCar(petrolCarBuilder)
                .AssembleCar();

            dieselCar = new DieselCar(dieselCarBuilder)
                .AssembleCar();

            Assert.That(petrolCar.Seats, Is.EqualTo(5));
            Assert.That(petrolCar.HeadLights, Is.EqualTo(4));

            Assert.That(dieselCar.Seats, Is.EqualTo(7));
            Assert.That(dieselCar.HeadLights, Is.EqualTo(4));
        }
    }
}
