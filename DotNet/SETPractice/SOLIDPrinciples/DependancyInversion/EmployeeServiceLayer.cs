namespace SOLIDPrinciples.DependancyInversion
{
    public class EmployeeServiceLayer
    {
        public IEmployeeDataAccessLayer DataAccessLayer { get; set; }

        public EmployeeServiceLayer() 
        {
            DataAccessLayer = DataAccessFactory.GetEmployeeDataAccessLayerObj();
        }

        public Employee GetEmployeeDetails(int id)
        {
            return DataAccessLayer.GetEmployee(id);
        }
    }
}
