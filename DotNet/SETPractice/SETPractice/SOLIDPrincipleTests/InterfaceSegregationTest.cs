using NUnit.Framework;
using SOLIDPrinciples.InterfaceSegregation;

namespace SETPractice.SOLIDPrincipleTests
{
    [TestFixture]
    public class InterfaceSegregationTest
    {
        ILead Lead;
        IProgrammer Programmer;
        
        [Test]
        public void InterfaceSegregationPrincipleTest() 
        {
            Lead = new Manager();
            Lead.CreateTask();
            Lead.AssignTask();

            Lead = new Lead();
            Lead.CreateTask();
            Lead.AssignTask();

            Programmer = new Programmer();
            Programmer.WorkOnTask();
        }
    }
}
