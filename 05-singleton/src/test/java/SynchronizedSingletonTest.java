import chocolate.*;
import org.junit.Test;

import java.util.concurrent.Callable;

import static org.junit.Assert.*;

public class SynchronizedSingletonTest implements Callable {

    @Test
    public void isSingleton() {
        SynchronizedSingleton aSingletonReference = call();
        SynchronizedSingleton anotherSingletonReference = call();
        assertSame(aSingletonReference, anotherSingletonReference);
    }

    public SynchronizedSingleton call() {
        SynchronizedSingleton aSingletonReference = SynchronizedSingleton.getInstance();
        return aSingletonReference;
    }

}

