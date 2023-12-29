namespace DesignPattern.BuilderPattern
{
    public class CarBuilder : ICarBuilder
    {
        public Car car = new Car();

        public void SetBody()
        {
            Console.WriteLine("Car body assembled");
        }

        public void SetDieselEngine()
        {
            Console.WriteLine("Diesel Engine assembled");
        }

        public void SetHeadLights(int headLights)
        {
            car.HeadLights = headLights;
            Console.WriteLine($"{car.HeadLights} Headlights assembled");
        }

        public void SetPetrolEngine()
        {
            Console.WriteLine("Petrol Engine assembled");
        }

        public void SetSeats(int seats)
        {
            car.Seats = seats;
            Console.WriteLine($"{car.Seats} Seats assembled");
        }

        public Car GetCar() 
        {
            return car;
        }
    }
}
