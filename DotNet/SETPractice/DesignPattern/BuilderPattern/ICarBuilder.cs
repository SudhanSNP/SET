namespace DesignPattern.BuilderPattern
{
    public interface ICarBuilder
    {
        void SetPetrolEngine();
        void SetDieselEngine();
        void SetBody();
        void SetSeats(int seats);
        void SetHeadLights(int headLights);
        Car GetCar();
    }
}
