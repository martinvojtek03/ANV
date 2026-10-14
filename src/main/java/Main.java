public class Main {
    public static void main(String[] args) {
        CustomDrink customDrink = new CustomDrink.Builder("coffee").milk().sugar().build();

        System.out.println(customDrink + " in " + CafeConfig.getInstance().getCafeName());

        // Výstup v konzoli: Serving Coffee, milk, sugar in Smart Café Liberec
    }
}