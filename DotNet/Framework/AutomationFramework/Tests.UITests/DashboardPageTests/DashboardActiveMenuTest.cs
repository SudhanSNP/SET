using NUnit.Framework;
using Pages;

namespace Tests.UITests.DashboardPageTests
{
    [TestFixture]
    public class DashboardActiveMenuTest : BaseTestFixtures
    {
        DashboardPage Dashboard_Page;

        [SetUp]
        public void SetUp()
        {
            Dashboard_Page = LoginUser();
        }

        [Test]
        public void MenuTest() 
        {
            Dashboard_Page.GetActiveMenuText(out string activeMenu);

            Assert.That(activeMenu, Is.EqualTo("Dashboard"));
        }
    }
}
