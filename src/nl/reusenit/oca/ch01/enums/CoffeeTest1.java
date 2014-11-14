package nl.reusenit.oca.ch01.enums;

enum CoffeeSize1 { BIG, HUGE, OVERWHELMING }	// this cannot be
												// private or protected

class Coffee {

	CoffeeSize1 size;

}

public class CoffeeTest1 {

	public static void main(String[] args) {
		Coffee drink = new Coffee();
		drink.size = CoffeeSize1.BIG;			// enum outside class
	}	

}
