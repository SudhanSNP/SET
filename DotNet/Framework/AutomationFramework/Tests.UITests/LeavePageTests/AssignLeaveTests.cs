using NUnit.Framework;
using Pages;

namespace Tests.UITests.LeavePageTests
{
    [TestFixture]
    public class AssignLeaveTests : BaseTestFixtures
    {
        DashboardPage Dashboard_Page;

        [SetUp]
        public void Setup()
        {
            Dashboard_Page = LoginUser();
        }

        [Test]
        public void AssignLeave()
        {
            Dashboard_Page.WaitForPageLoad()
                .GoToLeavePage()
                .GoToAssignLeave()
                .EnterEmployeeName("Peter Mac")
                .EnterLeaveType("US - Personal")
                .SetFromDate(DateTime.Today.AddDays(5).ToString("yyyy-MM-dd"))
                .ClickAssign()
                .ClickLeaveList()
                .EnterEmployeeName("Peter Mac")
                .SelectLeaveStatus("Scheduled")
                .ClickSearch()
                .GetSearchRowCount(out int rowCount);

            Assert.That(rowCount, Is.GreaterThan(1));
        }
    }
}
