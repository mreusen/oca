package nl.reusenit.oca.ch02.overloading;

class Animal{}
class Horse extends Animal{}

public class UseAnimals {

	public void doStuff(Animal a) {
		System.out.println("In the Animal version");
	}
	
	// overloaded method's, the argument changes!!
	
	public void doStuff(Horse h) {
		System.out.println("In the Horse version");
	}

	public static void main(String[] args) {
		UseAnimals ua = new UseAnimals();
		Animal animalObj = new Animal();
		Horse horseObj = new Horse();
		Animal animalRefToHorse = new Horse();
		
		ua.doStuff(animalObj);			// Animal version
		ua.doStuff(horseObj);			// Horse version
		ua.doStuff(animalRefToHorse);	// ????? Animal version !!!!!!!!!
										// reference type passed at compile time determines 
										// which overloaded method to call
	}

}
