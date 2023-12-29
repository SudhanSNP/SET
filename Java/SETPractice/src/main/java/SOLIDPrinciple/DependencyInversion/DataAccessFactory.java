package SOLIDPrinciple.DependencyInversion;

public class DataAccessFactory {

    public static IEmployeeDataAccessLayer GetEmployeeDataAccessLayerObj() {
        return new EmployeeDataAccessLayer();
    }
}
