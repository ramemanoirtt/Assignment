package assignment.model;

import assignment.behaviours.impl.flyable.CanFly;
import assignment.behaviours.impl.singable.CanSing;
import assignment.behaviours.impl.walkable.CanWalk;

public class Bird extends AnimalKingdom{

    public Bird(){
        this.walkable=new CanWalk();
        this.flyable =new CanFly();
        this.singable=new CanSing();
    }
}
