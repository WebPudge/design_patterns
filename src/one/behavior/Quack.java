package one.behavior;

        import one.behavior.behavior_interface.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack(){
        System.out.println("Quack");
    }
}
