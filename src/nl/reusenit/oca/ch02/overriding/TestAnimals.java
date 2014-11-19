package nl.reusenit.oca.ch02.overriding;

// A (nonabstract) example of using polymorphism

public class TestAnimals {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		Animal b = new Horse();		// Animal ref but Horse object
		a.eat();					// runs the Animal version of eat()
		b.eat();					// runs the Horse version of eat()
		// a.buck();				// can't invoke buck() Animal class doesn't have that method

		Horse c = new Horse();
		c.eat();
		c.buck();
		// Horse d = new Animal();	// can't convert Animal to Horse
	}

}

class Animal {
	public void eat() {
		System.out.println("generic Animal eating");
	}
}

class Horse extends Animal {
	public void eat() {				// overrides the eat() method of Animal
		System.out.println("Horse eating hay");
	}
	public void buck() {
		
	}
}