package assignment.behaviours.impl.walkable;

import assignment.behaviours.Walkable;

public class CrawlWalk implements Walkable {
    @Override
    public void walk() {
        System.out.println("I am crawling");
    }
}
