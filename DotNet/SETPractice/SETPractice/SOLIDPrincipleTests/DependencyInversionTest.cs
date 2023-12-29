using NUnit.Framework;
using SOLIDPrinciples.DependancyInversion;

namespace SETPractice.SOLIDPrincipleTests
{
    [TestFixture]
    public class DependencyInversionTest
    {
        EmployeeServiceLayer employeeService;
        Employee employee;

        [SetUp]
        public void SetUp() 
        {
            employeeService = new EmployeeServiceLayer();
        }
        
        [Test]
        public void DependencyInversionPrinciple() 
        {
            employee = employeeService.GetEmployeeDetails(1);

            Assert.That(employee.EmpId, Is.EqualTo(1));
            Assert.That(employee.Name, Is.EqualTo("Sudhan"));
            Assert.That(employee.Department, Is.EqualTo("IT"));
            Assert.That(employee.Salary, Is.EqualTo(100000));
        }
    }
}
