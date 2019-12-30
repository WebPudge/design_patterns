package one.behavior;

import one.behavior.behavior_interface.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack(){
        System.out.println("Squeak");
    }
}
