public class ItalianPizzaService {
    public String preparePizza(String flavor) {

        if (flavor != null && !flavor.isEmpty()) {
            return "Prepared " + flavor + " pizza successfully via Italian service.";
        } else {
            throw new IllegalArgumentException("Flavor must be specified.");
        }
    }
}