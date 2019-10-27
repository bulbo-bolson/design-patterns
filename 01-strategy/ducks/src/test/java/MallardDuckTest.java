import static org.junit.Assert.*;
import org.junit.Test;
import ducks.*;

public class MallardDuckTest {

    @Test
    public void someTest() {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}

