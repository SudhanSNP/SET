using NUnit.Framework;
using Pages;

namespace Tests.BDD.StepDefinitions.LoginPageSteps
{
    [Binding]
    public class LoginLogoTest
    {
        LoginPage Login_Page;
        bool isLogoPresent;

        [Given(@"I navigated to OrangeHRM portal")]
        public void GivenINavigatedToOrangeHRMPortal()
        {
            Login_Page = LoginPage.Login_Page;
        }

        [When(@"Check for the logo image")]
        public void WhenILookForTheLogoImage()
        {
            Login_Page.IsLogoPresent(out isLogoPresent);
        }

        [Then(@"The logo should be present")]
        public void ThenTheLogoShouldBePresent()
        {
            Assert.That(isLogoPresent, Is.EqualTo(true));
        }

    }
}
