using NUnit.Framework;
using Pages;

namespace Tests.UITests.LoginPageTests
{
    [Parallelizable]
    [TestFixture]
    public class UserLoginTest : BaseTestFixtures
    {
        protected string Username;
        protected string Password;
        LoginPage Login_Page;

        [SetUp] 
        public void SetUp()
        {
            Login_Page = LoginPage.Login_Page;
            Username = GetConfigurationValue("Username");
            Password = GetConfigurationValue("Password");
        }

        [Test]
        public void UserLogin()
        {
            Login_Page.EnterUsername(Username)
                .EnterPassword(Password)
                .ClickLogin()
                .IsLogoPresent(out bool isLogoPresent);

            Assert.That(isLogoPresent, Is.EqualTo(true));
        }
    }
}
