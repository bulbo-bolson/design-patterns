package chocolate;

// this class is thread safe
// but will be less performant than DoubleCheckLockingSingleton,
// however for most applications could suffice, unless our class makes heavy processing while instantiating
public class SynchronizedSingleton {
    private volatile static SynchronizedSingleton uniqueInstance;

    private SynchronizedSingleton() {}

    public synchronized static SynchronizedSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SynchronizedSingleton();
        }
        return uniqueInstance;
    }
}
