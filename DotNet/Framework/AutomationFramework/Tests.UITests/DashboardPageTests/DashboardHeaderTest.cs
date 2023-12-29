using NUnit.Framework;
using Pages;

namespace Tests.UITests.DashboardPageTests
{
    [TestFixture]
    public class DashboardHeaderTest : BaseTestFixtures
    {
        DashboardPage Dashboard_Page;

        [SetUp] public void SetUp() 
        {
            Dashboard_Page = LoginUser();
        }

        [Test]
        public void HeaderTest() 
        {
            Dashboard_Page.GetHeaderText(out string header);

            Assert.That(header, Is.EqualTo("Dashboard"));
        }
    }
}
