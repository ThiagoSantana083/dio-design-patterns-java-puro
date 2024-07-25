package singleton;
// Singleton Lazy Holder
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instanciaHolder = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instanciaHolder;
    }
}
