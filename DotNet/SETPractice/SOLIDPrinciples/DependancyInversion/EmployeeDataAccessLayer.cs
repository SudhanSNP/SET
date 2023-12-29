namespace SOLIDPrinciples.DependancyInversion
{
    public class EmployeeDataAccessLayer : IEmployeeDataAccessLayer
    {
        public Employee GetEmployee(int id)
        {
            return new Employee()
            {
                EmpId = id,
                Name = "Sudhan",
                Department = "IT",
                Salary = 100000
            };
        }
    }
}
