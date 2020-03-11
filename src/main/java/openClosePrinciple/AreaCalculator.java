package openClosePrinciple;

import java.util.List;
//open close principle sa te fol de polymorpshism ca sa nu mai schimbi clasa AreaCalculator,
// de ex daca am mai face o clasa triunghi ,facem la fel ca la dreptunghi si cerc,dar clasa area calculator nu se schimba
public class AreaCalculator {
    public static double calculateArea(List<FormeGeometrice> forme) {
        int sum = 0;
        for (FormeGeometrice forma : forme) {
            sum+=forma.getArea();
        }
        return sum;
    }
}


