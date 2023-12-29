namespace SOLIDPrinciples.InterfaceSegregation
{
    public class Manager : ILead
    {
        public void AssignTask()
        {
            Console.WriteLine("Manager assign task");
        }

        public void CreateTask()
        {
            Console.WriteLine("Manager create task");
        }
    }
}
