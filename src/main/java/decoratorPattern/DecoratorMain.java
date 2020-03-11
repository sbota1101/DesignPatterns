package decoratorPattern;

public class DecoratorMain {
    public static void main(String[] args) {
        Bautura cafea = new Cafea();
        System.out.println(cafea.decorate());
        Bautura cafeaCuLapte = new Lapte(new Cafea());
        System.out.println(cafeaCuLapte.decorate());
        Bautura cafeaCuLapteSiZahar = new Zahar(new Lapte(new Cafea()));
        System.out.println(cafeaCuLapteSiZahar.decorate());
//ca sa nu mai scriem new de atatea ori putem face o clasa noua factory si apelam asa:
        BauturaFactory bf = new MyBauturaFactory();
        Bautura cafeaDubluLapte = bf.createBautura(BauturaType.Cafea_dublu_lapte);
        System.out.println(cafeaDubluLapte.decorate());
    }
}
