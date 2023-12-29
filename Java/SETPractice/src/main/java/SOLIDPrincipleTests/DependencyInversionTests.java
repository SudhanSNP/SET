package SOLIDPrincipleTests;

import SOLIDPrinciple.DependencyInversion.Employee;
import SOLIDPrinciple.DependencyInversion.EmployeeServiceLayer;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependencyInversionTests extends TestBase {
    EmployeeServiceLayer employeeService;
    Employee employee;

    @BeforeMethod
    public void SetUp() {
        employeeService = new EmployeeServiceLayer();
    }

    @Test(groups = {"SolidPrinciple"})
    public void EmployeeTest() {
        employee = employeeService.GetEmployeeDetails(1);
        Assert.assertEquals(employee.EmpId, 1);
        Assert.assertEquals(employee.Name, "Sudhan");
        Assert.assertEquals(employee.Department, "IT");
        Assert.assertEquals(employee.Salary, 100000);
    }
}
