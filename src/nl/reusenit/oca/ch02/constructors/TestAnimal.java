package nl.reusenit.oca.ch02.constructors;

class Animal {
	String name;						// a String instance variable
	Animal() {
		this(makeRandomName());
	};
	Animal(String n) {
		this.name = n;
	}
	static String makeRandomName() {	// You can't access an instance (a non-static) method
										//  until after the super constructor has run
										// that's why the makeRandomName() is marked static
		int x = (int) (Math.random() * 5);
		String[] names = new String[] {"Frits", "Harry", "Jaappie", "Jantje", "Dickie"};
		String name = names[x]; 
		return name;
	}
}

public class TestAnimal {
	public static void main(String[] args) {
		Animal a = new Animal("Fred");
		System.out.println(a.name);
		Animal b = new Animal();
		System.out.println(b.name);
		System.out.println(Animal.makeRandomName());	// call the static method directly
	}
}
