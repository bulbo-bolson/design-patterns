import ducks.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class DuckAdapterTest {

    @Test
    public void duckAdaptsToTurkey() {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says ...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says ...");
        testDuck(duck);

        System.out.println("\nThe DuckAdapter says ...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
