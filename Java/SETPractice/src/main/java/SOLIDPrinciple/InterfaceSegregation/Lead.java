package SOLIDPrinciple.InterfaceSegregation;

public class Lead implements ILead,IProgrammer{
    @Override
    public void CreateTask() {
        System.out.println("Lead created task");
    }

    @Override
    public void AssignTask() {
        System.out.println("Lead assigned task");
    }

    @Override
    public void WorkOnTask() {
        System.out.println("Lead worked on the task");
    }
}
