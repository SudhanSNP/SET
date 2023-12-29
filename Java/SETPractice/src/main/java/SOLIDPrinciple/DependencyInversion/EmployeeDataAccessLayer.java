package SOLIDPrinciple.DependencyInversion;

public class EmployeeDataAccessLayer implements IEmployeeDataAccessLayer{
    @Override
    public Employee GetEmployee(int id) {
        Employee emp = new Employee();
        emp.EmpId = id;
        emp.Name = "Sudhan";
        emp.Department = "IT";
        emp.Salary = 100000;
        return emp;
    }
}
