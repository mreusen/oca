package nl.reusenit.oca.ch02.overridenandoverloaded;

class Animal {
	public void eat() {
		System.out.println("Generic Animal eating Generically");
	}
}

class Horse extends Animal {
	public void eat() {
		System.out.println("Horse eating Hay");		// override the Animal eat() method
	}
	public void eat(String s) {
		System.out.println("Horse eating " + s);	// overload the Animal eat() method
	}
}

public class UseMoreAnimals {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();					// Animal eat() method is invoked
		
		Horse h = new Horse();
		h.eat();					// Horse eat() method is invoked
		
		Animal ah = new Horse();
		ah.eat();					// Horse eat() method is invoked
									//   Polymorphism works! Override happens!!!
									//   The actual object is used to determine
									//   which method is called
		
		h.eat("Apples");
		
		/*
		 * a.eat("Pommes");			// compiler error!
		*/							// Animal doesn't have a eat() method that takes a String
		/*
		 * ah.eat("Whatever");		// compiler error!
									// compiler looks at reference and sees that Animal
									//   doesn't have an eat() method that takes a String 
		*/
	}

}
