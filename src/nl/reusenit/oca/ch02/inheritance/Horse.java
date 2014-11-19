package nl.reusenit.oca.ch02.inheritance;

import nl.reusenit.oca.ch02.Animal;

public class Horse extends Animal {				// Horse IS-A Animal

	private Halter myHalter = new Halter();		// Horse HAS-A Halter
	public void tie(String rope) {
		myHalter.tie(rope);						// delegate tie behavior to the Halter object
	}
}

class Halter {
	public void tie(String aRope) {
		// do the actual tie work here
	}
}