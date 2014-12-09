package nl.reusenit.oca.ch02.casting;

class Animal1 {}

class Dog1 extends Animal1 {}

public class DogTest {

	public static void main(String[] args) {
		Animal1 animal = new Animal1();
		Dog1 d = (Dog1) animal;					// compiles fine, but fails later
												// java.lang.ClassCastException
		/*
		 * String s = (String) animal;			// animal can't EVER be a String
		 */
		
		Animal1 a1 = d;							// upcast with no explicit cast
		Animal1 a2 = (Animal1) d;				// upcast with an explicit cast
		// a Dog IS-A(n) Animal, everything an Animal can do, a Dog can do. 
		// upcasting works implicitly!!
	}

}
