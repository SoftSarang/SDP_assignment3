public class Main {
    public static void main(String[] args) {
        // ItalianPizzaService
        ItalianPizzaService italianService = new ItalianPizzaService();
        PizzaMaker italianAdapter = new ItalianPizzaAdapter(italianService);
        PizzaShop italianShop = new PizzaShop(italianAdapter);
        italianShop.placeOrder("Margherita");
        italianShop.placeOrder(""); // Ошибка

        // AmericanPizzaService
        AmericanPizzaService americanService = new AmericanPizzaService();
        PizzaMaker americanAdapter = new AmericanPizzaAdapter(americanService);
        PizzaShop americanShop = new PizzaShop(americanAdapter);
        americanShop.placeOrder("Pepperoni");
    }
}