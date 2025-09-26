public class AmericanPizzaService {
    public boolean bakePizza(String type) {
        if (type != null && !type.isEmpty()) {
            System.out.println("Baked " + type + " pizza successfully via American service.");
            return true;
        } else {
            throw new IllegalArgumentException("Type must be specified.");
        }
    }
}