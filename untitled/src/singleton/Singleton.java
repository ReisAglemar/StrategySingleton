package singleton;

public class Singleton {

    public static class SingletonHolder {
        private static SingletonHolder instaHoldernce = new SingletonHolder();
    }

    private Singleton() {
    }

    public static SingletonHolder getInstance() {
        return SingletonHolder.instaHoldernce;
    }
}
