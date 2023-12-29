package SOLIDPrinciple.OpenClose;

public class Circle implements IShape {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double Area() {
        return 3.14 * radius * radius;
    }
}
