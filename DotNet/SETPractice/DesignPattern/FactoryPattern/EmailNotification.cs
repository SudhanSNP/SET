namespace DesignPattern.FactoryPattern
{
    public class EmailNotification : INotification
    {
        public void SendNotification()
        {
            Console.WriteLine("Email notification send");
        }
    }
}
