using NUnit.Framework;
using Pages;

namespace Tests.UITests.LoginPageTests
{
    [Parallelizable]
    [TestFixture]
    public class LoginLogoTest : BaseTestFixtures
    {
        LoginPage Login_Page;

        [SetUp] 
        public void Setup()
        {
            Login_Page = LoginPage.Login_Page;
        }

        [Test]
        public void LogoTest() 
        {
            bool isLogoPresent = false;
            Login_Page.IsLogoPresent(out isLogoPresent);

            Assert.That(isLogoPresent, Is.EqualTo(true));
        }
    }
}
