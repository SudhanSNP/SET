namespace SOLIDPrinciples.InterfaceSegregation
{
    public class Lead : ILead, IProgrammer
    {
        public void AssignTask()
        {
            Console.WriteLine("Lead assign task");
        }

        public void CreateTask()
        {
            Console.WriteLine("Lead create task");
        }

        public void WorkOnTask()
        {
            Console.WriteLine("Lead working on task");
        }
    }
}
