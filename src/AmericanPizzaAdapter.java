public class AmericanPizzaAdapter implements PizzaMaker {
    private final AmericanPizzaService service;

    public AmericanPizzaAdapter(AmericanPizzaService service) {
        this.service = service;
    }

    @Override
    public boolean makePizza(String type) {
        try {
            return service.bakePizza(type);
        } catch (Exception e) {
            System.err.println("Pizza making failed: " + e.getMessage());
            return false;
        }
    }
}