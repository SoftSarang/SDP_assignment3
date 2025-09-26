public class Main {
    public static void main(String[] args) {
        // ItalianPizzaService
        ItalianPizzaService italianService = new ItalianPizzaService();
        PizzaMaker italianAdapter = new ItalianPizzaAdapter(italianService);
        PizzaShop italianShop = new PizzaShop(italianAdapter);
        italianShop.Margherita();

        // AmericanPizzaService
        AmericanPizzaService americanService = new AmericanPizzaService();
        PizzaMaker americanAdapter = new AmericanPizzaAdapter(americanService);
        PizzaShop americanShop = new PizzaShop(americanAdapter);
        americanShop.Pepperoni();
    }
}