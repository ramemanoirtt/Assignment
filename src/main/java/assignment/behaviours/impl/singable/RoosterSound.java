package assignment.behaviours.impl.singable;

import assignment.behaviours.Singable;

public class RoosterSound implements Singable {

    @Override
    public void sing() {
        System.out.println("Cock-a-doodle-doo");
    }
}
