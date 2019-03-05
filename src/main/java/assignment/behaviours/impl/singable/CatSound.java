package assignment.behaviours.impl.singable;

import assignment.behaviours.Singable;

public class CatSound implements Singable {
    @Override
    public void sing() {
        System.out.println("Meow");
    }
}
