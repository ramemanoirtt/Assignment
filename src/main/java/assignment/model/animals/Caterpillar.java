package assignment.model.animals;

import assignment.behaviours.impl.flyable.CanNotFly;
import assignment.behaviours.impl.walkable.CrawlWalk;
import assignment.model.Animal;

public class Caterpillar extends Animal {

    public Caterpillar(){
        this.flyable= new CanNotFly();
        this.walkable= new CrawlWalk();
    }
}