package abstractFactoryPattern;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Sunt un patrat necolorat");
    }
}
