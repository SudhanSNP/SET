namespace DesignPattern.BuilderPattern
{
    public class DieselCar
    {
        public ICarBuilder CarBuilder { get; set; }

        public DieselCar(ICarBuilder carBuilder)
        {
            CarBuilder = carBuilder;
        }

        public Car AssembleCar()
        {
            CarBuilder.SetBody();
            CarBuilder.SetSeats(7);
            CarBuilder.SetHeadLights(4);
            CarBuilder.SetDieselEngine();
            return CarBuilder.GetCar();
        }
    }
}
