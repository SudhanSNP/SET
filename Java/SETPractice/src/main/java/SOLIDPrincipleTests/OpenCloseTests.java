package SOLIDPrincipleTests;

import SOLIDPrinciple.OpenClose.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.InvalidObjectException;

public class OpenCloseTests extends TestBase {
    ShapeFactory shapeFactory;
    IShape shape;

    @BeforeMethod
    public void SetUp() {
        shapeFactory = new ShapeFactory();
    }

    @Test(priority = 1, groups = {"SolidPrinciple"})
    public void RectangleShapeTest() throws InvalidObjectException {
        double height = 10;
        double width = 12.5;

        shape = shapeFactory.GetShapeInstance(Shape.Rectangle);
        Rectangle rectangle = (Rectangle)shape;
        rectangle.setHeight(height);
        rectangle.setWidth(width);

        Assert.assertEquals(rectangle.Area(), 125);
    }

    @Test(priority = 2)
    public void CircleShapeTest() throws InvalidObjectException {
        double radius = 7.5;
        shape = shapeFactory.GetShapeInstance(Shape.Circle);
        Circle circle = (Circle)shape;
        circle.setRadius(radius);

        Assert.assertEquals(circle.Area(), 176.625);
    }
}
