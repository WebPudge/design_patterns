package five;

public class StatSingleton {
    private static StatSingleton uniqueInstance = new StatSingleton();

    private StatSingleton () {}

    public static StatSingleton getInstance(){
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a statically initialized Singleton!";
    }
}
