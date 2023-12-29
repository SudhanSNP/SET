package SOLIDPrinciple.InterfaceSegregation;

public class Programmer implements IProgrammer{
    @Override
    public void WorkOnTask() {
        System.out.println("Programmer worked on the task");
    }
}
