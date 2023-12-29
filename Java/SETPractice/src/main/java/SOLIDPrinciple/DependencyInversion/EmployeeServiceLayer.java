package SOLIDPrinciple.DependencyInversion;

public class EmployeeServiceLayer {
    IEmployeeDataAccessLayer DataAccessLayer;

    public EmployeeServiceLayer() {
        DataAccessLayer = DataAccessFactory.GetEmployeeDataAccessLayerObj();
    }

    public Employee GetEmployeeDetails(int id) {
        return DataAccessLayer.GetEmployee(id);
    }
}
