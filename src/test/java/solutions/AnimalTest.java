package solutions;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import assignment.model.Animal;

public class AnimalTest extends AbstractTest {

	@Test
	public void testWalk() {
		Animal animal = new Animal();
		animal.walk();
		assertThat(sysOut.asString(), containsString("I am walking"));
	}
}
