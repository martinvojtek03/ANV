public class Main {
    public static void main(String[] args) {
        // Volání požadované v zadání:
        System.out.println(DrinkFactory.createDrink("coffee").serve() + " in " + CafeConfig.getInstance().getCafeName());

        // Výstup v konzoli bude: Serving Tea in Smart Café Liberec
    }
}