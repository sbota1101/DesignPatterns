package abstractFactoryPattern;

public class ColoredShapeFactory implements AbstractShapeFactory {
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equals("SQUARE"))
            return new ColorSquare();
        if(shapeType.equals("TRIANGLE"))
            return new ColorTriangle();
        return null;
    }
}
