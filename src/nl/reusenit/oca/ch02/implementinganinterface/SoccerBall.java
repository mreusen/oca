package nl.reusenit.oca.ch02.implementinganinterface;

interface Bounceable extends Moveable, Spherical {	// an interface can extend
													// multiple interfaces
	void bounce();
	void setBounceFactor(int bf);
}

interface Moveable {
	void moveIt();
}

interface Spherical {
	void doSphericalThing();
}

abstract class Ball implements Bounceable {
	public void bounce() {}						// Define bounce behavior
	public void setBounceFactor(int bf) {}
	// Don't implement the rest; leave it for the subclass
}

public class SoccerBall extends Ball {			// class SoccerBall must implement
												// the interface methods that
												// ball didn't
	public void moveIt() {}
	public void doSphericalThing() {};
	// SoccerBall can choose to override the Bounceable methods
	// implemented by Ball
	public void bounce() {
		// specific bounce stuff behavior comes here
	}
}
