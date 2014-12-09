package nl.reusenit.oca.ch02.statics;

class Animal {

	static {System.out.println("Animal static init-block");}
	
	{System.out.println("Animal instance init-block");}

	Animal() {
		System.out.println("Animal constructor runs");
	}
	static void doStuff() {
		System.out.println("a");
	}
}

public class Dog extends Animal {

	Dog() {
		System.out.println("Dog constructor runs");
	}
	static void doStuff() {
		System.out.println("d");		// Not a override
	}									// static method's can't be overridden

	public static void main(String[] args) {
		Animal [] a = {new Animal(), new Dog(), new Animal()};
		for (int x = 0; x < a.length; x++) {
			a[x].doStuff();				// invoke the static method
		}
		Dog.doStuff();					// invoke using the class name
		doStuff();						// direct invoke
	}

}
