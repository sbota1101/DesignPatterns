package openClosePrinciple;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dreptunghi dreptunghi = new Dreptunghi(2, 4);
        System.out.println(dreptunghi.getArea());
        Cerc cerc = new Cerc(2);
        Cerc cerc1 = new Cerc(3);
        Cerc cerc2 = new Cerc(4);
        System.out.println(cerc.getArea());
        List<FormeGeometrice> formeGeometrice=new ArrayList<>();
        formeGeometrice.add(cerc);
        formeGeometrice.add(cerc1);
        formeGeometrice.add(cerc2);
        formeGeometrice.add(dreptunghi);
        System.out.println(AreaCalculator.calculateArea(formeGeometrice));
    }
}
