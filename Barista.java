
import java.util.ArrayList;
import java.util.List;

public class Barista {
    private final List<Coffee> orders = new ArrayList<>();

    public void addOrder(Coffee coffee) {
        if (coffee != null) {
            orders.add(coffee);
        }
    }

    public void prepareOrders() {
        System.out.println("\nPreparing your drinks:");
        for (Coffee coffee : orders) {
            coffee.brew(); // полиморфизм, без instanceof
        }
    }
}