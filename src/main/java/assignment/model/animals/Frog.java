package assignment.model.animals;

import assignment.behaviours.impl.singable.CanSing;
import assignment.model.Animal;

public class Frog extends Animal {

	public Frog() {
		this.singable = new CanSing();
	}

}