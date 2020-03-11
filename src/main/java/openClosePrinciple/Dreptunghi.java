package openClosePrinciple;

public class Dreptunghi implements FormeGeometrice {
    private int latime;
    private int lungime;

    public Dreptunghi(int latime, int lungime) {
        this.latime = latime;
        this.lungime = lungime;
    }

    public int getLatime() {
        return latime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    @Override
    public double getArea() {
        double area = latime * lungime;
        return area;
    }


}
