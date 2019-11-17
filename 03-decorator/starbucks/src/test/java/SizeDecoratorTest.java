import starbucks.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class SizeDecoratorTest {

    @Test
    public void smallSizeShouldCostUnit() {
        Beverage espresso = new Espresso();
        double originalCost = espresso.cost();
        SizeDecorator small = new SmallSizeDecorator(espresso);
        double endCost = small.cost();
        assertEquals(endCost, originalCost, 0);
    }

    @Test
    public void mediumSizeShouldCostUnitAndHalf() {
        Beverage espresso = new Espresso();
        double originalCost = espresso.cost();
        SizeDecorator medium = new MediumSizeDecorator(espresso);
        double endCost = medium.cost();
        assertEquals(endCost, originalCost * 1.5, 0);
    }

    @Test
    public void bigSizeShouldCostTwoUnits() {
        Beverage espresso = new Espresso();
        double originalCost = espresso.cost();
        SizeDecorator big = new BigSizeDecorator(espresso);
        double endCost = big.cost();
        assertEquals(endCost, originalCost * 2, 0);
    }
}
