import org.junit.Test;
import static org.junit.Assert.*;

public class CafeConfigTest {

    @Test
    public void testGetInstanceReturnsSameInstance() {
        // Získání dvoření referencí pomocí getInstance()
        CafeConfig firstInstance = CafeConfig.getInstance();
        CafeConfig secondInstance = CafeConfig.getInstance();

        // 1. Ověření, že instance není null
        assertNotNull("Instance třídy CafeConfig by neměla být null.", firstInstance);

        // 2. Ověření, že obě proměnné ukazují na stejnou instanci
        assertSame("getInstance() musí vždy vracet stejnou instanci.", firstInstance, secondInstance);
    }

    @Test
    public void testGetCafeName() {
        // Získání instance a ověření názvu
        CafeConfig config = CafeConfig.getInstance();

        assertNotNull("Název kavárny by neměl být null.", config.getCafeName());
        assertEquals("Smart Café Liberec", config.getCafeName());
    }
}