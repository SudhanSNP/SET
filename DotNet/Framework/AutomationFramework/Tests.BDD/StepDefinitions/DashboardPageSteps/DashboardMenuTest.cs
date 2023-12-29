using NUnit.Framework;
using Pages;

namespace Tests.BDD.StepDefinitions.DashboardPageSteps
{
    [Binding]
    public class DashboardMenuTest
    {
        LoginPage Login_Page;
        DashboardPage Dashboard_Page;
        bool isMenuPresent;

        [Given(@"We launched OrangeHRM")]
        public void GivenWeLaunchedOrangeHRM()
        {
            Login_Page = LoginPage.Login_Page;
        }

        [Given(@"Login to the Dashboard")]
        public void GivenLoginToTheDashboard()
        {
            Dashboard_Page = Login_Page.EnterUsername("Admin")
                .EnterPassword("admin123")
                .ClickLogin();
        }

        [When(@"Verify each (.*) item present in the menu bar")]
        public void WhenVerifyEachAdminItemPresentInTheMenuBar(string menu)
        {
            Dashboard_Page.GetPresenceMenu(menu, out isMenuPresent);
        }

        [Then(@"Menu should be present")]
        public void ThenMenuShouldBePresent()
        {
           Assert.That(isMenuPresent, Is.True);
        }

    }
}
