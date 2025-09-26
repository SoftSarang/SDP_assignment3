public class PizzaShop {
    private final PizzaMaker maker;

    public PizzaShop(PizzaMaker maker) {
        this.maker = maker;
    }

    public void placeOrder(String type) {
        if (maker.makePizza(type)) {
            System.out.println("Order placed successfully.");
        } else {
            System.out.println("Order failed.");
        }
    }
}