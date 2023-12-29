namespace DesignPattern.BuilderPattern
{
    public class PetrolCar
    {
        public ICarBuilder CarBuilder { get; set; }

        public PetrolCar(ICarBuilder carBuilder) 
        { 
            CarBuilder = carBuilder;
        }

        public Car AssembleCar()
        {
            CarBuilder.SetBody();
            CarBuilder.SetSeats(5);
            CarBuilder.SetHeadLights(4);
            CarBuilder.SetPetrolEngine();
            return CarBuilder.GetCar();
        }

    }
}
