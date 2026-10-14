public class DrinkFactory {

    /**
     * Vytvoří a vrátí instanci nápoje podle zadaného typu.
     *
     * @param type Typ nápoje ("tea", "coffee", ...)
     * @return Instance rozhraní Drink
     * @throws IllegalArgumentException Pokud je zadán neznámý typ nápoje
     */
    public static Drink createDrink(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Type cannot be null");
        }

        switch (type.toLowerCase().trim()) {
            case "tea":
                return new Tea();
            case "coffee":
                return new Coffee();
            default:
                throw new IllegalArgumentException("Unknown drink type: " + type);
        }
    }
}