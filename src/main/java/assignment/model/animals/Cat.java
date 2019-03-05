package assignment.model.animals;

import assignment.behaviours.impl.singable.CatSound;
import assignment.model.Animal;

public class Cat extends Animal {

    public Cat(){
        this.singable= new CatSound();
    }
}