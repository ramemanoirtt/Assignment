package assignment.behaviours.impl.swimmable;

import assignment.behaviours.impl.Swimmable;

public class CanSwim implements Swimmable {
    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
