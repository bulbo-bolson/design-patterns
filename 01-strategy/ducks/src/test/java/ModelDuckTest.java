import static org.junit.Assert.*;
import org.junit.Test;
import ducks.*;

public class ModelDuckTest {

    @Test
    public void modelDuckTest() {
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}
