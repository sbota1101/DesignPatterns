package decoratorPattern;

public class MyBauturaFactory implements BauturaFactory {
    @Override
    public Bautura createBautura(BauturaType bauturaType) {//CAFEA,CAFEA CU LAPTE,CAFEA CU ZAHAR,CAFEA CU ZAHAR,LAPTE,CAFEA DUBLU LAPTE
        if(bauturaType==BauturaType.Cafea)
            return new Cafea();
        if(bauturaType==BauturaType.Cafea_cu_lapte)
            return new Lapte(new Cafea());
        if(bauturaType==BauturaType.Cafea_cu_zahar)
            return new Zahar(new Cafea());
        if(bauturaType==BauturaType.Cafea_cu_zahar_si_lapte)
            return new Zahar(new Lapte(new Cafea()));
        if(bauturaType==BauturaType.Cafea_dublu_lapte)
            return new Lapte(new Lapte(new Cafea()));

        return null;
    }
}
