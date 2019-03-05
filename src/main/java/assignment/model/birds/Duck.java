package assignment.model.birds;

import assignment.behaviours.impl.singable.DuckSound;
import assignment.behaviours.impl.swimmable.CanSwim;
import assignment.model.Bird;

public class Duck extends Bird {

    public Duck(){
        this.singable =new DuckSound();
        this.swimmable= new CanSwim();
    }
}
