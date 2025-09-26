public class PizzaShop {
    private final PizzaMaker maker;

    public PizzaShop(PizzaMaker maker) {
        this.maker = maker;
    }

    public PizzaShop Margherita() {
        maker.makePizza("Margherita");
        System.out.println("Order placed successfully.");
        return this;
    }

    public PizzaShop Pepperoni() {
        maker.makePizza("Pepperoni");
        System.out.println("Order placed successfully.");
        return this;
    }

    public void placeOrder(String type) {
        if (maker.makePizza(type)) {
            System.out.println("Order placed successfully.");
        } else {
            System.out.println("Order failed.");
        }
    }
}