package assignment.model.animals;

import assignment.behaviours.impl.singable.DogSound;
import assignment.model.Animal;

public class Dog extends Animal {

    public Dog(){
        this.singable = new DogSound();
    }
}
