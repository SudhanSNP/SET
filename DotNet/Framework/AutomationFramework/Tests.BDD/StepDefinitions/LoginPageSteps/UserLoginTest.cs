using NUnit.Framework;
using Pages;

namespace Tests.BDD.StepDefinitions.LoginPageSteps
{
    [Binding]
    public class UserLoginTest
    {
        LoginPage Login_Page;
        DashboardPage Dashboard_Page;
        bool isLogoPresent;

        [Given(@"I navigated to OrangeHRM login")]
        public void GivenINavigatedToOrangeHRMPortal()
        {
            Login_Page = LoginPage.Login_Page;
        }

        [When(@"Enter the Username and Password in the login form (.*) and (.*)")]
        public void WhenEnterTheUsernameAndPasswordInTheLoginFormAdminAndAdmin(string username, string password)
        {
            Dashboard_Page = Login_Page.EnterUsername(username)
                .EnterPassword(password)
                .ClickLogin();
        }

        [Then(@"The logo should be present in the Dashboard page")]
        public void ThenTheLogoShouldBePresentInTheDashboardPage()
        {
            Dashboard_Page.IsLogoPresent(out bool isLogoPresent);

            Assert.That(isLogoPresent, Is.EqualTo(true));
        }
    }
}
