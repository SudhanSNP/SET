namespace DesignPattern.FactoryPattern
{
    public class NotificationFactory
    {
        public NotificationFactory() { }

        public INotification GetNotification(NotificationType type)
        {
            switch(type) 
            {
                case NotificationType.SMS: return new SMSNotification();
                case NotificationType.EMAIL: return new EmailNotification();
                case NotificationType.PUSH: return new PushNotification();
                default: throw new InvalidOperationException("Provide a valid Notification type");
            }
        }

    }
}
