package abstractFactoryPattern;

public class ColorSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Sunt un patrat colorat");
    }
}
