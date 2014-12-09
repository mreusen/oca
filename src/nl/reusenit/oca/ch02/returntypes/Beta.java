package nl.reusenit.oca.ch02.returntypes;

class Alpha {
	Alpha doSuff() {
		return null;
	}
	void go() {
		
	}
}

public class Beta extends Alpha {
	Beta doStuff() {				// Legal override
		return new Beta();			// with a Covariant return
	}								// as long the new return type is a subtype
									// of the declared return type of the overriden
									// class method, you're allowed to change the return type

	String go(char c) {				// different return type is fine, as long as 
		return null;				// you've changed the argument list
	}								// Legal overload of the go() method!!
}
