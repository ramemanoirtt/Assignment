package solutions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import assignment.model.AnimalKingdom;
import assignment.model.Bird;
import assignment.model.Fish;
import assignment.model.animals.Butterfly;
import assignment.model.animals.Cat;
import assignment.model.animals.Dog;
import assignment.model.animals.Frog;
import assignment.model.birds.Chicken;
import assignment.model.birds.Duck;
import assignment.model.birds.Parrot;
import assignment.model.birds.Rooster;
import assignment.model.fish.Clownfish;
import assignment.model.fish.Dolphin;
import assignment.model.fish.Shark;
import assignment.utils.CountAnimals;

public class CountingTest extends AbstractTest {

    CountAnimals countAnimals;
    AnimalKingdom vertebrates[] ;

    @Before
    public  void setUp(){
        this.countAnimals=new CountAnimals();
        vertebrates = new AnimalKingdom[]{
                new Bird(),  
                new Duck(),  
                new Chicken(), 
                new Rooster(), 
                new Parrot(), 
                new Fish(), 
                new Shark(), 
                new Clownfish(), 
                new Dolphin(), 
                new Frog(), 
                new Dog(), 
                new Butterfly(), 
                new Cat()  
        };
    }

    @Test
    public void testWalkableCount(){
        int count= this.countAnimals.walkableCount(vertebrates);
        assertEquals(8,count);
    }

    @Test
    public void testFlyableCount(){
        int count= this.countAnimals.flyableCount(vertebrates);
        assertEquals(5,count);
    }

    @Test
    public void testSingableCount(){
        int count= this.countAnimals.singableCount(vertebrates);
        assertEquals(8,count);
    }

    @Test
    public void testSwimmableCount(){
        int count= this.countAnimals.swimmableCount(vertebrates);
        assertEquals(5,count);
    }
}
