package assignment.model;

import assignment.behaviours.impl.singable.CanNotSing;
import assignment.behaviours.impl.swimmable.CanSwim;
import assignment.behaviours.impl.walkable.CanNotWalk;
import assignment.utils.Color;
import assignment.utils.Size;

public class Fish extends AnimalKingdom {

	protected Size size;
	protected Color color;

	public Fish() {
		this.swimmable = new CanSwim();
		this.walkable = new CanNotWalk();
		this.singable = new CanNotSing();
	}

	public Size size() {
		return size;
	}

	public Color color() {
		return color;
	}
}