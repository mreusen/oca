package nl.reusenit.oca.ch02.constructors;

class Foo {
	int size;
	String name;
	Foo(int s, String n) {
		this.size = s;
		this.name = n;
	}
}

public class TestFoo {

	public static void main(String[] args) {

		/*
		 *	Foo f = new Foo();			won't compile, no matching no-args constructor 
		 */

		Foo ff = new Foo(3, "Jaappie");
	}

}
