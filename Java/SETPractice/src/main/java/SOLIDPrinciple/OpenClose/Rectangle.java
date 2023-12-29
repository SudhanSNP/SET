package SOLIDPrinciple.OpenClose;

public class Rectangle implements IShape{
    private double height;
    private double width;

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double Area() {
        return height * width;
    }
}
