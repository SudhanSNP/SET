package SOLIDPrinciple.InterfaceSegregation;

public class Manager implements ILead{
    @Override
    public void CreateTask() {
        System.out.println("Manager created task");
    }

    @Override
    public void AssignTask() {
        System.out.println("Manager assigned task");
    }
}
