package assignment.model.animals;

import assignment.behaviours.impl.flyable.CanFly;
import assignment.behaviours.impl.singable.CanNotSing;

public class Butterfly extends Caterpillar {

    public Butterfly(){
        this.flyable =new CanFly();
        this.singable= new CanNotSing();
    }
}