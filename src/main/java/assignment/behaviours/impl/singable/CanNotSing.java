package assignment.behaviours.impl.singable;

import assignment.behaviours.Singable;

public class CanNotSing implements Singable {

	@Override
	public void sing() {
		System.out.println("Can not sing");
	}
}