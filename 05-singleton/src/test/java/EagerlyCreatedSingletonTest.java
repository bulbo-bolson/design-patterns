import chocolate.*;
import org.junit.Test;

import java.util.concurrent.Callable;

import static org.junit.Assert.*;

public class EagerlyCreatedSingletonTest implements Callable {

    @Test
    public void isSingleton() {
        EagerlyCreatedSingleton aSingletonReference = call();
        EagerlyCreatedSingleton anotherSingletonReference = call();
        assertSame(aSingletonReference, anotherSingletonReference);
    }

    public EagerlyCreatedSingleton call() {
        EagerlyCreatedSingleton aSingletonReference = EagerlyCreatedSingleton.getInstance();
        return aSingletonReference;
    }

}
