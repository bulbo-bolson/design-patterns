import chocolate.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void isSingleton() {
        Singleton aSingletonReference = Singleton.getInstance();
        Singleton anotherSingletonReference = Singleton.getInstance();
        assertSame(aSingletonReference, anotherSingletonReference);
    }

}

