using NUnit.Framework;
using SOLIDPrinciples.OpenClose;
using SOLIDPrinciples.SingleResponsibility;

namespace SETPractice.SOLIDPrincipleTests
{
    [TestFixture]
    public class OpenCloseTest
    {
        ShapeFactory shapeFactory;
        Rectangle rectangle;
        Circle circle;
        IShape shape;

        [SetUp]
        public void Setup()
        {
            shapeFactory = new ShapeFactory();
        }

        [Test]
        public void OpenClosePrincipleTest()
        {
            double height = 10;
            double width = 12.5;
            shape = shapeFactory.GetShapeInstance(Shape.Rectangle);
            rectangle = (Rectangle)shape;
            rectangle.setHeight(height);
            rectangle.setWidth(width);
            var area = rectangle.Area();
            Console.WriteLine("Area of Rectangle: " + area);

            double radius = 7.5;
            shape = shapeFactory.GetShapeInstance(Shape.Circle);
            circle = (Circle)shape;
            circle.setRadius(radius);
            area = circle.Area();
            Console.WriteLine("Area of Circle: " + area);
        }
    }
}
