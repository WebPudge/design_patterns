package one.behavior;

import one.behavior.behavior_interface.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack(){
        System.out.println("<< Silence >>");
    }
}
