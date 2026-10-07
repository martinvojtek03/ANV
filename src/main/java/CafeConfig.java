public class CafeConfig {

    private static CafeConfig instance;

    private final String cafeName = "Smart Café Liberec";

    private CafeConfig() {
    }

    public static CafeConfig getInstance() {
        if (instance == null) {
            instance = new CafeConfig();
        }
        return instance;
    }

    public String getCafeName() {
        return cafeName;
    }
}