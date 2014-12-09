package nl.reusenit.oca.ch02.returntypes;

abstract class Animal {				// non-abstract class is also OK
	
}
class Horse extends Animal {
	
}
class Button {
	
}
interface Chewable {
	
}
class Gum implements Chewable {
	
}

public class ReturnValue {

	public Button doStuff() {
		return null;
	}

	public String[] go() {
		return new String[] {"Fred", "Keith"};
	}

	public int doThings() {
		char c = 'c';				// char is compatible with int
		return c;					// it can be implicitly converted to the declared return type
	}

	public int foo() {
		float f = 32.5f;
		// return f;				// float is not compatible with int
		return (int) f;				// but it can be explicitly cast to an int
	}

	public Animal getAnimal() {
		return new Horse();			// OK, Horse IS-A Animal
	}

	public Object getObject() {
		int[] nums = {1,2,3};
		return nums;				// Return an int array, which is still an Object
	}

	public Chewable getChewable() {
		return new Gum();			// OK, return interface implementer 
	}
}
