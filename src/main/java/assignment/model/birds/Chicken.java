package assignment.model.birds;

import assignment.behaviours.impl.flyable.CanNotFly;
import assignment.behaviours.impl.singable.ChickenSound;
import assignment.model.Bird;

public class Chicken extends Bird {

    public  Chicken(){
        this.singable=new ChickenSound();
        this.flyable =new CanNotFly();
    }
}
