using NUnit.Framework;
using SOLIDPrinciples.SingleResponsibility;

namespace SETPractice.SOLIDPrincipleTests
{
    public class SingleResponsibilityTest
    {
        protected EmailService emailService;
        protected UserService userService;
        protected User NewUser;

        [SetUp]
        public void Setup()
        {
            emailService = new EmailService();
            userService = new UserService(emailService);
        }

        [Test]
        public void SingleResponsibilityPrincipleTest()
        {
            string userName = "Sudhan S";
            string password = "test@123";
            string email = "test@mail.com";
            
            NewUser = userService.RegisterUser(userName, password, email);

            Assert.That(NewUser.UserName, Is.EqualTo(userName));
            Assert.That(NewUser.Password, Is.EqualTo(password));
            Assert.That(NewUser.Email, Is.EqualTo(email));
        }
    }
}