package assignment.behaviours.impl.flyable;

import assignment.behaviours.Flyable;

public class CanNotFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("Can not fly");
    }
}
