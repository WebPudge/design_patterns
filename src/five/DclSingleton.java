package five;

public class DclSingleton {
    private volatile static DclSingleton uniqueInstance;

    private DclSingleton() {}

    public static DclSingleton getInstance(){
        if(uniqueInstance == null){
            synchronized (DclSingleton.class) {
                if(uniqueInstance == null){
                    uniqueInstance = new DclSingleton();
                }
            }
        }
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a DCL initialized Singleton!";
    }
}
