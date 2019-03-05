package assignment.behaviours.impl.walkable;

import assignment.behaviours.Walkable;

public class CanNotWalk implements Walkable {

	@Override
	public void walk() {
		System.out.println("Can not walk");
	}
}
