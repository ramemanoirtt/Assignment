package solutions;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import assignment.model.Bird;

public class BirdTest {

	@Rule
	public SystemOutResource sysOut = new SystemOutResource();
	Bird bird;

	@Before
	public void setUp() {
		this.bird = new Bird();
	}

	@Test
	public void testFly() {
		bird.fly();
		assertThat(sysOut.asString(), containsString("I am flying"));
	}

	@Test
	public void testWalk() {
		bird.walk();
		assertThat(sysOut.asString(), containsString("I am walking"));
	}

	@Test
	public void testSing() {
		bird.sing();
		assertThat(sysOut.asString(), containsString("I am singing"));
	}

}
