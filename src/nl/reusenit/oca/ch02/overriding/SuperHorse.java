package nl.reusenit.oca.ch02.overriding;

public class SuperHorse extends Animal {

	public void printYourself() {
		// Take advantage of Animal code
		super.printYourself();				// Invoke the superclass
											//   (Animal) code
											// Then do Horse-specific
											// print work here
	}
}
