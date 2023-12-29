namespace SOLIDPrinciples.DependancyInversion
{
    public class DataAccessFactory
    {

        public static IEmployeeDataAccessLayer GetEmployeeDataAccessLayerObj()
        {
            return new EmployeeDataAccessLayer();
        }
    }
}
