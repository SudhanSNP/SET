namespace SOLIDPrinciples.DependancyInversion
{
    public interface IEmployeeDataAccessLayer
    {
        public Employee GetEmployee(int id);
    }
}
