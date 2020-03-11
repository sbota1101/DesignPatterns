package decoratorPattern;

public abstract class BauturaDecorator implements Bautura {

    private Bautura bautura;

    public Bautura getBautura(){
        return bautura;
    }

    public BauturaDecorator(Bautura bautura) {
        this.bautura = bautura;
    }
}
