import chocolate.*;
import org.junit.Test;

import java.util.concurrent.Callable;

import static org.junit.Assert.*;

public class DoubleCheckLockingSingletonTest implements Callable {

    @Test
    public void isSingleton() {
        DoubleCheckLockingSingleton aSingletonReference = call();
        DoubleCheckLockingSingleton anotherSingletonReference = call();
        assertSame(aSingletonReference, anotherSingletonReference);
    }

    public DoubleCheckLockingSingleton call() {
        DoubleCheckLockingSingleton aSingletonReference = DoubleCheckLockingSingleton.getInstance();
        return aSingletonReference;
    }

}
