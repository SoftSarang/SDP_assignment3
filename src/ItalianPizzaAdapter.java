public class ItalianPizzaAdapter implements PizzaMaker {
    private final ItalianPizzaService italianPizzaService;

    public ItalianPizzaAdapter(ItalianPizzaService italianPizzaService) {
        this.italianPizzaService = italianPizzaService;
    }

    @Override
    public boolean makePizza(String type) {
        try {
            String result = italianPizzaService.preparePizza(type);
            System.out.println(result);
            return true;
        } catch (Exception e) {
            System.err.println("Pizza making failed: " + e.getMessage());
            return false;
        }
    }
}