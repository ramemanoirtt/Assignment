package assignment.behaviours.impl.singable;

import assignment.behaviours.Singable;

public class DogSound implements Singable {
    @Override
    public void sing() {
        System.out.println("Woof,woof");
    }
}
