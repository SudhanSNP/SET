namespace SOLIDPrinciples.InterfaceSegregation
{
    public class Programmer : IProgrammer
    {
        public void WorkOnTask()
        {
            Console.WriteLine("Programmer working on task");
        }
    }
}
