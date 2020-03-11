package strategyShoppingCart;

public class ShoppingMain {
    public static void main(String[] args) {
        ShoppingCart cart=new ShoppingCart();
        Item item1=new Item(10,"Mere");
        Item item2=new Item(8,"Pere");
        Item item3=new Item(6,"Banane" );
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        PaypalStrategy paypalStrategy=new PaypalStrategy("sorina@yahoo.com","1234");
        CreditCardStrategy creditCardStrategy=new CreditCardStrategy("Andrei","12458765544","471");
        cart.pay(paypalStrategy);
        cart.pay(creditCardStrategy);
    }
}
