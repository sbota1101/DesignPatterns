package openClosePrinciple;

public class Cerc implements FormeGeometrice {
    private int raza;

    public Cerc(int raza) {
        this.raza = raza;
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }

    @Override
    public double getArea() {
        double area=Math.PI*raza*raza;
        return area;
    }
}
