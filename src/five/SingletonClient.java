package five;

public class SingletonClient {
    public static void main(String[] args) {
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        System.out.println(threadSafeSingleton.getDescription());
        StatSingleton statSingleton = StatSingleton.getInstance();
        System.out.println(statSingleton.getDescription());
        DclSingleton dclSingleton = DclSingleton.getInstance();
        System.out.println(dclSingleton.getDescription());
    }
}
