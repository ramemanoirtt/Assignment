package solutions;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import assignment.model.Fish;
public class FishTest extends AbstractTest {

    Fish fish;


    @Before
    public void setUp(){
        fish=new Fish();
    }


    @Test
    public void testWalk() {
        fish.walk();
        assertThat(sysOut.asString(), containsString("Can not walk"));
    }

    @Test
    public void testSing() {
        fish.sing();
        assertThat(sysOut.asString(), containsString("Can not sing"));
    }

    @Test
    public void testSwim() {
        fish.swim();
        assertThat(sysOut.asString(), containsString("I am swimming"));
    }
}