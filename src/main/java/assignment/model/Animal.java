package assignment.model;

import assignment.behaviours.impl.walkable.CanWalk;

public class Animal extends AnimalKingdom {

    public Animal(){
        this.walkable=new CanWalk();
    }
}
