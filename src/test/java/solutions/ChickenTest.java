package solutions;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import assignment.model.Bird;
import assignment.model.birds.Chicken;

public class ChickenTest extends AbstractTest {

	Bird chicken;

	@Before
	public void setUp() {
		this.chicken = new Chicken();
	}

	@Test
	public void testFly() {
		chicken.fly();
		assertThat(sysOut.asString(), containsString("Can not fly"));
	}

	@Test
	public void testSing() {
		chicken.sing();
		assertThat(sysOut.asString(), containsString("Cluck,cluck"));
	}
}
