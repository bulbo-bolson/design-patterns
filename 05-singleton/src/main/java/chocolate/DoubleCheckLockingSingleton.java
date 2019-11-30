package chocolate;

// this class is thread safe
// we could do the whole getInstance() method syncrhonized,
// but to gain in performance, we just make syncronized the block that instantaties the object,
// so we only enter the syncronized block once
public class DoubleCheckLockingSingleton {
    private volatile static DoubleCheckLockingSingleton uniqueInstance;

    private DoubleCheckLockingSingleton() {}

    public static DoubleCheckLockingSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleCheckLockingSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
