package strategyShoppingCart;

public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNr;
    private String CVV;

    public CreditCardStrategy(String name, String cardNr, String CVV) {
        this.name = name;
        this.cardNr = cardNr;
        this.CVV = CVV;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount+" "+"folosind creditcard"+" "+name+" "+cardNr+" "+CVV);
    }
}
