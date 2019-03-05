package solutions;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import assignment.model.fish.Shark;
import assignment.utils.Color;
import assignment.utils.Size;

public class SharkTest extends AbstractTest {


    Shark shark;


    @Before
    public void setUp(){
        shark=new Shark();
    }


    @Test
    public void testWalk() {
        shark.walk();
        assertThat(sysOut.asString(), containsString("Can not walk"));
    }

    @Test
    public void testSing() {
        shark.sing();
        assertThat(sysOut.asString(), containsString("Can not sing"));
    }

    @Test
    public void testSwim() {
        shark.swim();
        assertThat(sysOut.asString(), containsString("I am swimming"));
    }

    @Test
    public void testSize() {
        Size size= shark.size();
       assertEquals(Size.LARGE,size);
    }

    @Test
    public void testColor() {
        Color color= shark.color();
        assertEquals(Color.GREY,color);
    }

}