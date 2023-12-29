namespace SOLIDPrinciples.OpenClose
{
    public class ShapeFactory
    {
        public IShape GetShapeInstance(Shape shape)
        {
            switch (shape) 
            {
                case Shape.Rectangle:
                    return new Rectangle();
                case Shape.Circle:
                    return new Circle();
                default:
                    throw new InvalidOperationException("Please provide a valid shape");
            }
        }
    }
}
