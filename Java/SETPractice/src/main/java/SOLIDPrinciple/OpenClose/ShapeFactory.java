package SOLIDPrinciple.OpenClose;

import java.io.InvalidObjectException;

public class ShapeFactory {

    public IShape GetShapeInstance(Shape shape) throws InvalidObjectException {
        switch (shape) {
            case Circle:
                return new Circle();
            case Rectangle:
                return new Rectangle();
            default:
                throw new InvalidObjectException("Enter a valid shape");
        }
    }
}
