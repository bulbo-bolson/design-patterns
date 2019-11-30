import chocolate.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleSingletonTest {

    @Test
    public void isSingleton() {
        SimpleSingleton aSingletonReference = SimpleSingleton.getInstance();
        SimpleSingleton anotherSingletonReference = SimpleSingleton.getInstance();
        assertSame(aSingletonReference, anotherSingletonReference);
    }

}

