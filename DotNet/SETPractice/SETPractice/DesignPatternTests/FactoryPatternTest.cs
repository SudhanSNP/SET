using DesignPattern.FactoryPattern;
using NUnit.Framework;

namespace SETPractice.DesignPatternTests
{
    [TestFixture]
    public class FactoryPatternTest
    {
        INotification notification;
        NotificationFactory notificationFactory;
        
        [SetUp]
        public void SetUp()
        {
            notificationFactory = new NotificationFactory();    
        }

        [Test]
        public void FactoryPattern()
        {
            notification = notificationFactory.GetNotification(NotificationType.SMS);
            notification.SendNotification();

            notification = notificationFactory.GetNotification(NotificationType.PUSH);
            notification.SendNotification();

            notification = notificationFactory.GetNotification(NotificationType.EMAIL);
            notification.SendNotification();
        }
    }
}
