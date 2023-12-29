using NUnit.Framework;
using Pages;

namespace Tests.UITests.DashboardPageTests
{
    [TestFixture]
    public class DashboardMenuListTest : BaseTestFixtures
    {
        DashboardPage Dashboard_Page;

        [SetUp]
        public void SetUp()
        {
            Dashboard_Page = LoginUser();
        }

        [Test]
        public void MenuListTest()
        {
            List<string> list = new List<string> { "Admin", "PIM", "Leave", "Time", "Recruitment", "Performance", "Dashboard", "Directory", "Maintenance", "Claim", "Buzz", "My Info" };
            
            Dashboard_Page.GetMenuList(out List<string> menuList);

            Assert.That(list, Is.EquivalentTo(menuList));
        }
    }
}
