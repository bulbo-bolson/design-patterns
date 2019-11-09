import starbucks.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class CondimentDecoratorTest {

    @Test
    public void condimentShouldAddCostToBerevage() {
        Beverage beverage = new Espresso();
        CondimentDecorator condiment = new Mocha(beverage);
        double addedPrice = beverage.getPrice() + condiment.getPrice();
        assertEquals(addedPrice, condiment.cost(), 0);
    }

}
