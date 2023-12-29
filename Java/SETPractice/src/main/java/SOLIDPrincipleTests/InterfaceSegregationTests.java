package SOLIDPrincipleTests;

import SOLIDPrinciple.InterfaceSegregation.*;
import org.testng.annotations.Test;

public class InterfaceSegregationTests extends TestBase {
    ILead Lead;
    IProgrammer Programmer;

    @Test(priority = 1, groups = {"SolidPrinciple"})
    public void ManagerTest() {
        Lead = new Manager();
        Lead.CreateTask();
        Lead.AssignTask();
    }

    @Test(priority = 2, groups = {"SolidPrinciple"})
    public void LeadTest() {
        Lead = new Lead();
        Lead.CreateTask();
        Lead.AssignTask();
    }

    @Test(priority = 3, groups = {"SolidPrinciple"})
    public void ProgrammerTest() {
        Programmer = new Programmer();
        Programmer.WorkOnTask();
    }
}
