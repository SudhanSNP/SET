namespace DesignPattern.FactoryPattern
{
    public class PushNotification : INotification
    {
        public void SendNotification()
        {
            Console.WriteLine("Push notification send");
        }
    }
}
