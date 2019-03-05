package assignment.model.fish;

import assignment.behaviours.impl.swimmable.GreatSwimmers;
import assignment.model.AnimalKingdom;
import assignment.model.Fish;

public class Dolphin extends AnimalKingdom {

    Fish fish;

    public Dolphin(){
        this.swimmable= new GreatSwimmers();
        this.fish =new Fish();
        this.walkable = this.fish.getWalkable();
        this.singable = this.fish.getSingable();
    }

}
