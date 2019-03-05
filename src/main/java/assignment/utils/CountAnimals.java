package assignment.utils;

import assignment.behaviours.impl.flyable.CanFly;
import assignment.behaviours.impl.singable.CanSing;
import assignment.behaviours.impl.swimmable.CanSwim;
import assignment.behaviours.impl.walkable.CanWalk;
import assignment.model.AnimalKingdom;


public class CountAnimals {

	public int walkableCount(AnimalKingdom vertebrates[]) {
		int count = 0;
		if (vertebrates.length == 0) {
			return count;
		}

		for (AnimalKingdom vertibrate : vertebrates) {
			if (vertibrate.getWalkable() != null && vertibrate.getWalkable() instanceof CanWalk) {
				count++;
			}
		}
		return count;
	}

	public int flyableCount(AnimalKingdom[] vertebrates) {
		int count = 0;
		for (AnimalKingdom vertebrate : vertebrates) {
			if (vertebrate.getFlyable() != null && vertebrate.getFlyable() instanceof CanFly) {
				count++;
			}
		}
		return count;
	}

	public int singableCount(AnimalKingdom[] vertebrates) {
		int count = 0;
		for (AnimalKingdom vertebrate : vertebrates) {
			if (vertebrate.getSingable() != null && vertebrate.getSingable() instanceof CanSing) {
				count++;
			}
		}
		return count;
	}

	public int swimmableCount(AnimalKingdom[] vertebrates) {
		int count = 0;
		for (AnimalKingdom vertebrate : vertebrates) {
			if (vertebrate.getSwimmable() != null && vertebrate.getSwimmable() instanceof CanSwim) {
				count++;
			}
		}
		return count;
	}
}