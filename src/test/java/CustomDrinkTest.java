import org.junit.Test;
import static org.junit.Assert.*;

public class CustomDrinkTest {

    @Test
    public void testCustomDrinkWithIngredients() {
        CustomDrink drink = new CustomDrink.Builder("coffee")
                .milk()
                .sugar()
                .build();

        assertEquals("coffee", drink.getBase());
        assertTrue(drink.hasMilk());
        assertTrue(drink.hasSugar());
        assertFalse(drink.hasCaramel());
        assertEquals("Serving Coffee, milk, sugar", drink.toString());
    }

    @Test
    public void testCustomDrinkWithoutIngredients() {
        CustomDrink drink = new CustomDrink.Builder("tea")
                .build();

        assertEquals("tea", drink.getBase());
        assertFalse(drink.hasMilk());
        assertFalse(drink.hasSugar());
        assertFalse(drink.hasCaramel());
        assertEquals("Serving Tea", drink.toString());
    }

    @Test
    public void testCustomDrinkAllIngredients() {
        CustomDrink drink = new CustomDrink.Builder("coffee")
                .milk()
                .sugar()
                .caramel()
                .build();

        assertTrue(drink.hasMilk());
        assertTrue(drink.hasSugar());
        assertTrue(drink.hasCaramel());
        assertEquals("Serving Coffee, milk, sugar, caramel", drink.toString());
    }
}