namespace DesignPattern.FactoryPattern
{
    public class SMSNotification : INotification
    {
        public void SendNotification()
        {
            Console.WriteLine("Sms notification send");
        }
    }
}
