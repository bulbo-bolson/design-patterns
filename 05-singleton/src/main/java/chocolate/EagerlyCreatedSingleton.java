package chocolate;

// this class is thread Safe, we rely on the JVM for that
// it sets the instance in the static method, before any thread is started
public class EagerlyCreatedSingleton {
    private static EagerlyCreatedSingleton uniqueInstance = new EagerlyCreatedSingleton();

    private EagerlyCreatedSingleton() {}

    public static EagerlyCreatedSingleton getInstance() {
        return uniqueInstance;
    }
}
