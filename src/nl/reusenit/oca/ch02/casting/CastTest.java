package nl.reusenit.oca.ch02.casting;

class Animal {
	void makeNoise() {
		System.out.println("generic noise");
	}
}

class Dog extends Animal {
	void makeNoise() {
		System.out.println("bark");
	}
	void playDead() {
		System.out.println("roll over");
	}
}

public class CastTest {

	public static void main(String[] args) {
		Animal[] a = {new Animal(), new Dog(), new Animal()};
		for (Animal animal : a) {
			if (animal instanceof Dog) {
				
				animal.makeNoise();
				
				/*
				 * animal.playDead();			playDead is undefined for Animal
				*/
				
				Dog d = (Dog) animal;			// Casting to a Dog (downcast)
				d.playDead();					// now it's possible to invoke playDead()
				
				((Dog) animal).playDead();		// in 1 statement...
			}
		}

	}

}
