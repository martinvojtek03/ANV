import org.junit.Test;
import static org.junit.Assert.*;

public class DrinkFactoryTest {

    @Test
    public void testCreateTea() {
        Drink drink = DrinkFactory.createDrink("tea");

        assertNotNull(drink);
        assertTrue(drink instanceof Tea);
        assertEquals("Serving Tea", drink.serve());
    }

    @Test
    public void testCreateCoffee() {
        Drink drink = DrinkFactory.createDrink("coffee");

        assertNotNull(drink);
        assertTrue(drink instanceof Coffee);
        assertEquals("Serving Coffee", drink.serve());
    }

    @Test
    public void testCaseInsensitivity() {
        Drink drink = DrinkFactory.createDrink("TEA");
        assertTrue(drink instanceof Tea);
    }

    @Test
    public void testUnknownDrinkThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> DrinkFactory.createDrink("juice"));
    }
}