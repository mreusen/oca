package nl.reusenit.oca.ch02.overriding;

import java.io.IOException;

public class IllegalOverridesClass extends Animal {

	/*
	private void eat() {						// Acces modifier is more restrictive
		
	}

	public void eat() throws IOException {		// Defined a checked Exception
												// not defined by superclass
	}
	*/
	
	public void eat(String food) {				// a legal overload, not an override
												// because argument list changed
	}
	/*
	public String eat() {						// not an override because of the return type
												// not an overload because there's no change
												//    in the argument list
	}
	*/
}
