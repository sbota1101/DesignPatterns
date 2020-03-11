package strategyShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculateTotal() {
        double sum = 0;
        for (Item i : items) {
            sum = sum + i.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy ps) {
        ps.pay(calculateTotal());
    }


}
